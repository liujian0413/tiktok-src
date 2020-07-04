package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.C48020o;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;
import kotlinx.coroutines.C48059ag;
import kotlinx.coroutines.internal.C48178v;
import kotlinx.coroutines.internal.C48179w;

public final class CoroutineScheduler implements Closeable, Executor {

    /* renamed from: d */
    static final AtomicLongFieldUpdater f123060d = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: i */
    public static final int f123061i;

    /* renamed from: j */
    public static final int f123062j;

    /* renamed from: k */
    public static final int f123063k = ((int) TimeUnit.SECONDS.toNanos(1));

    /* renamed from: l */
    public static final int f123064l = ((int) C7551d.m23564b(C7551d.m23562a(C48211k.f123104a / 4, 10), (long) f123063k));

    /* renamed from: m */
    public static final C48178v f123065m = new C48178v("NOT_IN_STACK");

    /* renamed from: n */
    public static final C48199a f123066n = new C48199a(null);

    /* renamed from: o */
    private static final AtomicLongFieldUpdater f123067o = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: p */
    private static final AtomicIntegerFieldUpdater f123068p = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    private volatile int _isTerminated;

    /* renamed from: a */
    public final C48204d f123069a;

    /* renamed from: b */
    public final Semaphore f123070b;

    /* renamed from: c */
    public final C48200b[] f123071c;
    volatile long controlState;

    /* renamed from: e */
    public final Random f123072e;

    /* renamed from: f */
    public final int f123073f;

    /* renamed from: g */
    public final long f123074g;

    /* renamed from: h */
    public final String f123075h;
    private volatile long parkedWorkersStack;

    /* renamed from: q */
    private final int f123076q;

    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    public static final class C48199a {
        private C48199a() {
        }

        public /* synthetic */ C48199a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    public final class C48200b extends Thread {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater f123077c = AtomicIntegerFieldUpdater.newUpdater(C48200b.class, "terminationState");

        /* renamed from: a */
        public final C48213m f123078a;

        /* renamed from: d */
        private long f123080d;

        /* renamed from: e */
        private long f123081e;

        /* renamed from: f */
        private int f123082f;

        /* renamed from: g */
        private int f123083g;

        /* renamed from: h */
        private int f123084h;
        public volatile int indexInArray;
        public volatile Object nextParkedWorker;
        private volatile int spins;
        public volatile WorkerState state;
        private volatile int terminationState;

        /* renamed from: e */
        public final void mo120429e() {
            this.f123082f = CoroutineScheduler.f123064l;
            this.spins = 0;
        }

        /* renamed from: a */
        public final boolean mo120424a() {
            if (this.state == WorkerState.PARKING) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo120426b() {
            if (this.state == WorkerState.BLOCKING) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        private final boolean m149564j() {
            C48208h a = CoroutineScheduler.this.f123069a.mo120436a(TaskMode.PROBABLY_BLOCKING);
            if (a == null) {
                return true;
            }
            this.f123078a.mo120447a(a, CoroutineScheduler.this.f123069a);
            return false;
        }

        /* renamed from: d */
        public final boolean mo120428d() {
            if (this.state == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            if (!CoroutineScheduler.this.f123070b.tryAcquire()) {
                return false;
            }
            this.state = WorkerState.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: f */
        public final C48208h mo120430f() {
            if (mo120428d()) {
                return m149565k();
            }
            C48208h b = this.f123078a.mo120449b();
            if (b == null) {
                b = CoroutineScheduler.this.f123069a.mo120436a(TaskMode.PROBABLY_BLOCKING);
            }
            return b;
        }

        /* renamed from: g */
        private final void m149561g() {
            int i = this.spins;
            if (i <= CoroutineScheduler.f123062j) {
                this.spins = i + 1;
                if (i >= CoroutineScheduler.f123061i) {
                    Thread.yield();
                }
            } else {
                if (this.f123082f < CoroutineScheduler.f123063k) {
                    this.f123082f = C7551d.m23567d((this.f123082f * 3) >>> 1, CoroutineScheduler.f123063k);
                }
                mo120425a(WorkerState.PARKING);
                m149558a((long) this.f123082f);
            }
        }

        /* renamed from: h */
        private final void m149562h() {
            mo120425a(WorkerState.PARKING);
            if (m149564j()) {
                this.terminationState = 0;
                if (this.f123080d == 0) {
                    this.f123080d = System.nanoTime() + CoroutineScheduler.this.f123074g;
                }
                if (m149558a(CoroutineScheduler.this.f123074g) && System.nanoTime() - this.f123080d >= 0) {
                    this.f123080d = 0;
                    m149563i();
                }
            }
        }

        /* renamed from: k */
        private final C48208h m149565k() {
            boolean z;
            if (m149559b(CoroutineScheduler.this.f123073f * 2) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C48208h a = CoroutineScheduler.this.f123069a.mo120436a(TaskMode.NON_BLOCKING);
                if (a != null) {
                    return a;
                }
            }
            C48208h b = this.f123078a.mo120449b();
            if (b != null) {
                return b;
            }
            if (!z) {
                C48208h hVar = (C48208h) CoroutineScheduler.this.f123069a.mo120385c();
                if (hVar != null) {
                    return hVar;
                }
            }
            return m149566l();
        }

        /* renamed from: l */
        private final C48208h m149566l() {
            int a = CoroutineScheduler.this.mo120415a();
            if (a < 2) {
                return null;
            }
            int i = this.f123084h;
            if (i == 0) {
                i = m149559b(a);
            }
            int i2 = i + 1;
            if (i2 > a) {
                i2 = 1;
            }
            this.f123084h = i2;
            C48200b bVar = CoroutineScheduler.this.f123071c[i2];
            if (bVar == null || bVar == this || !this.f123078a.mo120448a(bVar.f123078a, CoroutineScheduler.this.f123069a)) {
                return null;
            }
            return this.f123078a.mo120449b();
        }

        /* renamed from: c */
        public final boolean mo120427c() {
            int i = this.terminationState;
            switch (i) {
                case -1:
                    return false;
                case 0:
                    return f123077c.compareAndSet(this, 0, -1);
                case 1:
                    return false;
                default:
                    StringBuilder sb = new StringBuilder("Invalid terminationState = ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString().toString());
            }
        }

        /* renamed from: i */
        private final void m149563i() {
            synchronized (CoroutineScheduler.this.f123071c) {
                if (!CoroutineScheduler.this.mo120419b()) {
                    if (CoroutineScheduler.this.mo120415a() > CoroutineScheduler.this.f123073f) {
                        if (m149564j()) {
                            if (f123077c.compareAndSet(this, 0, 1)) {
                                int i = this.indexInArray;
                                m149555a(0);
                                CoroutineScheduler.this.mo120418a(this, i, 0);
                                int andDecrement = (int) (CoroutineScheduler.f123060d.getAndDecrement(CoroutineScheduler.this) & 2097151);
                                if (andDecrement != i) {
                                    C48200b bVar = CoroutineScheduler.this.f123071c[andDecrement];
                                    if (bVar == null) {
                                        C7573i.m23580a();
                                    }
                                    CoroutineScheduler.this.f123071c[i] = bVar;
                                    bVar.m149555a(i);
                                    CoroutineScheduler.this.mo120418a(bVar, andDecrement, i);
                                }
                                CoroutineScheduler.this.f123071c[andDecrement] = null;
                                this.state = WorkerState.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        public final void run() {
            boolean z = false;
            while (!CoroutineScheduler.this.mo120419b() && this.state != WorkerState.TERMINATED) {
                C48208h f = mo120430f();
                if (f == null) {
                    if (this.state == WorkerState.CPU_ACQUIRED) {
                        m149561g();
                    } else {
                        m149562h();
                    }
                    z = true;
                } else {
                    TaskMode e = f.mo120442e();
                    if (z) {
                        m149560b(e);
                        z = false;
                    }
                    m149557a(e, f.f123101f);
                    CoroutineScheduler.m149544a(f);
                    m149556a(e);
                }
            }
            mo120425a(WorkerState.TERMINATED);
        }

        /* renamed from: a */
        private final boolean m149558a(long j) {
            CoroutineScheduler.this.mo120417a(this);
            if (!m149564j()) {
                return false;
            }
            LockSupport.parkNanos(j);
            return true;
        }

        private C48200b() {
            setDaemon(true);
            this.f123078a = new C48213m();
            this.state = WorkerState.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = CoroutineScheduler.f123065m;
            this.f123082f = CoroutineScheduler.f123064l;
            this.f123083g = CoroutineScheduler.this.f123072e.nextInt();
        }

        /* renamed from: a */
        private void m149555a(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f123075h);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: b */
        private int m149559b(int i) {
            this.f123083g ^= this.f123083g << 13;
            this.f123083g ^= this.f123083g >> 17;
            this.f123083g ^= this.f123083g << 5;
            int i2 = i - 1;
            if ((i2 & i) == 0) {
                return this.f123083g & i2;
            }
            return (this.f123083g & Integer.MAX_VALUE) % i;
        }

        /* renamed from: a */
        private final void m149556a(TaskMode taskMode) {
            boolean z;
            if (taskMode != TaskMode.NON_BLOCKING) {
                CoroutineScheduler.f123060d.addAndGet(CoroutineScheduler.this, -2097152);
                WorkerState workerState = this.state;
                if (workerState != WorkerState.TERMINATED) {
                    if (workerState == WorkerState.BLOCKING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!C48020o.f122844a || z) {
                        this.state = WorkerState.RETIRING;
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Expected BLOCKING state, but has ");
                    sb.append(workerState);
                    throw new AssertionError(sb.toString());
                }
            }
        }

        /* renamed from: b */
        private final void m149560b(TaskMode taskMode) {
            boolean z;
            this.f123080d = 0;
            this.f123084h = 0;
            if (this.state == WorkerState.PARKING) {
                if (taskMode == TaskMode.PROBABLY_BLOCKING) {
                    z = true;
                } else {
                    z = false;
                }
                if (!C48020o.f122844a || z) {
                    this.state = WorkerState.BLOCKING;
                    this.f123082f = CoroutineScheduler.f123064l;
                } else {
                    throw new AssertionError("Assertion failed");
                }
            }
            this.spins = 0;
        }

        /* renamed from: a */
        public final boolean mo120425a(WorkerState workerState) {
            boolean z;
            C7573i.m23587b(workerState, "newState");
            WorkerState workerState2 = this.state;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CoroutineScheduler.this.f123070b.release();
            }
            if (workerState2 != workerState) {
                this.state = workerState;
            }
            return z;
        }

        public C48200b(CoroutineScheduler coroutineScheduler, int i) {
            this();
            m149555a(i);
        }

        /* renamed from: a */
        private final void m149557a(TaskMode taskMode, long j) {
            if (taskMode != TaskMode.NON_BLOCKING) {
                CoroutineScheduler.f123060d.addAndGet(CoroutineScheduler.this, 2097152);
                if (mo120425a(WorkerState.BLOCKING)) {
                    CoroutineScheduler.this.mo120420c();
                }
            } else if (CoroutineScheduler.this.f123070b.availablePermits() != 0) {
                long a = C48211k.f123110g.mo120441a();
                if (a - j >= C48211k.f123104a && a - this.f123081e >= C48211k.f123104a * 5) {
                    this.f123081e = a;
                    CoroutineScheduler.this.mo120420c();
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo120415a() {
        return (int) (this.controlState & 2097151);
    }

    /* renamed from: b */
    public final boolean mo120419b() {
        if (this._isTerminated != 0) {
            return true;
        }
        return false;
    }

    public final void close() {
        m149542a(10000);
    }

    /* renamed from: e */
    private final boolean m149547e() {
        while (true) {
            C48200b d = m149546d();
            if (d == null) {
                return false;
            }
            d.mo120429e();
            boolean a = d.mo120424a();
            LockSupport.unpark(d);
            if (a && d.mo120427c()) {
                return true;
            }
        }
    }

    /* renamed from: d */
    private final C48200b m149546d() {
        while (true) {
            long j = this.parkedWorkersStack;
            C48200b bVar = this.f123071c[(int) (2097151 & j)];
            if (bVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int b = m149545b(bVar);
            if (b >= 0) {
                if (f123067o.compareAndSet(this, j, ((long) b) | j2)) {
                    bVar.nextParkedWorker = f123065m;
                    return bVar;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo120420c() {
        if (this.f123070b.availablePermits() == 0) {
            m149547e();
        } else if (!m149547e()) {
            long j = this.controlState;
            if (((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)) < this.f123073f) {
                int f = m149548f();
                if (f == 1 && this.f123073f > 1) {
                    m149548f();
                }
                if (f > 0) {
                    return;
                }
            }
            m149547e();
        }
    }

    static {
        int a = C48179w.m149476a("kotlinx.coroutines.scheduler.spins", 1000, 1, 0, 8, (Object) null);
        f123061i = a;
        f123062j = a + C48179w.m149476a("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        return 0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m149548f() {
        /*
            r10 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler$b[] r0 = r10.f123071c
            monitor-enter(r0)
            boolean r1 = r10.mo120419b()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)
            r0 = -1
            return r0
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x0081 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0081 }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x0081 }
            int r1 = r5 - r1
            int r2 = r10.f123073f     // Catch:{ all -> 0x0081 }
            r6 = 0
            if (r1 < r2) goto L_0x0027
            monitor-exit(r0)
            return r6
        L_0x0027:
            int r2 = r10.f123076q     // Catch:{ all -> 0x0081 }
            if (r5 >= r2) goto L_0x007f
            java.util.concurrent.Semaphore r2 = r10.f123070b     // Catch:{ all -> 0x0081 }
            int r2 = r2.availablePermits()     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x0034
            goto L_0x007f
        L_0x0034:
            long r7 = r10.controlState     // Catch:{ all -> 0x0081 }
            long r7 = r7 & r3
            int r2 = (int) r7     // Catch:{ all -> 0x0081 }
            r5 = 1
            int r2 = r2 + r5
            if (r2 <= 0) goto L_0x0044
            kotlinx.coroutines.scheduling.CoroutineScheduler$b[] r7 = r10.f123071c     // Catch:{ all -> 0x0081 }
            r7 = r7[r2]     // Catch:{ all -> 0x0081 }
            if (r7 != 0) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x0071
            kotlinx.coroutines.scheduling.CoroutineScheduler$b r7 = new kotlinx.coroutines.scheduling.CoroutineScheduler$b     // Catch:{ all -> 0x0081 }
            r7.<init>(r10, r2)     // Catch:{ all -> 0x0081 }
            r7.start()     // Catch:{ all -> 0x0081 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f123060d     // Catch:{ all -> 0x0081 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0081 }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x0081 }
            if (r2 != r3) goto L_0x005a
            r6 = 1
        L_0x005a:
            if (r6 == 0) goto L_0x0063
            kotlinx.coroutines.scheduling.CoroutineScheduler$b[] r3 = r10.f123071c     // Catch:{ all -> 0x0081 }
            r3[r2] = r7     // Catch:{ all -> 0x0081 }
            int r1 = r1 + r5
            monitor-exit(r0)
            return r1
        L_0x0063:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x0071:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r0)
            return r6
        L_0x0081:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.m149548f():int");
    }

    public final String toString() {
        C48200b[] bVarArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (C48200b bVar : this.f123071c) {
            if (bVar != null) {
                int c = bVar.f123078a.mo120451c();
                switch (C48201a.f123085a[bVar.state.ordinal()]) {
                    case 1:
                        i3++;
                        break;
                    case 2:
                        i2++;
                        Collection collection = arrayList;
                        StringBuilder sb = new StringBuilder();
                        sb.append(String.valueOf(c));
                        sb.append("b");
                        collection.add(sb.toString());
                        break;
                    case 3:
                        i++;
                        Collection collection2 = arrayList;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(String.valueOf(c));
                        sb2.append("c");
                        collection2.add(sb2.toString());
                        break;
                    case 4:
                        i4++;
                        if (c <= 0) {
                            break;
                        } else {
                            Collection collection3 = arrayList;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(String.valueOf(c));
                            sb3.append("r");
                            collection3.add(sb3.toString());
                            break;
                        }
                    case 5:
                        i5++;
                        break;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f123075h);
        sb4.append('@');
        sb4.append(C48059ag.m149021a((Object) this));
        sb4.append('[');
        sb4.append("Pool Size {core = ");
        sb4.append(this.f123073f);
        sb4.append(", max = ");
        sb4.append(this.f123076q);
        sb4.append("}, Worker States {");
        sb4.append("CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", retired = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global queue size = ");
        sb4.append(this.f123069a.mo120382a());
        sb4.append(", Control State Workers {");
        sb4.append("created = ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking = ");
        sb4.append((int) ((j & 4398044413952L) >> 21));
        sb4.append('}');
        sb4.append("]");
        return sb4.toString();
    }

    public final void execute(Runnable runnable) {
        C7573i.m23587b(runnable, "command");
        mo120416a(runnable, (C48209i) C48207g.f123099a, false);
    }

    /* renamed from: a */
    public static void m149544a(C48208h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            C7573i.m23582a((Object) currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    /* renamed from: b */
    private static int m149545b(C48200b bVar) {
        Object obj = bVar.nextParkedWorker;
        while (obj != f123065m) {
            if (obj == null) {
                return 0;
            }
            C48200b bVar2 = (C48200b) obj;
            int i = bVar2.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = bVar2.nextParkedWorker;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        if (r1 == null) goto L_0x0080;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m149542a(long r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = f123068p
            r8 = 0
            r0 = 1
            boolean r7 = r7.compareAndSet(r6, r8, r0)
            if (r7 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            boolean r1 = r7 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.C48200b
            if (r1 != 0) goto L_0x0014
            r7 = 0
        L_0x0014:
            kotlinx.coroutines.scheduling.CoroutineScheduler$b r7 = (kotlinx.coroutines.scheduling.CoroutineScheduler.C48200b) r7
            kotlinx.coroutines.scheduling.CoroutineScheduler$b[] r1 = r6.f123071c
            monitor-enter(r1)
            long r2 = r6.controlState     // Catch:{ all -> 0x00b8 }
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r4
            int r2 = (int) r2
            monitor-exit(r1)
            if (r2 <= 0) goto L_0x0073
            r1 = 1
        L_0x0024:
            kotlinx.coroutines.scheduling.CoroutineScheduler$b[] r3 = r6.f123071c
            r3 = r3[r1]
            if (r3 != 0) goto L_0x002d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x002d:
            if (r3 == r7) goto L_0x006e
        L_0x002f:
            boolean r4 = r3.isAlive()
            if (r4 == 0) goto L_0x0041
            r4 = r3
            java.lang.Thread r4 = (java.lang.Thread) r4
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4 = 10000(0x2710, double:4.9407E-320)
            r3.join(r4)
            goto L_0x002f
        L_0x0041:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = r3.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r5 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            if (r4 != r5) goto L_0x0049
            r5 = 1
            goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            if (r5 == 0) goto L_0x0054
            kotlinx.coroutines.scheduling.m r3 = r3.f123078a
            kotlinx.coroutines.scheduling.d r4 = r6.f123069a
            r3.mo120446a(r4)
            goto L_0x006e
        L_0x0054:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected TERMINATED state, but found "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x006e:
            if (r1 == r2) goto L_0x0073
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0073:
            kotlinx.coroutines.scheduling.d r1 = r6.f123069a
            r1.mo120384b()
        L_0x0078:
            if (r7 == 0) goto L_0x0080
            kotlinx.coroutines.scheduling.h r1 = r7.mo120430f()
            if (r1 != 0) goto L_0x0088
        L_0x0080:
            kotlinx.coroutines.scheduling.d r1 = r6.f123069a
            java.lang.Object r1 = r1.mo120385c()
            kotlinx.coroutines.scheduling.h r1 = (kotlinx.coroutines.scheduling.C48208h) r1
        L_0x0088:
            if (r1 != 0) goto L_0x00b4
            if (r7 == 0) goto L_0x0091
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r7.mo120425a(r1)
        L_0x0091:
            java.util.concurrent.Semaphore r7 = r6.f123070b
            int r7 = r7.availablePermits()
            int r1 = r6.f123073f
            if (r7 != r1) goto L_0x009c
            r8 = 1
        L_0x009c:
            boolean r7 = kotlin.C48020o.f122844a
            if (r7 == 0) goto L_0x00ad
            if (r8 == 0) goto L_0x00a3
            goto L_0x00ad
        L_0x00a3:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "Assertion failed"
            r7.<init>(r8)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            throw r7
        L_0x00ad:
            r7 = 0
            r6.parkedWorkersStack = r7
            r6.controlState = r7
            return
        L_0x00b4:
            m149544a(r1)
            goto L_0x0078
        L_0x00b8:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.m149542a(long):void");
    }

    /* renamed from: a */
    public final void mo120417a(C48200b bVar) {
        long j;
        long j2;
        int i;
        boolean z;
        if (bVar.nextParkedWorker == f123065m) {
            do {
                j = this.parkedWorkersStack;
                int i2 = (int) (2097151 & j);
                j2 = (2097152 + j) & -2097152;
                i = bVar.indexInArray;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!C48020o.f122844a || z) {
                    bVar.nextParkedWorker = this.f123071c[i2];
                } else {
                    throw new AssertionError("Assertion failed");
                }
            } while (!f123067o.compareAndSet(this, j, ((long) i) | j2));
        }
    }

    /* renamed from: a */
    public static C48208h m149541a(Runnable runnable, C48209i iVar) {
        C7573i.m23587b(runnable, "block");
        C7573i.m23587b(iVar, "taskContext");
        long a = C48211k.f123110g.mo120441a();
        if (!(runnable instanceof C48208h)) {
            return new C48210j(runnable, a, iVar);
        }
        C48208h hVar = (C48208h) runnable;
        hVar.f123101f = a;
        hVar.f123102g = iVar;
        return hVar;
    }

    /* renamed from: a */
    private final int m149540a(C48208h hVar, boolean z) {
        boolean z2;
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C48200b)) {
            currentThread = null;
        }
        C48200b bVar = (C48200b) currentThread;
        if (bVar == null || CoroutineScheduler.this != this || bVar.state == WorkerState.TERMINATED) {
            return 1;
        }
        int i = -1;
        if (hVar.mo120442e() == TaskMode.NON_BLOCKING) {
            if (bVar.mo120426b()) {
                i = 0;
            } else if (!bVar.mo120428d()) {
                return 1;
            }
        }
        if (z) {
            z2 = bVar.f123078a.mo120450b(hVar, this.f123069a);
        } else {
            z2 = bVar.f123078a.mo120447a(hVar, this.f123069a);
        }
        if (!z2 || bVar.f123078a.mo120445a() > C48211k.f123105b) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo120416a(Runnable runnable, C48209i iVar, boolean z) {
        C7573i.m23587b(runnable, "block");
        C7573i.m23587b(iVar, "taskContext");
        C48208h a = m149541a(runnable, iVar);
        int a2 = m149540a(a, z);
        if (a2 == -1) {
            return;
        }
        if (a2 != 1) {
            mo120420c();
        } else if (this.f123069a.mo120383a(a)) {
            mo120420c();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f123075h);
            sb.append(" was terminated");
            throw new RejectedExecutionException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo120418a(C48200b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = m149545b(bVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f123067o.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C7573i.m23587b(str, "schedulerName");
        this.f123073f = i;
        this.f123076q = i2;
        this.f123074g = j;
        this.f123075h = str;
        if (this.f123073f > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f123076q >= this.f123073f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f123076q <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.f123074g > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        this.f123069a = new C48204d();
                        this.f123070b = new Semaphore(this.f123073f, false);
                        this.parkedWorkersStack = 0;
                        this.f123071c = new C48200b[(this.f123076q + 1)];
                        this.controlState = 0;
                        this.f123072e = new Random();
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Idle worker keep alive time ");
                    sb.append(this.f123074g);
                    sb.append(" must be positive");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder("Max pool size ");
                sb2.append(this.f123076q);
                sb2.append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            StringBuilder sb3 = new StringBuilder("Max pool size ");
            sb3.append(this.f123076q);
            sb3.append(" should be greater than or equals to core pool size ");
            sb3.append(this.f123073f);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        StringBuilder sb4 = new StringBuilder("Core pool size ");
        sb4.append(this.f123073f);
        sb4.append(" should be at least 1");
        throw new IllegalArgumentException(sb4.toString().toString());
    }
}
