package com.google.common.collect;

import java.util.Arrays;

/* renamed from: com.google.common.collect.z */
final class C18068z<K, V> extends C18057x<K, V> {

    /* renamed from: g */
    transient long[] f49394g;

    /* renamed from: h */
    private transient int f49395h;

    /* renamed from: i */
    private transient int f49396i;

    /* renamed from: j */
    private final boolean f49397j;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo46610b() {
        return this.f49395h;
    }

    C18068z() {
        this(3);
    }

    /* renamed from: f */
    public static <K, V> C18068z<K, V> m59770f() {
        return new C18068z<>();
    }

    public final void clear() {
        super.clear();
        this.f49395h = -2;
        this.f49396i = -2;
    }

    /* renamed from: g */
    public static <K, V> C18068z<K, V> m59771g(int i) {
        return new C18068z<>(i);
    }

    private C18068z(int i) {
        this(i, 1.0f, false);
    }

    /* renamed from: h */
    private int m59772h(int i) {
        return (int) (this.f49394g[i] >>> 32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo46613c(int i) {
        super.mo46613c(i);
        this.f49394g = Arrays.copyOf(this.f49394g, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo46622f(int i) {
        return (int) this.f49394g[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo46611b(int i) {
        if (this.f49397j) {
            m59769d(m59772h(i), mo46622f(i));
            m59769d(this.f49396i, i);
            m59769d(i, -2);
            this.f49363e++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo46620e(int i) {
        int size = size() - 1;
        m59769d(m59772h(i), mo46622f(i));
        if (i < size) {
            m59769d(m59772h(size), i);
            m59769d(i, mo46622f(size));
        }
        super.mo46620e(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo46606a(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    /* renamed from: b */
    private void m59767b(int i, int i2) {
        long[] jArr = this.f49394g;
        jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & 4294967295L);
    }

    /* renamed from: c */
    private void m59768c(int i, int i2) {
        long[] jArr = this.f49394g;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    /* renamed from: d */
    private void m59769d(int i, int i2) {
        if (i == -2) {
            this.f49395h = i2;
        } else {
            m59767b(i, i2);
        }
        if (i2 == -2) {
            this.f49396i = i;
        } else {
            m59768c(i2, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo46608a(int i, float f) {
        super.mo46608a(i, f);
        this.f49395h = -2;
        this.f49396i = -2;
        this.f49394g = new long[i];
        Arrays.fill(this.f49394g, -1);
    }

    private C18068z(int i, float f, boolean z) {
        super(i, 1.0f);
        this.f49397j = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo46609a(int i, K k, V v, int i2) {
        super.mo46609a(i, k, v, i2);
        m59769d(this.f49396i, i);
        m59769d(i, -2);
    }
}
