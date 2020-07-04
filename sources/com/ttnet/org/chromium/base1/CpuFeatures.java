package com.ttnet.org.chromium.base1;

import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public abstract class CpuFeatures {
    private static native int nativeGetCoreCount();

    private static native long nativeGetCpuFeatures();

    public static int getCount() {
        return nativeGetCoreCount();
    }

    public static long getMask() {
        return nativeGetCpuFeatures();
    }
}
