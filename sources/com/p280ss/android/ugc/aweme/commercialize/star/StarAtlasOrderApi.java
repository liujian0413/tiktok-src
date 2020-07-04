package com.p280ss.android.ugc.aweme.commercialize.star;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.StarAtlasOrderApi */
public class StarAtlasOrderApi {

    /* renamed from: a */
    private static IStarAtlasOrderApi f66221a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.StarAtlasOrderApi$IStarAtlasOrderApi */
    public interface IStarAtlasOrderApi {
        @C7730f(mo20420a = "/aweme/v1/commerce/star/atlas/orders/")
        C18253l<C25090c> checkStarAtlasOrder(@C7744t(mo20436a = "page") int i, @C7744t(mo20436a = "limit") int i2);
    }

    /* renamed from: a */
    public static IStarAtlasOrderApi m82622a() {
        if (f66221a == null) {
            synchronized (StarAtlasOrderApi.class) {
                if (f66221a == null) {
                    f66221a = (IStarAtlasOrderApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(IStarAtlasOrderApi.class);
                }
            }
        }
        return f66221a;
    }
}
