package com.bytedance.android.livesdkapi.p435b;

import android.text.TextUtils;
import com.bytedance.android.live.utility.C3593a;

/* renamed from: com.bytedance.android.livesdkapi.b.a */
public final class C9290a {

    /* renamed from: a */
    public static final boolean f25466a = C3593a.f10774a.booleanValue();

    /* renamed from: b */
    public static final boolean f25467b = "musically".equals("hotsoon");

    /* renamed from: c */
    public static final String f25468c = m27649b();

    /* renamed from: d */
    public static final String f25469d = m27648a();

    /* renamed from: e */
    public static final String[] f25470e = {"dm16.byteoversea.com", "dm.toutiao.com", "dm.bytedance.com", "dm.pstatp.com"};

    /* renamed from: f */
    public static final String[] f25471f = {"wo", "SAMSUNG", "google", "91dingzhi"};

    /* renamed from: g */
    public static final String f25472g;

    /* renamed from: h */
    public static final String f25473h;

    /* renamed from: i */
    public static final String f25474i = m27650c();

    /* renamed from: j */
    public static final String f25475j = m27651d();

    /* renamed from: k */
    public static final String f25476k = m27652e();

    /* renamed from: l */
    public static final String f25477l = m27653f();

    /* renamed from: c */
    private static String m27650c() {
        if (TextUtils.equals("fg", "musically")) {
            return "1570022200";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return "1541836912";
        }
        return "";
    }

    /* renamed from: d */
    private static String m27651d() {
        if (TextUtils.equals("fg", "musically")) {
            return "472064670264-p830d2k61ivgab1ihaq1oe5u50jf54q9.apps.googleusercontent.com";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return "908812512490-tqgub82rl7tuj6g8n7qvac1e21nqsiop.apps.googleusercontent.com";
        }
        return "";
    }

    /* renamed from: e */
    private static String m27652e() {
        if (TextUtils.equals("fg", "musically")) {
            return "WfP3mPeebrOwgRseDaoA9A";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return "ZhcvKT9ZDltWNGqO7s5weH0aY";
        }
        return "";
    }

    /* renamed from: f */
    private static String m27653f() {
        if (TextUtils.equals("fg", "musically")) {
            return "P0LoW03UNFPR8oHUBJJPYX7nws3LEba3MbGnzhVrVZ0";
        }
        if (TextUtils.equals("vigo", "musically")) {
            return "IfpxAJzlJ9sFeX5WNWLF1otayTvSFfXFO9JXNmkfCQ7Lh2Bmkt";
        }
        return "";
    }

    /* renamed from: a */
    private static String m27648a() {
        if (!f25466a) {
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
    private static String m27649b() {
        if (!f25466a) {
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
        if (f25466a) {
            str = "https://www.hypstar.com/hotsoon/in_app/faq_delete/";
        } else {
            str = "https://www.huoshan.com/inapp/faq/";
        }
        f25472g = str;
        if (f25466a) {
            str2 = "https://www.hypstar.com/hotsoon/in_app/faq/";
        } else {
            str2 = "https://www.huoshan.com/inapp/faq/";
        }
        f25473h = str2;
    }
}
