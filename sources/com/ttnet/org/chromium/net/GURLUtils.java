package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("net")
public final class GURLUtils {
    private static native String nativeGetOrigin(String str);

    private static native String nativeGetScheme(String str);

    public static String getOrigin(String str) {
        return nativeGetOrigin(str);
    }

    public static String getScheme(String str) {
        return nativeGetScheme(str);
    }
}
