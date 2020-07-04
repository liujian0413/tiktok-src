package com.facebook.yoga;

/* renamed from: com.facebook.yoga.b */
public final class C14645b {
    /* renamed from: a */
    public static long m42352a(int i, int i2) {
        return m42351a((float) i, (float) i2);
    }

    /* renamed from: a */
    public static long m42351a(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return ((long) Float.floatToRawIntBits(f2)) | (((long) floatToRawIntBits) << 32);
    }
}
