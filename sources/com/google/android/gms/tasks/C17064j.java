package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.j */
final class C17064j<TResult, TContinuationResult> implements C17076v<TResult> {

    /* renamed from: a */
    private final Executor f47733a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C17052a<TResult, TContinuationResult> f47734b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C17079y<TContinuationResult> f47735c;

    public C17064j(Executor executor, C17052a<TResult, TContinuationResult> aVar, C17079y<TContinuationResult> yVar) {
        this.f47733a = executor;
        this.f47734b = aVar;
        this.f47735c = yVar;
    }

    /* renamed from: a */
    public final void mo44305a(C17057f<TResult> fVar) {
        this.f47733a.execute(new C17065k(this, fVar));
    }
}
