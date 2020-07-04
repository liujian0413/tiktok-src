package com.p280ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.AliPayApiImpl */
class AliPayApiImpl {
    private static AliPayApi aliPayApi;

    AliPayApiImpl() {
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            aliPayApi = (AliPayApi) iRetrofitService.createNewRetrofit("https://aweme.snssdk.com/aweme/v1/").create(AliPayApi.class);
        }
    }

    static BaseResponse checkBindResult(int i, int i2, String str) throws Exception {
        return (BaseResponse) aliPayApi.checkBindResult(i, i2, str).get();
    }
}
