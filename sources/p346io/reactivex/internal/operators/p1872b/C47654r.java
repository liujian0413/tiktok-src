package p346io.reactivex.internal.operators.p1872b;

import org.p361a.C48293c;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7320af;
import p346io.reactivex.C7329e;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.b.r */
public final class C47654r<T> extends C7329e<T> {

    /* renamed from: a */
    final C7320af<? extends T> f122143a;

    /* renamed from: io.reactivex.internal.operators.b.r$a */
    static final class C47655a<T> extends DeferredScalarSubscription<T> implements C47557ad<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: a */
        C7321c f122144a;

        public final void cancel() {
            super.cancel();
            this.f122144a.dispose();
        }

        C47655a(C48293c<? super T> cVar) {
            super(cVar);
        }

        public final void onSuccess(T t) {
            complete(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122144a, cVar)) {
                this.f122144a = cVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C47654r(C7320af<? extends T> afVar) {
        this.f122143a = afVar;
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f122143a.mo19137b(new C47655a(cVar));
    }
}
