package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.ay */
public final class C7424ay<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7328l<? super T> f20588b;

    /* renamed from: io.reactivex.internal.operators.observable.ay$a */
    static final class C7425a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20589a;

        /* renamed from: b */
        final C7328l<? super T> f20590b;

        /* renamed from: c */
        C7321c f20591c;

        /* renamed from: d */
        boolean f20592d;

        public final void dispose() {
            this.f20591c.dispose();
        }

        public final boolean isDisposed() {
            return this.f20591c.isDisposed();
        }

        public final void onComplete() {
            if (!this.f20592d) {
                this.f20592d = true;
                this.f20589a.onComplete();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20591c, cVar)) {
                this.f20591c = cVar;
                this.f20589a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (!this.f20592d) {
                this.f20592d = true;
                this.f20589a.onError(th);
                return;
            }
            C7332a.m23029a(th);
        }

        public final void onNext(T t) {
            if (!this.f20592d) {
                this.f20589a.onNext(t);
                try {
                    if (this.f20590b.mo9283a(t)) {
                        this.f20592d = true;
                        this.f20591c.dispose();
                        this.f20589a.onComplete();
                    }
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    this.f20591c.dispose();
                    onError(th);
                }
            }
        }

        C7425a(C7498y<? super T> yVar, C7328l<? super T> lVar) {
            this.f20589a = yVar;
            this.f20590b = lVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C7425a(yVar, this.f20588b));
    }

    public C7424ay(C7496w<T> wVar, C7328l<? super T> lVar) {
        super(wVar);
        this.f20588b = lVar;
    }
}
