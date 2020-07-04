package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7499z;
import p346io.reactivex.exceptions.MissingBackpressureException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p1873k.C47853b;

/* renamed from: io.reactivex.internal.operators.flowable.aa */
public final class C47665aa<T> extends C7368a<T, T> {

    /* renamed from: c */
    final long f122175c;

    /* renamed from: d */
    final TimeUnit f122176d;

    /* renamed from: e */
    final C7499z f122177e;

    /* renamed from: f */
    final boolean f122178f;

    /* renamed from: io.reactivex.internal.operators.flowable.aa$a */
    static final class C47666a<T> extends C47668c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: a */
        final AtomicInteger f122179a = new AtomicInteger(1);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119735a() {
            mo119738b();
            if (this.f122179a.decrementAndGet() == 0) {
                this.f122180b.onComplete();
            }
        }

        public final void run() {
            if (this.f122179a.incrementAndGet() == 2) {
                mo119738b();
                if (this.f122179a.decrementAndGet() == 0) {
                    this.f122180b.onComplete();
                }
            }
        }

        C47666a(C48293c<? super T> cVar, long j, TimeUnit timeUnit, C7499z zVar) {
            super(cVar, j, timeUnit, zVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.aa$b */
    static final class C47667b<T> extends C47668c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public final void run() {
            mo119738b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119735a() {
            this.f122180b.onComplete();
        }

        C47667b(C48293c<? super T> cVar, long j, TimeUnit timeUnit, C7499z zVar) {
            super(cVar, j, timeUnit, zVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.aa$c */
    static abstract class C47668c<T> extends AtomicReference<T> implements C47597i<T>, Runnable, C48294d {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b */
        final C48293c<? super T> f122180b;

        /* renamed from: c */
        final long f122181c;

        /* renamed from: d */
        final TimeUnit f122182d;

        /* renamed from: e */
        final C7499z f122183e;

        /* renamed from: f */
        final AtomicLong f122184f = new AtomicLong();

        /* renamed from: g */
        final SequentialDisposable f122185g = new SequentialDisposable();

        /* renamed from: h */
        C48294d f122186h;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo119735a();

        /* renamed from: c */
        private void m148469c() {
            DisposableHelper.dispose(this.f122185g);
        }

        public void onComplete() {
            m148469c();
            mo119735a();
        }

        public void cancel() {
            m148469c();
            this.f122186h.cancel();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo119738b() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f122184f.get() != 0) {
                    this.f122180b.onNext(andSet);
                    C47833b.m148709c(this.f122184f, 1);
                    return;
                }
                cancel();
                this.f122180b.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
            }
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onError(Throwable th) {
            m148469c();
            this.f122180b.onError(th);
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a(this.f122184f, j);
            }
        }

        public void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122186h, dVar)) {
                this.f122186h = dVar;
                this.f122180b.onSubscribe(this);
                this.f122185g.replace(this.f122183e.mo19336a(this, this.f122181c, this.f122181c, this.f122182d));
                dVar.request(Long.MAX_VALUE);
            }
        }

        C47668c(C48293c<? super T> cVar, long j, TimeUnit timeUnit, C7499z zVar) {
            this.f122180b = cVar;
            this.f122181c = j;
            this.f122182d = timeUnit;
            this.f122183e = zVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        C47853b bVar = new C47853b(cVar);
        if (this.f122178f) {
            C7329e eVar = this.f20450a;
            C47666a aVar = new C47666a(bVar, this.f122175c, this.f122176d, this.f122177e);
            eVar.mo19154a((C47597i<? super T>) aVar);
            return;
        }
        C7329e eVar2 = this.f20450a;
        C47667b bVar2 = new C47667b(bVar, this.f122175c, this.f122176d, this.f122177e);
        eVar2.mo19154a((C47597i<? super T>) bVar2);
    }

    public C47665aa(C7329e<T> eVar, long j, TimeUnit timeUnit, C7499z zVar, boolean z) {
        super(eVar);
        this.f122175c = j;
        this.f122176d = timeUnit;
        this.f122177e = zVar;
        this.f122178f = z;
    }
}
