package p346io.reactivex.p354j;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.util.C47832a;
import p346io.reactivex.internal.util.C47832a.C7485a;
import p346io.reactivex.internal.util.C47836e;
import p346io.reactivex.internal.util.NotificationLite;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.j.a */
public final class C47844a<T> extends C7489f<T> {

    /* renamed from: c */
    static final C47845a[] f122628c = new C47845a[0];

    /* renamed from: d */
    static final C47845a[] f122629d = new C47845a[0];

    /* renamed from: j */
    private static final Object[] f122630j = new Object[0];

    /* renamed from: a */
    final AtomicReference<Object> f122631a;

    /* renamed from: b */
    final AtomicReference<C47845a<T>[]> f122632b;

    /* renamed from: e */
    final ReadWriteLock f122633e;

    /* renamed from: f */
    final Lock f122634f;

    /* renamed from: g */
    final Lock f122635g;

    /* renamed from: h */
    final AtomicReference<Throwable> f122636h;

    /* renamed from: i */
    long f122637i;

    /* renamed from: io.reactivex.j.a$a */
    static final class C47845a<T> implements C7321c, C7485a<Object> {

        /* renamed from: a */
        final C7498y<? super T> f122638a;

        /* renamed from: b */
        final C47844a<T> f122639b;

        /* renamed from: c */
        boolean f122640c;

        /* renamed from: d */
        boolean f122641d;

        /* renamed from: e */
        C47832a<Object> f122642e;

        /* renamed from: f */
        boolean f122643f;

        /* renamed from: g */
        volatile boolean f122644g;

        /* renamed from: h */
        long f122645h;

        public final boolean isDisposed() {
            return this.f122644g;
        }

        public final void dispose() {
            if (!this.f122644g) {
                this.f122644g = true;
                this.f122639b.mo119918a(this);
            }
        }

        /* JADX INFO: used method not loaded: io.reactivex.internal.util.a.a(io.reactivex.internal.util.a$a):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo119910a((p346io.reactivex.internal.util.C47832a.C7485a) r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m148750b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f122644g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f122642e     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f122641d = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f122642e = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo119910a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.p354j.C47844a.C47845a.m148750b():void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (mo9283a(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            m148750b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo119919a() {
            /*
                r4 = this;
                boolean r0 = r4.f122644g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f122644g     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f122640c     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                io.reactivex.j.a<T> r0 = r4.f122639b     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f122634f     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f122637i     // Catch:{ all -> 0x003e }
                r4.f122645h = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f122631a     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f122641d = r2     // Catch:{ all -> 0x003e }
                r4.f122640c = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.mo9283a(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.m148750b()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.p354j.C47844a.C47845a.mo119919a():void");
        }

        /* renamed from: a */
        public final boolean mo9283a(Object obj) {
            if (this.f122644g || NotificationLite.accept(obj, this.f122638a)) {
                return true;
            }
            return false;
        }

        C47845a(C7498y<? super T> yVar, C47844a<T> aVar) {
            this.f122638a = yVar;
            this.f122639b = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f122643f = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo119920a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f122644g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f122643f
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f122644g     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f122645h     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f122641d     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                io.reactivex.internal.util.a<java.lang.Object> r5 = r3.f122642e     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                io.reactivex.internal.util.a r5 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f122642e = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo119911a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f122640c = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f122643f = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.mo9283a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.p354j.C47844a.C47845a.mo119920a(java.lang.Object, long):void");
        }
    }

    /* renamed from: a */
    public static <T> C47844a<T> m148742a() {
        return new C47844a<>();
    }

    /* renamed from: b */
    public final T mo10167b() {
        Object obj = this.f122631a.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return NotificationLite.getValue(obj);
    }

    C47844a() {
        this.f122633e = new ReentrantReadWriteLock();
        this.f122634f = this.f122633e.readLock();
        this.f122635g = this.f122633e.writeLock();
        this.f122632b = new AtomicReference<>(f122628c);
        this.f122631a = new AtomicReference<>();
        this.f122636h = new AtomicReference<>();
    }

    public final void onComplete() {
        if (this.f122636h.compareAndSet(null, C47836e.f122622a)) {
            Object complete = NotificationLite.complete();
            for (C47845a a : m148745e(complete)) {
                a.mo119920a(complete, this.f122637i);
            }
        }
    }

    private C47844a(T t) {
        this();
        this.f122631a.lazySet(C7364b.m23081a(t, "defaultValue is null"));
    }

    /* renamed from: a */
    public static <T> C47844a<T> m148743a(T t) {
        return new C47844a<>(t);
    }

    public final void onSubscribe(C7321c cVar) {
        if (this.f122636h.get() != null) {
            cVar.dispose();
        }
    }

    /* renamed from: e */
    private C47845a<T>[] m148745e(Object obj) {
        C47845a<T>[] aVarArr = (C47845a[]) this.f122632b.getAndSet(f122629d);
        if (aVarArr != f122629d) {
            m148746f(obj);
        }
        return aVarArr;
    }

    /* renamed from: f */
    private void m148746f(Object obj) {
        this.f122635g.lock();
        this.f122637i++;
        this.f122631a.lazySet(obj);
        this.f122635g.unlock();
    }

    /* renamed from: b */
    private boolean m148744b(C47845a<T> aVar) {
        C47845a[] aVarArr;
        C47845a[] aVarArr2;
        do {
            aVarArr = (C47845a[]) this.f122632b.get();
            if (aVarArr == f122629d) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C47845a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f122632b.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo119918a(C47845a<T> aVar) {
        C47845a<T>[] aVarArr;
        C47845a[] aVarArr2;
        do {
            aVarArr = (C47845a[]) this.f122632b.get();
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
                        aVarArr2 = f122628c;
                    } else {
                        C47845a[] aVarArr3 = new C47845a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f122632b.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C47845a aVar = new C47845a(yVar, this);
        yVar.onSubscribe(aVar);
        if (!m148744b(aVar)) {
            Throwable th = (Throwable) this.f122636h.get();
            if (th == C47836e.f122622a) {
                yVar.onComplete();
            } else {
                yVar.onError(th);
            }
        } else if (aVar.f122644g) {
            mo119918a(aVar);
        } else {
            aVar.mo119919a();
        }
    }

    public final void onError(Throwable th) {
        C7364b.m23081a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f122636h.compareAndSet(null, th)) {
            C7332a.m23029a(th);
            return;
        }
        Object error = NotificationLite.error(th);
        for (C47845a a : m148745e(error)) {
            a.mo119920a(error, this.f122637i);
        }
    }

    public final void onNext(T t) {
        C7364b.m23081a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122636h.get() == null) {
            Object next = NotificationLite.next(t);
            m148746f(next);
            for (C47845a a : (C47845a[]) this.f122632b.get()) {
                a.mo119920a(next, this.f122637i);
            }
        }
    }
}
