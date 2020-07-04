package com.p280ss.android.ugc.aweme.miniapp.utils;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;

/* renamed from: com.ss.android.ugc.aweme.miniapp.utils.c */
public final class C33419c {
    /* renamed from: a */
    private static int m108076a(String str) {
        if (C33447f.m108190c(str)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    public static String m108077a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeRawAd() == null) {
            return "";
        }
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (C33447f.m108191d(openUrl)) {
            return C33447f.m108186a(openUrl);
        }
        if (C33447f.m108191d(microAppUrl)) {
            return C33447f.m108186a(microAppUrl);
        }
        return "";
    }

    /* renamed from: b */
    public static int m108079b(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return 0;
        }
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (C33447f.m108191d(openUrl)) {
            return m108076a(openUrl);
        }
        if (C33447f.m108191d(microAppUrl)) {
            return m108076a(microAppUrl);
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m108078a(Context context, Aweme aweme) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (!C33447f.m108191d(microAppUrl)) {
            return false;
        }
        C7167b.m22380b().mo18647a().openMiniApp(context, microAppUrl, new C33472a().mo85792c("025002").mo85794e("mp_url").mo85790a());
        return true;
    }
}
