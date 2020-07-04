package com.bytedance.crash.p504l;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.bytedance.crash.l.q */
public final class C9997q {

    /* renamed from: a */
    private static final CharSequence f27234a = "sony";

    /* renamed from: b */
    private static final CharSequence f27235b = "amigo";

    /* renamed from: c */
    private static final CharSequence f27236c = "funtouch";

    /* renamed from: i */
    private static boolean m29636i() {
        if (!TextUtils.isEmpty(C9998r.m29642a("ro.letv.release.version"))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m29629b() {
        StringBuilder sb = new StringBuilder();
        sb.append(C9998r.m29642a("ro.build.uiversion"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: e */
    private static boolean m29632e() {
        String a = C9998r.m29642a("ro.vivo.os.build.display.id");
        if (TextUtils.isEmpty(a) || !a.toLowerCase(Locale.getDefault()).contains(f27236c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m29633f() {
        if (TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f27235b)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static String m29634g() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.DISPLAY);
        sb.append("_");
        sb.append(C9998r.m29642a("ro.gn.sv.version"));
        return sb.toString();
    }

    /* renamed from: l */
    private static String m29639l() {
        String str = Build.DISPLAY;
        if (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    private static boolean m29640m() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m29630c() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(Build.BRAND);
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return false;
        }
        String lowerCase = sb2.toLowerCase(Locale.getDefault());
        if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m29631d() {
        StringBuilder sb = new StringBuilder();
        sb.append(C9998r.m29642a("ro.vivo.os.build.display.id"));
        sb.append("_");
        sb.append(C9998r.m29642a("ro.vivo.product.version"));
        return sb.toString();
    }

    /* renamed from: h */
    private static String m29635h() {
        if (!m29636i()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("eui_");
        sb.append(C9998r.m29642a("ro.letv.release.version"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: j */
    private static String m29637j() {
        if (!C9978d.m29525b()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("miui_");
        sb.append(C9998r.m29642a("ro.miui.ui.version.name"));
        sb.append("_");
        sb.append(VERSION.INCREMENTAL);
        return sb.toString();
    }

    /* renamed from: k */
    private static String m29638k() {
        String a = C9978d.m29522a();
        if (a == null || !a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: n */
    private static String m29641n() {
        if (!m29640m()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("coloros_");
        sb.append(C9998r.m29642a("ro.build.version.opporom"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m29628a() {
        if (C9978d.m29525b()) {
            return m29637j();
        }
        if (C9978d.m29527c()) {
            return m29639l();
        }
        if (m29640m()) {
            return m29641n();
        }
        String k = m29638k();
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        if (m29632e()) {
            return m29631d();
        }
        if (m29633f()) {
            return m29634g();
        }
        if (m29630c()) {
            return m29629b();
        }
        String h = m29635h();
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        return Build.DISPLAY;
    }
}
