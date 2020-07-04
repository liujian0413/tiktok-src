package retrofit2;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* renamed from: retrofit2.h */
final class C48489h<T> implements C48475b<T> {

    /* renamed from: a */
    private final C48520n<T, ?> f123609a;

    /* renamed from: b */
    private final Object[] f123610b;

    /* renamed from: c */
    private volatile boolean f123611c;

    /* renamed from: d */
    private Call f123612d;

    /* renamed from: e */
    private Throwable f123613e;

    /* renamed from: f */
    private boolean f123614f;

    /* renamed from: retrofit2.h$a */
    static final class C48491a extends ResponseBody {

        /* renamed from: a */
        IOException f123617a;

        /* renamed from: b */
        private final ResponseBody f123618b;

        public final void close() {
            this.f123618b.close();
        }

        public final long contentLength() {
            return this.f123618b.contentLength();
        }

        public final MediaType contentType() {
            return this.f123618b.contentType();
        }

        public final BufferedSource source() {
            return Okio.buffer((Source) new ForwardingSource(this.f123618b.source()) {
                public final long read(Buffer buffer, long j) throws IOException {
                    try {
                        return super.read(buffer, j);
                    } catch (IOException e) {
                        C48491a.this.f123617a = e;
                        throw e;
                    }
                }
            });
        }

        C48491a(ResponseBody responseBody) {
            this.f123618b = responseBody;
        }
    }

    /* renamed from: retrofit2.h$b */
    static final class C48493b extends ResponseBody {

        /* renamed from: a */
        private final MediaType f123620a;

        /* renamed from: b */
        private final long f123621b;

        public final long contentLength() {
            return this.f123621b;
        }

        public final MediaType contentType() {
            return this.f123620a;
        }

        public final BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        C48493b(MediaType mediaType, long j) {
            this.f123620a = mediaType;
            this.f123621b = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C48489h<T> clone() {
        return new C48489h<>(this.f123609a, this.f123610b);
    }

    /* renamed from: e */
    private Call m150210e() throws IOException {
        Call newCall = this.f123609a.f123685c.newCall(this.f123609a.mo123325a(this.f123610b));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: b */
    public final boolean mo123284b() {
        boolean z = true;
        if (this.f123611c) {
            return true;
        }
        synchronized (this) {
            if (this.f123612d == null || !this.f123612d.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final C48516l<T> mo123282a() throws IOException {
        Call call;
        synchronized (this) {
            if (!this.f123614f) {
                this.f123614f = true;
                if (this.f123613e == null) {
                    call = this.f123612d;
                    if (call == null) {
                        try {
                            call = m150210e();
                            this.f123612d = call;
                        } catch (IOException | RuntimeException e) {
                            this.f123613e = e;
                            throw e;
                        }
                    }
                } else if (this.f123613e instanceof IOException) {
                    throw ((IOException) this.f123613e);
                } else {
                    throw ((RuntimeException) this.f123613e);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f123611c) {
            call.cancel();
        }
        return mo123289a(call.execute());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C48516l<T> mo123289a(Response response) throws IOException {
        ResponseBody responseBody = response.body;
        Response build = response.newBuilder().body(new C48493b(responseBody.contentType(), responseBody.contentLength())).build();
        int i = build.code;
        if (i < 200 || i >= 300) {
            try {
                return C48516l.m150263a(C48522o.m150311a(responseBody), build);
            } finally {
                responseBody.close();
            }
        } else if (i == 204 || i == 205) {
            responseBody.close();
            return C48516l.m150262a(null, build);
        } else {
            try {
                return C48516l.m150262a(this.f123609a.mo123324a((ResponseBody) new C48491a(responseBody)), build);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    /* renamed from: a */
    public final void mo123283a(final C48478d<T> dVar) {
        Call call;
        Throwable th;
        C48522o.m150306a(dVar, "callback == null");
        synchronized (this) {
            if (!this.f123614f) {
                this.f123614f = true;
                call = this.f123612d;
                th = this.f123613e;
                if (call == null && th == null) {
                    try {
                        Call e = m150210e();
                        this.f123612d = e;
                        call = e;
                    } catch (Throwable th2) {
                        th = th2;
                        this.f123613e = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.mo48914a((C48475b<T>) this, th);
            return;
        }
        if (this.f123611c) {
            call.cancel();
        }
        call.enqueue(new Callback() {
            /* renamed from: a */
            private void m150216a(Throwable th) {
                try {
                    dVar.mo48914a((C48475b<T>) C48489h.this, th);
                } catch (Throwable unused) {
                }
            }

            /* renamed from: a */
            private void m150217a(C48516l<T> lVar) {
                try {
                    dVar.mo48915a((C48475b<T>) C48489h.this, lVar);
                } catch (Throwable unused) {
                }
            }

            public final void onFailure(Call call, IOException iOException) {
                try {
                    dVar.mo48914a((C48475b<T>) C48489h.this, (Throwable) iOException);
                } catch (Throwable unused) {
                }
            }

            public final void onResponse(Call call, Response response) throws IOException {
                try {
                    m150217a(C48489h.this.mo123289a(response));
                } catch (Throwable th) {
                    m150216a(th);
                }
            }
        });
    }

    C48489h(C48520n<T, ?> nVar, Object[] objArr) {
        this.f123609a = nVar;
        this.f123610b = objArr;
    }
}
