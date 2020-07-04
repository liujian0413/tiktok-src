package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Map;

class MediaCodecUtils {
    static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
    static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391876};
    static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC."};
    static final int[] TEXTURE_COLOR_FORMATS = getTextureColorFormats();

    private MediaCodecUtils() {
    }

    private static int[] getTextureColorFormats() {
        if (VERSION.SDK_INT < 18) {
            return new int[0];
        }
        return new int[]{2130708361};
    }

    static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        for (String equals : mediaCodecInfo.getSupportedTypes()) {
            if (videoCodecType.mimeType().equals(equals)) {
                return true;
            }
        }
        return false;
    }

    static Integer selectColorFormat(int[] iArr, CodecCapabilities codecCapabilities) {
        int[] iArr2;
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }

    static Map<String, String> getCodecProperties(VideoCodecType videoCodecType, boolean z) {
        switch (videoCodecType) {
            case VP8:
            case VP9:
                return new HashMap();
            case H264:
                return H264Utils.getDefaultH264Params(z);
            default:
                StringBuilder sb = new StringBuilder("Unsupported codec: ");
                sb.append(videoCodecType);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
