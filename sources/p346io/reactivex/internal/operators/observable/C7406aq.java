package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C47856n;
import p346io.reactivex.C7490k;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.aq */
public final class C7406aq<T> extends C7490k<T> {

    /* renamed from: a */
    final C7496w<T> f20546a;

    /* renamed from: io.reactivex.internal.operators.observable.aq$a */
    static final class C7407a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C47856n<? super T> f20547a;

        /* renamed from: b */
        C7321c f20548b;

        /* renamed from: c */
        T f20549c;

        /* renamed from: d */
        boolean f20550d;

        public final void dispose() {
            this.f20548b.dispose();
        }

        public final boolean isDisposed() {
            return this.f20548b.isDisposed();
        }

        public final void onComplete() {
            if (!this.f20550d) {
                this.f20550d = true;
                T t = this.f20549c;
                this.f20549c = null;
                if (t == null) {
                    this.f20547a.onComplete();
                } else {
                    this.f20547a.onSuccess(t);
                }
            }
        }

        C7407a(C47856n<? super T> nVar) {
            this.f20547a = nVar;
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20548b, cVar)) {
                this.f20548b = cVar;
                this.f20547a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f20550d) {
                C7332a.m23029a(th);
                return;
            }
            this.f20550d = true;
            this.f20547a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f20550d) {
                if (this.f20549c != null) {
                    this.f20550d = true;
                    this.f20548b.dispose();
                    this.f20547a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f20549c = t;
            }
        }
    }

    public C7406aq(C7496w<T> wVar) {
        this.f20546a = wVar;
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        this.f20546a.mo19189a(new C7407a(nVar));
    }
}
