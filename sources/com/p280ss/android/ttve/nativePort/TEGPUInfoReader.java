package com.p280ss.android.ttve.nativePort;

/* renamed from: com.ss.android.ttve.nativePort.TEGPUInfoReader */
public class TEGPUInfoReader {
    static {
        TENativeLibsLoader.m67987d();
    }

    public static native String nativeGetGLVersion();

    public static native String nativeGetGPURenderer();
}
