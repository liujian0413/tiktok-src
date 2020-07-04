package com.p280ss.android.ugc.aweme.opensdk.share.api;

import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.api.a */
public abstract /* synthetic */ class C34679a {
    /* renamed from: a */
    public static ClientScopesApi m111976a() {
        return (ClientScopesApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://open-api.musical.ly").create(ClientScopesApi.class);
    }
}
