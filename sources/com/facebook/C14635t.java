package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphRequest.C13092d;

/* renamed from: com.facebook.t */
final class C14635t {

    /* renamed from: a */
    public long f37770a;

    /* renamed from: b */
    public long f37771b;

    /* renamed from: c */
    private final GraphRequest f37772c;

    /* renamed from: d */
    private final Handler f37773d;

    /* renamed from: e */
    private final long f37774e = C13499h.m39724j();

    /* renamed from: f */
    private long f37775f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36869a() {
        if (this.f37770a > this.f37775f) {
            C13090b bVar = this.f37772c.f34681k;
            if (this.f37771b > 0 && (bVar instanceof C13092d)) {
                final long j = this.f37770a;
                final long j2 = this.f37771b;
                final C13092d dVar = (C13092d) bVar;
                if (this.f37773d != null) {
                    Handler handler = this.f37773d;
                    C146361 r2 = new Runnable() {
                        public final void run() {
                        }
                    };
                    handler.post(r2);
                }
                this.f37775f = this.f37770a;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo36871b(long j) {
        this.f37771b += j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36870a(long j) {
        this.f37770a += j;
        if (this.f37770a >= this.f37775f + this.f37774e || this.f37770a >= this.f37771b) {
            mo36869a();
        }
    }

    C14635t(Handler handler, GraphRequest graphRequest) {
        this.f37772c = graphRequest;
        this.f37773d = handler;
    }
}
