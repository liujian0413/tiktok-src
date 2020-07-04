package com.facebook.internal;

/* renamed from: com.facebook.internal.r */
public final class C13946r {

    /* renamed from: a */
    private static volatile String f36902a;

    /* renamed from: a */
    public static String m41123a() {
        return f36902a;
    }

    /* renamed from: b */
    public static boolean m41124b() {
        if (f36902a == null || !f36902a.startsWith("Unity.")) {
            return false;
        }
        return true;
    }
}
