package p346io.reactivex.internal.operators.p1872b;

import p346io.reactivex.C47557ad;
import p346io.reactivex.C7320af;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.observers.DeferredScalarDisposable;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.b.s */
public final class C47656s<T> extends C7492s<T> {

    /* renamed from: a */
    final C7320af<? extends T> f122145a;

    /* renamed from: io.reactivex.internal.operators.b.s$a */
    static final class C47657a<T> extends DeferredScalarDisposable<T> implements C47557ad<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: a */
        C7321c f122146a;

        public final void dispose() {
            super.dispose();
            this.f122146a.dispose();
        }

        C47657a(C7498y<? super T> yVar) {
            super(yVar);
        }

        public final void onError(Throwable th) {
            error(th);
        }

        public final void onSuccess(T t) {
            complete(t);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122146a, cVar)) {
                this.f122146a = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C47656s(C7320af<? extends T> afVar) {
        this.f122145a = afVar;
    }

    /* renamed from: d */
    private static <T> C47557ad<T> m148444d(C7498y<? super T> yVar) {
        return new C47657a(yVar);
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f122145a.mo19137b(m148444d(yVar));
    }
}
