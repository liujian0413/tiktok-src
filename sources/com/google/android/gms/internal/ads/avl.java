package com.google.android.gms.internal.ads;

public final class avl {

    /* renamed from: a */
    private final byte[] f41106a;

    /* renamed from: a */
    public static avl m47373a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new avl(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] mo40072a() {
        byte[] bArr = new byte[this.f41106a.length];
        System.arraycopy(this.f41106a, 0, bArr, 0, this.f41106a.length);
        return bArr;
    }

    private avl(byte[] bArr, int i, int i2) {
        this.f41106a = new byte[i2];
        System.arraycopy(bArr, 0, this.f41106a, 0, i2);
    }
}
