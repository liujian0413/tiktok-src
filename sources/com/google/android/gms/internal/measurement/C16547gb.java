package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gb */
final class C16547gb extends C16552gg {

    /* renamed from: b */
    private final int f46341b;

    /* renamed from: c */
    private final int f46342c;

    C16547gb(byte[] bArr, int i, int i2) {
        super(bArr);
        zzb(i, i + i2, bArr.length);
        this.f46341b = i;
        this.f46342c = i2;
    }

    public final byte zzam(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f46345a[this.f46341b + i];
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
    public final byte zzan(int i) {
        return this.f46345a[this.f46341b + i];
    }

    public final int size() {
        return this.f46342c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42761a() {
        return this.f46341b;
    }
}
