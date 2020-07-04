package com.p280ss.android.vesdk;

import com.p280ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: com.ss.android.vesdk.x */
public final class C45380x {

    /* renamed from: a */
    private long f116895a;

    /* renamed from: b */
    private final int f116896b;

    /* renamed from: c */
    private final int f116897c;

    C45380x(int i, int i2, int i3, float f, int i4) {
        this.f116895a = TEVideoUtils.createRTAudioWaveformMgr(i2, i3, f, i4);
        this.f116896b = i2;
        this.f116897c = i;
    }
}
