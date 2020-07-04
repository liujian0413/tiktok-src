package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.JNINamespace;

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
