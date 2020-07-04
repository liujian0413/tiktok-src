package p346io.reactivex.internal.observers;

import p346io.reactivex.C7498y;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.observers.DeferredScalarDisposable */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final C7498y<? super T> downstream;
    protected T value;

    public void dispose() {
        set(4);
        this.value = null;
    }

    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final boolean isDisposed() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    public final boolean tryDispose() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    public final void complete() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.downstream.onComplete();
        }
    }

    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }

    public DeferredScalarDisposable(C7498y<? super T> yVar) {
        this.downstream = yVar;
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            C7332a.m23029a(th);
            return;
        }
        lazySet(2);
        this.downstream.onError(th);
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) == 0) {
            C7498y<? super T> yVar = this.downstream;
            if (i == 8) {
                this.value = t;
                lazySet(16);
                yVar.onNext(null);
            } else {
                lazySet(2);
                yVar.onNext(t);
            }
            if (get() != 4) {
                yVar.onComplete();
            }
        }
    }
}
