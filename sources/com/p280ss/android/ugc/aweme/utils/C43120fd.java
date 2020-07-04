package com.p280ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.os.Build;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;

/* renamed from: com.ss.android.ugc.aweme.utils.fd */
public final class C43120fd {
    /* renamed from: a */
    public static Uri m136749a() {
        Uri parse = Uri.parse("https://www.tiktokv.com/aweme/i18n/uninstall/");
        try {
            return parse.buildUpon().appendQueryParameter("app_id", String.valueOf(C6399b.m19935k())).appendQueryParameter("device_type", Build.MODEL).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("language", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getSysLanguage()).build();
        } catch (Exception unused) {
            return parse;
        }
    }
}
