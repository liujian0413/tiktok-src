package com.google.android.gms.internal.ads;

import android.util.Log;

@C6505uv
public class afm {
    /* renamed from: b */
    public static void m45777b(String str) {
        m45776a(3);
    }

    /* renamed from: a */
    public static void m45775a(String str, Throwable th) {
        m45776a(3);
    }

    /* renamed from: c */
    public static void m45779c(String str) {
        m45776a(6);
    }

    /* renamed from: b */
    public static void m45778b(String str, Throwable th) {
        m45776a(6);
    }

    /* renamed from: d */
    public static void m45781d(String str) {
        m45776a(4);
    }

    /* renamed from: e */
    public static void m45783e(String str) {
        m45776a(5);
    }

    /* renamed from: c */
    public static void m45780c(String str, Throwable th) {
        m45776a(5);
    }

    /* renamed from: a */
    private static String m45774a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: d */
    public static void m45782d(String str, Throwable th) {
        if (m45776a(5)) {
            if (th != null) {
                m45780c(m45774a(str), th);
                return;
            }
            m45783e(m45774a(str));
        }
    }

    /* renamed from: f */
    public static void m45784f(String str) {
        m45782d(str, null);
    }

    /* renamed from: a */
    public static boolean m45776a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
