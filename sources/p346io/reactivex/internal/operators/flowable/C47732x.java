package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.subscriptions.EmptySubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p1869g.C47581a;
import p346io.reactivex.p1869g.C47585d;
import p346io.reactivex.p1873k.C47853b;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.flowable.x */
public final class C47732x<T> extends C7368a<T, T> {

    /* renamed from: c */
    final C7327h<? super C7329e<Object>, ? extends C7704b<?>> f122373c;

    /* renamed from: io.reactivex.internal.operators.flowable.x$a */
    static final class C47733a<T> extends C47735c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public final void onComplete() {
            mo119765a(Integer.valueOf(0));
        }

        public final void onError(Throwable th) {
            this.f122380c.cancel();
            this.f122378a.onError(th);
        }

        C47733a(C48293c<? super T> cVar, C47581a<Object> aVar, C48294d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.x$b */
    static final class C47734b<T, U> extends AtomicInteger implements C47597i<Object>, C48294d {
        private static final long serialVersionUID = 2827772011130406689L;

        /* renamed from: a */
        final C7704b<T> f122374a;

        /* renamed from: b */
        final AtomicReference<C48294d> f122375b = new AtomicReference<>();

        /* renamed from: c */
        final AtomicLong f122376c = new AtomicLong();

        /* renamed from: d */
        C47735c<T, U> f122377d;

        public final void cancel() {
            SubscriptionHelper.cancel(this.f122375b);
        }

        public final void onComplete() {
            this.f122377d.cancel();
            this.f122377d.f122378a.onComplete();
        }

        public final void onSubscribe(C48294d dVar) {
            SubscriptionHelper.deferredSetOnce(this.f122375b, this.f122376c, dVar);
        }

        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this.f122375b, this.f122376c, j);
        }

        public final void onError(Throwable th) {
            this.f122377d.cancel();
            this.f122377d.f122378a.onError(th);
        }

        C47734b(C7704b<T> bVar) {
            this.f122374a = bVar;
        }

        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f122375b.get() != SubscriptionHelper.CANCELLED) {
                    this.f122374a.mo19155a(this.f122377d);
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.x$c */
    static abstract class C47735c<T, U> extends SubscriptionArbiter implements C47597i<T> {
        private static final long serialVersionUID = -5604623027276966720L;

        /* renamed from: a */
        protected final C48293c<? super T> f122378a;

        /* renamed from: b */
        protected final C47581a<U> f122379b;

        /* renamed from: c */
        protected final C48294d f122380c;

        /* renamed from: d */
        private long f122381d;

        public final void cancel() {
            super.cancel();
            this.f122380c.cancel();
        }

        public final void onSubscribe(C48294d dVar) {
            setSubscription(dVar);
        }

        public final void onNext(T t) {
            this.f122381d++;
            this.f122378a.onNext(t);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo119765a(U u) {
            setSubscription(EmptySubscription.INSTANCE);
            long j = this.f122381d;
            if (j != 0) {
                this.f122381d = 0;
                produced(j);
            }
            this.f122380c.request(1);
            this.f122379b.onNext(u);
        }

        C47735c(C48293c<? super T> cVar, C47581a<U> aVar, C48294d dVar) {
            super(false);
            this.f122378a = cVar;
            this.f122379b = aVar;
            this.f122380c = dVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        C47853b bVar = new C47853b(cVar);
        C47581a g = C47585d.m148377b(8).mo119676g();
        try {
            C7704b bVar2 = (C7704b) C7364b.m23081a(this.f122373c.apply(g), "handler returned a null Publisher");
            C47734b bVar3 = new C47734b(this.f20450a);
            C47733a aVar = new C47733a(bVar, g, bVar3);
            bVar3.f122377d = aVar;
            cVar.onSubscribe(aVar);
            bVar2.mo19155a(bVar3);
            bVar3.onNext(Integer.valueOf(0));
        } catch (Throwable th) {
            C7331a.m23009b(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
