package org.webrtc;

import java.util.HashMap;
import java.util.Map;

class H264Utils {
    public static VideoCodecInfo DEFAULT_H264_BASELINE_PROFILE_CODEC = new VideoCodecInfo("H264", getDefaultH264Params(false));
    public static VideoCodecInfo DEFAULT_H264_HIGH_PROFILE_CODEC = new VideoCodecInfo("H264", getDefaultH264Params(true));

    H264Utils() {
    }

    private static native boolean nativeIsSameH264Profile(Map<String, String> map, Map<String, String> map2);

    public static Map<String, String> getDefaultH264Params(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("level-asymmetry-allowed", "1");
        hashMap.put("packetization-mode", "1");
        String str2 = "profile-level-id";
        if (z) {
            str = "640c1f";
        } else {
            str = "42e01f";
        }
        hashMap.put(str2, str);
        return hashMap;
    }

    public static boolean isSameH264Profile(Map<String, String> map, Map<String, String> map2) {
        return nativeIsSameH264Profile(map, map2);
    }
}
