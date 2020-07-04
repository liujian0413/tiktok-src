package com.p280ss.android.ugc.aweme.util.p1691a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.util.a.a */
public final class C42867a {
    /* renamed from: b */
    public static void m136096b() {
        m136094a("is_first_like_success", false);
    }

    /* renamed from: g */
    public static void m136101g() {
        m136094a("has_2d_rr_use", true);
    }

    /* renamed from: c */
    public static int m136097c() {
        return m136102h().getInt("like_success_count", 0);
    }

    /* renamed from: d */
    public static boolean m136098d() {
        if (m136104j() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m136099e() {
        m136093a("active_time", System.currentTimeMillis());
    }

    /* renamed from: h */
    private static SharedPreferences m136102h() {
        return C7285c.m22838a(AwemeApplication.m21341a(), "apps_flyer_cache", 0);
    }

    /* renamed from: i */
    private static Editor m136103i() {
        return m136102h().edit();
    }

    /* renamed from: j */
    private static long m136104j() {
        return m136102h().getLong("active_time", 0);
    }

    /* renamed from: k */
    private static boolean m136105k() {
        return m136102h().getBoolean("has_2d_rr_use", false);
    }

    /* renamed from: f */
    public static boolean m136100f() {
        if (!m136105k()) {
            if (TimeUnit.MILLISECONDS.toDays(m136104j()) + 1 == TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m136095a() {
        return m136102h().getBoolean("is_first_like_success", true);
    }

    /* renamed from: a */
    public static void m136091a(int i) {
        m136092a("like_success_count", i);
    }

    /* renamed from: a */
    private static void m136092a(String str, int i) {
        m136103i().putInt(str, i).apply();
    }

    /* renamed from: a */
    private static void m136093a(String str, long j) {
        m136103i().putLong(str, j).apply();
    }

    /* renamed from: a */
    private static void m136094a(String str, boolean z) {
        m136103i().putBoolean(str, z).apply();
    }
}
