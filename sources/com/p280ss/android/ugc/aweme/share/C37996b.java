package com.p280ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;

/* renamed from: com.ss.android.ugc.aweme.share.b */
public final class C37996b {
    /* renamed from: a */
    public static String m121311a(String str) {
        if (!((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).isArabicLang(C6399b.m19921a()) || TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace("#", "");
    }
}
