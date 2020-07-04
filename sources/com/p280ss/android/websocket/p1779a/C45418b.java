package com.p280ss.android.websocket.p1779a;

import com.p280ss.android.websocket.p1779a.p1780a.C45406a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okio.ByteString;

/* renamed from: com.ss.android.websocket.a.b */
public final class C45418b {

    /* renamed from: a */
    private final Call f116969a;

    /* renamed from: b */
    private final Random f116970b;

    /* renamed from: c */
    private final String f116971c;

    /* renamed from: com.ss.android.websocket.a.b$a */
    static class C45420a extends C45406a {

        /* renamed from: e */
        private final StreamAllocation f116974e;

        /* renamed from: f */
        private final ExecutorService f116975f;

        /* renamed from: a */
        public final void mo108756a() {
            mo108757a(null);
        }

        /* renamed from: a */
        public final void mo108757a(IOException iOException) {
            this.f116975f.shutdown();
            this.f116974e.noNewStreams();
            this.f116974e.streamFinished(true, this.f116974e.codec(), -1, iOException);
        }

        /* renamed from: a */
        static C45406a m143626a(StreamAllocation streamAllocation, Response response, Random random, C45421c cVar) {
            String httpUrl = response.request.url.toString();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(), Util.threadFactory(Util.format("OkHttp %s WebSocket", httpUrl), true));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            C45420a aVar = new C45420a(streamAllocation, random, threadPoolExecutor, cVar, httpUrl);
            return aVar;
        }

        private C45420a(StreamAllocation streamAllocation, Random random, ExecutorService executorService, C45421c cVar, String str) {
            super(true, streamAllocation.connection().newWebSocketStreams(streamAllocation).source, streamAllocation.connection().newWebSocketStreams(streamAllocation).sink, random, executorService, cVar, str);
            this.f116974e = streamAllocation;
            this.f116975f = executorService;
        }
    }

    /* renamed from: a */
    public final void mo108771a(final C45421c cVar) {
        this.f116969a.enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                cVar.mo108775a(iOException, (Response) null);
            }

            public final void onResponse(Call call, Response response) throws IOException {
                try {
                    C45418b.this.mo108772a(response, cVar);
                } catch (IOException e) {
                    cVar.mo108775a(e, response);
                }
            }
        });
    }

    /* renamed from: a */
    private static String m143623a(String str) {
        try {
            return ByteString.m23795of(MessageDigest.getInstance("SHA-1").digest(str.getBytes("UTF-8"))).base64();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static C45418b m143622a(OkHttpClient okHttpClient, Request request) {
        return new C45418b(okHttpClient, request);
    }

    private C45418b(OkHttpClient okHttpClient, Request request) {
        this(okHttpClient, request, new SecureRandom());
    }

    /* renamed from: a */
    public final void mo108772a(Response response, C45421c cVar) throws IOException {
        if (response.code == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f116971c);
                    sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    String a = m143623a(sb.toString());
                    if (a.equals(header3)) {
                        C45406a a2 = C45420a.m143626a(Internal.instance.streamAllocation(this.f116969a), response, this.f116970b, cVar);
                        cVar.mo108774a((C45405a) a2, response);
                        do {
                        } while (a2.mo108759b());
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("Expected 'Sec-WebSocket-Accept' header value '");
                    sb2.append(a);
                    sb2.append("' but was '");
                    sb2.append(header3);
                    sb2.append("'");
                    throw new ProtocolException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder("Expected 'Upgrade' header value 'websocket' but was '");
                sb3.append(header2);
                sb3.append("'");
                throw new ProtocolException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder("Expected 'Connection' header value 'Upgrade' but was '");
            sb4.append(header);
            sb4.append("'");
            throw new ProtocolException(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder("Expected HTTP 101 response but was '");
        sb5.append(response.code);
        sb5.append(" ");
        sb5.append(response.message);
        sb5.append("'");
        throw new ProtocolException(sb5.toString());
    }

    private C45418b(OkHttpClient okHttpClient, Request request, Random random) {
        if ("GET".equals(request.method)) {
            this.f116970b = random;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f116971c = ByteString.m23795of(bArr).base64();
            this.f116969a = Internal.instance.newWebSocketCall(okHttpClient.newBuilder().protocols(Collections.singletonList(Protocol.HTTP_1_1)).build(), request.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.f116971c).header("Sec-WebSocket-Version", "13").build());
            return;
        }
        StringBuilder sb = new StringBuilder("Request must be GET: ");
        sb.append(request.method);
        throw new IllegalArgumentException(sb.toString());
    }
}
