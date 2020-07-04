package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7499z;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.flowable.ag */
public final class C47680ag extends C7329e<Long> {

    /* renamed from: a */
    final C7499z f122217a;

    /* renamed from: c */
    final long f122218c;

    /* renamed from: d */
    final TimeUnit f122219d;

    /* renamed from: io.reactivex.internal.operators.flowable.ag$a */
    static final class C47681a extends AtomicReference<C7321c> implements Runnable, C48294d {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final C48293c<? super Long> f122220a;

        /* renamed from: b */
        volatile boolean f122221b;

        public final void cancel() {
            DisposableHelper.dispose(this);
        }

        public final void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (this.f122221b) {
                    this.f122220a.onNext(Long.valueOf(0));
                    lazySet(EmptyDisposable.INSTANCE);
                    this.f122220a.onComplete();
                    return;
                }
                lazySet(EmptyDisposable.INSTANCE);
                this.f122220a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
            }
        }

        /* renamed from: a */
        public final void mo119741a(C7321c cVar) {
            DisposableHelper.trySet(this, cVar);
        }

        C47681a(C48293c<? super Long> cVar) {
            this.f122220a = cVar;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.f122221b = true;
            }
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super Long> cVar) {
        C47681a aVar = new C47681a(cVar);
        cVar.onSubscribe(aVar);
        aVar.mo119741a(this.f122217a.mo19337a(aVar, this.f122218c, this.f122219d));
    }

    public C47680ag(long j, TimeUnit timeUnit, C7499z zVar) {
        this.f122218c = j;
        this.f122219d = timeUnit;
        this.f122217a = zVar;
    }
}
