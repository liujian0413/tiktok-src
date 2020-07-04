package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.ObserverResourceWrapper */
public final class ObserverResourceWrapper<T> extends AtomicReference<C7321c> implements C7321c, C7498y<T> {
    private static final long serialVersionUID = -8612022020200669122L;
    final C7498y<? super T> downstream;
    final AtomicReference<C7321c> upstream = new AtomicReference<>();

    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        if (this.upstream.get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    public final void setResource(C7321c cVar) {
        DisposableHelper.set(this, cVar);
    }

    public final void onNext(T t) {
        this.downstream.onNext(t);
    }

    public ObserverResourceWrapper(C7498y<? super T> yVar) {
        this.downstream = yVar;
    }

    public final void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    public final void onSubscribe(C7321c cVar) {
        if (DisposableHelper.setOnce(this.upstream, cVar)) {
            this.downstream.onSubscribe(this);
        }
    }
}
