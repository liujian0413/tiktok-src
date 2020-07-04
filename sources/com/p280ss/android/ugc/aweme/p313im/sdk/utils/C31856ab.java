package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.LivePushResponse;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ab */
public final class C31856ab {

    /* renamed from: a */
    private static LiveApi f83321a;

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            f83321a = (LiveApi) iRetrofitService.createNewRetrofit(C7075h.f19904c).create(LiveApi.class);
        }
    }

    /* renamed from: a */
    public static void m103401a(C1591g<LivePushResponse, Void> gVar) {
        f83321a.fetchRecommendAnchor().mo6876a(gVar, C1592h.f5958b);
    }
}
