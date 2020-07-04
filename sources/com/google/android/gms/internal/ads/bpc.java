package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class bpc implements bpa {

    /* renamed from: a */
    private final int f43118a;

    /* renamed from: b */
    private MediaCodecInfo[] f43119b;

    public bpc(boolean z) {
        this.f43118a = z ? 1 : 0;
    }

    /* renamed from: b */
    public final boolean mo41076b() {
        return true;
    }

    /* renamed from: a */
    public final int mo41073a() {
        m49625c();
        return this.f43119b.length;
    }

    /* renamed from: a */
    public final MediaCodecInfo mo41074a(int i) {
        m49625c();
        return this.f43119b[i];
    }

    /* renamed from: a */
    public final boolean mo41075a(String str, CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: c */
    private final void m49625c() {
        if (this.f43119b == null) {
            this.f43119b = new MediaCodecList(this.f43118a).getCodecInfos();
        }
    }
}
