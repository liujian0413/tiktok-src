package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.schedulers.C47821o;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.ae */
public final class C7385ae extends C7492s<Long> {

    /* renamed from: a */
    final C7499z f20482a;

    /* renamed from: b */
    final long f20483b;

    /* renamed from: c */
    final long f20484c;

    /* renamed from: d */
    final TimeUnit f20485d;

    /* renamed from: io.reactivex.internal.operators.observable.ae$a */
    static final class C7386a extends AtomicReference<C7321c> implements C7321c, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: a */
        final C7498y<? super Long> f20486a;

        /* renamed from: b */
        long f20487b;

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
            if (get() != DisposableHelper.DISPOSED) {
                C7498y<? super Long> yVar = this.f20486a;
                long j = this.f20487b;
                this.f20487b = 1 + j;
                yVar.onNext(Long.valueOf(j));
            }
        }

        /* renamed from: a */
        public final void mo19199a(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        C7386a(C7498y<? super Long> yVar) {
            this.f20486a = yVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super Long> yVar) {
        C7386a aVar = new C7386a(yVar);
        yVar.onSubscribe(aVar);
        C7499z zVar = this.f20482a;
        if (zVar instanceof C47821o) {
            C7502c a = zVar.mo19338a();
            aVar.mo19199a(a);
            a.mo19343a(aVar, this.f20483b, this.f20484c, this.f20485d);
            return;
        }
        aVar.mo19199a(zVar.mo19336a(aVar, this.f20483b, this.f20484c, this.f20485d));
    }

    public C7385ae(long j, long j2, TimeUnit timeUnit, C7499z zVar) {
        this.f20483b = j;
        this.f20484c = j2;
        this.f20485d = timeUnit;
        this.f20482a = zVar;
    }
}
