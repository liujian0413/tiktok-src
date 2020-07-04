package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.observers.DeferredScalarDisposable;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.w */
public final class C7481w<T> extends C7492s<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f20829a;

    public final T call() throws Exception {
        return C7364b.m23081a(this.f20829a.call(), "The callable returned a null value");
    }

    public C7481w(Callable<? extends T> callable) {
        this.f20829a = callable;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(yVar);
        yVar.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.isDisposed()) {
            try {
                deferredScalarDisposable.complete(C7364b.m23081a(this.f20829a.call(), "Callable returned null"));
            } catch (Throwable th) {
                C7331a.m23009b(th);
                if (!deferredScalarDisposable.isDisposed()) {
                    yVar.onError(th);
                } else {
                    C7332a.m23029a(th);
                }
            }
        }
    }
}
