package org.apache.http.impl.p1892io;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import org.apache.http.p1893io.EofSensor;
import org.apache.http.params.HttpParams;

/* renamed from: org.apache.http.impl.io.SocketInputBuffer */
public class SocketInputBuffer extends AbstractSessionInputBuffer implements EofSensor {
    private static final Class SOCKET_TIMEOUT_CLASS = SocketTimeoutExceptionClass();
    private boolean eof;
    private final Socket socket;

    public boolean isEof() {
        return this.eof;
    }

    private static Class SocketTimeoutExceptionClass() {
        try {
            return Class.forName("java.net.SocketTimeoutException");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public int fillBuffer() throws IOException {
        boolean z;
        int fillBuffer = super.fillBuffer();
        if (fillBuffer == -1) {
            z = true;
        } else {
            z = false;
        }
        this.eof = z;
        return fillBuffer;
    }

    private static boolean isSocketTimeoutException(InterruptedIOException interruptedIOException) {
        if (SOCKET_TIMEOUT_CLASS != null) {
            return SOCKET_TIMEOUT_CLASS.isInstance(interruptedIOException);
        }
        return true;
    }

    public boolean isDataAvailable(int i) throws IOException {
        boolean hasBufferedData = hasBufferedData();
        if (!hasBufferedData) {
            int soTimeout = this.socket.getSoTimeout();
            try {
                this.socket.setSoTimeout(i);
                fillBuffer();
                return hasBufferedData();
            } catch (InterruptedIOException e) {
                if (!isSocketTimeoutException(e)) {
                    throw e;
                }
            } finally {
                this.socket.setSoTimeout(soTimeout);
            }
        }
        return hasBufferedData;
    }

    public SocketInputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        if (socket2 != null) {
            this.socket = socket2;
            this.eof = false;
            if (i < 0) {
                i = socket2.getReceiveBufferSize();
            }
            if (i < 1024) {
                i = PreloadTask.BYTE_UNIT_NUMBER;
            }
            init(socket2.getInputStream(), i, httpParams);
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }
}
