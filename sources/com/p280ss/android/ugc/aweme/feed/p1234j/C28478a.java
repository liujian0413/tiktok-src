package com.p280ss.android.ugc.aweme.feed.p1234j;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.j.a */
public final class C28478a {
    /* renamed from: a */
    public static boolean m93582a(C28130ac acVar) {
        if (acVar == null || !m93583a(acVar.mo65711h())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Aweme m93586b(C28130ac acVar) {
        if (acVar == null) {
            return null;
        }
        return acVar.mo65711h();
    }

    /* renamed from: a */
    public static boolean m93583a(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static long m93585b(Aweme aweme) {
        if (aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdId() == null) {
            return -1;
        }
        return aweme.getAwemeRawAd().getAdId().longValue();
    }

    /* renamed from: c */
    public static boolean m93587c(C28130ac acVar) {
        if (acVar == null || acVar.mo65711h() == null || !acVar.mo65711h().isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m93589d(C28130ac acVar) {
        if (acVar == null || acVar.mo65711h() == null || acVar.mo65711h().getAwemeType() != 31) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m93590e(C28130ac acVar) {
        if (acVar == null || acVar.mo65716m() == null || acVar.mo65716m().mo71563n() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m93591f(C28130ac acVar) {
        if (acVar == null || acVar.mo65716m() == null || acVar.mo65716m().mo71563n() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m93588c(Aweme aweme) {
        if (aweme == null || aweme.getUploadMiscInfoStruct().vpaInfo.getInfoBarType() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m93584a(String str, Aweme aweme) {
        if (!TextUtils.equals(str, "homepage_hot") || aweme.getBannerTip() == null || aweme.getBannerTip().getBannerType() != 1 || m93588c(aweme)) {
            return false;
        }
        return true;
    }
}
