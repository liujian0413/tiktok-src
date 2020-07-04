package com.p280ss.android.ugc.aweme.poi.api;

import bolts.C1592h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.bean.C35072d;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiSameCityActiveApi */
public final class PoiSameCityActiveApi {

    /* renamed from: a */
    private static final PoiSameCityActiveRetrofitApi f91693a = ((PoiSameCityActiveRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiSameCityActiveRetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiSameCityActiveApi$PoiSameCityActiveRetrofitApi */
    public interface PoiSameCityActiveRetrofitApi {
        @C7730f(mo20420a = "/aweme/v1/poi/samecity/active/")
        C1592h<C35072d> getPoiSameCiteActive(@C7744t(mo20436a = "longitude") String str, @C7744t(mo20436a = "latitude") String str2, @C7744t(mo20436a = "location_permission") int i);
    }
}
