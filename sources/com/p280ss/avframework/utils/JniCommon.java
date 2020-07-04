package com.p280ss.avframework.utils;

import java.nio.ByteBuffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.utils.JniCommon */
public class JniCommon {
    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
