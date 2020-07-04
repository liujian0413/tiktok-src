package com.p280ss.android.ugc.aweme.p1685ug.referral;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.ReferCommitApi */
public final class ReferCommitApi {

    /* renamed from: a */
    static IRetrofit f111053a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: b */
    private static IRetrofitService f111054b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.ug.referral.ReferCommitApi$RealApi */
    interface RealApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/ug/user/referral/commit/")
        C18253l<Object> referralCommit(@C7727c(mo20417a = "referral_code") String str);
    }

    /* renamed from: a */
    public static void m135669a(String str) throws Exception {
        try {
            ((RealApi) f111053a.create(RealApi.class)).referralCommit(str).get();
        } catch (ExecutionException e) {
            throw f111054b.propagateCompatibleException(e);
        }
    }
}
