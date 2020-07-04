package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.FilterWrapper */
public class FilterWrapper {

    /* renamed from: a */
    public boolean f116068a;

    /* renamed from: b */
    public Long f116069b = new Long(0);

    /* renamed from: c */
    public int f116070c = 1;

    /* renamed from: d */
    private long f116071d;

    /* renamed from: e */
    private boolean f116072e;

    private native int nativeComposerSetNodes(long j, String[] strArr, int i);

    private native int nativeComposerUpdateNode(long j, String str, String str2, float f);

    private native void nativeConfigEffect(long j, int i, int i2, String str, String str2, boolean z);

    private native long nativeFilterCreate();

    private native int nativeFilterProcess(long j, int i, int i2, int i3, int i4, long j2, Long l, boolean z, int i5);

    private native void nativeFilterRelease(long j);

    public static native String nativeGetVersion();

    private native String nativeName(long j);

    private native int nativeSetBeautify(long j, String str, float f, float f2);

    private native int nativeSetBeautifyWithSharp(long j, String str, float f, float f2, float f3);

    private native void nativeSetEffect(long j, String str, float f);

    private native void nativeSetFaceAttribute(long j, boolean z);

    private native int nativeSetFilter(long j, String str, float f);

    private native int nativeSetFilter(long j, String str, String str2, float f);

    private native int nativeSetParameter(long j, String str, Object obj);

    private native int nativeSetReshape(long j, String str, float f, float f2);

    /* renamed from: b */
    private static String m142400b() {
        return nativeGetVersion();
    }

    public FilterWrapper() {
        if (m142399a()) {
            this.f116071d = nativeFilterCreate();
        }
        this.f116072e = true;
    }

    /* renamed from: a */
    private boolean m142399a() {
        try {
            this.f116068a = "com.bytedance:effectsdk:6.0.0_rel_15_douyin_MT_202001141700_1611d1aa7c".contains(m142400b());
        } catch (Throwable unused) {
            this.f116068a = false;
        }
        return this.f116068a;
    }
}
