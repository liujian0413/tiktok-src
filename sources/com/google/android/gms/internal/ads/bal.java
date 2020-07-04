package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15550e;
import java.io.IOException;
import java.util.Arrays;

public final class bal {

    /* renamed from: a */
    private static final bal f41314a = new bal(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f41315b;

    /* renamed from: c */
    private int[] f41316c;

    /* renamed from: d */
    private Object[] f41317d;

    /* renamed from: e */
    private int f41318e;

    /* renamed from: f */
    private boolean f41319f;

    /* renamed from: a */
    public static bal m48096a() {
        return f41314a;
    }

    /* renamed from: b */
    static bal m48099b() {
        return new bal();
    }

    /* renamed from: a */
    static bal m48097a(bal bal, bal bal2) {
        int i = bal.f41315b + bal2.f41315b;
        int[] copyOf = Arrays.copyOf(bal.f41316c, i);
        System.arraycopy(bal2.f41316c, 0, copyOf, bal.f41315b, bal2.f41315b);
        Object[] copyOf2 = Arrays.copyOf(bal.f41317d, i);
        System.arraycopy(bal2.f41317d, 0, copyOf2, bal.f41315b, bal2.f41315b);
        return new bal(i, copyOf, copyOf2, true);
    }

    private bal() {
        this(0, new int[8], new Object[8], true);
    }

    private bal(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f41318e = -1;
        this.f41315b = i;
        this.f41316c = iArr;
        this.f41317d = objArr;
        this.f41319f = z;
    }

    /* renamed from: c */
    public final void mo40423c() {
        this.f41319f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40420a(bbe bbe) throws IOException {
        if (bbe.mo40198a() == C15550e.f41209k) {
            for (int i = this.f41315b - 1; i >= 0; i--) {
                bbe.mo40206a(this.f41316c[i] >>> 3, this.f41317d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f41315b; i2++) {
            bbe.mo40206a(this.f41316c[i2] >>> 3, this.f41317d[i2]);
        }
    }

    /* renamed from: b */
    public final void mo40422b(bbe bbe) throws IOException {
        if (this.f41315b != 0) {
            if (bbe.mo40198a() == C15550e.f41208j) {
                for (int i = 0; i < this.f41315b; i++) {
                    m48098a(this.f41316c[i], this.f41317d[i], bbe);
                }
                return;
            }
            for (int i2 = this.f41315b - 1; i2 >= 0; i2--) {
                m48098a(this.f41316c[i2], this.f41317d[i2], bbe);
            }
        }
    }

    /* renamed from: a */
    private static void m48098a(int i, Object obj, bbe bbe) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    bbe.mo40203a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    bbe.mo40224d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    bbe.mo40205a(i2, (zzcce) obj);
                    return;
                case 3:
                    if (bbe.mo40198a() == C15550e.f41208j) {
                        bbe.mo40199a(i2);
                        ((bal) obj).mo40422b(bbe);
                        bbe.mo40213b(i2);
                        return;
                    }
                    bbe.mo40213b(i2);
                    ((bal) obj).mo40422b(bbe);
                    bbe.mo40199a(i2);
                    return;
                default:
                    throw new RuntimeException(zzcdx.zzatz());
            }
        } else {
            bbe.mo40223d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: d */
    public final int mo40424d() {
        int i = this.f41318e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f41315b; i3++) {
            i2 += zzccv.m53016d(this.f41316c[i3] >>> 3, (zzcce) this.f41317d[i3]);
        }
        this.f41318e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int mo40425e() {
        int i;
        int i2 = this.f41318e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f41315b; i4++) {
            int i5 = this.f41316c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = zzccv.m53020e(i6, ((Long) this.f41317d[i4]).longValue());
                        break;
                    case 1:
                        i = zzccv.m53028g(i6, ((Long) this.f41317d[i4]).longValue());
                        break;
                    case 2:
                        i = zzccv.m53012c(i6, (zzcce) this.f41317d[i4]);
                        break;
                    case 3:
                        i = (zzccv.m53019e(i6) << 1) + ((bal) this.f41317d[i4]).mo40425e();
                        break;
                    default:
                        throw new IllegalStateException(zzcdx.zzatz());
                }
            } else {
                i = zzccv.m53034i(i6, ((Integer) this.f41317d[i4]).intValue());
            }
            i3 += i;
        }
        this.f41318e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bal)) {
            return false;
        }
        bal bal = (bal) obj;
        if (this.f41315b == bal.f41315b) {
            int[] iArr = this.f41316c;
            int[] iArr2 = bal.f41316c;
            int i = this.f41315b;
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
                Object[] objArr = this.f41317d;
                Object[] objArr2 = bal.f41317d;
                int i3 = this.f41315b;
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
        int i = (this.f41315b + 527) * 31;
        int[] iArr = this.f41316c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f41315b; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.f41317d;
        for (int i6 = 0; i6 < this.f41315b; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return i5 + i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40421a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f41315b; i2++) {
            aze.m47849a(sb, i, String.valueOf(this.f41316c[i2] >>> 3), this.f41317d[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40419a(int i, Object obj) {
        if (this.f41319f) {
            if (this.f41315b == this.f41316c.length) {
                int i2 = this.f41315b + (this.f41315b < 4 ? 8 : this.f41315b >> 1);
                this.f41316c = Arrays.copyOf(this.f41316c, i2);
                this.f41317d = Arrays.copyOf(this.f41317d, i2);
            }
            this.f41316c[this.f41315b] = i;
            this.f41317d[this.f41315b] = obj;
            this.f41315b++;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
