package p346io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import p346io.reactivex.internal.p353b.C47602f;

/* renamed from: io.reactivex.internal.subscriptions.BasicIntQueueSubscription */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements C47602f<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
