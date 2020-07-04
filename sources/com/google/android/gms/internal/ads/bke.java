package com.google.android.gms.internal.ads;

public final class bke {
    /* renamed from: a */
    public static void m49058a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m49059a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m49060b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static <T> T m49057a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }
}
