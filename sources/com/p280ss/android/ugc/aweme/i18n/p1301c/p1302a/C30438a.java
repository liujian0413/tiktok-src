package com.p280ss.android.ugc.aweme.i18n.p1301c.p1302a;

import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;

/* renamed from: com.ss.android.ugc.aweme.i18n.c.a.a */
public final class C30438a {
    /* renamed from: a */
    public static void m99423a(C19290j jVar) {
        jVar.mo51188a("app_language", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
        jVar.mo51188a("language", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getSysLanguage());
        jVar.mo51188a("region", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getRegion());
        jVar.mo51188a("sys_region", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getSysRegion());
        jVar.mo51188a("carrier_region", C32326h.m104886h());
        String accountRegion = C21115b.m71197a().getCurUser().getAccountRegion();
        if (accountRegion != null && !accountRegion.isEmpty()) {
            jVar.mo51188a("account_region", accountRegion);
        }
    }
}
