package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("net")
public final class HttpUtil {
    private static native boolean nativeIsAllowedHeader(String str, String str2);

    public static boolean isAllowedHeader(String str, String str2) {
        return nativeIsAllowedHeader(str, str2);
    }
}
