package com.ttnet.org.chromium.base.metrics;

import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public final class StatisticsRecorderAndroid {
    private StatisticsRecorderAndroid() {
    }

    private static native String nativeToJson(int i);

    public static String toJson(int i) {
        return nativeToJson(i);
    }
}
