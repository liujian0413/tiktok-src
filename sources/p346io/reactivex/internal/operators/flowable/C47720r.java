package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.internal.p353b.C47598a;
import p346io.reactivex.internal.p353b.C47602f;
import p346io.reactivex.internal.p353b.C47604i;
import p346io.reactivex.internal.queue.SpscArrayQueue;
import p346io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.r */
public final class C47720r<T> extends C7368a<T, T> {

    /* renamed from: c */
    final C7499z f122326c;

    /* renamed from: d */
    final boolean f122327d;

    /* renamed from: e */
    final int f122328e;

    /* renamed from: io.reactivex.internal.operators.flowable.r$a */
    static abstract class C47721a<T> extends BasicIntQueueSubscription<T> implements C47597i<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: a */
        final C7502c f122329a;

        /* renamed from: b */
        final boolean f122330b;

        /* renamed from: c */
        final int f122331c;

        /* renamed from: d */
        final int f122332d;

        /* renamed from: e */
        final AtomicLong f122333e = new AtomicLong();

        /* renamed from: f */
        C48294d f122334f;

        /* renamed from: g */
        C47604i<T> f122335g;

        /* renamed from: h */
        volatile boolean f122336h;

        /* renamed from: i */
        volatile boolean f122337i;

        /* renamed from: j */
        Throwable f122338j;

        /* renamed from: k */
        int f122339k;

        /* renamed from: l */
        long f122340l;

        /* renamed from: m */
        boolean f122341m;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo119760a();

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo119762b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract void mo119763c();

        public final void clear() {
            this.f122335g.clear();
        }

        public final boolean isEmpty() {
            return this.f122335g.isEmpty();
        }

        /* renamed from: d */
        private void m148551d() {
            if (getAndIncrement() == 0) {
                this.f122329a.mo19342a((Runnable) this);
            }
        }

        public final void onComplete() {
            if (!this.f122337i) {
                this.f122337i = true;
                m148551d();
            }
        }

        public final void cancel() {
            if (!this.f122336h) {
                this.f122336h = true;
                this.f122334f.cancel();
                this.f122329a.dispose();
                if (getAndIncrement() == 0) {
                    this.f122335g.clear();
                }
            }
        }

        public final void run() {
            if (this.f122341m) {
                mo119760a();
            } else if (this.f122339k == 1) {
                mo119762b();
            } else {
                mo119763c();
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a(this.f122333e, j);
                m148551d();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f122341m = true;
            return 2;
        }

        public final void onError(Throwable th) {
            if (this.f122337i) {
                C7332a.m23029a(th);
                return;
            }
            this.f122338j = th;
            this.f122337i = true;
            m148551d();
        }

        public final void onNext(T t) {
            if (!this.f122337i) {
                if (this.f122339k == 2) {
                    m148551d();
                    return;
                }
                if (!this.f122335g.offer(t)) {
                    this.f122334f.cancel();
                    this.f122338j = new MissingBackpressureException("Queue is full?!");
                    this.f122337i = true;
                }
                m148551d();
            }
        }

        C47721a(C7502c cVar, boolean z, int i) {
            this.f122329a = cVar;
            this.f122330b = z;
            this.f122331c = i;
            this.f122332d = i - (i >> 2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo119761a(boolean z, boolean z2, C48293c<?> cVar) {
            if (this.f122336h) {
                clear();
                return true;
            }
            if (z) {
                if (!this.f122330b) {
                    Throwable th = this.f122338j;
                    if (th != null) {
                        this.f122336h = true;
                        clear();
                        cVar.onError(th);
                        this.f122329a.dispose();
                        return true;
                    } else if (z2) {
                        this.f122336h = true;
                        cVar.onComplete();
                        this.f122329a.dispose();
                        return true;
                    }
                } else if (z2) {
                    this.f122336h = true;
                    Throwable th2 = this.f122338j;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    this.f122329a.dispose();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.r$b */
    static final class C47722b<T> extends C47721a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: n */
        final C47598a<? super T> f122342n;

        /* renamed from: o */
        long f122343o;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119760a() {
            int i = 1;
            while (!this.f122336h) {
                boolean z = this.f122337i;
                this.f122342n.onNext(null);
                if (z) {
                    this.f122336h = true;
                    Throwable th = this.f122338j;
                    if (th != null) {
                        this.f122342n.onError(th);
                    } else {
                        this.f122342n.onComplete();
                    }
                    this.f122329a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T poll() throws Exception {
            T poll = this.f122335g.poll();
            if (!(poll == null || this.f122339k == 1)) {
                long j = this.f122343o + 1;
                if (j == ((long) this.f122332d)) {
                    this.f122343o = 0;
                    this.f122334f.request(j);
                } else {
                    this.f122343o = j;
                }
            }
            return poll;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo119762b() {
            C47598a<? super T> aVar = this.f122342n;
            C47604i iVar = this.f122335g;
            long j = this.f122340l;
            int i = 1;
            while (true) {
                long j2 = this.f122333e.get();
                while (j != j2) {
                    try {
                        Object poll = iVar.poll();
                        if (!this.f122336h) {
                            if (poll == null) {
                                this.f122336h = true;
                                aVar.onComplete();
                                this.f122329a.dispose();
                                return;
                            } else if (aVar.mo119684a(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        this.f122336h = true;
                        this.f122334f.cancel();
                        aVar.onError(th);
                        this.f122329a.dispose();
                        return;
                    }
                }
                if (!this.f122336h) {
                    if (iVar.isEmpty()) {
                        this.f122336h = true;
                        aVar.onComplete();
                        this.f122329a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f122340l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo119763c() {
            boolean z;
            C47598a<? super T> aVar = this.f122342n;
            C47604i iVar = this.f122335g;
            long j = this.f122340l;
            long j2 = this.f122343o;
            int i = 1;
            while (true) {
                long j3 = this.f122333e.get();
                while (j != j3) {
                    boolean z2 = this.f122337i;
                    try {
                        Object poll = iVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo119761a(z2, z, aVar)) {
                            if (z) {
                                break;
                            }
                            if (aVar.mo119684a(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f122332d)) {
                                this.f122334f.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        this.f122336h = true;
                        this.f122334f.cancel();
                        iVar.clear();
                        aVar.onError(th);
                        this.f122329a.dispose();
                        return;
                    }
                }
                if (j != j3 || !mo119761a(this.f122337i, iVar.isEmpty(), aVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.f122340l = j;
                        this.f122343o = j2;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122334f, dVar)) {
                this.f122334f = dVar;
                if (dVar instanceof C47602f) {
                    C47602f fVar = (C47602f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f122339k = 1;
                        this.f122335g = fVar;
                        this.f122337i = true;
                        this.f122342n.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f122339k = 2;
                        this.f122335g = fVar;
                        this.f122342n.onSubscribe(this);
                        dVar.request((long) this.f122331c);
                        return;
                    }
                }
                this.f122335g = new SpscArrayQueue(this.f122331c);
                this.f122342n.onSubscribe(this);
                dVar.request((long) this.f122331c);
            }
        }

        C47722b(C47598a<? super T> aVar, C7502c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f122342n = aVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.r$c */
    static final class C47723c<T> extends C47721a<T> implements C47597i<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: n */
        final C48293c<? super T> f122344n;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119760a() {
            int i = 1;
            while (!this.f122336h) {
                boolean z = this.f122337i;
                this.f122344n.onNext(null);
                if (z) {
                    this.f122336h = true;
                    Throwable th = this.f122338j;
                    if (th != null) {
                        this.f122344n.onError(th);
                    } else {
                        this.f122344n.onComplete();
                    }
                    this.f122329a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T poll() throws Exception {
            T poll = this.f122335g.poll();
            if (!(poll == null || this.f122339k == 1)) {
                long j = this.f122340l + 1;
                if (j == ((long) this.f122332d)) {
                    this.f122340l = 0;
                    this.f122334f.request(j);
                } else {
                    this.f122340l = j;
                }
            }
            return poll;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo119762b() {
            C48293c<? super T> cVar = this.f122344n;
            C47604i iVar = this.f122335g;
            long j = this.f122340l;
            int i = 1;
            while (true) {
                long j2 = this.f122333e.get();
                while (j != j2) {
                    try {
                        Object poll = iVar.poll();
                        if (!this.f122336h) {
                            if (poll == null) {
                                this.f122336h = true;
                                cVar.onComplete();
                                this.f122329a.dispose();
                                return;
                            }
                            cVar.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        this.f122336h = true;
                        this.f122334f.cancel();
                        cVar.onError(th);
                        this.f122329a.dispose();
                        return;
                    }
                }
                if (!this.f122336h) {
                    if (iVar.isEmpty()) {
                        this.f122336h = true;
                        cVar.onComplete();
                        this.f122329a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f122340l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo119763c() {
            boolean z;
            C48293c<? super T> cVar = this.f122344n;
            C47604i iVar = this.f122335g;
            long j = this.f122340l;
            int i = 1;
            while (true) {
                long j2 = this.f122333e.get();
                while (j != j2) {
                    boolean z2 = this.f122337i;
                    try {
                        Object poll = iVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo119761a(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j++;
                            if (j == ((long) this.f122332d)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.f122333e.addAndGet(-j);
                                }
                                this.f122334f.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        this.f122336h = true;
                        this.f122334f.cancel();
                        iVar.clear();
                        cVar.onError(th);
                        this.f122329a.dispose();
                        return;
                    }
                }
                if (j != j2 || !mo119761a(this.f122337i, iVar.isEmpty(), cVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.f122340l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122334f, dVar)) {
                this.f122334f = dVar;
                if (dVar instanceof C47602f) {
                    C47602f fVar = (C47602f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f122339k = 1;
                        this.f122335g = fVar;
                        this.f122337i = true;
                        this.f122344n.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f122339k = 2;
                        this.f122335g = fVar;
                        this.f122344n.onSubscribe(this);
                        dVar.request((long) this.f122331c);
                        return;
                    }
                }
                this.f122335g = new SpscArrayQueue(this.f122331c);
                this.f122344n.onSubscribe(this);
                dVar.request((long) this.f122331c);
            }
        }

        C47723c(C48293c<? super T> cVar, C7502c cVar2, boolean z, int i) {
            super(cVar2, z, i);
            this.f122344n = cVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        C7502c a = this.f122326c.mo19338a();
        if (cVar instanceof C47598a) {
            this.f20450a.mo19154a((C47597i<? super T>) new C47722b<Object>((C47598a) cVar, a, this.f122327d, this.f122328e));
        } else {
            this.f20450a.mo19154a((C47597i<? super T>) new C47723c<Object>(cVar, a, this.f122327d, this.f122328e));
        }
    }

    public C47720r(C7329e<T> eVar, C7499z zVar, boolean z, int i) {
        super(eVar);
        this.f122326c = zVar;
        this.f122327d = z;
        this.f122328e = i;
    }
}
