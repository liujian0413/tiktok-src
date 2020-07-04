package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.df */
public final class C43054df {

    /* renamed from: a */
    public static final C43054df f111653a = new C43054df();

    private C43054df() {
    }

    /* renamed from: a */
    public static String m136597a(String str) {
        C7573i.m23587b(str, "projectKey");
        I18nManagerService i18nManagerService = (I18nManagerService) ServiceManager.get().getService(I18nManagerService.class);
        C7573i.m23582a((Object) i18nManagerService, "service");
        String appLanguage = i18nManagerService.getAppLanguage();
        String g = C32326h.m104885g();
        StringBuilder sb = new StringBuilder("https://www.tiktok.com/in_app/redirect?region=");
        sb.append(g);
        sb.append("&language=");
        sb.append(appLanguage);
        sb.append("&projectKey=");
        sb.append(str);
        return sb.toString();
    }
}
