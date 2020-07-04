package com.p280ss.android.websocket.p1779a.p1780a;

import com.p280ss.android.websocket.p1779a.C45405a;
import com.p280ss.android.websocket.p1779a.C45421c;
import com.p280ss.android.websocket.p1779a.p1780a.C45411c.C45413a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.NamedRunnable;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* renamed from: com.ss.android.websocket.a.a.a */
public abstract class C45406a implements C45405a {

    /* renamed from: c */
    public final C45415d f116920c;

    /* renamed from: d */
    public boolean f116921d;

    /* renamed from: e */
    private final C45411c f116922e;

    /* renamed from: f */
    private final C45421c f116923f;

    /* renamed from: g */
    private volatile boolean f116924g;

    /* renamed from: h */
    private boolean f116925h;

    /* renamed from: i */
    private final AtomicBoolean f116926i = new AtomicBoolean();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo108756a() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo108757a(IOException iOException);

    /* renamed from: b */
    public final boolean mo108759b() {
        boolean z = false;
        try {
            this.f116922e.mo108764a();
            if (!this.f116921d) {
                z = true;
            }
            return z;
        } catch (IOException e) {
            m143592b(e);
            return false;
        }
    }

    /* renamed from: b */
    private void m143592b(IOException iOException) {
        if (!this.f116924g && (iOException instanceof ProtocolException)) {
            try {
                this.f116920c.mo108768a(1002, (String) null);
            } catch (IOException unused) {
            }
        }
        if (this.f116926i.compareAndSet(false, true)) {
            mo108757a(iOException);
        }
        this.f116923f.mo108775a(iOException, (Response) null);
    }

    /* renamed from: a */
    public final void mo108755a(Buffer buffer) throws IOException {
        if (this.f116924g) {
            throw new IllegalStateException("closed");
        } else if (!this.f116925h) {
            try {
                this.f116920c.mo108769a(buffer);
            } catch (IOException e) {
                this.f116925h = true;
                throw e;
            }
        } else {
            throw new IllegalStateException("must call close()");
        }
    }

    /* renamed from: a */
    public final void mo108754a(RequestBody requestBody) throws IOException {
        int i;
        if (requestBody == null) {
            throw new NullPointerException("message == null");
        } else if (this.f116924g) {
            throw new IllegalStateException("closed");
        } else if (!this.f116925h) {
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                String str = contentType.subtype;
                if (C45405a.f116918a.subtype.equals(str)) {
                    i = 1;
                } else if (C45405a.f116919b.subtype.equals(str)) {
                    i = 2;
                } else {
                    StringBuilder sb = new StringBuilder("Unknown message content type: ");
                    sb.append(contentType.type);
                    sb.append("/");
                    sb.append(contentType.subtype);
                    sb.append(". Must use WebSocket.TEXT or WebSocket.BINARY.");
                    throw new IllegalArgumentException(sb.toString());
                }
                BufferedSink buffer = Okio.buffer(this.f116920c.mo108766a(i, requestBody.contentLength()));
                try {
                    requestBody.writeTo(buffer);
                    buffer.close();
                } catch (IOException e) {
                    this.f116925h = true;
                    throw e;
                }
            } else {
                throw new IllegalArgumentException("Message content type was null. Must use WebSocket.TEXT or WebSocket.BINARY.");
            }
        } else {
            throw new IllegalStateException("must call close()");
        }
    }

    /* renamed from: b */
    public final void mo108758b(int i, String str) {
        if (!this.f116924g) {
            try {
                this.f116920c.mo108768a(i, str);
            } catch (IOException unused) {
            }
        }
        if (this.f116926i.compareAndSet(false, true)) {
            try {
                mo108756a();
            } catch (IOException unused2) {
            }
        }
        this.f116923f.mo108773a(i, str);
    }

    /* renamed from: a */
    public final void mo108753a(int i, String str) throws IOException {
        if (!this.f116924g) {
            this.f116924g = true;
            try {
                this.f116920c.mo108768a(1000, str);
            } catch (IOException e) {
                if (this.f116926i.compareAndSet(false, true)) {
                    mo108757a(e);
                }
                throw e;
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public C45406a(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, Random random, final Executor executor, final C45421c cVar, final String str) {
        this.f116923f = cVar;
        this.f116920c = new C45415d(true, bufferedSink, random);
        this.f116922e = new C45411c(true, bufferedSource, new C45413a() {
            /* renamed from: a */
            public final void mo108761a(ResponseBody responseBody) throws IOException {
                cVar.mo108776a(responseBody);
            }

            /* renamed from: b */
            public final void mo108763b(Buffer buffer) {
                cVar.mo108777a(buffer);
            }

            /* renamed from: a */
            public final void mo108762a(final Buffer buffer) {
                executor.execute(new NamedRunnable("OkHttp %s WebSocket Pong Reply", new Object[]{str}) {
                    public final void execute() {
                        try {
                            C45406a.this.f116920c.mo108770b(buffer);
                        } catch (IOException unused) {
                        }
                    }
                });
            }

            /* renamed from: a */
            public final void mo108760a(int i, String str) {
                C45406a.this.f116921d = true;
                Executor executor = executor;
                final int i2 = i;
                final String str2 = str;
                C454092 r2 = new NamedRunnable("OkHttp %s WebSocket Close Reply", new Object[]{str}) {
                    public final void execute() {
                        C45406a.this.mo108758b(i2, str2);
                    }
                };
                executor.execute(r2);
            }
        });
    }
}
