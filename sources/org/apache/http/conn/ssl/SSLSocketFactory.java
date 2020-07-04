package org.apache.http.conn.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.HostNameResolver;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class SSLSocketFactory implements LayeredSocketFactory {
    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new AllowAllHostnameVerifier();
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    private static final SSLSocketFactory DEFAULT_FACTORY = new SSLSocketFactory();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();
    private volatile X509HostnameVerifier hostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    private final HostNameResolver nameResolver = null;
    private final javax.net.ssl.SSLSocketFactory socketfactory = HttpsURLConnection.getDefaultSSLSocketFactory();

    public static SSLSocketFactory getSocketFactory() {
        return DEFAULT_FACTORY;
    }

    public Socket createSocket() throws IOException {
        return (SSLSocket) this.socketfactory.createSocket();
    }

    private SSLSocketFactory() {
    }

    public boolean isSecure(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        } else if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        } else if (!socket.isClosed()) {
            return true;
        } else {
            throw new IllegalArgumentException("Socket is closed.");
        }
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        SSLSocket sSLSocket = (SSLSocket) this.socketfactory.createSocket(socket, str, i, z);
        this.hostnameVerifier.verify(str, sSLSocket);
        return sSLSocket;
    }

    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) throws IOException {
        InetSocketAddress inetSocketAddress;
        if (str == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (httpParams != null) {
            if (socket == null) {
                socket = createSocket();
            }
            SSLSocket sSLSocket = (SSLSocket) socket;
            if (inetAddress != null || i2 > 0) {
                if (i2 < 0) {
                    i2 = 0;
                }
                sSLSocket.bind(new InetSocketAddress(inetAddress, i2));
            }
            int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
            int soTimeout = HttpConnectionParams.getSoTimeout(httpParams);
            if (this.nameResolver != null) {
                inetSocketAddress = new InetSocketAddress(this.nameResolver.resolve(str), i);
            } else {
                inetSocketAddress = new InetSocketAddress(str, i);
            }
            try {
                sSLSocket.connect(inetSocketAddress, connectionTimeout);
                sSLSocket.setSoTimeout(soTimeout);
                try {
                    this.hostnameVerifier.verify(str, sSLSocket);
                    return sSLSocket;
                } catch (IOException e) {
                    try {
                        sSLSocket.close();
                    } catch (Exception unused) {
                    }
                    throw e;
                }
            } catch (SocketTimeoutException unused2) {
                StringBuilder sb = new StringBuilder("Connect to ");
                sb.append(inetSocketAddress);
                sb.append(" timed out");
                throw new ConnectTimeoutException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
    }
}
