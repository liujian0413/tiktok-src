package com.squareup.okhttp;

import com.squareup.okhttp.Interceptor.Chain;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.StreamAllocation;
import java.io.IOException;
import java.net.ProtocolException;

public class Call {
    volatile boolean canceled;
    public final OkHttpClient client;
    HttpEngine engine;
    private boolean executed;
    Request originalRequest;

    class ApplicationInterceptorChain implements Chain {
        private final boolean forWebSocket;
        private final int index;
        private final Request request;

        public Connection connection() {
            return null;
        }

        public Request request() {
            return this.request;
        }

        public Response proceed(Request request2) throws IOException {
            if (this.index >= Call.this.client.interceptors().size()) {
                return Call.this.getResponse(request2, this.forWebSocket);
            }
            ApplicationInterceptorChain applicationInterceptorChain = new ApplicationInterceptorChain(this.index + 1, request2, this.forWebSocket);
            Interceptor interceptor = (Interceptor) Call.this.client.interceptors().get(this.index);
            Response intercept = interceptor.intercept(applicationInterceptorChain);
            if (intercept != null) {
                return intercept;
            }
            StringBuilder sb = new StringBuilder("application interceptor ");
            sb.append(interceptor);
            sb.append(" returned null");
            throw new NullPointerException(sb.toString());
        }

        ApplicationInterceptorChain(int i, Request request2, boolean z) {
            this.index = i;
            this.request = request2;
            this.forWebSocket = z;
        }
    }

    final class AsyncCall extends NamedRunnable {
        private final boolean forWebSocket;
        private final Callback responseCallback;

        /* access modifiers changed from: 0000 */
        public final Call get() {
            return Call.this;
        }

        /* access modifiers changed from: 0000 */
        public final void cancel() {
            Call.this.cancel();
        }

        /* access modifiers changed from: 0000 */
        public final Request request() {
            return Call.this.originalRequest;
        }

        /* access modifiers changed from: 0000 */
        public final String host() {
            return Call.this.originalRequest.httpUrl().host();
        }

        /* access modifiers changed from: 0000 */
        public final Object tag() {
            return Call.this.originalRequest.tag();
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003b A[SYNTHETIC, Splitter:B:15:0x003b] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0057 A[Catch:{ all -> 0x0034 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void execute() {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                com.squareup.okhttp.Call r2 = com.squareup.okhttp.Call.this     // Catch:{ IOException -> 0x0036 }
                boolean r3 = r5.forWebSocket     // Catch:{ IOException -> 0x0036 }
                com.squareup.okhttp.Response r2 = r2.getResponseWithInterceptorChain(r3)     // Catch:{ IOException -> 0x0036 }
                com.squareup.okhttp.Call r3 = com.squareup.okhttp.Call.this     // Catch:{ IOException -> 0x0036 }
                boolean r3 = r3.canceled     // Catch:{ IOException -> 0x0036 }
                if (r3 == 0) goto L_0x0023
                com.squareup.okhttp.Callback r1 = r5.responseCallback     // Catch:{ IOException -> 0x0021 }
                com.squareup.okhttp.Call r2 = com.squareup.okhttp.Call.this     // Catch:{ IOException -> 0x0021 }
                com.squareup.okhttp.Request r2 = r2.originalRequest     // Catch:{ IOException -> 0x0021 }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0021 }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ IOException -> 0x0021 }
                r1.onFailure(r2, r3)     // Catch:{ IOException -> 0x0021 }
                goto L_0x0028
            L_0x0021:
                r1 = move-exception
                goto L_0x0039
            L_0x0023:
                com.squareup.okhttp.Callback r1 = r5.responseCallback     // Catch:{ IOException -> 0x0021 }
                r1.onResponse(r2)     // Catch:{ IOException -> 0x0021 }
            L_0x0028:
                com.squareup.okhttp.Call r0 = com.squareup.okhttp.Call.this
                com.squareup.okhttp.OkHttpClient r0 = r0.client
                com.squareup.okhttp.Dispatcher r0 = r0.getDispatcher()
                r0.finished(r5)
                return
            L_0x0034:
                r0 = move-exception
                goto L_0x0070
            L_0x0036:
                r0 = move-exception
                r1 = r0
                r0 = 0
            L_0x0039:
                if (r0 == 0) goto L_0x0057
                java.util.logging.Logger r0 = com.squareup.okhttp.internal.Internal.logger     // Catch:{ all -> 0x0034 }
                java.util.logging.Level r2 = java.util.logging.Level.INFO     // Catch:{ all -> 0x0034 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
                java.lang.String r4 = "Callback failure for "
                r3.<init>(r4)     // Catch:{ all -> 0x0034 }
                com.squareup.okhttp.Call r4 = com.squareup.okhttp.Call.this     // Catch:{ all -> 0x0034 }
                java.lang.String r4 = r4.toLoggableString()     // Catch:{ all -> 0x0034 }
                r3.append(r4)     // Catch:{ all -> 0x0034 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0034 }
                r0.log(r2, r3, r1)     // Catch:{ all -> 0x0034 }
                goto L_0x0028
            L_0x0057:
                com.squareup.okhttp.Call r0 = com.squareup.okhttp.Call.this     // Catch:{ all -> 0x0034 }
                com.squareup.okhttp.internal.http.HttpEngine r0 = r0.engine     // Catch:{ all -> 0x0034 }
                if (r0 != 0) goto L_0x0062
                com.squareup.okhttp.Call r0 = com.squareup.okhttp.Call.this     // Catch:{ all -> 0x0034 }
                com.squareup.okhttp.Request r0 = r0.originalRequest     // Catch:{ all -> 0x0034 }
                goto L_0x006a
            L_0x0062:
                com.squareup.okhttp.Call r0 = com.squareup.okhttp.Call.this     // Catch:{ all -> 0x0034 }
                com.squareup.okhttp.internal.http.HttpEngine r0 = r0.engine     // Catch:{ all -> 0x0034 }
                com.squareup.okhttp.Request r0 = r0.getRequest()     // Catch:{ all -> 0x0034 }
            L_0x006a:
                com.squareup.okhttp.Callback r2 = r5.responseCallback     // Catch:{ all -> 0x0034 }
                r2.onFailure(r0, r1)     // Catch:{ all -> 0x0034 }
                goto L_0x0028
            L_0x0070:
                com.squareup.okhttp.Call r1 = com.squareup.okhttp.Call.this
                com.squareup.okhttp.OkHttpClient r1 = r1.client
                com.squareup.okhttp.Dispatcher r1 = r1.getDispatcher()
                r1.finished(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Call.AsyncCall.execute():void");
        }

        private AsyncCall(Callback callback, boolean z) {
            super("OkHttp %s", Call.this.originalRequest.urlString());
            this.responseCallback = callback;
            this.forWebSocket = z;
        }
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    /* access modifiers changed from: 0000 */
    public Object tag() {
        return this.originalRequest.tag();
    }

    public void cancel() {
        this.canceled = true;
        if (this.engine != null) {
            this.engine.cancel();
        }
    }

    public String toLoggableString() {
        String str;
        if (this.canceled) {
            str = "canceled call";
        } else {
            str = "call";
        }
        HttpUrl resolve = this.originalRequest.httpUrl().resolve("/...");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" to ");
        sb.append(resolve);
        return sb.toString();
    }

    public Response execute() throws IOException {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            this.client.getDispatcher().executed(this);
            Response responseWithInterceptorChain = getResponseWithInterceptorChain(false);
            if (responseWithInterceptorChain != null) {
                return responseWithInterceptorChain;
            }
            throw new IOException("Canceled");
        } finally {
            this.client.getDispatcher().finished(this);
        }
    }

    public void enqueue(Callback callback) {
        enqueue(callback, false);
    }

    public Response getResponseWithInterceptorChain(boolean z) throws IOException {
        return new ApplicationInterceptorChain(0, this.originalRequest, z).proceed(this.originalRequest);
    }

    protected Call(OkHttpClient okHttpClient, Request request) {
        this.client = okHttpClient.copyWithDefaults();
        this.originalRequest = request;
    }

    /* access modifiers changed from: 0000 */
    public void enqueue(Callback callback, boolean z) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.client.getDispatcher().enqueue(new AsyncCall(callback, z));
    }

    /* access modifiers changed from: 0000 */
    public Response getResponse(Request request, boolean z) throws IOException {
        boolean z2;
        Throwable th;
        StreamAllocation streamAllocation;
        RequestBody body = request.body();
        if (body != null) {
            Builder newBuilder = request.newBuilder();
            MediaType contentType = body.contentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", Long.toString(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
            request = newBuilder.build();
        }
        HttpEngine httpEngine = new HttpEngine(this.client, request, false, false, z, null, null, null);
        this.engine = httpEngine;
        int i = 0;
        while (!this.canceled) {
            z2 = true;
            try {
                this.engine.sendRequest();
                this.engine.readResponse();
                Response response = this.engine.getResponse();
                Request followUpRequest = this.engine.followUpRequest();
                if (followUpRequest == null) {
                    if (!z) {
                        this.engine.releaseStreamAllocation();
                    }
                    return response;
                }
                StreamAllocation close = this.engine.close();
                i++;
                if (i <= 20) {
                    if (!this.engine.sameConnection(followUpRequest.httpUrl())) {
                        close.release();
                        streamAllocation = null;
                    } else {
                        streamAllocation = close;
                    }
                    HttpEngine httpEngine2 = new HttpEngine(this.client, followUpRequest, false, false, z, streamAllocation, null, response);
                    this.engine = httpEngine2;
                } else {
                    close.release();
                    StringBuilder sb = new StringBuilder("Too many follow-up requests: ");
                    sb.append(i);
                    throw new ProtocolException(sb.toString());
                }
            } catch (RequestException e) {
                throw e.getCause();
            } catch (RouteException e2) {
                HttpEngine recover = this.engine.recover(e2);
                if (recover != null) {
                    this.engine = recover;
                } else {
                    throw e2.getLastConnectException();
                }
            } catch (IOException e3) {
                HttpEngine recover2 = this.engine.recover(e3, null);
                if (recover2 != null) {
                    this.engine = recover2;
                } else {
                    throw e3;
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = false;
            }
        }
        this.engine.releaseStreamAllocation();
        throw new IOException("Canceled");
        if (z2) {
            this.engine.close().release();
        }
        throw th;
    }
}
