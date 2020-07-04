package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.as */
public final class C7410as<T> extends C7376a<T, T> {

    /* renamed from: b */
    final long f20558b;

    /* renamed from: io.reactivex.internal.operators.observable.as$a */
    static final class C7411a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20559a;

        /* renamed from: b */
        long f20560b;

        /* renamed from: c */
        C7321c f20561c;

        public final void dispose() {
            this.f20561c.dispose();
        }

        public final boolean isDisposed() {
            return this.f20561c.isDisposed();
        }

        public final void onComplete() {
            this.f20559a.onComplete();
        }

        public final void onError(Throwable th) {
            this.f20559a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20561c, cVar)) {
                this.f20561c = cVar;
                this.f20559a.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.f20560b != 0) {
                this.f20560b--;
            } else {
                this.f20559a.onNext(t);
            }
        }

        C7411a(C7498y<? super T> yVar, long j) {
            this.f20559a = yVar;
            this.f20560b = j;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C7411a(yVar, this.f20558b));
    }

    public C7410as(C7496w<T> wVar, long j) {
        super(wVar);
        this.f20558b = j;
    }
}
