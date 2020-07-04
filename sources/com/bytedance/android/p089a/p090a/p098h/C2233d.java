package com.bytedance.android.p089a.p090a.p098h;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.a.a.h.d */
public final class C2233d {

    /* renamed from: a */
    private static Pattern f7487a;

    /* renamed from: c */
    public static boolean m9609c(String str) {
        if (!m9607a(str)) {
            return false;
        }
        return str.contains("%%");
    }

    /* renamed from: d */
    public static boolean m9610d(String str) {
        if (!m9607a(str)) {
            return false;
        }
        return str.contains(" ");
    }

    /* renamed from: e */
    public static boolean m9611e(String str) {
        if (!m9607a(str)) {
            return false;
        }
        return str.contains("×");
    }

    /* renamed from: a */
    public static boolean m9607a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m9608b(String str) {
        if (!m9607a(str)) {
            return false;
        }
        if (f7487a == null) {
            f7487a = Pattern.compile("%(?![A-Ea-e\\d]{2})");
        }
        return f7487a.matcher(str).find();
    }
}
