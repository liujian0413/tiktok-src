package com.google.android.gms.internal.ads;

public final class bbi implements Cloneable {

    /* renamed from: b */
    private static final bbj f41363b = new bbj();

    /* renamed from: a */
    public int f41364a;

    /* renamed from: c */
    private int[] f41365c;

    /* renamed from: d */
    private bbj[] f41366d;

    bbi() {
        this(10);
    }

    private bbi(int i) {
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
        int i5 = i2 / 4;
        this.f41365c = new int[i5];
        this.f41366d = new bbj[i5];
        this.f41364a = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final bbj mo40479a(int i) {
        return this.f41366d[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbi)) {
            return false;
        }
        bbi bbi = (bbi) obj;
        if (this.f41364a != bbi.f41364a) {
            return false;
        }
        int[] iArr = this.f41365c;
        int[] iArr2 = bbi.f41365c;
        int i = this.f41364a;
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
            bbj[] bbjArr = this.f41366d;
            bbj[] bbjArr2 = bbi.f41366d;
            int i3 = this.f41364a;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!bbjArr[i4].equals(bbjArr2[i4])) {
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
        for (int i2 = 0; i2 < this.f41364a; i2++) {
            i = (((i * 31) + this.f41365c[i2]) * 31) + this.f41366d[i2].hashCode();
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f41364a;
        bbi bbi = new bbi(i);
        System.arraycopy(this.f41365c, 0, bbi.f41365c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f41366d[i2] != null) {
                bbi.f41366d[i2] = (bbj) this.f41366d[i2].clone();
            }
        }
        bbi.f41364a = i;
        return bbi;
    }
}
