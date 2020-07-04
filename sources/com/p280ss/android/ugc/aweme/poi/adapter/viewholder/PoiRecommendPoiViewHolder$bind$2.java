package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.bean.PoiRecommendPoiFeed;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendPoiViewHolder$bind$2 */
public final class PoiRecommendPoiViewHolder$bind$2 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ PoiSimpleBundle f91612a;

    /* renamed from: b */
    final /* synthetic */ PoiRecommendPoiFeed f91613b;

    PoiRecommendPoiViewHolder$bind$2(PoiSimpleBundle poiSimpleBundle, PoiRecommendPoiFeed poiRecommendPoiFeed) {
        this.f91612a = poiSimpleBundle;
        this.f91613b = poiRecommendPoiFeed;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        String str;
        C7573i.m23587b(recyclerView, "recyclerView");
        if (i == 0) {
            PoiSimpleBundle poiSimpleBundle = this.f91612a;
            String str2 = "poi_explore_card";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "slide").mo59973a("poi_channel", C33230ac.m107214b());
            String str3 = "poi_id";
            PoiSimpleBundle poiSimpleBundle2 = this.f91612a;
            if (poiSimpleBundle2 != null) {
                str = poiSimpleBundle2.getPoiId();
            } else {
                str = null;
            }
            C35454m.m114523a(poiSimpleBundle, str2, a.mo59973a(str3, str).mo59973a("city_info", C33230ac.m107204a()).mo59973a("content_type", C35454m.m114520a(this.f91613b.getRecommendType().intValue())));
        }
    }
}
