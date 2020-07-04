package p346io.reactivex.internal.operators.p1872b;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.b.g */
public final class C47634g<T, R> extends C7319aa<R> {

    /* renamed from: a */
    final C7320af<? extends T> f122104a;

    /* renamed from: b */
    final C7327h<? super T, ? extends C7320af<? extends R>> f122105b;

    /* renamed from: io.reactivex.internal.operators.b.g$a */
    static final class C47635a<T, R> extends AtomicReference<C7321c> implements C47557ad<T>, C7321c {
        private static final long serialVersionUID = 3258103020495908596L;

        /* renamed from: a */
        final C47557ad<? super R> f122106a;

        /* renamed from: b */
        final C7327h<? super T, ? extends C7320af<? extends R>> f122107b;

        /* renamed from: io.reactivex.internal.operators.b.g$a$a */
        static final class C47636a<R> implements C47557ad<R> {

            /* renamed from: a */
            final AtomicReference<C7321c> f122108a;

            /* renamed from: b */
            final C47557ad<? super R> f122109b;

            public final void onError(Throwable th) {
                this.f122109b.onError(th);
            }

            public final void onSubscribe(C7321c cVar) {
                DisposableHelper.replace(this.f122108a, cVar);
            }

            public final void onSuccess(R r) {
                this.f122109b.onSuccess(r);
            }

            C47636a(AtomicReference<C7321c> atomicReference, C47557ad<? super R> adVar) {
                this.f122108a = atomicReference;
                this.f122109b = adVar;
            }
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final void onError(Throwable th) {
            this.f122106a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.setOnce(this, cVar)) {
                this.f122106a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            try {
                C7320af afVar = (C7320af) C7364b.m23081a(this.f122107b.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    afVar.mo19137b(new C47636a(this, this.f122106a));
                }
            } catch (Throwable th) {
                C7331a.m23009b(th);
                this.f122106a.onError(th);
            }
        }

        C47635a(C47557ad<? super R> adVar, C7327h<? super T, ? extends C7320af<? extends R>> hVar) {
            this.f122106a = adVar;
            this.f122107b = hVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super R> adVar) {
        this.f122104a.mo19137b(new C47635a(adVar, this.f122105b));
    }

    public C47634g(C7320af<? extends T> afVar, C7327h<? super T, ? extends C7320af<? extends R>> hVar) {
        this.f122105b = hVar;
        this.f122104a = afVar;
    }
}
