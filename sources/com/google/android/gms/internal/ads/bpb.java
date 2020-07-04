package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class bpb implements bpa {
    private bpb() {
    }

    /* renamed from: b */
    public final boolean mo41076b() {
        return false;
    }

    /* renamed from: a */
    public final int mo41073a() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: a */
    public final MediaCodecInfo mo41074a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo41075a(String str, CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
