package com.bytedance.common.wschannel.channel.p486a.p487a.p489b;

import com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9786e.C9787a;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.p360ws.RealWebSocket.Streams;
import okio.ByteString;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a */
public class C9777a implements C9783b, C9787a {

    /* renamed from: b */
    static final /* synthetic */ boolean f26575b = (!C9777a.class.desiredAssertionStatus());

    /* renamed from: c */
    private static final List<Protocol> f26576c = Collections.singletonList(Protocol.HTTP_1_1);

    /* renamed from: a */
    public C9784c f26577a;

    /* renamed from: d */
    private final Request f26578d;

    /* renamed from: e */
    private final Random f26579e;

    /* renamed from: f */
    private final String f26580f;

    /* renamed from: g */
    private final Runnable f26581g;

    /* renamed from: h */
    private final ArrayDeque<ByteString> f26582h = new ArrayDeque<>();

    /* renamed from: i */
    private final ArrayDeque<Object> f26583i = new ArrayDeque<>();

    /* renamed from: j */
    private final long f26584j;

    /* renamed from: k */
    private Call f26585k;

    /* renamed from: l */
    private C9786e f26586l;

    /* renamed from: m */
    private C9788f f26587m;

    /* renamed from: n */
    private ScheduledExecutorService f26588n;

    /* renamed from: o */
    private Streams f26589o;

    /* renamed from: p */
    private long f26590p;

    /* renamed from: q */
    private boolean f26591q;

    /* renamed from: r */
    private ScheduledFuture<?> f26592r;

    /* renamed from: s */
    private int f26593s = -1;

    /* renamed from: t */
    private String f26594t;

    /* renamed from: u */
    private boolean f26595u;

    /* renamed from: v */
    private int f26596v;

    /* renamed from: w */
    private int f26597w;

    /* renamed from: x */
    private int f26598x;

    /* renamed from: y */
    private boolean f26599y;

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$a */
    final class C9780a implements Runnable {
        public final void run() {
            C9777a.this.cancel();
        }

        C9780a() {
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$b */
    static final class C9781b {

        /* renamed from: a */
        final int f26604a;

        /* renamed from: b */
        final ByteString f26605b;

        /* renamed from: c */
        final long f26606c;

        C9781b(int i, ByteString byteString, long j) {
            this.f26604a = i;
            this.f26605b = byteString;
            this.f26606c = j;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$c */
    static final class C9782c {

        /* renamed from: a */
        final int f26607a;

        /* renamed from: b */
        final ByteString f26608b;

        C9782c(int i, ByteString byteString) {
            this.f26607a = i;
            this.f26608b = byteString;
        }
    }

    public Request request() {
        return this.f26578d;
    }

    /* renamed from: a */
    public final void mo24206a(OkHttpClient okHttpClient) {
        final Request build = this.f26578d.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.f26580f).header("Sec-WebSocket-Version", "13").build();
        this.f26585k = Internal.instance.newWebSocketCall(okHttpClient, build);
        this.f26585k.enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                C9777a.this.mo24203a((Exception) iOException, (Response) null);
            }

            public final void onResponse(Call call, Response response) {
                try {
                    C9777a.this.mo24207a(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        if (C9777a.this.f26577a != null) {
                            C9777a.this.f26577a.mo24219a((C9783b) C9777a.this, response);
                        }
                        StringBuilder sb = new StringBuilder("OkHttp WebSocket ");
                        sb.append(build.url.redact());
                        C9777a.this.mo24205a(sb.toString(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        C9777a.this.mo24201a();
                    } catch (Exception e) {
                        C9777a.this.mo24203a(e, (Response) null);
                    }
                } catch (ProtocolException e2) {
                    C9777a.this.mo24203a((Exception) e2, response);
                    Util.closeQuietly((Closeable) response);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24207a(Response response) throws ProtocolException {
        if (response.code == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f26580f);
                    sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    String base64 = ByteString.encodeUtf8(sb.toString()).sha1().base64();
                    if (!base64.equals(header3)) {
                        StringBuilder sb2 = new StringBuilder("Expected 'Sec-WebSocket-Accept' header value '");
                        sb2.append(base64);
                        sb2.append("' but was '");
                        sb2.append(header3);
                        sb2.append("'");
                        throw new ProtocolException(sb2.toString());
                    }
                    return;
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

    /* renamed from: a */
    public final void mo24208a(ByteString byteString) throws IOException {
        if (this.f26577a != null) {
            this.f26577a.mo24220a((C9783b) this, byteString);
        }
    }

    public void cancel() {
        this.f26585k.cancel();
    }

    public synchronized long queueSize() {
        return this.f26590p;
    }

    /* renamed from: c */
    private void m28823c() {
        if (!f26575b && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (this.f26588n != null) {
            this.f26588n.execute(this.f26581g);
        }
    }

    /* renamed from: a */
    public final void mo24201a() throws IOException {
        while (this.f26593s == -1) {
            this.f26586l.mo24223a();
        }
    }

    /* JADX INFO: used method not loaded: com.bytedance.common.wschannel.channel.a.a.b.f.a(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.common.wschannel.channel.a.a.b.f.a(int, okio.ByteString):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r2 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.mo24228b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if ((r4 instanceof com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9782c) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r1 = ((com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9782c) r4).f26608b;
        r0 = okio.Okio.buffer(r0.mo24224a(((com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9782c) r4).f26607a, (long) r1.size()));
        r0.write(r1);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r11.f26590p -= (long) r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        if ((r4 instanceof com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9781b) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
        r4 = (com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9781b) r4;
        r0.mo24226a(r4.f26604a, r4.f26605b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r3 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r11.f26577a == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r11.f26577a.mo24221b(r11, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        okhttp3.internal.Util.closeQuietly(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a9, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
        okhttp3.internal.Util.closeQuietly(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ad, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24211b() throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f26595u     // Catch:{ all -> 0x00ae }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r11)     // Catch:{ all -> 0x00ae }
            return r1
        L_0x0008:
            com.bytedance.common.wschannel.channel.a.a.b.f r0 = r11.f26587m     // Catch:{ all -> 0x00ae }
            java.util.ArrayDeque<okio.ByteString> r2 = r11.f26582h     // Catch:{ all -> 0x00ae }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00ae }
            okio.ByteString r2 = (okio.ByteString) r2     // Catch:{ all -> 0x00ae }
            r3 = 0
            if (r2 != 0) goto L_0x004c
            java.util.ArrayDeque<java.lang.Object> r4 = r11.f26583i     // Catch:{ all -> 0x00ae }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00ae }
            boolean r5 = r4 instanceof com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9781b     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x0046
            int r1 = r11.f26593s     // Catch:{ all -> 0x00ae }
            java.lang.String r5 = r11.f26594t     // Catch:{ all -> 0x00ae }
            r6 = -1
            if (r1 == r6) goto L_0x0031
            okhttp3.internal.ws.RealWebSocket$Streams r6 = r11.f26589o     // Catch:{ all -> 0x00ae }
            r11.f26589o = r3     // Catch:{ all -> 0x00ae }
            java.util.concurrent.ScheduledExecutorService r3 = r11.f26588n     // Catch:{ all -> 0x00ae }
            r3.shutdown()     // Catch:{ all -> 0x00ae }
            r3 = r6
            goto L_0x004e
        L_0x0031:
            java.util.concurrent.ScheduledExecutorService r6 = r11.f26588n     // Catch:{ all -> 0x00ae }
            com.bytedance.common.wschannel.channel.a.a.b.a$a r7 = new com.bytedance.common.wschannel.channel.a.a.b.a$a     // Catch:{ all -> 0x00ae }
            r7.<init>()     // Catch:{ all -> 0x00ae }
            r8 = r4
            com.bytedance.common.wschannel.channel.a.a.b.a$b r8 = (com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9781b) r8     // Catch:{ all -> 0x00ae }
            long r8 = r8.f26606c     // Catch:{ all -> 0x00ae }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00ae }
            java.util.concurrent.ScheduledFuture r6 = r6.schedule(r7, r8, r10)     // Catch:{ all -> 0x00ae }
            r11.f26592r = r6     // Catch:{ all -> 0x00ae }
            goto L_0x004e
        L_0x0046:
            if (r4 != 0) goto L_0x004a
            monitor-exit(r11)     // Catch:{ all -> 0x00ae }
            return r1
        L_0x004a:
            r5 = r3
            goto L_0x004e
        L_0x004c:
            r4 = r3
            r5 = r4
        L_0x004e:
            monitor-exit(r11)     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x0057
            r0.mo24228b(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x009f
        L_0x0055:
            r0 = move-exception
            goto L_0x00aa
        L_0x0057:
            boolean r2 = r4 instanceof com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9782c     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0087
            r1 = r4
            com.bytedance.common.wschannel.channel.a.a.b.a$c r1 = (com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9782c) r1     // Catch:{ all -> 0x0055 }
            okio.ByteString r1 = r1.f26608b     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.channel.a.a.b.a$c r4 = (com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9782c) r4     // Catch:{ all -> 0x0055 }
            int r2 = r4.f26607a     // Catch:{ all -> 0x0055 }
            int r4 = r1.size()     // Catch:{ all -> 0x0055 }
            long r4 = (long) r4     // Catch:{ all -> 0x0055 }
            okio.Sink r0 = r0.mo24224a(r2, r4)     // Catch:{ all -> 0x0055 }
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch:{ all -> 0x0055 }
            r0.write(r1)     // Catch:{ all -> 0x0055 }
            r0.close()     // Catch:{ all -> 0x0055 }
            monitor-enter(r11)     // Catch:{ all -> 0x0055 }
            long r4 = r11.f26590p     // Catch:{ all -> 0x0084 }
            int r0 = r1.size()     // Catch:{ all -> 0x0084 }
            long r0 = (long) r0     // Catch:{ all -> 0x0084 }
            long r4 = r4 - r0
            r11.f26590p = r4     // Catch:{ all -> 0x0084 }
            monitor-exit(r11)     // Catch:{ all -> 0x0084 }
            goto L_0x009f
        L_0x0084:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0087:
            boolean r2 = r4 instanceof com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9781b     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x00a4
            com.bytedance.common.wschannel.channel.a.a.b.a$b r4 = (com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.C9781b) r4     // Catch:{ all -> 0x0055 }
            int r2 = r4.f26604a     // Catch:{ all -> 0x0055 }
            okio.ByteString r4 = r4.f26605b     // Catch:{ all -> 0x0055 }
            r0.mo24226a(r2, r4)     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x009f
            com.bytedance.common.wschannel.channel.a.a.b.c r0 = r11.f26577a     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x009f
            com.bytedance.common.wschannel.channel.a.a.b.c r0 = r11.f26577a     // Catch:{ all -> 0x0055 }
            r0.mo24221b(r11, r1, r5)     // Catch:{ all -> 0x0055 }
        L_0x009f:
            okhttp3.internal.Util.closeQuietly(r3)
            r0 = 1
            return r0
        L_0x00a4:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0055 }
            r0.<init>()     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x00aa:
            okhttp3.internal.Util.closeQuietly(r3)
            throw r0
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00ae }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.mo24211b():boolean");
    }

    /* renamed from: d */
    public final void mo24213d(ByteString byteString) {
        if (byteString == null) {
            byteString = ByteString.EMPTY;
        }
        m28824e(byteString);
    }

    public boolean send(ByteString byteString) {
        if (byteString != null) {
            return m28822a(byteString, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    public boolean send(String str) {
        if (str != null) {
            return m28822a(ByteString.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        mo24203a((java.lang.Exception) new java.net.SocketTimeoutException("sent ping but didn't receive pong"), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.mo24227a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        mo24203a((java.lang.Exception) r6, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28824e(okio.ByteString r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f26595u     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            return
        L_0x0007:
            com.bytedance.common.wschannel.channel.a.a.b.f r0 = r5.f26587m     // Catch:{ all -> 0x0032 }
            boolean r1 = r5.f26599y     // Catch:{ all -> 0x0032 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r5.f26596v     // Catch:{ all -> 0x0032 }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r5.f26596v     // Catch:{ all -> 0x0032 }
            r4 = 1
            int r3 = r3 + r4
            r5.f26596v = r3     // Catch:{ all -> 0x0032 }
            r5.f26599y = r4     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            r3 = 0
            if (r1 == r2) goto L_0x0029
            java.net.SocketTimeoutException r6 = new java.net.SocketTimeoutException
            java.lang.String r0 = "sent ping but didn't receive pong"
            r6.<init>(r0)
            r5.mo24203a(r6, r3)
            return
        L_0x0029:
            r0.mo24227a(r6)     // Catch:{ IOException -> 0x002d }
            return
        L_0x002d:
            r6 = move-exception
            r5.mo24203a(r6, r3)
            return
        L_0x0032:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.m28824e(okio.ByteString):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24210b(okio.ByteString r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f26595u     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.f26591q     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.f26583i     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.f26582h     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.m28823c()     // Catch:{ all -> 0x0024 }
            int r2 = r1.f26597w     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.f26597w = r2     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.mo24210b(okio.ByteString):void");
    }

    /* renamed from: c */
    public final synchronized void mo24212c(ByteString byteString) {
        this.f26598x++;
        this.f26599y = false;
        if (this.f26577a != null) {
            this.f26577a.mo24222b(this, byteString);
        }
    }

    /* renamed from: a */
    public final void mo24204a(String str) throws IOException {
        if (this.f26577a != null) {
            this.f26577a.mo24217a((C9783b) this, str);
        }
    }

    public boolean close(int i, String str) {
        return m28821a(i, str, 60000);
    }

    /* renamed from: b */
    public final void mo24209b(int i, String str) {
        this.f26577a = null;
        try {
            close(1000, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: used method not loaded: com.bytedance.common.wschannel.channel.a.a.b.c.a(com.bytedance.common.wschannel.channel.a.a.b.b, java.lang.Throwable, okhttp3.Response):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r3.f26577a == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r3.f26577a.mo24218a((com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9783b) r3, (java.lang.Throwable) r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24203a(java.lang.Exception r4, okhttp3.Response r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f26595u     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0007:
            r0 = 1
            r3.f26595u = r0     // Catch:{ all -> 0x0035 }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.f26589o     // Catch:{ all -> 0x0035 }
            r1 = 0
            r3.f26589o = r1     // Catch:{ all -> 0x0035 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f26592r     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0019
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f26592r     // Catch:{ all -> 0x0035 }
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0035 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.f26588n     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.ScheduledExecutorService r1 = r3.f26588n     // Catch:{ all -> 0x0035 }
            r1.shutdown()     // Catch:{ all -> 0x0035 }
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            com.bytedance.common.wschannel.channel.a.a.b.c r1 = r3.f26577a     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002c
            com.bytedance.common.wschannel.channel.a.a.b.c r1 = r3.f26577a     // Catch:{ all -> 0x0030 }
            r1.mo24218a(r3, r4, r5)     // Catch:{ all -> 0x0030 }
        L_0x002c:
            okhttp3.internal.Util.closeQuietly(r0)
            return
        L_0x0030:
            r4 = move-exception
            okhttp3.internal.Util.closeQuietly(r0)
            throw r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.mo24203a(java.lang.Exception, okhttp3.Response):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m28822a(okio.ByteString r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f26595u     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.f26591q     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.f26590p     // Catch:{ all -> 0x003e }
            int r0 = r7.size()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.f26590p     // Catch:{ all -> 0x003e }
            int r2 = r7.size()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.f26590p = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.f26583i     // Catch:{ all -> 0x003e }
            com.bytedance.common.wschannel.channel.a.a.b.a$c r1 = new com.bytedance.common.wschannel.channel.a.a.b.a$c     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.m28823c()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p486a.p487a.p489b.C9777a.m28822a(okio.ByteString, int):boolean");
    }

    /* renamed from: a */
    public final void mo24202a(int i, String str) {
        Closeable closeable;
        if (i != -1) {
            synchronized (this) {
                if (this.f26593s == -1) {
                    this.f26593s = i;
                    this.f26594t = str;
                    if (!this.f26591q || !this.f26583i.isEmpty()) {
                        closeable = null;
                    } else {
                        closeable = this.f26589o;
                        this.f26589o = null;
                        if (this.f26592r != null) {
                            this.f26592r.cancel(false);
                        }
                        this.f26588n.shutdown();
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                if (this.f26577a != null) {
                    this.f26577a.mo24216a((C9783b) this, i, str);
                    if (closeable != null) {
                        this.f26577a.mo24221b(this, i, str);
                    }
                }
            } finally {
                Util.closeQuietly(closeable);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final void mo24205a(String str, Streams streams) throws IOException {
        synchronized (this) {
            this.f26589o = streams;
            this.f26587m = new C9788f(streams.client, streams.sink, this.f26579e);
            this.f26588n = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            if (!this.f26583i.isEmpty()) {
                m28823c();
            }
        }
        C9786e eVar = new C9786e(streams.client, streams.source, this, this.f26584j);
        this.f26586l = eVar;
    }

    /* renamed from: a */
    public static C9777a m28820a(Request request, long j, C9784c cVar) {
        C9777a aVar = new C9777a(request, j, cVar, new Random());
        return aVar;
    }

    /* renamed from: a */
    private synchronized boolean m28821a(int i, String str, long j) {
        C9785d.m28848b(i);
        ByteString byteString = null;
        if (str != null) {
            byteString = ByteString.encodeUtf8(str);
            if (((long) byteString.size()) > 123) {
                StringBuilder sb = new StringBuilder("reason.size() > 123: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (!this.f26595u) {
            if (!this.f26591q) {
                this.f26591q = true;
                this.f26583i.add(new C9781b(i, byteString, 60000));
                m28823c();
                return true;
            }
        }
        return false;
    }

    private C9777a(Request request, long j, C9784c cVar, Random random) {
        if ("GET".equals(request.method)) {
            this.f26578d = request;
            this.f26577a = cVar;
            this.f26579e = random;
            this.f26584j = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f26580f = ByteString.m23795of(bArr).base64();
            this.f26581g = new Runnable() {
                public final void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            C9777a.this.mo24203a((Exception) e, (Response) null);
                            return;
                        }
                    } while (C9777a.this.mo24211b());
                }
            };
            return;
        }
        StringBuilder sb = new StringBuilder("Request must be GET: ");
        sb.append(request.method);
        throw new IllegalArgumentException(sb.toString());
    }
}
