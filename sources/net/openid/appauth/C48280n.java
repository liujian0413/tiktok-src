package net.openid.appauth;

import android.text.TextUtils;
import com.C1642a;

/* renamed from: net.openid.appauth.n */
public final class C48280n {
    /* renamed from: a */
    public static <T> T m149788a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static String m149793b(String str, Object obj) {
        if (str != null) {
            m149790a(str, obj);
        }
        return str;
    }

    /* renamed from: a */
    public static <T> T m149789a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m149790a(String str, Object obj) {
        m149789a((T) str, obj);
        m149791a(!TextUtils.isEmpty(str), obj);
        return str;
    }

    /* renamed from: a */
    public static void m149791a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m149792a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C1642a.m8034a(str, objArr));
        }
    }
}
