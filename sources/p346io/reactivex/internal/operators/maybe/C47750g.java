package p346io.reactivex.internal.operators.maybe;

import p346io.reactivex.C47856n;
import p346io.reactivex.C7491p;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7328l;

/* renamed from: io.reactivex.internal.operators.maybe.g */
public final class C47750g<T> extends C47740a<T, T> {

    /* renamed from: b */
    final C7328l<? super Throwable> f122409b;

    /* renamed from: io.reactivex.internal.operators.maybe.g$a */
    static final class C47751a<T> implements C7321c, C47856n<T> {

        /* renamed from: a */
        final C47856n<? super T> f122410a;

        /* renamed from: b */
        final C7328l<? super Throwable> f122411b;

        /* renamed from: c */
        C7321c f122412c;

        public final void dispose() {
            this.f122412c.dispose();
        }

        public final boolean isDisposed() {
            return this.f122412c.isDisposed();
        }

        public final void onComplete() {
            this.f122410a.onComplete();
        }

        public final void onSuccess(T t) {
            this.f122410a.onSuccess(t);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122412c, cVar)) {
                this.f122412c = cVar;
                this.f122410a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            try {
                if (this.f122411b.mo9283a(th)) {
                    this.f122410a.onComplete();
                } else {
                    this.f122410a.onError(th);
                }
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.f122410a.onError(new CompositeException(th, th2));
            }
        }

        C47751a(C47856n<? super T> nVar, C7328l<? super Throwable> lVar) {
            this.f122410a = nVar;
            this.f122411b = lVar;
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        this.f122391a.mo19277b(new C47751a(nVar, this.f122409b));
    }

    public C47750g(C7491p<T> pVar, C7328l<? super Throwable> lVar) {
        super(pVar);
        this.f122409b = lVar;
    }
}
