package com.p280ss.android.ugc.aweme.poi.api;

import bolts.C1592h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.model.PoiJoinActivityResponse;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiCouponApi */
public final class PoiCouponApi {

    /* renamed from: a */
    private static final RealApi f91684a = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiCouponApi$RealApi */
    public interface RealApi {
        @C7730f(mo20420a = "/aweme/v2/coupon/join/activity")
        C1592h<PoiJoinActivityResponse> getJoinPoiActivity(@C7744t(mo20436a = "poi_id") String str, @C7744t(mo20436a = "activity_id") int i);
    }

    /* renamed from: a */
    public static C1592h<PoiJoinActivityResponse> m113164a(String str, int i) {
        return f91684a.getJoinPoiActivity(str, i);
    }
}
