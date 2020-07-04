package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16579hf.C16584e;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.jt */
public final class C16652jt {

    /* renamed from: a */
    private static final C16652jt f46524a = new C16652jt(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f46525b;

    /* renamed from: c */
    private int[] f46526c;

    /* renamed from: d */
    private Object[] f46527d;

    /* renamed from: e */
    private int f46528e;

    /* renamed from: f */
    private boolean f46529f;

    /* renamed from: a */
    public static C16652jt m54507a() {
        return f46524a;
    }

    /* renamed from: b */
    static C16652jt m54510b() {
        return new C16652jt();
    }

    /* renamed from: a */
    static C16652jt m54508a(C16652jt jtVar, C16652jt jtVar2) {
        int i = jtVar.f46525b + jtVar2.f46525b;
        int[] copyOf = Arrays.copyOf(jtVar.f46526c, i);
        System.arraycopy(jtVar2.f46526c, 0, copyOf, jtVar.f46525b, jtVar2.f46525b);
        Object[] copyOf2 = Arrays.copyOf(jtVar.f46527d, i);
        System.arraycopy(jtVar2.f46527d, 0, copyOf2, jtVar.f46525b, jtVar2.f46525b);
        return new C16652jt(i, copyOf, copyOf2, true);
    }

    private C16652jt() {
        this(0, new int[8], new Object[8], true);
    }

    private C16652jt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f46528e = -1;
        this.f46525b = i;
        this.f46526c = iArr;
        this.f46527d = objArr;
        this.f46529f = z;
    }

    /* renamed from: c */
    public final void mo43070c() {
        this.f46529f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43067a(C16675kl klVar) throws IOException {
        if (klVar.mo42843a() == C16584e.f46417k) {
            for (int i = this.f46525b - 1; i >= 0; i--) {
                klVar.mo42851a(this.f46526c[i] >>> 3, this.f46527d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f46525b; i2++) {
            klVar.mo42851a(this.f46526c[i2] >>> 3, this.f46527d[i2]);
        }
    }

    /* renamed from: b */
    public final void mo43069b(C16675kl klVar) throws IOException {
        if (this.f46525b != 0) {
            if (klVar.mo42843a() == C16584e.f46416j) {
                for (int i = 0; i < this.f46525b; i++) {
                    m54509a(this.f46526c[i], this.f46527d[i], klVar);
                }
                return;
            }
            for (int i2 = this.f46525b - 1; i2 >= 0; i2--) {
                m54509a(this.f46526c[i2], this.f46527d[i2], klVar);
            }
        }
    }

    /* renamed from: a */
    private static void m54509a(int i, Object obj, C16675kl klVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    klVar.mo42848a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    klVar.mo42869d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    klVar.mo42850a(i2, (zzte) obj);
                    return;
                case 3:
                    if (klVar.mo42843a() == C16584e.f46416j) {
                        klVar.mo42844a(i2);
                        ((C16652jt) obj).mo43069b(klVar);
                        klVar.mo42858b(i2);
                        return;
                    }
                    klVar.mo42858b(i2);
                    ((C16652jt) obj).mo43069b(klVar);
                    klVar.mo42844a(i2);
                    return;
                default:
                    throw new RuntimeException(zzuv.zzwu());
            }
        } else {
            klVar.mo42868d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: d */
    public final int mo43071d() {
        int i = this.f46528e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f46525b; i3++) {
            i2 += zztv.m54932d(this.f46526c[i3] >>> 3, (zzte) this.f46527d[i3]);
        }
        this.f46528e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int mo43072e() {
        int i;
        int i2 = this.f46528e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f46525b; i4++) {
            int i5 = this.f46526c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = zztv.m54935e(i6, ((Long) this.f46527d[i4]).longValue());
                        break;
                    case 1:
                        i = zztv.m54943g(i6, ((Long) this.f46527d[i4]).longValue());
                        break;
                    case 2:
                        i = zztv.m54927c(i6, (zzte) this.f46527d[i4]);
                        break;
                    case 3:
                        i = (zztv.m54934e(i6) << 1) + ((C16652jt) this.f46527d[i4]).mo43072e();
                        break;
                    default:
                        throw new IllegalStateException(zzuv.zzwu());
                }
            } else {
                i = zztv.m54949i(i6, ((Integer) this.f46527d[i4]).intValue());
            }
            i3 += i;
        }
        this.f46528e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C16652jt)) {
            return false;
        }
        C16652jt jtVar = (C16652jt) obj;
        if (this.f46525b == jtVar.f46525b) {
            int[] iArr = this.f46526c;
            int[] iArr2 = jtVar.f46526c;
            int i = this.f46525b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f46527d;
                Object[] objArr2 = jtVar.f46527d;
                int i3 = this.f46525b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = (this.f46525b + 527) * 31;
        int[] iArr = this.f46526c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f46525b; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.f46527d;
        for (int i6 = 0; i6 < this.f46525b; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return i5 + i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43068a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f46525b; i2++) {
            C16618im.m54281a(sb, i, String.valueOf(this.f46526c[i2] >>> 3), this.f46527d[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43066a(int i, Object obj) {
        if (this.f46529f) {
            if (this.f46525b == this.f46526c.length) {
                int i2 = this.f46525b + (this.f46525b < 4 ? 8 : this.f46525b >> 1);
                this.f46526c = Arrays.copyOf(this.f46526c, i2);
                this.f46527d = Arrays.copyOf(this.f46527d, i2);
            }
            this.f46526c[this.f46525b] = i;
            this.f46527d[this.f46525b] = obj;
            this.f46525b++;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
