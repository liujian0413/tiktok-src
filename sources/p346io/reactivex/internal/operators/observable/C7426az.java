package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.az */
public final class C7426az extends C7492s<Long> {

    /* renamed from: a */
    final C7499z f20593a;

    /* renamed from: b */
    final long f20594b;

    /* renamed from: c */
    final TimeUnit f20595c;

    /* renamed from: io.reactivex.internal.operators.observable.az$a */
    static final class C7427a extends AtomicReference<C7321c> implements C7321c, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final C7498y<? super Long> f20596a;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void run() {
            if (!isDisposed()) {
                this.f20596a.onNext(Long.valueOf(0));
                lazySet(EmptyDisposable.INSTANCE);
                this.f20596a.onComplete();
            }
        }

        /* renamed from: a */
        public final void mo19214a(C7321c cVar) {
            DisposableHelper.trySet(this, cVar);
        }

        C7427a(C7498y<? super Long> yVar) {
            this.f20596a = yVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super Long> yVar) {
        C7427a aVar = new C7427a(yVar);
        yVar.onSubscribe(aVar);
        aVar.mo19214a(this.f20593a.mo19337a(aVar, this.f20594b, this.f20595c));
    }

    public C7426az(long j, TimeUnit timeUnit, C7499z zVar) {
        this.f20594b = j;
        this.f20595c = timeUnit;
        this.f20593a = zVar;
    }
}
