package com.p280ss.android.ugc.aweme.framework.p1276e;

import com.C1642a;

/* renamed from: com.ss.android.ugc.aweme.framework.e.e */
public final class C29965e {
    /* renamed from: a */
    public static <T> T m98246a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static void m98248a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static <T> T m98247a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C1642a.m8034a(str, objArr));
    }

    /* renamed from: a */
    public static void m98249a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C1642a.m8034a(str, objArr));
        }
    }
}
