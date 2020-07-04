package com.p280ss.android.ugc.aweme.p1685ug.referral.getreferer;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.getreferer.GetRefererApi */
public final class GetRefererApi {

    /* renamed from: a */
    static IRetrofit f111073a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: b */
    private static IRetrofitService f111074b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.ug.referral.getreferer.GetRefererApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/ug/user/referral/info/")
        C18253l<C42751d> referralCommit(@C7744t(mo20436a = "referral_code") String str);
    }

    /* renamed from: a */
    public static C42751d m135683a(String str) throws Exception {
        try {
            return (C42751d) ((RealApi) f111073a.create(RealApi.class)).referralCommit(str).get();
        } catch (ExecutionException e) {
            throw f111074b.propagateCompatibleException(e);
        }
    }
}
