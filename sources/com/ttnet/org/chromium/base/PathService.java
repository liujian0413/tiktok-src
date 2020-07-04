package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public abstract class PathService {
    private PathService() {
    }

    private static native void nativeOverride(int i, String str);

    public static void override(int i, String str) {
        nativeOverride(i, str);
    }
}
