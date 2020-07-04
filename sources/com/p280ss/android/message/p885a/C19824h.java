package com.p280ss.android.message.p885a;

import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.util.C6776h;

/* renamed from: com.ss.android.message.a.h */
public class C19824h {

    /* renamed from: a */
    private static final String f53786a = String.valueOf(VERSION.SDK);

    /* renamed from: b */
    private static final C19825i f53787b = new C19825i();

    /* renamed from: c */
    private static String f53788c;

    /* renamed from: d */
    private static String f53789d;

    /* renamed from: a */
    public static String m65453a() {
        return f53788c;
    }

    /* renamed from: c */
    private static boolean m65456c() {
        String str = Build.MANUFACTURER;
        if (!C6319n.m19593a(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m65458e() {
        String a = m65454a("ro.vivo.os.build.display.id");
        if (C6319n.m19593a(a) || !a.toLowerCase().contains("funtouch")) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m65461h() {
        boolean z = false;
        try {
            String a = m65454a("ro.build.version.emui");
            f53789d = a;
            boolean a2 = C6319n.m19593a(a);
            if (!a2) {
                f53789d = f53789d.toLowerCase();
            }
            if (!a2) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        String str;
        f53788c = f53786a;
        try {
            str = m65455b();
        } catch (Throwable unused) {
            str = null;
        }
        if (C6319n.m19593a(str)) {
            str = f53786a;
        }
        f53788c = str;
    }

    /* renamed from: b */
    private static String m65455b() {
        if (m65461h()) {
            return m65462i();
        }
        if (m65458e()) {
            return m65459f();
        }
        if (m65456c()) {
            return m65457d();
        }
        if (C6776h.m20950c()) {
            return m65460g();
        }
        return f53786a;
    }

    /* renamed from: d */
    private static String m65457d() {
        if (!m65456c()) {
            return f53786a;
        }
        StringBuilder sb = new StringBuilder("coloros_");
        sb.append(m65454a("ro.build.version.opporom"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString().toLowerCase();
    }

    /* renamed from: f */
    private static String m65459f() {
        StringBuilder sb = new StringBuilder();
        sb.append(m65454a("ro.vivo.os.build.display.id"));
        sb.append("_");
        sb.append(m65454a("ro.vivo.product.version"));
        return sb.toString().toLowerCase();
    }

    /* renamed from: g */
    private static String m65460g() {
        StringBuilder sb = new StringBuilder("miui_");
        sb.append(m65454a("ro.miui.ui.version.name"));
        sb.append("_");
        sb.append(VERSION.INCREMENTAL);
        return sb.toString().toLowerCase();
    }

    /* renamed from: i */
    private static String m65462i() {
        if (C6319n.m19593a(f53789d)) {
            f53789d = m65454a("ro.build.version.emui");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f53789d);
        sb.append("_");
        sb.append(Build.DISPLAY);
        String lowerCase = sb.toString().toLowerCase();
        if (!C6319n.m19593a(lowerCase)) {
            return lowerCase.toLowerCase();
        }
        return f53786a;
    }

    /* renamed from: a */
    private static String m65454a(String str) {
        return f53787b.mo53171a(str);
    }
}
