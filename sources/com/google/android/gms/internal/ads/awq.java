package com.google.android.gms.internal.ads;

final class awq extends awv {

    /* renamed from: b */
    private final int f41138b;

    /* renamed from: c */
    private final int f41139c;

    awq(byte[] bArr, int i, int i2) {
        super(bArr);
        zzg(i, i + i2, bArr.length);
        this.f41138b = i;
        this.f41139c = i2;
    }

    public final byte zzfi(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f41142a[this.f41138b + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    public final byte zzfj(int i) {
        return this.f41142a[this.f41138b + i];
    }

    public final int size() {
        return this.f41139c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40117a() {
        return this.f41138b;
    }

    /* access modifiers changed from: protected */
    public final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f41142a, mo40117a(), bArr, 0, i3);
    }
}
