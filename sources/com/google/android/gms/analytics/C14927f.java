package com.google.android.gms.analytics;

import com.google.android.gms.internal.measurement.C16415bh;

/* renamed from: com.google.android.gms.analytics.f */
public final class C14927f {
    /* renamed from: a */
    public static String m43352a(int i) {
        return m43353a("cd", i);
    }

    /* renamed from: b */
    public static String m43354b(int i) {
        return m43353a("cm", i);
    }

    /* renamed from: a */
    private static String m43353a(String str, int i) {
        if (i <= 0) {
            C16415bh.m53481a("index out of range for prefix", str);
            return "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m43355c(int i) {
        return m43353a("pr", i);
    }

    /* renamed from: d */
    public static String m43356d(int i) {
        return m43353a("promo", i);
    }

    /* renamed from: e */
    public static String m43357e(int i) {
        return m43353a("pi", i);
    }

    /* renamed from: f */
    public static String m43358f(int i) {
        return m43353a("il", i);
    }
}
