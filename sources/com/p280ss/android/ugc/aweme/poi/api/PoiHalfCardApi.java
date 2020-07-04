package com.p280ss.android.ugc.aweme.poi.api;

import bolts.C1592h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiHalfCardApi */
public final class PoiHalfCardApi {

    /* renamed from: a */
    public static final PoiHalfCardApi f91686a = new PoiHalfCardApi();

    /* renamed from: b */
    private static final RealApi f91687b = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiHalfCardApi$RealApi */
    public interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/poi/coupon/scopelist/")
        C1592h<Object> getPoiCouponScopeResp(@C7744t(mo20436a = "coupon_id") int i, @C7744t(mo20436a = "code_id") String str, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "longitude") String str2, @C7744t(mo20436a = "latitude") String str3, @C7744t(mo20436a = "city_code") String str4);

        @C7730f(mo20420a = "/aweme/v1/poi/halfcard/")
        C1592h<Object> getPoiHalfCardResp(@C7744t(mo20436a = "poi_id") String str);
    }

    private PoiHalfCardApi() {
    }
}
