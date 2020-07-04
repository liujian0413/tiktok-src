package p346io.reactivex.internal.operators.maybe;

import p346io.reactivex.C47856n;
import p346io.reactivex.C7491p;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.maybe.e */
public final class C47746e<T, R> extends C47740a<T, R> {

    /* renamed from: b */
    final C7327h<? super T, ? extends R> f122400b;

    /* renamed from: io.reactivex.internal.operators.maybe.e$a */
    static final class C47747a<T, R> implements C7321c, C47856n<T> {

        /* renamed from: a */
        final C47856n<? super R> f122401a;

        /* renamed from: b */
        final C7327h<? super T, ? extends R> f122402b;

        /* renamed from: c */
        C7321c f122403c;

        public final boolean isDisposed() {
            return this.f122403c.isDisposed();
        }

        public final void onComplete() {
            this.f122401a.onComplete();
        }

        public final void dispose() {
            C7321c cVar = this.f122403c;
            this.f122403c = DisposableHelper.DISPOSED;
            cVar.dispose();
        }

        public final void onError(Throwable th) {
            this.f122401a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122403c, cVar)) {
                this.f122403c = cVar;
                this.f122401a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            try {
                this.f122401a.onSuccess(C7364b.m23081a(this.f122402b.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                C7331a.m23009b(th);
                this.f122401a.onError(th);
            }
        }

        C47747a(C47856n<? super R> nVar, C7327h<? super T, ? extends R> hVar) {
            this.f122401a = nVar;
            this.f122402b = hVar;
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super R> nVar) {
        this.f122391a.mo19277b(new C47747a(nVar, this.f122400b));
    }

    public C47746e(C7491p<T> pVar, C7327h<? super T, ? extends R> hVar) {
        super(pVar);
        this.f122400b = hVar;
    }
}
