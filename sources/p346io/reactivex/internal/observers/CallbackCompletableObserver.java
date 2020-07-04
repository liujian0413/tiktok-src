package p346io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47560b;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.OnErrorNotImplementedException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.observers.CallbackCompletableObserver */
public final class CallbackCompletableObserver extends AtomicReference<C7321c> implements C47560b, C7321c, C7326g<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final C7323a onComplete;
    final C7326g<? super Throwable> onError;

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.onError != this) {
            return true;
        }
        return false;
    }

    public final boolean isDisposed() {
        if (get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        try {
            this.onComplete.mo8975a();
        } catch (Throwable th) {
            C7331a.m23009b(th);
            C7332a.m23029a(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public final void onSubscribe(C7321c cVar) {
        DisposableHelper.setOnce(this, cVar);
    }

    public CallbackCompletableObserver(C7323a aVar) {
        this.onError = this;
        this.onComplete = aVar;
    }

    public final void accept(Throwable th) {
        C7332a.m23029a((Throwable) new OnErrorNotImplementedException(th));
    }

    public final void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C7331a.m23009b(th2);
            C7332a.m23029a(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public CallbackCompletableObserver(C7326g<? super Throwable> gVar, C7323a aVar) {
        this.onError = gVar;
        this.onComplete = aVar;
    }
}
