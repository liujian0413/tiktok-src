package p346io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import org.p361a.C48294d;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7329e;
import p346io.reactivex.internal.p353b.C47599b;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.ae */
public final class C47675ae<T> extends C7319aa<T> implements C47599b<T> {

    /* renamed from: a */
    final C7329e<T> f122200a;

    /* renamed from: b */
    final T f122201b = null;

    /* renamed from: io.reactivex.internal.operators.flowable.ae$a */
    static final class C47676a<T> implements C7321c, C47597i<T> {

        /* renamed from: a */
        final C47557ad<? super T> f122202a;

        /* renamed from: b */
        final T f122203b;

        /* renamed from: c */
        C48294d f122204c;

        /* renamed from: d */
        boolean f122205d;

        /* renamed from: e */
        T f122206e;

        public final void dispose() {
            this.f122204c.cancel();
            this.f122204c = SubscriptionHelper.CANCELLED;
        }

        public final boolean isDisposed() {
            if (this.f122204c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            if (!this.f122205d) {
                this.f122205d = true;
                this.f122204c = SubscriptionHelper.CANCELLED;
                T t = this.f122206e;
                this.f122206e = null;
                if (t == null) {
                    t = this.f122203b;
                }
                if (t != null) {
                    this.f122202a.onSuccess(t);
                } else {
                    this.f122202a.onError(new NoSuchElementException());
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f122205d) {
                C7332a.m23029a(th);
                return;
            }
            this.f122205d = true;
            this.f122204c = SubscriptionHelper.CANCELLED;
            this.f122202a.onError(th);
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122204c, dVar)) {
                this.f122204c = dVar;
                this.f122202a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f122205d) {
                if (this.f122206e != null) {
                    this.f122205d = true;
                    this.f122204c.cancel();
                    this.f122204c = SubscriptionHelper.CANCELLED;
                    this.f122202a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f122206e = t;
            }
        }

        C47676a(C47557ad<? super T> adVar, T t) {
            this.f122202a = adVar;
            this.f122203b = t;
        }
    }

    public final C7329e<T> bY_() {
        return C7332a.m23015a((C7329e<T>) new C47671ac<T>(this.f122200a, this.f122201b, true));
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        this.f122200a.mo19154a((C47597i<? super T>) new C47676a<Object>(adVar, this.f122201b));
    }

    public C47675ae(C7329e<T> eVar, T t) {
        this.f122200a = eVar;
    }
}
