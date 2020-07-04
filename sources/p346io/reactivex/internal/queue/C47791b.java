package p346io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p346io.reactivex.internal.p353b.C47603h;
import p346io.reactivex.internal.util.C47841i;

/* renamed from: io.reactivex.internal.queue.b */
public final class C47791b<T> implements C47603h<T> {

    /* renamed from: a */
    static final int f122509a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    private static final Object f122510j = new Object();

    /* renamed from: b */
    final AtomicLong f122511b = new AtomicLong();

    /* renamed from: c */
    int f122512c;

    /* renamed from: d */
    long f122513d;

    /* renamed from: e */
    final int f122514e;

    /* renamed from: f */
    AtomicReferenceArray<Object> f122515f;

    /* renamed from: g */
    final int f122516g;

    /* renamed from: h */
    AtomicReferenceArray<Object> f122517h;

    /* renamed from: i */
    final AtomicLong f122518i = new AtomicLong();

    /* renamed from: b */
    private static int m148636b(int i) {
        return i;
    }

    /* renamed from: b */
    private long m148637b() {
        return this.f122518i.get();
    }

    /* renamed from: c */
    private long m148640c() {
        return this.f122511b.get();
    }

    /* renamed from: d */
    private long m148641d() {
        return this.f122518i.get();
    }

    /* renamed from: a */
    private long m148627a() {
        return this.f122511b.get();
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        if (m148627a() == m148637b()) {
            return true;
        }
        return false;
    }

    public final T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f122517h;
        long d = m148641d();
        int i = this.f122516g;
        int a = m148626a(d, i);
        T b = m148638b(atomicReferenceArray, a);
        if (b == f122510j) {
            z = true;
        } else {
            z = false;
        }
        if (b != null && !z) {
            m148632a(atomicReferenceArray, a, (Object) null);
            m148639b(d + 1);
            return b;
        } else if (z) {
            return m148628a(m148629a(atomicReferenceArray, i + 1), d, i);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private void m148639b(long j) {
        this.f122518i.lazySet(j);
    }

    public C47791b(int i) {
        int a = C47841i.m148736a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f122515f = atomicReferenceArray;
        this.f122514e = i2;
        m148630a(a);
        this.f122517h = atomicReferenceArray;
        this.f122516g = i2;
        this.f122513d = (long) (i2 - 1);
        m148631a(0);
    }

    /* renamed from: a */
    private void m148630a(int i) {
        this.f122512c = Math.min(i / 4, f122509a);
    }

    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f122515f;
            long c = m148640c();
            int i = this.f122514e;
            int a = m148626a(c, i);
            if (c < this.f122513d) {
                return m148635a(atomicReferenceArray, t, c, a);
            }
            long j = ((long) this.f122512c) + c;
            if (m148638b(atomicReferenceArray, m148626a(j, i)) == null) {
                this.f122513d = j - 1;
                return m148635a(atomicReferenceArray, t, c, a);
            } else if (m148638b(atomicReferenceArray, m148626a(1 + c, i)) == null) {
                return m148635a(atomicReferenceArray, t, c, a);
            } else {
                m148633a(atomicReferenceArray, c, a, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    /* renamed from: a */
    private void m148631a(long j) {
        this.f122511b.lazySet(j);
    }

    /* renamed from: a */
    private static int m148626a(long j, int i) {
        return m148636b(((int) j) & i);
    }

    /* renamed from: b */
    private static <E> Object m148638b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    private static AtomicReferenceArray<Object> m148629a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int b = m148636b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m148638b(atomicReferenceArray, b);
        m148632a(atomicReferenceArray, b, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: a */
    private static void m148634a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m148632a(atomicReferenceArray, m148636b(atomicReferenceArray.length() - 1), (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private static void m148632a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private T m148628a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f122517h = atomicReferenceArray;
        int a = m148626a(j, i);
        T b = m148638b(atomicReferenceArray, a);
        if (b != null) {
            m148632a(atomicReferenceArray, a, (Object) null);
            m148639b(j + 1);
        }
        return b;
    }

    /* renamed from: a */
    private boolean m148635a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m148632a(atomicReferenceArray, i, (Object) t);
        m148631a(j + 1);
        return true;
    }

    /* renamed from: a */
    private void m148633a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f122515f = atomicReferenceArray2;
        this.f122513d = (j2 + j) - 1;
        m148632a(atomicReferenceArray2, i, (Object) t);
        m148634a(atomicReferenceArray, atomicReferenceArray2);
        m148632a(atomicReferenceArray, i, f122510j);
        m148631a(j + 1);
    }
}
