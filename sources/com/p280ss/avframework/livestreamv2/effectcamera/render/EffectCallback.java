package com.p280ss.avframework.livestreamv2.effectcamera.render;

import com.p280ss.avframework.effect.VideoEffectUtilsWrapper;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.EffectCallback */
public final class EffectCallback {
    private static final String TAG = "EffectCallback";
    private static Object sFinder;

    public static void setResourceFinder(Object obj) {
        sFinder = obj;
    }

    public static long getNativeFinder(long j) {
        if (j == 0 || sFinder == null) {
            return 0;
        }
        return VideoEffectUtilsWrapper.createNativeResourceFinder(sFinder, j);
    }

    public static void releaseNativeFinder(long j) {
        if (j != 0 && sFinder != null) {
            VideoEffectUtilsWrapper.releaseFinder(sFinder, j);
        }
    }
}
