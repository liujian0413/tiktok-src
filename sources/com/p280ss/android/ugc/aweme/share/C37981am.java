package com.p280ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.share.am */
public final class C37981am {
    /* renamed from: a */
    public static boolean m121297a(String str) {
        return TextUtils.equals(C6861a.m21337f().getCurUserId(), str);
    }

    /* renamed from: a */
    public static boolean m121296a(Aweme aweme) {
        if (aweme == null || ((aweme.getAuthor() == null && !C25300bx.m83125a(aweme, 3)) || aweme.getVideo() == null)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m121294a(SharePackage sharePackage, String str) {
        if (sharePackage == null) {
            return null;
        }
        return m121295a(sharePackage.f20185k, str, sharePackage.f20186l.getBoolean("bool_persist"));
    }

    /* renamed from: a */
    public static String m121295a(String str, String str2, boolean z) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.contains("utm_source")) {
            C19290j jVar = new C19290j(str);
            jVar.mo51188a("utm_source", str2);
            jVar.mo51188a("utm_campaign", "client_share");
            jVar.mo51188a("utm_medium", "android");
            jVar.mo51188a("share_app_name", C6399b.m19930f());
            jVar.mo51188a("share_iid", AppLog.getInstallId());
            str3 = jVar.mo51184a();
        } else {
            StringBuilder sb = new StringBuilder("utm_source=");
            sb.append(str2);
            str3 = str.replaceAll("utm_source=\\w*_?\\w?", sb.toString());
        }
        return (String) C37984ap.m121302b().shortUrl(str3).mo19271a();
    }
}
