package org.apache.http.impl.conn;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    protected final SchemeRegistry schemeRegistry;

    public OperatedClientConnection createConnection() {
        return new DefaultClientConnection();
    }

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry2) {
        if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            return;
        }
        throw new IllegalArgumentException("Scheme registry must not be null.");
    }

    /* access modifiers changed from: protected */
    public void prepareSocket(Socket socket, HttpContext httpContext, HttpParams httpParams) throws IOException {
        boolean z;
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        int linger = HttpConnectionParams.getLinger(httpParams);
        if (linger >= 0) {
            if (linger > 0) {
                z = true;
            } else {
                z = false;
            }
            socket.setSoLinger(z, linger);
        }
    }

    public void updateSecureConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, HttpContext httpContext, HttpParams httpParams) throws IOException {
        if (operatedClientConnection == null) {
            throw new IllegalArgumentException("Connection must not be null.");
        } else if (httpHost == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (httpParams == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (operatedClientConnection.isOpen()) {
            Scheme scheme = this.schemeRegistry.getScheme(httpHost.getSchemeName());
            if (scheme.getSocketFactory() instanceof LayeredSocketFactory) {
                LayeredSocketFactory layeredSocketFactory = (LayeredSocketFactory) scheme.getSocketFactory();
                try {
                    Socket createSocket = layeredSocketFactory.createSocket(operatedClientConnection.getSocket(), httpHost.getHostName(), httpHost.getPort(), true);
                    prepareSocket(createSocket, httpContext, httpParams);
                    operatedClientConnection.update(createSocket, httpHost, layeredSocketFactory.isSecure(createSocket), httpParams);
                } catch (ConnectException e) {
                    throw new HttpHostConnectException(httpHost, e);
                }
            } else {
                StringBuilder sb = new StringBuilder("Target scheme (");
                sb.append(scheme.getName());
                sb.append(") must have layered socket factory.");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("Connection must be open.");
        }
    }

    public void openConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) throws IOException {
        if (operatedClientConnection == null) {
            throw new IllegalArgumentException("Connection must not be null.");
        } else if (httpHost == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (httpParams == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (!operatedClientConnection.isOpen()) {
            Scheme scheme = this.schemeRegistry.getScheme(httpHost.getSchemeName());
            SocketFactory socketFactory = scheme.getSocketFactory();
            Socket createSocket = socketFactory.createSocket();
            operatedClientConnection.opening(createSocket, httpHost);
            try {
                Socket connectSocket = socketFactory.connectSocket(createSocket, httpHost.getHostName(), scheme.resolvePort(httpHost.getPort()), inetAddress, 0, httpParams);
                prepareSocket(connectSocket, httpContext, httpParams);
                operatedClientConnection.openCompleted(socketFactory.isSecure(connectSocket), httpParams);
            } catch (ConnectException e) {
                throw new HttpHostConnectException(httpHost, e);
            }
        } else {
            throw new IllegalArgumentException("Connection must not be open.");
        }
    }
}
