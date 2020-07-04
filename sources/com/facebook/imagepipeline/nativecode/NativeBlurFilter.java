package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.C13307g;

public class NativeBlurFilter {
    static {
        C13836b.m40860a();
    }

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        boolean z;
        C13307g.m38940a(bitmap);
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i2 > 0) {
            z2 = true;
        }
        C13307g.m38943a(z2);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }
}
