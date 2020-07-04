package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.l */
public final class C7463l<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7326g<? super T> f20759b;

    /* renamed from: c */
    final C7326g<? super Throwable> f20760c;

    /* renamed from: d */
    final C7323a f20761d;

    /* renamed from: e */
    final C7323a f20762e;

    /* renamed from: io.reactivex.internal.operators.observable.l$a */
    static final class C7464a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20763a;

        /* renamed from: b */
        final C7326g<? super T> f20764b;

        /* renamed from: c */
        final C7326g<? super Throwable> f20765c;

        /* renamed from: d */
        final C7323a f20766d;

        /* renamed from: e */
        final C7323a f20767e;

        /* renamed from: f */
        C7321c f20768f;

        /* renamed from: g */
        boolean f20769g;

        public final void dispose() {
            this.f20768f.dispose();
        }

        public final boolean isDisposed() {
            return this.f20768f.isDisposed();
        }

        public final void onComplete() {
            if (!this.f20769g) {
                try {
                    this.f20766d.mo8975a();
                    this.f20769g = true;
                    this.f20763a.onComplete();
                    try {
                        this.f20767e.mo8975a();
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        C7332a.m23029a(th);
                    }
                } catch (Throwable th2) {
                    C7331a.m23009b(th2);
                    onError(th2);
                }
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20768f, cVar)) {
                this.f20768f = cVar;
                this.f20763a.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.f20769g) {
                try {
                    this.f20764b.accept(t);
                    this.f20763a.onNext(t);
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    this.f20768f.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f20769g) {
                C7332a.m23029a(th);
                return;
            }
            this.f20769g = true;
            try {
                this.f20765c.accept(th);
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f20763a.onError(th);
            try {
                this.f20767e.mo8975a();
            } catch (Throwable th3) {
                C7331a.m23009b(th3);
                C7332a.m23029a(th3);
            }
        }

        C7464a(C7498y<? super T> yVar, C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7323a aVar2) {
            this.f20763a = yVar;
            this.f20764b = gVar;
            this.f20765c = gVar2;
            this.f20766d = aVar;
            this.f20767e = aVar2;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7496w wVar = this.f20473a;
        C7464a aVar = new C7464a(yVar, this.f20759b, this.f20760c, this.f20761d, this.f20762e);
        wVar.mo19189a(aVar);
    }

    public C7463l(C7496w<T> wVar, C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7323a aVar2) {
        super(wVar);
        this.f20759b = gVar;
        this.f20760c = gVar2;
        this.f20761d = aVar;
        this.f20762e = aVar2;
    }
}
