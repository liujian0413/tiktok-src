package p346io.reactivex.internal.operators.maybe;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7491p;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.maybe.l */
public final class C47762l<T, U> extends C47740a<T, T> {

    /* renamed from: b */
    final C7491p<U> f122435b;

    /* renamed from: c */
    final C7491p<? extends T> f122436c = null;

    /* renamed from: io.reactivex.internal.operators.maybe.l$a */
    static final class C47763a<T> extends AtomicReference<C7321c> implements C47856n<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final C47856n<? super T> f122437a;

        public final void onComplete() {
            this.f122437a.onComplete();
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        C47763a(C47856n<? super T> nVar) {
            this.f122437a = nVar;
        }

        public final void onError(Throwable th) {
            this.f122437a.onError(th);
        }

        public final void onSuccess(T t) {
            this.f122437a.onSuccess(t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.l$b */
    static final class C47764b<T, U> extends AtomicReference<C7321c> implements C7321c, C47856n<T> {
        private static final long serialVersionUID = -5955289211445418871L;

        /* renamed from: a */
        final C47856n<? super T> f122438a;

        /* renamed from: b */
        final C47765c<T, U> f122439b = new C47765c<>(this);

        /* renamed from: c */
        final C7491p<? extends T> f122440c;

        /* renamed from: d */
        final C47763a<T> f122441d;

        public final void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f122439b);
            C47763a<T> aVar = this.f122441d;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        /* renamed from: a */
        public final void mo119776a() {
            if (DisposableHelper.dispose(this)) {
                if (this.f122440c == null) {
                    this.f122438a.onError(new TimeoutException());
                    return;
                }
                this.f122440c.mo19277b(this.f122441d);
            }
        }

        public final void onComplete() {
            DisposableHelper.dispose(this.f122439b);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.f122438a.onComplete();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        /* renamed from: a */
        public final void mo119777a(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.f122438a.onError(th);
            } else {
                C7332a.m23029a(th);
            }
        }

        public final void onError(Throwable th) {
            DisposableHelper.dispose(this.f122439b);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.f122438a.onError(th);
            } else {
                C7332a.m23029a(th);
            }
        }

        public final void onSuccess(T t) {
            DisposableHelper.dispose(this.f122439b);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.f122438a.onSuccess(t);
            }
        }

        C47764b(C47856n<? super T> nVar, C7491p<? extends T> pVar) {
            C47763a<T> aVar;
            this.f122438a = nVar;
            this.f122440c = pVar;
            if (pVar != null) {
                aVar = new C47763a<>(nVar);
            } else {
                aVar = null;
            }
            this.f122441d = aVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.l$c */
    static final class C47765c<T, U> extends AtomicReference<C7321c> implements C47856n<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final C47764b<T, U> f122442a;

        public final void onComplete() {
            this.f122442a.mo119776a();
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        C47765c(C47764b<T, U> bVar) {
            this.f122442a = bVar;
        }

        public final void onError(Throwable th) {
            this.f122442a.mo119777a(th);
        }

        public final void onSuccess(Object obj) {
            this.f122442a.mo119776a();
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        C47764b bVar = new C47764b(nVar, this.f122436c);
        nVar.onSubscribe(bVar);
        this.f122435b.mo19277b(bVar.f122439b);
        this.f122391a.mo19277b(bVar);
    }

    public C47762l(C7491p<T> pVar, C7491p<U> pVar2, C7491p<? extends T> pVar3) {
        super(pVar);
        this.f122435b = pVar2;
    }
}
