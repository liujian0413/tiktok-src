package p346io.reactivex.internal.operators.observable;

import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.y */
public final class C47787y<T> extends C7492s<T> {

    /* renamed from: a */
    final C7704b<? extends T> f122503a;

    /* renamed from: io.reactivex.internal.operators.observable.y$a */
    static final class C47788a<T> implements C7321c, C47597i<T> {

        /* renamed from: a */
        final C7498y<? super T> f122504a;

        /* renamed from: b */
        C48294d f122505b;

        public final void onComplete() {
            this.f122504a.onComplete();
        }

        public final void dispose() {
            this.f122505b.cancel();
            this.f122505b = SubscriptionHelper.CANCELLED;
        }

        public final boolean isDisposed() {
            if (this.f122505b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        C47788a(C7498y<? super T> yVar) {
            this.f122504a = yVar;
        }

        public final void onError(Throwable th) {
            this.f122504a.onError(th);
        }

        public final void onNext(T t) {
            this.f122504a.onNext(t);
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122505b, dVar)) {
                this.f122505b = dVar;
                this.f122504a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public C47787y(C7704b<? extends T> bVar) {
        this.f122503a = bVar;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f122503a.mo19155a(new C47788a(yVar));
    }
}
