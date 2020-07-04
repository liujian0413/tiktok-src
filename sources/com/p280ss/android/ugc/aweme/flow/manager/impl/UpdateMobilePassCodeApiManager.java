package com.p280ss.android.ugc.aweme.flow.manager.impl;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.UpdateMobilePassCodeApiManager */
public final class UpdateMobilePassCodeApiManager {

    /* renamed from: a */
    public static final String f58208a = Api.f60502b;

    /* renamed from: b */
    public static UpdateMobilePassCodeApi f58209b = ((UpdateMobilePassCodeApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f58208a).create(UpdateMobilePassCodeApi.class));

    /* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.UpdateMobilePassCodeApiManager$UpdateMobilePassCodeApi */
    interface UpdateMobilePassCodeApi {
        @C7730f(mo20420a = "aweme/v1/carrier_flow/mobile/pcid/upload/")
        C18253l<BaseResponse> upload(@C7744t(mo20436a = "mobile_pcid") String str);
    }

    /* renamed from: a */
    public static C18253l<BaseResponse> m72661a(String str) {
        return f58209b.upload(str);
    }
}
