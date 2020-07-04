package p346io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.exceptions.ProtocolViolationException;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.disposables.DisposableHelper */
public enum DisposableHelper implements C7321c {
    DISPOSED;

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    public static void reportDisposableSet() {
        C7332a.m23029a((Throwable) new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean isDisposed(C7321c cVar) {
        if (cVar == DISPOSED) {
            return true;
        }
        return false;
    }

    public static boolean dispose(AtomicReference<C7321c> atomicReference) {
        C7321c cVar = (C7321c) atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (cVar != disposableHelper) {
            C7321c cVar2 = (C7321c) atomicReference.getAndSet(disposableHelper);
            if (cVar2 != disposableHelper) {
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean replace(AtomicReference<C7321c> atomicReference, C7321c cVar) {
        C7321c cVar2;
        do {
            cVar2 = (C7321c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    public static boolean set(AtomicReference<C7321c> atomicReference, C7321c cVar) {
        C7321c cVar2;
        do {
            cVar2 = (C7321c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 != null) {
            cVar2.dispose();
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<C7321c> atomicReference, C7321c cVar) {
        C7364b.m23081a(cVar, "d is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != DISPOSED) {
            reportDisposableSet();
        }
        return false;
    }

    public static boolean trySet(AtomicReference<C7321c> atomicReference, C7321c cVar) {
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            cVar.dispose();
        }
        return false;
    }

    public static boolean validate(C7321c cVar, C7321c cVar2) {
        if (cVar2 == null) {
            C7332a.m23029a((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.dispose();
            reportDisposableSet();
            return false;
        }
    }
}
