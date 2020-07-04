package com.p280ss.android.medialib.NativePort;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.NativePort.NativeRenderWrapper */
public class NativeRenderWrapper {

    /* renamed from: a */
    private long f53076a;

    static {
        TENativeLibsLoader.m67988e();
    }

    private native long nativeCreate();

    private native void nativeDestroy(long j);

    private native float nativeGetFilterIntensity(long j, String str);

    private native int nativeInit(long j, int i, int i2, String str);

    private native int nativeProcessTexture(long j, int i, int i2, double d);

    private native int nativeSetDoubleFilterNew(long j, String str, String str2, float f, float f2, float f3);

    private native int nativeSetFilter(long j, String str, float f);

    private native int nativeSetFilter2(long j, String str, String str2, float f, float f2);

    private native int nativeSetFilterNew(long j, String str, float f);

    /* renamed from: b */
    public final boolean mo52173b() {
        if (this.f53076a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo52167a() {
        if (this.f53076a != 0) {
            nativeDestroy(this.f53076a);
            this.f53076a = 0;
        }
    }

    /* renamed from: a */
    public final float mo52166a(String str) {
        if (this.f53076a == 0) {
            return -1.0f;
        }
        return nativeGetFilterIntensity(this.f53076a, str);
    }

    /* renamed from: a */
    public final void mo52170a(String str, float f) {
        if (this.f53076a != 0) {
            nativeSetFilterNew(this.f53076a, str, f);
        }
    }

    /* renamed from: a */
    public final void mo52168a(int i, int i2) {
        if (this.f53076a != 0) {
            nativeProcessTexture(this.f53076a, i, i2, 0.0d);
        }
    }

    /* renamed from: a */
    public final void mo52169a(int i, int i2, String str) {
        if (this.f53076a == 0) {
            this.f53076a = nativeCreate();
            nativeInit(this.f53076a, i, i2, str);
        }
    }

    /* renamed from: a */
    public final void mo52171a(String str, String str2, float f, float f2) {
        if (this.f53076a != 0) {
            nativeSetFilter2(this.f53076a, str, str2, f, f2);
        }
    }

    /* renamed from: a */
    public final void mo52172a(String str, String str2, float f, float f2, float f3) {
        if (this.f53076a != 0) {
            nativeSetDoubleFilterNew(this.f53076a, str, str2, f, f2, f3);
        }
    }
}
