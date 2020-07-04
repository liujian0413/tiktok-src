package p346io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import org.p361a.C48293c;
import p346io.reactivex.internal.p353b.C47602f;

/* renamed from: io.reactivex.internal.subscriptions.ScalarSubscription */
public final class ScalarSubscription<T> extends AtomicInteger implements C47602f<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final C48293c<? super T> subscriber;
    final T value;

    public final int requestFusion(int i) {
        return i & 1;
    }

    public final void cancel() {
        lazySet(2);
    }

    public final void clear() {
        lazySet(1);
    }

    public final boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            C48293c<? super T> cVar = this.subscriber;
            cVar.onNext(this.value);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }

    public ScalarSubscription(C48293c<? super T> cVar, T t) {
        this.subscriber = cVar;
        this.value = t;
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
