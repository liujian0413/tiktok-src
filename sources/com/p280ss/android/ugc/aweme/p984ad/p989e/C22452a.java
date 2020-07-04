package com.p280ss.android.ugc.aweme.p984ad.p989e;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.ad.e.a */
public final class C22452a {
    /* renamed from: a */
    public static boolean m74319a(String str) {
        return TextUtils.equals(str, "general_search");
    }

    /* renamed from: b */
    public static int m74320b(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m74318a(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getPackageName();
    }

    /* renamed from: b */
    public static String m74321b(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getDownloadUrl();
    }

    /* renamed from: c */
    public static boolean m74322c(String str) {
        if (C6399b.m19944t() || !TextUtils.equals(str, "general_search")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static Aweme m74323d(String str) {
        IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
        Aweme rawAdAwemeById = iAwemeService.getRawAdAwemeById(str);
        Aweme awemeById = iAwemeService.getAwemeById(str);
        if (rawAdAwemeById != null) {
            return rawAdAwemeById;
        }
        return awemeById;
    }
}
