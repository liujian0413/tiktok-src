package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7498y;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: io.reactivex.internal.operators.observable.ad */
public final class C7381ad {

    /* renamed from: io.reactivex.internal.operators.observable.ad$a */
    static final class C7382a<T> implements C7323a {

        /* renamed from: a */
        final C7498y<T> f20479a;

        /* renamed from: a */
        public final void mo8975a() throws Exception {
            this.f20479a.onComplete();
        }

        C7382a(C7498y<T> yVar) {
            this.f20479a = yVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ad$b */
    static final class C7383b<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final C7498y<T> f20480a;

        C7383b(C7498y<T> yVar) {
            this.f20480a = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            this.f20480a.onError(th);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ad$c */
    static final class C7384c<T> implements C7326g<T> {

        /* renamed from: a */
        final C7498y<T> f20481a;

        C7384c(C7498y<T> yVar) {
            this.f20481a = yVar;
        }

        public final void accept(T t) throws Exception {
            this.f20481a.onNext(t);
        }
    }

    /* renamed from: a */
    public static <T> C7326g<T> m23103a(C7498y<T> yVar) {
        return new C7384c(yVar);
    }

    /* renamed from: b */
    public static <T> C7326g<Throwable> m23104b(C7498y<T> yVar) {
        return new C7383b(yVar);
    }

    /* renamed from: c */
    public static <T> C7323a m23105c(C7498y<T> yVar) {
        return new C7382a(yVar);
    }
}
