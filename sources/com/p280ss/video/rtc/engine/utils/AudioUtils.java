package com.p280ss.video.rtc.engine.utils;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.video.rtc.engine.utils.AudioUtils */
public class AudioUtils {
    private static Set<String> openSlESBlackSet = new HashSet<String>() {
        {
            add("SM-G9650");
            add("SM-G9750");
            add("SM-N9600");
        }
    };

    public static boolean isInOpenSLESBlackModelSet() {
        return openSlESBlackSet.contains(Build.MODEL);
    }
}
