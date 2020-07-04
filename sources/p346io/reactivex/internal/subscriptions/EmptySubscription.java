package p346io.reactivex.internal.subscriptions;

import org.p361a.C48293c;
import p346io.reactivex.internal.p353b.C47602f;

/* renamed from: io.reactivex.internal.subscriptions.EmptySubscription */
public enum EmptySubscription implements C47602f<Object> {
    INSTANCE;

    public final void cancel() {
    }

    public final void clear() {
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Object poll() {
        return null;
    }

    public final int requestFusion(int i) {
        return i & 2;
    }

    public final String toString() {
        return "EmptySubscription";
    }

    public final void request(long j) {
        SubscriptionHelper.validate(j);
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(C48293c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th, C48293c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
