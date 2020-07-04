package p346io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.n */
public final class C47785n<T> extends C7376a<T, T> {

    /* renamed from: b */
    final long f122493b;

    /* renamed from: c */
    final T f122494c;

    /* renamed from: d */
    final boolean f122495d;

    /* renamed from: io.reactivex.internal.operators.observable.n$a */
    static final class C47786a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f122496a;

        /* renamed from: b */
        final long f122497b;

        /* renamed from: c */
        final T f122498c;

        /* renamed from: d */
        final boolean f122499d;

        /* renamed from: e */
        C7321c f122500e;

        /* renamed from: f */
        long f122501f;

        /* renamed from: g */
        boolean f122502g;

        public final void dispose() {
            this.f122500e.dispose();
        }

        public final boolean isDisposed() {
            return this.f122500e.isDisposed();
        }

        public final void onComplete() {
            if (!this.f122502g) {
                this.f122502g = true;
                T t = this.f122498c;
                if (t != null || !this.f122499d) {
                    if (t != null) {
                        this.f122496a.onNext(t);
                    }
                    this.f122496a.onComplete();
                } else {
                    this.f122496a.onError(new NoSuchElementException());
                }
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122500e, cVar)) {
                this.f122500e = cVar;
                this.f122496a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f122502g) {
                C7332a.m23029a(th);
                return;
            }
            this.f122502g = true;
            this.f122496a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f122502g) {
                long j = this.f122501f;
                if (j == this.f122497b) {
                    this.f122502g = true;
                    this.f122500e.dispose();
                    this.f122496a.onNext(t);
                    this.f122496a.onComplete();
                    return;
                }
                this.f122501f = j + 1;
            }
        }

        C47786a(C7498y<? super T> yVar, long j, T t, boolean z) {
            this.f122496a = yVar;
            this.f122497b = j;
            this.f122498c = t;
            this.f122499d = z;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7496w wVar = this.f20473a;
        C47786a aVar = new C47786a(yVar, this.f122493b, this.f122494c, this.f122495d);
        wVar.mo19189a(aVar);
    }

    public C47785n(C7496w<T> wVar, long j, T t, boolean z) {
        super(wVar);
        this.f122493b = j;
        this.f122494c = t;
        this.f122495d = z;
    }
}
