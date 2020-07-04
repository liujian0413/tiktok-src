package com.squareup.okhttp.internal.http;

import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.squareup.okhttp.Address;
import com.squareup.okhttp.CertificatePinner;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Interceptor.Chain;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.Version;
import com.squareup.okhttp.internal.http.CacheStrategy.Factory;
import com.squareup.okhttp.internal.p810io.RealConnection;
import java.io.Closeable;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

public final class HttpEngine {
    private static final ResponseBody EMPTY_BODY = new ResponseBody() {
        public final long contentLength() {
            return 0;
        }

        public final MediaType contentType() {
            return null;
        }

        public final BufferedSource source() {
            return new Buffer();
        }
    };
    public final boolean bufferRequestBody;
    private BufferedSink bufferedRequestBody;
    private Response cacheResponse;
    private CacheStrategy cacheStrategy;
    private final boolean callerWritesRequestBody;
    final OkHttpClient client;
    private final boolean forWebSocket;
    public HttpStream httpStream;
    public Request networkRequest;
    private final Response priorResponse;
    private Sink requestBodyOut;
    long sentRequestMillis = -1;
    private CacheRequest storeRequest;
    public final StreamAllocation streamAllocation;
    private boolean transparentGzip;
    private final Request userRequest;
    private Response userResponse;

    class NetworkInterceptorChain implements Chain {
        private int calls;
        private final int index;
        private final Request request;

        public Request request() {
            return this.request;
        }

        public Connection connection() {
            return HttpEngine.this.streamAllocation.connection();
        }

        public Response proceed(Request request2) throws IOException {
            this.calls++;
            if (this.index > 0) {
                Interceptor interceptor = (Interceptor) HttpEngine.this.client.networkInterceptors().get(this.index - 1);
                Address address = connection().getRoute().getAddress();
                if (!request2.httpUrl().host().equals(address.getUriHost()) || request2.httpUrl().port() != address.getUriPort()) {
                    StringBuilder sb = new StringBuilder("network interceptor ");
                    sb.append(interceptor);
                    sb.append(" must retain the same host and port");
                    throw new IllegalStateException(sb.toString());
                } else if (this.calls > 1) {
                    StringBuilder sb2 = new StringBuilder("network interceptor ");
                    sb2.append(interceptor);
                    sb2.append(" must call proceed() exactly once");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            if (this.index < HttpEngine.this.client.networkInterceptors().size()) {
                NetworkInterceptorChain networkInterceptorChain = new NetworkInterceptorChain(this.index + 1, request2);
                Interceptor interceptor2 = (Interceptor) HttpEngine.this.client.networkInterceptors().get(this.index);
                Response intercept = interceptor2.intercept(networkInterceptorChain);
                if (networkInterceptorChain.calls != 1) {
                    StringBuilder sb3 = new StringBuilder("network interceptor ");
                    sb3.append(interceptor2);
                    sb3.append(" must call proceed() exactly once");
                    throw new IllegalStateException(sb3.toString());
                } else if (intercept != null) {
                    return intercept;
                } else {
                    StringBuilder sb4 = new StringBuilder("network interceptor ");
                    sb4.append(interceptor2);
                    sb4.append(" returned null");
                    throw new NullPointerException(sb4.toString());
                }
            } else {
                HttpEngine.this.httpStream.writeRequestHeaders(request2);
                HttpEngine.this.networkRequest = request2;
                if (HttpEngine.this.permitsRequestBody(request2) && request2.body() != null) {
                    BufferedSink buffer = Okio.buffer(HttpEngine.this.httpStream.createRequestBody(request2, request2.body().contentLength()));
                    request2.body().writeTo(buffer);
                    buffer.close();
                }
                Response readNetworkResponse = HttpEngine.this.readNetworkResponse();
                int code = readNetworkResponse.code();
                if ((code != 204 && code != 205) || readNetworkResponse.body().contentLength() <= 0) {
                    return readNetworkResponse;
                }
                StringBuilder sb5 = new StringBuilder("HTTP ");
                sb5.append(code);
                sb5.append(" had non-zero Content-Length: ");
                sb5.append(readNetworkResponse.body().contentLength());
                throw new ProtocolException(sb5.toString());
            }
        }

        NetworkInterceptorChain(int i, Request request2) {
            this.index = i;
            this.request = request2;
        }
    }

    public final Request getRequest() {
        return this.userRequest;
    }

    public final void cancel() {
        this.streamAllocation.cancel();
    }

    public final Connection getConnection() {
        return this.streamAllocation.connection();
    }

    public final boolean hasResponse() {
        if (this.userResponse != null) {
            return true;
        }
        return false;
    }

    public final void releaseStreamAllocation() throws IOException {
        this.streamAllocation.release();
    }

    public final Sink getRequestBody() {
        if (this.cacheStrategy != null) {
            return this.requestBodyOut;
        }
        throw new IllegalStateException();
    }

    public final Response getResponse() {
        if (this.userResponse != null) {
            return this.userResponse;
        }
        throw new IllegalStateException();
    }

    public final BufferedSink getBufferedRequestBody() {
        BufferedSink bufferedSink = this.bufferedRequestBody;
        if (bufferedSink != null) {
            return bufferedSink;
        }
        Sink requestBody = getRequestBody();
        if (requestBody == null) {
            return null;
        }
        BufferedSink buffer = Okio.buffer(requestBody);
        this.bufferedRequestBody = buffer;
        return buffer;
    }

    public final void writingRequestHeaders() {
        if (this.sentRequestMillis == -1) {
            this.sentRequestMillis = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    private HttpStream connect() throws RouteException, RequestException, IOException {
        return this.streamAllocation.newStream(this.client.getConnectTimeout(), this.client.getReadTimeout(), this.client.getWriteTimeout(), this.client.getRetryOnConnectionFailure(), !this.networkRequest.method().equals("GET"));
    }

    private void maybeCache() throws IOException {
        InternalCache internalCache = Internal.instance.internalCache(this.client);
        if (internalCache != null) {
            if (!CacheStrategy.isCacheable(this.userResponse, this.networkRequest)) {
                if (HttpMethod.invalidatesCache(this.networkRequest.method())) {
                    try {
                        internalCache.remove(this.networkRequest);
                        return;
                    } catch (IOException unused) {
                    }
                }
                return;
            }
            this.storeRequest = internalCache.put(stripBody(this.userResponse));
        }
    }

    public final StreamAllocation close() {
        if (this.bufferedRequestBody != null) {
            Util.closeQuietly((Closeable) this.bufferedRequestBody);
        } else if (this.requestBodyOut != null) {
            Util.closeQuietly((Closeable) this.requestBodyOut);
        }
        if (this.userResponse != null) {
            Util.closeQuietly((Closeable) this.userResponse.body());
        } else {
            this.streamAllocation.connectionFailed();
        }
        return this.streamAllocation;
    }

    public final Response readNetworkResponse() throws IOException {
        this.httpStream.finishRequest();
        Response build = this.httpStream.readResponseHeaders().request(this.networkRequest).handshake(this.streamAllocation.connection().getHandshake()).header(OkHeaders.SENT_MILLIS, Long.toString(this.sentRequestMillis)).header(OkHeaders.RECEIVED_MILLIS, Long.toString(System.currentTimeMillis())).build();
        if (!this.forWebSocket) {
            build = build.newBuilder().body(this.httpStream.openResponseBody(build)).build();
        }
        if ("close".equalsIgnoreCase(build.request().header("Connection")) || "close".equalsIgnoreCase(build.header("Connection"))) {
            this.streamAllocation.noNewStreams();
        }
        return build;
    }

    public final Request followUpRequest() throws IOException {
        Route route;
        Proxy proxy;
        if (this.userResponse != null) {
            RealConnection connection = this.streamAllocation.connection();
            if (connection != null) {
                route = connection.getRoute();
            } else {
                route = null;
            }
            if (route != null) {
                proxy = route.getProxy();
            } else {
                proxy = this.client.getProxy();
            }
            int code = this.userResponse.code();
            String method = this.userRequest.method();
            if (code != 401) {
                if (code != 407) {
                    switch (code) {
                        case C34943c.f91128x /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.x int)*/:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            switch (code) {
                                case 307:
                                case 308:
                                    if (!method.equals("GET") && !method.equals("HEAD")) {
                                        return null;
                                    }
                                default:
                                    return null;
                            }
                    }
                    if (!this.client.getFollowRedirects()) {
                        return null;
                    }
                    String header = this.userResponse.header("Location");
                    if (header == null) {
                        return null;
                    }
                    HttpUrl resolve = this.userRequest.httpUrl().resolve(header);
                    if (resolve == null) {
                        return null;
                    }
                    if (!resolve.scheme().equals(this.userRequest.httpUrl().scheme()) && !this.client.getFollowSslRedirects()) {
                        return null;
                    }
                    Builder newBuilder = this.userRequest.newBuilder();
                    if (HttpMethod.permitsRequestBody(method)) {
                        if (HttpMethod.redirectsToGet(method)) {
                            newBuilder.method("GET", null);
                        } else {
                            newBuilder.method(method, null);
                        }
                        newBuilder.removeHeader("Transfer-Encoding");
                        newBuilder.removeHeader("Content-Length");
                        newBuilder.removeHeader("Content-Type");
                    }
                    if (!sameConnection(resolve)) {
                        newBuilder.removeHeader("Authorization");
                    }
                    return newBuilder.url(resolve).build();
                } else if (proxy.type() != Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            }
            return OkHeaders.processAuthHeader(this.client.getAuthenticator(), this.userResponse, proxy);
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void readResponse() throws java.io.IOException {
        /*
            r5 = this;
            com.squareup.okhttp.Response r0 = r5.userResponse
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.squareup.okhttp.Request r0 = r5.networkRequest
            if (r0 != 0) goto L_0x0016
            com.squareup.okhttp.Response r0 = r5.cacheResponse
            if (r0 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call sendRequest() first!"
            r0.<init>(r1)
            throw r0
        L_0x0016:
            com.squareup.okhttp.Request r0 = r5.networkRequest
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            boolean r0 = r5.forWebSocket
            if (r0 == 0) goto L_0x0028
            com.squareup.okhttp.internal.http.HttpStream r0 = r5.httpStream
            com.squareup.okhttp.Request r1 = r5.networkRequest
            r0.writeRequestHeaders(r1)
            goto L_0x00b4
        L_0x0028:
            boolean r0 = r5.callerWritesRequestBody
            if (r0 != 0) goto L_0x003c
            com.squareup.okhttp.internal.http.HttpEngine$NetworkInterceptorChain r0 = new com.squareup.okhttp.internal.http.HttpEngine$NetworkInterceptorChain
            r1 = 0
            com.squareup.okhttp.Request r2 = r5.networkRequest
            r0.<init>(r1, r2)
            com.squareup.okhttp.Request r1 = r5.networkRequest
            com.squareup.okhttp.Response r0 = r0.proceed(r1)
            goto L_0x00b8
        L_0x003c:
            okio.BufferedSink r0 = r5.bufferedRequestBody
            if (r0 == 0) goto L_0x0055
            okio.BufferedSink r0 = r5.bufferedRequestBody
            okio.Buffer r0 = r0.buffer()
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0055
            okio.BufferedSink r0 = r5.bufferedRequestBody
            r0.emit()
        L_0x0055:
            long r0 = r5.sentRequestMillis
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0092
            com.squareup.okhttp.Request r0 = r5.networkRequest
            long r0 = com.squareup.okhttp.internal.http.OkHeaders.contentLength(r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x008b
            okio.Sink r0 = r5.requestBodyOut
            boolean r0 = r0 instanceof com.squareup.okhttp.internal.http.RetryableSink
            if (r0 == 0) goto L_0x008b
            okio.Sink r0 = r5.requestBodyOut
            com.squareup.okhttp.internal.http.RetryableSink r0 = (com.squareup.okhttp.internal.http.RetryableSink) r0
            long r0 = r0.contentLength()
            com.squareup.okhttp.Request r2 = r5.networkRequest
            com.squareup.okhttp.Request$Builder r2 = r2.newBuilder()
            java.lang.String r3 = "Content-Length"
            java.lang.String r0 = java.lang.Long.toString(r0)
            com.squareup.okhttp.Request$Builder r0 = r2.header(r3, r0)
            com.squareup.okhttp.Request r0 = r0.build()
            r5.networkRequest = r0
        L_0x008b:
            com.squareup.okhttp.internal.http.HttpStream r0 = r5.httpStream
            com.squareup.okhttp.Request r1 = r5.networkRequest
            r0.writeRequestHeaders(r1)
        L_0x0092:
            okio.Sink r0 = r5.requestBodyOut
            if (r0 == 0) goto L_0x00b4
            okio.BufferedSink r0 = r5.bufferedRequestBody
            if (r0 == 0) goto L_0x00a0
            okio.BufferedSink r0 = r5.bufferedRequestBody
            r0.close()
            goto L_0x00a5
        L_0x00a0:
            okio.Sink r0 = r5.requestBodyOut
            r0.close()
        L_0x00a5:
            okio.Sink r0 = r5.requestBodyOut
            boolean r0 = r0 instanceof com.squareup.okhttp.internal.http.RetryableSink
            if (r0 == 0) goto L_0x00b4
            com.squareup.okhttp.internal.http.HttpStream r0 = r5.httpStream
            okio.Sink r1 = r5.requestBodyOut
            com.squareup.okhttp.internal.http.RetryableSink r1 = (com.squareup.okhttp.internal.http.RetryableSink) r1
            r0.writeRequestBody(r1)
        L_0x00b4:
            com.squareup.okhttp.Response r0 = r5.readNetworkResponse()
        L_0x00b8:
            com.squareup.okhttp.Headers r1 = r0.headers()
            r5.receiveHeaders(r1)
            com.squareup.okhttp.Response r1 = r5.cacheResponse
            if (r1 == 0) goto L_0x013d
            com.squareup.okhttp.Response r1 = r5.cacheResponse
            boolean r1 = validate(r1, r0)
            if (r1 == 0) goto L_0x0134
            com.squareup.okhttp.Response r1 = r5.cacheResponse
            com.squareup.okhttp.Response$Builder r1 = r1.newBuilder()
            com.squareup.okhttp.Request r2 = r5.userRequest
            com.squareup.okhttp.Response$Builder r1 = r1.request(r2)
            com.squareup.okhttp.Response r2 = r5.priorResponse
            com.squareup.okhttp.Response r2 = stripBody(r2)
            com.squareup.okhttp.Response$Builder r1 = r1.priorResponse(r2)
            com.squareup.okhttp.Response r2 = r5.cacheResponse
            com.squareup.okhttp.Headers r2 = r2.headers()
            com.squareup.okhttp.Headers r3 = r0.headers()
            com.squareup.okhttp.Headers r2 = combine(r2, r3)
            com.squareup.okhttp.Response$Builder r1 = r1.headers(r2)
            com.squareup.okhttp.Response r2 = r5.cacheResponse
            com.squareup.okhttp.Response r2 = stripBody(r2)
            com.squareup.okhttp.Response$Builder r1 = r1.cacheResponse(r2)
            com.squareup.okhttp.Response r2 = stripBody(r0)
            com.squareup.okhttp.Response$Builder r1 = r1.networkResponse(r2)
            com.squareup.okhttp.Response r1 = r1.build()
            r5.userResponse = r1
            com.squareup.okhttp.ResponseBody r0 = r0.body()
            r0.close()
            r5.releaseStreamAllocation()
            com.squareup.okhttp.internal.Internal r0 = com.squareup.okhttp.internal.Internal.instance
            com.squareup.okhttp.OkHttpClient r1 = r5.client
            com.squareup.okhttp.internal.InternalCache r0 = r0.internalCache(r1)
            r0.trackConditionalCacheHit()
            com.squareup.okhttp.Response r1 = r5.cacheResponse
            com.squareup.okhttp.Response r2 = r5.userResponse
            com.squareup.okhttp.Response r2 = stripBody(r2)
            r0.update(r1, r2)
            com.squareup.okhttp.Response r0 = r5.userResponse
            com.squareup.okhttp.Response r0 = r5.unzip(r0)
            r5.userResponse = r0
            return
        L_0x0134:
            com.squareup.okhttp.Response r1 = r5.cacheResponse
            com.squareup.okhttp.ResponseBody r1 = r1.body()
            com.squareup.okhttp.internal.Util.closeQuietly(r1)
        L_0x013d:
            com.squareup.okhttp.Response$Builder r1 = r0.newBuilder()
            com.squareup.okhttp.Request r2 = r5.userRequest
            com.squareup.okhttp.Response$Builder r1 = r1.request(r2)
            com.squareup.okhttp.Response r2 = r5.priorResponse
            com.squareup.okhttp.Response r2 = stripBody(r2)
            com.squareup.okhttp.Response$Builder r1 = r1.priorResponse(r2)
            com.squareup.okhttp.Response r2 = r5.cacheResponse
            com.squareup.okhttp.Response r2 = stripBody(r2)
            com.squareup.okhttp.Response$Builder r1 = r1.cacheResponse(r2)
            com.squareup.okhttp.Response r0 = stripBody(r0)
            com.squareup.okhttp.Response$Builder r0 = r1.networkResponse(r0)
            com.squareup.okhttp.Response r0 = r0.build()
            r5.userResponse = r0
            com.squareup.okhttp.Response r0 = r5.userResponse
            boolean r0 = hasBody(r0)
            if (r0 == 0) goto L_0x0182
            r5.maybeCache()
            com.squareup.okhttp.internal.http.CacheRequest r0 = r5.storeRequest
            com.squareup.okhttp.Response r1 = r5.userResponse
            com.squareup.okhttp.Response r0 = r5.cacheWritingResponse(r0, r1)
            com.squareup.okhttp.Response r0 = r5.unzip(r0)
            r5.userResponse = r0
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.HttpEngine.readResponse():void");
    }

    public final void sendRequest() throws RequestException, RouteException, IOException {
        Response response;
        if (this.cacheStrategy == null) {
            if (this.httpStream == null) {
                Request networkRequest2 = networkRequest(this.userRequest);
                InternalCache internalCache = Internal.instance.internalCache(this.client);
                if (internalCache != null) {
                    response = internalCache.get(networkRequest2);
                } else {
                    response = null;
                }
                this.cacheStrategy = new Factory(System.currentTimeMillis(), networkRequest2, response).get();
                this.networkRequest = this.cacheStrategy.networkRequest;
                this.cacheResponse = this.cacheStrategy.cacheResponse;
                if (internalCache != null) {
                    internalCache.trackResponse(this.cacheStrategy);
                }
                if (response != null && this.cacheResponse == null) {
                    Util.closeQuietly((Closeable) response.body());
                }
                if (this.networkRequest != null) {
                    this.httpStream = connect();
                    this.httpStream.setHttpEngine(this);
                    if (this.callerWritesRequestBody && permitsRequestBody(this.networkRequest) && this.requestBodyOut == null) {
                        long contentLength = OkHeaders.contentLength(networkRequest2);
                        if (!this.bufferRequestBody) {
                            this.httpStream.writeRequestHeaders(this.networkRequest);
                            this.requestBodyOut = this.httpStream.createRequestBody(this.networkRequest, contentLength);
                            return;
                        } else if (contentLength > 2147483647L) {
                            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                        } else if (contentLength != -1) {
                            this.httpStream.writeRequestHeaders(this.networkRequest);
                            this.requestBodyOut = new RetryableSink((int) contentLength);
                        } else {
                            this.requestBodyOut = new RetryableSink();
                        }
                    }
                } else {
                    if (this.cacheResponse != null) {
                        this.userResponse = this.cacheResponse.newBuilder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).cacheResponse(stripBody(this.cacheResponse)).build();
                    } else {
                        this.userResponse = new Response.Builder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(EMPTY_BODY).build();
                    }
                    this.userResponse = unzip(this.userResponse);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final HttpEngine recover(IOException iOException) {
        return recover(iOException, this.requestBodyOut);
    }

    /* access modifiers changed from: 0000 */
    public final boolean permitsRequestBody(Request request) {
        return HttpMethod.permitsRequestBody(request.method());
    }

    private static Response stripBody(Response response) {
        if (response == null || response.body() == null) {
            return response;
        }
        return response.newBuilder().body(null).build();
    }

    public final void receiveHeaders(Headers headers) throws IOException {
        CookieHandler cookieHandler = this.client.getCookieHandler();
        if (cookieHandler != null) {
            cookieHandler.put(this.userRequest.uri(), OkHeaders.toMultimap(headers, null));
        }
    }

    public final HttpEngine recover(RouteException routeException) {
        if (!this.streamAllocation.recover(routeException) || !this.client.getRetryOnConnectionFailure()) {
            return null;
        }
        HttpEngine httpEngine = new HttpEngine(this.client, this.userRequest, this.bufferRequestBody, this.callerWritesRequestBody, this.forWebSocket, close(), (RetryableSink) this.requestBodyOut, this.priorResponse);
        return httpEngine;
    }

    public final boolean sameConnection(HttpUrl httpUrl) {
        HttpUrl httpUrl2 = this.userRequest.httpUrl();
        if (!httpUrl2.host().equals(httpUrl.host()) || httpUrl2.port() != httpUrl.port() || !httpUrl2.scheme().equals(httpUrl.scheme())) {
            return false;
        }
        return true;
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && OkHeaders.contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    private Request networkRequest(Request request) throws IOException {
        Builder newBuilder = request.newBuilder();
        if (request.header("Host") == null) {
            newBuilder.header("Host", Util.hostHeader(request.httpUrl()));
        }
        if (request.header("Connection") == null) {
            newBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null) {
            this.transparentGzip = true;
            newBuilder.header("Accept-Encoding", "gzip");
        }
        CookieHandler cookieHandler = this.client.getCookieHandler();
        if (cookieHandler != null) {
            OkHeaders.addCookies(newBuilder, cookieHandler.get(request.uri(), OkHeaders.toMultimap(newBuilder.build().headers(), null)));
        }
        if (request.header("User-Agent") == null) {
            newBuilder.header("User-Agent", Version.userAgent());
        }
        return newBuilder.build();
    }

    private Response unzip(Response response) throws IOException {
        if (!this.transparentGzip || !"gzip".equalsIgnoreCase(this.userResponse.header("Content-Encoding")) || response.body() == null) {
            return response;
        }
        GzipSource gzipSource = new GzipSource(response.body().source());
        Headers build = response.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build();
        return response.newBuilder().headers(build).body(new RealResponseBody(build, Okio.buffer((Source) gzipSource))).build();
    }

    private Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        Sink body = cacheRequest.body();
        if (body == null) {
            return response;
        }
        final BufferedSource source = response.body().source();
        final BufferedSink buffer = Okio.buffer(body);
        return response.newBuilder().body(new RealResponseBody(response.headers(), Okio.buffer((Source) new Source() {
            boolean cacheRequestClosed;

            public Timeout timeout() {
                return source.timeout();
            }

            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                source.close();
            }

            public long read(Buffer buffer, long j) throws IOException {
                try {
                    long read = source.read(buffer, j);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            buffer.close();
                        }
                        return -1;
                    }
                    buffer.copyTo(buffer.buffer(), buffer.size() - read, read);
                    buffer.emitCompleteSegments();
                    return read;
                } catch (IOException e) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e;
                }
            }
        }))).build();
    }

    private static boolean validate(Response response, Response response2) {
        if (response2.code() == 304) {
            return true;
        }
        Date date = response.headers().getDate("Last-Modified");
        if (date != null) {
            Date date2 = response2.headers().getDate("Last-Modified");
            if (date2 != null && date2.getTime() < date.getTime()) {
                return true;
            }
        }
        return false;
    }

    private static Headers combine(Headers headers, Headers headers2) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if ((!"Warning".equalsIgnoreCase(name) || !value.startsWith("1")) && (!OkHeaders.isEndToEnd(name) || headers2.get(name) == null)) {
                builder.add(name, value);
            }
        }
        int size2 = headers2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String name2 = headers2.name(i2);
            if (!"Content-Length".equalsIgnoreCase(name2) && OkHeaders.isEndToEnd(name2)) {
                builder.add(name2, headers2.value(i2));
            }
        }
        return builder.build();
    }

    private static Address createAddress(OkHttpClient okHttpClient, Request request) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (request.isHttps()) {
            SSLSocketFactory sslSocketFactory = okHttpClient.getSslSocketFactory();
            hostnameVerifier = okHttpClient.getHostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = okHttpClient.getCertificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        Address address = new Address(request.httpUrl().host(), request.httpUrl().port(), okHttpClient.getDns(), okHttpClient.getSocketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, okHttpClient.getAuthenticator(), okHttpClient.getProxy(), okHttpClient.getProtocols(), okHttpClient.getConnectionSpecs(), okHttpClient.getProxySelector());
        return address;
    }

    public final HttpEngine recover(IOException iOException, Sink sink) {
        if (!this.streamAllocation.recover(iOException, sink) || !this.client.getRetryOnConnectionFailure()) {
            return null;
        }
        HttpEngine httpEngine = new HttpEngine(this.client, this.userRequest, this.bufferRequestBody, this.callerWritesRequestBody, this.forWebSocket, close(), (RetryableSink) sink, this.priorResponse);
        return httpEngine;
    }

    public HttpEngine(OkHttpClient okHttpClient, Request request, boolean z, boolean z2, boolean z3, StreamAllocation streamAllocation2, RetryableSink retryableSink, Response response) {
        this.client = okHttpClient;
        this.userRequest = request;
        this.bufferRequestBody = z;
        this.callerWritesRequestBody = z2;
        this.forWebSocket = z3;
        if (streamAllocation2 == null) {
            streamAllocation2 = new StreamAllocation(okHttpClient.getConnectionPool(), createAddress(okHttpClient, request));
        }
        this.streamAllocation = streamAllocation2;
        this.requestBodyOut = retryableSink;
        this.priorResponse = response;
    }
}
