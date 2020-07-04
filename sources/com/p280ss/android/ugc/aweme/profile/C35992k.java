package com.p280ss.android.ugc.aweme.profile;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.setting.C7213d;

/* renamed from: com.ss.android.ugc.aweme.profile.k */
public final class C35992k {
    /* renamed from: a */
    public static boolean m115951a() {
        if (!C6399b.m19944t()) {
            return C7213d.m22500a().mo18808h();
        }
        return C7213d.m22500a().mo18808h();
    }

    /* renamed from: b */
    public static boolean m115952b() {
        if (!C6399b.m19944t() || !((Boolean) SharePrefCache.inst().getIsEuropeCountry().mo59877d()).booleanValue()) {
            return false;
        }
        return true;
    }
}
