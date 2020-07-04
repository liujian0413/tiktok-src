package androidx.work.impl.utils.p038a;

import com.google.common.util.concurrent.C18253l;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.work.impl.utils.a.a */
public abstract class C1552a<V> implements C18253l<V> {

    /* renamed from: a */
    static final boolean f5881a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b */
    static final C1554a f5882b;

    /* renamed from: f */
    private static final Logger f5883f = Logger.getLogger(C1552a.class.getName());

    /* renamed from: g */
    private static final Object f5884g = new Object();

    /* renamed from: c */
    volatile Object f5885c;

    /* renamed from: d */
    volatile C1558d f5886d;

    /* renamed from: e */
    volatile C1562h f5887e;

    /* renamed from: androidx.work.impl.utils.a.a$a */
    static abstract class C1554a {
        private C1554a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo6828a(C1562h hVar, C1562h hVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo6829a(C1562h hVar, Thread thread);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo6830a(C1552a<?> aVar, C1558d dVar, C1558d dVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo6831a(C1552a<?> aVar, C1562h hVar, C1562h hVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo6832a(C1552a<?> aVar, Object obj, Object obj2);
    }

    /* renamed from: androidx.work.impl.utils.a.a$b */
    static final class C1555b {

        /* renamed from: a */
        static final C1555b f5888a;

        /* renamed from: b */
        static final C1555b f5889b;

        /* renamed from: c */
        final boolean f5890c;

        /* renamed from: d */
        final Throwable f5891d;

        static {
            if (C1552a.f5881a) {
                f5889b = null;
                f5888a = null;
                return;
            }
            f5889b = new C1555b(false, null);
            f5888a = new C1555b(true, null);
        }

        C1555b(boolean z, Throwable th) {
            this.f5890c = z;
            this.f5891d = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$c */
    static final class C1556c {

        /* renamed from: a */
        static final C1556c f5892a = new C1556c(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b */
        final Throwable f5893b;

        C1556c(Throwable th) {
            this.f5893b = (Throwable) C1552a.m7622b(th);
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$d */
    static final class C1558d {

        /* renamed from: a */
        static final C1558d f5894a = new C1558d(null, null);

        /* renamed from: b */
        final Runnable f5895b;

        /* renamed from: c */
        final Executor f5896c;

        /* renamed from: d */
        C1558d f5897d;

        C1558d(Runnable runnable, Executor executor) {
            this.f5895b = runnable;
            this.f5896c = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$e */
    static final class C1559e extends C1554a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C1562h, Thread> f5898a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C1562h, C1562h> f5899b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C1552a, C1562h> f5900c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C1552a, C1558d> f5901d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C1552a, Object> f5902e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6828a(C1562h hVar, C1562h hVar2) {
            this.f5899b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6829a(C1562h hVar, Thread thread) {
            this.f5898a.lazySet(hVar, thread);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6830a(C1552a<?> aVar, C1558d dVar, C1558d dVar2) {
            return this.f5901d.compareAndSet(aVar, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6831a(C1552a<?> aVar, C1562h hVar, C1562h hVar2) {
            return this.f5900c.compareAndSet(aVar, hVar, hVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6832a(C1552a<?> aVar, Object obj, Object obj2) {
            return this.f5902e.compareAndSet(aVar, obj, obj2);
        }

        C1559e(AtomicReferenceFieldUpdater<C1562h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1562h, C1562h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1552a, C1562h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1552a, C1558d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1552a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5898a = atomicReferenceFieldUpdater;
            this.f5899b = atomicReferenceFieldUpdater2;
            this.f5900c = atomicReferenceFieldUpdater3;
            this.f5901d = atomicReferenceFieldUpdater4;
            this.f5902e = atomicReferenceFieldUpdater5;
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$f */
    static final class C1560f<V> implements Runnable {

        /* renamed from: a */
        final C1552a<V> f5903a;

        /* renamed from: b */
        final C18253l<? extends V> f5904b;

        public final void run() {
            if (this.f5903a.f5885c == this) {
                if (C1552a.f5882b.mo6832a(this.f5903a, (Object) this, C1552a.m7621b(this.f5904b))) {
                    C1552a.m7619a(this.f5903a);
                }
            }
        }

        C1560f(C1552a<V> aVar, C18253l<? extends V> lVar) {
            this.f5903a = aVar;
            this.f5904b = lVar;
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$g */
    static final class C1561g extends C1554a {
        C1561g() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6828a(C1562h hVar, C1562h hVar2) {
            hVar.f5907c = hVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6829a(C1562h hVar, Thread thread) {
            hVar.f5906b = thread;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6830a(C1552a<?> aVar, C1558d dVar, C1558d dVar2) {
            synchronized (aVar) {
                if (aVar.f5886d != dVar) {
                    return false;
                }
                aVar.f5886d = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6831a(C1552a<?> aVar, C1562h hVar, C1562h hVar2) {
            synchronized (aVar) {
                if (aVar.f5887e != hVar) {
                    return false;
                }
                aVar.f5887e = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6832a(C1552a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5885c != obj) {
                    return false;
                }
                aVar.f5885c = obj2;
                return true;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$h */
    static final class C1562h {

        /* renamed from: a */
        static final C1562h f5905a = new C1562h(false);

        /* renamed from: b */
        volatile Thread f5906b;

        /* renamed from: c */
        volatile C1562h f5907c;

        C1562h() {
            C1552a.f5882b.mo6829a(this, Thread.currentThread());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6835a() {
            Thread thread = this.f5906b;
            if (thread != null) {
                this.f5906b = null;
                LockSupport.unpark(thread);
            }
        }

        private C1562h(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6836a(C1562h hVar) {
            C1552a.f5882b.mo6828a(this, hVar);
        }
    }

    protected C1552a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6820a(V v) {
        if (v == null) {
            v = f5884g;
        }
        if (!f5882b.mo6832a(this, (Object) null, (Object) v)) {
            return false;
        }
        m7619a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6821a(Throwable th) {
        if (!f5882b.mo6832a(this, (Object) null, (Object) new C1556c((Throwable) m7622b((T) th)))) {
            return false;
        }
        m7619a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6819a(C18253l<? extends V> lVar) {
        C1560f fVar;
        C1556c cVar;
        m7622b((T) lVar);
        Object obj = this.f5885c;
        if (obj == null) {
            if (lVar.isDone()) {
                if (!f5882b.mo6832a(this, (Object) null, m7621b(lVar))) {
                    return false;
                }
                m7619a(this);
                return true;
            }
            fVar = new C1560f(this, lVar);
            if (f5882b.mo6832a(this, (Object) null, (Object) fVar)) {
                try {
                    lVar.mo6818a(fVar, C1563b.INSTANCE);
                } catch (Throwable unused) {
                    cVar = C1556c.f5892a;
                }
                return true;
            }
            obj = this.f5885c;
        }
        if (obj instanceof C1555b) {
            lVar.cancel(((C1555b) obj).f5890c);
        }
        return false;
        f5882b.mo6832a(this, (Object) fVar, (Object) cVar);
        return true;
    }

    public final boolean isCancelled() {
        return this.f5885c instanceof C1555b;
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f5885c;
        boolean z2 = false;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(obj instanceof C1560f)) {
            z2 = true;
        }
        return z & z2;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [androidx.work.impl.utils.a.a$g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            f5881a = r0
            java.lang.Class<androidx.work.impl.utils.a.a> r0 = androidx.work.impl.utils.p038a.C1552a.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f5883f = r0
            androidx.work.impl.utils.a.a$e r0 = new androidx.work.impl.utils.a.a$e     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a$h> r1 = androidx.work.impl.utils.p038a.C1552a.C1562h.class
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r3)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a$h> r1 = androidx.work.impl.utils.p038a.C1552a.C1562h.class
            java.lang.Class<androidx.work.impl.utils.a.a$h> r3 = androidx.work.impl.utils.p038a.C1552a.C1562h.class
            java.lang.String r4 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r3, r4)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a> r1 = androidx.work.impl.utils.p038a.C1552a.class
            java.lang.Class<androidx.work.impl.utils.a.a$h> r4 = androidx.work.impl.utils.p038a.C1552a.C1562h.class
            java.lang.String r5 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r4, r5)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a> r1 = androidx.work.impl.utils.p038a.C1552a.class
            java.lang.Class<androidx.work.impl.utils.a.a$d> r5 = androidx.work.impl.utils.p038a.C1552a.C1558d.class
            java.lang.String r6 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r5, r6)     // Catch:{ Throwable -> 0x0054 }
            java.lang.Class<androidx.work.impl.utils.a.a> r1 = androidx.work.impl.utils.p038a.C1552a.class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.String r7 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r6, r7)     // Catch:{ Throwable -> 0x0054 }
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0054 }
            r1 = 0
            goto L_0x005b
        L_0x0054:
            r0 = move-exception
            r1 = r0
            androidx.work.impl.utils.a.a$g r0 = new androidx.work.impl.utils.a.a$g
            r0.<init>()
        L_0x005b:
            f5882b = r0
            if (r1 == 0) goto L_0x0068
            java.util.logging.Logger r0 = f5883f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r0.log(r2, r3, r1)
        L_0x0068:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f5884g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p038a.C1552a.<clinit>():void");
    }

    /* renamed from: a */
    private void m7617a() {
        C1562h hVar;
        do {
            hVar = this.f5887e;
        } while (!f5882b.mo6831a(this, hVar, C1562h.f5905a));
        while (hVar != null) {
            hVar.mo6835a();
            hVar = hVar.f5907c;
        }
    }

    public final V get() throws InterruptedException, ExecutionException {
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5885c;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj2 instanceof C1560f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return m7625c(obj2);
            }
            C1562h hVar = this.f5887e;
            if (hVar != C1562h.f5905a) {
                C1562h hVar2 = new C1562h();
                do {
                    hVar2.mo6836a(hVar);
                    if (f5882b.mo6831a(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5885c;
                                if (obj != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!(obj instanceof C1560f)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                m7618a(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z3 & z4));
                        return m7625c(obj);
                    }
                    hVar = this.f5887e;
                } while (hVar != C1562h.f5905a);
            }
            return m7625c(this.f5885c);
        }
        throw new InterruptedException();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m7620a(sb);
        } else {
            try {
                str = m7623b();
            } catch (RuntimeException e) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append(e.getClass());
                str = sb2.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m7620a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    private String m7623b() {
        Object obj = this.f5885c;
        if (obj instanceof C1560f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            sb.append(m7626d(((C1560f) obj).f5904b));
            sb.append("]");
            return sb.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder("remaining delay=[");
            sb2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            sb2.append(" ms]");
            return sb2.toString();
        }
    }

    /* renamed from: b */
    static <T> T m7622b(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    private String m7626d(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private C1558d m7614a(C1558d dVar) {
        C1558d dVar2;
        do {
            dVar2 = this.f5886d;
        } while (!f5882b.mo6830a(this, dVar2, C1558d.f5894a));
        C1558d dVar3 = dVar2;
        C1558d dVar4 = dVar;
        C1558d dVar5 = dVar3;
        while (dVar5 != null) {
            C1558d dVar6 = dVar5.f5897d;
            dVar5.f5897d = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    /* renamed from: a */
    private static <V> V m7615a(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: c */
    private static V m7625c(Object obj) throws ExecutionException {
        if (obj instanceof C1555b) {
            throw m7616a("Task was cancelled.", ((C1555b) obj).f5891d);
        } else if (obj instanceof C1556c) {
            throw new ExecutionException(((C1556c) obj).f5893b);
        } else if (obj == f5884g) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: b */
    static Object m7621b(C18253l<?> lVar) {
        if (lVar instanceof C1552a) {
            Object obj = ((C1552a) lVar).f5885c;
            if (obj instanceof C1555b) {
                C1555b bVar = (C1555b) obj;
                if (bVar.f5890c) {
                    obj = bVar.f5891d != null ? new C1555b(false, bVar.f5891d) : C1555b.f5889b;
                }
            }
            return obj;
        }
        boolean isCancelled = lVar.isCancelled();
        if ((!f5881a) && isCancelled) {
            return C1555b.f5889b;
        }
        try {
            Object a = m7615a((Future<V>) lVar);
            if (a == null) {
                a = f5884g;
            }
            return a;
        } catch (ExecutionException e) {
            return new C1556c(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1555b(false, e2);
            }
            StringBuilder sb = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append(lVar);
            return new C1556c(new IllegalArgumentException(sb.toString(), e2));
        } catch (Throwable th) {
            return new C1556c(th);
        }
    }

    public final boolean cancel(boolean z) {
        boolean z2;
        C1555b bVar;
        boolean z3;
        Object obj = this.f5885c;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof C1560f)) {
            return false;
        }
        if (f5881a) {
            bVar = new C1555b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = C1555b.f5888a;
        } else {
            bVar = C1555b.f5889b;
        }
        boolean z4 = false;
        Object obj2 = obj;
        C1552a aVar = this;
        while (true) {
            if (f5882b.mo6832a(aVar, obj2, (Object) bVar)) {
                m7619a(aVar);
                if (!(obj2 instanceof C1560f)) {
                    return true;
                }
                C18253l<? extends V> lVar = ((C1560f) obj2).f5904b;
                if (lVar instanceof C1552a) {
                    aVar = (C1552a) lVar;
                    obj2 = aVar.f5885c;
                    if (obj2 == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj2 instanceof C1560f)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    lVar.cancel(z);
                    return true;
                }
            } else {
                obj2 = aVar.f5885c;
                if (!(obj2 instanceof C1560f)) {
                    return z4;
                }
            }
        }
    }

    /* renamed from: a */
    private void m7618a(C1562h hVar) {
        hVar.f5906b = null;
        while (true) {
            C1562h hVar2 = this.f5887e;
            if (hVar2 != C1562h.f5905a) {
                C1562h hVar3 = null;
                while (hVar2 != null) {
                    C1562h hVar4 = hVar2.f5907c;
                    if (hVar2.f5906b != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f5907c = hVar4;
                        if (hVar3.f5906b == null) {
                        }
                    } else if (f5882b.mo6831a(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=androidx.work.impl.utils.a.a<?>, code=androidx.work.impl.utils.a.a, for r4v0, types: [androidx.work.impl.utils.a.a, androidx.work.impl.utils.a.a<?>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m7619a(androidx.work.impl.utils.p038a.C1552a r4) {
        /*
            r0 = 0
        L_0x0001:
            r4.m7617a()
            androidx.work.impl.utils.a.a$d r4 = r4.m7614a(r0)
        L_0x0008:
            if (r4 == 0) goto L_0x0030
            androidx.work.impl.utils.a.a$d r0 = r4.f5897d
            java.lang.Runnable r1 = r4.f5895b
            boolean r2 = r1 instanceof androidx.work.impl.utils.p038a.C1552a.C1560f
            if (r2 == 0) goto L_0x0029
            androidx.work.impl.utils.a.a$f r1 = (androidx.work.impl.utils.p038a.C1552a.C1560f) r1
            androidx.work.impl.utils.a.a<V> r4 = r1.f5903a
            java.lang.Object r2 = r4.f5885c
            if (r2 != r1) goto L_0x002e
            com.google.common.util.concurrent.l<? extends V> r2 = r1.f5904b
            java.lang.Object r2 = m7621b(r2)
            androidx.work.impl.utils.a.a$a r3 = f5882b
            boolean r1 = r3.mo6832a(r4, r1, r2)
            if (r1 != 0) goto L_0x0001
            goto L_0x002e
        L_0x0029:
            java.util.concurrent.Executor r4 = r4.f5896c
            m7624b(r1, r4)
        L_0x002e:
            r4 = r0
            goto L_0x0008
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p038a.C1552a.m7619a(androidx.work.impl.utils.a.a):void");
    }

    /* renamed from: a */
    private void m7620a(StringBuilder sb) {
        try {
            Object a = m7615a((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(m7626d(a));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: a */
    private static CancellationException m7616a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: b */
    private static void m7624b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f5883f;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f5885c;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj instanceof C1560f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return m7625c(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                C1562h hVar = this.f5887e;
                if (hVar != C1562h.f5905a) {
                    C1562h hVar2 = new C1562h();
                    do {
                        hVar2.mo6836a(hVar);
                        if (f5882b.mo6831a(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5885c;
                                    if (obj2 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!(obj2 instanceof C1560f)) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z6 && z7) {
                                        return m7625c(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    m7618a(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m7618a(hVar2);
                        } else {
                            hVar = this.f5887e;
                        }
                    } while (hVar != C1562h.f5905a);
                }
                return m7625c(this.f5885c);
            }
            while (nanos > 0) {
                Object obj3 = this.f5885c;
                if (obj3 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!(obj3 instanceof C1560f)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z4 && z5) {
                    return m7625c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder("Waited ");
            sb.append(j3);
            sb.append(" ");
            sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" (plus ");
                String sb4 = sb3.toString();
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                if (convert == 0 || nanos2 > 1000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (convert > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb4);
                    sb5.append(convert);
                    sb5.append(" ");
                    sb5.append(lowerCase);
                    String sb6 = sb5.toString();
                    if (z3) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(sb6);
                        sb7.append(",");
                        sb6 = sb7.toString();
                    }
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb6);
                    sb8.append(" ");
                    sb4 = sb8.toString();
                }
                if (z3) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb4);
                    sb9.append(nanos2);
                    sb9.append(" nanoseconds ");
                    sb4 = sb9.toString();
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(sb4);
                sb10.append("delay)");
                sb2 = sb10.toString();
            }
            if (isDone()) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb2);
                sb11.append(" but future completed as timeout expired");
                throw new TimeoutException(sb11.toString());
            }
            StringBuilder sb12 = new StringBuilder();
            sb12.append(sb2);
            sb12.append(" for ");
            sb12.append(aVar);
            throw new TimeoutException(sb12.toString());
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    public final void mo6818a(Runnable runnable, Executor executor) {
        m7622b((T) runnable);
        m7622b((T) executor);
        C1558d dVar = this.f5886d;
        if (dVar != C1558d.f5894a) {
            C1558d dVar2 = new C1558d(runnable, executor);
            do {
                dVar2.f5897d = dVar;
                if (!f5882b.mo6830a(this, dVar, dVar2)) {
                    dVar = this.f5886d;
                } else {
                    return;
                }
            } while (dVar != C1558d.f5894a);
        }
        m7624b(runnable, executor);
    }
}
