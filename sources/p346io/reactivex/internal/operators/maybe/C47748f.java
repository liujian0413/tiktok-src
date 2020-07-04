package p346io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7491p;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.maybe.f */
public final class C47748f<T> extends C47740a<T, T> {

    /* renamed from: b */
    final C7499z f122404b;

    /* renamed from: io.reactivex.internal.operators.maybe.f$a */
    static final class C47749a<T> extends AtomicReference<C7321c> implements C7321c, C47856n<T>, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final C47856n<? super T> f122405a;

        /* renamed from: b */
        final C7499z f122406b;

        /* renamed from: c */
        T f122407c;

        /* renamed from: d */
        Throwable f122408d;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final void onComplete() {
            DisposableHelper.replace(this, this.f122406b.mo19335a(this));
        }

        public final void run() {
            Throwable th = this.f122408d;
            if (th != null) {
                this.f122408d = null;
                this.f122405a.onError(th);
                return;
            }
            T t = this.f122407c;
            if (t != null) {
                this.f122407c = null;
                this.f122405a.onSuccess(t);
                return;
            }
            this.f122405a.onComplete();
        }

        public final void onError(Throwable th) {
            this.f122408d = th;
            DisposableHelper.replace(this, this.f122406b.mo19335a(this));
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.setOnce(this, cVar)) {
                this.f122405a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.f122407c = t;
            DisposableHelper.replace(this, this.f122406b.mo19335a(this));
        }

        C47749a(C47856n<? super T> nVar, C7499z zVar) {
            this.f122405a = nVar;
            this.f122406b = zVar;
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        this.f122391a.mo19277b(new C47749a(nVar, this.f122404b));
    }

    public C47748f(C7491p<T> pVar, C7499z zVar) {
        super(pVar);
        this.f122404b = zVar;
    }
}
