package p346io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C47600d;
import p346io.reactivex.internal.p353b.C47603h;
import p346io.reactivex.internal.p353b.C47604i;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.queue.SpscArrayQueue;
import p346io.reactivex.internal.util.AtomicThrowable;
import p346io.reactivex.internal.util.C47836e;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.t */
public final class C7474t<T, U> extends C7376a<T, U> {

    /* renamed from: b */
    final C7327h<? super T, ? extends C7496w<? extends U>> f20792b;

    /* renamed from: c */
    final boolean f20793c;

    /* renamed from: d */
    final int f20794d;

    /* renamed from: e */
    final int f20795e;

    /* renamed from: io.reactivex.internal.operators.observable.t$a */
    static final class C7475a<T, U> extends AtomicReference<C7321c> implements C7498y<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a */
        final long f20796a;

        /* renamed from: b */
        final C7476b<T, U> f20797b;

        /* renamed from: c */
        volatile boolean f20798c;

        /* renamed from: d */
        volatile C47604i<U> f20799d;

        /* renamed from: e */
        int f20800e;

        /* renamed from: a */
        public final void mo19248a() {
            DisposableHelper.dispose(this);
        }

        public final void onComplete() {
            this.f20798c = true;
            this.f20797b.mo19249a();
        }

        public final void onNext(U u) {
            if (this.f20800e == 0) {
                this.f20797b.mo19250a(u, this);
            } else {
                this.f20797b.mo19249a();
            }
        }

        public final void onError(Throwable th) {
            if (this.f20797b.f20810h.addThrowable(th)) {
                if (!this.f20797b.f20805c) {
                    this.f20797b.mo19251b();
                }
                this.f20798c = true;
                this.f20797b.mo19249a();
                return;
            }
            C7332a.m23029a(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.setOnce(this, cVar) && (cVar instanceof C47600d)) {
                C47600d dVar = (C47600d) cVar;
                int requestFusion = dVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f20800e = requestFusion;
                    this.f20799d = dVar;
                    this.f20798c = true;
                    this.f20797b.mo19249a();
                } else if (requestFusion == 2) {
                    this.f20800e = requestFusion;
                    this.f20799d = dVar;
                }
            }
        }

        C7475a(C7476b<T, U> bVar, long j) {
            this.f20796a = j;
            this.f20797b = bVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.t$b */
    static final class C7476b<T, U> extends AtomicInteger implements C7321c, C7498y<T> {

        /* renamed from: k */
        static final C7475a<?, ?>[] f20801k = new C7475a[0];

        /* renamed from: l */
        static final C7475a<?, ?>[] f20802l = new C7475a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: a */
        final C7498y<? super U> f20803a;

        /* renamed from: b */
        final C7327h<? super T, ? extends C7496w<? extends U>> f20804b;

        /* renamed from: c */
        final boolean f20805c;

        /* renamed from: d */
        final int f20806d;

        /* renamed from: e */
        final int f20807e;

        /* renamed from: f */
        volatile C47603h<U> f20808f;

        /* renamed from: g */
        volatile boolean f20809g;

        /* renamed from: h */
        final AtomicThrowable f20810h = new AtomicThrowable();

        /* renamed from: i */
        volatile boolean f20811i;

        /* renamed from: j */
        final AtomicReference<C7475a<?, ?>[]> f20812j;

        /* renamed from: m */
        C7321c f20813m;

        /* renamed from: n */
        long f20814n;

        /* renamed from: o */
        long f20815o;

        /* renamed from: p */
        int f20816p;

        /* renamed from: q */
        Queue<C7496w<? extends U>> f20817q;

        /* renamed from: r */
        int f20818r;

        public final boolean isDisposed() {
            return this.f20811i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19249a() {
            if (getAndIncrement() == 0) {
                m23210c();
            }
        }

        public final void onComplete() {
            if (!this.f20809g) {
                this.f20809g = true;
                mo19249a();
            }
        }

        public final void dispose() {
            if (!this.f20811i) {
                this.f20811i = true;
                if (mo19251b()) {
                    Throwable terminate = this.f20810h.terminate();
                    if (terminate != null && terminate != C47836e.f122622a) {
                        C7332a.m23029a(terminate);
                    }
                }
            }
        }

        /* renamed from: d */
        private boolean m23211d() {
            if (this.f20811i) {
                return true;
            }
            Throwable th = (Throwable) this.f20810h.get();
            if (this.f20805c || th == null) {
                return false;
            }
            mo19251b();
            Throwable terminate = this.f20810h.terminate();
            if (terminate != C47836e.f122622a) {
                this.f20803a.onError(terminate);
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo19251b() {
            this.f20813m.dispose();
            if (((C7475a[]) this.f20812j.get()) != f20802l) {
                C7475a<?, ?>[] aVarArr = (C7475a[]) this.f20812j.getAndSet(f20802l);
                if (aVarArr != f20802l) {
                    for (C7475a<?, ?> a : aVarArr) {
                        a.mo19248a();
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        private void m23210c() {
            int i;
            int i2;
            int i3;
            C7498y<? super U> yVar = this.f20803a;
            int i4 = 1;
            while (!m23211d()) {
                C47603h<U> hVar = this.f20808f;
                if (hVar != null) {
                    while (!m23211d()) {
                        Object poll = hVar.poll();
                        if (poll != null) {
                            yVar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.f20809g;
                C47603h<U> hVar2 = this.f20808f;
                C7475a[] aVarArr = (C7475a[]) this.f20812j.get();
                int length = aVarArr.length;
                if (this.f20806d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.f20817q.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((hVar2 == null || hVar2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.f20815o;
                        int i5 = this.f20816p;
                        if (length <= i5 || aVarArr[i5].f20796a != j) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            int i6 = i5;
                            for (int i7 = 0; i7 < length && aVarArr[i6].f20796a != j; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.f20816p = i6;
                            this.f20815o = aVarArr[i6].f20796a;
                            i5 = i6;
                        }
                        int i8 = 0;
                        i2 = 0;
                        while (i8 < length) {
                            if (!m23211d()) {
                                C7475a aVar = aVarArr[i3];
                                C47604i<U> iVar = aVar.f20799d;
                                if (iVar != null) {
                                    while (true) {
                                        try {
                                            Object poll2 = iVar.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            yVar.onNext(poll2);
                                            if (m23211d()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C7331a.m23009b(th);
                                            aVar.mo19248a();
                                            this.f20810h.addThrowable(th);
                                            if (!m23211d()) {
                                                m23209b(aVar);
                                                i2++;
                                                i3++;
                                                if (i3 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.f20798c;
                                C47604i<U> iVar2 = aVar.f20799d;
                                if (z2 && (iVar2 == null || iVar2.isEmpty())) {
                                    m23209b(aVar);
                                    if (!m23211d()) {
                                        i2++;
                                    } else {
                                        return;
                                    }
                                }
                                i3++;
                                if (i3 != length) {
                                    i8++;
                                }
                                i3 = 0;
                                i8++;
                            } else {
                                return;
                            }
                        }
                        this.f20816p = i3;
                        this.f20815o = aVarArr[i3].f20796a;
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (this.f20806d != Integer.MAX_VALUE) {
                        while (true) {
                            int i9 = i2 - 1;
                            if (i2 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                C7496w wVar = (C7496w) this.f20817q.poll();
                                if (wVar == null) {
                                    this.f20818r--;
                                } else {
                                    m23206a(wVar);
                                }
                            }
                            i2 = i9;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable terminate = this.f20810h.terminate();
                    if (terminate != C47836e.f122622a) {
                        if (terminate == null) {
                            yVar.onComplete();
                            return;
                        }
                        yVar.onError(terminate);
                    }
                    return;
                }
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20813m, cVar)) {
                this.f20813m = cVar;
                this.f20803a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f20809g) {
                C7332a.m23029a(th);
            } else if (this.f20810h.addThrowable(th)) {
                this.f20809g = true;
                mo19249a();
            } else {
                C7332a.m23029a(th);
            }
        }

        /* renamed from: a */
        private boolean m23207a(C7475a<T, U> aVar) {
            C7475a<?, ?>[] aVarArr;
            C7475a[] aVarArr2;
            do {
                aVarArr = (C7475a[]) this.f20812j.get();
                if (aVarArr == f20802l) {
                    aVar.mo19248a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C7475a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f20812j.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        private void m23209b(C7475a<T, U> aVar) {
            C7475a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C7475a[]) this.f20812j.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f20801k;
                        } else {
                            C7475a[] aVarArr2 = new C7475a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            obj = aVarArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f20812j.compareAndSet(aVarArr, obj));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m23206a(p346io.reactivex.C7496w<? extends U> r6) {
            /*
                r5 = this;
            L_0x0000:
                boolean r0 = r6 instanceof java.util.concurrent.Callable
                if (r0 == 0) goto L_0x0032
                java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6
                boolean r6 = r5.m23208a(r6)
                if (r6 == 0) goto L_0x0047
                int r6 = r5.f20806d
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r0) goto L_0x0047
                r6 = 0
                monitor-enter(r5)
                java.util.Queue<io.reactivex.w<? extends U>> r0 = r5.f20817q     // Catch:{ all -> 0x002f }
                java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x002f }
                io.reactivex.w r0 = (p346io.reactivex.C7496w) r0     // Catch:{ all -> 0x002f }
                r1 = 1
                if (r0 != 0) goto L_0x0026
                int r6 = r5.f20818r     // Catch:{ all -> 0x002f }
                int r6 = r6 - r1
                r5.f20818r = r6     // Catch:{ all -> 0x002f }
                r6 = 1
            L_0x0026:
                monitor-exit(r5)     // Catch:{ all -> 0x002f }
                if (r6 == 0) goto L_0x002d
                r5.mo19249a()
                return
            L_0x002d:
                r6 = r0
                goto L_0x0000
            L_0x002f:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x002f }
                throw r6
            L_0x0032:
                io.reactivex.internal.operators.observable.t$a r0 = new io.reactivex.internal.operators.observable.t$a
                long r1 = r5.f20814n
                r3 = 1
                long r3 = r3 + r1
                r5.f20814n = r3
                r0.<init>(r5, r1)
                boolean r1 = r5.m23207a(r0)
                if (r1 == 0) goto L_0x0047
                r6.mo19189a(r0)
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.operators.observable.C7474t.C7476b.m23206a(io.reactivex.w):void");
        }

        public final void onNext(T t) {
            if (!this.f20809g) {
                try {
                    C7496w wVar = (C7496w) C7364b.m23081a(this.f20804b.apply(t), "The mapper returned a null ObservableSource");
                    if (this.f20806d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.f20818r == this.f20806d) {
                                this.f20817q.offer(wVar);
                                return;
                            }
                            this.f20818r++;
                        }
                    }
                    m23206a(wVar);
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    this.f20813m.dispose();
                    onError(th);
                }
            }
        }

        /* renamed from: a */
        private boolean m23208a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C47603h<U> hVar = this.f20808f;
                    if (hVar == null) {
                        if (this.f20806d == Integer.MAX_VALUE) {
                            hVar = new C47791b<>(this.f20807e);
                        } else {
                            hVar = new SpscArrayQueue<>(this.f20806d);
                        }
                        this.f20808f = hVar;
                    }
                    if (!hVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f20803a.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                m23210c();
                return true;
            } catch (Throwable th) {
                C7331a.m23009b(th);
                this.f20810h.addThrowable(th);
                mo19249a();
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19250a(U u, C7475a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C47604i iVar = aVar.f20799d;
                if (iVar == null) {
                    iVar = new C47791b(this.f20807e);
                    aVar.f20799d = iVar;
                }
                iVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f20803a.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            m23210c();
        }

        C7476b(C7498y<? super U> yVar, C7327h<? super T, ? extends C7496w<? extends U>> hVar, boolean z, int i, int i2) {
            this.f20803a = yVar;
            this.f20804b = hVar;
            this.f20805c = z;
            this.f20806d = i;
            this.f20807e = i2;
            if (i != Integer.MAX_VALUE) {
                this.f20817q = new ArrayDeque(i);
            }
            this.f20812j = new AtomicReference<>(f20801k);
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super U> yVar) {
        if (!ObservableScalarXMap.m23099a(this.f20473a, yVar, this.f20792b)) {
            C7496w wVar = this.f20473a;
            C7476b bVar = new C7476b(yVar, this.f20792b, this.f20793c, this.f20794d, this.f20795e);
            wVar.mo19189a(bVar);
        }
    }

    public C7474t(C7496w<T> wVar, C7327h<? super T, ? extends C7496w<? extends U>> hVar, boolean z, int i, int i2) {
        super(wVar);
        this.f20792b = hVar;
        this.f20793c = z;
        this.f20794d = i;
        this.f20795e = i2;
    }
}
