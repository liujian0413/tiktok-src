package p346io.reactivex.internal.operators.maybe;

import p346io.reactivex.C47856n;
import p346io.reactivex.C7491p;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.maybe.h */
public final class C47752h<T> extends C47740a<T, T> {

    /* renamed from: b */
    final C7327h<? super Throwable, ? extends T> f122413b;

    /* renamed from: io.reactivex.internal.operators.maybe.h$a */
    static final class C47753a<T> implements C7321c, C47856n<T> {

        /* renamed from: a */
        final C47856n<? super T> f122414a;

        /* renamed from: b */
        final C7327h<? super Throwable, ? extends T> f122415b;

        /* renamed from: c */
        C7321c f122416c;

        public final void dispose() {
            this.f122416c.dispose();
        }

        public final boolean isDisposed() {
            return this.f122416c.isDisposed();
        }

        public final void onComplete() {
            this.f122414a.onComplete();
        }

        public final void onSuccess(T t) {
            this.f122414a.onSuccess(t);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122416c, cVar)) {
                this.f122416c = cVar;
                this.f122414a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            try {
                this.f122414a.onSuccess(C7364b.m23081a(this.f122415b.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.f122414a.onError(new CompositeException(th, th2));
            }
        }

        C47753a(C47856n<? super T> nVar, C7327h<? super Throwable, ? extends T> hVar) {
            this.f122414a = nVar;
            this.f122415b = hVar;
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        this.f122391a.mo19277b(new C47753a(nVar, this.f122413b));
    }

    public C47752h(C7491p<T> pVar, C7327h<? super Throwable, ? extends T> hVar) {
        super(pVar);
        this.f122413b = hVar;
    }
}
