package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;

public abstract class AbstractClientConnAdapter implements ManagedClientConnection {
    private volatile ClientConnectionManager connManager;
    private volatile long duration = Long.MAX_VALUE;
    private volatile boolean markedReusable;
    private volatile boolean released;
    private volatile OperatedClientConnection wrappedConnection;

    /* access modifiers changed from: protected */
    public ClientConnectionManager getManager() {
        return this.connManager;
    }

    /* access modifiers changed from: protected */
    public OperatedClientConnection getWrappedConnection() {
        return this.wrappedConnection;
    }

    public boolean isMarkedReusable() {
        return this.markedReusable;
    }

    public void markReusable() {
        this.markedReusable = true;
    }

    public void unmarkReusable() {
        this.markedReusable = false;
    }

    /* access modifiers changed from: protected */
    public final void assertNotAborted() throws InterruptedIOException {
        if (this.released) {
            throw new InterruptedIOException("Connection has been shut down");
        }
    }

    public void flush() throws IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        wrappedConnection2.flush();
    }

    public InetAddress getRemoteAddress() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getRemoteAddress();
    }

    public int getRemotePort() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getRemotePort();
    }

    public boolean isOpen() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        if (wrappedConnection2 == null) {
            return false;
        }
        return wrappedConnection2.isOpen();
    }

    public boolean isSecure() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.isSecure();
    }

    /* access modifiers changed from: protected */
    public synchronized void detach() {
        this.wrappedConnection = null;
        this.connManager = null;
        this.duration = Long.MAX_VALUE;
    }

    public SSLSession getSSLSession() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        SSLSession sSLSession = null;
        if (!isOpen()) {
            return null;
        }
        Socket socket = wrappedConnection2.getSocket();
        if (socket instanceof SSLSocket) {
            sSLSession = ((SSLSocket) socket).getSession();
        }
        return sSLSession;
    }

    public boolean isStale() {
        if (this.released) {
            return true;
        }
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        if (wrappedConnection2 == null) {
            return true;
        }
        return wrappedConnection2.isStale();
    }

    public HttpResponse receiveResponseHeader() throws HttpException, IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        return wrappedConnection2.receiveResponseHeader();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void releaseConnection() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.released     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.released = r0     // Catch:{ all -> 0x0019 }
            org.apache.http.conn.ClientConnectionManager r0 = r4.connManager     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            org.apache.http.conn.ClientConnectionManager r0 = r4.connManager     // Catch:{ all -> 0x0019 }
            long r1 = r4.duration     // Catch:{ all -> 0x0019 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0019 }
            r0.releaseConnection(r4, r1, r3)     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r4)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.AbstractClientConnAdapter.releaseConnection():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|11|12|(1:14)) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void abortConnection() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.released     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.released = r0     // Catch:{ all -> 0x001f }
            r4.unmarkReusable()     // Catch:{ all -> 0x001f }
            r4.shutdown()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            org.apache.http.conn.ClientConnectionManager r0 = r4.connManager     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
            org.apache.http.conn.ClientConnectionManager r0 = r4.connManager     // Catch:{ all -> 0x001f }
            long r1 = r4.duration     // Catch:{ all -> 0x001f }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x001f }
            r0.releaseConnection(r4, r1, r3)     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r4)
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.AbstractClientConnAdapter.abortConnection():void");
    }

    /* access modifiers changed from: protected */
    public final void assertValid(OperatedClientConnection operatedClientConnection) throws IllegalStateException {
        if (operatedClientConnection == null) {
            throw new IllegalStateException("No wrapped connection");
        }
    }

    public boolean isResponseAvailable(int i) throws IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.isResponseAvailable(i);
    }

    public void setSocketTimeout(int i) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        wrappedConnection2.setSocketTimeout(i);
    }

    public void receiveResponseEntity(HttpResponse httpResponse) throws HttpException, IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        wrappedConnection2.receiveResponseEntity(httpResponse);
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        wrappedConnection2.sendRequestEntity(httpEntityEnclosingRequest);
    }

    public void sendRequestHeader(HttpRequest httpRequest) throws HttpException, IOException {
        assertNotAborted();
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        wrappedConnection2.sendRequestHeader(httpRequest);
    }

    protected AbstractClientConnAdapter(ClientConnectionManager clientConnectionManager, OperatedClientConnection operatedClientConnection) {
        this.connManager = clientConnectionManager;
        this.wrappedConnection = operatedClientConnection;
    }

    public void setIdleDuration(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.duration = timeUnit.toMillis(j);
        } else {
            this.duration = -1;
        }
    }
}
