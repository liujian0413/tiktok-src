package p346io.reactivex.internal.operators.p1872b;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.b.p */
public final class C47650p<T> extends C7319aa<T> {

    /* renamed from: a */
    final C7320af<? extends T> f122134a;

    /* renamed from: b */
    final C7499z f122135b;

    /* renamed from: io.reactivex.internal.operators.b.p$a */
    static final class C47651a<T> extends AtomicReference<C7321c> implements C47557ad<T>, C7321c, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: a */
        final C47557ad<? super T> f122136a;

        /* renamed from: b */
        final SequentialDisposable f122137b = new SequentialDisposable();

        /* renamed from: c */
        final C7320af<? extends T> f122138c;

        public final void run() {
            this.f122138c.mo19137b(this);
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f122137b.dispose();
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            this.f122136a.onError(th);
        }

        public final void onSuccess(T t) {
            this.f122136a.onSuccess(t);
        }

        C47651a(C47557ad<? super T> adVar, C7320af<? extends T> afVar) {
            this.f122136a = adVar;
            this.f122138c = afVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        C47651a aVar = new C47651a(adVar, this.f122134a);
        adVar.onSubscribe(aVar);
        aVar.f122137b.replace(this.f122135b.mo19335a(aVar));
    }

    public C47650p(C7320af<? extends T> afVar, C7499z zVar) {
        this.f122134a = afVar;
        this.f122135b = zVar;
    }
}
