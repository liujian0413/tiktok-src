package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

final class CronetBufferedOutputStream extends CronetOutputStream {
    public ByteBuffer mBuffer;
    public boolean mConnected;
    private final CronetHttpURLConnection mConnection;
    public final int mInitialContentLength;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl();

    class UploadDataProviderImpl extends UploadDataProvider {
        public long getLength() {
            int position;
            if (CronetBufferedOutputStream.this.mInitialContentLength != -1) {
                return (long) CronetBufferedOutputStream.this.mInitialContentLength;
            }
            if (CronetBufferedOutputStream.this.mConnected) {
                position = CronetBufferedOutputStream.this.mBuffer.limit();
            } else {
                position = CronetBufferedOutputStream.this.mBuffer.position();
            }
            return (long) position;
        }

        private UploadDataProviderImpl() {
        }

        public void rewind(UploadDataSink uploadDataSink) {
            CronetBufferedOutputStream.this.mBuffer.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (remaining < CronetBufferedOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(CronetBufferedOutputStream.this.mBuffer.array(), CronetBufferedOutputStream.this.mBuffer.position(), remaining);
                CronetBufferedOutputStream.this.mBuffer.position(CronetBufferedOutputStream.this.mBuffer.position() + remaining);
            } else {
                byteBuffer.put(CronetBufferedOutputStream.this.mBuffer);
            }
            uploadDataSink.onReadSucceeded(false);
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
        this.mConnected = true;
        if (this.mBuffer.position() >= this.mInitialContentLength) {
            this.mBuffer.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }

    public final void write(int i) throws IOException {
        checkNotClosed();
        ensureCanWrite(1);
        this.mBuffer.put((byte) i);
    }

    CronetBufferedOutputStream(CronetHttpURLConnection cronetHttpURLConnection) {
        if (cronetHttpURLConnection != null) {
            this.mConnection = cronetHttpURLConnection;
            this.mInitialContentLength = -1;
            this.mBuffer = ByteBuffer.allocate(16384);
            return;
        }
        throw new NullPointerException();
    }

    private void ensureCanWrite(int i) throws IOException {
        if (this.mInitialContentLength != -1 && this.mBuffer.position() + i > this.mInitialContentLength) {
            StringBuilder sb = new StringBuilder("exceeded content-length limit of ");
            sb.append(this.mInitialContentLength);
            sb.append(" bytes");
            throw new ProtocolException(sb.toString());
        } else if (this.mConnected) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        } else if (this.mInitialContentLength == -1 && this.mBuffer.limit() - this.mBuffer.position() <= i) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.mBuffer.capacity() * 2, this.mBuffer.capacity() + i));
            this.mBuffer.flip();
            allocate.put(this.mBuffer);
            this.mBuffer = allocate;
        }
    }

    CronetBufferedOutputStream(CronetHttpURLConnection cronetHttpURLConnection, long j) {
        if (cronetHttpURLConnection == null) {
            throw new NullPointerException("Argument connection cannot be null.");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        } else if (j >= 0) {
            this.mConnection = cronetHttpURLConnection;
            this.mInitialContentLength = (int) j;
            this.mBuffer = ByteBuffer.allocate(this.mInitialContentLength);
        } else {
            throw new IllegalArgumentException("Content length < 0.");
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        checkNotClosed();
        ensureCanWrite(i2);
        this.mBuffer.put(bArr, i, i2);
    }
}
