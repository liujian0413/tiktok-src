package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public final class bsb {

    /* renamed from: a */
    private byte[] f43391a;

    /* renamed from: b */
    private int f43392b;

    /* renamed from: c */
    private int f43393c;

    /* renamed from: d */
    private int f43394d = 0;

    public bsb(byte[] bArr, int i, int i2) {
        this.f43391a = bArr;
        this.f43393c = i;
        this.f43392b = i2;
        m49916e();
    }

    /* renamed from: a */
    public final void mo41237a(int i) {
        int i2 = this.f43393c;
        this.f43393c += i / 8;
        this.f43394d += i % 8;
        if (this.f43394d > 7) {
            this.f43393c++;
            this.f43394d -= 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f43393c) {
                m49916e();
                return;
            } else if (m49914c(i2)) {
                this.f43393c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo41238a() {
        return mo41240b(1) == 1;
    }

    /* renamed from: b */
    public final int mo41240b(int i) {
        byte b;
        byte b2;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        byte b3 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = m49914c(this.f43393c + 1) ? this.f43393c + 2 : this.f43393c + 1;
            if (this.f43394d != 0) {
                b2 = ((this.f43391a[i4] & 255) >>> (8 - this.f43394d)) | ((this.f43391a[this.f43393c] & 255) << this.f43394d);
            } else {
                b2 = this.f43391a[this.f43393c];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f43393c = i4;
        }
        if (i > 0) {
            int i5 = this.f43394d + i;
            byte b4 = (byte) (NormalGiftView.ALPHA_255 >> (8 - i));
            int i6 = m49914c(this.f43393c + 1) ? this.f43393c + 2 : this.f43393c + 1;
            if (i5 > 8) {
                b = (b4 & (((255 & this.f43391a[i6]) >> (16 - i5)) | ((this.f43391a[this.f43393c] & 255) << (i5 - 8)))) | b3;
                this.f43393c = i6;
            } else {
                b = (b4 & ((255 & this.f43391a[this.f43393c]) >> (8 - i5))) | b3;
                if (i5 == 8) {
                    this.f43393c = i6;
                }
            }
            b3 = b;
            this.f43394d = i5 % 8;
        }
        m49916e();
        return b3;
    }

    /* renamed from: b */
    public final int mo41239b() {
        return m49915d();
    }

    /* renamed from: c */
    public final int mo41241c() {
        int d = m49915d();
        return (d % 2 == 0 ? -1 : 1) * ((d + 1) / 2);
    }

    /* renamed from: d */
    private final int m49915d() {
        int i = 0;
        int i2 = 0;
        while (!mo41238a()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo41240b(i2);
        }
        return i3 + i;
    }

    /* renamed from: c */
    private final boolean m49914c(int i) {
        return 2 <= i && i < this.f43392b && this.f43391a[i] == 3 && this.f43391a[i + -2] == 0 && this.f43391a[i - 1] == 0;
    }

    /* renamed from: e */
    private final void m49916e() {
        brr.m49873b(this.f43393c >= 0 && this.f43394d >= 0 && this.f43394d < 8 && (this.f43393c < this.f43392b || (this.f43393c == this.f43392b && this.f43394d == 0)));
    }
}
