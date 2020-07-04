package p346io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C47568b;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.observers.BiConsumerSingleObserver */
public final class BiConsumerSingleObserver<T> extends AtomicReference<C7321c> implements C47557ad<T>, C7321c {
    private static final long serialVersionUID = 4943102778943297569L;
    final C47568b<? super T, ? super Throwable> onCallback;

    public final void dispose() {
        DisposableHelper.dispose(this);
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

    public BiConsumerSingleObserver(C47568b<? super T, ? super Throwable> bVar) {
        this.onCallback = bVar;
    }

    public final void onSuccess(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
        } catch (Throwable th) {
            C7331a.m23009b(th);
            C7332a.m23029a(th);
        }
    }

    public final void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
        } catch (Throwable th2) {
            C7331a.m23009b(th2);
            C7332a.m23029a((Throwable) new CompositeException(th, th2));
        }
    }
}
