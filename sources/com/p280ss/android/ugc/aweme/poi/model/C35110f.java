package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.f */
public final class C35110f extends BaseResponse {
    @C6593c(mo15949a = "banner_list")

    /* renamed from: a */
    public List<PoiClassRankBannerStruct> f91836a;

    /* renamed from: a */
    public final int mo89366a() {
        if (this.f91836a != null) {
            return this.f91836a.size();
        }
        return 0;
    }
}
