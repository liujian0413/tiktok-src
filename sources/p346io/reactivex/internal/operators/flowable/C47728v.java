package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;

/* renamed from: io.reactivex.internal.operators.flowable.v */
public final class C47728v<T> extends C7368a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.v$a */
    static final class C47729a<T> extends AtomicInteger implements C47597i<T>, C48294d {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: a */
        final C48293c<? super T> f122364a;

        /* renamed from: b */
        C48294d f122365b;

        /* renamed from: c */
        volatile boolean f122366c;

        /* renamed from: d */
        Throwable f122367d;

        /* renamed from: e */
        volatile boolean f122368e;

        /* renamed from: f */
        final AtomicLong f122369f = new AtomicLong();

        /* renamed from: g */
        final AtomicReference<T> f122370g = new AtomicReference<>();

        public final void onComplete() {
            this.f122366c = true;
            m148567a();
        }

        public final void cancel() {
            if (!this.f122368e) {
                this.f122368e = true;
                this.f122365b.cancel();
                if (getAndIncrement() == 0) {
                    this.f122370g.lazySet(null);
                }
            }
        }

        /* renamed from: a */
        private void m148567a() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                C48293c<? super T> cVar = this.f122364a;
                AtomicLong atomicLong = this.f122369f;
                AtomicReference<T> atomicReference = this.f122370g;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z3 = this.f122366c;
                        Object andSet = atomicReference.getAndSet(null);
                        if (andSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!m148568a(z3, z2, cVar, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f122366c;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (m148568a(z4, z, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C47833b.m148709c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void onError(Throwable th) {
            this.f122367d = th;
            this.f122366c = true;
            m148567a();
        }

        public final void onNext(T t) {
            this.f122370g.lazySet(t);
            m148567a();
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a(this.f122369f, j);
                m148567a();
            }
        }

        C47729a(C48293c<? super T> cVar) {
            this.f122364a = cVar;
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122365b, dVar)) {
                this.f122365b = dVar;
                this.f122364a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        private boolean m148568a(boolean z, boolean z2, C48293c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.f122368e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.f122367d;
                if (th != null) {
                    atomicReference.lazySet(null);
                    cVar.onError(th);
                    return true;
                } else if (z2) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }
    }

    public C47728v(C7329e<T> eVar) {
        super(eVar);
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f20450a.mo19154a((C47597i<? super T>) new C47729a<Object>(cVar));
    }
}
