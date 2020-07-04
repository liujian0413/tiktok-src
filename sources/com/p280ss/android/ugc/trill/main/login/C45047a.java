package com.p280ss.android.ugc.trill.main.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.metrics.C33247as;
import com.p280ss.android.ugc.aweme.utils.C43103en;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import com.p280ss.android.ugc.trill.p1765g.C44997a;

/* renamed from: com.ss.android.ugc.trill.main.login.a */
public final class C45047a {
    /* renamed from: b */
    private static C6869c m142094b(String str) {
        return m142090a(str, (C6869c) null);
    }

    /* renamed from: a */
    public static void m142091a(String str) {
        if (C45048b.m142095a(TrillApplication.m21341a())) {
            C6877n.m21444a("aweme_thirdparty_login_error_rate", 1, m142094b(str).mo16887a("app_language", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage()).mo16887a("platform", str).mo16888b());
        }
        if (C6399b.m19946v()) {
            new C33247as().mo85134a("1").mo85135b(C45049c.m142096a(str)).mo85252e();
        }
    }

    /* renamed from: a */
    public static void m142092a(String str, String str2) {
        m142093a("", str, str2);
    }

    /* renamed from: a */
    private static C6869c m142090a(String str, C6869c cVar) {
        boolean z;
        C6869c a = C6869c.m21381a();
        if (TextUtils.equals(str, "google")) {
            PackageInfo a2 = C43103en.m136720a((Context) AwemeApplication.m21341a(), "com.google.android.gms");
            String str2 = "google_isInstalled";
            if (a2 != null) {
                z = true;
            } else {
                z = false;
            }
            a.mo16887a(str2, String.valueOf(z));
            if (a2 != null) {
                a.mo16887a("google_versionName", a2.versionName);
                a.mo16887a("google_versionCode", String.valueOf(a2.versionCode));
            }
            a.mo16887a("eligible", String.valueOf(C44997a.m141972a(TrillApplication.m21341a())));
        }
        return a;
    }

    /* renamed from: a */
    private static void m142093a(String str, String str2, String str3) {
        if (C45048b.m142095a(TrillApplication.m21341a())) {
            C6877n.m21444a("aweme_thirdparty_login_error_rate", 0, m142094b(str3).mo16887a("app_language", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage()).mo16887a("platform", str3).mo16887a("errorDesc", String.valueOf(str2)).mo16887a("errorUrl", str).mo16888b());
        }
        if (C6399b.m19946v()) {
            new C33247as().mo85134a("0").mo85135b(C45049c.m142096a(str3)).mo85252e();
        }
    }
}
