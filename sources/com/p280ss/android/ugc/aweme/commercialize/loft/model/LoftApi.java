package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import android.text.TextUtils;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.LoftApi */
public final class LoftApi {

    /* renamed from: a */
    private static final IRetrofit f65589a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.LoftApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/commerce/find/second/floor/")
        C18253l<LoftResponse> getLoftResponse(@C7744t(mo20436a = "activity_id") String str);
    }

    /* renamed from: a */
    public static C18253l<LoftResponse> m81624a(String str) {
        RealApi realApi = (RealApi) f65589a.create(RealApi.class);
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return realApi.getLoftResponse(str);
    }
}
