package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Connection.Listener;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.p360ws.RealWebSocket.Streams;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

public final class RealConnection extends Listener implements Connection {
    public int allocationLimit = 1;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    private final ConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    public long idleAtNanos = Long.MAX_VALUE;
    public boolean noNewStreams;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    public int successCount;

    public final Handshake handshake() {
        return this.handshake;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final Route route() {
        return this.route;
    }

    public final Socket socket() {
        return this.socket;
    }

    public final void cancel() {
        Util.closeQuietly(this.rawSocket);
    }

    public final boolean isMultiplexed() {
        if (this.http2Connection != null) {
            return true;
        }
        return false;
    }

    private Request createTunnelRequest() {
        return new Builder().url(this.route.address.url).header("Host", Util.hostHeader(this.route.address.url, true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.address.url.host);
        sb.append(":");
        sb.append(this.route.address.url.port);
        sb.append(", proxy=");
        sb.append(this.route.proxy);
        sb.append(" hostAddress=");
        sb.append(this.route.inetSocketAddress);
        sb.append(" cipherSuite=");
        if (this.handshake != null) {
            obj = this.handshake.cipherSuite;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final void onStream(Http2Stream http2Stream) throws IOException {
        http2Stream.close(ErrorCode.REFUSED_STREAM);
    }

    public final Streams newWebSocketStreams(StreamAllocation streamAllocation) {
        final StreamAllocation streamAllocation2 = streamAllocation;
        C76761 r0 = new Streams(true, this.source, this.sink) {
            public void close() throws IOException {
                streamAllocation2.streamFinished(true, streamAllocation2.codec(), -1, null);
            }
        };
        return r0;
    }

    public final void onSettings(Http2Connection http2Connection2) {
        synchronized (this.connectionPool) {
            this.allocationLimit = http2Connection2.maxConcurrentStreams();
        }
    }

    private boolean isValid(SSLSession sSLSession) {
        if ("NONE".equals(sSLSession.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(sSLSession.getCipherSuite())) {
            return false;
        }
        return true;
    }

    public final boolean supportsUrl(HttpUrl httpUrl) {
        if (httpUrl.port != this.route.address.url.port) {
            return false;
        }
        if (httpUrl.host.equals(this.route.address.url.host)) {
            return true;
        }
        if (this.handshake == null || !OkHostnameVerifier.INSTANCE.verify(httpUrl.host, (X509Certificate) this.handshake.peerCertificates.get(0))) {
            return false;
        }
        return true;
    }

    public final boolean isHealthy(boolean z) {
        int soTimeout;
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        if (this.http2Connection == null) {
            if (z) {
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
        } else if (!this.http2Connection.isShutdown()) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f2 A[Catch:{ all -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8 A[Catch:{ all -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r8) throws java.io.IOException {
        /*
            r7 = this;
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address
            javax.net.ssl.SSLSocketFactory r1 = r0.sslSocketFactory
            r2 = 0
            java.net.Socket r3 = r7.rawSocket     // Catch:{ AssertionError -> 0x00eb }
            okhttp3.HttpUrl r4 = r0.url     // Catch:{ AssertionError -> 0x00eb }
            java.lang.String r4 = r4.host     // Catch:{ AssertionError -> 0x00eb }
            okhttp3.HttpUrl r5 = r0.url     // Catch:{ AssertionError -> 0x00eb }
            int r5 = r5.port     // Catch:{ AssertionError -> 0x00eb }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x00eb }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x00eb }
            okhttp3.ConnectionSpec r8 = r8.configureSecureSocket(r1)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            boolean r3 = r8.supportsTlsExtensions     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r3 == 0) goto L_0x002d
            okhttp3.internal.platform.Platform r3 = okhttp3.internal.platform.Platform.get()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okhttp3.HttpUrl r4 = r0.url     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r4 = r4.host     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.util.List<okhttp3.Protocol> r5 = r0.protocols     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.configureTlsExtensions(r1, r4, r5)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x002d:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            boolean r4 = r7.isValid(r3)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r4 == 0) goto L_0x00db
            okhttp3.Handshake r4 = okhttp3.Handshake.get(r3)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            javax.net.ssl.HostnameVerifier r5 = r0.hostnameVerifier     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okhttp3.HttpUrl r6 = r0.url     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r6 = r6.host     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r3 == 0) goto L_0x0092
            okhttp3.CertificatePinner r3 = r0.certificatePinner     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okhttp3.HttpUrl r0 = r0.url     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = r0.host     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.util.List<java.security.cert.Certificate> r5 = r4.peerCertificates     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.check(r0, r5)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            boolean r8 = r8.supportsTlsExtensions     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r8 == 0) goto L_0x0061
            okhttp3.internal.platform.Platform r8 = okhttp3.internal.platform.Platform.get()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r2 = r8.getSelectedProtocol(r1)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x0061:
            r7.socket = r1     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.net.Socket r8 = r7.socket     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okio.Source r8 = okio.Okio.source(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okio.BufferedSource r8 = okio.Okio.buffer(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r7.source = r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.net.Socket r8 = r7.socket     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okio.Sink r8 = okio.Okio.sink(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okio.BufferedSink r8 = okio.Okio.buffer(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r7.sink = r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r7.handshake = r4     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r2 == 0) goto L_0x0084
            okhttp3.Protocol r8 = okhttp3.Protocol.get(r2)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            goto L_0x0086
        L_0x0084:
            okhttp3.Protocol r8 = okhttp3.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x0086:
            r7.protocol = r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r1 == 0) goto L_0x0091
            okhttp3.internal.platform.Platform r8 = okhttp3.internal.platform.Platform.get()
            r8.afterHandshake(r1)
        L_0x0091:
            return
        L_0x0092:
            java.util.List<java.security.cert.Certificate> r8 = r4.peerCertificates     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r4 = "Hostname "
            r3.<init>(r4)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okhttp3.HttpUrl r0 = r0.url     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = r0.host     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = okhttp3.CertificatePinner.pin(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = "\n    DN: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.util.List r8 = okhttp3.internal.tls.OkHostnameVerifier.allSubjectAltNames(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.append(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r8 = r3.toString()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            throw r2     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x00db:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = "a valid ssl session was not established"
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            throw r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x00e3:
            r8 = move-exception
            goto L_0x00f9
        L_0x00e5:
            r8 = move-exception
            r2 = r1
            goto L_0x00ec
        L_0x00e8:
            r8 = move-exception
            r1 = r2
            goto L_0x00f9
        L_0x00eb:
            r8 = move-exception
        L_0x00ec:
            boolean r0 = okhttp3.internal.Util.isAndroidGetsocknameError(r8)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00f8
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00e8 }
            r0.<init>(r8)     // Catch:{ all -> 0x00e8 }
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x00f8:
            throw r8     // Catch:{ all -> 0x00e8 }
        L_0x00f9:
            if (r1 == 0) goto L_0x0102
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()
            r0.afterHandshake(r1)
        L_0x0102:
            okhttp3.internal.Util.closeQuietly(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connectTls(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    public RealConnection(ConnectionPool connectionPool2, Route route2) {
        this.connectionPool = connectionPool2;
        this.route = route2;
    }

    public final boolean isEligible(Address address, Route route2) {
        if (this.allocations.size() >= this.allocationLimit || this.noNewStreams || !Internal.instance.equalsNonHost(this.route.address, address)) {
            return false;
        }
        if (address.url.host.equals(route().address.url.host)) {
            return true;
        }
        if (this.http2Connection == null || route2 == null || route2.proxy.type() != Type.DIRECT || this.route.proxy.type() != Type.DIRECT || !this.route.inetSocketAddress.equals(route2.inetSocketAddress) || route2.address.hostnameVerifier != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url)) {
            return false;
        }
        try {
            address.certificatePinner.check(address.url.host, handshake().peerCertificates);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final HttpCodec newCodec(OkHttpClient okHttpClient, Chain chain, StreamAllocation streamAllocation) throws SocketException {
        if (this.http2Connection != null) {
            return new Http2Codec(okHttpClient, chain, streamAllocation, this.http2Connection);
        }
        this.socket.setSoTimeout(chain.readTimeoutMillis());
        this.source.timeout().timeout((long) chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.sink.timeout().timeout((long) chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new Http1Codec(okHttpClient, streamAllocation, this.source, this.sink);
    }

    public static RealConnection testConnection(ConnectionPool connectionPool2, Route route2, Socket socket2, long j) {
        RealConnection realConnection = new RealConnection(connectionPool2, route2);
        realConnection.socket = socket2;
        realConnection.idleAtNanos = j;
        return realConnection;
    }

    private void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
        if (this.route.address.sslSocketFactory == null) {
            this.protocol = Protocol.HTTP_1_1;
            this.socket = this.rawSocket;
            return;
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            this.socket.setSoTimeout(0);
            this.http2Connection = new Http2Connection.Builder(true).socket(this.socket, this.route.address.url.host, this.source, this.sink).listener(this).pingIntervalMillis(i).build();
            this.http2Connection.start();
        }
    }

    private void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socket2;
        try {
            Proxy proxy = this.route.proxy;
            Address address = this.route.address;
            if (proxy.type() != Type.DIRECT) {
                if (proxy.type() != Type.HTTP) {
                    socket2 = new Socket(proxy);
                    this.rawSocket = socket2;
                    eventListener.connectStart(call, this.route.inetSocketAddress, proxy);
                    this.rawSocket.setSoTimeout(i2);
                    Platform.get().connectSocket(this.rawSocket, this.route.inetSocketAddress, i);
                    this.source = Okio.buffer(Okio.source(this.rawSocket));
                    this.sink = Okio.buffer(Okio.sink(this.rawSocket));
                }
            }
            socket2 = address.socketFactory.createSocket();
            this.rawSocket = socket2;
            eventListener.connectStart(call, this.route.inetSocketAddress, proxy);
            this.rawSocket.setSoTimeout(i2);
            Platform.get().connectSocket(this.rawSocket, this.route.inetSocketAddress, i);
            this.source = Okio.buffer(Okio.source(this.rawSocket));
            this.sink = Okio.buffer(Okio.sink(this.rawSocket));
        } catch (ConnectException e) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.route.inetSocketAddress);
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e);
            throw connectException;
        } catch (NullPointerException e2) {
            if ("throw with null exception".equals(e2.getMessage())) {
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        StringBuilder sb = new StringBuilder("CONNECT ");
        sb.append(Util.hostHeader(httpUrl, true));
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        while (true) {
            Http1Codec http1Codec = new Http1Codec(null, null, this.source, this.sink);
            this.source.timeout().timeout((long) i, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
            http1Codec.writeRequest(request.headers, sb2);
            http1Codec.finishRequest();
            Response build = http1Codec.readResponseHeaders(false).request(request).build();
            long contentLength = HttpHeaders.contentLength(build);
            if (contentLength == -1) {
                contentLength = 0;
            }
            Source newFixedLengthSource = http1Codec.newFixedLengthSource(contentLength);
            Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
            int i3 = build.code;
            if (i3 != 200) {
                if (i3 == 407) {
                    Request authenticate = this.route.address.proxyAuthenticator.authenticate(this.route, build);
                    if (authenticate == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(build.header("Connection"))) {
                        return authenticate;
                    } else {
                        request = authenticate;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder("Unexpected response code for CONNECT: ");
                    sb3.append(build.code);
                    throw new IOException(sb3.toString());
                }
            } else if (this.source.buffer().exhausted() && this.sink.buffer().exhausted()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl httpUrl = createTunnelRequest.url;
        int i4 = 0;
        while (i4 < 21) {
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, httpUrl);
            if (createTunnelRequest != null) {
                Util.closeQuietly(this.rawSocket);
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.inetSocketAddress, this.route.proxy, null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118 A[EDGE_INSN: B:59:0x0118->B:55:0x0118 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            okhttp3.Protocol r0 = r7.protocol
            if (r0 != 0) goto L_0x0119
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address
            java.util.List<okhttp3.ConnectionSpec> r0 = r0.connectionSpecs
            okhttp3.internal.connection.ConnectionSpecSelector r10 = new okhttp3.internal.connection.ConnectionSpecSelector
            r10.<init>(r0)
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory
            if (r1 != 0) goto L_0x0063
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0056
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address
            okhttp3.HttpUrl r0 = r0.url
            java.lang.String r0 = r0.host
            okhttp3.internal.platform.Platform r1 = okhttp3.internal.platform.Platform.get()
            boolean r1 = r1.isCleartextTrafficPermitted(r0)
            if (r1 == 0) goto L_0x0038
            goto L_0x0063
        L_0x0038:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0056:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0063:
            r11 = 0
            r12 = r11
        L_0x0065:
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x00d2 }
            boolean r0 = r0.requiresTunnel()     // Catch:{ IOException -> 0x00d2 }
            if (r0 == 0) goto L_0x0086
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.connectTunnel(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00d2 }
            java.net.Socket r0 = r7.rawSocket     // Catch:{ IOException -> 0x00d2 }
            if (r0 != 0) goto L_0x0081
            goto L_0x009f
        L_0x0081:
            r13 = r17
            r14 = r18
            goto L_0x008d
        L_0x0086:
            r13 = r17
            r14 = r18
            r7.connectSocket(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00d0 }
        L_0x008d:
            r15 = r20
            r7.establishProtocol(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00ce }
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x00ce }
            java.net.InetSocketAddress r0 = r0.inetSocketAddress     // Catch:{ IOException -> 0x00ce }
            okhttp3.Route r1 = r7.route     // Catch:{ IOException -> 0x00ce }
            java.net.Proxy r1 = r1.proxy     // Catch:{ IOException -> 0x00ce }
            okhttp3.Protocol r2 = r7.protocol     // Catch:{ IOException -> 0x00ce }
            r9.connectEnd(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00ce }
        L_0x009f:
            okhttp3.Route r0 = r7.route
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L_0x00b9
            java.net.Socket r0 = r7.rawSocket
            if (r0 == 0) goto L_0x00ac
            goto L_0x00b9
        L_0x00ac:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x00b9:
            okhttp3.internal.http2.Http2Connection r0 = r7.http2Connection
            if (r0 == 0) goto L_0x00cd
            okhttp3.ConnectionPool r1 = r7.connectionPool
            monitor-enter(r1)
            okhttp3.internal.http2.Http2Connection r0 = r7.http2Connection     // Catch:{ all -> 0x00ca }
            int r0 = r0.maxConcurrentStreams()     // Catch:{ all -> 0x00ca }
            r7.allocationLimit = r0     // Catch:{ all -> 0x00ca }
            monitor-exit(r1)     // Catch:{ all -> 0x00ca }
            return
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ca }
            throw r0
        L_0x00cd:
            return
        L_0x00ce:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d0:
            r0 = move-exception
            goto L_0x00d7
        L_0x00d2:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00d7:
            r15 = r20
        L_0x00d9:
            java.net.Socket r1 = r7.socket
            okhttp3.internal.Util.closeQuietly(r1)
            java.net.Socket r1 = r7.rawSocket
            okhttp3.internal.Util.closeQuietly(r1)
            r7.socket = r11
            r7.rawSocket = r11
            r7.source = r11
            r7.sink = r11
            r7.handshake = r11
            r7.protocol = r11
            r7.http2Connection = r11
            okhttp3.Route r1 = r7.route
            java.net.InetSocketAddress r3 = r1.inetSocketAddress
            okhttp3.Route r1 = r7.route
            java.net.Proxy r4 = r1.proxy
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x010b
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            r12 = r1
            goto L_0x010e
        L_0x010b:
            r12.addConnectException(r0)
        L_0x010e:
            if (r21 == 0) goto L_0x0118
            boolean r0 = r10.connectionFailed(r0)
            if (r0 == 0) goto L_0x0118
            goto L_0x0065
        L_0x0118:
            throw r12
        L_0x0119:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }
}
