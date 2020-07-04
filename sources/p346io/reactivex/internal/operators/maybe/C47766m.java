package p346io.reactivex.internal.operators.maybe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7490k;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.maybe.m */
public final class C47766m extends C7490k<Long> {

    /* renamed from: a */
    final long f122443a;

    /* renamed from: b */
    final TimeUnit f122444b;

    /* renamed from: c */
    final C7499z f122445c;

    /* renamed from: io.reactivex.internal.operators.maybe.m$a */
    static final class C47767a extends AtomicReference<C7321c> implements C7321c, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* renamed from: a */
        final C47856n<? super Long> f122446a;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final void run() {
            this.f122446a.onSuccess(Long.valueOf(0));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119778a(C7321c cVar) {
            DisposableHelper.replace(this, cVar);
        }

        C47767a(C47856n<? super Long> nVar) {
            this.f122446a = nVar;
        }
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super Long> nVar) {
        C47767a aVar = new C47767a(nVar);
        nVar.onSubscribe(aVar);
        aVar.mo119778a(this.f122445c.mo19337a(aVar, this.f122443a, this.f122444b));
    }

    public C47766m(long j, TimeUnit timeUnit, C7499z zVar) {
        this.f122443a = j;
        this.f122444b = timeUnit;
        this.f122445c = zVar;
    }
}
