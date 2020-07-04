package com.ttnet.org.chromium.base1.metrics;

import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public final class StatisticsRecorderAndroid {
    private StatisticsRecorderAndroid() {
    }

    private static native String nativeToJson();

    public static String toJson() {
        return nativeToJson();
    }
}
