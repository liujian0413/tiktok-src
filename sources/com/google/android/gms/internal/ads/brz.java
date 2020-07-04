package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public final class brz {

    /* renamed from: a */
    private byte[] f43384a;

    /* renamed from: b */
    private int f43385b;

    /* renamed from: c */
    private int f43386c;

    /* renamed from: d */
    private int f43387d;

    public brz() {
    }

    public brz(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private brz(byte[] bArr, int i) {
        this.f43384a = bArr;
        this.f43387d = i;
    }

    /* renamed from: a */
    public final int mo41215a(int i) {
        byte b;
        byte b2;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        int i3 = i;
        byte b3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (this.f43386c != 0) {
                b2 = ((this.f43384a[this.f43385b + 1] & 255) >>> (8 - this.f43386c)) | ((this.f43384a[this.f43385b] & 255) << this.f43386c);
            } else {
                b2 = this.f43384a[this.f43385b];
            }
            i3 -= 8;
            b3 |= (255 & b2) << i3;
            this.f43385b++;
        }
        if (i3 > 0) {
            int i5 = this.f43386c + i3;
            byte b4 = (byte) (NormalGiftView.ALPHA_255 >> (8 - i3));
            if (i5 > 8) {
                b = (b4 & (((this.f43384a[this.f43385b] & 255) << (i5 - 8)) | ((255 & this.f43384a[this.f43385b + 1]) >> (16 - i5)))) | b3;
                this.f43385b++;
            } else {
                b = (b4 & ((this.f43384a[this.f43385b] & 255) >> (8 - i5))) | b3;
                if (i5 == 8) {
                    this.f43385b++;
                }
            }
            b3 = b;
            this.f43386c = i5 % 8;
        }
        if (this.f43385b >= 0 && this.f43386c >= 0 && this.f43386c < 8 && (this.f43385b < this.f43387d || (this.f43385b == this.f43387d && this.f43386c == 0))) {
            z = true;
        }
        brr.m49873b(z);
        return b3;
    }
}
