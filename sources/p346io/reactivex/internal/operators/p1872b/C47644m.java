package p346io.reactivex.internal.operators.p1872b;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.b.m */
public final class C47644m<T> extends C7319aa<T> {

    /* renamed from: a */
    final C7320af<T> f122119a;

    /* renamed from: b */
    final C7499z f122120b;

    /* renamed from: io.reactivex.internal.operators.b.m$a */
    static final class C47645a<T> extends AtomicReference<C7321c> implements C47557ad<T>, C7321c, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* renamed from: a */
        final C47557ad<? super T> f122121a;

        /* renamed from: b */
        final C7499z f122122b;

        /* renamed from: c */
        T f122123c;

        /* renamed from: d */
        Throwable f122124d;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final void run() {
            Throwable th = this.f122124d;
            if (th != null) {
                this.f122121a.onError(th);
            } else {
                this.f122121a.onSuccess(this.f122123c);
            }
        }

        public final void onError(Throwable th) {
            this.f122124d = th;
            DisposableHelper.replace(this, this.f122122b.mo19335a(this));
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.setOnce(this, cVar)) {
                this.f122121a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.f122123c = t;
            DisposableHelper.replace(this, this.f122122b.mo19335a(this));
        }

        C47645a(C47557ad<? super T> adVar, C7499z zVar) {
            this.f122121a = adVar;
            this.f122122b = zVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        this.f122119a.mo19137b(new C47645a(adVar, this.f122120b));
    }

    public C47644m(C7320af<T> afVar, C7499z zVar) {
        this.f122119a = afVar;
        this.f122120b = zVar;
    }
}
