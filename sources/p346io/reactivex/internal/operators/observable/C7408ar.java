package p346io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.ar */
public final class C7408ar<T> extends C7319aa<T> {

    /* renamed from: a */
    final C7496w<? extends T> f20551a;

    /* renamed from: b */
    final T f20552b;

    /* renamed from: io.reactivex.internal.operators.observable.ar$a */
    static final class C7409a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C47557ad<? super T> f20553a;

        /* renamed from: b */
        final T f20554b;

        /* renamed from: c */
        C7321c f20555c;

        /* renamed from: d */
        T f20556d;

        /* renamed from: e */
        boolean f20557e;

        public final void dispose() {
            this.f20555c.dispose();
        }

        public final boolean isDisposed() {
            return this.f20555c.isDisposed();
        }

        public final void onComplete() {
            if (!this.f20557e) {
                this.f20557e = true;
                T t = this.f20556d;
                this.f20556d = null;
                if (t == null) {
                    t = this.f20554b;
                }
                if (t != null) {
                    this.f20553a.onSuccess(t);
                } else {
                    this.f20553a.onError(new NoSuchElementException());
                }
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20555c, cVar)) {
                this.f20555c = cVar;
                this.f20553a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f20557e) {
                C7332a.m23029a(th);
                return;
            }
            this.f20557e = true;
            this.f20553a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f20557e) {
                if (this.f20556d != null) {
                    this.f20557e = true;
                    this.f20555c.dispose();
                    this.f20553a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f20556d = t;
            }
        }

        C7409a(C47557ad<? super T> adVar, T t) {
            this.f20553a = adVar;
            this.f20554b = t;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        this.f20551a.mo19189a(new C7409a(adVar, this.f20552b));
    }

    public C7408ar(C7496w<? extends T> wVar, T t) {
        this.f20551a = wVar;
        this.f20552b = t;
    }
}
