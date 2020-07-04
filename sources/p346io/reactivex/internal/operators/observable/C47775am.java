package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.C47607c;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p349e.C7330a;
import p346io.reactivex.p350f.C7332a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: io.reactivex.internal.operators.observable.am */
public final class C47775am<T> extends C7492s<T> {

    /* renamed from: a */
    final C7330a<T> f122460a;

    /* renamed from: b */
    final int f122461b;

    /* renamed from: c */
    final long f122462c;

    /* renamed from: d */
    final TimeUnit f122463d;

    /* renamed from: e */
    final C7499z f122464e;

    /* renamed from: f */
    C47776a f122465f;

    /* renamed from: io.reactivex.internal.operators.observable.am$a */
    static final class C47776a extends AtomicReference<C7321c> implements C7326g<C7321c>, Runnable {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: a */
        final C47775am<?> f122466a;

        /* renamed from: b */
        C7321c f122467b;

        /* renamed from: c */
        long f122468c;

        /* renamed from: d */
        boolean f122469d;

        /* renamed from: e */
        boolean f122470e;

        public final void run() {
            this.f122466a.mo119785c(this);
        }

        C47776a(C47775am<?> amVar) {
            this.f122466a = amVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C7321c cVar) throws Exception {
            DisposableHelper.replace(this, cVar);
            synchronized (this.f122466a) {
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.am$b */
    static final class C47777b<T> extends AtomicBoolean implements C7321c, C7498y<T> {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: a */
        final C7498y<? super T> f122471a;

        /* renamed from: b */
        final C47775am<T> f122472b;

        /* renamed from: c */
        final C47776a f122473c;

        /* renamed from: d */
        C7321c f122474d;

        public final boolean isDisposed() {
            return this.f122474d.isDisposed();
        }

        public final void dispose() {
            this.f122474d.dispose();
            if (compareAndSet(false, true)) {
                this.f122472b.mo119783a(this.f122473c);
            }
        }

        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f122472b.mo119784b(this.f122473c);
                this.f122471a.onComplete();
            }
        }

        public final void onNext(T t) {
            this.f122471a.onNext(t);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122474d, cVar)) {
                this.f122474d = cVar;
                this.f122471a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f122472b.mo119784b(this.f122473c);
                this.f122471a.onError(th);
                return;
            }
            C7332a.m23029a(th);
        }

        C47777b(C7498y<? super T> yVar, C47775am<T> amVar, C47776a aVar) {
            this.f122471a = yVar;
            this.f122472b = amVar;
            this.f122473c = aVar;
        }
    }

    public C47775am(C7330a<T> aVar) {
        this(aVar, 1, 0, TimeUnit.NANOSECONDS, C7333a.m23045c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo119784b(C47776a aVar) {
        synchronized (this) {
            if (this.f122465f != null && this.f122465f == aVar) {
                this.f122465f = null;
                if (aVar.f122467b != null) {
                    aVar.f122467b.dispose();
                }
            }
            long j = aVar.f122468c - 1;
            aVar.f122468c = j;
            if (j == 0) {
                if (this.f122460a instanceof C7321c) {
                    ((C7321c) this.f122460a).dispose();
                } else if (this.f122460a instanceof C47607c) {
                    aVar.get();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo119785c(C47776a aVar) {
        synchronized (this) {
            if (aVar.f122468c == 0 && aVar == this.f122465f) {
                this.f122465f = null;
                C7321c cVar = (C7321c) aVar.get();
                DisposableHelper.dispose(aVar);
                if (this.f122460a instanceof C7321c) {
                    ((C7321c) this.f122460a).dispose();
                } else if ((this.f122460a instanceof C47607c) && cVar == null) {
                    aVar.f122470e = true;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo119783a(p346io.reactivex.internal.operators.observable.C47775am.C47776a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            io.reactivex.internal.operators.observable.am$a r0 = r5.f122465f     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003f
            io.reactivex.internal.operators.observable.am$a r0 = r5.f122465f     // Catch:{ all -> 0x0041 }
            if (r0 == r6) goto L_0x000a
            goto L_0x003f
        L_0x000a:
            long r0 = r6.f122468c     // Catch:{ all -> 0x0041 }
            r2 = 1
            long r0 = r0 - r2
            r6.f122468c = r0     // Catch:{ all -> 0x0041 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003d
            boolean r0 = r6.f122469d     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x001c
            goto L_0x003d
        L_0x001c:
            long r0 = r5.f122462c     // Catch:{ all -> 0x0041 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            r5.mo119785c(r6)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0027:
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable     // Catch:{ all -> 0x0041 }
            r0.<init>()     // Catch:{ all -> 0x0041 }
            r6.f122467b = r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            io.reactivex.z r1 = r5.f122464e
            long r2 = r5.f122462c
            java.util.concurrent.TimeUnit r4 = r5.f122463d
            io.reactivex.b.c r6 = r1.mo19337a(r6, r2, r4)
            r0.replace(r6)
            return
        L_0x003d:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.operators.observable.C47775am.mo119783a(io.reactivex.internal.operators.observable.am$a):void");
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C47776a aVar;
        boolean z;
        synchronized (this) {
            aVar = this.f122465f;
            if (aVar == null) {
                aVar = new C47776a(this);
                this.f122465f = aVar;
            }
            long j = aVar.f122468c;
            if (j == 0 && aVar.f122467b != null) {
                aVar.f122467b.dispose();
            }
            long j2 = j + 1;
            aVar.f122468c = j2;
            z = true;
            if (aVar.f122469d || j2 != ((long) this.f122461b)) {
                z = false;
            } else {
                aVar.f122469d = true;
            }
        }
        this.f122460a.mo19189a((C7498y<? super T>) new C47777b<Object>(yVar, this, aVar));
        if (z) {
            this.f122460a.mo19167g(aVar);
        }
    }

    private C47775am(C7330a<T> aVar, int i, long j, TimeUnit timeUnit, C7499z zVar) {
        this.f122460a = aVar;
        this.f122461b = 1;
        this.f122462c = 0;
        this.f122463d = timeUnit;
        this.f122464e = zVar;
    }
}
