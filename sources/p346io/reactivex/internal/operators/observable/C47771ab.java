package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.ab */
public final class C47771ab<T> extends C7376a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.ab$a */
    static final class C47772a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f122449a;

        /* renamed from: b */
        C7321c f122450b;

        public final void onNext(T t) {
        }

        public final void dispose() {
            this.f122450b.dispose();
        }

        public final boolean isDisposed() {
            return this.f122450b.isDisposed();
        }

        public final void onComplete() {
            this.f122449a.onComplete();
        }

        C47772a(C7498y<? super T> yVar) {
            this.f122449a = yVar;
        }

        public final void onError(Throwable th) {
            this.f122449a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            this.f122450b = cVar;
            this.f122449a.onSubscribe(this);
        }
    }

    public C47771ab(C7496w<T> wVar) {
        super(wVar);
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C47772a(yVar));
    }
}
