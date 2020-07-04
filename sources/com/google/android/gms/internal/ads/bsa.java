package com.google.android.gms.internal.ads;

public final class bsa {

    /* renamed from: a */
    public byte[] f43388a;

    /* renamed from: b */
    public int f43389b;

    /* renamed from: c */
    public int f43390c;

    public bsa() {
    }

    public bsa(int i) {
        this.f43388a = new byte[i];
        this.f43390c = i;
    }

    public bsa(byte[] bArr) {
        this.f43388a = bArr;
        this.f43390c = bArr.length;
    }

    /* renamed from: a */
    public final void mo41217a(int i) {
        mo41218a(mo41222c() < i ? new byte[i] : this.f43388a, i);
    }

    /* renamed from: a */
    public final void mo41218a(byte[] bArr, int i) {
        this.f43388a = bArr;
        this.f43390c = i;
        this.f43389b = 0;
    }

    /* renamed from: a */
    public final void mo41216a() {
        this.f43389b = 0;
        this.f43390c = 0;
    }

    /* renamed from: b */
    public final int mo41220b() {
        return this.f43390c - this.f43389b;
    }

    /* renamed from: b */
    public final void mo41221b(int i) {
        brr.m49871a(i >= 0 && i <= this.f43388a.length);
        this.f43390c = i;
    }

    /* renamed from: c */
    public final int mo41222c() {
        if (this.f43388a == null) {
            return 0;
        }
        return this.f43388a.length;
    }

    /* renamed from: c */
    public final void mo41223c(int i) {
        brr.m49871a(i >= 0 && i <= this.f43390c);
        this.f43389b = i;
    }

    /* renamed from: d */
    public final void mo41225d(int i) {
        mo41223c(this.f43389b + i);
    }

    /* renamed from: a */
    public final void mo41219a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f43388a, this.f43389b, bArr, i, i2);
        this.f43389b += i2;
    }

    /* renamed from: d */
    public final int mo41224d() {
        byte[] bArr = this.f43388a;
        int i = this.f43389b;
        this.f43389b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: e */
    public final int mo41226e() {
        byte[] bArr = this.f43388a;
        int i = this.f43389b;
        this.f43389b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f43388a;
        int i3 = this.f43389b;
        this.f43389b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: f */
    public final int mo41228f() {
        byte[] bArr = this.f43388a;
        int i = this.f43389b;
        this.f43389b = i + 1;
        byte b = bArr[i] & 255;
        byte[] bArr2 = this.f43388a;
        int i2 = this.f43389b;
        this.f43389b = i2 + 1;
        return b | ((bArr2[i2] & 255) << 8);
    }

    /* renamed from: g */
    public final short mo41229g() {
        byte[] bArr = this.f43388a;
        int i = this.f43389b;
        this.f43389b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f43388a;
        int i3 = this.f43389b;
        this.f43389b = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    /* renamed from: h */
    public final long mo41230h() {
        byte[] bArr = this.f43388a;
        int i = this.f43389b;
        this.f43389b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.f43388a;
        int i2 = this.f43389b;
        this.f43389b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 16);
        byte[] bArr3 = this.f43388a;
        int i3 = this.f43389b;
        this.f43389b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 8);
        byte[] bArr4 = this.f43388a;
        int i4 = this.f43389b;
        this.f43389b = i4 + 1;
        return j3 | (255 & ((long) bArr4[i4]));
    }

    /* renamed from: i */
    public final long mo41231i() {
        byte[] bArr = this.f43388a;
        int i = this.f43389b;
        this.f43389b = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.f43388a;
        int i2 = this.f43389b;
        this.f43389b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.f43388a;
        int i3 = this.f43389b;
        this.f43389b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.f43388a;
        int i4 = this.f43389b;
        this.f43389b = i4 + 1;
        return j3 | ((255 & ((long) bArr4[i4])) << 24);
    }

    /* renamed from: j */
    public final int mo41232j() {
        byte[] bArr = this.f43388a;
        int i = this.f43389b;
        this.f43389b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f43388a;
        int i3 = this.f43389b;
        this.f43389b = i3 + 1;
        byte b = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.f43388a;
        int i4 = this.f43389b;
        this.f43389b = i4 + 1;
        byte b2 = b | ((bArr3[i4] & 255) << 8);
        byte[] bArr4 = this.f43388a;
        int i5 = this.f43389b;
        this.f43389b = i5 + 1;
        return b2 | (bArr4[i5] & 255);
    }

    /* renamed from: k */
    public final long mo41233k() {
        byte[] bArr = this.f43388a;
        int i = this.f43389b;
        this.f43389b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.f43388a;
        int i2 = this.f43389b;
        this.f43389b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 48);
        byte[] bArr3 = this.f43388a;
        int i3 = this.f43389b;
        this.f43389b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 40);
        byte[] bArr4 = this.f43388a;
        int i4 = this.f43389b;
        this.f43389b = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 32);
        byte[] bArr5 = this.f43388a;
        int i5 = this.f43389b;
        this.f43389b = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 24);
        byte[] bArr6 = this.f43388a;
        int i6 = this.f43389b;
        this.f43389b = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 16);
        byte[] bArr7 = this.f43388a;
        int i7 = this.f43389b;
        this.f43389b = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 8);
        byte[] bArr8 = this.f43388a;
        int i8 = this.f43389b;
        this.f43389b = i8 + 1;
        return j7 | (255 & ((long) bArr8[i8]));
    }

    /* renamed from: l */
    public final int mo41234l() {
        byte[] bArr = this.f43388a;
        int i = this.f43389b;
        this.f43389b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f43388a;
        int i3 = this.f43389b;
        this.f43389b = i3 + 1;
        byte b = i2 | (bArr2[i3] & 255);
        this.f43389b += 2;
        return b;
    }

    /* renamed from: m */
    public final int mo41235m() {
        int j = mo41232j();
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: n */
    public final long mo41236n() {
        long k = mo41233k();
        if (k >= 0) {
            return k;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(k);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public final String mo41227e(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f43389b + i) - 1;
        String str = new String(this.f43388a, this.f43389b, (i2 >= this.f43390c || this.f43388a[i2] != 0) ? i : i - 1);
        this.f43389b += i;
        return str;
    }
}
