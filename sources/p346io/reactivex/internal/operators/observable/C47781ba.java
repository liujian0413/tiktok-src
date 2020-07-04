package p346io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.ba */
public final class C47781ba<T, U extends Collection<? super T>> extends C7376a<T, U> {

    /* renamed from: b */
    final Callable<U> f122485b;

    /* renamed from: io.reactivex.internal.operators.observable.ba$a */
    static final class C47782a<T, U extends Collection<? super T>> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super U> f122486a;

        /* renamed from: b */
        C7321c f122487b;

        /* renamed from: c */
        U f122488c;

        public final void dispose() {
            this.f122487b.dispose();
        }

        public final boolean isDisposed() {
            return this.f122487b.isDisposed();
        }

        public final void onComplete() {
            U u = this.f122488c;
            this.f122488c = null;
            this.f122486a.onNext(u);
            this.f122486a.onComplete();
        }

        public final void onNext(T t) {
            this.f122488c.add(t);
        }

        public final void onError(Throwable th) {
            this.f122488c = null;
            this.f122486a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122487b, cVar)) {
                this.f122487b = cVar;
                this.f122486a.onSubscribe(this);
            }
        }

        C47782a(C7498y<? super U> yVar, U u) {
            this.f122486a = yVar;
            this.f122488c = u;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super U> yVar) {
        try {
            this.f20473a.mo19189a(new C47782a(yVar, (Collection) C7364b.m23081a(this.f122485b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C7331a.m23009b(th);
            EmptyDisposable.error(th, yVar);
        }
    }

    public C47781ba(C7496w<T> wVar, Callable<U> callable) {
        super(wVar);
        this.f122485b = callable;
    }
}
