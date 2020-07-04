package p346io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.observers.C47608a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.i */
public final class C47783i<T, K> extends C7376a<T, T> {

    /* renamed from: b */
    final C7327h<? super T, K> f122489b;

    /* renamed from: c */
    final Callable<? extends Collection<? super K>> f122490c;

    /* renamed from: io.reactivex.internal.operators.observable.i$a */
    static final class C47784a<T, K> extends C47608a<T, T> {

        /* renamed from: f */
        final Collection<? super K> f122491f;

        /* renamed from: g */
        final C7327h<? super T, K> f122492g;

        public final void clear() {
            this.f122491f.clear();
            super.clear();
        }

        public final void onComplete() {
            if (!this.f122054d) {
                this.f122054d = true;
                this.f122491f.clear();
                this.f122051a.onComplete();
            }
        }

        public final T poll() throws Exception {
            T poll;
            do {
                poll = this.f122053c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f122491f.add(C7364b.m23081a(this.f122492g.apply(poll), "The keySelector returned a null key")));
            return poll;
        }

        public final int requestFusion(int i) {
            return mo119704a(i);
        }

        public final void onError(Throwable th) {
            if (this.f122054d) {
                C7332a.m23029a(th);
                return;
            }
            this.f122054d = true;
            this.f122491f.clear();
            this.f122051a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f122054d) {
                if (this.f122055e == 0) {
                    try {
                        if (this.f122491f.add(C7364b.m23081a(this.f122492g.apply(t), "The keySelector returned a null key"))) {
                            this.f122051a.onNext(t);
                        }
                    } catch (Throwable th) {
                        mo119705a(th);
                    }
                } else {
                    this.f122051a.onNext(null);
                }
            }
        }

        C47784a(C7498y<? super T> yVar, C7327h<? super T, K> hVar, Collection<? super K> collection) {
            super(yVar);
            this.f122492g = hVar;
            this.f122491f = collection;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        try {
            this.f20473a.mo19189a(new C47784a(yVar, this.f122489b, (Collection) C7364b.m23081a(this.f122490c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C7331a.m23009b(th);
            EmptyDisposable.error(th, yVar);
        }
    }

    public C47783i(C7496w<T> wVar, C7327h<? super T, K> hVar, Callable<? extends Collection<? super K>> callable) {
        super(wVar);
        this.f122489b = hVar;
        this.f122490c = callable;
    }
}
