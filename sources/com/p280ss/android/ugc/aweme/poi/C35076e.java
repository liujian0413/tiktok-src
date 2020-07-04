package com.p280ss.android.ugc.aweme.poi;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.e */
public final class C35076e {

    /* renamed from: a */
    public static final C35076e f91735a = new C35076e();

    private C35076e() {
    }

    /* renamed from: a */
    public static final void m113205a(Context context, Aweme aweme, int i, FeedParam feedParam, int i2) {
        if (aweme != null) {
            SimplePoiInfoStruct simplePoiInfoStruct = aweme.getSimplePoiInfoStruct();
            if (simplePoiInfoStruct != null) {
                C35109e a = new C35109e().mo89342c(simplePoiInfoStruct.getPoiId()).mo89350k(simplePoiInfoStruct.getPoiName()).mo89334a(simplePoiInfoStruct);
                switch (i) {
                    case 1:
                        a.mo89356q("click_poi_picture");
                        break;
                    case 2:
                        a.mo89356q("click_check_more");
                        break;
                    case 3:
                        a.mo89356q("slide_left");
                        break;
                }
                if (feedParam != null) {
                    a.mo89352m("poi_video_leaderboard").mo89329B(feedParam.getEventType()).mo89357r(feedParam.getBackendType()).mo89330C(feedParam.getCityCode()).mo89348i(feedParam.getDistrictCode()).mo89347h(feedParam.getSubClass()).mo89346g(String.valueOf(i2));
                }
                if (context != null) {
                    SmartRouter.buildRoute(context, "aweme://poi/detail/").withParam("poi_bundle", (Serializable) a.mo89331a()).open();
                }
            }
        }
    }
}
