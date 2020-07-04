package com.p280ss.android.ugc.aweme.zhima;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.setting.model.CommonResponse;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.zhima.VerifyApi */
public final class VerifyApi {

    /* renamed from: a */
    static final IRetrofit f112822a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: b */
    private static IRetrofitService f112823b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.zhima.VerifyApi$RealApi */
    interface RealApi {
        @C7739o(mo20429a = "/aweme/v1/user/verify/manual/?reset=1")
        C18253l<CommonResponse> clearVerifyUser();
    }

    /* renamed from: a */
    public static CommonResponse m138108a() throws Exception {
        try {
            return (CommonResponse) ((RealApi) f112822a.create(RealApi.class)).clearVerifyUser().get();
        } catch (ExecutionException e) {
            throw f112823b.propagateCompatibleException(e);
        }
    }
}
