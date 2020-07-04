package p346io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.observers.LambdaObserver */
public final class LambdaObserver<T> extends AtomicReference<C7321c> implements C7321c, C7498y<T> {
    private static final long serialVersionUID = -7251123623727029452L;
    final C7323a onComplete;
    final C7326g<? super Throwable> onError;
    final C7326g<? super T> onNext;
    final C7326g<? super C7321c> onSubscribe;

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

    public final void onComplete() {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onComplete.mo8975a();
            } catch (Throwable th) {
                C7331a.m23009b(th);
                C7332a.m23029a(th);
            }
        }
    }

    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                C7331a.m23009b(th);
                ((C7321c) get()).dispose();
                onError(th);
            }
        }
    }

    public final void onSubscribe(C7321c cVar) {
        if (DisposableHelper.setOnce(this, cVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C7331a.m23009b(th);
                cVar.dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                C7332a.m23029a((Throwable) new CompositeException(th, th2));
            }
        } else {
            C7332a.m23029a(th);
        }
    }

    public LambdaObserver(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7326g<? super C7321c> gVar3) {
        this.onNext = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
        this.onSubscribe = gVar3;
    }
}
