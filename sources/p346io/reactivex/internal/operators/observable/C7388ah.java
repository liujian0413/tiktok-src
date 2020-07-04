package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.observers.C47608a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.observable.ah */
public final class C7388ah<T, U> extends C7376a<T, U> {

    /* renamed from: b */
    final C7327h<? super T, ? extends U> f20489b;

    /* renamed from: io.reactivex.internal.operators.observable.ah$a */
    static final class C7389a<T, U> extends C47608a<T, U> {

        /* renamed from: f */
        final C7327h<? super T, ? extends U> f20490f;

        public final U poll() throws Exception {
            Object poll = this.f122053c.poll();
            if (poll != null) {
                return C7364b.m23081a(this.f20490f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        public final int requestFusion(int i) {
            return mo119704a(i);
        }

        public final void onNext(T t) {
            if (!this.f122054d) {
                if (this.f122055e != 0) {
                    this.f122051a.onNext(null);
                    return;
                }
                try {
                    this.f122051a.onNext(C7364b.m23081a(this.f20490f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo119705a(th);
                }
            }
        }

        C7389a(C7498y<? super U> yVar, C7327h<? super T, ? extends U> hVar) {
            super(yVar);
            this.f20490f = hVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super U> yVar) {
        this.f20473a.mo19189a(new C7389a(yVar, this.f20489b));
    }

    public C7388ah(C7496w<T> wVar, C7327h<? super T, ? extends U> hVar) {
        super(wVar);
        this.f20489b = hVar;
    }
}
