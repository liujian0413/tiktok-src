package p346io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.p361a.C48294d;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.subscriptions.ArrayCompositeSubscription */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<C48294d> implements C7321c {
    private static final long serialVersionUID = 2746389416410565408L;

    public final boolean isDisposed() {
        if (get(0) == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (((C48294d) get(i)) != SubscriptionHelper.CANCELLED) {
                    C48294d dVar = (C48294d) getAndSet(i, SubscriptionHelper.CANCELLED);
                    if (!(dVar == SubscriptionHelper.CANCELLED || dVar == null)) {
                        dVar.cancel();
                    }
                }
            }
        }
    }

    public ArrayCompositeSubscription(int i) {
        super(i);
    }

    public final C48294d replaceResource(int i, C48294d dVar) {
        C48294d dVar2;
        do {
            dVar2 = (C48294d) get(i);
            if (dVar2 == SubscriptionHelper.CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return null;
            }
        } while (!compareAndSet(i, dVar2, dVar));
        return dVar2;
    }

    public final boolean setResource(int i, C48294d dVar) {
        C48294d dVar2;
        do {
            dVar2 = (C48294d) get(i);
            if (dVar2 == SubscriptionHelper.CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return false;
            }
        } while (!compareAndSet(i, dVar2, dVar));
        if (dVar2 != null) {
            dVar2.cancel();
        }
        return true;
    }
}
