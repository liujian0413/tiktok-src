package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.schedulers.C47821o;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.flowable.o */
public final class C47714o extends C7329e<Long> {

    /* renamed from: a */
    final C7499z f122315a;

    /* renamed from: c */
    final long f122316c;

    /* renamed from: d */
    final long f122317d;

    /* renamed from: e */
    final TimeUnit f122318e;

    /* renamed from: io.reactivex.internal.operators.flowable.o$a */
    static final class C47715a extends AtomicLong implements Runnable, C48294d {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final C48293c<? super Long> f122319a;

        /* renamed from: b */
        long f122320b;

        /* renamed from: c */
        final AtomicReference<C7321c> f122321c = new AtomicReference<>();

        public final void cancel() {
            DisposableHelper.dispose(this.f122321c);
        }

        public final void run() {
            if (this.f122321c.get() != DisposableHelper.DISPOSED) {
                if (get() != 0) {
                    C48293c<? super Long> cVar = this.f122319a;
                    long j = this.f122320b;
                    this.f122320b = j + 1;
                    cVar.onNext(Long.valueOf(j));
                    C47833b.m148709c(this, 1);
                    return;
                }
                C48293c<? super Long> cVar2 = this.f122319a;
                StringBuilder sb = new StringBuilder("Can't deliver value ");
                sb.append(this.f122320b);
                sb.append(" due to lack of requests");
                cVar2.onError(new MissingBackpressureException(sb.toString()));
                DisposableHelper.dispose(this.f122321c);
            }
        }

        /* renamed from: a */
        public final void mo119758a(C7321c cVar) {
            DisposableHelper.setOnce(this.f122321c, cVar);
        }

        C47715a(C48293c<? super Long> cVar) {
            this.f122319a = cVar;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a((AtomicLong) this, j);
            }
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super Long> cVar) {
        C47715a aVar = new C47715a(cVar);
        cVar.onSubscribe(aVar);
        C7499z zVar = this.f122315a;
        if (zVar instanceof C47821o) {
            C7502c a = zVar.mo19338a();
            aVar.mo119758a(a);
            a.mo19343a(aVar, this.f122316c, this.f122317d, this.f122318e);
            return;
        }
        aVar.mo119758a(zVar.mo19336a(aVar, this.f122316c, this.f122317d, this.f122318e));
    }

    public C47714o(long j, long j2, TimeUnit timeUnit, C7499z zVar) {
        this.f122316c = j;
        this.f122317d = j2;
        this.f122318e = timeUnit;
        this.f122315a = zVar;
    }
}
