package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class bhd implements bhb {
    private bhd() {
    }

    /* renamed from: b */
    public final boolean mo40687b() {
        return false;
    }

    /* renamed from: a */
    public final int mo40684a() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: a */
    public final MediaCodecInfo mo40685a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo40686a(String str, CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
