package com.squareup.okhttp.internal.p810io;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.ConnectionSpecSelector;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.Version;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.http.Http1xStream;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.StreamAllocation;
import com.squareup.okhttp.internal.tls.TrustRootIndex;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* renamed from: com.squareup.okhttp.internal.io.RealConnection */
public final class RealConnection implements Connection {
    private static SSLSocketFactory lastSslSocketFactory;
    private static TrustRootIndex lastTrustRootIndex;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    public volatile FramedConnection framedConnection;
    private Handshake handshake;
    public long idleAtNanos = Long.MAX_VALUE;
    public boolean noNewStreams;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    public BufferedSink sink;
    public Socket socket;
    public BufferedSource source;
    public int streamCount;

    public final Handshake getHandshake() {
        return this.handshake;
    }

    public final Route getRoute() {
        return this.route;
    }

    public final Socket getSocket() {
        return this.socket;
    }

    public final void cancel() {
        Util.closeQuietly(this.rawSocket);
    }

    /* access modifiers changed from: 0000 */
    public final boolean isConnected() {
        if (this.protocol != null) {
            return true;
        }
        return false;
    }

    public final boolean isMultiplexed() {
        if (this.framedConnection != null) {
            return true;
        }
        return false;
    }

    public final int allocationLimit() {
        FramedConnection framedConnection2 = this.framedConnection;
        if (framedConnection2 != null) {
            return framedConnection2.maxConcurrentStreams();
        }
        return 1;
    }

    public final Protocol getProtocol() {
        if (this.protocol != null) {
            return this.protocol;
        }
        return Protocol.HTTP_1_1;
    }

    private Request createTunnelRequest() throws IOException {
        return new Builder().url(this.route.getAddress().url()).header("Host", Util.hostHeader(this.route.getAddress().url())).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.getAddress().url().host());
        sb.append(":");
        sb.append(this.route.getAddress().url().port());
        sb.append(", proxy=");
        sb.append(this.route.getProxy());
        sb.append(" hostAddress=");
        sb.append(this.route.getSocketAddress());
        sb.append(" cipherSuite=");
        if (this.handshake != null) {
            str = this.handshake.cipherSuite();
        } else {
            str = "none";
        }
        sb.append(str);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public RealConnection(Route route2) {
        this.route = route2;
    }

    private static synchronized TrustRootIndex trustRootIndex(SSLSocketFactory sSLSocketFactory) {
        TrustRootIndex trustRootIndex;
        synchronized (RealConnection.class) {
            if (sSLSocketFactory != lastSslSocketFactory) {
                lastTrustRootIndex = Platform.get().trustRootIndex(Platform.get().trustManager(sSLSocketFactory));
                lastSslSocketFactory = sSLSocketFactory;
            }
            trustRootIndex = lastTrustRootIndex;
        }
        return trustRootIndex;
    }

    public final boolean isHealthy(boolean z) {
        int soTimeout;
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        if (this.framedConnection == null && z) {
            try {
                soTimeout = this.socket.getSoTimeout();
                this.socket.setSoTimeout(1);
                if (this.source.exhausted()) {
                    this.socket.setSoTimeout(soTimeout);
                    return false;
                }
                this.socket.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.socket.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    private void createTunnel(int i, int i2) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl httpUrl = createTunnelRequest.httpUrl();
        StringBuilder sb = new StringBuilder("CONNECT ");
        sb.append(httpUrl.host());
        sb.append(":");
        sb.append(httpUrl.port());
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        do {
            Http1xStream http1xStream = new Http1xStream(null, this.source, this.sink);
            this.source.timeout().timeout((long) i, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
            http1xStream.writeRequest(createTunnelRequest.headers(), sb2);
            http1xStream.finishRequest();
            Response build = http1xStream.readResponse().request(createTunnelRequest).build();
            long contentLength = OkHeaders.contentLength(build);
            if (contentLength == -1) {
                contentLength = 0;
            }
            Source newFixedLengthSource = http1xStream.newFixedLengthSource(contentLength);
            Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    createTunnelRequest = OkHeaders.processAuthHeader(this.route.getAddress().getAuthenticator(), build, this.route.getProxy());
                } else {
                    StringBuilder sb3 = new StringBuilder("Unexpected response code for CONNECT: ");
                    sb3.append(build.code());
                    throw new IOException(sb3.toString());
                }
            } else if (!this.source.buffer().exhausted() || !this.sink.buffer().exhausted()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else {
                return;
            }
        } while (createTunnelRequest != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011e A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124 A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void connectTls(int r6, int r7, com.squareup.okhttp.internal.ConnectionSpecSelector r8) throws java.io.IOException {
        /*
            r5 = this;
            com.squareup.okhttp.Route r0 = r5.route
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L_0x000b
            r5.createTunnel(r6, r7)
        L_0x000b:
            com.squareup.okhttp.Route r6 = r5.route
            com.squareup.okhttp.Address r6 = r6.getAddress()
            javax.net.ssl.SSLSocketFactory r7 = r6.getSslSocketFactory()
            r0 = 0
            java.net.Socket r1 = r5.rawSocket     // Catch:{ AssertionError -> 0x0117 }
            java.lang.String r2 = r6.getUriHost()     // Catch:{ AssertionError -> 0x0117 }
            int r3 = r6.getUriPort()     // Catch:{ AssertionError -> 0x0117 }
            r4 = 1
            java.net.Socket r7 = r7.createSocket(r1, r2, r3, r4)     // Catch:{ AssertionError -> 0x0117 }
            javax.net.ssl.SSLSocket r7 = (javax.net.ssl.SSLSocket) r7     // Catch:{ AssertionError -> 0x0117 }
            com.squareup.okhttp.ConnectionSpec r8 = r8.configureSecureSocket(r7)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            boolean r1 = r8.supportsTlsExtensions()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            if (r1 == 0) goto L_0x0040
            com.squareup.okhttp.internal.Platform r1 = com.squareup.okhttp.internal.Platform.get()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r2 = r6.getUriHost()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.util.List r3 = r6.getProtocols()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r1.configureTlsExtensions(r7, r2, r3)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
        L_0x0040:
            r7.startHandshake()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            javax.net.ssl.SSLSession r1 = r7.getSession()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            com.squareup.okhttp.Handshake r1 = com.squareup.okhttp.Handshake.get(r1)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            javax.net.ssl.HostnameVerifier r2 = r6.getHostnameVerifier()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r3 = r6.getUriHost()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            javax.net.ssl.SSLSession r4 = r7.getSession()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            boolean r2 = r2.verify(r3, r4)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            if (r2 == 0) goto L_0x00c4
            com.squareup.okhttp.CertificatePinner r2 = r6.getCertificatePinner()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            com.squareup.okhttp.CertificatePinner r3 = com.squareup.okhttp.CertificatePinner.DEFAULT     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            if (r2 == r3) goto L_0x0085
            javax.net.ssl.SSLSocketFactory r2 = r6.getSslSocketFactory()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            com.squareup.okhttp.internal.tls.TrustRootIndex r2 = trustRootIndex(r2)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            com.squareup.okhttp.internal.tls.CertificateChainCleaner r3 = new com.squareup.okhttp.internal.tls.CertificateChainCleaner     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r3.<init>(r2)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.util.List r2 = r1.peerCertificates()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.util.List r2 = r3.clean(r2)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            com.squareup.okhttp.CertificatePinner r3 = r6.getCertificatePinner()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r6 = r6.getUriHost()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r3.check(r6, r2)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
        L_0x0085:
            boolean r6 = r8.supportsTlsExtensions()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            if (r6 == 0) goto L_0x0093
            com.squareup.okhttp.internal.Platform r6 = com.squareup.okhttp.internal.Platform.get()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r0 = r6.getSelectedProtocol(r7)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
        L_0x0093:
            r5.socket = r7     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.net.Socket r6 = r5.socket     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            okio.Source r6 = okio.Okio.source(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            okio.BufferedSource r6 = okio.Okio.buffer(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r5.source = r6     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.net.Socket r6 = r5.socket     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            okio.Sink r6 = okio.Okio.sink(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            okio.BufferedSink r6 = okio.Okio.buffer(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r5.sink = r6     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r5.handshake = r1     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            if (r0 == 0) goto L_0x00b6
            com.squareup.okhttp.Protocol r6 = com.squareup.okhttp.Protocol.get(r0)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            goto L_0x00b8
        L_0x00b6:
            com.squareup.okhttp.Protocol r6 = com.squareup.okhttp.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
        L_0x00b8:
            r5.protocol = r6     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            if (r7 == 0) goto L_0x00c3
            com.squareup.okhttp.internal.Platform r6 = com.squareup.okhttp.internal.Platform.get()
            r6.afterHandshake(r7)
        L_0x00c3:
            return
        L_0x00c4:
            java.util.List r8 = r1.peerCertificates()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r2 = "Hostname "
            r1.<init>(r2)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r6 = r6.getUriHost()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r6 = " not verified:\n    certificate: "
            r1.append(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r6 = com.squareup.okhttp.CertificatePinner.pin(r8)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r6 = "\n    DN: "
            r1.append(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.security.Principal r6 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r6 = r6.getName()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r6 = "\n    subjectAltNames: "
            r1.append(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.util.List r6 = com.squareup.okhttp.internal.tls.OkHostnameVerifier.allSubjectAltNames(r8)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            java.lang.String r6 = r1.toString()     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            r0.<init>(r6)     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
            throw r0     // Catch:{ AssertionError -> 0x0111, all -> 0x010f }
        L_0x010f:
            r6 = move-exception
            goto L_0x0125
        L_0x0111:
            r6 = move-exception
            r0 = r7
            goto L_0x0118
        L_0x0114:
            r6 = move-exception
            r7 = r0
            goto L_0x0125
        L_0x0117:
            r6 = move-exception
        L_0x0118:
            boolean r7 = com.squareup.okhttp.internal.Util.isAndroidGetsocknameError(r6)     // Catch:{ all -> 0x0114 }
            if (r7 == 0) goto L_0x0124
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0114 }
            r7.<init>(r6)     // Catch:{ all -> 0x0114 }
            throw r7     // Catch:{ all -> 0x0114 }
        L_0x0124:
            throw r6     // Catch:{ all -> 0x0114 }
        L_0x0125:
            if (r7 == 0) goto L_0x012e
            com.squareup.okhttp.internal.Platform r8 = com.squareup.okhttp.internal.Platform.get()
            r8.afterHandshake(r7)
        L_0x012e:
            com.squareup.okhttp.internal.Util.closeQuietly(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.p810io.RealConnection.connectTls(int, int, com.squareup.okhttp.internal.ConnectionSpecSelector):void");
    }

    private void connectSocket(int i, int i2, int i3, ConnectionSpecSelector connectionSpecSelector) throws IOException {
        this.rawSocket.setSoTimeout(i2);
        try {
            Platform.get().connectSocket(this.rawSocket, this.route.getSocketAddress(), i);
            this.source = Okio.buffer(Okio.source(this.rawSocket));
            this.sink = Okio.buffer(Okio.sink(this.rawSocket));
            if (this.route.getAddress().getSslSocketFactory() != null) {
                connectTls(i2, i3, connectionSpecSelector);
            } else {
                this.protocol = Protocol.HTTP_1_1;
                this.socket = this.rawSocket;
            }
            if (this.protocol == Protocol.SPDY_3 || this.protocol == Protocol.HTTP_2) {
                this.socket.setSoTimeout(0);
                FramedConnection build = new FramedConnection.Builder(true).socket(this.socket, this.route.getAddress().url().host(), this.source, this.sink).protocol(this.protocol).build();
                build.sendConnectionPreface();
                this.framedConnection = build;
            }
        } catch (ConnectException unused) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.route.getSocketAddress());
            throw new ConnectException(sb.toString());
        }
    }

    public final void connect(int i, int i2, int i3, List<ConnectionSpec> list, boolean z) throws RouteException {
        Socket socket2;
        if (this.protocol == null) {
            ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(list);
            Proxy proxy = this.route.getProxy();
            Address address = this.route.getAddress();
            if (this.route.getAddress().getSslSocketFactory() != null || list.contains(ConnectionSpec.CLEARTEXT)) {
                RouteException routeException = null;
                while (this.protocol == null) {
                    try {
                        if (proxy.type() != Type.DIRECT) {
                            if (proxy.type() != Type.HTTP) {
                                socket2 = new Socket(proxy);
                                this.rawSocket = socket2;
                                connectSocket(i, i2, i3, connectionSpecSelector);
                            }
                        }
                        socket2 = address.getSocketFactory().createSocket();
                        this.rawSocket = socket2;
                        connectSocket(i, i2, i3, connectionSpecSelector);
                    } catch (IOException e) {
                        Util.closeQuietly(this.socket);
                        Util.closeQuietly(this.rawSocket);
                        this.socket = null;
                        this.rawSocket = null;
                        this.source = null;
                        this.sink = null;
                        this.handshake = null;
                        this.protocol = null;
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.addConnectException(e);
                        }
                        if (!z || !connectionSpecSelector.connectionFailed(e)) {
                            throw routeException;
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder("CLEARTEXT communication not supported: ");
            sb.append(list);
            throw new RouteException(new UnknownServiceException(sb.toString()));
        }
        throw new IllegalStateException("already connected");
    }
}
