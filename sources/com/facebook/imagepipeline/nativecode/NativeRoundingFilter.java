package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.C13307g;

public class NativeRoundingFilter {
    static {
        C13836b.m40860a();
    }

    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    public static void toCircle(Bitmap bitmap) {
        toCircle(bitmap, false);
    }

    public static void toCircle(Bitmap bitmap, boolean z) {
        C13307g.m38940a(bitmap);
        nativeToCircleFilter(bitmap, z);
    }

    public static void toCircleWithBorder(Bitmap bitmap, int i, int i2, boolean z) {
        C13307g.m38940a(bitmap);
        nativeToCircleWithBorderFilter(bitmap, i, i2, z);
    }
}
