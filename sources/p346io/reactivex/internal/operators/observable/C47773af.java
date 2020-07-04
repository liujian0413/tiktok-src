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

/* renamed from: io.reactivex.internal.operators.observable.af */
public final class C47773af extends C7492s<Long> {

    /* renamed from: a */
    final C7499z f122451a;

    /* renamed from: b */
    final long f122452b;

    /* renamed from: c */
    final long f122453c;

    /* renamed from: d */
    final long f122454d;

    /* renamed from: e */
    final long f122455e;

    /* renamed from: f */
    final TimeUnit f122456f;

    /* renamed from: io.reactivex.internal.operators.observable.af$a */
    static final class C47774a extends AtomicReference<C7321c> implements C7321c, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* renamed from: a */
        final C7498y<? super Long> f122457a;

        /* renamed from: b */
        final long f122458b;

        /* renamed from: c */
        long f122459c;

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
                long j = this.f122459c;
                this.f122457a.onNext(Long.valueOf(j));
                if (j == this.f122458b) {
                    DisposableHelper.dispose(this);
                    this.f122457a.onComplete();
                    return;
                }
                this.f122459c = j + 1;
            }
        }

        /* renamed from: a */
        public final void mo119781a(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        C47774a(C7498y<? super Long> yVar, long j, long j2) {
            this.f122457a = yVar;
            this.f122459c = j;
            this.f122458b = j2;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super Long> yVar) {
        C47774a aVar = new C47774a(yVar, this.f122452b, this.f122453c);
        yVar.onSubscribe(aVar);
        C7499z zVar = this.f122451a;
        if (zVar instanceof C47821o) {
            C7502c a = zVar.mo19338a();
            aVar.mo119781a(a);
            a.mo19343a(aVar, this.f122454d, this.f122455e, this.f122456f);
            return;
        }
        aVar.mo119781a(zVar.mo19336a(aVar, this.f122454d, this.f122455e, this.f122456f));
    }

    public C47773af(long j, long j2, long j3, long j4, TimeUnit timeUnit, C7499z zVar) {
        this.f122454d = j3;
        this.f122455e = j4;
        this.f122456f = timeUnit;
        this.f122451a = zVar;
        this.f122452b = j;
        this.f122453c = j2;
    }
}
