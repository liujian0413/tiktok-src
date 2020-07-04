package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.observers.C47608a;
import p346io.reactivex.p348d.C7328l;

/* renamed from: io.reactivex.internal.operators.observable.s */
public final class C7472s<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7328l<? super T> f20790b;

    /* renamed from: io.reactivex.internal.operators.observable.s$a */
    static final class C7473a<T> extends C47608a<T, T> {

        /* renamed from: f */
        final C7328l<? super T> f20791f;

        public final T poll() throws Exception {
            T poll;
            do {
                poll = this.f122053c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f20791f.mo9283a(poll));
            return poll;
        }

        public final int requestFusion(int i) {
            return mo119704a(i);
        }

        public final void onNext(T t) {
            if (this.f122055e == 0) {
                try {
                    if (this.f20791f.mo9283a(t)) {
                        this.f122051a.onNext(t);
                    }
                } catch (Throwable th) {
                    mo119705a(th);
                }
            } else {
                this.f122051a.onNext(null);
            }
        }

        C7473a(C7498y<? super T> yVar, C7328l<? super T> lVar) {
            super(yVar);
            this.f20791f = lVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C7473a(yVar, this.f20790b));
    }

    public C7472s(C7496w<T> wVar, C7328l<? super T> lVar) {
        super(wVar);
        this.f20790b = lVar;
    }
}
