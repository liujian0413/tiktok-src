package p346io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.disposables.SequentialDisposable */
public final class SequentialDisposable extends AtomicReference<C7321c> implements C7321c {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed((C7321c) get());
    }

    public SequentialDisposable(C7321c cVar) {
        lazySet(cVar);
    }

    public final boolean replace(C7321c cVar) {
        return DisposableHelper.replace(this, cVar);
    }

    public final boolean update(C7321c cVar) {
        return DisposableHelper.set(this, cVar);
    }
}
