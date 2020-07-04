package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fu */
final class C16539fu {

    /* renamed from: a */
    private static final Class<?> f46325a = m53894a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f46326b = (m53894a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m53895a() {
        return f46325a != null && !f46326b;
    }

    /* renamed from: b */
    static Class<?> m53896b() {
        return f46325a;
    }

    /* renamed from: a */
    private static <T> Class<T> m53894a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
