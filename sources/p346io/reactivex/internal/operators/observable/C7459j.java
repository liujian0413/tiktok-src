package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.observers.C47608a;
import p346io.reactivex.p348d.C7325d;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.observable.j */
public final class C7459j<T, K> extends C7376a<T, T> {

    /* renamed from: b */
    final C7327h<? super T, K> f20751b;

    /* renamed from: c */
    final C7325d<? super K, ? super K> f20752c;

    /* renamed from: io.reactivex.internal.operators.observable.j$a */
    static final class C7460a<T, K> extends C47608a<T, T> {

        /* renamed from: f */
        final C7327h<? super T, K> f20753f;

        /* renamed from: g */
        final C7325d<? super K, ? super K> f20754g;

        /* renamed from: h */
        K f20755h;

        /* renamed from: i */
        boolean f20756i;

        public final T poll() throws Exception {
            while (true) {
                T poll = this.f122053c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f20753f.apply(poll);
                if (!this.f20756i) {
                    this.f20756i = true;
                    this.f20755h = apply;
                    return poll;
                } else if (!this.f20754g.mo19141a(this.f20755h, apply)) {
                    this.f20755h = apply;
                    return poll;
                } else {
                    this.f20755h = apply;
                }
            }
        }

        public final int requestFusion(int i) {
            return mo119704a(i);
        }

        public final void onNext(T t) {
            if (!this.f122054d) {
                if (this.f122055e != 0) {
                    this.f122051a.onNext(t);
                    return;
                }
                try {
                    K apply = this.f20753f.apply(t);
                    if (this.f20756i) {
                        boolean a = this.f20754g.mo19141a(this.f20755h, apply);
                        this.f20755h = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.f20756i = true;
                        this.f20755h = apply;
                    }
                    this.f122051a.onNext(t);
                } catch (Throwable th) {
                    mo119705a(th);
                }
            }
        }

        C7460a(C7498y<? super T> yVar, C7327h<? super T, K> hVar, C7325d<? super K, ? super K> dVar) {
            super(yVar);
            this.f20753f = hVar;
            this.f20754g = dVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C7460a(yVar, this.f20751b, this.f20752c));
    }

    public C7459j(C7496w<T> wVar, C7327h<? super T, K> hVar, C7325d<? super K, ? super K> dVar) {
        super(wVar);
        this.f20751b = hVar;
        this.f20752c = dVar;
    }
}
