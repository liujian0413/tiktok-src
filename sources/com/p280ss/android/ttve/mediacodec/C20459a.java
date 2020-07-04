package com.p280ss.android.ttve.mediacodec;

import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;

/* renamed from: com.ss.android.ttve.mediacodec.a */
final class C20459a {
    /* renamed from: a */
    static CodecProfileLevel m67886a(CodecCapabilities codecCapabilities, int i) {
        CodecProfileLevel[] codecProfileLevelArr;
        CodecProfileLevel codecProfileLevel = null;
        for (CodecProfileLevel codecProfileLevel2 : codecCapabilities.profileLevels) {
            if (codecProfileLevel2.profile == i) {
                return codecProfileLevel2;
            }
            if (codecProfileLevel == null || codecProfileLevel.profile < codecProfileLevel2.profile) {
                codecProfileLevel = codecProfileLevel2;
            }
        }
        return codecProfileLevel;
    }
}
