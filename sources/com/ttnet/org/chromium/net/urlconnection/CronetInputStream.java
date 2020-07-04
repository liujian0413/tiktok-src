package com.ttnet.org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

class CronetInputStream extends InputStream {
    private ByteBuffer mBuffer;
    private IOException mException;
    private final CronetHttpURLConnection mHttpURLConnection;
    private boolean mResponseDataCompleted;

    private boolean hasUnreadData() {
        if (this.mBuffer == null || !this.mBuffer.hasRemaining()) {
            return false;
        }
        return true;
    }

    public void close() throws IOException {
        if (this.mHttpURLConnection != null) {
            this.mHttpURLConnection.disconnect();
        }
        super.close();
    }

    public int read() throws IOException {
        getMoreDataIfNeeded();
        if (hasUnreadData()) {
            return this.mBuffer.get() & 255;
        }
        return -1;
    }

    private void getMoreDataIfNeeded() throws IOException {
        if (!this.mResponseDataCompleted) {
            if (!hasUnreadData()) {
                if (this.mBuffer == null) {
                    int i = 32768;
                    if (this.mHttpURLConnection.getInputStreamBufferSize() > 32768) {
                        i = this.mHttpURLConnection.getInputStreamBufferSize();
                    }
                    this.mBuffer = ByteBuffer.allocateDirect(i);
                }
                this.mBuffer.clear();
                this.mHttpURLConnection.getMoreData(this.mBuffer);
                if (this.mException != null) {
                    throw this.mException;
                } else if (this.mBuffer != null) {
                    this.mBuffer.flip();
                }
            }
        } else if (this.mException != null) {
            throw this.mException;
        }
    }

    public CronetInputStream(CronetHttpURLConnection cronetHttpURLConnection) {
        this.mHttpURLConnection = cronetHttpURLConnection;
    }

    /* access modifiers changed from: 0000 */
    public void setResponseDataCompleted(IOException iOException) {
        this.mException = iOException;
        this.mResponseDataCompleted = true;
        this.mBuffer = null;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            getMoreDataIfNeeded();
            if (!hasUnreadData()) {
                return -1;
            }
            int min = Math.min(this.mBuffer.limit() - this.mBuffer.position(), i2);
            this.mBuffer.get(bArr, i, min);
            return min;
        }
    }
}
