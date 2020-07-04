package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

final class awz extends awx {

    /* renamed from: d */
    private final byte[] f41147d;

    /* renamed from: e */
    private final boolean f41148e;

    /* renamed from: f */
    private int f41149f;

    /* renamed from: g */
    private int f41150g;

    /* renamed from: h */
    private int f41151h;

    /* renamed from: i */
    private int f41152i;

    /* renamed from: j */
    private int f41153j;

    /* renamed from: k */
    private int f41154k;

    private awz(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f41154k = Integer.MAX_VALUE;
        this.f41147d = bArr;
        this.f41149f = i2 + i;
        this.f41151h = i;
        this.f41152i = this.f41151h;
        this.f41148e = z;
    }

    /* renamed from: a */
    public final int mo40131a() throws IOException {
        if (mo40154t()) {
            this.f41153j = 0;
            return 0;
        }
        this.f41153j = m47483v();
        if ((this.f41153j >>> 3) != 0) {
            return this.f41153j;
        }
        throw zzcdx.zzatx();
    }

    /* renamed from: a */
    public final void mo40132a(int i) throws zzcdx {
        if (this.f41153j != i) {
            throw zzcdx.zzaty();
        }
    }

    /* renamed from: b */
    public final boolean mo40134b(int i) throws IOException {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f41149f - this.f41151h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f41147d;
                        int i3 = this.f41151h;
                        this.f41151h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw zzcdx.zzatw();
                }
                while (i2 < 10) {
                    if (m47481A() < 0) {
                        i2++;
                    }
                }
                throw zzcdx.zzatw();
                return true;
            case 1:
                m47482f(8);
                return true;
            case 2:
                m47482f(m47483v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m47482f(4);
                return true;
            default:
                throw zzcdx.zzatz();
        }
        do {
            a = mo40131a();
            if (a != 0) {
            }
            mo40132a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo40134b(a));
        mo40132a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final double mo40133b() throws IOException {
        return Double.longBitsToDouble(m47486y());
    }

    /* renamed from: c */
    public final float mo40135c() throws IOException {
        return Float.intBitsToFloat(m47485x());
    }

    /* renamed from: d */
    public final long mo40137d() throws IOException {
        return m47484w();
    }

    /* renamed from: e */
    public final long mo40139e() throws IOException {
        return m47484w();
    }

    /* renamed from: f */
    public final int mo40140f() throws IOException {
        return m47483v();
    }

    /* renamed from: g */
    public final long mo40141g() throws IOException {
        return m47486y();
    }

    /* renamed from: h */
    public final int mo40142h() throws IOException {
        return m47485x();
    }

    /* renamed from: i */
    public final boolean mo40143i() throws IOException {
        return m47484w() != 0;
    }

    /* renamed from: j */
    public final String mo40144j() throws IOException {
        int v = m47483v();
        if (v > 0 && v <= this.f41149f - this.f41151h) {
            String str = new String(this.f41147d, this.f41151h, v, axw.f41216a);
            this.f41151h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw zzcdx.zzatv();
            }
            throw zzcdx.zzatu();
        }
    }

    /* renamed from: k */
    public final String mo40145k() throws IOException {
        int v = m47483v();
        if (v > 0 && v <= this.f41149f - this.f41151h) {
            String b = bas.m48231b(this.f41147d, this.f41151h, v);
            this.f41151h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw zzcdx.zzatv();
            }
            throw zzcdx.zzatu();
        }
    }

    /* renamed from: l */
    public final zzcce mo40146l() throws IOException {
        byte[] bArr;
        int v = m47483v();
        if (v > 0 && v <= this.f41149f - this.f41151h) {
            zzcce zzi = zzcce.zzi(this.f41147d, this.f41151h, v);
            this.f41151h += v;
            return zzi;
        } else if (v == 0) {
            return zzcce.zzfuo;
        } else {
            if (v > 0 && v <= this.f41149f - this.f41151h) {
                int i = this.f41151h;
                this.f41151h += v;
                bArr = Arrays.copyOfRange(this.f41147d, i, this.f41151h);
            } else if (v > 0) {
                throw zzcdx.zzatu();
            } else if (v == 0) {
                bArr = axw.f41217b;
            } else {
                throw zzcdx.zzatv();
            }
            return zzcce.zzz(bArr);
        }
    }

    /* renamed from: m */
    public final int mo40147m() throws IOException {
        return m47483v();
    }

    /* renamed from: n */
    public final int mo40148n() throws IOException {
        return m47483v();
    }

    /* renamed from: o */
    public final int mo40149o() throws IOException {
        return m47485x();
    }

    /* renamed from: p */
    public final long mo40150p() throws IOException {
        return m47486y();
    }

    /* renamed from: q */
    public final int mo40151q() throws IOException {
        return m47455e(m47483v());
    }

    /* renamed from: r */
    public final long mo40152r() throws IOException {
        return m47453a(m47484w());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m47483v() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f41151h
            int r1 = r5.f41149f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f41147d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f41151h = r2
            return r0
        L_0x0011:
            int r3 = r5.f41149f
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
            r5.f41151h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo40153s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.awz.m47483v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (((long) r1[r0]) >= 0) goto L_0x0071;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m47484w() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f41151h
            int r1 = r11.f41149f
            if (r1 == r0) goto L_0x00bb
            byte[] r1 = r11.f41147d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0012
            r11.f41151h = r2
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r3 = r11.f41149f
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
            r11.f41151h = r0
            return r2
        L_0x00bb:
            long r0 = r11.mo40153s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.awz.m47484w():long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo40153s() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m47481A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw zzcdx.zzatw();
    }

    /* renamed from: x */
    private final int m47485x() throws IOException {
        int i = this.f41151h;
        if (this.f41149f - i >= 4) {
            byte[] bArr = this.f41147d;
            this.f41151h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzcdx.zzatu();
    }

    /* renamed from: y */
    private final long m47486y() throws IOException {
        int i = this.f41151h;
        if (this.f41149f - i >= 8) {
            byte[] bArr = this.f41147d;
            this.f41151h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzcdx.zzatu();
    }

    /* renamed from: c */
    public final int mo40136c(int i) throws zzcdx {
        if (i >= 0) {
            int u = i + mo40155u();
            int i2 = this.f41154k;
            if (u <= i2) {
                this.f41154k = u;
                m47487z();
                return i2;
            }
            throw zzcdx.zzatu();
        }
        throw zzcdx.zzatv();
    }

    /* renamed from: z */
    private final void m47487z() {
        this.f41149f += this.f41150g;
        int i = this.f41149f - this.f41152i;
        if (i > this.f41154k) {
            this.f41150g = i - this.f41154k;
            this.f41149f -= this.f41150g;
            return;
        }
        this.f41150g = 0;
    }

    /* renamed from: d */
    public final void mo40138d(int i) {
        this.f41154k = i;
        m47487z();
    }

    /* renamed from: t */
    public final boolean mo40154t() throws IOException {
        return this.f41151h == this.f41149f;
    }

    /* renamed from: u */
    public final int mo40155u() {
        return this.f41151h - this.f41152i;
    }

    /* renamed from: A */
    private final byte m47481A() throws IOException {
        if (this.f41151h != this.f41149f) {
            byte[] bArr = this.f41147d;
            int i = this.f41151h;
            this.f41151h = i + 1;
            return bArr[i];
        }
        throw zzcdx.zzatu();
    }

    /* renamed from: f */
    private final void m47482f(int i) throws IOException {
        if (i >= 0 && i <= this.f41149f - this.f41151h) {
            this.f41151h += i;
        } else if (i < 0) {
            throw zzcdx.zzatv();
        } else {
            throw zzcdx.zzatu();
        }
    }
}
