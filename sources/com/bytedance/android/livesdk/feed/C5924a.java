package com.bytedance.android.livesdk.feed;

import android.text.TextUtils;

/* renamed from: com.bytedance.android.livesdk.feed.a */
public final class C5924a {

    /* renamed from: a */
    public static final boolean f17548a = C5949b.f17626a.booleanValue();

    /* renamed from: b */
    public static final boolean f17549b = "fg".equals("musically");

    /* renamed from: c */
    public static final boolean f17550c = "vigo".equals("musically");

    /* renamed from: d */
    public static final boolean f17551d = "douyin".equals("musically");

    /* renamed from: e */
    public static final boolean f17552e = "musically".equals("hotsoon");

    /* renamed from: f */
    public static final String f17553f = m18535b();

    /* renamed from: g */
    public static final String f17554g = m18534a();

    /* renamed from: h */
    public static final String[] f17555h = {"dm16.byteoversea.com", "dm.toutiao.com", "dm.bytedance.com", "dm.pstatp.com"};

    /* renamed from: i */
    public static final String[] f17556i = {"wo", "SAMSUNG", "google", "91dingzhi"};

    /* renamed from: j */
    public static final String f17557j;

    /* renamed from: k */
    public static final String f17558k;

    /* renamed from: l */
    public static final String f17559l = m18536c();

    /* renamed from: m */
    public static final String f17560m = m18537d();

    /* renamed from: n */
    public static final String f17561n = m18538e();

    /* renamed from: o */
    public static final String f17562o = m18539f();

    /* renamed from: c */
    private static String m18536c() {
        if (TextUtils.equals("fg", "musically")) {
            return "1570022200";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return "1541836912";
        }
        return "";
    }

    /* renamed from: d */
    private static String m18537d() {
        if (TextUtils.equals("fg", "musically")) {
            return "472064670264-p830d2k61ivgab1ihaq1oe5u50jf54q9.apps.googleusercontent.com";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return "908812512490-tqgub82rl7tuj6g8n7qvac1e21nqsiop.apps.googleusercontent.com";
        }
        return "";
    }

    /* renamed from: e */
    private static String m18538e() {
        if (TextUtils.equals("fg", "musically")) {
            return "WfP3mPeebrOwgRseDaoA9A";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return "ZhcvKT9ZDltWNGqO7s5weH0aY";
        }
        return "";
    }

    /* renamed from: f */
    private static String m18539f() {
        if (TextUtils.equals("fg", "musically")) {
            return "P0LoW03UNFPR8oHUBJJPYX7nws3LEba3MbGnzhVrVZ0";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return "IfpxAJzlJ9sFeX5WNWLF1otayTvSFfXFO9JXNmkfCQ7Lh2Bmkt";
        }
        return "";
    }

    /* renamed from: a */
    private static String m18534a() {
        if (!f17548a) {
            return " live_stream_";
        }
        if (TextUtils.equals("fg", "musically")) {
            return " flipagram_i18n_";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return " live_i18n_";
        }
        return " ive_i18n_";
    }

    /* renamed from: b */
    private static String m18535b() {
        if (!f17548a) {
            return "huoshan_android";
        }
        if (TextUtils.equals("fg", "musically")) {
            return "flipagram_android";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return "hypstar_android";
        }
        return "hypstar_android";
    }

    static {
        String str;
        String str2;
        if (f17548a) {
            str = "https://www.hypstar.com/hotsoon/in_app/faq_delete/";
        } else {
            str = "https://www.huoshan.com/inapp/faq/";
        }
        f17557j = str;
        if (f17548a) {
            str2 = "https://www.hypstar.com/hotsoon/in_app/faq/";
        } else {
            str2 = "https://www.huoshan.com/inapp/faq/";
        }
        f17558k = str2;
    }
}
