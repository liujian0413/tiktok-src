package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaExtractor;

public final class bgf {

    /* renamed from: a */
    public byte[] f41877a;

    /* renamed from: b */
    public int[] f41878b;

    /* renamed from: c */
    public int[] f41879c;

    /* renamed from: d */
    public final CryptoInfo f41880d;

    /* renamed from: e */
    private byte[] f41881e;

    /* renamed from: f */
    private int f41882f;

    /* renamed from: g */
    private int f41883g;

    public bgf() {
        this.f41880d = bkn.f42386a >= 16 ? new CryptoInfo() : null;
    }

    /* renamed from: a */
    public final void mo40603a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f41883g = i;
        this.f41878b = iArr;
        this.f41879c = iArr2;
        this.f41881e = bArr;
        this.f41877a = bArr2;
        this.f41882f = 1;
        if (bkn.f42386a >= 16) {
            this.f41880d.set(this.f41883g, this.f41878b, this.f41879c, this.f41881e, this.f41877a, this.f41882f);
        }
    }

    /* renamed from: a */
    public final void mo40604a(MediaExtractor mediaExtractor) {
        mediaExtractor.getSampleCryptoInfo(this.f41880d);
        this.f41883g = this.f41880d.numSubSamples;
        this.f41878b = this.f41880d.numBytesOfClearData;
        this.f41879c = this.f41880d.numBytesOfEncryptedData;
        this.f41881e = this.f41880d.key;
        this.f41877a = this.f41880d.iv;
        this.f41882f = this.f41880d.mode;
    }
}
