package p346io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicLong;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;

/* renamed from: io.reactivex.internal.subscribers.SinglePostCompleteSubscriber */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements C47597i<T>, C48294d {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final C48293c<? super R> downstream;
    protected long produced;
    protected C48294d upstream;
    protected R value;

    /* access modifiers changed from: protected */
    public void onDrop(R r) {
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public SinglePostCompleteSubscriber(C48293c<? super R> cVar) {
        this.downstream = cVar;
    }

    public void onSubscribe(C48294d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
        }
    }

    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                }
            } while (!compareAndSet(j2, C47833b.m148706a(j2, j)));
            this.upstream.request(j);
        }
    }

    /* access modifiers changed from: protected */
    public final void complete(R r) {
        long j = this.produced;
        if (j != 0) {
            C47833b.m148709c(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                onDrop(r);
                return;
            } else if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r;
                if (!compareAndSet(0, Long.MIN_VALUE)) {
                    this.value = null;
                } else {
                    return;
                }
            }
        }
    }
}
