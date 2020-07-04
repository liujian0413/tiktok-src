package com.p280ss.android.ugc.aweme.friends.api;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.friends.api.b */
public abstract /* synthetic */ class C30030b {
    /* renamed from: a */
    public static RecommendApi m98492a() {
        return (RecommendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RecommendApi.class);
    }
}
