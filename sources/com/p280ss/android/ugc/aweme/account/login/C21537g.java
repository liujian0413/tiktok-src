package com.p280ss.android.ugc.aweme.account.login;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p946i.C21222g;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.util.C22346u;
import com.p280ss.android.ugc.aweme.main.p1385g.C33029o;

/* renamed from: com.ss.android.ugc.aweme.account.login.g */
public final class C21537g {
    /* renamed from: b */
    private static C21101a m72224b(String str) {
        return m72217a(str, (C21101a) null);
    }

    /* renamed from: a */
    public static void m72221a(String str) {
        if (C21538h.m72228a(C21671bd.m72532b())) {
            C21227b.m71450a("aweme_thirdparty_login_error_rate", 1, m72224b(str).mo56942a("app_language", ((C33029o) C21671bd.m72521a(C33029o.class)).mo60029c()).mo56942a("platform", str).mo56943b());
        }
        new C21222g().mo57148a("1").mo57149b(C21277ab.m71640a(str)).mo57141b();
    }

    /* renamed from: a */
    public static void m72222a(String str, String str2) {
        m72223a("", str, str2);
    }

    /* renamed from: a */
    private static C21101a m72217a(String str, C21101a aVar) {
        boolean z;
        C21101a a = C21101a.m71159a();
        if (TextUtils.equals(str, "google")) {
            PackageInfo a2 = C22346u.m73992a(C21671bd.m72532b(), "com.google.android.gms");
            String str2 = "google_isInstalled";
            if (a2 != null) {
                z = true;
            } else {
                z = false;
            }
            a.mo56942a(str2, String.valueOf(z));
            if (a2 != null) {
                a.mo56942a("google_versionName", a2.versionName);
                a.mo56942a("google_versionCode", String.valueOf(a2.versionCode));
            }
            a.mo56942a("eligible", String.valueOf(C21241d.m71497a(C21671bd.m72532b())));
        }
        return a;
    }

    /* renamed from: a */
    public static void m72218a(int i, int i2, String str) {
        C21227b.m71450a("aweme_email_register_rate", i, C21101a.m71159a().mo56942a("errorCode", String.valueOf(i2)).mo56942a("errorDesc", str).mo56943b());
    }

    /* renamed from: b */
    public static void m72225b(int i, int i2, String str) {
        C21227b.m71450a("aweme_agegate_rate", i, C21101a.m71159a().mo56942a("eligible", String.valueOf(i2)).mo56942a("errorDesc", str).mo56943b());
    }

    /* renamed from: c */
    public static void m72226c(int i, int i2, String str) {
        C21227b.m71450a("aweme_phone_login_rate", i, C21101a.m71159a().mo56942a("errorCode", String.valueOf(i2)).mo56942a("errorDesc", str).mo56943b());
    }

    /* renamed from: d */
    public static void m72227d(int i, int i2, String str) {
        C21227b.m71450a("aweme_phone_register_rate", i, C21101a.m71159a().mo56942a("errorCode", String.valueOf(i2)).mo56942a("errorDesc", str).mo56943b());
    }

    /* renamed from: a */
    public static void m72220a(int i, String str, String str2) {
        if (C21538h.m72228a(C21671bd.m72532b())) {
            C21227b.m71450a("aweme_thirdparty_login_error_rate", 0, m72224b(str2).mo56942a("app_language", ((C33029o) C21671bd.m72521a(C33029o.class)).mo60029c()).mo56942a("platform", str2).mo56942a("errorCode", String.valueOf(i)).mo56942a("errorDesc", String.valueOf(str)).mo56943b());
        }
        new C21222g().mo57148a("0").mo57149b(str2).mo57150c(String.valueOf(i)).mo57141b();
    }

    /* renamed from: a */
    private static void m72223a(String str, String str2, String str3) {
        if (C21538h.m72228a(C21671bd.m72532b())) {
            C21227b.m71450a("aweme_thirdparty_login_error_rate", 0, m72224b(str3).mo56942a("app_language", ((C33029o) C21671bd.m72521a(C33029o.class)).mo60029c()).mo56942a("platform", str3).mo56942a("errorDesc", String.valueOf(str2)).mo56942a("errorUrl", str).mo56943b());
        }
        new C21222g().mo57148a("0").mo57149b(C21277ab.m71640a(str3)).mo57141b();
    }

    /* renamed from: a */
    public static void m72219a(int i, String str, int i2, String str2) {
        C21227b.m71450a("aweme_user_email_login_rate", i, C21101a.m71159a().mo56942a("type", String.valueOf(str)).mo56942a("errorCode", String.valueOf(i2)).mo56942a("errorDesc", str2).mo56943b());
    }
}
