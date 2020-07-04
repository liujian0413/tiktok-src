package p346io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.disposables.ArrayCompositeDisposable */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<C7321c> implements C7321c {
    private static final long serialVersionUID = 2746389416410565408L;

    public final boolean isDisposed() {
        if (get(0) == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (((C7321c) get(i)) != DisposableHelper.DISPOSED) {
                    C7321c cVar = (C7321c) getAndSet(i, DisposableHelper.DISPOSED);
                    if (!(cVar == DisposableHelper.DISPOSED || cVar == null)) {
                        cVar.dispose();
                    }
                }
            }
        }
    }

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    public final C7321c replaceResource(int i, C7321c cVar) {
        C7321c cVar2;
        do {
            cVar2 = (C7321c) get(i);
            if (cVar2 == DisposableHelper.DISPOSED) {
                cVar.dispose();
                return null;
            }
        } while (!compareAndSet(i, cVar2, cVar));
        return cVar2;
    }

    public final boolean setResource(int i, C7321c cVar) {
        C7321c cVar2;
        do {
            cVar2 = (C7321c) get(i);
            if (cVar2 == DisposableHelper.DISPOSED) {
                cVar.dispose();
                return false;
            }
        } while (!compareAndSet(i, cVar2, cVar));
        if (cVar2 != null) {
            cVar2.dispose();
        }
        return true;
    }
}
