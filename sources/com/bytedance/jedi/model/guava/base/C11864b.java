package com.bytedance.jedi.model.guava.base;

/* renamed from: com.bytedance.jedi.model.guava.base.b */
public final class C11864b {
    /* renamed from: a */
    public static <T> T m34655a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static void m34656a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m34659b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m34657a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m34658a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(C11865c.m34661a(str, Long.valueOf(j)));
        }
    }
}
