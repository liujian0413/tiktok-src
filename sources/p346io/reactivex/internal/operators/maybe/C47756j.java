package p346io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7491p;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.maybe.j */
public final class C47756j<T> extends C47740a<T, T> {

    /* renamed from: b */
    final C7499z f122426b;

    /* renamed from: io.reactivex.internal.operators.maybe.j$a */
    static final class C47757a<T> extends AtomicReference<C7321c> implements C7321c, C47856n<T> {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final SequentialDisposable f122427a = new SequentialDisposable();

        /* renamed from: b */
        final C47856n<? super T> f122428b;

        public final void onComplete() {
            this.f122428b.onComplete();
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f122427a.dispose();
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            this.f122428b.onError(th);
        }

        public final void onSuccess(T t) {
            this.f122428b.onSuccess(t);
        }

        C47757a(C47856n<? super T> nVar) {
            this.f122428b = nVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.j$b */
    static final class C47758b<T> implements Runnable {

        /* renamed from: a */
        final C47856n<? super T> f122429a;

        /* renamed from: b */
        final C7491p<T> f122430b;

        public final void run() {
            this.f122430b.mo19277b(this.f122429a);
        }

        C47758b(C47856n<? super T> nVar, C7491p<T> pVar) {
            this.f122429a = nVar;
            this.f122430b = pVar;
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        C47757a aVar = new C47757a(nVar);
        nVar.onSubscribe(aVar);
        aVar.f122427a.replace(this.f122426b.mo19335a(new C47758b(aVar, this.f122391a)));
    }

    public C47756j(C7491p<T> pVar, C7499z zVar) {
        super(pVar);
        this.f122426b = zVar;
    }
}
