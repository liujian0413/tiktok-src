package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C15267r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.y */
final class C17079y<TResult> extends C17057f<TResult> {

    /* renamed from: a */
    private final Object f47765a = new Object();

    /* renamed from: b */
    private final C17077w<TResult> f47766b = new C17077w<>();

    /* renamed from: c */
    private boolean f47767c;

    /* renamed from: d */
    private volatile boolean f47768d;

    /* renamed from: e */
    private TResult f47769e;

    /* renamed from: f */
    private Exception f47770f;

    C17079y() {
    }

    /* renamed from: a */
    public final boolean mo44292a() {
        boolean z;
        synchronized (this.f47765a) {
            z = this.f47767c;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo44295c() {
        return this.f47768d;
    }

    /* renamed from: b */
    public final boolean mo44294b() {
        boolean z;
        synchronized (this.f47765a) {
            z = this.f47767c && !this.f47768d && this.f47770f == null;
        }
        return z;
    }

    /* renamed from: d */
    public final TResult mo44296d() {
        TResult tresult;
        synchronized (this.f47765a) {
            m56631g();
            m56633i();
            if (this.f47770f == null) {
                tresult = this.f47769e;
            } else {
                throw new RuntimeExecutionException(this.f47770f);
            }
        }
        return tresult;
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo44291a(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f47765a) {
            m56631g();
            m56633i();
            if (cls.isInstance(this.f47770f)) {
                throw ((Throwable) cls.cast(this.f47770f));
            } else if (this.f47770f == null) {
                tresult = this.f47769e;
            } else {
                throw new RuntimeExecutionException(this.f47770f);
            }
        }
        return tresult;
    }

    /* renamed from: e */
    public final Exception mo44297e() {
        Exception exc;
        synchronized (this.f47765a) {
            exc = this.f47770f;
        }
        return exc;
    }

    /* renamed from: a */
    public final C17057f<TResult> mo44290a(Executor executor, C17056e<? super TResult> eVar) {
        this.f47766b.mo44313a((C17076v<TResult>) new C17074t<TResult>(executor, eVar));
        m56634j();
        return this;
    }

    /* renamed from: a */
    public final C17057f<TResult> mo44289a(Executor executor, C17055d dVar) {
        this.f47766b.mo44313a((C17076v<TResult>) new C17072r<TResult>(executor, dVar));
        m56634j();
        return this;
    }

    /* renamed from: a */
    public final C17057f<TResult> mo44285a(C17054c<TResult> cVar) {
        return mo44288a(C17059h.f47729a, cVar);
    }

    /* renamed from: a */
    public final C17057f<TResult> mo44288a(Executor executor, C17054c<TResult> cVar) {
        this.f47766b.mo44313a((C17076v<TResult>) new C17070p<TResult>(executor, cVar));
        m56634j();
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C17057f<TContinuationResult> mo44286a(Executor executor, C17052a<TResult, TContinuationResult> aVar) {
        C17079y yVar = new C17079y();
        this.f47766b.mo44313a((C17076v<TResult>) new C17064j<TResult>(executor, aVar, yVar));
        m56634j();
        return yVar;
    }

    /* renamed from: a */
    public final C17057f<TResult> mo44287a(Executor executor, C17053b bVar) {
        this.f47766b.mo44313a((C17076v<TResult>) new C17068n<TResult>(executor, bVar));
        m56634j();
        return this;
    }

    /* renamed from: b */
    public final <TContinuationResult> C17057f<TContinuationResult> mo44293b(Executor executor, C17052a<TResult, C17057f<TContinuationResult>> aVar) {
        C17079y yVar = new C17079y();
        this.f47766b.mo44313a((C17076v<TResult>) new C17066l<TResult>(executor, aVar, yVar));
        m56634j();
        return yVar;
    }

    /* renamed from: a */
    public final void mo44316a(TResult tresult) {
        synchronized (this.f47765a) {
            m56632h();
            this.f47767c = true;
            this.f47769e = tresult;
        }
        this.f47766b.mo44312a((C17057f<TResult>) this);
    }

    /* renamed from: b */
    public final boolean mo44318b(TResult tresult) {
        synchronized (this.f47765a) {
            if (this.f47767c) {
                return false;
            }
            this.f47767c = true;
            this.f47769e = tresult;
            this.f47766b.mo44312a((C17057f<TResult>) this);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo44315a(Exception exc) {
        C15267r.m44385a(exc, (Object) "Exception must not be null");
        synchronized (this.f47765a) {
            m56632h();
            this.f47767c = true;
            this.f47770f = exc;
        }
        this.f47766b.mo44312a((C17057f<TResult>) this);
    }

    /* renamed from: b */
    public final boolean mo44317b(Exception exc) {
        C15267r.m44385a(exc, (Object) "Exception must not be null");
        synchronized (this.f47765a) {
            if (this.f47767c) {
                return false;
            }
            this.f47767c = true;
            this.f47770f = exc;
            this.f47766b.mo44312a((C17057f<TResult>) this);
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo44319f() {
        synchronized (this.f47765a) {
            if (this.f47767c) {
                return false;
            }
            this.f47767c = true;
            this.f47768d = true;
            this.f47766b.mo44312a((C17057f<TResult>) this);
            return true;
        }
    }

    /* renamed from: g */
    private final void m56631g() {
        C15267r.m44391a(this.f47767c, (Object) "Task is not yet complete");
    }

    /* renamed from: h */
    private final void m56632h() {
        C15267r.m44391a(!this.f47767c, (Object) "Task is already complete");
    }

    /* renamed from: i */
    private final void m56633i() {
        if (this.f47768d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m56634j() {
        synchronized (this.f47765a) {
            if (this.f47767c) {
                this.f47766b.mo44312a((C17057f<TResult>) this);
            }
        }
    }
}
