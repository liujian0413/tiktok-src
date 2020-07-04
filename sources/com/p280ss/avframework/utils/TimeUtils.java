package com.p280ss.avframework.utils;

import com.p280ss.avframework.engine.MediaEngineFactory;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.utils.TimeUtils */
public class TimeUtils {
    static {
        MediaEngineFactory.getVersion();
    }

    private static native long nativeNanoTime();

    private static native long nativeTimeUTCMicros();

    public static long nanoTime() {
        return nativeNanoTime();
    }

    public static long timeUTCMicros() {
        return nativeTimeUTCMicros();
    }
}
