package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;

final class bmu {

    /* renamed from: a */
    private final CryptoInfo f42703a;

    /* renamed from: b */
    private final Pattern f42704b;

    private bmu(CryptoInfo cryptoInfo) {
        this.f42703a = cryptoInfo;
        this.f42704b = new Pattern(0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m49400a(int i, int i2) {
        this.f42704b.set(0, 0);
        this.f42703a.setPattern(this.f42704b);
    }
}
