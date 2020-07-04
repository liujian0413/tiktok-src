package com.google.api.client.repackaged.org.apache.commons.codec.p781a;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;

/* renamed from: com.google.api.client.repackaged.org.apache.commons.codec.a.b */
public abstract class C17332b {

    /* renamed from: a */
    private final int f48225a = 3;

    /* renamed from: b */
    protected final byte f48226b = 61;

    /* renamed from: c */
    protected final int f48227c;

    /* renamed from: d */
    protected byte[] f48228d;

    /* renamed from: e */
    protected int f48229e;

    /* renamed from: f */
    protected boolean f48230f;

    /* renamed from: g */
    protected int f48231g;

    /* renamed from: h */
    protected int f48232h;

    /* renamed from: i */
    private final int f48233i = 4;

    /* renamed from: j */
    private final int f48234j;

    /* renamed from: k */
    private int f48235k;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo44760a(byte[] bArr, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo44761a(byte b);

    /* renamed from: a */
    private int m57718a() {
        if (this.f48228d != null) {
            return this.f48229e - this.f48235k;
        }
        return 0;
    }

    /* renamed from: c */
    private void m57721c() {
        this.f48228d = null;
        this.f48229e = 0;
        this.f48235k = 0;
        this.f48231g = 0;
        this.f48232h = 0;
        this.f48230f = false;
    }

    /* renamed from: b */
    private void m57720b() {
        if (this.f48228d == null) {
            this.f48228d = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            this.f48229e = 0;
            this.f48235k = 0;
            return;
        }
        byte[] bArr = new byte[(this.f48228d.length * 2)];
        System.arraycopy(this.f48228d, 0, bArr, 0, this.f48228d.length);
        this.f48228d = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44762a(int i) {
        if (this.f48228d == null || this.f48228d.length < this.f48229e + i) {
            m57720b();
        }
    }

    /* renamed from: b */
    public final byte[] mo44763b(byte[] bArr) {
        m57721c();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        mo44760a(bArr, 0, bArr.length);
        mo44760a(bArr, 0, -1);
        byte[] bArr2 = new byte[(this.f48229e - this.f48235k)];
        m57719b(bArr2, 0, bArr2.length);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo44764c(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || mo44761a(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long mo44765d(byte[] bArr) {
        long length = ((long) (((bArr.length + this.f48225a) - 1) / this.f48225a)) * ((long) this.f48233i);
        if (this.f48227c > 0) {
            return length + ((((((long) this.f48227c) + length) - 1) / ((long) this.f48227c)) * ((long) this.f48234j));
        }
        return length;
    }

    /* renamed from: b */
    private int m57719b(byte[] bArr, int i, int i2) {
        if (this.f48228d != null) {
            int min = Math.min(m57718a(), i2);
            System.arraycopy(this.f48228d, this.f48235k, bArr, 0, min);
            this.f48235k += min;
            if (this.f48235k >= this.f48229e) {
                this.f48228d = null;
            }
            return min;
        } else if (this.f48230f) {
            return -1;
        } else {
            return 0;
        }
    }

    protected C17332b(int i, int i2, int i3, int i4) {
        int i5;
        if (i3 <= 0 || i4 <= 0) {
            i5 = 0;
        } else {
            i5 = (i3 / 4) * 4;
        }
        this.f48227c = i5;
        this.f48234j = i4;
    }
}
