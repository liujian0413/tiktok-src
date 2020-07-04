package com.google.common.collect;

import java.util.Arrays;

/* renamed from: com.google.common.collect.cg */
final class C17895cg<K> extends C17893cf<K> {

    /* renamed from: f */
    transient long[] f49169f;

    /* renamed from: g */
    private transient int f49170g;

    /* renamed from: h */
    private transient int f49171h;

    C17895cg() {
        this(3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo46233b() {
        if (this.f49170g == -2) {
            return -1;
        }
        return this.f49170g;
    }

    /* renamed from: c */
    public final void mo46239c() {
        super.mo46239c();
        this.f49170g = -2;
        this.f49171h = -2;
    }

    /* renamed from: k */
    private int m59487k(int i) {
        return (int) this.f49169f[i];
    }

    C17895cg(int i) {
        this(i, 1.0f);
    }

    /* renamed from: j */
    private int m59486j(int i) {
        return (int) (this.f49169f[i] >>> 32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo46234b(int i) {
        int k = m59487k(i);
        if (k == -2) {
            return -1;
        }
        return k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo46243g(int i) {
        super.mo46243g(i);
        int length = this.f49169f.length;
        this.f49169f = Arrays.copyOf(this.f49169f, i);
        Arrays.fill(this.f49169f, length, i, -1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo46245i(int i) {
        int i2 = this.f49160c - 1;
        m59485e(m59486j(i), m59487k(i));
        if (i < i2) {
            m59485e(m59486j(i2), i);
            m59485e(i, m59487k(i2));
        }
        super.mo46245i(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo46228a(int i, int i2) {
        if (i == this.f49160c) {
            return i2;
        }
        return i;
    }

    private C17895cg(int i, float f) {
        super(i, 1.0f);
    }

    /* renamed from: c */
    private void m59483c(int i, int i2) {
        long[] jArr = this.f49169f;
        jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & 4294967295L);
    }

    /* renamed from: d */
    private void m59484d(int i, int i2) {
        long[] jArr = this.f49169f;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    /* renamed from: e */
    private void m59485e(int i, int i2) {
        if (i == -2) {
            this.f49170g = i2;
        } else {
            m59483c(i, i2);
        }
        if (i2 == -2) {
            this.f49171h = i;
        } else {
            m59484d(i2, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo46231a(int i, float f) {
        super.mo46231a(i, f);
        this.f49170g = -2;
        this.f49171h = -2;
        this.f49169f = new long[i];
        Arrays.fill(this.f49169f, -1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo46232a(int i, K k, int i2, int i3) {
        super.mo46232a(i, k, i2, i3);
        m59485e(this.f49171h, i);
        m59485e(i, -2);
    }
}
