package p346io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import p346io.reactivex.internal.p353b.C47600d;

/* renamed from: io.reactivex.internal.observers.BasicIntQueueDisposable */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements C47600d<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
