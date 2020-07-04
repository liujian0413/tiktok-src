package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.f */
public abstract class C17057f<TResult> {
    /* renamed from: a */
    public abstract C17057f<TResult> mo44289a(Executor executor, C17055d dVar);

    /* renamed from: a */
    public abstract C17057f<TResult> mo44290a(Executor executor, C17056e<? super TResult> eVar);

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo44291a(Class<X> cls) throws Throwable;

    /* renamed from: a */
    public abstract boolean mo44292a();

    /* renamed from: b */
    public abstract boolean mo44294b();

    /* renamed from: c */
    public abstract boolean mo44295c();

    /* renamed from: d */
    public abstract TResult mo44296d();

    /* renamed from: e */
    public abstract Exception mo44297e();

    /* renamed from: a */
    public C17057f<TResult> mo44285a(C17054c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public C17057f<TResult> mo44288a(Executor executor, C17054c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public C17057f<TResult> mo44287a(Executor executor, C17053b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> C17057f<TContinuationResult> mo44286a(Executor executor, C17052a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: b */
    public <TContinuationResult> C17057f<TContinuationResult> mo44293b(Executor executor, C17052a<TResult, C17057f<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
}
