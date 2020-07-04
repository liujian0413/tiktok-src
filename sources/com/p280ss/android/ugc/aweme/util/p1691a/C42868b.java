package com.p280ss.android.ugc.aweme.util.p1691a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.util.a.b */
public final class C42868b {
    /* renamed from: a */
    public static String m136106a() {
        return m136120h().getString("current_data", "");
    }

    /* renamed from: b */
    public static int m136110b() {
        return m136120h().getInt("many_days_viewed_count", 0);
    }

    /* renamed from: c */
    public static int m136113c() {
        return m136120h().getInt("one_day_viewed_count", 0);
    }

    /* renamed from: e */
    public static boolean m136117e() {
        return m136120h().getBoolean("has_reported_viewed_50_one_day", false);
    }

    /* renamed from: f */
    public static boolean m136118f() {
        return m136120h().getBoolean("has_reported_viewed_30_many_days", false);
    }

    /* renamed from: g */
    public static boolean m136119g() {
        return m136120h().getBoolean("has_reported_viewed_50_many_days", false);
    }

    /* renamed from: h */
    private static SharedPreferences m136120h() {
        return C7285c.m22838a(AwemeApplication.m21341a(), "video_view_count_sp", 0);
    }

    /* renamed from: i */
    private static Editor m136121i() {
        return m136120h().edit();
    }

    /* renamed from: d */
    public static boolean m136116d() {
        return m136120h().getBoolean("has_reported_viewed_30_one_day", false);
    }

    /* renamed from: d */
    public static void m136115d(boolean z) {
        m136121i().putBoolean("has_reported_viewed_50_many_days", true).apply();
    }

    /* renamed from: a */
    public static void m136107a(int i) {
        m136121i().putInt("many_days_viewed_count", i).apply();
    }

    /* renamed from: b */
    public static void m136111b(int i) {
        m136121i().putInt("one_day_viewed_count", i).apply();
    }

    /* renamed from: c */
    public static void m136114c(boolean z) {
        m136121i().putBoolean("has_reported_viewed_30_many_days", true).apply();
    }

    /* renamed from: a */
    public static void m136108a(String str) {
        m136121i().putString("current_data", str).apply();
    }

    /* renamed from: b */
    public static void m136112b(boolean z) {
        m136121i().putBoolean("has_reported_viewed_50_one_day", true).apply();
    }

    /* renamed from: a */
    public static void m136109a(boolean z) {
        m136121i().putBoolean("has_reported_viewed_30_one_day", true).apply();
    }
}
