package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.C13542e;

public class WebPFrame implements C13542e {
    private long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

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
    public final boolean mo32273f() {
        return nativeShouldDisposeToBackgroundColor();
    }

    /* renamed from: g */
    public final boolean mo32275g() {
        return nativeIsBlendWithPreviousFrame();
    }

    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    /* renamed from: a */
    public final void mo32252a(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
