package com.google.common.util.concurrent;

import com.google.common.base.C17404c;
import com.google.common.base.C17439m;
import com.google.common.base.C17456r;
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
import sun.misc.Unsafe;

/* renamed from: com.google.common.util.concurrent.b */
public abstract class C18225b<V> extends C18244f<V> {

    /* renamed from: a */
    private static final Logger f49590a = Logger.getLogger(C18225b.class.getName());

    /* renamed from: b */
    private static final Object f49591b = new Object();

    /* renamed from: d */
    public static final boolean f49592d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final C18227a f49593e;

    /* renamed from: f */
    public volatile Object f49594f;

    /* renamed from: g */
    public volatile C18231d f49595g;

    /* renamed from: h */
    public volatile C18238j f49596h;

    /* renamed from: com.google.common.util.concurrent.b$a */
    static abstract class C18227a {
        private C18227a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo47096a(C18238j jVar, C18238j jVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo47097a(C18238j jVar, Thread thread);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo47098a(C18225b<?> bVar, C18231d dVar, C18231d dVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo47099a(C18225b<?> bVar, C18238j jVar, C18238j jVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo47100a(C18225b<?> bVar, Object obj, Object obj2);
    }

    /* renamed from: com.google.common.util.concurrent.b$b */
    static final class C18228b {

        /* renamed from: a */
        static final C18228b f49597a;

        /* renamed from: b */
        static final C18228b f49598b;

        /* renamed from: c */
        final boolean f49599c;

        /* renamed from: d */
        final Throwable f49600d;

        static {
            if (C18225b.f49592d) {
                f49598b = null;
                f49597a = null;
                return;
            }
            f49598b = new C18228b(false, null);
            f49597a = new C18228b(true, null);
        }

        C18228b(boolean z, Throwable th) {
            this.f49599c = z;
            this.f49600d = th;
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$c */
    static final class C18229c {

        /* renamed from: a */
        static final C18229c f49601a = new C18229c(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b */
        final Throwable f49602b;

        C18229c(Throwable th) {
            this.f49602b = (Throwable) C17439m.m57962a(th);
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$d */
    static final class C18231d {

        /* renamed from: a */
        static final C18231d f49603a = new C18231d(null, null);

        /* renamed from: b */
        final Runnable f49604b;

        /* renamed from: c */
        final Executor f49605c;

        /* renamed from: d */
        C18231d f49606d;

        C18231d(Runnable runnable, Executor executor) {
            this.f49604b = runnable;
            this.f49605c = executor;
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$e */
    static final class C18232e extends C18227a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C18238j, Thread> f49607a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C18238j, C18238j> f49608b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C18225b, C18238j> f49609c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C18225b, C18231d> f49610d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C18225b, Object> f49611e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47096a(C18238j jVar, C18238j jVar2) {
            this.f49608b.lazySet(jVar, jVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47097a(C18238j jVar, Thread thread) {
            this.f49607a.lazySet(jVar, thread);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo47098a(C18225b<?> bVar, C18231d dVar, C18231d dVar2) {
            return this.f49610d.compareAndSet(bVar, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo47099a(C18225b<?> bVar, C18238j jVar, C18238j jVar2) {
            return this.f49609c.compareAndSet(bVar, jVar, jVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo47100a(C18225b<?> bVar, Object obj, Object obj2) {
            return this.f49611e.compareAndSet(bVar, obj, obj2);
        }

        C18232e(AtomicReferenceFieldUpdater<C18238j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C18238j, C18238j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C18225b, C18238j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C18225b, C18231d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C18225b, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f49607a = atomicReferenceFieldUpdater;
            this.f49608b = atomicReferenceFieldUpdater2;
            this.f49609c = atomicReferenceFieldUpdater3;
            this.f49610d = atomicReferenceFieldUpdater4;
            this.f49611e = atomicReferenceFieldUpdater5;
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$f */
    static final class C18233f<V> implements Runnable {

        /* renamed from: a */
        final C18225b<V> f49612a;

        /* renamed from: b */
        final C18253l<? extends V> f49613b;

        public final void run() {
            if (this.f49612a.f49594f == this) {
                if (C18225b.f49593e.mo47100a(this.f49612a, (Object) this, C18225b.m60158b(this.f49613b))) {
                    C18225b.m60156a(this.f49612a);
                }
            }
        }

        C18233f(C18225b<V> bVar, C18253l<? extends V> lVar) {
            this.f49612a = bVar;
            this.f49613b = lVar;
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$g */
    static final class C18234g extends C18227a {
        private C18234g() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47096a(C18238j jVar, C18238j jVar2) {
            jVar.f49622c = jVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47097a(C18238j jVar, Thread thread) {
            jVar.f49621b = thread;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo47098a(C18225b<?> bVar, C18231d dVar, C18231d dVar2) {
            synchronized (bVar) {
                if (bVar.f49595g != dVar) {
                    return false;
                }
                bVar.f49595g = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo47099a(C18225b<?> bVar, C18238j jVar, C18238j jVar2) {
            synchronized (bVar) {
                if (bVar.f49596h != jVar) {
                    return false;
                }
                bVar.f49596h = jVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo47100a(C18225b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                if (bVar.f49594f != obj) {
                    return false;
                }
                bVar.f49594f = obj2;
                return true;
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$h */
    static abstract class C18235h<V> extends C18225b<V> {
        C18235h() {
        }

        public final V get() throws InterruptedException, ExecutionException {
            return C18225b.super.get();
        }

        public final boolean isCancelled() {
            return C18225b.super.isCancelled();
        }

        public final boolean isDone() {
            return C18225b.super.isDone();
        }

        public final boolean cancel(boolean z) {
            return C18225b.super.cancel(z);
        }

        /* renamed from: a */
        public final void mo6818a(Runnable runnable, Executor executor) {
            C18225b.super.mo6818a(runnable, executor);
        }

        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return C18225b.super.get(j, timeUnit);
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$i */
    static final class C18236i extends C18227a {

        /* renamed from: a */
        static final Unsafe f49614a;

        /* renamed from: b */
        static final long f49615b;

        /* renamed from: c */
        static final long f49616c;

        /* renamed from: d */
        static final long f49617d;

        /* renamed from: e */
        static final long f49618e;

        /* renamed from: f */
        static final long f49619f;

        private C18236i() {
            super();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.C18225b.C18236i.C182371());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                com.google.common.util.concurrent.b$i$1 r0 = new com.google.common.util.concurrent.b$i$1     // Catch:{ PrivilegedActionException -> 0x005f }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005f }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005f }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005f }
            L_0x0010:
                java.lang.Class<com.google.common.util.concurrent.b> r1 = com.google.common.util.concurrent.C18225b.class
                java.lang.String r2 = "waiters"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                f49616c = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "listeners"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                f49615b = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f49617d = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.common.util.concurrent.b$j> r1 = com.google.common.util.concurrent.C18225b.C18238j.class
                java.lang.String r2 = "b"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f49618e = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.common.util.concurrent.b$j> r1 = com.google.common.util.concurrent.C18225b.C18238j.class
                java.lang.String r2 = "c"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f49619f = r1     // Catch:{ Exception -> 0x0055 }
                f49614a = r0     // Catch:{ Exception -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                com.google.common.base.C17462u.m58022a(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C18225b.C18236i.<clinit>():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47096a(C18238j jVar, C18238j jVar2) {
            f49614a.putObject(jVar, f49619f, jVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47097a(C18238j jVar, Thread thread) {
            f49614a.putObject(jVar, f49618e, thread);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo47098a(C18225b<?> bVar, C18231d dVar, C18231d dVar2) {
            return f49614a.compareAndSwapObject(bVar, f49615b, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo47099a(C18225b<?> bVar, C18238j jVar, C18238j jVar2) {
            return f49614a.compareAndSwapObject(bVar, f49616c, jVar, jVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo47100a(C18225b<?> bVar, Object obj, Object obj2) {
            return f49614a.compareAndSwapObject(bVar, f49617d, obj, obj2);
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$j */
    static final class C18238j {

        /* renamed from: a */
        static final C18238j f49620a = new C18238j(false);

        /* renamed from: b */
        volatile Thread f49621b;

        /* renamed from: c */
        volatile C18238j f49622c;

        C18238j() {
            C18225b.f49593e.mo47097a(this, Thread.currentThread());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47104a() {
            Thread thread = this.f49621b;
            if (thread != null) {
                this.f49621b = null;
                LockSupport.unpark(thread);
            }
        }

        private C18238j(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47105a(C18238j jVar) {
            C18225b.f49593e.mo47096a(this, jVar);
        }
    }

    protected C18225b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo47083b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo47089c() {
    }

    /* renamed from: a */
    public boolean mo47087a(Throwable th) {
        if (!f49593e.mo47100a(this, (Object) null, (Object) new C18229c((Throwable) C17439m.m57962a(th)))) {
            return false;
        }
        m60156a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47086a(C18253l<? extends V> lVar) {
        C18233f fVar;
        C18229c cVar;
        C17439m.m57962a(lVar);
        Object obj = this.f49594f;
        if (obj == null) {
            if (lVar.isDone()) {
                if (!f49593e.mo47100a(this, (Object) null, m60158b(lVar))) {
                    return false;
                }
                m60156a(this);
                return true;
            }
            fVar = new C18233f(this, lVar);
            if (f49593e.mo47100a(this, (Object) null, (Object) fVar)) {
                try {
                    lVar.mo6818a(fVar, C18254m.m60217a());
                } catch (Throwable unused) {
                    cVar = C18229c.f49601a;
                }
                return true;
            }
            obj = this.f49594f;
        }
        if (obj instanceof C18228b) {
            lVar.cancel(((C18228b) obj).f49599c);
        }
        return false;
        f49593e.mo47100a(this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47085a(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo97925d());
        }
    }

    public boolean isCancelled() {
        return this.f49594f instanceof C18228b;
    }

    /* renamed from: d */
    private boolean mo97925d() {
        Object obj = this.f49594f;
        if (!(obj instanceof C18228b) || !((C18228b) obj).f49599c) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m60162e() {
        C18238j jVar;
        do {
            jVar = this.f49596h;
        } while (!f49593e.mo47099a(this, jVar, C18238j.f49620a));
        while (jVar != null) {
            jVar.mo47104a();
            jVar = jVar.f49622c;
        }
    }

    public boolean isDone() {
        boolean z;
        Object obj = this.f49594f;
        boolean z2 = false;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(obj instanceof C18233f)) {
            z2 = true;
        }
        return z & z2;
    }

    public V get() throws InterruptedException, ExecutionException {
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        if (!Thread.interrupted()) {
            Object obj2 = this.f49594f;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj2 instanceof C18233f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return mo47082a(obj2);
            }
            C18238j jVar = this.f49596h;
            if (jVar != C18238j.f49620a) {
                C18238j jVar2 = new C18238j();
                do {
                    jVar2.mo47105a(jVar);
                    if (f49593e.mo47099a(this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f49594f;
                                if (obj != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!(obj instanceof C18233f)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                m60155a(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z3 & z4));
                        return mo47082a(obj);
                    }
                    jVar = this.f49596h;
                } while (jVar != C18238j.f49620a);
            }
            return mo47082a(this.f49594f);
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
            m60157a(sb);
        } else {
            try {
                str = mo47081a();
            } catch (RuntimeException e) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append(e.getClass());
                str = sb2.toString();
            }
            if (!C17456r.m58013a(str)) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m60157a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    static {
        Throwable th;
        C18227a aVar;
        Throwable th2 = null;
        try {
            th = null;
            aVar = new C18236i();
        } catch (Throwable th3) {
            th2 = th3;
            th = th;
            aVar = new C18234g();
        }
        f49593e = aVar;
        if (th2 != null) {
            f49590a.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            f49590a.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo47081a() {
        Object obj = this.f49594f;
        if (obj instanceof C18233f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            sb.append(m60160c(((C18233f) obj).f49613b));
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

    /* renamed from: c */
    private String m60160c(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private C18231d m60152a(C18231d dVar) {
        C18231d dVar2;
        do {
            dVar2 = this.f49595g;
        } while (!f49593e.mo47098a(this, dVar2, C18231d.f49603a));
        C18231d dVar3 = dVar2;
        C18231d dVar4 = dVar;
        C18231d dVar5 = dVar3;
        while (dVar5 != null) {
            C18231d dVar6 = dVar5.f49606d;
            dVar5.f49606d = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    /* renamed from: b */
    public boolean mo47088b(V v) {
        if (v == null) {
            v = f49591b;
        }
        if (!f49593e.mo47100a(this, (Object) null, (Object) v)) {
            return false;
        }
        m60156a(this);
        return true;
    }

    /* renamed from: a */
    private static V mo47082a(Object obj) throws ExecutionException {
        if (obj instanceof C18228b) {
            throw m60154a("Task was cancelled.", ((C18228b) obj).f49600d);
        } else if (obj instanceof C18229c) {
            throw new ExecutionException(((C18229c) obj).f49602b);
        } else if (obj == f49591b) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: a */
    private void m60155a(C18238j jVar) {
        jVar.f49621b = null;
        while (true) {
            C18238j jVar2 = this.f49596h;
            if (jVar2 != C18238j.f49620a) {
                C18238j jVar3 = null;
                while (jVar2 != null) {
                    C18238j jVar4 = jVar2.f49622c;
                    if (jVar2.f49621b != null) {
                        jVar3 = jVar2;
                    } else if (jVar3 != null) {
                        jVar3.f49622c = jVar4;
                        if (jVar3.f49621b == null) {
                        }
                    } else if (f49593e.mo47099a(this, jVar2, jVar4)) {
                    }
                    jVar2 = jVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: b */
    public static Object m60158b(C18253l<?> lVar) {
        Object obj;
        if (lVar instanceof C18235h) {
            Object obj2 = ((C18225b) lVar).f49594f;
            if (obj2 instanceof C18228b) {
                C18228b bVar = (C18228b) obj2;
                if (bVar.f49599c) {
                    obj2 = bVar.f49600d != null ? new C18228b(false, bVar.f49600d) : C18228b.f49598b;
                }
            }
            return obj2;
        }
        try {
            Object a = C18246h.m60212a((Future<V>) lVar);
            if (a == null) {
                a = f49591b;
            }
            obj = a;
        } catch (ExecutionException e) {
            obj = new C18229c(e.getCause());
        } catch (CancellationException e2) {
            obj = new C18228b(false, e2);
        } catch (Throwable th) {
            obj = new C18229c(th);
        }
        return obj;
    }

    public boolean cancel(boolean z) {
        boolean z2;
        C18228b bVar;
        boolean z3;
        Object obj = this.f49594f;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof C18233f)) {
            return false;
        }
        if (f49592d) {
            bVar = new C18228b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = C18228b.f49597a;
        } else {
            bVar = C18228b.f49598b;
        }
        boolean z4 = false;
        Object obj2 = obj;
        C18225b bVar2 = this;
        while (true) {
            if (f49593e.mo47100a(bVar2, obj2, (Object) bVar)) {
                if (z) {
                    bVar2.mo47089c();
                }
                m60156a(bVar2);
                if (!(obj2 instanceof C18233f)) {
                    return true;
                }
                C18253l<? extends V> lVar = ((C18233f) obj2).f49613b;
                if (lVar instanceof C18235h) {
                    bVar2 = (C18225b) lVar;
                    obj2 = bVar2.f49594f;
                    if (obj2 == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj2 instanceof C18233f)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    lVar.cancel(z);
                    return true;
                }
            } else {
                obj2 = bVar2.f49594f;
                if (!(obj2 instanceof C18233f)) {
                    return z4;
                }
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.common.util.concurrent.b<?>, code=com.google.common.util.concurrent.b, for r4v0, types: [com.google.common.util.concurrent.b, com.google.common.util.concurrent.b<?>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m60156a(com.google.common.util.concurrent.C18225b r4) {
        /*
            r0 = 0
        L_0x0001:
            r4.m60162e()
            r4.mo47083b()
            com.google.common.util.concurrent.b$d r4 = r4.m60152a(r0)
        L_0x000b:
            if (r4 == 0) goto L_0x0033
            com.google.common.util.concurrent.b$d r0 = r4.f49606d
            java.lang.Runnable r1 = r4.f49604b
            boolean r2 = r1 instanceof com.google.common.util.concurrent.C18225b.C18233f
            if (r2 == 0) goto L_0x002c
            com.google.common.util.concurrent.b$f r1 = (com.google.common.util.concurrent.C18225b.C18233f) r1
            com.google.common.util.concurrent.b<V> r4 = r1.f49612a
            java.lang.Object r2 = r4.f49594f
            if (r2 != r1) goto L_0x0031
            com.google.common.util.concurrent.l<? extends V> r2 = r1.f49613b
            java.lang.Object r2 = m60158b(r2)
            com.google.common.util.concurrent.b$a r3 = f49593e
            boolean r1 = r3.mo47100a(r4, r1, r2)
            if (r1 != 0) goto L_0x0001
            goto L_0x0031
        L_0x002c:
            java.util.concurrent.Executor r4 = r4.f49605c
            mo97924b(r1, r4)
        L_0x0031:
            r4 = r0
            goto L_0x000b
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C18225b.m60156a(com.google.common.util.concurrent.b):void");
    }

    /* renamed from: a */
    private void m60157a(StringBuilder sb) {
        try {
            Object a = C18246h.m60212a((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(m60160c(a));
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
    private static CancellationException m60154a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: b */
    private static void mo97924b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f49590a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j3 = j;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f49594f;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj instanceof C18233f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return mo47082a(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                C18238j jVar = this.f49596h;
                if (jVar != C18238j.f49620a) {
                    C18238j jVar2 = new C18238j();
                    do {
                        jVar2.mo47105a(jVar);
                        if (f49593e.mo47099a(this, jVar, jVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f49594f;
                                    if (obj2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (!(obj2 instanceof C18233f)) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z5 && z6) {
                                        return mo47082a(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    m60155a(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m60155a(jVar2);
                        } else {
                            jVar = this.f49596h;
                        }
                    } while (jVar != C18238j.f49620a);
                }
                return mo47082a(this.f49594f);
            }
            while (nanos > 0) {
                Object obj3 = this.f49594f;
                if (obj3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!(obj3 instanceof C18233f)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 && z4) {
                    return mo47082a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String bVar = toString();
            if (isDone()) {
                StringBuilder sb = new StringBuilder("Waited ");
                sb.append(j3);
                sb.append(" ");
                sb.append(C17404c.m57886a(timeUnit.toString()));
                sb.append(" but future completed as timeout expired");
                throw new TimeoutException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("Waited ");
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(C17404c.m57886a(timeUnit.toString()));
            sb2.append(" for ");
            sb2.append(bVar);
            throw new TimeoutException(sb2.toString());
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    public void mo6818a(Runnable runnable, Executor executor) {
        C17439m.m57963a(runnable, (Object) "Runnable was null.");
        C17439m.m57963a(executor, (Object) "Executor was null.");
        C18231d dVar = this.f49595g;
        if (dVar != C18231d.f49603a) {
            C18231d dVar2 = new C18231d(runnable, executor);
            do {
                dVar2.f49606d = dVar;
                if (!f49593e.mo47098a(this, dVar, dVar2)) {
                    dVar = this.f49595g;
                } else {
                    return;
                }
            } while (dVar != C18231d.f49603a);
        }
        mo97924b(runnable, executor);
    }
}
