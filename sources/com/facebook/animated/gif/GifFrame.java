package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.C13542e;

public class GifFrame implements C13542e {
    private long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetTransparentPixelColor();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    /* renamed from: a */
    public final void mo32251a() {
        nativeDispose();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    /* renamed from: b */
    public final int mo32253b() {
        return nativeGetWidth();
    }

    /* renamed from: c */
    public final int mo32254c() {
        return nativeGetHeight();
    }

    /* renamed from: d */
    public final int mo32255d() {
        return nativeGetXOffset();
    }

    /* renamed from: e */
    public final int mo32256e() {
        return nativeGetYOffset();
    }

    /* renamed from: f */
    public final int mo32257f() {
        return nativeGetDisposalMode();
    }

    GifFrame(long j) {
        this.mNativeContext = j;
    }

    /* renamed from: a */
    public final void mo32252a(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
