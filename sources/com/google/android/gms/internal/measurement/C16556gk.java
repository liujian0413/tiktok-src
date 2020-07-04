package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.gk */
final class C16556gk extends C16554gi {

    /* renamed from: d */
    private final byte[] f46350d;

    /* renamed from: e */
    private final boolean f46351e;

    /* renamed from: f */
    private int f46352f;

    /* renamed from: g */
    private int f46353g;

    /* renamed from: h */
    private int f46354h;

    /* renamed from: i */
    private int f46355i;

    /* renamed from: j */
    private int f46356j;

    /* renamed from: k */
    private int f46357k;

    private C16556gk(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f46357k = Integer.MAX_VALUE;
        this.f46350d = bArr;
        this.f46352f = i2 + i;
        this.f46354h = i;
        this.f46355i = this.f46354h;
        this.f46351e = z;
    }

    /* renamed from: a */
    public final int mo42773a() throws IOException {
        if (mo42799t()) {
            this.f46356j = 0;
            return 0;
        }
        this.f46356j = m53946v();
        if ((this.f46356j >>> 3) != 0) {
            return this.f46356j;
        }
        throw new zzuv("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo42775a(int i) throws zzuv {
        if (this.f46356j != i) {
            throw zzuv.zzwt();
        }
    }

    /* renamed from: b */
    public final boolean mo42777b(int i) throws IOException {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f46352f - this.f46354h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f46350d;
                        int i3 = this.f46354h;
                        this.f46354h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw zzuv.zzws();
                }
                while (i2 < 10) {
                    if (m53945A() < 0) {
                        i2++;
                    }
                }
                throw zzuv.zzws();
                return true;
            case 1:
                mo42785f(8);
                return true;
            case 2:
                mo42785f(m53946v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo42785f(4);
                return true;
            default:
                throw zzuv.zzwu();
        }
        do {
            a = mo42773a();
            if (a != 0) {
            }
            mo42775a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo42777b(a));
        mo42775a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final double mo42776b() throws IOException {
        return Double.longBitsToDouble(m53949y());
    }

    /* renamed from: c */
    public final float mo42778c() throws IOException {
        return Float.intBitsToFloat(m53948x());
    }

    /* renamed from: d */
    public final long mo42781d() throws IOException {
        return m53947w();
    }

    /* renamed from: e */
    public final long mo42782e() throws IOException {
        return m53947w();
    }

    /* renamed from: f */
    public final int mo42784f() throws IOException {
        return m53946v();
    }

    /* renamed from: g */
    public final long mo42786g() throws IOException {
        return m53949y();
    }

    /* renamed from: h */
    public final int mo42787h() throws IOException {
        return m53948x();
    }

    /* renamed from: i */
    public final boolean mo42788i() throws IOException {
        return m53947w() != 0;
    }

    /* renamed from: j */
    public final String mo42789j() throws IOException {
        int v = m53946v();
        if (v > 0 && v <= this.f46352f - this.f46354h) {
            String str = new String(this.f46350d, this.f46354h, v, C16586hh.f46424a);
            this.f46354h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw zzuv.zzwr();
            }
            throw zzuv.zzwq();
        }
    }

    /* renamed from: k */
    public final String mo42790k() throws IOException {
        int v = m53946v();
        if (v > 0 && v <= this.f46352f - this.f46354h) {
            String b = C16664ka.m54651b(this.f46350d, this.f46354h, v);
            this.f46354h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw zzuv.zzwr();
            }
            throw zzuv.zzwq();
        }
    }

    /* renamed from: a */
    public final <T extends C16615ij> T mo42774a(C16626iu<T> iuVar, C16565gt gtVar) throws IOException {
        int v = m53946v();
        if (this.f46346a < this.f46347b) {
            int d = mo42780d(v);
            this.f46346a++;
            T t = (C16615ij) iuVar.mo42943a(this, gtVar);
            mo42775a(0);
            this.f46346a--;
            mo42783e(d);
            return t;
        }
        throw zzuv.zzwv();
    }

    /* renamed from: l */
    public final zzte mo42791l() throws IOException {
        byte[] bArr;
        int v = m53946v();
        if (v > 0 && v <= this.f46352f - this.f46354h) {
            zzte zzb = zzte.zzb(this.f46350d, this.f46354h, v);
            this.f46354h += v;
            return zzb;
        } else if (v == 0) {
            return zzte.zzbtq;
        } else {
            if (v > 0 && v <= this.f46352f - this.f46354h) {
                int i = this.f46354h;
                this.f46354h += v;
                bArr = Arrays.copyOfRange(this.f46350d, i, this.f46354h);
            } else if (v > 0) {
                throw zzuv.zzwq();
            } else if (v == 0) {
                bArr = C16586hh.f46425b;
            } else {
                throw zzuv.zzwr();
            }
            return zzte.zzi(bArr);
        }
    }

    /* renamed from: m */
    public final int mo42792m() throws IOException {
        return m53946v();
    }

    /* renamed from: n */
    public final int mo42793n() throws IOException {
        return m53946v();
    }

    /* renamed from: o */
    public final int mo42794o() throws IOException {
        return m53948x();
    }

    /* renamed from: p */
    public final long mo42795p() throws IOException {
        return m53949y();
    }

    /* renamed from: q */
    public final int mo42796q() throws IOException {
        int v = m53946v();
        return (-(v & 1)) ^ (v >>> 1);
    }

    /* renamed from: r */
    public final long mo42797r() throws IOException {
        long w = m53947w();
        return (-(w & 1)) ^ (w >>> 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m53946v() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f46354h
            int r1 = r5.f46352f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f46350d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f46354h = r2
            return r0
        L_0x0011:
            int r3 = r5.f46352f
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x006d
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0024:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r3 = r2
            goto L_0x006a
        L_0x0031:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x003f
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x006a
        L_0x003f:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r4 = r3 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r1 = r1[r2]
            if (r1 < 0) goto L_0x006d
        L_0x006a:
            r5.f46354h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo42798s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16556gk.m53946v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (((long) r1[r0]) >= 0) goto L_0x0071;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m53947w() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f46354h
            int r1 = r11.f46352f
            if (r1 == r0) goto L_0x00bb
            byte[] r1 = r11.f46350d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0012
            r11.f46354h = r2
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r3 = r11.f46352f
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x00bb
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x002a
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            long r0 = (long) r0
        L_0x0025:
            r9 = r0
            r0 = r3
        L_0x0027:
            r2 = r9
            goto L_0x00b8
        L_0x002a:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0039
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r0 = r2
            goto L_0x0027
        L_0x0039:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0048
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
            goto L_0x0025
        L_0x0048:
            long r4 = (long) r0
            int r0 = r3 + 1
            byte r2 = r1[r3]
            long r2 = (long) r2
            r6 = 28
            long r2 = r2 << r6
            long r2 = r2 ^ r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x005d
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r2 = r2 ^ r4
            goto L_0x00b8
        L_0x005d:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
            long r0 = r0 ^ r2
        L_0x0070:
            r2 = r0
        L_0x0071:
            r0 = r6
            goto L_0x00b8
        L_0x0073:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 42
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0087
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r2 = r2 ^ r4
            goto L_0x00b8
        L_0x0087:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            long r0 = r0 ^ r2
            goto L_0x0070
        L_0x009b:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 56
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b8
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r0 = (long) r0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x00bb
            goto L_0x0071
        L_0x00b8:
            r11.f46354h = r0
            return r2
        L_0x00bb:
            long r0 = r11.mo42798s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16556gk.m53947w():long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo42798s() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m53945A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw zzuv.zzws();
    }

    /* renamed from: x */
    private final int m53948x() throws IOException {
        int i = this.f46354h;
        if (this.f46352f - i >= 4) {
            byte[] bArr = this.f46350d;
            this.f46354h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzuv.zzwq();
    }

    /* renamed from: y */
    private final long m53949y() throws IOException {
        int i = this.f46354h;
        if (this.f46352f - i >= 8) {
            byte[] bArr = this.f46350d;
            this.f46354h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzuv.zzwq();
    }

    /* renamed from: d */
    public final int mo42780d(int i) throws zzuv {
        if (i >= 0) {
            int u = i + mo42800u();
            int i2 = this.f46357k;
            if (u <= i2) {
                this.f46357k = u;
                m53950z();
                return i2;
            }
            throw zzuv.zzwq();
        }
        throw zzuv.zzwr();
    }

    /* renamed from: z */
    private final void m53950z() {
        this.f46352f += this.f46353g;
        int i = this.f46352f - this.f46355i;
        if (i > this.f46357k) {
            this.f46353g = i - this.f46357k;
            this.f46352f -= this.f46353g;
            return;
        }
        this.f46353g = 0;
    }

    /* renamed from: e */
    public final void mo42783e(int i) {
        this.f46357k = i;
        m53950z();
    }

    /* renamed from: t */
    public final boolean mo42799t() throws IOException {
        return this.f46354h == this.f46352f;
    }

    /* renamed from: u */
    public final int mo42800u() {
        return this.f46354h - this.f46355i;
    }

    /* renamed from: A */
    private final byte m53945A() throws IOException {
        if (this.f46354h != this.f46352f) {
            byte[] bArr = this.f46350d;
            int i = this.f46354h;
            this.f46354h = i + 1;
            return bArr[i];
        }
        throw zzuv.zzwq();
    }

    /* renamed from: f */
    public final void mo42785f(int i) throws IOException {
        if (i >= 0 && i <= this.f46352f - this.f46354h) {
            this.f46354h += i;
        } else if (i < 0) {
            throw zzuv.zzwr();
        } else {
            throw zzuv.zzwq();
        }
    }
}
