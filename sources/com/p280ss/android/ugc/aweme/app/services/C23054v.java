package com.p280ss.android.ugc.aweme.app.services;

import android.content.Context;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30468e;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.main.p1385g.C33029o;
import com.p280ss.android.ugc.trill.language.ChooseLanguageDialog;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.services.v */
public final class C23054v implements C33029o {
    /* renamed from: c */
    public final String mo60029c() {
        String c = C30468e.m99511a().mo80143c();
        C7573i.m23582a((Object) c, "I18nManager.get().getAppLanguage()");
        return c;
    }

    /* renamed from: b */
    public final String mo60028b() {
        String f = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(AwemeApplication.m21341a()).mo18535f();
        C7573i.m23582a((Object) f, "ServiceManager.get().get…lication()).getShowName()");
        return f;
    }

    /* renamed from: a */
    public final String mo60026a() {
        C7120e currentI18nItem = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(AwemeApplication.m21341a());
        C7573i.m23582a((Object) currentI18nItem, "ServiceManager.get().get…ication.getApplication())");
        String g = currentI18nItem.mo18536g();
        C7573i.m23582a((Object) g, "ServiceManager.get().get….getApplication()).isO639");
        return g;
    }

    /* renamed from: a */
    public final void mo60027a(Context context) {
        C7573i.m23587b(context, "context");
        new ChooseLanguageDialog(context).show();
    }
}
