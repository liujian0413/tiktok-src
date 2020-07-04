package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public final class awb {

    /* renamed from: a */
    private final byte[] f41121a = new byte[256];

    /* renamed from: b */
    private int f41122b;

    /* renamed from: c */
    private int f41123c;

    public awb(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f41121a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            b = (b + this.f41121a[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = this.f41121a[i2];
            byte[] bArr2 = this.f41121a;
            bArr2[i2] = bArr2[b];
            this.f41121a[b] = b2;
        }
        this.f41122b = 0;
        this.f41123c = 0;
    }

    /* renamed from: a */
    public final void mo40079a(byte[] bArr) {
        int i = this.f41122b;
        int i2 = this.f41123c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & NormalGiftView.ALPHA_255;
            i2 = (i2 + this.f41121a[i]) & NormalGiftView.ALPHA_255;
            byte b = this.f41121a[i];
            byte[] bArr2 = this.f41121a;
            bArr2[i] = bArr2[i2];
            this.f41121a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f41121a[(this.f41121a[i] + this.f41121a[i2]) & NormalGiftView.ALPHA_255]);
        }
        this.f41122b = i;
        this.f41123c = i2;
    }
}
