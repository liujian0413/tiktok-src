package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.gi */
public abstract class C16554gi {

    /* renamed from: a */
    int f46346a;

    /* renamed from: b */
    int f46347b;

    /* renamed from: c */
    C16557gl f46348c = this;

    /* renamed from: d */
    private int f46349d;

    /* renamed from: a */
    public static C16554gi m53915a(byte[] bArr, int i, int i2) {
        return m53916a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public abstract int mo42773a() throws IOException;

    /* renamed from: a */
    public abstract <T extends C16615ij> T mo42774a(C16626iu<T> iuVar, C16565gt gtVar) throws IOException;

    /* renamed from: a */
    public abstract void mo42775a(int i) throws zzuv;

    /* renamed from: b */
    public abstract double mo42776b() throws IOException;

    /* renamed from: b */
    public abstract boolean mo42777b(int i) throws IOException;

    /* renamed from: c */
    public abstract float mo42778c() throws IOException;

    /* renamed from: d */
    public abstract int mo42780d(int i) throws zzuv;

    /* renamed from: d */
    public abstract long mo42781d() throws IOException;

    /* renamed from: e */
    public abstract long mo42782e() throws IOException;

    /* renamed from: e */
    public abstract void mo42783e(int i);

    /* renamed from: f */
    public abstract int mo42784f() throws IOException;

    /* renamed from: f */
    public abstract void mo42785f(int i) throws IOException;

    /* renamed from: g */
    public abstract long mo42786g() throws IOException;

    /* renamed from: h */
    public abstract int mo42787h() throws IOException;

    /* renamed from: i */
    public abstract boolean mo42788i() throws IOException;

    /* renamed from: j */
    public abstract String mo42789j() throws IOException;

    /* renamed from: k */
    public abstract String mo42790k() throws IOException;

    /* renamed from: l */
    public abstract zzte mo42791l() throws IOException;

    /* renamed from: m */
    public abstract int mo42792m() throws IOException;

    /* renamed from: n */
    public abstract int mo42793n() throws IOException;

    /* renamed from: o */
    public abstract int mo42794o() throws IOException;

    /* renamed from: p */
    public abstract long mo42795p() throws IOException;

    /* renamed from: q */
    public abstract int mo42796q() throws IOException;

    /* renamed from: r */
    public abstract long mo42797r() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public abstract long mo42798s() throws IOException;

    /* renamed from: t */
    public abstract boolean mo42799t() throws IOException;

    /* renamed from: u */
    public abstract int mo42800u();

    /* renamed from: a */
    static C16554gi m53916a(byte[] bArr, int i, int i2, boolean z) {
        C16556gk gkVar = new C16556gk(bArr, i, i2);
        try {
            gkVar.mo42780d(i2);
            return gkVar;
        } catch (zzuv e) {
            throw new IllegalArgumentException(e);
        }
    }

    private C16554gi() {
        this.f46347b = 100;
        this.f46349d = Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public final int mo42779c(int i) {
        if (i >= 0) {
            int i2 = this.f46347b;
            this.f46347b = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Recursion limit cannot be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
