package p346io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47560b;
import p346io.reactivex.exceptions.OnErrorNotImplementedException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.observers.EmptyCompletableObserver */
public final class EmptyCompletableObserver extends AtomicReference<C7321c> implements C47560b, C7321c {
    private static final long serialVersionUID = -7545121636549663526L;

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean hasCustomOnError() {
        return false;
    }

    public final void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    public final boolean isDisposed() {
        if (get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onSubscribe(C7321c cVar) {
        DisposableHelper.setOnce(this, cVar);
    }

    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        C7332a.m23029a((Throwable) new OnErrorNotImplementedException(th));
    }
}
