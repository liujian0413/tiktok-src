package p346io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.C47597i;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7491p;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.maybe.k */
public final class C47759k<T, U> extends C47740a<T, T> {

    /* renamed from: b */
    final C7704b<U> f122431b;

    /* renamed from: io.reactivex.internal.operators.maybe.k$a */
    static final class C47760a<T, U> extends AtomicReference<C7321c> implements C7321c, C47856n<T> {
        private static final long serialVersionUID = -2187421758664251153L;

        /* renamed from: a */
        final C47856n<? super T> f122432a;

        /* renamed from: b */
        final C47761a<U> f122433b = new C47761a<>(this);

        /* renamed from: io.reactivex.internal.operators.maybe.k$a$a */
        static final class C47761a<U> extends AtomicReference<C48294d> implements C47597i<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* renamed from: a */
            final C47760a<?, U> f122434a;

            public final void onComplete() {
                this.f122434a.mo119774a();
            }

            C47761a(C47760a<?, U> aVar) {
                this.f122434a = aVar;
            }

            public final void onError(Throwable th) {
                this.f122434a.mo119775a(th);
            }

            public final void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                this.f122434a.mo119774a();
            }

            public final void onSubscribe(C48294d dVar) {
                SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119774a() {
            if (DisposableHelper.dispose(this)) {
                this.f122432a.onComplete();
            }
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f122433b);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final void onComplete() {
            SubscriptionHelper.cancel(this.f122433b);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.f122432a.onComplete();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        C47760a(C47856n<? super T> nVar) {
            this.f122432a = nVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119775a(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.f122432a.onError(th);
            } else {
                C7332a.m23029a(th);
            }
        }

        public final void onError(Throwable th) {
            SubscriptionHelper.cancel(this.f122433b);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.f122432a.onError(th);
            } else {
                C7332a.m23029a(th);
            }
        }

        public final void onSuccess(T t) {
            SubscriptionHelper.cancel(this.f122433b);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.f122432a.onSuccess(t);
            }
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        C47760a aVar = new C47760a(nVar);
        nVar.onSubscribe(aVar);
        this.f122431b.mo19155a(aVar.f122433b);
        this.f122391a.mo19277b(aVar);
    }

    public C47759k(C7491p<T> pVar, C7704b<U> bVar) {
        super(pVar);
        this.f122431b = bVar;
    }
}
