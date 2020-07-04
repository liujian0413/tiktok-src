package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import org.p361a.C48293c;
import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p346io.reactivex.p348d.C7328l;

/* renamed from: io.reactivex.internal.operators.flowable.y */
public final class C47736y<T> extends C7368a<T, T> {

    /* renamed from: c */
    final C7328l<? super Throwable> f122382c;

    /* renamed from: d */
    final long f122383d;

    /* renamed from: io.reactivex.internal.operators.flowable.y$a */
    static final class C47737a<T> extends AtomicInteger implements C47597i<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: a */
        final C48293c<? super T> f122384a;

        /* renamed from: b */
        final SubscriptionArbiter f122385b;

        /* renamed from: c */
        final C7704b<? extends T> f122386c;

        /* renamed from: d */
        final C7328l<? super Throwable> f122387d;

        /* renamed from: e */
        long f122388e;

        /* renamed from: f */
        long f122389f;

        public final void onComplete() {
            this.f122384a.onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119766a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f122385b.isCancelled()) {
                    long j = this.f122389f;
                    if (j != 0) {
                        this.f122389f = 0;
                        this.f122385b.produced(j);
                    }
                    this.f122386c.mo19155a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }

        public final void onSubscribe(C48294d dVar) {
            this.f122385b.setSubscription(dVar);
        }

        public final void onNext(T t) {
            this.f122389f++;
            this.f122384a.onNext(t);
        }

        public final void onError(Throwable th) {
            long j = this.f122388e;
            if (j != Long.MAX_VALUE) {
                this.f122388e = j - 1;
            }
            if (j == 0) {
                this.f122384a.onError(th);
                return;
            }
            try {
                if (!this.f122387d.mo9283a(th)) {
                    this.f122384a.onError(th);
                } else {
                    mo119766a();
                }
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.f122384a.onError(new CompositeException(th, th2));
            }
        }

        C47737a(C48293c<? super T> cVar, long j, C7328l<? super Throwable> lVar, SubscriptionArbiter subscriptionArbiter, C7704b<? extends T> bVar) {
            this.f122384a = cVar;
            this.f122385b = subscriptionArbiter;
            this.f122386c = bVar;
            this.f122387d = lVar;
            this.f122388e = j;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        C47737a aVar = new C47737a(cVar, this.f122383d, this.f122382c, subscriptionArbiter, this.f20450a);
        aVar.mo119766a();
    }

    public C47736y(C7329e<T> eVar, long j, C7328l<? super Throwable> lVar) {
        super(eVar);
        this.f122382c = lVar;
        this.f122383d = j;
    }
}
