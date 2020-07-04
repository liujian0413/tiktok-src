package com.p280ss.avframework.utils;

import com.p280ss.avframework.engine.MediaEngineFactory;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.utils.UnitTest */
public class UnitTest {
    public static void init() {
        MediaEngineFactory.getVersion();
    }

    private static native int nativeUnitTest(String str, TEBundle tEBundle);

    public static void run(String str, TEBundle tEBundle) {
    }
}
