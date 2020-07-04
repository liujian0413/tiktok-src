package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.C1642a;
import com.google.android.gms.common.util.C15342y;

/* renamed from: com.google.android.gms.common.internal.r */
public final class C15267r {
    /* renamed from: a */
    public static <T> T m44384a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: a */
    public static String m44386a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: a */
    public static String m44387a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static <T> T m44385a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m44383a(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: a */
    public static void m44390a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m44391a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m44392a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(C1642a.m8034a(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m44395b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m44396b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C1642a.m8034a(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m44394b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m44393b(String str) {
        if (!C15342y.m44630a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m44388a() {
        m44397c("Must not be called on the main application thread");
    }

    /* renamed from: c */
    public static void m44397c(String str) {
        if (C15342y.m44630a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m44389a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }
}
