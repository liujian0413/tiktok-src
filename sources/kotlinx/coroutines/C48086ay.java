package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C48020o;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;
import kotlinx.coroutines.C48066am.C48067a;
import kotlinx.coroutines.internal.C48166l;
import kotlinx.coroutines.internal.C48185y;
import kotlinx.coroutines.internal.C48186z;

/* renamed from: kotlinx.coroutines.ay */
public abstract class C48086ay extends C48085ax implements C48066am {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f122946b = AtomicReferenceFieldUpdater.newUpdater(C48086ay.class, Object.class, "_queue");

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f122947c = AtomicReferenceFieldUpdater.newUpdater(C48086ay.class, Object.class, "_delayed");
    private volatile Object _delayed;
    private volatile Object _queue;
    public volatile boolean isCompleted;

    /* renamed from: kotlinx.coroutines.ay$a */
    final class C48087a extends C48089c {

        /* renamed from: a */
        final /* synthetic */ C48086ay f122948a;

        /* renamed from: c */
        private final C48187j<C7581n> f122949c;

        public final void run() {
            this.f122949c.mo120405a(this.f122948a, C7581n.f20898a);
        }

        public C48087a(C48086ay ayVar, long j, C48187j<? super C7581n> jVar) {
            C7573i.m23587b(jVar, "cont");
            this.f122948a = ayVar;
            super(j);
            this.f122949c = jVar;
            C48189l.m149525a(this.f122949c, this);
        }
    }

    /* renamed from: kotlinx.coroutines.ay$b */
    public static final class C48088b extends C48089c {

        /* renamed from: a */
        private final Runnable f122950a;

        public final void run() {
            this.f122950a.run();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.f122950a.toString());
            return sb.toString();
        }

        public C48088b(long j, Runnable runnable) {
            C7573i.m23587b(runnable, "block");
            super(j);
            this.f122950a = runnable;
        }
    }

    /* renamed from: kotlinx.coroutines.ay$c */
    public static abstract class C48089c implements Comparable<C48089c>, Runnable, C48081at, C48186z {

        /* renamed from: a */
        private Object f122951a;

        /* renamed from: b */
        public final long f122952b;

        /* renamed from: c */
        private int f122953c = -1;

        /* renamed from: c */
        public final int mo120317c() {
            return this.f122953c;
        }

        /* renamed from: d */
        public final void mo120319d() {
            C48060ah.f122908b.mo120307a(this);
        }

        /* renamed from: b */
        public final C48185y<?> mo120316b() {
            Object obj = this.f122951a;
            if (!(obj instanceof C48185y)) {
                obj = null;
            }
            return (C48185y) obj;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Delayed[nanos=");
            sb.append(this.f122952b);
            sb.append(']');
            return sb.toString();
        }

        /* renamed from: a */
        public final synchronized void mo120281a() {
            Object obj = this.f122951a;
            if (obj != C48090az.f122954a) {
                if (!(obj instanceof C48185y)) {
                    obj = null;
                }
                C48185y yVar = (C48185y) obj;
                if (yVar != null) {
                    yVar.mo120399a(this);
                }
                this.f122951a = C48090az.f122954a;
            }
        }

        /* renamed from: a */
        public final void mo120313a(int i) {
            this.f122953c = i;
        }

        /* renamed from: a */
        public final boolean mo120315a(long j) {
            if (j - this.f122952b >= 0) {
                return true;
            }
            return false;
        }

        public C48089c(long j) {
            this.f122952b = C48130ce.m149255a().mo120268a() + C48090az.m149118a(j);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compareTo(C48089c cVar) {
            C7573i.m23587b(cVar, "other");
            long j = this.f122952b - cVar.f122952b;
            if (j > 0) {
                return 1;
            }
            if (j < 0) {
                return -1;
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo120314a(C48185y<?> yVar) {
            boolean z;
            if (this.f122951a != C48090az.f122954a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f122951a = yVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: a */
        public final synchronized int mo120312a(C48185y<C48089c> yVar, C48086ay ayVar) {
            boolean z;
            C7573i.m23587b(yVar, "delayed");
            C7573i.m23587b(ayVar, "eventLoop");
            if (this.f122951a == C48090az.f122954a) {
                return 2;
            }
            C48186z zVar = this;
            synchronized (yVar) {
                if (!ayVar.isCompleted) {
                    yVar.mo120401b(zVar);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return 0;
            }
            return 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Thread mo120265a();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo120308i() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: j */
    private final void m149094j() {
        Thread a = mo120265a();
        if (Thread.currentThread() != a) {
            C48130ce.m149255a().mo120271a(a);
        }
    }

    /* renamed from: m */
    private final void m149097m() {
        while (true) {
            C48185y yVar = (C48185y) this._delayed;
            if (yVar != null) {
                C48089c cVar = (C48089c) yVar.mo120402c();
                if (cVar != null) {
                    cVar.mo120319d();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo120305h() {
        C48128cc.m149250c();
        this.isCompleted = true;
        m149096l();
        do {
        } while (mo120298b() <= 0);
        m149097m();
    }

    /* renamed from: k */
    private final Runnable m149095k() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C48166l) {
                if (obj != null) {
                    C48166l lVar = (C48166l) obj;
                    Object d = lVar.mo120391d();
                    if (d != C48166l.f123021e) {
                        return (Runnable) d;
                    }
                    f122946b.compareAndSet(this, obj, lVar.mo120392e());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C48090az.f122955b) {
                return null;
            } else {
                if (f122946b.compareAndSet(this, obj, null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: l */
    private final void m149096l() {
        boolean z = this.isCompleted;
        if (!C48020o.f122844a || z) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f122946b.compareAndSet(this, null, C48090az.f122955b)) {
                        return;
                    }
                } else if (obj instanceof C48166l) {
                    ((C48166l) obj).mo120390c();
                    return;
                } else if (obj != C48090az.f122955b) {
                    C48166l lVar = new C48166l(8, true);
                    if (obj != null) {
                        lVar.mo120386a((Runnable) obj);
                        if (f122946b.compareAndSet(this, obj, lVar)) {
                            return;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError("Assertion failed");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo120300c() {
        if (!mo120304g()) {
            return false;
        }
        C48185y yVar = (C48185y) this._delayed;
        if (yVar != null && !yVar.mo120398a()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C48166l) {
            return ((C48166l) obj).mo120388a();
        }
        if (obj == C48090az.f122955b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo120301d() {
        if (super.mo120301d() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C48166l) {
                if (!((C48166l) obj).mo120388a()) {
                    return 0;
                }
            } else if (obj == C48090az.f122955b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C48185y yVar = (C48185y) this._delayed;
        if (yVar == null) {
            return Long.MAX_VALUE;
        }
        C48089c cVar = (C48089c) yVar.mo120400b();
        if (cVar == null) {
            return Long.MAX_VALUE;
        }
        return C7551d.m23562a(cVar.f122952b - C48130ce.m149255a().mo120268a(), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0050  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo120298b() {
        /*
            r7 = this;
            boolean r0 = r7.mo120302e()
            if (r0 == 0) goto L_0x000b
            long r0 = r7.mo120301d()
            return r0
        L_0x000b:
            java.lang.Object r0 = r7._delayed
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.C48185y) r0
            if (r0 == 0) goto L_0x004a
            boolean r1 = r0.mo120398a()
            if (r1 != 0) goto L_0x004a
            kotlinx.coroutines.cd r1 = kotlinx.coroutines.C48130ce.m149255a()
            long r1 = r1.mo120268a()
        L_0x001f:
            monitor-enter(r0)
            kotlinx.coroutines.internal.z r3 = r0.mo120403d()     // Catch:{ all -> 0x0047 }
            r4 = 0
            if (r3 != 0) goto L_0x0029
            monitor-exit(r0)
            goto L_0x0042
        L_0x0029:
            kotlinx.coroutines.ay$c r3 = (kotlinx.coroutines.C48086ay.C48089c) r3     // Catch:{ all -> 0x0047 }
            boolean r5 = r3.mo120315a(r1)     // Catch:{ all -> 0x0047 }
            r6 = 0
            if (r5 == 0) goto L_0x0039
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r7.m149091b(r3)     // Catch:{ all -> 0x0047 }
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x0041
            kotlinx.coroutines.internal.z r3 = r0.mo120397a(r6)     // Catch:{ all -> 0x0047 }
            r4 = r3
        L_0x0041:
            monitor-exit(r0)
        L_0x0042:
            kotlinx.coroutines.ay$c r4 = (kotlinx.coroutines.C48086ay.C48089c) r4
            if (r4 != 0) goto L_0x001f
            goto L_0x004a
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004a:
            java.lang.Runnable r0 = r7.m149095k()
            if (r0 == 0) goto L_0x0053
            r0.run()
        L_0x0053:
            long r0 = r7.mo120301d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48086ay.mo120298b():long");
    }

    /* renamed from: b */
    private final boolean m149092b(C48089c cVar) {
        C48089c cVar2;
        C48185y yVar = (C48185y) this._delayed;
        if (yVar != null) {
            cVar2 = (C48089c) yVar.mo120400b();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final int m149093c(C48089c cVar) {
        if (this.isCompleted) {
            return 1;
        }
        C48185y yVar = (C48185y) this._delayed;
        if (yVar == null) {
            C48086ay ayVar = this;
            f122947c.compareAndSet(ayVar, null, new C48185y());
            Object obj = ayVar._delayed;
            if (obj == null) {
                C7573i.m23580a();
            }
            yVar = (C48185y) obj;
        }
        return cVar.mo120312a(yVar, this);
    }

    /* renamed from: a */
    public final void mo120306a(Runnable runnable) {
        C48086ay ayVar = this;
        while (true) {
            C7573i.m23587b(runnable, "task");
            if (ayVar.m149091b(runnable)) {
                ayVar.m149094j();
                return;
            }
            ayVar = C48060ah.f122908b;
        }
    }

    /* renamed from: b */
    private final boolean m149091b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f122946b.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C48166l) {
                if (obj != null) {
                    C48166l lVar = (C48166l) obj;
                    switch (lVar.mo120386a(runnable)) {
                        case 0:
                            return true;
                        case 1:
                            f122946b.compareAndSet(this, obj, lVar.mo120392e());
                            break;
                        case 2:
                            return false;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C48090az.f122955b) {
                return false;
            } else {
                C48166l lVar2 = new C48166l(8, true);
                if (obj != null) {
                    lVar2.mo120386a((Runnable) obj);
                    lVar2.mo120386a(runnable);
                    if (f122946b.compareAndSet(this, obj, lVar2)) {
                        return true;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo120307a(C48089c cVar) {
        C7573i.m23587b(cVar, "delayedTask");
        switch (m149093c(cVar)) {
            case 0:
                if (m149092b(cVar)) {
                    m149094j();
                    return;
                }
                return;
            case 1:
                C48060ah.f122908b.mo120307a(cVar);
                return;
            case 2:
                return;
            default:
                throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* renamed from: a */
    public C48081at mo120266a(long j, Runnable runnable) {
        C7573i.m23587b(runnable, "block");
        return C48067a.m149041a(this, j, runnable);
    }

    /* renamed from: a */
    public final void mo120274a(long j, C48187j<? super C7581n> jVar) {
        C7573i.m23587b(jVar, "continuation");
        mo120307a((C48089c) new C48087a(this, j, jVar));
    }

    /* renamed from: a */
    public final void mo83489a(C47924e eVar, Runnable runnable) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(runnable, "block");
        mo120306a(runnable);
    }
}
