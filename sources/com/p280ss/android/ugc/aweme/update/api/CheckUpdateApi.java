package com.p280ss.android.ugc.aweme.update.api;

import com.bytedance.retrofit2.C12466b;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.update.api.CheckUpdateApi */
public interface CheckUpdateApi {

    /* renamed from: a */
    public static final CheckUpdateApi f111200a = ((CheckUpdateApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CheckUpdateApi.class));

    @C7730f(mo20420a = "/appbeta/check_version/check_beta")
    C12466b<C6711m> getI18nVersionUpdateInfo();

    @C7730f(mo20420a = "/check_version/v6/")
    C12466b<C6711m> getVersionUpdateInfo();
}
