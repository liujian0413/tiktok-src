package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.internal.l */
public final class C48166l<E> {

    /* renamed from: b */
    public static final /* synthetic */ AtomicLongFieldUpdater f123020b = AtomicLongFieldUpdater.newUpdater(C48166l.class, "_state$internal");

    /* renamed from: e */
    public static final C48178v f123021e = new C48178v("REMOVE_FROZEN");

    /* renamed from: f */
    public static final C48167a f123022f = new C48167a(null);

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater f123023g = AtomicReferenceFieldUpdater.newUpdater(C48166l.class, Object.class, "_next");
    private volatile Object _next;
    public volatile /* synthetic */ long _state$internal;

    /* renamed from: a */
    public final int f123024a = (this.f123027h - 1);

    /* renamed from: c */
    public final AtomicReferenceArray<Object> f123025c = new AtomicReferenceArray<>(this.f123027h);

    /* renamed from: d */
    public final boolean f123026d;

    /* renamed from: h */
    private final int f123027h;

    /* renamed from: kotlinx.coroutines.internal.l$a */
    public static final class C48167a {
        private C48167a() {
        }

        /* renamed from: a */
        public static int m149444a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: a */
        public static long m149445a(long j, long j2) {
            return j & (j2 ^ -1);
        }

        public /* synthetic */ C48167a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        public final long mo120394b(long j, int i) {
            return m149445a(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: a */
        public final long mo120393a(long j, int i) {
            return m149445a(j, 1073741823) | (((long) i) << 0);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.l$b */
    public static final class C48168b {

        /* renamed from: a */
        public final int f123028a;

        public C48168b(int i) {
            this.f123028a = i;
        }
    }

    /* renamed from: e */
    public final C48166l<E> mo120392e() {
        return m149434a(m149436f());
    }

    /* renamed from: f */
    private final long m149436f() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f123020b.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: b */
    public final int mo120389b() {
        long j = this._state$internal;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: c */
    public final boolean mo120390c() {
        long j;
        do {
            j = this._state$internal;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f123020b.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: d */
    public final Object mo120391d() {
        while (true) {
            long j = this._state$internal;
            if ((1152921504606846976L & j) != 0) {
                return f123021e;
            }
            int i = (int) ((1073741823 & j) >> 0);
            if ((((int) ((1152921503533105152L & j) >> 30)) & this.f123024a) == (this.f123024a & i)) {
                return null;
            }
            Object obj = this.f123025c.get(this.f123024a & i);
            if (obj == null) {
                if (this.f123026d) {
                    return null;
                }
            } else if (obj instanceof C48168b) {
                return null;
            } else {
                int i2 = (i + 1) & 1073741823;
                if (f123020b.compareAndSet(this, j, f123022f.mo120393a(j, i2))) {
                    this.f123025c.set(this.f123024a & i, null);
                    return obj;
                } else if (this.f123026d) {
                    C48166l lVar = this;
                    do {
                        lVar = lVar.mo120387a(i, i2);
                    } while (lVar != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo120388a() {
        long j = this._state$internal;
        if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final C48166l<E> m149434a(long j) {
        while (true) {
            C48166l<E> lVar = (C48166l) this._next;
            if (lVar != null) {
                return lVar;
            }
            f123023g.compareAndSet(this, null, m149435b(j));
        }
    }

    /* renamed from: b */
    private final C48166l<E> m149435b(long j) {
        C48166l<E> lVar = new C48166l<>(this.f123027h * 2, this.f123026d);
        int i = (int) ((1152921503533105152L & j) >> 30);
        for (int i2 = (int) ((1073741823 & j) >> 0); (this.f123024a & i2) != (this.f123024a & i); i2++) {
            AtomicReferenceArray<Object> atomicReferenceArray = lVar.f123025c;
            int i3 = lVar.f123024a & i2;
            Object obj = this.f123025c.get(this.f123024a & i2);
            if (obj == null) {
                obj = new C48168b(i2);
            }
            atomicReferenceArray.set(i3, obj);
        }
        lVar._state$internal = C48167a.m149445a(j, 1152921504606846976L);
        return lVar;
    }

    /* renamed from: a */
    public final int mo120386a(E e) {
        C7573i.m23587b(e, "element");
        while (true) {
            long j = this._state$internal;
            if ((3458764513820540928L & j) != 0) {
                return C48167a.m149444a(j);
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f123024a;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f123026d || this.f123025c.get(i2 & i3) == null) {
                int i4 = (i2 + 1) & 1073741823;
                if (f123020b.compareAndSet(this, j, f123022f.mo120394b(j, i4))) {
                    this.f123025c.set(i2 & i3, e);
                    C48166l lVar = this;
                    while ((lVar._state$internal & 1152921504606846976L) != 0) {
                        lVar = lVar.mo120392e().m149433a(i2, e);
                        if (lVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else if (this.f123027h < 1024 || ((i2 - i) & 1073741823) > (this.f123027h >> 1)) {
                return 1;
            }
        }
        return 1;
    }

    /* renamed from: a */
    private final C48166l<E> m149433a(int i, E e) {
        Object obj = this.f123025c.get(this.f123024a & i);
        if (!(obj instanceof C48168b) || ((C48168b) obj).f123028a != i) {
            return null;
        }
        this.f123025c.set(i & this.f123024a, e);
        return this;
    }

    public C48166l(int i, boolean z) {
        boolean z2;
        this.f123027h = i;
        this.f123026d = z;
        boolean z3 = true;
        if (this.f123024a <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((this.f123027h & this.f123024a) != 0) {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final C48166l<E> mo120387a(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state$internal;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (i3 == i) {
                z = true;
            }
            if (!z) {
                throw new IllegalStateException("This queue can have only one consumer".toString());
            } else if ((1152921504606846976L & j) != 0) {
                return mo120392e();
            }
        } while (!f123020b.compareAndSet(this, j, f123022f.mo120393a(j, i2)));
        this.f123025c.set(this.f123024a & i3, null);
        return null;
    }
}
