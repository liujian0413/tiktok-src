package p346io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.exceptions.ProtocolViolationException;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.subscriptions.SubscriptionHelper */
public enum SubscriptionHelper implements C48294d {
    CANCELLED;

    public final void cancel() {
    }

    public final void request(long j) {
    }

    public static void reportSubscriptionSet() {
        C7332a.m23029a((Throwable) new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean cancel(AtomicReference<C48294d> atomicReference) {
        if (((C48294d) atomicReference.get()) != CANCELLED) {
            C48294d dVar = (C48294d) atomicReference.getAndSet(CANCELLED);
            if (dVar != CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return true;
            }
        }
        return false;
    }

    public static void reportMoreProduced(long j) {
        StringBuilder sb = new StringBuilder("More produced than requested: ");
        sb.append(j);
        C7332a.m23029a((Throwable) new ProtocolViolationException(sb.toString()));
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder("n > 0 required but it was ");
        sb.append(j);
        C7332a.m23029a((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    public static boolean replace(AtomicReference<C48294d> atomicReference, C48294d dVar) {
        C48294d dVar2;
        do {
            dVar2 = (C48294d) atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        return true;
    }

    public static boolean set(AtomicReference<C48294d> atomicReference, C48294d dVar) {
        C48294d dVar2;
        do {
            dVar2 = (C48294d) atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        if (dVar2 != null) {
            dVar2.cancel();
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<C48294d> atomicReference, C48294d dVar) {
        C7364b.m23081a(dVar, "s is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() != CANCELLED) {
            reportSubscriptionSet();
        }
        return false;
    }

    public static boolean validate(C48294d dVar, C48294d dVar2) {
        if (dVar2 == null) {
            C7332a.m23029a((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (dVar == null) {
            return true;
        } else {
            dVar2.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public static boolean setOnce(AtomicReference<C48294d> atomicReference, C48294d dVar, long j) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        dVar.request(j);
        return true;
    }

    public static boolean deferredSetOnce(AtomicReference<C48294d> atomicReference, AtomicLong atomicLong, C48294d dVar) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            dVar.request(andSet);
        }
        return true;
    }

    public static void deferredRequest(AtomicReference<C48294d> atomicReference, AtomicLong atomicLong, long j) {
        C48294d dVar = (C48294d) atomicReference.get();
        if (dVar != null) {
            dVar.request(j);
            return;
        }
        if (validate(j)) {
            C47833b.m148707a(atomicLong, j);
            C48294d dVar2 = (C48294d) atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }
}
