package com.google.android.play.core.tasks;

import com.google.android.play.core.internal.C6512ad;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.n */
final class C17159n<TResult> extends C17147c<TResult> {

    /* renamed from: a */
    private final Object f47888a = new Object();

    /* renamed from: b */
    private final C17155j<TResult> f47889b = new C17155j<>();

    /* renamed from: c */
    private boolean f47890c;

    /* renamed from: d */
    private TResult f47891d;

    /* renamed from: e */
    private Exception f47892e;

    C17159n() {
    }

    /* renamed from: a */
    private C17147c<TResult> m56848a(Executor executor, C17145a aVar) {
        this.f47889b.mo44427a((C17156k<TResult>) new C17152g<TResult>(executor, aVar));
        m56852g();
        return this;
    }

    /* renamed from: a */
    private C17147c<TResult> m56849a(Executor executor, C17146b<? super TResult> bVar) {
        this.f47889b.mo44427a((C17156k<TResult>) new C17153h<TResult>(executor, bVar));
        m56852g();
        return this;
    }

    /* renamed from: e */
    private final void m56850e() {
        C6512ad.m20226a(this.f47890c, (Object) "Task is not yet complete");
    }

    /* renamed from: f */
    private final void m56851f() {
        C6512ad.m20226a(!this.f47890c, (Object) "Task is already complete");
    }

    /* renamed from: g */
    private final void m56852g() {
        synchronized (this.f47888a) {
            if (this.f47890c) {
                this.f47889b.mo44426a((C17147c<TResult>) this);
            }
        }
    }

    /* renamed from: a */
    public final C17147c<TResult> mo44416a(C17145a aVar) {
        return m56848a(C17148d.f47871a, aVar);
    }

    /* renamed from: a */
    public final C17147c<TResult> mo44417a(C17146b<? super TResult> bVar) {
        return m56849a(C17148d.f47871a, bVar);
    }

    /* renamed from: a */
    public final void mo44431a(Exception exc) {
        C6512ad.m20220a(exc, (Object) "Exception must not be null");
        synchronized (this.f47888a) {
            m56851f();
            this.f47890c = true;
            this.f47892e = exc;
        }
        this.f47889b.mo44426a((C17147c<TResult>) this);
    }

    /* renamed from: a */
    public final void mo44432a(TResult tresult) {
        synchronized (this.f47888a) {
            m56851f();
            this.f47890c = true;
            this.f47891d = tresult;
        }
        this.f47889b.mo44426a((C17147c<TResult>) this);
    }

    /* renamed from: a */
    public final boolean mo44418a() {
        boolean z;
        synchronized (this.f47888a) {
            z = this.f47890c;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo44419b() {
        boolean z;
        synchronized (this.f47888a) {
            z = this.f47890c && this.f47892e == null;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo44433b(Exception exc) {
        C6512ad.m20220a(exc, (Object) "Exception must not be null");
        synchronized (this.f47888a) {
            if (this.f47890c) {
                return false;
            }
            this.f47890c = true;
            this.f47892e = exc;
            this.f47889b.mo44426a((C17147c<TResult>) this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo44434b(TResult tresult) {
        synchronized (this.f47888a) {
            if (this.f47890c) {
                return false;
            }
            this.f47890c = true;
            this.f47891d = tresult;
            this.f47889b.mo44426a((C17147c<TResult>) this);
            return true;
        }
    }

    /* renamed from: c */
    public final TResult mo44420c() {
        TResult tresult;
        synchronized (this.f47888a) {
            m56850e();
            if (this.f47892e == null) {
                tresult = this.f47891d;
            } else {
                throw new RuntimeExecutionException(this.f47892e);
            }
        }
        return tresult;
    }

    /* renamed from: d */
    public final Exception mo44421d() {
        Exception exc;
        synchronized (this.f47888a) {
            exc = this.f47892e;
        }
        return exc;
    }
}
