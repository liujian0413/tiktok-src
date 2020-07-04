package com.facebook.imagepipeline.nativecode;

/* renamed from: com.facebook.imagepipeline.nativecode.f */
public final class C13840f {

    /* renamed from: a */
    public static boolean f36689a;

    /* renamed from: b */
    private static C13839e f36690b;

    /* renamed from: a */
    public static C13839e m40863a() {
        return f36690b;
    }

    static {
        try {
            f36690b = (C13839e) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f36689a = true;
        } catch (Throwable unused) {
            f36689a = false;
        }
    }
}
