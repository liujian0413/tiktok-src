package p346io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.AtomicThrowable;
import p346io.reactivex.internal.util.C47838f;

/* renamed from: io.reactivex.internal.subscribers.StrictSubscriber */
public class StrictSubscriber<T> extends AtomicInteger implements C47597i<T>, C48294d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final C48293c<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<C48294d> upstream = new AtomicReference<>();

    public void cancel() {
        if (!this.done) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    public void onComplete() {
        this.done = true;
        C47838f.m148725a(this.downstream, (AtomicInteger) this, this.error);
    }

    public void onNext(T t) {
        C47838f.m148723a(this.downstream, t, (AtomicInteger) this, this.error);
    }

    public void onError(Throwable th) {
        this.done = true;
        C47838f.m148724a(this.downstream, th, (AtomicInteger) this, this.error);
    }

    public StrictSubscriber(C48293c<? super T> cVar) {
        this.downstream = cVar;
    }

    public void onSubscribe(C48294d dVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
            return;
        }
        dVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            StringBuilder sb = new StringBuilder("§3.9 violated: positive request amount required but it was ");
            sb.append(j);
            onError(new IllegalArgumentException(sb.toString()));
            return;
        }
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }
}
