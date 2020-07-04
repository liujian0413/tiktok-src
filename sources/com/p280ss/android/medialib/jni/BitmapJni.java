package com.p280ss.android.medialib.jni;

import android.graphics.Bitmap;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.jni.BitmapJni */
public class BitmapJni {
    static {
        TENativeLibsLoader.m67988e();
    }

    private static native int nativeCompressBitmap(Bitmap bitmap, String str, int i);

    public static int compressBitmap(Bitmap bitmap, String str, int i) {
        return nativeCompressBitmap(bitmap, str, i);
    }
}
