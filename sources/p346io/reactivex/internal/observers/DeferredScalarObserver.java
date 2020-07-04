package p346io.reactivex.internal.observers;

import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.observers.DeferredScalarObserver */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements C7498y<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected C7321c upstream;

    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    public void onComplete() {
        Object obj = this.value;
        if (obj != null) {
            this.value = null;
            complete(obj);
            return;
        }
        complete();
    }

    public DeferredScalarObserver(C7498y<? super R> yVar) {
        super(yVar);
    }

    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    public void onSubscribe(C7321c cVar) {
        if (DisposableHelper.validate(this.upstream, cVar)) {
            this.upstream = cVar;
            this.downstream.onSubscribe(this);
        }
    }
}
