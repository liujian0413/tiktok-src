package com.google.common.collect;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import java.util.Arrays;

/* renamed from: com.google.common.collect.cf */
class C17893cf<K> {

    /* renamed from: a */
    transient Object[] f49158a;

    /* renamed from: b */
    transient int[] f49159b;

    /* renamed from: c */
    public transient int f49160c;

    /* renamed from: d */
    transient int f49161d;

    /* renamed from: e */
    transient long[] f49162e;

    /* renamed from: f */
    private transient int[] f49163f;

    /* renamed from: g */
    private transient float f49164g;

    /* renamed from: h */
    private transient int f49165h;

    /* renamed from: com.google.common.collect.cf$a */
    class C17894a extends C17886a<K> {

        /* renamed from: a */
        final K f49166a;

        /* renamed from: b */
        int f49167b;

        /* renamed from: b */
        public final K mo45308b() {
            return this.f49166a;
        }

        /* renamed from: a */
        public final int mo45307a() {
            m59480c();
            if (this.f49167b == -1) {
                return 0;
            }
            return C17893cf.this.f49159b[this.f49167b];
        }

        /* renamed from: c */
        private void m59480c() {
            if (this.f49167b == -1 || this.f49167b >= C17893cf.this.f49160c || !C17434j.m57955a(this.f49166a, C17893cf.this.f49158a[this.f49167b])) {
                this.f49167b = C17893cf.this.mo46229a((Object) this.f49166a);
            }
        }

        C17894a(int i) {
            this.f49166a = C17893cf.this.f49158a[i];
            this.f49167b = i;
        }
    }

    /* renamed from: a */
    private static int m59451a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    private static long m59452a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: b */
    private static int m59455b(long j) {
        return (int) j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo46228a(int i, int i2) {
        return i - 1;
    }

    /* renamed from: d */
    private int m59457d() {
        return this.f49163f.length - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo46233b() {
        if (this.f49160c == 0) {
            return -1;
        }
        return 0;
    }

    C17893cf() {
        mo46231a(3, 1.0f);
    }

    /* renamed from: a */
    public static <K> C17893cf<K> m59453a() {
        return new C17893cf<>();
    }

    /* renamed from: c */
    public void mo46239c() {
        this.f49161d++;
        Arrays.fill(this.f49158a, 0, this.f49160c, null);
        Arrays.fill(this.f49159b, 0, this.f49160c, 0);
        Arrays.fill(this.f49163f, -1);
        Arrays.fill(this.f49162e, -1);
        this.f49160c = 0;
    }

    C17893cf(int i) {
        this(i, 1.0f);
    }

    /* renamed from: j */
    private static int[] m59458j(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: k */
    private static long[] m59459k(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo46234b(int i) {
        int i2 = i + 1;
        if (i2 < this.f49160c) {
            return i2;
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo46237c(Object obj) {
        return m59456b(obj, C17761bg.m59065a(obj));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo46240d(int i) {
        C17439m.m57960a(i, this.f49160c);
        return this.f49159b[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C17883a<K> mo46241e(int i) {
        C17439m.m57960a(i, this.f49160c);
        return new C17894a(i);
    }

    /* renamed from: l */
    private void m59460l(int i) {
        int length = this.f49162e.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo46243g(max);
            }
        }
    }

    /* renamed from: b */
    public final int mo46235b(Object obj) {
        int a = mo46229a(obj);
        if (a == -1) {
            return 0;
        }
        return this.f49159b[a];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final K mo46238c(int i) {
        C17439m.m57960a(i, this.f49160c);
        return this.f49158a[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo46242f(int i) {
        if (i > this.f49162e.length) {
            mo46243g(i);
        }
        if (i >= this.f49165h) {
            m59461m(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final int mo46244h(int i) {
        return m59456b(this.f49158a[i], m59451a(this.f49162e[i]));
    }

    C17893cf(C17893cf<? extends K> cfVar) {
        mo46231a(cfVar.f49160c, 1.0f);
        int b = cfVar.mo46233b();
        while (b != -1) {
            mo46230a((K) cfVar.mo46238c(b), cfVar.mo46240d(b));
            b = cfVar.mo46234b(b);
        }
    }

    /* renamed from: a */
    public static <K> C17893cf<K> m59454a(int i) {
        return new C17893cf<>(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo46243g(int i) {
        this.f49158a = Arrays.copyOf(this.f49158a, i);
        this.f49159b = Arrays.copyOf(this.f49159b, i);
        long[] jArr = this.f49162e;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f49162e = copyOf;
    }

    /* renamed from: m */
    private void m59461m(int i) {
        if (this.f49163f.length >= 1073741824) {
            this.f49165h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f49164g)) + 1;
        int[] j = m59458j(i);
        long[] jArr = this.f49162e;
        int length = j.length - 1;
        for (int i3 = 0; i3 < this.f49160c; i3++) {
            int a = m59451a(jArr[i3]);
            int i4 = a & length;
            int i5 = j[i4];
            j[i4] = i3;
            jArr[i3] = (((long) a) << 32) | (4294967295L & ((long) i5));
        }
        this.f49165h = i2;
        this.f49163f = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo46229a(Object obj) {
        int a = C17761bg.m59065a(obj);
        int i = this.f49163f[m59457d() & a];
        while (i != -1) {
            long j = this.f49162e[i];
            if (m59451a(j) == a && C17434j.m57955a(obj, this.f49158a[i])) {
                return i;
            }
            i = m59455b(j);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo46245i(int i) {
        int i2 = this.f49160c - 1;
        if (i < i2) {
            Object[] objArr = this.f49158a;
            objArr[i] = objArr[i2];
            int[] iArr = this.f49159b;
            iArr[i] = iArr[i2];
            this.f49158a[i2] = null;
            this.f49159b[i2] = 0;
            long j = this.f49162e[i2];
            this.f49162e[i] = j;
            this.f49162e[i2] = -1;
            int a = m59451a(j) & m59457d();
            int i3 = this.f49163f[a];
            if (i3 == i2) {
                this.f49163f[a] = i;
            } else {
                while (true) {
                    long j2 = this.f49162e[i3];
                    int b = m59455b(j2);
                    if (b == i2) {
                        this.f49162e[i3] = m59452a(j2, i);
                        return;
                    }
                    i3 = b;
                }
            }
        } else {
            this.f49158a[i] = null;
            this.f49159b[i] = 0;
            this.f49162e[i] = -1;
        }
    }

    C17893cf(int i, float f) {
        mo46231a(i, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo46236b(int i, int i2) {
        C17439m.m57960a(i, this.f49160c);
        this.f49159b[i] = i2;
    }

    /* renamed from: b */
    private int m59456b(Object obj, int i) {
        int d = m59457d() & i;
        int i2 = this.f49163f[d];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m59451a(this.f49162e[i2]) != i || !C17434j.m57955a(obj, this.f49158a[i2])) {
                int b = m59455b(this.f49162e[i2]);
                if (b == -1) {
                    return 0;
                }
                int i4 = b;
                i3 = i2;
                i2 = i4;
            } else {
                int i5 = this.f49159b[i2];
                if (i3 == -1) {
                    this.f49163f[d] = m59455b(this.f49162e[i2]);
                } else {
                    long[] jArr = this.f49162e;
                    jArr[i3] = m59452a(jArr[i3], m59455b(this.f49162e[i2]));
                }
                mo46245i(i2);
                this.f49160c--;
                this.f49161d++;
                return i5;
            }
        }
    }

    /* renamed from: a */
    public final int mo46230a(K k, int i) {
        C18053v.m59704b(i, "count");
        long[] jArr = this.f49162e;
        Object[] objArr = this.f49158a;
        int[] iArr = this.f49159b;
        int a = C17761bg.m59065a((Object) k);
        int d = m59457d() & a;
        int i2 = this.f49160c;
        int i3 = this.f49163f[d];
        if (i3 == -1) {
            this.f49163f[d] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m59451a(j) != a || !C17434j.m57955a(k, objArr[i3])) {
                    int b = m59455b(j);
                    if (b == -1) {
                        jArr[i3] = m59452a(j, i2);
                        break;
                    }
                    i3 = b;
                } else {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            m59460l(i5);
            mo46232a(i2, k, i, a);
            this.f49160c = i5;
            if (i2 >= this.f49165h) {
                m59461m(this.f49163f.length * 2);
            }
            this.f49161d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46231a(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57969a(z, (Object) "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z2 = true;
        }
        C17439m.m57969a(z2, (Object) "Illegal load factor");
        int a = C17761bg.m59064a(i, (double) f);
        this.f49163f = m59458j(a);
        this.f49164g = f;
        this.f49158a = new Object[i];
        this.f49159b = new int[i];
        this.f49162e = m59459k(i);
        this.f49165h = Math.max(1, (int) (((float) a) * f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46232a(int i, K k, int i2, int i3) {
        this.f49162e[i] = (((long) i3) << 32) | 4294967295L;
        this.f49158a[i] = k;
        this.f49159b[i] = i2;
    }
}
