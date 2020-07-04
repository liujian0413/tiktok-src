package com.bef.effectsdk.gamesdk;

import java.util.Arrays;
import java.util.List;

public class NativeInterface {

    /* renamed from: a */
    private static final List<String> f6981a = Arrays.asList(new String[]{"effect"});

    interface NativeMessageListener {
    }

    private static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native void nativeCreateHandle(long[] jArr);

    private static native int nativeDestroy(long j);

    private static native int nativeInit(long j, int i, int i2);

    private static native int nativePause(long j);

    private static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    private static native int nativeProcess(long j, int i, int i2, double d);

    private static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeResume(long j);

    private static native int nativeSetSize(long j, int i, int i2);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesMove(long j, int[] iArr, float[] fArr, float[] fArr2);

    static {
        try {
            for (String a : f6981a) {
                C1943a.m8927a(a);
            }
        } catch (Throwable unused) {
        }
    }
}
