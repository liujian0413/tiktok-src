package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.internal.p353b.C47603h;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.queue.SpscArrayQueue;
import p346io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p348d.C7323a;

/* renamed from: io.reactivex.internal.operators.flowable.s */
public final class C47724s<T> extends C7368a<T, T> {

    /* renamed from: c */
    final int f122345c;

    /* renamed from: d */
    final boolean f122346d;

    /* renamed from: e */
    final boolean f122347e;

    /* renamed from: f */
    final C7323a f122348f;

    /* renamed from: io.reactivex.internal.operators.flowable.s$a */
    static final class C47725a<T> extends BasicIntQueueSubscription<T> implements C47597i<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: a */
        final C48293c<? super T> f122349a;

        /* renamed from: b */
        final C47603h<T> f122350b;

        /* renamed from: c */
        final boolean f122351c;

        /* renamed from: d */
        final C7323a f122352d;

        /* renamed from: e */
        C48294d f122353e;

        /* renamed from: f */
        volatile boolean f122354f;

        /* renamed from: g */
        volatile boolean f122355g;

        /* renamed from: h */
        Throwable f122356h;

        /* renamed from: i */
        final AtomicLong f122357i = new AtomicLong();

        /* renamed from: j */
        boolean f122358j;

        public final void clear() {
            this.f122350b.clear();
        }

        public final boolean isEmpty() {
            return this.f122350b.isEmpty();
        }

        public final T poll() throws Exception {
            return this.f122350b.poll();
        }

        public final void cancel() {
            if (!this.f122354f) {
                this.f122354f = true;
                this.f122353e.cancel();
                if (getAndIncrement() == 0) {
                    this.f122350b.clear();
                }
            }
        }

        public final void onComplete() {
            this.f122355g = true;
            if (this.f122358j) {
                this.f122349a.onComplete();
            } else {
                m148563a();
            }
        }

        /* renamed from: a */
        private void m148563a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C47603h<T> hVar = this.f122350b;
                C48293c<? super T> cVar = this.f122349a;
                int i = 1;
                while (!m148564a(this.f122355g, hVar.isEmpty(), cVar)) {
                    long j = this.f122357i.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.f122355g;
                        Object poll = hVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!m148564a(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !m148564a(this.f122355g, hVar.isEmpty(), cVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f122357i.addAndGet(-j2);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f122358j = true;
            return 2;
        }

        public final void onError(Throwable th) {
            this.f122356h = th;
            this.f122355g = true;
            if (this.f122358j) {
                this.f122349a.onError(th);
            } else {
                m148563a();
            }
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122353e, dVar)) {
                this.f122353e = dVar;
                this.f122349a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void request(long j) {
            if (!this.f122358j && SubscriptionHelper.validate(j)) {
                C47833b.m148707a(this.f122357i, j);
                m148563a();
            }
        }

        public final void onNext(T t) {
            if (!this.f122350b.offer(t)) {
                this.f122353e.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f122352d.mo8975a();
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.f122358j) {
                this.f122349a.onNext(null);
            } else {
                m148563a();
            }
        }

        /* renamed from: a */
        private boolean m148564a(boolean z, boolean z2, C48293c<? super T> cVar) {
            if (this.f122354f) {
                this.f122350b.clear();
                return true;
            }
            if (z) {
                if (!this.f122351c) {
                    Throwable th = this.f122356h;
                    if (th != null) {
                        this.f122350b.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z2) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f122356h;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        C47725a(C48293c<? super T> cVar, int i, boolean z, boolean z2, C7323a aVar) {
            C47603h<T> hVar;
            this.f122349a = cVar;
            this.f122352d = aVar;
            this.f122351c = z2;
            if (z) {
                hVar = new C47791b<>(i);
            } else {
                hVar = new SpscArrayQueue<>(i);
            }
            this.f122350b = hVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        C7329e eVar = this.f20450a;
        C47725a aVar = new C47725a(cVar, this.f122345c, this.f122346d, this.f122347e, this.f122348f);
        eVar.mo19154a((C47597i<? super T>) aVar);
    }

    public C47724s(C7329e<T> eVar, int i, boolean z, boolean z2, C7323a aVar) {
        super(eVar);
        this.f122345c = i;
        this.f122346d = z;
        this.f122347e = z2;
        this.f122348f = aVar;
    }
}
