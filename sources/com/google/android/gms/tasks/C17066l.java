package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.l */
final class C17066l<TResult, TContinuationResult> implements C17053b, C17055d, C17056e<TContinuationResult>, C17076v<TResult> {

    /* renamed from: a */
    private final Executor f47738a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C17052a<TResult, C17057f<TContinuationResult>> f47739b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C17079y<TContinuationResult> f47740c;

    public C17066l(Executor executor, C17052a<TResult, C17057f<TContinuationResult>> aVar, C17079y<TContinuationResult> yVar) {
        this.f47738a = executor;
        this.f47739b = aVar;
        this.f47740c = yVar;
    }

    /* renamed from: a */
    public final void mo44305a(C17057f<TResult> fVar) {
        this.f47738a.execute(new C17067m(this, fVar));
    }

    /* renamed from: a */
    public final void mo44284a(TContinuationResult tcontinuationresult) {
        this.f47740c.mo44316a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo44283a(Exception exc) {
        this.f47740c.mo44315a(exc);
    }

    /* renamed from: a */
    public final void mo44282a() {
        this.f47740c.mo44319f();
    }
}
