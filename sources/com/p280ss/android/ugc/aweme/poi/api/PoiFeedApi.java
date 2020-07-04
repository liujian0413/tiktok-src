package com.p280ss.android.ugc.aweme.poi.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.poi.model.C35106c;
import com.p280ss.android.ugc.aweme.poi.model.C35110f;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiQRDetailStruct;
import com.p280ss.android.ugc.aweme.poi.rate.api.C35208a;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiFeedApi */
public interface PoiFeedApi {
    @C7730f(mo20420a = "/aweme/v1/poi/aweme/")
    C1592h<C35106c> getAwemeList(@C7744t(mo20436a = "poi_id") String str, @C7744t(mo20436a = "aweme_type") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "poi_class_code") long j2, @C7744t(mo20436a = "latitude") String str2, @C7744t(mo20436a = "longitude") String str3, @C7744t(mo20436a = "display_style") long j3, @C7744t(mo20436a = "aweme_id") String str4);

    @C7730f(mo20420a = "/aweme/v1/poi/aweme/")
    C1592h<C35106c> getAwemeList(@C7744t(mo20436a = "poi_id") String str, @C7744t(mo20436a = "aweme_type") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "aweme_id") String str2);

    @C7730f(mo20420a = "/aweme/v1/poi/common/banner/")
    C1592h<C35110f> getPoiCommonBanner(@C7744t(mo20436a = "city_code") long j, @C7744t(mo20436a = "tab_type") int i, @C7744t(mo20436a = "poi_id") String str);

    @C7730f(mo20420a = "/aweme/v1/poi/detail/")
    C1592h<PoiDetail> getPoiDetail(@C7744t(mo20436a = "poi_id") String str, @C7744t(mo20436a = "longitude") String str2, @C7744t(mo20436a = "latitude") String str3, @C7744t(mo20436a = "extensions") String str4, @C7744t(mo20436a = "display_style") int i, @C7744t(mo20436a = "is_preview") int i2, @C7744t(mo20436a = "from_ads") int i3, @C7744t(mo20436a = "item_id") String str5);

    @C7730f(mo20420a = "/aweme/v1/poi/activity/scan/detail/")
    C1592h<PoiQRDetailStruct> getQRDetail(@C7744t(mo20436a = "poi_id") String str, @C7744t(mo20436a = "has_coupon_activity") boolean z, @C7744t(mo20436a = "challenge_id") String str2);

    @C7730f(mo20420a = "/aweme/v1/poi/rate/aweme/")
    C1592h<C35208a> getRateAwemeList(@C7744t(mo20436a = "poi_id") String str, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "item_has_more") int i2);

    @C7730f(mo20420a = "/aweme/v1/poi/feedback/")
    C1592h<C35110f> poiFeedback(@C7744t(mo20436a = "poi_id") String str, @C7744t(mo20436a = "type") int i);
}
