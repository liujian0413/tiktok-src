package p346io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.ac */
public final class C47671ac<T> extends C7368a<T, T> {

    /* renamed from: c */
    final T f122189c;

    /* renamed from: d */
    final boolean f122190d;

    /* renamed from: io.reactivex.internal.operators.flowable.ac$a */
    static final class C47672a<T> extends DeferredScalarSubscription<T> implements C47597i<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* renamed from: a */
        final T f122191a;

        /* renamed from: b */
        final boolean f122192b;

        /* renamed from: c */
        C48294d f122193c;

        /* renamed from: d */
        boolean f122194d;

        public final void cancel() {
            super.cancel();
            this.f122193c.cancel();
        }

        public final void onComplete() {
            if (!this.f122194d) {
                this.f122194d = true;
                T t = this.value;
                this.value = null;
                if (t == null) {
                    t = this.f122191a;
                }
                if (t != null) {
                    complete(t);
                } else if (this.f122192b) {
                    this.downstream.onError(new NoSuchElementException());
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f122194d) {
                C7332a.m23029a(th);
                return;
            }
            this.f122194d = true;
            this.downstream.onError(th);
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122193c, dVar)) {
                this.f122193c = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f122194d) {
                if (this.value != null) {
                    this.f122194d = true;
                    this.f122193c.cancel();
                    this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.value = t;
            }
        }

        C47672a(C48293c<? super T> cVar, T t, boolean z) {
            super(cVar);
            this.f122191a = t;
            this.f122192b = z;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f20450a.mo19154a((C47597i<? super T>) new C47672a<Object>(cVar, this.f122189c, this.f122190d));
    }

    public C47671ac(C7329e<T> eVar, T t, boolean z) {
        super(eVar);
        this.f122189c = t;
        this.f122190d = z;
    }
}
