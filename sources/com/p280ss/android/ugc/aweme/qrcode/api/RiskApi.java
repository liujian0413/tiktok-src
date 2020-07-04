package com.p280ss.android.ugc.aweme.qrcode.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.qrcode.model.C37082c;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.qrcode.api.RiskApi */
public final class RiskApi {

    /* renamed from: a */
    static final IRetrofit f96952a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: b */
    private static IRetrofitService f96953b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.qrcode.api.RiskApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v2/risk/url/")
        C18253l<C37082c> getRiskUrlModel(@C7744t(mo20436a = "request_url") String str);
    }

    /* renamed from: a */
    public static C37082c m119050a(String str) throws Exception {
        try {
            return (C37082c) ((RealApi) f96952a.create(RealApi.class)).getRiskUrlModel(str).get();
        } catch (ExecutionException e) {
            throw f96953b.propagateCompatibleException(e);
        }
    }
}
