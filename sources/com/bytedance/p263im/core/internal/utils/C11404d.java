package com.bytedance.p263im.core.internal.utils;

import com.bytedance.p263im.core.p586b.C11209d;

/* renamed from: com.bytedance.im.core.internal.utils.d */
public final class C11404d {

    /* renamed from: a */
    static int f30888a = 2;

    /* renamed from: a */
    public static boolean m33586a() {
        if (f30888a <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m33581a(int i) {
        f30888a = i;
    }

    /* renamed from: a */
    public static void m33582a(String str) {
        m33583a("imsdk", str);
    }

    /* renamed from: b */
    public static void m33587b(String str) {
        m33588b("imsdk", str);
    }

    /* renamed from: c */
    public static void m33589c(String str) {
        m33592d("imsdk", str);
    }

    /* renamed from: d */
    public static void m33591d(String str) {
        m33590c("imsdk", str);
    }

    /* renamed from: e */
    private static void m33593e(String str, String str2) {
        C11209d.m32827a(str, str2, (Throwable) null);
    }

    /* renamed from: a */
    public static void m33583a(String str, String str2) {
        if (str2 != null) {
            m33593e(str, str2);
        }
    }

    /* renamed from: b */
    public static void m33588b(String str, String str2) {
        if (str2 != null) {
            m33593e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m33590c(String str, String str2) {
        if (str2 != null) {
            m33593e(str, str2);
        }
    }

    /* renamed from: d */
    private static void m33592d(String str, String str2) {
        if (str2 != null) {
            m33593e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m33585a(String str, Throwable th) {
        if (str != null || th != null) {
            m33584a("", str, th);
        }
    }

    /* renamed from: a */
    private static void m33584a(String str, String str2, Throwable th) {
        C11209d.m32827a(str, str2, th);
    }
}
