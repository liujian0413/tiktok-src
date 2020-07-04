package com.p280ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import com.p280ss.android.medialib.camera.ImageFrame;

/* renamed from: com.ss.android.ttve.nativePort.TEImageUtils */
public class TEImageUtils {
    static {
        TENativeLibsLoader.m67986c();
    }

    public static native void compressToJPEG(Bitmap bitmap, int i, String str);

    public static native void compressToJPEG2(byte[] bArr, int i, int i2, int i3, String str);

    public static native ImageFrame decompressJPEG(String str, int i);
}
