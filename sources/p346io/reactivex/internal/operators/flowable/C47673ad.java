package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7490k;
import p346io.reactivex.internal.p353b.C47599b;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.ad */
public final class C47673ad<T> extends C7490k<T> implements C47599b<T> {

    /* renamed from: a */
    final C7329e<T> f122195a;

    /* renamed from: io.reactivex.internal.operators.flowable.ad$a */
    static final class C47674a<T> implements C7321c, C47597i<T> {

        /* renamed from: a */
        final C47856n<? super T> f122196a;

        /* renamed from: b */
        C48294d f122197b;

        /* renamed from: c */
        boolean f122198c;

        /* renamed from: d */
        T f122199d;

        public final void dispose() {
            this.f122197b.cancel();
            this.f122197b = SubscriptionHelper.CANCELLED;
        }

        public final boolean isDisposed() {
            if (this.f122197b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            if (!this.f122198c) {
                this.f122198c = true;
                this.f122197b = SubscriptionHelper.CANCELLED;
                T t = this.f122199d;
                this.f122199d = null;
                if (t == null) {
                    this.f122196a.onComplete();
                } else {
                    this.f122196a.onSuccess(t);
                }
            }
        }

        C47674a(C47856n<? super T> nVar) {
            this.f122196a = nVar;
        }

        public final void onError(Throwable th) {
            if (this.f122198c) {
                C7332a.m23029a(th);
                return;
            }
            this.f122198c = true;
            this.f122197b = SubscriptionHelper.CANCELLED;
            this.f122196a.onError(th);
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122197b, dVar)) {
                this.f122197b = dVar;
                this.f122196a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f122198c) {
                if (this.f122199d != null) {
                    this.f122198c = true;
                    this.f122197b.cancel();
                    this.f122197b = SubscriptionHelper.CANCELLED;
                    this.f122196a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f122199d = t;
            }
        }
    }

    public final C7329e<T> bY_() {
        return C7332a.m23015a((C7329e<T>) new C47671ac<T>(this.f122195a, null, false));
    }

    public C47673ad(C7329e<T> eVar) {
        this.f122195a = eVar;
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        this.f122195a.mo19154a((C47597i<? super T>) new C47674a<Object>(nVar));
    }
}
