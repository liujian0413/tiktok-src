package p346io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.p361a.C48294d;

/* renamed from: io.reactivex.internal.subscriptions.BooleanSubscription */
public final class BooleanSubscription extends AtomicBoolean implements C48294d {
    private static final long serialVersionUID = -8127758972444290902L;

    public final void cancel() {
        lazySet(true);
    }

    public final boolean isCancelled() {
        return get();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BooleanSubscription(cancelled=");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }

    public final void request(long j) {
        SubscriptionHelper.validate(j);
    }
}
