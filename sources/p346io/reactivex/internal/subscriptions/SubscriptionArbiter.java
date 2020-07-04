package p346io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.util.C47833b;

/* renamed from: io.reactivex.internal.subscriptions.SubscriptionArbiter */
public class SubscriptionArbiter extends AtomicInteger implements C48294d {
    private static final long serialVersionUID = -2189523197179400958L;
    C48294d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    final AtomicLong missedProduced = new AtomicLong();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicReference<C48294d> missedSubscription = new AtomicReference<>();
    long requested;
    protected boolean unbounded;

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            drain();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void drainLoop() {
        C48294d dVar = null;
        long j = 0;
        int i = 1;
        do {
            C48294d dVar2 = (C48294d) this.missedSubscription.get();
            if (dVar2 != null) {
                dVar2 = (C48294d) this.missedSubscription.getAndSet(null);
            }
            long j2 = this.missedRequested.get();
            if (j2 != 0) {
                j2 = this.missedRequested.getAndSet(0);
            }
            long j3 = this.missedProduced.get();
            if (j3 != 0) {
                j3 = this.missedProduced.getAndSet(0);
            }
            C48294d dVar3 = this.actual;
            if (this.cancelled) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.actual = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C47833b.m148706a(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        long j5 = j4 - j3;
                        if (j5 < 0) {
                            SubscriptionHelper.reportMoreProduced(j5);
                            j5 = 0;
                        }
                        j4 = j5;
                    }
                    this.requested = j4;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.cancelOnReplace) {
                        dVar3.cancel();
                    }
                    this.actual = dVar2;
                    if (j4 != 0) {
                        j = C47833b.m148706a(j, j4);
                        dVar = dVar2;
                    }
                } else if (!(dVar3 == null || j2 == 0)) {
                    j = C47833b.m148706a(j, j2);
                    dVar = dVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            dVar.request(j);
        }
    }

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    public final void produced(long j) {
        if (!this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C47833b.m148707a(this.missedProduced, j);
                drain();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                long j4 = 0;
                if (j3 < 0) {
                    SubscriptionHelper.reportMoreProduced(j3);
                } else {
                    j4 = j3;
                }
                this.requested = j4;
            }
            if (decrementAndGet() != 0) {
                drainLoop();
            }
        }
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && !this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C47833b.m148707a(this.missedRequested, j);
                drain();
                return;
            }
            long j2 = this.requested;
            if (j2 != Long.MAX_VALUE) {
                long a = C47833b.m148706a(j2, j);
                this.requested = a;
                if (a == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            C48294d dVar = this.actual;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (dVar != null) {
                dVar.request(j);
            }
        }
    }

    public final void setSubscription(C48294d dVar) {
        if (this.cancelled) {
            dVar.cancel();
            return;
        }
        C7364b.m23081a(dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            C48294d dVar2 = (C48294d) this.missedSubscription.getAndSet(dVar);
            if (dVar2 != null && this.cancelOnReplace) {
                dVar2.cancel();
            }
            drain();
            return;
        }
        C48294d dVar3 = this.actual;
        if (dVar3 != null && this.cancelOnReplace) {
            dVar3.cancel();
        }
        this.actual = dVar;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j != 0) {
            dVar.request(j);
        }
    }
}
