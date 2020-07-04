package com.p280ss.android.ugc.aweme.tools;

import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.tools.ac */
public final class C42136ac {

    /* renamed from: a */
    public static final C42136ac f109653a = new C42136ac();

    /* renamed from: b */
    private static boolean f109654b;

    /* renamed from: c */
    private static boolean f109655c;

    private C42136ac() {
    }

    /* renamed from: a */
    public static boolean m134102a() {
        if (!f109654b) {
            f109654b = true;
            f109655c = C7285c.m22838a(C29960a.m98230a(), "effect_setting", 0).getBoolean("key_effect_channle", false);
        }
        return f109655c;
    }

    /* renamed from: a */
    public static void m134101a(boolean z) {
        f109655c = z;
        C7285c.m22838a(C29960a.m98230a(), "effect_setting", 0).edit().putBoolean("key_effect_channle", z).apply();
    }
}
