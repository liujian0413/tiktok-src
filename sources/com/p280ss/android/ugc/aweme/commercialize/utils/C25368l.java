package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.google.gson.C6600e;
import com.p280ss.android.sdk.activity.model.AdLandingPageConfig;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.l */
public final class C25368l {

    /* renamed from: a */
    public static final C25368l f66773a = new C25368l();

    private C25368l() {
    }

    /* renamed from: a */
    public static final AdLandingPageConfig m83415a() {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl adLandingPageConfig = inst.getAdLandingPageConfig();
        if (adLandingPageConfig != null) {
            String str = (String) adLandingPageConfig.mo59877d();
            if (str != null) {
                return (AdLandingPageConfig) new C6600e().mo15974a(str, AdLandingPageConfig.class);
            }
        }
        return null;
    }
}
