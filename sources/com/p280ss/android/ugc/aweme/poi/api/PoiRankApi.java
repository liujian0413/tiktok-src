package com.p280ss.android.ugc.aweme.poi.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35115e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiRankApi */
public final class PoiRankApi {

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiRankApi$PoiRankRetrofitApi */
    public interface PoiRankRetrofitApi {
        @C7730f(mo20420a = "/aweme/v1/poi/rank/filter/")
        C1592h<C35115e> getPoiRankFilter(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "longitude") String str, @C7744t(mo20436a = "latitude") String str2, @C7744t(mo20436a = "business_area_option_type") String str3, @C7744t(mo20436a = "class_option_type") String str4, @C7744t(mo20436a = "city_code") String str5, @C7744t(mo20436a = "poi_class_code") int i2, @C7744t(mo20436a = "district_code") String str6, @C7744t(mo20436a = "backend_type_code") String str7);

        @C7730f(mo20420a = "/aweme/v1/poi/rank/aweme/")
        C1592h<Object> getPoiRankList(@C7744t(mo20436a = "longitude") String str, @C7744t(mo20436a = "latitude") String str2, @C7744t(mo20436a = "city_code") String str3, @C7744t(mo20436a = "backend_type_codes") String str4);
    }
}
