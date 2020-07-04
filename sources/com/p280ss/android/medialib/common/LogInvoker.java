package com.p280ss.android.medialib.common;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.common.LogInvoker */
public class LogInvoker {
    static {
        TENativeLibsLoader.m67987d();
    }

    private static native void nativeSetLogLevel(int i);

    public static void setLogLevel(int i) {
        nativeSetLogLevel(i);
    }
}
