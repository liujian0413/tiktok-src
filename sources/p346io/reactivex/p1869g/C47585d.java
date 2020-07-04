package p346io.reactivex.p1869g;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p346io.reactivex.internal.subscriptions.EmptySubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.g.d */
public final class C47585d<T> extends C47581a<T> {

    /* renamed from: a */
    final C47791b<T> f122028a;

    /* renamed from: c */
    final AtomicReference<Runnable> f122029c;

    /* renamed from: d */
    final boolean f122030d;

    /* renamed from: e */
    volatile boolean f122031e;

    /* renamed from: f */
    Throwable f122032f;

    /* renamed from: g */
    final AtomicReference<C48293c<? super T>> f122033g;

    /* renamed from: h */
    volatile boolean f122034h;

    /* renamed from: i */
    final AtomicBoolean f122035i;

    /* renamed from: j */
    final BasicIntQueueSubscription<T> f122036j;

    /* renamed from: k */
    final AtomicLong f122037k;

    /* renamed from: l */
    boolean f122038l;

    /* renamed from: io.reactivex.g.d$a */
    final class C47586a extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public final void clear() {
            C47585d.this.f122028a.clear();
        }

        public final boolean isEmpty() {
            return C47585d.this.f122028a.isEmpty();
        }

        public final T poll() {
            return C47585d.this.f122028a.poll();
        }

        public final void cancel() {
            if (!C47585d.this.f122034h) {
                C47585d.this.f122034h = true;
                C47585d.this.mo119682h();
                if (!C47585d.this.f122038l && C47585d.this.f122036j.getAndIncrement() == 0) {
                    C47585d.this.f122028a.clear();
                    C47585d.this.f122033g.lazySet(null);
                }
            }
        }

        C47586a() {
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C47585d.this.f122038l = true;
            return 2;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a(C47585d.this.f122037k, j);
                C47585d.this.mo119683i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo119682h() {
        Runnable runnable = (Runnable) this.f122029c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void onComplete() {
        if (!this.f122031e && !this.f122034h) {
            this.f122031e = true;
            mo119682h();
            mo119683i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo119683i() {
        if (this.f122036j.getAndIncrement() == 0) {
            int i = 1;
            C48293c cVar = (C48293c) this.f122033g.get();
            while (cVar == null) {
                i = this.f122036j.addAndGet(-i);
                if (i != 0) {
                    cVar = (C48293c) this.f122033g.get();
                } else {
                    return;
                }
            }
            if (this.f122038l) {
                m148379c(cVar);
            } else {
                m148378b(cVar);
            }
        }
    }

    private C47585d(int i) {
        this(i, null, true);
    }

    /* renamed from: b */
    public static <T> C47585d<T> m148377b(int i) {
        return new C47585d<>(8);
    }

    public final void onError(Throwable th) {
        C7364b.m23081a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122031e || this.f122034h) {
            C7332a.m23029a(th);
            return;
        }
        this.f122032f = th;
        this.f122031e = true;
        mo119682h();
        mo119683i();
    }

    public final void onNext(T t) {
        C7364b.m23081a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f122031e && !this.f122034h) {
            this.f122028a.offer(t);
            mo119683i();
        }
    }

    public final void onSubscribe(C48294d dVar) {
        if (this.f122031e || this.f122034h) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        if (this.f122035i.get() || !this.f122035i.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.f122036j);
        this.f122033g.set(cVar);
        if (this.f122034h) {
            this.f122033g.lazySet(null);
        } else {
            mo119683i();
        }
    }

    /* renamed from: b */
    private void m148378b(C48293c<? super T> cVar) {
        long j;
        boolean z;
        C47791b<T> bVar = this.f122028a;
        boolean z2 = !this.f122030d;
        int i = 1;
        do {
            long j2 = this.f122037k.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z3 = this.f122031e;
                Object poll = bVar.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                j = j3;
                if (!m148376a(z2, z3, z, cVar, bVar)) {
                    if (z) {
                        break;
                    }
                    cVar.onNext(poll);
                    j3 = 1 + j;
                } else {
                    return;
                }
            }
            C48293c<? super T> cVar2 = cVar;
            if (j2 == j) {
                if (m148376a(z2, this.f122031e, bVar.isEmpty(), cVar, bVar)) {
                    return;
                }
            }
            if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                this.f122037k.addAndGet(-j);
            }
            i = this.f122036j.addAndGet(-i);
        } while (i != 0);
    }

    /* renamed from: c */
    private void m148379c(C48293c<? super T> cVar) {
        C47791b<T> bVar = this.f122028a;
        int i = 1;
        boolean z = !this.f122030d;
        while (!this.f122034h) {
            boolean z2 = this.f122031e;
            if (!z || !z2 || this.f122032f == null) {
                cVar.onNext(null);
                if (z2) {
                    this.f122033g.lazySet(null);
                    Throwable th = this.f122032f;
                    if (th != null) {
                        cVar.onError(th);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                } else {
                    i = this.f122036j.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            } else {
                bVar.clear();
                this.f122033g.lazySet(null);
                cVar.onError(this.f122032f);
                return;
            }
        }
        bVar.clear();
        this.f122033g.lazySet(null);
    }

    private C47585d(int i, Runnable runnable, boolean z) {
        this.f122028a = new C47791b<>(C7364b.m23078a(i, "capacityHint"));
        this.f122029c = new AtomicReference<>(null);
        this.f122030d = true;
        this.f122033g = new AtomicReference<>();
        this.f122035i = new AtomicBoolean();
        this.f122036j = new C47586a();
        this.f122037k = new AtomicLong();
    }

    /* renamed from: a */
    private boolean m148376a(boolean z, boolean z2, boolean z3, C48293c<? super T> cVar, C47791b<T> bVar) {
        if (this.f122034h) {
            bVar.clear();
            this.f122033g.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.f122032f != null) {
                bVar.clear();
                this.f122033g.lazySet(null);
                cVar.onError(this.f122032f);
                return true;
            } else if (z3) {
                Throwable th = this.f122032f;
                this.f122033g.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
