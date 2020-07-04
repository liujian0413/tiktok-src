package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.UploadDataProvider;
import java.io.IOException;
import java.io.OutputStream;

abstract class CronetOutputStream extends OutputStream {
    private boolean mClosed;
    private IOException mException;
    private boolean mRequestCompleted;

    CronetOutputStream() {
    }

    /* access modifiers changed from: 0000 */
    public abstract void checkReceivedEnoughContent() throws IOException;

    public void close() throws IOException {
        this.mClosed = true;
    }

    /* access modifiers changed from: 0000 */
    public abstract UploadDataProvider getUploadDataProvider();

    /* access modifiers changed from: 0000 */
    public abstract void setConnected() throws IOException;

    /* access modifiers changed from: protected */
    public void checkNoException() throws IOException {
        if (this.mException != null) {
            throw this.mException;
        }
    }

    /* access modifiers changed from: protected */
    public void checkNotClosed() throws IOException {
        if (this.mRequestCompleted) {
            checkNoException();
            throw new IOException("Writing after request completed.");
        } else if (this.mClosed) {
            throw new IOException("Stream has been closed.");
        }
    }

    /* access modifiers changed from: 0000 */
    public void setRequestCompleted(IOException iOException) {
        this.mException = iOException;
        this.mRequestCompleted = true;
    }
}
