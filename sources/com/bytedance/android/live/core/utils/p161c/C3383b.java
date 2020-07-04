package com.bytedance.android.live.core.utils.p161c;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.C3362ag;
import com.bytedance.common.utility.reflect.C6320a;
import p040b.p041a.p042a.p043a.p044a.C1579a;

/* renamed from: com.bytedance.android.live.core.utils.c.b */
public final class C3383b extends C1579a {

    /* renamed from: d */
    private static String f10183d;

    /* renamed from: e */
    private static String f10184e;

    /* renamed from: f */
    private static boolean f10185f;

    /* renamed from: b */
    public static boolean m12586b() {
        return f10185f;
    }

    static {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        f10185f = z;
    }

    /* renamed from: a */
    public static String m12583a() {
        if (f10183d == null) {
            m12584a("");
        }
        return f10183d;
    }

    /* renamed from: c */
    public static int m12587c() {
        try {
            if (m7679d()) {
                return Integer.parseInt(m12588c("ro.miui.ui.version.name").trim().substring(1));
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    /* renamed from: b */
    private static String m12585b(String str) {
        return C3362ag.m12539a(str);
    }

    /* renamed from: c */
    private static String m12588c(String str) {
        return (String) C6320a.m19601a("android.os.SystemProperties", "get", str, "");
    }

    /* renamed from: a */
    private static boolean m12584a(String str) {
        if (f10183d != null) {
            return f10183d.equals(str);
        }
        if (!TextUtils.isEmpty(m12585b("ro.miui.ui.version.name"))) {
            f10184e = m12585b("ro.miui.ui.version.name");
            f10183d = "MIUI";
        } else if (!TextUtils.isEmpty(m12585b("ro.build.version.emui"))) {
            f10184e = m12585b("ro.build.version.emui");
            f10183d = "EMUI";
        } else if (!TextUtils.isEmpty(m12585b("ro.build.version.opporom"))) {
            f10184e = m12585b("ro.build.version.opporom");
            f10183d = "OPPO";
        } else if (!TextUtils.isEmpty(m12585b("ro.vivo.os.version"))) {
            f10184e = m12585b("ro.vivo.os.version");
            f10183d = "VIVO";
        } else if (!TextUtils.isEmpty(m12585b("ro.smartisan.version"))) {
            f10184e = m12585b("ro.smartisan.version");
            f10183d = "SMARTISAN";
        } else {
            String str2 = Build.DISPLAY;
            f10184e = str2;
            if (str2.toUpperCase().contains("FLYME")) {
                f10183d = "FLYME";
            } else {
                f10184e = "unknown";
                f10183d = Build.MANUFACTURER.toUpperCase();
            }
        }
        return f10183d.equals(str);
    }
}
