package p346io.reactivex.internal.operators.p1872b;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.observers.C47617j;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.b.o */
public final class C47648o<T> extends C7319aa<T> {

    /* renamed from: a */
    final C7320af<? extends T> f122130a;

    /* renamed from: b */
    final C7327h<? super Throwable, ? extends C7320af<? extends T>> f122131b;

    /* renamed from: io.reactivex.internal.operators.b.o$a */
    static final class C47649a<T> extends AtomicReference<C7321c> implements C47557ad<T>, C7321c {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: a */
        final C47557ad<? super T> f122132a;

        /* renamed from: b */
        final C7327h<? super Throwable, ? extends C7320af<? extends T>> f122133b;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final void onSuccess(T t) {
            this.f122132a.onSuccess(t);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.setOnce(this, cVar)) {
                this.f122132a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            try {
                ((C7320af) C7364b.m23081a(this.f122133b.apply(th), "The nextFunction returned a null SingleSource.")).mo19137b(new C47617j(this, this.f122132a));
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.f122132a.onError(new CompositeException(th, th2));
            }
        }

        C47649a(C47557ad<? super T> adVar, C7327h<? super Throwable, ? extends C7320af<? extends T>> hVar) {
            this.f122132a = adVar;
            this.f122133b = hVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        this.f122130a.mo19137b(new C47649a(adVar, this.f122131b));
    }

    public C47648o(C7320af<? extends T> afVar, C7327h<? super Throwable, ? extends C7320af<? extends T>> hVar) {
        this.f122130a = afVar;
        this.f122131b = hVar;
    }
}
