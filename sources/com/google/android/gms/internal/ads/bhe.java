package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class bhe implements bhb {

    /* renamed from: a */
    private final int f41985a;

    /* renamed from: b */
    private MediaCodecInfo[] f41986b;

    public bhe(boolean z) {
        this.f41985a = z ? 1 : 0;
    }

    /* renamed from: b */
    public final boolean mo40687b() {
        return true;
    }

    /* renamed from: a */
    public final int mo40684a() {
        m48778c();
        return this.f41986b.length;
    }

    /* renamed from: a */
    public final MediaCodecInfo mo40685a(int i) {
        m48778c();
        return this.f41986b[i];
    }

    /* renamed from: a */
    public final boolean mo40686a(String str, CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: c */
    private final void m48778c() {
        if (this.f41986b == null) {
            this.f41986b = new MediaCodecList(this.f41985a).getCodecInfos();
        }
    }
}
