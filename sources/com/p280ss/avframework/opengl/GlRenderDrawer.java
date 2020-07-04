package com.p280ss.avframework.opengl;

import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.opengl.GlRenderDrawer */
public class GlRenderDrawer {
    private long mNativeObj = nativeCreateRender();

    private native long nativeCreateRender();

    private native boolean nativeDrawOes(long j, int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5);

    private native boolean nativeDrawRectangle(long j, int i, int i2, int i3, int i4);

    private native boolean nativeDrawRgb(long j, int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5);

    private native boolean nativeDrawYuv(long j, int[] iArr, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4);

    private native void nativeRelease(long j);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        release();
    }

    public void release() {
        long j = this.mNativeObj;
        if (j != 0) {
            nativeRelease(j);
        }
        this.mNativeObj = 0;
    }

    public boolean drawRectangle(int i, int i2, int i3, int i4) {
        return nativeDrawRectangle(this.mNativeObj, i, i2, i3, i4);
    }

    public boolean drawOes(int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5) {
        return nativeDrawOes(this.mNativeObj, i, fArr, fArr2, i2, i3, i4, i5);
    }

    public boolean drawRgb(int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5) {
        return nativeDrawRgb(this.mNativeObj, i, fArr, fArr2, i2, i3, i4, i5);
    }

    public boolean drawYuv(int[] iArr, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4) {
        return nativeDrawYuv(this.mNativeObj, iArr, fArr, fArr2, i, i2, i3, i4);
    }
}
