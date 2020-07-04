package com.p280ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.share.p1536f.C38039c;

/* renamed from: com.ss.android.ugc.aweme.feed.aj */
public final class C28206aj {
    /* renamed from: a */
    private static String m92711a() {
        if (!C30538p.m99745a()) {
            return "aweme";
        }
        return C6399b.m19930f();
    }

    /* renamed from: a */
    public static String m92712a(ShareInfo shareInfo, String str, boolean z) {
        if (shareInfo == null) {
            return "";
        }
        return (String) C38039c.f99025a.mo95676a(m92710a(shareInfo, str, shareInfo.getShareUrl()).getShareUrl()).mo19271a();
    }

    /* renamed from: a */
    private static ShareInfo m92710a(ShareInfo shareInfo, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2) || str2.contains("utm_source")) {
            StringBuilder sb = new StringBuilder("utm_source=");
            sb.append(str);
            str3 = str2.replaceAll("utm_source=\\w*_?\\w?", sb.toString());
        } else {
            C19290j jVar = new C19290j(str2);
            jVar.mo51188a("utm_source", str);
            jVar.mo51188a("utm_campaign", "client_share");
            jVar.mo51188a("utm_medium", "android");
            jVar.mo51188a("app", m92711a());
            jVar.mo51188a("iid", AppLog.getInstallId());
            str3 = jVar.mo51184a();
        }
        if (shareInfo != null) {
            shareInfo.setShareUrl(str3);
        }
        return shareInfo;
    }
}
