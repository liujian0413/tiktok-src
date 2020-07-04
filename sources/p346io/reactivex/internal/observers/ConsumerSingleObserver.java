package p346io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.observers.ConsumerSingleObserver */
public final class ConsumerSingleObserver<T> extends AtomicReference<C7321c> implements C47557ad<T>, C7321c {
    private static final long serialVersionUID = -7012088219455310787L;
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
        if (get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
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

    public ConsumerSingleObserver(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2) {
        this.onSuccess = gVar;
        this.onError = gVar2;
    }
}
