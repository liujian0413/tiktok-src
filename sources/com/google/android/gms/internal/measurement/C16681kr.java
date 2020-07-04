package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kr */
public final class C16681kr implements Cloneable {

    /* renamed from: b */
    private static final C16682ks f46598b = new C16682ks();

    /* renamed from: a */
    public int f46599a;

    /* renamed from: c */
    private int[] f46600c;

    /* renamed from: d */
    private C16682ks[] f46601d;

    C16681kr() {
        this(10);
    }

    private C16681kr(int i) {
        int c = m54789c(i);
        this.f46600c = new int[c];
        this.f46601d = new C16682ks[c];
        this.f46599a = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C16682ks mo43154a(int i) {
        int d = m54790d(i);
        if (d < 0 || this.f46601d[d] == f46598b) {
            return null;
        }
        return this.f46601d[d];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43155a(int i, C16682ks ksVar) {
        int d = m54790d(i);
        if (d >= 0) {
            this.f46601d[d] = ksVar;
            return;
        }
        int i2 = d ^ -1;
        if (i2 >= this.f46599a || this.f46601d[i2] != f46598b) {
            if (this.f46599a >= this.f46600c.length) {
                int c = m54789c(this.f46599a + 1);
                int[] iArr = new int[c];
                C16682ks[] ksVarArr = new C16682ks[c];
                System.arraycopy(this.f46600c, 0, iArr, 0, this.f46600c.length);
                System.arraycopy(this.f46601d, 0, ksVarArr, 0, this.f46601d.length);
                this.f46600c = iArr;
                this.f46601d = ksVarArr;
            }
            if (this.f46599a - i2 != 0) {
                int[] iArr2 = this.f46600c;
                int i3 = i2 + 1;
                System.arraycopy(iArr2, i2, iArr2, i3, this.f46599a - i2);
                C16682ks[] ksVarArr2 = this.f46601d;
                System.arraycopy(ksVarArr2, i2, ksVarArr2, i3, this.f46599a - i2);
            }
            this.f46600c[i2] = i;
            this.f46601d[i2] = ksVar;
            this.f46599a++;
            return;
        }
        this.f46600c[i2] = i;
        this.f46601d[i2] = ksVar;
    }

    /* renamed from: a */
    public final boolean mo43156a() {
        return this.f46599a == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C16682ks mo43157b(int i) {
        return this.f46601d[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16681kr)) {
            return false;
        }
        C16681kr krVar = (C16681kr) obj;
        if (this.f46599a != krVar.f46599a) {
            return false;
        }
        int[] iArr = this.f46600c;
        int[] iArr2 = krVar.f46600c;
        int i = this.f46599a;
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
            C16682ks[] ksVarArr = this.f46601d;
            C16682ks[] ksVarArr2 = krVar.f46601d;
            int i3 = this.f46599a;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!ksVarArr[i4].equals(ksVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f46599a; i2++) {
            i = (((i * 31) + this.f46600c[i2]) * 31) + this.f46601d[i2].hashCode();
        }
        return i;
    }

    /* renamed from: c */
    private static int m54789c(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* renamed from: d */
    private final int m54790d(int i) {
        int i2 = this.f46599a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f46600c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f46599a;
        C16681kr krVar = new C16681kr(i);
        System.arraycopy(this.f46600c, 0, krVar.f46600c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f46601d[i2] != null) {
                krVar.f46601d[i2] = (C16682ks) this.f46601d[i2].clone();
            }
        }
        krVar.f46599a = i;
        return krVar;
    }
}
