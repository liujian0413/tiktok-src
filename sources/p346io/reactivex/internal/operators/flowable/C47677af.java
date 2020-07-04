package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;

/* renamed from: io.reactivex.internal.operators.flowable.af */
public final class C47677af<T> extends C7368a<T, T> {

    /* renamed from: c */
    final C7499z f122207c;

    /* renamed from: d */
    final boolean f122208d;

    /* renamed from: io.reactivex.internal.operators.flowable.af$a */
    static final class C47678a<T> extends AtomicReference<Thread> implements C47597i<T>, Runnable, C48294d {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: a */
        final C48293c<? super T> f122209a;

        /* renamed from: b */
        final C7502c f122210b;

        /* renamed from: c */
        final AtomicReference<C48294d> f122211c = new AtomicReference<>();

        /* renamed from: d */
        final AtomicLong f122212d = new AtomicLong();

        /* renamed from: e */
        final boolean f122213e;

        /* renamed from: f */
        C7704b<T> f122214f;

        /* renamed from: io.reactivex.internal.operators.flowable.af$a$a */
        static final class C47679a implements Runnable {

            /* renamed from: a */
            final C48294d f122215a;

            /* renamed from: b */
            final long f122216b;

            public final void run() {
                this.f122215a.request(this.f122216b);
            }

            C47679a(C48294d dVar, long j) {
                this.f122215a = dVar;
                this.f122216b = j;
            }
        }

        public final void cancel() {
            SubscriptionHelper.cancel(this.f122211c);
            this.f122210b.dispose();
        }

        public final void onComplete() {
            this.f122209a.onComplete();
            this.f122210b.dispose();
        }

        public final void run() {
            lazySet(Thread.currentThread());
            C7704b<T> bVar = this.f122214f;
            this.f122214f = null;
            bVar.mo19155a(this);
        }

        public final void onNext(T t) {
            this.f122209a.onNext(t);
        }

        public final void onError(Throwable th) {
            this.f122209a.onError(th);
            this.f122210b.dispose();
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.setOnce(this.f122211c, dVar)) {
                long andSet = this.f122212d.getAndSet(0);
                if (andSet != 0) {
                    m148479a(andSet, dVar);
                }
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C48294d dVar = (C48294d) this.f122211c.get();
                if (dVar != null) {
                    m148479a(j, dVar);
                    return;
                }
                C47833b.m148707a(this.f122212d, j);
                C48294d dVar2 = (C48294d) this.f122211c.get();
                if (dVar2 != null) {
                    long andSet = this.f122212d.getAndSet(0);
                    if (andSet != 0) {
                        m148479a(andSet, dVar2);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m148479a(long j, C48294d dVar) {
            if (this.f122213e || Thread.currentThread() == get()) {
                dVar.request(j);
            } else {
                this.f122210b.mo19342a((Runnable) new C47679a(dVar, j));
            }
        }

        C47678a(C48293c<? super T> cVar, C7502c cVar2, C7704b<T> bVar, boolean z) {
            this.f122209a = cVar;
            this.f122210b = cVar2;
            this.f122214f = bVar;
            this.f122213e = !z;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        C7502c a = this.f122207c.mo19338a();
        C47678a aVar = new C47678a(cVar, a, this.f20450a, this.f122208d);
        cVar.onSubscribe(aVar);
        a.mo19342a((Runnable) aVar);
    }

    public C47677af(C7329e<T> eVar, C7499z zVar, boolean z) {
        super(eVar);
        this.f122207c = zVar;
        this.f122208d = z;
    }
}
