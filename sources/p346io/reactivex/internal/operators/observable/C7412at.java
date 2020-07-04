package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7328l;

/* renamed from: io.reactivex.internal.operators.observable.at */
public final class C7412at<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7328l<? super T> f20562b;

    /* renamed from: io.reactivex.internal.operators.observable.at$a */
    static final class C7413a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20563a;

        /* renamed from: b */
        final C7328l<? super T> f20564b;

        /* renamed from: c */
        C7321c f20565c;

        /* renamed from: d */
        boolean f20566d;

        public final void dispose() {
            this.f20565c.dispose();
        }

        public final boolean isDisposed() {
            return this.f20565c.isDisposed();
        }

        public final void onComplete() {
            this.f20563a.onComplete();
        }

        public final void onError(Throwable th) {
            this.f20563a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20565c, cVar)) {
                this.f20565c = cVar;
                this.f20563a.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.f20566d) {
                this.f20563a.onNext(t);
                return;
            }
            try {
                if (!this.f20564b.mo9283a(t)) {
                    this.f20566d = true;
                    this.f20563a.onNext(t);
                }
            } catch (Throwable th) {
                C7331a.m23009b(th);
                this.f20565c.dispose();
                this.f20563a.onError(th);
            }
        }

        C7413a(C7498y<? super T> yVar, C7328l<? super T> lVar) {
            this.f20563a = yVar;
            this.f20564b = lVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C7413a(yVar, this.f20562b));
    }

    public C7412at(C7496w<T> wVar, C7328l<? super T> lVar) {
        super(wVar);
        this.f20562b = lVar;
    }
}
