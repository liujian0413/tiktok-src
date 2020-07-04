package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.observers.C47608a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: io.reactivex.internal.operators.observable.k */
public final class C7461k<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7326g<? super T> f20757b;

    /* renamed from: io.reactivex.internal.operators.observable.k$a */
    static final class C7462a<T> extends C47608a<T, T> {

        /* renamed from: f */
        final C7326g<? super T> f20758f;

        public final T poll() throws Exception {
            T poll = this.f122053c.poll();
            if (poll != null) {
                this.f20758f.accept(poll);
            }
            return poll;
        }

        public final int requestFusion(int i) {
            return mo119704a(i);
        }

        public final void onNext(T t) {
            this.f122051a.onNext(t);
            if (this.f122055e == 0) {
                try {
                    this.f20758f.accept(t);
                } catch (Throwable th) {
                    mo119705a(th);
                }
            }
        }

        C7462a(C7498y<? super T> yVar, C7326g<? super T> gVar) {
            super(yVar);
            this.f20758f = gVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C7462a(yVar, this.f20757b));
    }

    public C7461k(C7496w<T> wVar, C7326g<? super T> gVar) {
        super(wVar);
        this.f20757b = gVar;
    }
}
