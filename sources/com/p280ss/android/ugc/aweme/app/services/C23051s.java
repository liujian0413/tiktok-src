package com.p280ss.android.ugc.aweme.app.services;

import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30468e;
import com.p280ss.android.ugc.aweme.main.p1385g.C33027m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.services.s */
public final class C23051s implements C33027m {
    /* renamed from: a */
    public final String mo60024a() {
        String b = C30476b.m99553b();
        C7573i.m23582a((Object) b, "LanguageHelper.getAppLocale()");
        return b;
    }

    /* renamed from: b */
    public final String mo60025b() {
        C30468e a = C30468e.m99511a();
        C7573i.m23582a((Object) a, "I18nManager.get()");
        String c = a.mo80143c();
        C7573i.m23582a((Object) c, "I18nManager.get().appLanguage");
        return c;
    }
}
