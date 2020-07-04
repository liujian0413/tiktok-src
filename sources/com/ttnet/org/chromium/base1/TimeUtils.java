package com.ttnet.org.chromium.base1;

import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public class TimeUtils {
    private TimeUtils() {
    }

    public static native long nativeGetTimeTicksNowUs();
}
