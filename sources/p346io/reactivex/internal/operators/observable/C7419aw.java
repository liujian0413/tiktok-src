package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.aw */
public final class C7419aw<T> extends C7376a<T, T> {

    /* renamed from: b */
    final long f20577b;

    /* renamed from: io.reactivex.internal.operators.observable.aw$a */
    static final class C7420a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20578a;

        /* renamed from: b */
        boolean f20579b;

        /* renamed from: c */
        C7321c f20580c;

        /* renamed from: d */
        long f20581d;

        public final void dispose() {
            this.f20580c.dispose();
        }

        public final boolean isDisposed() {
            return this.f20580c.isDisposed();
        }

        public final void onComplete() {
            if (!this.f20579b) {
                this.f20579b = true;
                this.f20580c.dispose();
                this.f20578a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.f20579b) {
                C7332a.m23029a(th);
                return;
            }
            this.f20579b = true;
            this.f20580c.dispose();
            this.f20578a.onError(th);
        }

        public final void onNext(T t) {
            boolean z;
            if (!this.f20579b) {
                long j = this.f20581d;
                this.f20581d = j - 1;
                if (j > 0) {
                    if (this.f20581d == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f20578a.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20580c, cVar)) {
                this.f20580c = cVar;
                if (this.f20581d == 0) {
                    this.f20579b = true;
                    cVar.dispose();
                    EmptyDisposable.complete(this.f20578a);
                    return;
                }
                this.f20578a.onSubscribe(this);
            }
        }

        C7420a(C7498y<? super T> yVar, long j) {
            this.f20578a = yVar;
            this.f20581d = j;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C7420a(yVar, this.f20577b));
    }

    public C7419aw(C7496w<T> wVar, long j) {
        super(wVar);
        this.f20577b = j;
    }
}
