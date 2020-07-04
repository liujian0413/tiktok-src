package com.google.android.gms.internal.ads;

final class awg {

    /* renamed from: a */
    private static final Class<?> f41126a = m47417a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f41127b = (m47417a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m47418a() {
        return f41126a != null && !f41127b;
    }

    /* renamed from: b */
    static Class<?> m47419b() {
        return f41126a;
    }

    /* renamed from: a */
    private static <T> Class<T> m47417a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
