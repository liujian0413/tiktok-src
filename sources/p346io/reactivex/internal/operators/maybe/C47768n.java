package p346io.reactivex.internal.operators.maybe;

import org.p361a.C48293c;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7491p;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.maybe.n */
public final class C47768n<T> extends C7329e<T> {

    /* renamed from: a */
    final C7491p<T> f122447a;

    /* renamed from: io.reactivex.internal.operators.maybe.n$a */
    static final class C47769a<T> extends DeferredScalarSubscription<T> implements C47856n<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: a */
        C7321c f122448a;

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void cancel() {
            super.cancel();
            this.f122448a.dispose();
        }

        C47769a(C48293c<? super T> cVar) {
            super(cVar);
        }

        public final void onSuccess(T t) {
            complete(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122448a, cVar)) {
                this.f122448a = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C47768n(C7491p<T> pVar) {
        this.f122447a = pVar;
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f122447a.mo19277b(new C47769a(cVar));
    }
}
