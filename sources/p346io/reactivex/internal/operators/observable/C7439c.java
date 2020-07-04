package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.util.AtomicThrowable;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.observable.c */
public final class C7439c<T, R> extends C7492s<R> {

    /* renamed from: a */
    final C7496w<? extends T>[] f20654a;

    /* renamed from: b */
    final Iterable<? extends C7496w<? extends T>> f20655b = null;

    /* renamed from: c */
    final C7327h<? super Object[], ? extends R> f20656c;

    /* renamed from: d */
    final int f20657d;

    /* renamed from: e */
    final boolean f20658e;

    /* renamed from: io.reactivex.internal.operators.observable.c$a */
    static final class C7440a<T, R> extends AtomicReference<C7321c> implements C7498y<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* renamed from: a */
        final C7441b<T, R> f20659a;

        /* renamed from: b */
        final int f20660b;

        /* renamed from: a */
        public final void mo19225a() {
            DisposableHelper.dispose(this);
        }

        public final void onComplete() {
            this.f20659a.mo19226a(this.f20660b);
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            this.f20659a.mo19228a(this.f20660b, th);
        }

        public final void onNext(T t) {
            this.f20659a.mo19227a(this.f20660b, t);
        }

        C7440a(C7441b<T, R> bVar, int i) {
            this.f20659a = bVar;
            this.f20660b = i;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.c$b */
    static final class C7441b<T, R> extends AtomicInteger implements C7321c {
        private static final long serialVersionUID = 8567835998786448817L;

        /* renamed from: a */
        final C7498y<? super R> f20661a;

        /* renamed from: b */
        final C7327h<? super Object[], ? extends R> f20662b;

        /* renamed from: c */
        final C7440a<T, R>[] f20663c;

        /* renamed from: d */
        Object[] f20664d;

        /* renamed from: e */
        final C47791b<Object[]> f20665e;

        /* renamed from: f */
        final boolean f20666f;

        /* renamed from: g */
        volatile boolean f20667g;

        /* renamed from: h */
        volatile boolean f20668h;

        /* renamed from: i */
        final AtomicThrowable f20669i = new AtomicThrowable();

        /* renamed from: j */
        int f20670j;

        /* renamed from: k */
        int f20671k;

        public final boolean isDisposed() {
            return this.f20667g;
        }

        /* renamed from: a */
        private void m23167a() {
            for (C7440a<T, R> a : this.f20663c) {
                a.mo19225a();
            }
        }

        public final void dispose() {
            if (!this.f20667g) {
                this.f20667g = true;
                m23167a();
                if (getAndIncrement() == 0) {
                    m23168a(this.f20665e);
                }
            }
        }

        /* renamed from: b */
        private void m23169b() {
            boolean z;
            if (getAndIncrement() == 0) {
                C47791b<Object[]> bVar = this.f20665e;
                C7498y<? super R> yVar = this.f20661a;
                boolean z2 = this.f20666f;
                int i = 1;
                while (!this.f20667g) {
                    if (z2 || this.f20669i.get() == null) {
                        boolean z3 = this.f20668h;
                        Object[] objArr = (Object[]) bVar.poll();
                        if (objArr == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z3 && z) {
                            m23168a(bVar);
                            Throwable terminate = this.f20669i.terminate();
                            if (terminate == null) {
                                yVar.onComplete();
                                return;
                            } else {
                                yVar.onError(terminate);
                                return;
                            }
                        } else if (!z) {
                            try {
                                yVar.onNext(C7364b.m23081a(this.f20662b.apply(objArr), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                C7331a.m23009b(th);
                                this.f20669i.addThrowable(th);
                                m23167a();
                                m23168a(bVar);
                                yVar.onError(this.f20669i.terminate());
                                return;
                            }
                        } else {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        m23167a();
                        m23168a(bVar);
                        yVar.onError(this.f20669i.terminate());
                        return;
                    }
                }
                m23168a(bVar);
            }
        }

        /* renamed from: a */
        private void m23168a(C47791b<?> bVar) {
            synchronized (this) {
                this.f20664d = null;
            }
            bVar.clear();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            m23167a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            m23169b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo19226a(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f20664d     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return
            L_0x0007:
                r4 = r0[r4]     // Catch:{ all -> 0x0025 }
                r1 = 1
                if (r4 != 0) goto L_0x000e
                r4 = 1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0019
                int r2 = r3.f20671k     // Catch:{ all -> 0x0025 }
                int r2 = r2 + r1
                r3.f20671k = r2     // Catch:{ all -> 0x0025 }
                int r0 = r0.length     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x001b
            L_0x0019:
                r3.f20668h = r1     // Catch:{ all -> 0x0025 }
            L_0x001b:
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0021
                r3.m23167a()
            L_0x0021:
                r3.m23169b()
                return
            L_0x0025:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.operators.observable.C7439c.C7441b.mo19226a(int):void");
        }

        /* renamed from: a */
        public final void mo19229a(C7496w<? extends T>[] wVarArr) {
            C7440a<T, R>[] aVarArr = this.f20663c;
            int length = aVarArr.length;
            this.f20661a.onSubscribe(this);
            for (int i = 0; i < length && !this.f20668h && !this.f20667g; i++) {
                wVarArr[i].mo19189a(aVarArr[i]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            m23169b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo19227a(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f20664d     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.f20670j     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.f20670j = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                io.reactivex.internal.queue.b<java.lang.Object[]> r4 = r3.f20665e     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.offer(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.m23169b()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.operators.observable.C7439c.C7441b.mo19227a(int, java.lang.Object):void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo19228a(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r2.f20669i
                boolean r0 = r0.addThrowable(r4)
                if (r0 == 0) goto L_0x0036
                boolean r4 = r2.f20666f
                r0 = 1
                if (r4 == 0) goto L_0x002c
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f20664d     // Catch:{ all -> 0x0029 }
                if (r4 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                return
            L_0x0014:
                r3 = r4[r3]     // Catch:{ all -> 0x0029 }
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 != 0) goto L_0x0025
                int r1 = r2.f20671k     // Catch:{ all -> 0x0029 }
                int r1 = r1 + r0
                r2.f20671k = r1     // Catch:{ all -> 0x0029 }
                int r4 = r4.length     // Catch:{ all -> 0x0029 }
                if (r1 != r4) goto L_0x0027
            L_0x0025:
                r2.f20668h = r0     // Catch:{ all -> 0x0029 }
            L_0x0027:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x002d
            L_0x0029:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                throw r3
            L_0x002c:
                r3 = 1
            L_0x002d:
                if (r3 == 0) goto L_0x0032
                r2.m23167a()
            L_0x0032:
                r2.m23169b()
                return
            L_0x0036:
                p346io.reactivex.p350f.C7332a.m23029a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.operators.observable.C7439c.C7441b.mo19228a(int, java.lang.Throwable):void");
        }

        C7441b(C7498y<? super R> yVar, C7327h<? super Object[], ? extends R> hVar, int i, int i2, boolean z) {
            this.f20661a = yVar;
            this.f20662b = hVar;
            this.f20666f = z;
            this.f20664d = new Object[i];
            C7440a<T, R>[] aVarArr = new C7440a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new C7440a<>(this, i3);
            }
            this.f20663c = aVarArr;
            this.f20665e = new C47791b<>(i2);
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super R> yVar) {
        int i;
        C7496w<? extends T>[] wVarArr = this.f20654a;
        if (wVarArr == null) {
            C7492s[] sVarArr = new C7492s[8];
            C7496w<? extends T>[] wVarArr2 = sVarArr;
            int i2 = 0;
            for (C7496w<? extends T> wVar : this.f20655b) {
                if (i2 == wVarArr2.length) {
                    C7496w<? extends T>[] wVarArr3 = new C7496w[((i2 >> 2) + i2)];
                    System.arraycopy(wVarArr2, 0, wVarArr3, 0, i2);
                    wVarArr2 = wVarArr3;
                }
                int i3 = i2 + 1;
                wVarArr2[i2] = wVar;
                i2 = i3;
            }
            i = i2;
            wVarArr = wVarArr2;
        } else {
            i = wVarArr.length;
        }
        if (i == 0) {
            EmptyDisposable.complete(yVar);
            return;
        }
        C7441b bVar = new C7441b(yVar, this.f20656c, i, this.f20657d, this.f20658e);
        bVar.mo19229a(wVarArr);
    }

    public C7439c(C7496w<? extends T>[] wVarArr, Iterable<? extends C7496w<? extends T>> iterable, C7327h<? super Object[], ? extends R> hVar, int i, boolean z) {
        this.f20654a = wVarArr;
        this.f20656c = hVar;
        this.f20657d = i;
        this.f20658e = false;
    }
}
