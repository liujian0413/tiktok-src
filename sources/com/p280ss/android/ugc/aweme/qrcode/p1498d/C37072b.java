package com.p280ss.android.ugc.aweme.qrcode.p1498d;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d.b */
public final class C37072b {
    /* renamed from: a */
    private static String m119197a() {
        if (!C6399b.m19944t()) {
            return "zh-Hans";
        }
        I18nManagerService i18nManagerService = (I18nManagerService) ServiceManager.get().getService(I18nManagerService.class);
        return i18nManagerService.getLanguage(i18nManagerService.getCurrentI18nItem(AwemeApplication.m21341a()).mo18532c());
    }

    /* renamed from: a */
    public static String m119198a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "https://link-va.byteoversea.com/";
        }
        return Uri.parse(str2).buildUpon().appendQueryParameter("aid", String.valueOf(C6399b.m19935k())).appendQueryParameter("target", str).appendQueryParameter("lang", m119197a()).build().toString();
    }

    /* renamed from: a */
    public static String m119199a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "https://link-va.byteoversea.com/";
        }
        return Uri.parse(str2).buildUpon().appendQueryParameter("aid", String.valueOf(C6399b.m19935k())).appendQueryParameter("target", str).appendQueryParameter("lang", m119197a()).appendQueryParameter("scene", str3).build().toString();
    }
}
