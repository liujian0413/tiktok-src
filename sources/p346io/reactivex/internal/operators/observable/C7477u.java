package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.u */
public final class C7477u<T, R> extends C7376a<T, R> {

    /* renamed from: b */
    final C7327h<? super T, ? extends Iterable<? extends R>> f20819b;

    /* renamed from: io.reactivex.internal.operators.observable.u$a */
    static final class C7478a<T, R> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super R> f20820a;

        /* renamed from: b */
        final C7327h<? super T, ? extends Iterable<? extends R>> f20821b;

        /* renamed from: c */
        C7321c f20822c;

        public final boolean isDisposed() {
            return this.f20822c.isDisposed();
        }

        public final void dispose() {
            this.f20822c.dispose();
            this.f20822c = DisposableHelper.DISPOSED;
        }

        public final void onComplete() {
            if (this.f20822c != DisposableHelper.DISPOSED) {
                this.f20822c = DisposableHelper.DISPOSED;
                this.f20820a.onComplete();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20822c, cVar)) {
                this.f20822c = cVar;
                this.f20820a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f20822c == DisposableHelper.DISPOSED) {
                C7332a.m23029a(th);
                return;
            }
            this.f20822c = DisposableHelper.DISPOSED;
            this.f20820a.onError(th);
        }

        public final void onNext(T t) {
            if (this.f20822c != DisposableHelper.DISPOSED) {
                try {
                    C7498y<? super R> yVar = this.f20820a;
                    for (Object a : (Iterable) this.f20821b.apply(t)) {
                        try {
                            try {
                                yVar.onNext(C7364b.m23081a(a, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                C7331a.m23009b(th);
                                this.f20822c.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C7331a.m23009b(th2);
                            this.f20822c.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    C7331a.m23009b(th3);
                    this.f20822c.dispose();
                    onError(th3);
                }
            }
        }

        C7478a(C7498y<? super R> yVar, C7327h<? super T, ? extends Iterable<? extends R>> hVar) {
            this.f20820a = yVar;
            this.f20821b = hVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super R> yVar) {
        this.f20473a.mo19189a(new C7478a(yVar, this.f20819b));
    }

    public C7477u(C7496w<T> wVar, C7327h<? super T, ? extends Iterable<? extends R>> hVar) {
        super(wVar);
        this.f20819b = hVar;
    }
}
