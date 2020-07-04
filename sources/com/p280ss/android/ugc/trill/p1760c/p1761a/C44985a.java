package com.p280ss.android.ugc.trill.p1760c.p1761a;

import android.content.SharedPreferences;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.trill.c.a.a */
public final class C44985a {

    /* renamed from: a */
    private static final boolean f115658a = C7163a.m22363a();

    /* renamed from: d */
    public static void m141947d() {
        C1592h.m7853a(C44986b.f115659a);
    }

    /* renamed from: b */
    public static String m141941b() {
        return m141946c("twitter_access_token", "");
    }

    /* renamed from: f */
    private static SharedPreferences m141949f() {
        return C7285c.m22838a(C6399b.m19921a(), "aweme_friends", 0);
    }

    /* renamed from: a */
    public static String m141938a() {
        String c = m141946c("fb_access_token", "");
        long c2 = m141944c("fb_access_token_exp", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis <= 0 || c2 <= currentTimeMillis) {
            return "";
        }
        return c;
    }

    /* renamed from: c */
    public static String m141945c() {
        return m141946c("twitter_access_token_secret", "");
    }

    /* renamed from: a */
    public static void m141939a(String str, long j) {
        m141943b("fb_access_token", str);
        m141942b("fb_access_token_exp", j);
    }

    /* renamed from: c */
    private static long m141944c(String str, long j) {
        return m141949f().getLong(str, 0);
    }

    /* renamed from: b */
    private static void m141942b(String str, long j) {
        m141949f().edit().putLong(str, j).apply();
    }

    /* renamed from: a */
    public static void m141940a(String str, String str2) {
        m141943b("twitter_access_token", str);
        m141943b("twitter_access_token_secret", str2);
    }

    /* renamed from: b */
    private static void m141943b(String str, String str2) {
        m141949f().edit().putString(str, str2).apply();
    }

    /* renamed from: c */
    private static String m141946c(String str, String str2) {
        return m141949f().getString(str, str2);
    }
}
