package com.p280ss.android.ugc.aweme.poi.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.feed.model.poi.PoiNewsFeedResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiNewsApi */
public final class PoiNewsApi {

    /* renamed from: a */
    public static final String f91691a = Api.f60502b;

    /* renamed from: b */
    private static final PoiNewsRetrofitApi f91692b = ((PoiNewsRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(PoiNewsRetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiNewsApi$PoiNewsRetrofitApi */
    public interface PoiNewsRetrofitApi {
        @C7730f(mo20420a = "/aweme/v1/converging/feed/")
        C1592h<PoiNewsFeedResponse> getPoiNewsList(@C7744t(mo20436a = "city") String str, @C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "longitude") String str2, @C7744t(mo20436a = "latitude") String str3);
    }

    /* renamed from: a */
    public static C1592h<PoiNewsFeedResponse> m113168a(String str, int i, int i2, String str2, String str3) {
        return f91692b.getPoiNewsList(str, i, 20, str2, str3);
    }
}
