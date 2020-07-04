package p346io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47856n;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeCallbackObserver */
public final class MaybeCallbackObserver<T> extends AtomicReference<C7321c> implements C7321c, C47856n<T> {
    private static final long serialVersionUID = -6076952298809384986L;
    final C7323a onComplete;
    final C7326g<? super Throwable> onError;
    final C7326g<? super T> onSuccess;

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean hasCustomOnError() {
        if (this.onError != C7342a.f20432f) {
            return true;
        }
        return false;
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed((C7321c) get());
    }

    public final void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.mo8975a();
        } catch (Throwable th) {
            C7331a.m23009b(th);
            C7332a.m23029a(th);
        }
    }

    public final void onSubscribe(C7321c cVar) {
        DisposableHelper.setOnce(this, cVar);
    }

    public final void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            C7331a.m23009b(th);
            C7332a.m23029a(th);
        }
    }

    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C7331a.m23009b(th2);
            C7332a.m23029a((Throwable) new CompositeException(th, th2));
        }
    }

    public MaybeCallbackObserver(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar) {
        this.onSuccess = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
    }
}
