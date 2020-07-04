package p346io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p353b.C7366c;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.p */
public final class C7468p<T> extends C7319aa<T> implements C7366c<T> {

    /* renamed from: a */
    final C7496w<T> f20779a;

    /* renamed from: b */
    final long f20780b;

    /* renamed from: c */
    final T f20781c = null;

    /* renamed from: io.reactivex.internal.operators.observable.p$a */
    static final class C7469a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C47557ad<? super T> f20782a;

        /* renamed from: b */
        final long f20783b;

        /* renamed from: c */
        final T f20784c;

        /* renamed from: d */
        C7321c f20785d;

        /* renamed from: e */
        long f20786e;

        /* renamed from: f */
        boolean f20787f;

        public final void dispose() {
            this.f20785d.dispose();
        }

        public final boolean isDisposed() {
            return this.f20785d.isDisposed();
        }

        public final void onComplete() {
            if (!this.f20787f) {
                this.f20787f = true;
                T t = this.f20784c;
                if (t != null) {
                    this.f20782a.onSuccess(t);
                    return;
                }
                this.f20782a.onError(new NoSuchElementException());
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20785d, cVar)) {
                this.f20785d = cVar;
                this.f20782a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f20787f) {
                C7332a.m23029a(th);
                return;
            }
            this.f20787f = true;
            this.f20782a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f20787f) {
                long j = this.f20786e;
                if (j == this.f20783b) {
                    this.f20787f = true;
                    this.f20785d.dispose();
                    this.f20782a.onSuccess(t);
                    return;
                }
                this.f20786e = j + 1;
            }
        }

        C7469a(C47557ad<? super T> adVar, long j, T t) {
            this.f20782a = adVar;
            this.f20783b = j;
            this.f20784c = t;
        }
    }

    public final C7492s<T> bZ_() {
        C47785n nVar = new C47785n(this.f20779a, this.f20780b, this.f20781c, true);
        return C7332a.m23018a((C7492s<T>) nVar);
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        this.f20779a.mo19189a(new C7469a(adVar, this.f20780b, this.f20781c));
    }

    public C7468p(C7496w<T> wVar, long j, T t) {
        this.f20779a = wVar;
        this.f20780b = j;
    }
}
