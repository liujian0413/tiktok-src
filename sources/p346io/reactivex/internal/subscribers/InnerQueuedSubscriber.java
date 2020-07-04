package p346io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.internal.p353b.C47602f;
import p346io.reactivex.internal.p353b.C47604i;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47842j;

/* renamed from: io.reactivex.internal.subscribers.InnerQueuedSubscriber */
public final class InnerQueuedSubscriber<T> extends AtomicReference<C48294d> implements C47597i<T>, C48294d {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final C47828c<T> parent;
    final int prefetch;
    long produced;
    volatile C47604i<T> queue;

    public final void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public final boolean isDone() {
        return this.done;
    }

    public final void onComplete() {
    }

    public final void onError(Throwable th) {
    }

    public final void onNext(T t) {
    }

    public final C47604i<T> queue() {
        return this.queue;
    }

    public final void setDone() {
        this.done = true;
    }

    public final void requestOne() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j == ((long) this.limit)) {
                this.produced = 0;
                ((C48294d) get()).request(j);
                return;
            }
            this.produced = j;
        }
    }

    public final void request(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 >= ((long) this.limit)) {
                this.produced = 0;
                ((C48294d) get()).request(j2);
                return;
            }
            this.produced = j2;
        }
    }

    public final void onSubscribe(C48294d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            if (dVar instanceof C47602f) {
                C47602f fVar = (C47602f) dVar;
                int requestFusion = fVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = fVar;
                    this.done = true;
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = fVar;
                    C47842j.m148739a(dVar, this.prefetch);
                    return;
                }
            }
            this.queue = C47842j.m148737a(this.prefetch);
            C47842j.m148739a(dVar, this.prefetch);
        }
    }

    public InnerQueuedSubscriber(C47828c<T> cVar, int i) {
        this.parent = cVar;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }
}
