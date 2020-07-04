package p346io.reactivex.internal.operators.maybe;

import p346io.reactivex.C47557ad;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7320af;
import p346io.reactivex.C7490k;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7328l;

/* renamed from: io.reactivex.internal.operators.maybe.c */
public final class C47743c<T> extends C7490k<T> {

    /* renamed from: a */
    final C7320af<T> f122394a;

    /* renamed from: b */
    final C7328l<? super T> f122395b;

    /* renamed from: io.reactivex.internal.operators.maybe.c$a */
    static final class C47744a<T> implements C47557ad<T>, C7321c {

        /* renamed from: a */
        final C47856n<? super T> f122396a;

        /* renamed from: b */
        final C7328l<? super T> f122397b;

        /* renamed from: c */
        C7321c f122398c;

        public final boolean isDisposed() {
            return this.f122398c.isDisposed();
        }

        public final void dispose() {
            C7321c cVar = this.f122398c;
            this.f122398c = DisposableHelper.DISPOSED;
            cVar.dispose();
        }

        public final void onError(Throwable th) {
            this.f122396a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122398c, cVar)) {
                this.f122398c = cVar;
                this.f122396a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            try {
                if (this.f122397b.mo9283a(t)) {
                    this.f122396a.onSuccess(t);
                } else {
                    this.f122396a.onComplete();
                }
            } catch (Throwable th) {
                C7331a.m23009b(th);
                this.f122396a.onError(th);
            }
        }

        C47744a(C47856n<? super T> nVar, C7328l<? super T> lVar) {
            this.f122396a = nVar;
            this.f122397b = lVar;
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        this.f122394a.mo19137b(new C47744a(nVar, this.f122395b));
    }

    public C47743c(C7320af<T> afVar, C7328l<? super T> lVar) {
        this.f122394a = afVar;
        this.f122395b = lVar;
    }
}
