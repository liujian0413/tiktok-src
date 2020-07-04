package okhttp3.internal.huc;

import com.p280ss.android.ugc.aweme.policy.Policy;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.JavaNetHeaders;
import okhttp3.internal.URLFilter;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.Buffer;

public final class OkHttpURLConnection extends HttpURLConnection implements Callback {
    private static final Set<String> METHODS = new LinkedHashSet(Arrays.asList(new String[]{"OPTIONS", "GET", "HEAD", "POST", "PUT", Policy.ACTION_DELETE, "TRACE", "PATCH"}));
    public static final String RESPONSE_SOURCE;
    public static final String SELECTED_PROTOCOL;
    Call call;
    private Throwable callFailure;
    OkHttpClient client;
    boolean connectPending;
    private boolean executed;
    private long fixedContentLength;
    Handshake handshake;
    public final Object lock;
    private final NetworkInterceptor networkInterceptor;
    Response networkResponse;
    Proxy proxy;
    private Builder requestHeaders;
    private Response response;
    private Headers responseHeaders;
    URLFilter urlFilter;

    final class NetworkInterceptor implements Interceptor {
        private boolean proceed;

        public final void proceed() {
            synchronized (OkHttpURLConnection.this.lock) {
                this.proceed = true;
                OkHttpURLConnection.this.lock.notifyAll();
            }
        }

        NetworkInterceptor() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:25|26|27) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
            throw new java.io.InterruptedIOException();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r5) throws java.io.IOException {
            /*
                r4 = this;
                okhttp3.Request r0 = r5.request()
                okhttp3.internal.huc.OkHttpURLConnection r1 = okhttp3.internal.huc.OkHttpURLConnection.this
                okhttp3.internal.URLFilter r1 = r1.urlFilter
                if (r1 == 0) goto L_0x0017
                okhttp3.internal.huc.OkHttpURLConnection r1 = okhttp3.internal.huc.OkHttpURLConnection.this
                okhttp3.internal.URLFilter r1 = r1.urlFilter
                okhttp3.HttpUrl r2 = r0.url
                java.net.URL r2 = r2.url()
                r1.checkURLPermitted(r2)
            L_0x0017:
                okhttp3.internal.huc.OkHttpURLConnection r1 = okhttp3.internal.huc.OkHttpURLConnection.this
                java.lang.Object r1 = r1.lock
                monitor-enter(r1)
                okhttp3.internal.huc.OkHttpURLConnection r2 = okhttp3.internal.huc.OkHttpURLConnection.this     // Catch:{ all -> 0x0082 }
                r3 = 0
                r2.connectPending = r3     // Catch:{ all -> 0x0082 }
                okhttp3.internal.huc.OkHttpURLConnection r2 = okhttp3.internal.huc.OkHttpURLConnection.this     // Catch:{ all -> 0x0082 }
                okhttp3.Connection r3 = r5.connection()     // Catch:{ all -> 0x0082 }
                okhttp3.Route r3 = r3.route()     // Catch:{ all -> 0x0082 }
                java.net.Proxy r3 = r3.proxy     // Catch:{ all -> 0x0082 }
                r2.proxy = r3     // Catch:{ all -> 0x0082 }
                okhttp3.internal.huc.OkHttpURLConnection r2 = okhttp3.internal.huc.OkHttpURLConnection.this     // Catch:{ all -> 0x0082 }
                okhttp3.Connection r3 = r5.connection()     // Catch:{ all -> 0x0082 }
                okhttp3.Handshake r3 = r3.handshake()     // Catch:{ all -> 0x0082 }
                r2.handshake = r3     // Catch:{ all -> 0x0082 }
                okhttp3.internal.huc.OkHttpURLConnection r2 = okhttp3.internal.huc.OkHttpURLConnection.this     // Catch:{ all -> 0x0082 }
                java.lang.Object r2 = r2.lock     // Catch:{ all -> 0x0082 }
                r2.notifyAll()     // Catch:{ all -> 0x0082 }
            L_0x0042:
                boolean r2 = r4.proceed     // Catch:{ InterruptedException -> 0x007c }
                if (r2 != 0) goto L_0x004e
                okhttp3.internal.huc.OkHttpURLConnection r2 = okhttp3.internal.huc.OkHttpURLConnection.this     // Catch:{ InterruptedException -> 0x007c }
                java.lang.Object r2 = r2.lock     // Catch:{ InterruptedException -> 0x007c }
                r2.wait()     // Catch:{ InterruptedException -> 0x007c }
                goto L_0x0042
            L_0x004e:
                monitor-exit(r1)     // Catch:{ all -> 0x0082 }
                okhttp3.RequestBody r1 = r0.body
                boolean r1 = r1 instanceof okhttp3.internal.huc.OutputStreamRequestBody
                if (r1 == 0) goto L_0x005d
                okhttp3.RequestBody r1 = r0.body
                okhttp3.internal.huc.OutputStreamRequestBody r1 = (okhttp3.internal.huc.OutputStreamRequestBody) r1
                okhttp3.Request r0 = r1.prepareToSendRequest(r0)
            L_0x005d:
                okhttp3.Response r5 = r5.proceed(r0)
                okhttp3.internal.huc.OkHttpURLConnection r0 = okhttp3.internal.huc.OkHttpURLConnection.this
                java.lang.Object r0 = r0.lock
                monitor-enter(r0)
                okhttp3.internal.huc.OkHttpURLConnection r1 = okhttp3.internal.huc.OkHttpURLConnection.this     // Catch:{ all -> 0x0079 }
                r1.networkResponse = r5     // Catch:{ all -> 0x0079 }
                okhttp3.internal.huc.OkHttpURLConnection r1 = okhttp3.internal.huc.OkHttpURLConnection.this     // Catch:{ all -> 0x0079 }
                okhttp3.Request r2 = r5.request     // Catch:{ all -> 0x0079 }
                okhttp3.HttpUrl r2 = r2.url     // Catch:{ all -> 0x0079 }
                java.net.URL r2 = r2.url()     // Catch:{ all -> 0x0079 }
                r1.url = r2     // Catch:{ all -> 0x0079 }
                monitor-exit(r0)     // Catch:{ all -> 0x0079 }
                return r5
            L_0x0079:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0079 }
                throw r5
            L_0x007c:
                java.io.InterruptedIOException r5 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0082 }
                r5.<init>()     // Catch:{ all -> 0x0082 }
                throw r5     // Catch:{ all -> 0x0082 }
            L_0x0082:
                r5 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0082 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.huc.OkHttpURLConnection.NetworkInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
        }
    }

    static final class UnexpectedException extends IOException {
        static final Interceptor INTERCEPTOR = new Interceptor() {
            public final Response intercept(Chain chain) throws IOException {
                try {
                    return chain.proceed(chain.request());
                } catch (Error | RuntimeException e) {
                    throw new UnexpectedException(e);
                }
            }
        };

        UnexpectedException(Throwable th) {
            super(th);
        }
    }

    public final int getConnectTimeout() {
        return this.client.connectTimeout;
    }

    public final boolean getInstanceFollowRedirects() {
        return this.client.followRedirects;
    }

    public final int getReadTimeout() {
        return this.client.readTimeout;
    }

    public final int getResponseCode() throws IOException {
        return getResponse(true).code;
    }

    public final String getResponseMessage() throws IOException {
        return getResponse(true).message;
    }

    public final void disconnect() {
        if (this.call != null) {
            this.networkInterceptor.proceed();
            this.call.cancel();
        }
    }

    private String defaultUserAgent() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            return toHumanReadableAscii(property);
        }
        return Version.userAgent();
    }

    public final InputStream getErrorStream() {
        try {
            Response response2 = getResponse(true);
            if (!HttpHeaders.hasBody(response2) || response2.code < 400) {
                return null;
            }
            return response2.body.byteStream();
        } catch (IOException unused) {
            return null;
        }
    }

    public final Map<String, List<String>> getHeaderFields() {
        try {
            return JavaNetHeaders.toMultimap(getHeaders(), StatusLine.get(getResponse(true)).toString());
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    public final Map<String, List<String>> getRequestProperties() {
        if (!this.connected) {
            return JavaNetHeaders.toMultimap(this.requestHeaders.build(), null);
        }
        throw new IllegalStateException("Cannot access request header fields after connection is set");
    }

    public final boolean usingProxy() {
        if (this.proxy != null) {
            return true;
        }
        Proxy proxy2 = this.client.proxy;
        if (proxy2 == null || proxy2.type() == Type.DIRECT) {
            return false;
        }
        return true;
    }

    private Headers getHeaders() throws IOException {
        if (this.responseHeaders == null) {
            Response response2 = getResponse(true);
            this.responseHeaders = response2.headers.newBuilder().add(SELECTED_PROTOCOL, response2.protocol.toString()).add(RESPONSE_SOURCE, responseSourceHeader(response2)).build();
        }
        return this.responseHeaders;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void connect() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r2.executed
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            okhttp3.Call r0 = r2.buildCall()
            r1 = 1
            r2.executed = r1
            r0.enqueue(r2)
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
        L_0x0012:
            boolean r1 = r2.connectPending     // Catch:{ InterruptedException -> 0x0033 }
            if (r1 == 0) goto L_0x0024
            okhttp3.Response r1 = r2.response     // Catch:{ InterruptedException -> 0x0033 }
            if (r1 != 0) goto L_0x0024
            java.lang.Throwable r1 = r2.callFailure     // Catch:{ InterruptedException -> 0x0033 }
            if (r1 != 0) goto L_0x0024
            java.lang.Object r1 = r2.lock     // Catch:{ InterruptedException -> 0x0033 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0033 }
            goto L_0x0012
        L_0x0024:
            java.lang.Throwable r1 = r2.callFailure     // Catch:{ InterruptedException -> 0x0033 }
            if (r1 != 0) goto L_0x002a
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x002a:
            java.lang.Throwable r1 = r2.callFailure     // Catch:{ InterruptedException -> 0x0033 }
            java.io.IOException r1 = propagate(r1)     // Catch:{ InterruptedException -> 0x0033 }
            throw r1     // Catch:{ InterruptedException -> 0x0033 }
        L_0x0031:
            r1 = move-exception
            goto L_0x0039
        L_0x0033:
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.huc.OkHttpURLConnection.connect():void");
    }

    public final InputStream getInputStream() throws IOException {
        if (this.doInput) {
            Response response2 = getResponse(false);
            if (response2.code < 400) {
                return response2.body.byteStream();
            }
            throw new FileNotFoundException(this.url.toString());
        }
        throw new ProtocolException("This protocol does not support input");
    }

    public final OutputStream getOutputStream() throws IOException {
        OutputStreamRequestBody outputStreamRequestBody = (OutputStreamRequestBody) buildCall().request().body;
        if (outputStreamRequestBody != null) {
            if (outputStreamRequestBody instanceof StreamedRequestBody) {
                connect();
                this.networkInterceptor.proceed();
            }
            if (!outputStreamRequestBody.closed) {
                return outputStreamRequestBody.outputStream;
            }
            throw new ProtocolException("cannot write request body after response has been read");
        }
        StringBuilder sb = new StringBuilder("method does not support a request body: ");
        sb.append(this.method);
        throw new ProtocolException(sb.toString());
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Platform.get().getPrefix());
        sb.append("-Selected-Protocol");
        SELECTED_PROTOCOL = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Platform.get().getPrefix());
        sb2.append("-Response-Source");
        RESPONSE_SOURCE = sb2.toString();
    }

    public final Permission getPermission() throws IOException {
        int i;
        URL url = getURL();
        String host = url.getHost();
        if (url.getPort() != -1) {
            i = url.getPort();
        } else {
            i = HttpUrl.defaultPort(url.getProtocol());
        }
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.client.proxy.address();
            host = inetSocketAddress.getHostName();
            i = inetSocketAddress.getPort();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(host);
        sb.append(":");
        sb.append(i);
        return new SocketPermission(sb.toString(), "connect, resolve");
    }

    private Call buildCall() throws IOException {
        OutputStreamRequestBody outputStreamRequestBody;
        if (this.call != null) {
            return this.call;
        }
        boolean z = true;
        this.connected = true;
        if (this.doOutput) {
            if (this.method.equals("GET")) {
                this.method = "POST";
            } else if (!HttpMethod.permitsRequestBody(this.method)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.method);
                sb.append(" does not support writing");
                throw new ProtocolException(sb.toString());
            }
        }
        if (this.requestHeaders.get("User-Agent") == null) {
            this.requestHeaders.add("User-Agent", defaultUserAgent());
        }
        if (HttpMethod.permitsRequestBody(this.method)) {
            if (this.requestHeaders.get("Content-Type") == null) {
                this.requestHeaders.add("Content-Type", "application/x-www-form-urlencoded");
            }
            long j = -1;
            if (this.fixedContentLength == -1 && this.chunkLength <= 0) {
                z = false;
            }
            String str = this.requestHeaders.get("Content-Length");
            if (this.fixedContentLength != -1) {
                j = this.fixedContentLength;
            } else if (str != null) {
                j = Long.parseLong(str);
            }
            if (z) {
                outputStreamRequestBody = new StreamedRequestBody(j);
            } else {
                outputStreamRequestBody = new BufferedRequestBody(j);
            }
            outputStreamRequestBody.timeout.timeout((long) this.client.writeTimeout, TimeUnit.MILLISECONDS);
        } else {
            outputStreamRequestBody = null;
        }
        Request build = new Request.Builder().url(Internal.instance.getHttpUrlChecked(getURL().toString())).headers(this.requestHeaders.build()).method(this.method, outputStreamRequestBody).build();
        if (this.urlFilter != null) {
            this.urlFilter.checkURLPermitted(build.url.url());
        }
        OkHttpClient.Builder newBuilder = this.client.newBuilder();
        newBuilder.interceptors.clear();
        newBuilder.interceptors.add(UnexpectedException.INTERCEPTOR);
        newBuilder.networkInterceptors.clear();
        newBuilder.networkInterceptors.add(this.networkInterceptor);
        newBuilder.dispatcher(new Dispatcher(this.client.dispatcher.executorService()));
        if (!getUseCaches()) {
            newBuilder.cache(null);
        }
        Call newCall = newBuilder.build().newCall(build);
        this.call = newCall;
        return newCall;
    }

    public final void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode((long) i);
    }

    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.requestHeaders.get(str);
    }

    private static IOException propagate(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw new AssertionError();
        }
    }

    public final String getHeaderField(int i) {
        try {
            Headers headers = getHeaders();
            if (i >= 0) {
                if (i < headers.size()) {
                    return headers.value(i);
                }
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getHeaderFieldKey(int i) {
        try {
            Headers headers = getHeaders();
            if (i >= 0) {
                if (i < headers.size()) {
                    return headers.name(i);
                }
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final void setConnectTimeout(int i) {
        this.client = this.client.newBuilder().connectTimeout((long) i, TimeUnit.MILLISECONDS).build();
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.client = this.client.newBuilder().followRedirects(z).build();
    }

    public final void setReadTimeout(int i) {
        this.client = this.client.newBuilder().readTimeout((long) i, TimeUnit.MILLISECONDS).build();
    }

    public final String getHeaderField(String str) {
        if (str != null) {
            return getHeaders().get(str);
        }
        try {
            return StatusLine.get(getResponse(true)).toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public final void setFixedLengthStreamingMode(long j) {
        if (this.connected) {
            throw new IllegalStateException("Already connected");
        } else if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        } else if (j >= 0) {
            this.fixedContentLength = j;
            this.fixedContentLength = (int) Math.min(j, 2147483647L);
        } else {
            throw new IllegalArgumentException("contentLength < 0");
        }
    }

    public final void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
        if (this.ifModifiedSince != 0) {
            this.requestHeaders.set("If-Modified-Since", HttpDate.format(new Date(this.ifModifiedSince)));
        } else {
            this.requestHeaders.removeAll("If-Modified-Since");
        }
    }

    public final void setRequestMethod(String str) throws ProtocolException {
        if (METHODS.contains(str)) {
            this.method = str;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected one of ");
        sb.append(METHODS);
        sb.append(" but was ");
        sb.append(str);
        throw new ProtocolException(sb.toString());
    }

    private static String responseSourceHeader(Response response2) {
        if (response2.networkResponse == null) {
            if (response2.cacheResponse == null) {
                return "NONE";
            }
            StringBuilder sb = new StringBuilder("CACHE ");
            sb.append(response2.code);
            return sb.toString();
        } else if (response2.cacheResponse == null) {
            StringBuilder sb2 = new StringBuilder("NETWORK ");
            sb2.append(response2.code);
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("CONDITIONAL_CACHE ");
            sb3.append(response2.networkResponse.code);
            return sb3.toString();
        }
    }

    private static String toHumanReadableAscii(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt <= 31 || codePointAt >= 127) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i2);
                buffer.writeUtf8CodePoint(63);
                while (true) {
                    i2 += Character.charCount(codePointAt);
                    if (i2 >= length) {
                        return buffer.readUtf8();
                    }
                    codePointAt = str.codePointAt(i2);
                    if (codePointAt <= 31 || codePointAt >= 127) {
                        i = 63;
                    } else {
                        i = codePointAt;
                    }
                    buffer.writeUtf8CodePoint(i);
                }
            } else {
                i2 += Character.charCount(codePointAt);
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        r3 = buildCall();
        r2.networkInterceptor.proceed();
        r0 = (okhttp3.internal.huc.OutputStreamRequestBody) r3.request().body;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r0 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        r0.outputStream.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2.executed == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r0 = r2.lock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        if (r2.response != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        if (r2.callFailure != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        r2.lock.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0050, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005a, code lost:
        r2.executed = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        onResponse(r3, r3.execute());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0066, code lost:
        onFailure(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.Response getResponse(boolean r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            okhttp3.Response r1 = r2.response     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x000b
            okhttp3.Response r3 = r2.response     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return r3
        L_0x000b:
            java.lang.Throwable r1 = r2.callFailure     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0020
            if (r3 == 0) goto L_0x0019
            okhttp3.Response r3 = r2.networkResponse     // Catch:{ all -> 0x0089 }
            if (r3 == 0) goto L_0x0019
            okhttp3.Response r3 = r2.networkResponse     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return r3
        L_0x0019:
            java.lang.Throwable r3 = r2.callFailure     // Catch:{ all -> 0x0089 }
            java.io.IOException r3 = propagate(r3)     // Catch:{ all -> 0x0089 }
            throw r3     // Catch:{ all -> 0x0089 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            okhttp3.Call r3 = r2.buildCall()
            okhttp3.internal.huc.OkHttpURLConnection$NetworkInterceptor r0 = r2.networkInterceptor
            r0.proceed()
            okhttp3.Request r0 = r3.request()
            okhttp3.RequestBody r0 = r0.body
            okhttp3.internal.huc.OutputStreamRequestBody r0 = (okhttp3.internal.huc.OutputStreamRequestBody) r0
            if (r0 == 0) goto L_0x0039
            java.io.OutputStream r0 = r0.outputStream
            r0.close()
        L_0x0039:
            boolean r0 = r2.executed
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
        L_0x0040:
            okhttp3.Response r3 = r2.response     // Catch:{ InterruptedException -> 0x0052 }
            if (r3 != 0) goto L_0x004e
            java.lang.Throwable r3 = r2.callFailure     // Catch:{ InterruptedException -> 0x0052 }
            if (r3 != 0) goto L_0x004e
            java.lang.Object r3 = r2.lock     // Catch:{ InterruptedException -> 0x0052 }
            r3.wait()     // Catch:{ InterruptedException -> 0x0052 }
            goto L_0x0040
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0069
        L_0x0050:
            r3 = move-exception
            goto L_0x0058
        L_0x0052:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r3
        L_0x005a:
            r0 = 1
            r2.executed = r0
            okhttp3.Response r0 = r3.execute()     // Catch:{ IOException -> 0x0065 }
            r2.onResponse(r3, r0)     // Catch:{ IOException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r0 = move-exception
            r2.onFailure(r3, r0)
        L_0x0069:
            java.lang.Object r3 = r2.lock
            monitor-enter(r3)
            java.lang.Throwable r0 = r2.callFailure     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x007f
            okhttp3.Response r0 = r2.response     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0078
            okhttp3.Response r0 = r2.response     // Catch:{ all -> 0x0086 }
            monitor-exit(r3)     // Catch:{ all -> 0x0086 }
            return r0
        L_0x0078:
            monitor-exit(r3)     // Catch:{ all -> 0x0086 }
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L_0x007f:
            java.lang.Throwable r0 = r2.callFailure     // Catch:{ all -> 0x0086 }
            java.io.IOException r0 = propagate(r0)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0086 }
            throw r0
        L_0x0089:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.huc.OkHttpURLConnection.getResponse(boolean):okhttp3.Response");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFailure(okhttp3.Call r2, java.io.IOException r3) {
        /*
            r1 = this;
            java.lang.Object r2 = r1.lock
            monitor-enter(r2)
            boolean r0 = r3 instanceof okhttp3.internal.huc.OkHttpURLConnection.UnexpectedException     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x000b
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ all -> 0x0014 }
        L_0x000b:
            r1.callFailure = r3     // Catch:{ all -> 0x0014 }
            java.lang.Object r3 = r1.lock     // Catch:{ all -> 0x0014 }
            r3.notifyAll()     // Catch:{ all -> 0x0014 }
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.huc.OkHttpURLConnection.onFailure(okhttp3.Call, java.io.IOException):void");
    }

    public final void onResponse(Call call2, Response response2) {
        synchronized (this.lock) {
            this.response = response2;
            this.handshake = response2.handshake;
            this.url = response2.request.url.url();
            this.lock.notifyAll();
        }
    }

    public OkHttpURLConnection(URL url, OkHttpClient okHttpClient) {
        super(url);
        this.networkInterceptor = new NetworkInterceptor();
        this.requestHeaders = new Builder();
        this.fixedContentLength = -1;
        this.lock = new Object();
        this.connectPending = true;
        this.client = okHttpClient;
    }

    public final void addRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot add request property after connection is made");
        } else if (str == null) {
            throw new NullPointerException("field == null");
        } else if (str2 == null) {
            Platform platform = Platform.get();
            StringBuilder sb = new StringBuilder("Ignoring header ");
            sb.append(str);
            sb.append(" because its value was null.");
            platform.log(5, sb.toString(), null);
        } else {
            this.requestHeaders.add(str, str2);
        }
    }

    public final void setRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot set request property after connection is made");
        } else if (str == null) {
            throw new NullPointerException("field == null");
        } else if (str2 == null) {
            Platform platform = Platform.get();
            StringBuilder sb = new StringBuilder("Ignoring header ");
            sb.append(str);
            sb.append(" because its value was null.");
            platform.log(5, sb.toString(), null);
        } else {
            this.requestHeaders.set(str, str2);
        }
    }

    public OkHttpURLConnection(URL url, OkHttpClient okHttpClient, URLFilter uRLFilter) {
        this(url, okHttpClient);
        this.urlFilter = uRLFilter;
    }
}
