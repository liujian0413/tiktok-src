package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.u */
public final class C7371u<T> extends C7368a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.u$a */
    static final class C7372a<T> extends AtomicLong implements C47597i<T>, C48294d {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: a */
        final C48293c<? super T> f20454a;

        /* renamed from: b */
        C48294d f20455b;

        /* renamed from: c */
        boolean f20456c;

        public final void cancel() {
            this.f20455b.cancel();
        }

        public final void onComplete() {
            if (!this.f20456c) {
                this.f20456c = true;
                this.f20454a.onComplete();
            }
        }

        C7372a(C48293c<? super T> cVar) {
            this.f20454a = cVar;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a((AtomicLong) this, j);
            }
        }

        public final void onError(Throwable th) {
            if (this.f20456c) {
                C7332a.m23029a(th);
                return;
            }
            this.f20456c = true;
            this.f20454a.onError(th);
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f20455b, dVar)) {
                this.f20455b = dVar;
                this.f20454a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f20456c) {
                if (get() != 0) {
                    this.f20454a.onNext(t);
                    C47833b.m148709c(this, 1);
                    return;
                }
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }
    }

    public C7371u(C7329e<T> eVar) {
        super(eVar);
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f20450a.mo19154a((C47597i<? super T>) new C7372a<Object>(cVar));
    }
}
