package com.facebook.imagepipeline.animated.p714c;

/* renamed from: com.facebook.imagepipeline.animated.c.a */
public final class C13545a {
    /* renamed from: b */
    public static int m39859b(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* renamed from: a */
    public static void m39858a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] < 11) {
                iArr[i] = 100;
            }
        }
    }

    /* renamed from: c */
    public static int[] m39860c(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = i;
            i += iArr[i2];
        }
        return iArr2;
    }
}
