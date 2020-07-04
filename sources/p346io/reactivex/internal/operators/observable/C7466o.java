package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C47856n;
import p346io.reactivex.C7490k;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p353b.C7366c;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.o */
public final class C7466o<T> extends C7490k<T> implements C7366c<T> {

    /* renamed from: a */
    final C7496w<T> f20772a;

    /* renamed from: b */
    final long f20773b;

    /* renamed from: io.reactivex.internal.operators.observable.o$a */
    static final class C7467a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C47856n<? super T> f20774a;

        /* renamed from: b */
        final long f20775b;

        /* renamed from: c */
        C7321c f20776c;

        /* renamed from: d */
        long f20777d;

        /* renamed from: e */
        boolean f20778e;

        public final void dispose() {
            this.f20776c.dispose();
        }

        public final boolean isDisposed() {
            return this.f20776c.isDisposed();
        }

        public final void onComplete() {
            if (!this.f20778e) {
                this.f20778e = true;
                this.f20774a.onComplete();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20776c, cVar)) {
                this.f20776c = cVar;
                this.f20774a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f20778e) {
                C7332a.m23029a(th);
                return;
            }
            this.f20778e = true;
            this.f20774a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f20778e) {
                long j = this.f20777d;
                if (j == this.f20775b) {
                    this.f20778e = true;
                    this.f20776c.dispose();
                    this.f20774a.onSuccess(t);
                    return;
                }
                this.f20777d = j + 1;
            }
        }

        C7467a(C47856n<? super T> nVar, long j) {
            this.f20774a = nVar;
            this.f20775b = j;
        }
    }

    public final C7492s<T> bZ_() {
        C47785n nVar = new C47785n(this.f20772a, this.f20773b, null, false);
        return C7332a.m23018a((C7492s<T>) nVar);
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        this.f20772a.mo19189a(new C7467a(nVar, this.f20773b));
    }

    public C7466o(C7496w<T> wVar, long j) {
        this.f20772a = wVar;
        this.f20773b = j;
    }
}
