package p346io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C47570f;

/* renamed from: io.reactivex.internal.disposables.CancellableDisposable */
public final class CancellableDisposable extends AtomicReference<C47570f> implements C7321c {
    private static final long serialVersionUID = 5718521705281392066L;

    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        if (get() != null && ((C47570f) getAndSet(null)) == null) {
        }
    }

    public CancellableDisposable(C47570f fVar) {
        super(fVar);
    }
}
