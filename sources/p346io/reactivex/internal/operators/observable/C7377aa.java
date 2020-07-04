package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.aa */
public final class C7377aa<T> extends C7376a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.aa$a */
    static final class C7378a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20474a;

        /* renamed from: b */
        C7321c f20475b;

        public final void dispose() {
            this.f20475b.dispose();
        }

        public final boolean isDisposed() {
            return this.f20475b.isDisposed();
        }

        public final void onComplete() {
            this.f20474a.onComplete();
        }

        C7378a(C7498y<? super T> yVar) {
            this.f20474a = yVar;
        }

        public final void onError(Throwable th) {
            this.f20474a.onError(th);
        }

        public final void onNext(T t) {
            this.f20474a.onNext(t);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20475b, cVar)) {
                this.f20475b = cVar;
                this.f20474a.onSubscribe(this);
            }
        }
    }

    public C7377aa(C7496w<T> wVar) {
        super(wVar);
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C7378a(yVar));
    }
}
