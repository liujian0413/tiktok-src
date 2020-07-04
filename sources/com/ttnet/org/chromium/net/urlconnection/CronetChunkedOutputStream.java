package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

final class CronetChunkedOutputStream extends CronetOutputStream {
    public final ByteBuffer mBuffer;
    private final CronetHttpURLConnection mConnection;
    public boolean mLastChunk;
    public final MessageLoop mMessageLoop;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl();

    class UploadDataProviderImpl extends UploadDataProvider {
        public long getLength() {
            return -1;
        }

        private UploadDataProviderImpl() {
        }

        public void rewind(UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }

        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= CronetChunkedOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(CronetChunkedOutputStream.this.mBuffer);
                CronetChunkedOutputStream.this.mBuffer.clear();
                uploadDataSink.onReadSucceeded(CronetChunkedOutputStream.this.mLastChunk);
                if (!CronetChunkedOutputStream.this.mLastChunk) {
                    CronetChunkedOutputStream.this.mMessageLoop.quit();
                }
            } else {
                int limit = CronetChunkedOutputStream.this.mBuffer.limit();
                CronetChunkedOutputStream.this.mBuffer.limit(CronetChunkedOutputStream.this.mBuffer.position() + byteBuffer.remaining());
                byteBuffer.put(CronetChunkedOutputStream.this.mBuffer);
                CronetChunkedOutputStream.this.mBuffer.limit(limit);
                uploadDataSink.onReadSucceeded(false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void checkReceivedEnoughContent() throws IOException {
    }

    /* access modifiers changed from: 0000 */
    public final UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    /* access modifiers changed from: 0000 */
    public final void setConnected() throws IOException {
    }

    private void ensureBufferHasRemaining() throws IOException {
        if (!this.mBuffer.hasRemaining()) {
            uploadBufferInternal();
        }
    }

    public final void close() throws IOException {
        super.close();
        if (!this.mLastChunk) {
            this.mLastChunk = true;
            this.mBuffer.flip();
        }
    }

    private void uploadBufferInternal() throws IOException {
        checkNotClosed();
        this.mBuffer.flip();
        cronet_loop(this.mConnection.getReadTimeout());
        checkNoException();
    }

    public final void write(int i) throws IOException {
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) i);
    }

    private void cronet_loop(int i) throws IOException {
        try {
            this.mMessageLoop.loop(i);
        } catch (SocketTimeoutException unused) {
            if (this.mConnection != null) {
                this.mConnection.onUploadTimeout();
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        } catch (Exception e) {
            if (this.mConnection != null) {
                CronetHttpURLConnection cronetHttpURLConnection = this.mConnection;
                StringBuilder sb = new StringBuilder("Unexpected request usage, caught in CronetChunkedOutputStream, caused by ");
                sb.append(e);
                cronetHttpURLConnection.setException(new IOException(sb.toString()));
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        }
    }

    CronetChunkedOutputStream(CronetHttpURLConnection cronetHttpURLConnection, int i, MessageLoop messageLoop) {
        if (cronetHttpURLConnection == null) {
            throw new NullPointerException();
        } else if (i > 0) {
            this.mBuffer = ByteBuffer.allocate(i);
            this.mConnection = cronetHttpURLConnection;
            this.mMessageLoop = messageLoop;
        } else {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        checkNotClosed();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.mBuffer.remaining());
            this.mBuffer.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            ensureBufferHasRemaining();
        }
    }
}
