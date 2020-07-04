package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.av */
public final class C7417av<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7496w<? extends T> f20572b;

    /* renamed from: io.reactivex.internal.operators.observable.av$a */
    static final class C7418a<T> implements C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20573a;

        /* renamed from: b */
        final C7496w<? extends T> f20574b;

        /* renamed from: c */
        final SequentialDisposable f20575c = new SequentialDisposable();

        /* renamed from: d */
        boolean f20576d = true;

        public final void onComplete() {
            if (this.f20576d) {
                this.f20576d = false;
                this.f20574b.mo19189a(this);
                return;
            }
            this.f20573a.onComplete();
        }

        public final void onError(Throwable th) {
            this.f20573a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            this.f20575c.update(cVar);
        }

        public final void onNext(T t) {
            if (this.f20576d) {
                this.f20576d = false;
            }
            this.f20573a.onNext(t);
        }

        C7418a(C7498y<? super T> yVar, C7496w<? extends T> wVar) {
            this.f20573a = yVar;
            this.f20574b = wVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7418a aVar = new C7418a(yVar, this.f20572b);
        yVar.onSubscribe(aVar.f20575c);
        this.f20473a.mo19189a(aVar);
    }

    public C7417av(C7496w<T> wVar, C7496w<? extends T> wVar2) {
        super(wVar);
        this.f20572b = wVar2;
    }
}
