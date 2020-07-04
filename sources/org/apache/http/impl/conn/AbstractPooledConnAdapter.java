package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public abstract class AbstractPooledConnAdapter extends AbstractClientConnAdapter {
    protected volatile AbstractPoolEntry poolEntry;

    /* access modifiers changed from: protected */
    public synchronized void detach() {
        super.detach();
        this.poolEntry = null;
    }

    public void close() throws IOException {
        AbstractPoolEntry abstractPoolEntry = this.poolEntry;
        if (abstractPoolEntry != null) {
            abstractPoolEntry.shutdownEntry();
        }
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        if (wrappedConnection != null) {
            wrappedConnection.close();
        }
    }

    public HttpRoute getRoute() {
        AbstractPoolEntry abstractPoolEntry = this.poolEntry;
        if (abstractPoolEntry == null) {
            throw new IllegalStateException("Adapter is detached.");
        } else if (abstractPoolEntry.tracker == null) {
            return null;
        } else {
            return abstractPoolEntry.tracker.toRoute();
        }
    }

    public void shutdown() throws IOException {
        AbstractPoolEntry abstractPoolEntry = this.poolEntry;
        if (abstractPoolEntry != null) {
            abstractPoolEntry.shutdownEntry();
        }
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        if (wrappedConnection != null) {
            wrappedConnection.shutdown();
        }
    }

    public void setState(Object obj) {
        AbstractPoolEntry abstractPoolEntry = this.poolEntry;
        if (abstractPoolEntry != null) {
            abstractPoolEntry.setState(obj);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }

    protected AbstractPooledConnAdapter(ClientConnectionManager clientConnectionManager, AbstractPoolEntry abstractPoolEntry) {
        super(clientConnectionManager, abstractPoolEntry.connection);
        this.poolEntry = abstractPoolEntry;
    }

    public void layerProtocol(HttpContext httpContext, HttpParams httpParams) throws IOException {
        assertNotAborted();
        AbstractPoolEntry abstractPoolEntry = this.poolEntry;
        if (abstractPoolEntry != null) {
            abstractPoolEntry.layerProtocol(httpContext, httpParams);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }

    public void tunnelTarget(boolean z, HttpParams httpParams) throws IOException {
        assertNotAborted();
        AbstractPoolEntry abstractPoolEntry = this.poolEntry;
        if (abstractPoolEntry != null) {
            abstractPoolEntry.tunnelTarget(z, httpParams);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }

    public void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) throws IOException {
        assertNotAborted();
        AbstractPoolEntry abstractPoolEntry = this.poolEntry;
        if (abstractPoolEntry != null) {
            abstractPoolEntry.open(httpRoute, httpContext, httpParams);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }

    public void tunnelProxy(HttpHost httpHost, boolean z, HttpParams httpParams) throws IOException {
        assertNotAborted();
        AbstractPoolEntry abstractPoolEntry = this.poolEntry;
        if (abstractPoolEntry != null) {
            abstractPoolEntry.tunnelProxy(httpHost, z, httpParams);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }
}
