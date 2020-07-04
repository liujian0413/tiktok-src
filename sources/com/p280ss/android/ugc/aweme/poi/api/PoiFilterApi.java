package com.p280ss.android.ugc.aweme.poi.api;

import bolts.C1592h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.feed.model.poi.PoiFilterListResponse;
import com.p280ss.android.ugc.aweme.feed.model.poi.PoiFilterOptionResponse;
import com.p280ss.android.ugc.aweme.feed.model.poi.PoiRankBannerResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiFilterApi */
public final class PoiFilterApi {

    /* renamed from: a */
    private static final PoiFilterRetrofitApi f91685a = ((PoiFilterRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiFilterRetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiFilterApi$PoiFilterRetrofitApi */
    public interface PoiFilterRetrofitApi {
        @C7730f(mo20420a = "/aweme/v1/poi/filter/")
        C1592h<PoiFilterListResponse> getPoiFilterList(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "longitude") String str, @C7744t(mo20436a = "latitude") String str2, @C7744t(mo20436a = "business_area_option_type") String str3, @C7744t(mo20436a = "sort_option_type") String str4, @C7744t(mo20436a = "class_option_type") String str5, @C7744t(mo20436a = "city_code") String str6, @C7744t(mo20436a = "poi_class_code") int i2);

        @C7730f(mo20420a = "/aweme/v1/poi/filter/option/")
        C1592h<PoiFilterOptionResponse> getPoiFilterOption(@C7744t(mo20436a = "city_code") String str, @C7744t(mo20436a = "poi_class_code") int i);

        @C7730f(mo20420a = "/aweme/v1/poi/vertical/banner/")
        C1592h<PoiRankBannerResponse> getPoiRankBanner(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "longitude") String str, @C7744t(mo20436a = "latitude") String str2, @C7744t(mo20436a = "business_area_option_type") String str3, @C7744t(mo20436a = "sort_option_type") String str4, @C7744t(mo20436a = "class_option_type") String str5, @C7744t(mo20436a = "city_code") String str6, @C7744t(mo20436a = "poi_class_code") int i2, @C7744t(mo20436a = "poi_id") String str7);

        @C7730f(mo20420a = "/aweme/v1/poi/recommend/filter/")
        C1592h<PoiFilterListResponse> getPoiRecommendFilterList(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "longitude") String str, @C7744t(mo20436a = "latitude") String str2, @C7744t(mo20436a = "business_area_option_type") String str3, @C7744t(mo20436a = "sort_option_type") String str4, @C7744t(mo20436a = "class_option_type") String str5, @C7744t(mo20436a = "city_code") String str6, @C7744t(mo20436a = "poi_class_code") int i2, @C7744t(mo20436a = "poi_id") String str7, @C7744t(mo20436a = "recommend_type") int i3);
    }
}
