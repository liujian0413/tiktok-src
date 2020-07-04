package com.google.android.gms.internal.ads;

public final class bkj {

    /* renamed from: a */
    public byte[] f42382a;

    /* renamed from: b */
    public int f42383b;

    /* renamed from: c */
    public int f42384c;

    public bkj() {
    }

    public bkj(int i) {
        this.f42382a = new byte[i];
        this.f42384c = this.f42382a.length;
    }

    public bkj(byte[] bArr) {
        this.f42382a = bArr;
        this.f42384c = bArr.length;
    }

    /* renamed from: a */
    public final void mo40810a(byte[] bArr, int i) {
        this.f42382a = bArr;
        this.f42384c = i;
        this.f42383b = 0;
    }

    /* renamed from: a */
    public final void mo40809a(int i) {
        bke.m49058a(i >= 0 && i <= this.f42384c);
        this.f42383b = i;
    }

    /* renamed from: b */
    public final void mo40813b(int i) {
        mo40809a(this.f42383b + i);
    }

    /* renamed from: a */
    public final void mo40811a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f42382a, this.f42383b, bArr, i, i2);
        this.f42383b += i2;
    }

    /* renamed from: a */
    public final int mo40808a() {
        byte[] bArr = this.f42382a;
        int i = this.f42383b;
        this.f42383b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: b */
    public final int mo40812b() {
        byte[] bArr = this.f42382a;
        int i = this.f42383b;
        this.f42383b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f42382a;
        int i3 = this.f42383b;
        this.f42383b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: c */
    public final long mo40814c() {
        byte[] bArr = this.f42382a;
        int i = this.f42383b;
        this.f42383b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.f42382a;
        int i2 = this.f42383b;
        this.f42383b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 16);
        byte[] bArr3 = this.f42382a;
        int i3 = this.f42383b;
        this.f42383b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 8);
        byte[] bArr4 = this.f42382a;
        int i4 = this.f42383b;
        this.f42383b = i4 + 1;
        return j3 | (255 & ((long) bArr4[i4]));
    }

    /* renamed from: d */
    public final int mo40815d() {
        byte[] bArr = this.f42382a;
        int i = this.f42383b;
        this.f42383b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f42382a;
        int i3 = this.f42383b;
        this.f42383b = i3 + 1;
        byte b = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.f42382a;
        int i4 = this.f42383b;
        this.f42383b = i4 + 1;
        byte b2 = b | ((bArr3[i4] & 255) << 8);
        byte[] bArr4 = this.f42382a;
        int i5 = this.f42383b;
        this.f42383b = i5 + 1;
        return b2 | (bArr4[i5] & 255);
    }

    /* renamed from: e */
    public final long mo40816e() {
        byte[] bArr = this.f42382a;
        int i = this.f42383b;
        this.f42383b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.f42382a;
        int i2 = this.f42383b;
        this.f42383b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 48);
        byte[] bArr3 = this.f42382a;
        int i3 = this.f42383b;
        this.f42383b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 40);
        byte[] bArr4 = this.f42382a;
        int i4 = this.f42383b;
        this.f42383b = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 32);
        byte[] bArr5 = this.f42382a;
        int i5 = this.f42383b;
        this.f42383b = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 24);
        byte[] bArr6 = this.f42382a;
        int i6 = this.f42383b;
        this.f42383b = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 16);
        byte[] bArr7 = this.f42382a;
        int i7 = this.f42383b;
        this.f42383b = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 8);
        byte[] bArr8 = this.f42382a;
        int i8 = this.f42383b;
        this.f42383b = i8 + 1;
        return j7 | (255 & ((long) bArr8[i8]));
    }

    /* renamed from: f */
    public final int mo40817f() {
        byte[] bArr = this.f42382a;
        int i = this.f42383b;
        this.f42383b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f42382a;
        int i3 = this.f42383b;
        this.f42383b = i3 + 1;
        byte b = i2 | (bArr2[i3] & 255);
        this.f42383b += 2;
        return b;
    }

    /* renamed from: g */
    public final int mo40818g() {
        int d = mo40815d();
        if (d >= 0) {
            return d;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: h */
    public final long mo40819h() {
        long e = mo40816e();
        if (e >= 0) {
            return e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }
}
