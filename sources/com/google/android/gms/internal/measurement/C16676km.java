package com.google.android.gms.internal.measurement;

import com.C1642a;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.km */
public final class C16676km {

    /* renamed from: a */
    private final byte[] f46568a;

    /* renamed from: b */
    private final int f46569b;

    /* renamed from: c */
    private final int f46570c;

    /* renamed from: d */
    private int f46571d;

    /* renamed from: e */
    private int f46572e;

    /* renamed from: f */
    private int f46573f;

    /* renamed from: g */
    private int f46574g;

    /* renamed from: h */
    private int f46575h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f46576i;

    /* renamed from: j */
    private int f46577j = 64;

    /* renamed from: k */
    private int f46578k = 67108864;

    /* renamed from: l */
    private C16554gi f46579l;

    /* renamed from: a */
    public static C16676km m54725a(byte[] bArr) {
        return m54726a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C16676km m54726a(byte[] bArr, int i, int i2) {
        return new C16676km(bArr, 0, i2);
    }

    /* renamed from: a */
    public final int mo43113a() throws IOException {
        if (this.f46573f == this.f46571d) {
            this.f46574g = 0;
            return 0;
        }
        this.f46574g = mo43124d();
        if (this.f46574g != 0) {
            return this.f46574g;
        }
        throw new zzyh("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    private void m54727e(int i) throws zzyh {
        if (this.f46574g != i) {
            throw new zzyh("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: a */
    public final boolean mo43117a(int i) throws IOException {
        int a;
        switch (i & 7) {
            case 0:
                mo43124d();
                return true;
            case 1:
                mo43128g();
                return true;
            case 2:
                m54728f(mo43124d());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo43127f();
                return true;
            default:
                throw new zzyh("Protocol message tag had invalid wire type.");
        }
        do {
            a = mo43113a();
            if (a != 0) {
            }
            m54727e(((i >>> 3) << 3) | 4);
            return true;
        } while (mo43117a(a));
        m54727e(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final boolean mo43121b() throws IOException {
        return mo43124d() != 0;
    }

    /* renamed from: c */
    public final String mo43122c() throws IOException {
        int d = mo43124d();
        if (d < 0) {
            throw zzyh.zzze();
        } else if (d <= this.f46571d - this.f46573f) {
            String str = new String(this.f46568a, this.f46573f, d, C16683kt.f46605a);
            this.f46573f += d;
            return str;
        } else {
            throw zzyh.zzzd();
        }
    }

    /* renamed from: a */
    public final void mo43116a(C16684ku kuVar, int i) throws IOException {
        if (this.f46576i < this.f46577j) {
            this.f46576i++;
            kuVar.mo42654a(this);
            m54727e((i << 3) | 4);
            this.f46576i--;
            return;
        }
        throw zzyh.zzzg();
    }

    /* renamed from: a */
    public final void mo43115a(C16684ku kuVar) throws IOException {
        int d = mo43124d();
        if (this.f46576i < this.f46577j) {
            int b = mo43119b(d);
            this.f46576i++;
            kuVar.mo42654a(this);
            m54727e(0);
            this.f46576i--;
            mo43123c(b);
            return;
        }
        throw zzyh.zzzg();
    }

    /* renamed from: d */
    public final int mo43124d() throws IOException {
        byte b;
        byte l = m54731l();
        if (l >= 0) {
            return l;
        }
        byte b2 = l & Byte.MAX_VALUE;
        byte l2 = m54731l();
        if (l2 >= 0) {
            b = b2 | (l2 << 7);
        } else {
            byte b3 = b2 | ((l2 & Byte.MAX_VALUE) << 7);
            byte l3 = m54731l();
            if (l3 >= 0) {
                b = b3 | (l3 << 14);
            } else {
                byte b4 = b3 | ((l3 & Byte.MAX_VALUE) << 14);
                byte l4 = m54731l();
                if (l4 >= 0) {
                    b = b4 | (l4 << 21);
                } else {
                    byte b5 = b4 | ((l4 & Byte.MAX_VALUE) << 21);
                    byte l5 = m54731l();
                    b = b5 | (l5 << 28);
                    if (l5 < 0) {
                        for (int i = 0; i < 5; i++) {
                            if (m54731l() >= 0) {
                                return b;
                            }
                        }
                        throw zzyh.zzzf();
                    }
                }
            }
        }
        return b;
    }

    /* renamed from: e */
    public final long mo43126e() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = m54731l();
            j |= ((long) (l & Byte.MAX_VALUE)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw zzyh.zzzf();
    }

    /* renamed from: f */
    public final int mo43127f() throws IOException {
        return (m54731l() & 255) | ((m54731l() & 255) << 8) | ((m54731l() & 255) << 16) | ((m54731l() & 255) << 24);
    }

    /* renamed from: g */
    public final long mo43128g() throws IOException {
        byte l = m54731l();
        byte l2 = m54731l();
        return ((((long) l2) & 255) << 8) | (((long) l) & 255) | ((((long) m54731l()) & 255) << 16) | ((((long) m54731l()) & 255) << 24) | ((((long) m54731l()) & 255) << 32) | ((((long) m54731l()) & 255) << 40) | ((((long) m54731l()) & 255) << 48) | ((((long) m54731l()) & 255) << 56);
    }

    private C16676km(byte[] bArr, int i, int i2) {
        this.f46568a = bArr;
        this.f46569b = 0;
        int i3 = i2 + 0;
        this.f46571d = i3;
        this.f46570c = i3;
        this.f46573f = 0;
    }

    /* renamed from: j */
    private final C16554gi m54729j() throws IOException {
        if (this.f46579l == null) {
            this.f46579l = C16554gi.m53915a(this.f46568a, this.f46569b, this.f46570c);
        }
        int u = this.f46579l.mo42800u();
        int i = this.f46573f - this.f46569b;
        if (u <= i) {
            this.f46579l.mo42785f(i - u);
            this.f46579l.mo42779c(this.f46577j - this.f46576i);
            return this.f46579l;
        }
        throw new IOException(C1642a.m8034a("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i)}));
    }

    /* renamed from: a */
    public final <T extends C16579hf<T, ?>> T mo43114a(C16626iu<T> iuVar) throws IOException {
        try {
            T t = (C16579hf) m54729j().mo42774a(iuVar, C16565gt.m54082b());
            mo43117a(this.f46574g);
            return t;
        } catch (zzuv e) {
            throw new zzyh("", e);
        }
    }

    /* renamed from: b */
    public final int mo43119b(int i) throws zzyh {
        if (i >= 0) {
            int i2 = i + this.f46573f;
            int i3 = this.f46575h;
            if (i2 <= i3) {
                this.f46575h = i2;
                m54730k();
                return i3;
            }
            throw zzyh.zzzd();
        }
        throw zzyh.zzze();
    }

    /* renamed from: k */
    private final void m54730k() {
        this.f46571d += this.f46572e;
        int i = this.f46571d;
        if (i > this.f46575h) {
            this.f46572e = i - this.f46575h;
            this.f46571d -= this.f46572e;
            return;
        }
        this.f46572e = 0;
    }

    /* renamed from: c */
    public final void mo43123c(int i) {
        this.f46575h = i;
        m54730k();
    }

    /* renamed from: h */
    public final int mo43129h() {
        if (this.f46575h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f46575h - this.f46573f;
    }

    /* renamed from: i */
    public final int mo43130i() {
        return this.f46573f - this.f46569b;
    }

    /* renamed from: a */
    public final byte[] mo43118a(int i, int i2) {
        if (i2 == 0) {
            return C16687kx.f46614d;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f46568a, this.f46569b + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: d */
    public final void mo43125d(int i) {
        mo43120b(i, this.f46574g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo43120b(int i, int i2) {
        if (i > this.f46573f - this.f46569b) {
            int i3 = this.f46573f - this.f46569b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f46573f = this.f46569b + i;
            this.f46574g = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: l */
    private final byte m54731l() throws IOException {
        if (this.f46573f != this.f46571d) {
            byte[] bArr = this.f46568a;
            int i = this.f46573f;
            this.f46573f = i + 1;
            return bArr[i];
        }
        throw zzyh.zzzd();
    }

    /* renamed from: f */
    private final void m54728f(int i) throws IOException {
        if (i < 0) {
            throw zzyh.zzze();
        } else if (this.f46573f + i > this.f46575h) {
            m54728f(this.f46575h - this.f46573f);
            throw zzyh.zzzd();
        } else if (i <= this.f46571d - this.f46573f) {
            this.f46573f += i;
        } else {
            throw zzyh.zzzd();
        }
    }
}
