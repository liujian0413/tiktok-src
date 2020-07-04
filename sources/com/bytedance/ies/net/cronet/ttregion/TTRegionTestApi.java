package com.bytedance.ies.net.cronet.ttregion;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;

public final class TTRegionTestApi {

    /* renamed from: a */
    private static final RetrofitApi f29602a = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RetrofitApi.class));

    interface RetrofitApi {
        @C7730f(mo20420a = "/aweme/v1/ttregion/test/")
        C1592h<BaseResponse> ttRegionTest();
    }

    /* renamed from: a */
    public static void m32092a() {
        try {
            f29602a.ttRegionTest();
        } catch (Exception unused) {
        }
    }
}
