package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo;

public final class bmr {

    /* renamed from: a */
    public byte[] f42688a;

    /* renamed from: b */
    public int[] f42689b;

    /* renamed from: c */
    public int[] f42690c;

    /* renamed from: d */
    public final CryptoInfo f42691d;

    /* renamed from: e */
    private byte[] f42692e;

    /* renamed from: f */
    private int f42693f;

    /* renamed from: g */
    private int f42694g;

    /* renamed from: h */
    private int f42695h;

    /* renamed from: i */
    private int f42696i;

    /* renamed from: j */
    private final bmu f42697j;

    public bmr() {
        this.f42691d = bsf.f43399a >= 16 ? new CryptoInfo() : null;
        this.f42697j = bsf.f43399a >= 24 ? new bmu(this.f42691d) : null;
    }

    /* renamed from: a */
    public final void mo40988a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f42694g = i;
        this.f42689b = iArr;
        this.f42690c = iArr2;
        this.f42692e = bArr;
        this.f42688a = bArr2;
        this.f42693f = i2;
        this.f42695h = 0;
        this.f42696i = 0;
        if (bsf.f43399a >= 16) {
            this.f42691d.numSubSamples = this.f42694g;
            this.f42691d.numBytesOfClearData = this.f42689b;
            this.f42691d.numBytesOfEncryptedData = this.f42690c;
            this.f42691d.key = this.f42692e;
            this.f42691d.iv = this.f42688a;
            this.f42691d.mode = this.f42693f;
            if (bsf.f43399a >= 24) {
                this.f42697j.m49400a(0, 0);
            }
        }
    }
}
