package com.p280ss.android.ugc.aweme.friends.api;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.friends.api.a */
public abstract /* synthetic */ class C30029a {
    /* renamed from: a */
    public static FriendApi m98491a() {
        return (FriendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FriendApi.class);
    }
}
