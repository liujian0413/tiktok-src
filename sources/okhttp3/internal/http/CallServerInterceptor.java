package okhttp3.internal.http;

import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.net.C7177a;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.Builder;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    static final class CountingSink extends ForwardingSink {
        long successfulCount;

        CountingSink(Sink sink) {
            super(sink);
        }

        public final void write(Buffer buffer, long j) throws IOException {
            super.write(buffer, j);
            this.successfulCount += j;
        }
    }

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_I18nOkHttpCheckLancet_intercept */
        static Response m23793x24ce25c2(CallServerInterceptor callServerInterceptor, Chain chain) throws IOException {
            Response intercept$___twin___ = callServerInterceptor.intercept$___twin___(chain);
            if (intercept$___twin___ != null) {
                C7116a.m22227a(intercept$___twin___);
            }
            C7177a.m22405a(chain, intercept$___twin___);
            return intercept$___twin___;
        }
    }

    public final Response intercept(Chain chain) throws IOException {
        return _lancet.m23793x24ce25c2(this, chain);
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    public final Response intercept$___twin___(Chain chain) throws IOException {
        Response response;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        HttpCodec httpCodec = realInterceptorChain.httpCodec;
        StreamAllocation streamAllocation = realInterceptorChain.streamAllocation;
        RealConnection realConnection = (RealConnection) realInterceptorChain.connection();
        Request request = realInterceptorChain.request();
        long currentTimeMillis = System.currentTimeMillis();
        realInterceptorChain.eventListener.requestHeadersStart(realInterceptorChain.call());
        httpCodec.writeRequestHeaders(request);
        realInterceptorChain.eventListener.requestHeadersEnd(realInterceptorChain.call(), request);
        Builder builder = null;
        if (HttpMethod.permitsRequestBody(request.method) && request.body != null) {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                httpCodec.flushRequest();
                realInterceptorChain.eventListener.responseHeadersStart(realInterceptorChain.call());
                builder = httpCodec.readResponseHeaders(true);
            }
            if (builder == null) {
                realInterceptorChain.eventListener.requestBodyStart(realInterceptorChain.call());
                CountingSink countingSink = new CountingSink(httpCodec.createRequestBody(request, request.body.contentLength()));
                BufferedSink buffer = Okio.buffer((Sink) countingSink);
                request.body.writeTo(buffer);
                buffer.close();
                realInterceptorChain.eventListener.requestBodyEnd(realInterceptorChain.call(), countingSink.successfulCount);
            } else if (!realConnection.isMultiplexed()) {
                streamAllocation.noNewStreams();
            }
        }
        httpCodec.finishRequest();
        if (builder == null) {
            realInterceptorChain.eventListener.responseHeadersStart(realInterceptorChain.call());
            builder = httpCodec.readResponseHeaders(false);
        }
        Response build = builder.request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int i = build.code;
        if (i == 100) {
            build = httpCodec.readResponseHeaders(false).request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            i = build.code;
        }
        realInterceptorChain.eventListener.responseHeadersEnd(realInterceptorChain.call(), build);
        if (!this.forWebSocket || i != 101) {
            response = build.newBuilder().body(httpCodec.openResponseBody(build)).build();
        } else {
            response = build.newBuilder().body(Util.EMPTY_RESPONSE).build();
        }
        if ("close".equalsIgnoreCase(response.request.header("Connection")) || "close".equalsIgnoreCase(response.header("Connection"))) {
            streamAllocation.noNewStreams();
        }
        if ((i != 204 && i != 205) || response.body.contentLength() <= 0) {
            return response;
        }
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(i);
        sb.append(" had non-zero Content-Length: ");
        sb.append(response.body.contentLength());
        throw new ProtocolException(sb.toString());
    }
}
