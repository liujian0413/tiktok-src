package com.p280ss.android.ugc.aweme.profile.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.profile.model.CityListBean;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.SelectCityApi */
public interface SelectCityApi {
    @C7730f(mo20420a = "/aweme/v1/hide/location/")
    C1592h<String> hideLocation(@C7744t(mo20436a = "hide_location") int i);

    @C7730f(mo20420a = "/api/2/article/city/")
    C1592h<CityListBean> queryCityList();
}
