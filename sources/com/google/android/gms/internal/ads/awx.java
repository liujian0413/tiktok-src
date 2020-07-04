package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class awx {

    /* renamed from: a */
    int f41143a;

    /* renamed from: b */
    int f41144b;

    /* renamed from: c */
    axa f41145c = this;

    /* renamed from: d */
    private int f41146d;

    /* renamed from: a */
    public static long m47453a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    static awx m47454a(byte[] bArr, int i, int i2, boolean z) {
        awz awz = new awz(bArr, i, i2, z);
        try {
            awz.mo40136c(i2);
            return awz;
        } catch (zzcdx e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m47455e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo40131a() throws IOException;

    /* renamed from: a */
    public abstract void mo40132a(int i) throws zzcdx;

    /* renamed from: b */
    public abstract double mo40133b() throws IOException;

    /* renamed from: b */
    public abstract boolean mo40134b(int i) throws IOException;

    /* renamed from: c */
    public abstract float mo40135c() throws IOException;

    /* renamed from: c */
    public abstract int mo40136c(int i) throws zzcdx;

    /* renamed from: d */
    public abstract long mo40137d() throws IOException;

    /* renamed from: d */
    public abstract void mo40138d(int i);

    /* renamed from: e */
    public abstract long mo40139e() throws IOException;

    /* renamed from: f */
    public abstract int mo40140f() throws IOException;

    /* renamed from: g */
    public abstract long mo40141g() throws IOException;

    /* renamed from: h */
    public abstract int mo40142h() throws IOException;

    /* renamed from: i */
    public abstract boolean mo40143i() throws IOException;

    /* renamed from: j */
    public abstract String mo40144j() throws IOException;

    /* renamed from: k */
    public abstract String mo40145k() throws IOException;

    /* renamed from: l */
    public abstract zzcce mo40146l() throws IOException;

    /* renamed from: m */
    public abstract int mo40147m() throws IOException;

    /* renamed from: n */
    public abstract int mo40148n() throws IOException;

    /* renamed from: o */
    public abstract int mo40149o() throws IOException;

    /* renamed from: p */
    public abstract long mo40150p() throws IOException;

    /* renamed from: q */
    public abstract int mo40151q() throws IOException;

    /* renamed from: r */
    public abstract long mo40152r() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public abstract long mo40153s() throws IOException;

    /* renamed from: t */
    public abstract boolean mo40154t() throws IOException;

    /* renamed from: u */
    public abstract int mo40155u();

    private awx() {
        this.f41144b = 100;
        this.f41146d = Integer.MAX_VALUE;
    }
}
