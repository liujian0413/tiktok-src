package com.p280ss.android.ugc.aweme.optimize;

import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.optimize.a */
public final class C34707a {

    /* renamed from: a */
    private static Boolean f90499a;

    /* renamed from: b */
    private static Boolean f90500b;

    /* renamed from: c */
    private static Boolean f90501c;

    /* renamed from: d */
    private static Keva m112027d() {
        return Keva.getRepo("optimize_config", 0);
    }

    /* renamed from: b */
    public static boolean m112024b() {
        if (f90500b == null) {
            f90500b = Boolean.valueOf(m112022a("fps_open"));
        }
        return f90500b.booleanValue();
    }

    /* renamed from: c */
    public static boolean m112026c() {
        if (f90501c == null) {
            f90501c = Boolean.valueOf(m112022a("draw_checker"));
        }
        return f90501c.booleanValue();
    }

    /* renamed from: a */
    public static boolean m112021a() {
        if (f90499a == null) {
            f90499a = Boolean.valueOf(m112022a("log_open"));
        }
        return f90499a.booleanValue();
    }

    /* renamed from: b */
    public static void m112023b(boolean z) {
        f90500b = Boolean.valueOf(z);
        m112019a("fps_open", Boolean.valueOf(z));
    }

    /* renamed from: c */
    public static void m112025c(boolean z) {
        f90501c = Boolean.valueOf(z);
        m112019a("draw_checker", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static void m112020a(boolean z) {
        f90499a = Boolean.valueOf(z);
        m112019a("log_open", f90499a);
    }

    /* renamed from: a */
    private static boolean m112022a(String str) {
        return m112027d().getBoolean(str, false);
    }

    /* renamed from: a */
    private static void m112019a(String str, Boolean bool) {
        m112027d().storeBoolean(str, bool.booleanValue());
    }
}
