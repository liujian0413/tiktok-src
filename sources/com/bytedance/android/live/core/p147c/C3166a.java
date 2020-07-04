package com.bytedance.android.live.core.p147c;

import android.text.TextUtils;
import com.p280ss.p1783b.p1784a.C45771a;

/* renamed from: com.bytedance.android.live.core.c.a */
public final class C3166a {
    /* renamed from: b */
    public static void m11961b(String str, String str2) {
        m11959b(3, str, str2);
    }

    /* renamed from: c */
    public static void m11964c(String str, String str2) {
        m11959b(4, str, str2);
    }

    /* renamed from: d */
    public static void m11965d(String str, String str2) {
        m11959b(5, str, str2);
    }

    /* renamed from: e */
    public static void m11966e(String str, String str2) {
        m11959b(6, str, str2);
    }

    /* renamed from: a */
    public static void m11956a(String str, String str2) {
        m11959b(2, str, str2);
    }

    /* renamed from: b */
    public static void m11963b(String str, Throwable th) {
        m11960b(6, str, null, th);
    }

    /* renamed from: a */
    public static void m11958a(String str, Throwable th) {
        m11960b(5, str, null, th);
    }

    /* renamed from: a */
    public static void m11953a(int i, String str, String str2) {
        C45771a.m143701a(i, str, str2);
    }

    /* renamed from: a */
    public static void m11955a(int i, String str, StackTraceElement[] stackTraceElementArr) {
        C45771a.m143702a(i, str, stackTraceElementArr);
    }

    /* renamed from: b */
    public static void m11962b(String str, String str2, Throwable th) {
        m11960b(6, str, str2, th);
    }

    /* renamed from: a */
    public static void m11957a(String str, String str2, Throwable th) {
        m11960b(5, str, str2, th);
    }

    /* renamed from: b */
    private static void m11959b(int i, String str, String str2) {
        switch (i) {
            case 2:
                C45771a.m143704a(str, str2);
                return;
            case 3:
                C45771a.m143707b(str, str2);
                return;
            case 4:
                C45771a.m143710c(str, str2);
                return;
            case 5:
                C45771a.m143711d(str, str2);
                return;
            case 6:
                C45771a.m143712e(str, str2);
                break;
        }
    }

    /* renamed from: b */
    private static void m11960b(int i, String str, String str2, Throwable th) {
        m11954a(i, str, str2, th);
    }

    /* renamed from: a */
    private static void m11954a(int i, String str, String str2, Throwable th) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        switch (i) {
            case 5:
                if (isEmpty) {
                    C45771a.m143706a(str, th);
                    return;
                } else {
                    C45771a.m143705a(str, str2, th);
                    return;
                }
            case 6:
                if (!isEmpty) {
                    C45771a.m143708b(str, str2, th);
                    break;
                } else {
                    C45771a.m143709b(str, th);
                    return;
                }
        }
    }
}
