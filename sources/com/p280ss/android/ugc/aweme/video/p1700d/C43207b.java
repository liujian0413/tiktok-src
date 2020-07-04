package com.p280ss.android.ugc.aweme.video.p1700d;

import android.text.TextUtils;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: com.ss.android.ugc.aweme.video.d.b */
public final class C43207b {
    /* renamed from: a */
    public static String m136999a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("aweme/v1/play")) {
            return str;
        }
        return m137000b(str).mo51184a();
    }

    /* renamed from: b */
    public static C19290j m137000b(String str) {
        C19290j jVar = new C19290j(str);
        if (!((Boolean) SharePrefCache.inst().getTTRegion().mo59877d()).booleanValue()) {
            jVar.mo51188a("pass-region", "1");
        }
        if (!((Boolean) SharePrefCache.inst().getTTRoute().mo59877d()).booleanValue()) {
            jVar.mo51188a("pass-route", "1");
        }
        return new C19290j(AppLog.addCommonParams(jVar.toString(), true));
    }
}
