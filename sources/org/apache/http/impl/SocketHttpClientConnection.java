package org.apache.http.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.HttpInetConnection;
import org.apache.http.impl.p1892io.SocketInputBuffer;
import org.apache.http.impl.p1892io.SocketOutputBuffer;
import org.apache.http.p1893io.SessionInputBuffer;
import org.apache.http.p1893io.SessionOutputBuffer;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class SocketHttpClientConnection extends AbstractHttpClientConnection implements HttpInetConnection {
    private volatile boolean open;
    private volatile Socket socket;

    /* access modifiers changed from: protected */
    public Socket getSocket() {
        return this.socket;
    }

    public boolean isOpen() {
        return this.open;
    }

    /* access modifiers changed from: protected */
    public void assertNotOpen() {
        if (this.open) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    /* access modifiers changed from: protected */
    public void assertOpen() {
        if (!this.open) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    public InetAddress getRemoteAddress() {
        if (this.socket != null) {
            return this.socket.getInetAddress();
        }
        return null;
    }

    public int getRemotePort() {
        if (this.socket != null) {
            return this.socket.getPort();
        }
        return -1;
    }

    public void shutdown() throws IOException {
        this.open = false;
        Socket socket2 = this.socket;
        if (socket2 != null) {
            socket2.close();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[ExcHandler: UnsupportedOperationException (unused java.lang.UnsupportedOperationException), SYNTHETIC, Splitter:B:6:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r1 = this;
            boolean r0 = r1.open
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1.open = r0
            r1.doFlush()
            java.net.Socket r0 = r1.socket     // Catch:{ IOException -> 0x0010 }
            r0.shutdownOutput()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            java.net.Socket r0 = r1.socket     // Catch:{ UnsupportedOperationException -> 0x0015, UnsupportedOperationException -> 0x0015 }
            r0.shutdownInput()     // Catch:{ UnsupportedOperationException -> 0x0015, UnsupportedOperationException -> 0x0015 }
        L_0x0015:
            java.net.Socket r0 = r1.socket
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.SocketHttpClientConnection.close():void");
    }

    public void setSocketTimeout(int i) {
        assertOpen();
        if (this.socket != null) {
            try {
                this.socket.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void bind(Socket socket2, HttpParams httpParams) throws IOException {
        if (socket2 == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (httpParams != null) {
            this.socket = socket2;
            int socketBufferSize = HttpConnectionParams.getSocketBufferSize(httpParams);
            init(createSessionInputBuffer(socket2, socketBufferSize, httpParams), createSessionOutputBuffer(socket2, socketBufferSize, httpParams), httpParams);
            this.open = true;
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* access modifiers changed from: protected */
    public SessionInputBuffer createSessionInputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        return new SocketInputBuffer(socket2, i, httpParams);
    }

    /* access modifiers changed from: protected */
    public SessionOutputBuffer createSessionOutputBuffer(Socket socket2, int i, HttpParams httpParams) throws IOException {
        return new SocketOutputBuffer(socket2, i, httpParams);
    }
}
