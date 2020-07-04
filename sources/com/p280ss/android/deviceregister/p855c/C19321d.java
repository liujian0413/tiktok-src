package com.p280ss.android.deviceregister.p855c;

import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.util.C6776h;

/* renamed from: com.ss.android.deviceregister.c.d */
public final class C19321d {

    /* renamed from: a */
    private static final CharSequence f52227a = "sony";

    /* renamed from: b */
    private static final CharSequence f52228b = "amigo";

    /* renamed from: c */
    private static final CharSequence f52229c = "funtouch";

    /* renamed from: i */
    private static boolean m63380i() {
        if (!C6319n.m19593a(C19322e.m63386a("ro.letv.release.version"))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m63373b() {
        StringBuilder sb = new StringBuilder();
        sb.append(C19322e.m63386a("ro.build.uiversion"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: e */
    private static boolean m63376e() {
        String a = C19322e.m63386a("ro.vivo.os.build.display.id");
        if (C6319n.m19593a(a) || !a.toLowerCase().contains(f52229c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m63377f() {
        if (C6319n.m19593a(Build.DISPLAY) || !Build.DISPLAY.toLowerCase().contains(f52228b)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static String m63378g() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.DISPLAY);
        sb.append("_");
        sb.append(C19322e.m63386a("ro.gn.sv.version"));
        return sb.toString();
    }

    /* renamed from: l */
    private static String m63383l() {
        String str = Build.DISPLAY;
        if (str == null || !str.toLowerCase().contains("flyme")) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    private static boolean m63384m() {
        String str = Build.MANUFACTURER;
        if (!C6319n.m19593a(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m63374c() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(Build.BRAND);
        String sb2 = sb.toString();
        if (C6319n.m19593a(sb2)) {
            return false;
        }
        String lowerCase = sb2.toLowerCase();
        if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m63375d() {
        StringBuilder sb = new StringBuilder();
        sb.append(C19322e.m63386a("ro.vivo.os.build.display.id"));
        sb.append("_");
        sb.append(C19322e.m63386a("ro.vivo.product.version"));
        return sb.toString();
    }

    /* renamed from: h */
    private static String m63379h() {
        if (!m63380i()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("eui_");
        sb.append(C19322e.m63386a("ro.letv.release.version"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: j */
    private static String m63381j() {
        if (!C6776h.m20950c()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("miui_");
        sb.append(C19322e.m63386a("ro.miui.ui.version.name"));
        sb.append("_");
        sb.append(VERSION.INCREMENTAL);
        return sb.toString();
    }

    /* renamed from: k */
    private static String m63382k() {
        String b = C6776h.m20946b();
        if (b == null || !b.toLowerCase().contains("emotionui")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: n */
    private static String m63385n() {
        if (!m63384m()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("coloros_");
        sb.append(C19322e.m63386a("ro.build.version.opporom"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m63372a() {
        if (C6776h.m20950c()) {
            return m63381j();
        }
        if (C6776h.m20953d()) {
            return m63383l();
        }
        if (m63384m()) {
            return m63385n();
        }
        String k = m63382k();
        if (!C6319n.m19593a(k)) {
            return k;
        }
        if (m63376e()) {
            return m63375d();
        }
        if (m63377f()) {
            return m63378g();
        }
        if (m63374c()) {
            return m63373b();
        }
        String h = m63379h();
        if (!C6319n.m19593a(h)) {
            return h;
        }
        return Build.DISPLAY;
    }
}
