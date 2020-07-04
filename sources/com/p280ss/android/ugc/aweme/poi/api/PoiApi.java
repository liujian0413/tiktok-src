package com.p280ss.android.ugc.aweme.poi.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.model.C35106c;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiApi */
public final class PoiApi {

    /* renamed from: a */
    private static final PoiService f91683a = ((PoiService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiService.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiApi$PoiService */
    public interface PoiService {
        @C6457h(mo15740a = "/aweme/v1/poi/aweme/")
        C18253l<C35106c> queryPoiAwemeList(@C6474y(mo15757a = "poiId") String str, @C6474y(mo15757a = "count") int i, @C6474y(mo15757a = "cursor") int i2, @C6474y(mo15757a = "aweme_type") int i3);

        @C6457h(mo15740a = "/aweme/v1/poi/detail/")
        C18253l<PoiDetail> queryPoiDetail(@C6474y(mo15757a = "poi_id") String str, @C6474y(mo15757a = "longitude") String str2, @C6474y(mo15757a = "latitude") String str3, @C6474y(mo15757a = "extensions") String str4);
    }

    /* renamed from: a */
    public static C35106c m113163a(String str, int i, int i2, int i3) throws Exception {
        return (C35106c) f91683a.queryPoiAwemeList(str, i3, i, i2).get();
    }
}
