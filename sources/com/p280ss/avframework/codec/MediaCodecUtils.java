package com.p280ss.avframework.codec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Build.VERSION;
import com.p280ss.avframework.utils.AVLog;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.avframework.codec.MediaCodecUtils */
class MediaCodecUtils {
    static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
    static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391876};
    private static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList(new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"});
    static final int[] TEXTURE_COLOR_FORMATS = {2130708361};

    private MediaCodecUtils() {
    }

    public static MediaCodecInfo findCodecForType(String str) {
        MediaCodecInfo mediaCodecInfo;
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("Cannot retrieve encoder codec info");
                sb.append(e);
                AVLog.m143697e("MediaCodecUtils", sb.toString());
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, str)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    private static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        boolean z = false;
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        if ((name.startsWith("OMX.qcom.") && VERSION.SDK_INT >= 19) || ((name.startsWith("OMX.Exynos.") && VERSION.SDK_INT >= 21) || ((name.startsWith("OMX.MTK.") && VERSION.SDK_INT >= 18) || (name.startsWith("OMX.hisi.") && VERSION.SDK_INT >= 21)))) {
            z = true;
        }
        return z;
    }

    static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, String str) {
        for (String equals : mediaCodecInfo.getSupportedTypes()) {
            if (str.equals(equals)) {
                AVLog.m143696d("BUGGG", " find mime");
                return true;
            }
        }
        return false;
    }

    private static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, String str) {
        if (str.equalsIgnoreCase("video/avc")) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        if (str.equalsIgnoreCase("video/hevc")) {
            return true;
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

    static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, String str) {
        if (!codecSupportsType(mediaCodecInfo, str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mediaCodecInfo.getName());
        sb.append(" | ");
        sb.append(str);
        AVLog.m143696d("BUGGG", sb.toString());
        if (selectColorFormat(ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(str)) == null) {
            return false;
        }
        return isHardwareSupportedInCurrentSdk(mediaCodecInfo, str);
    }
}
