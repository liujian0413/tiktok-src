package com.p280ss.android.ugc.trill.language.api;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.trill.language.api.a */
public abstract /* synthetic */ class C45018a {
    /* renamed from: a */
    public static LanguageApi m142011a() {
        return (LanguageApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(LanguageApi.class);
    }
}
