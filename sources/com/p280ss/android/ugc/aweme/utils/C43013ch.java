package com.p280ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.utils.ch */
public final class C43013ch {
    /* renamed from: a */
    public static boolean m136514a() {
        String appLanguage = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage();
        if (TextUtils.isEmpty(appLanguage) || !appLanguage.startsWith("zh")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Locale m136515b() {
        if (VERSION.SDK_INT >= 24) {
            return C6399b.m19921a().getResources().getConfiguration().getLocales().get(0);
        }
        return C6399b.m19921a().getResources().getConfiguration().locale;
    }

    /* renamed from: c */
    public static boolean m136516c() {
        if (TextUtils.equals(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage())) {
            return true;
        }
        return false;
    }
}
