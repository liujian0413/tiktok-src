package p346io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.observers.j */
public final class C47617j<T> implements C47557ad<T> {

    /* renamed from: a */
    final AtomicReference<C7321c> f122070a;

    /* renamed from: b */
    final C47557ad<? super T> f122071b;

    public final void onError(Throwable th) {
        this.f122071b.onError(th);
    }

    public final void onSubscribe(C7321c cVar) {
        DisposableHelper.replace(this.f122070a, cVar);
    }

    public final void onSuccess(T t) {
        this.f122071b.onSuccess(t);
    }

    public C47617j(AtomicReference<C7321c> atomicReference, C47557ad<? super T> adVar) {
        this.f122070a = atomicReference;
        this.f122071b = adVar;
    }
}
