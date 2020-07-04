package com.p280ss.android.usergrowth;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;

/* renamed from: com.ss.android.usergrowth.c */
public final class C7304c {

    /* renamed from: a */
    private static volatile String f20387a = "snssdk143";

    /* renamed from: b */
    private static String f20388b;

    /* renamed from: a */
    private static String m22877a(Context context) {
        if (f20388b != null) {
            return f20388b;
        }
        return m22881b(context.getPackageCodePath());
    }

    /* renamed from: a */
    public static void m22879a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f20387a = str;
        }
    }

    /* renamed from: b */
    private static synchronized String m22881b(String str) {
        String str2;
        synchronized (C7304c.class) {
            if (f20388b != null) {
                String str3 = f20388b;
                return str3;
            }
            try {
                str2 = C45166a.m142381a(str);
            } catch (IOException unused) {
                str2 = null;
            }
            if (str2 != null) {
                if (str2.startsWith("growth") || str2.startsWith(f20387a)) {
                    Uri parse = Uri.parse(str2);
                    if ("growth".equals(parse.getScheme())) {
                        f20388b = parse.getQuery();
                    } else if (f20387a.equals(parse.getScheme())) {
                        f20388b = parse.getQuery();
                    }
                }
            }
            if (f20388b == null) {
                f20388b = "";
            }
            String str4 = f20388b;
            return str4;
        }
    }

    /* renamed from: a */
    public static String m22878a(Context context, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (m22880a(context, sb)) {
            return sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m22880a(Context context, StringBuilder sb) {
        String str;
        if (sb.indexOf("#") > 0) {
            return false;
        }
        String a = m22877a(context);
        if (a.length() == 0) {
            return false;
        }
        if (sb.indexOf("?") > 0) {
            str = "&";
        } else {
            str = "?";
        }
        sb.append(str);
        sb.append(a);
        return true;
    }
}
