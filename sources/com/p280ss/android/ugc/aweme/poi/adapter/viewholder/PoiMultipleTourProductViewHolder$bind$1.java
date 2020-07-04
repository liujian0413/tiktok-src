package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiMultipleTourProductViewHolder$bind$1 */
public final class PoiMultipleTourProductViewHolder$bind$1 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ PoiMultipleTourProductViewHolder f91535a;

    /* renamed from: b */
    final /* synthetic */ PoiSimpleBundle f91536b;

    PoiMultipleTourProductViewHolder$bind$1(PoiMultipleTourProductViewHolder poiMultipleTourProductViewHolder, PoiSimpleBundle poiSimpleBundle) {
        this.f91535a = poiMultipleTourProductViewHolder;
        this.f91536b = poiSimpleBundle;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        String str;
        C7573i.m23587b(recyclerView, "recyclerView");
        if (i == 0) {
            PoiSimpleBundle poiSimpleBundle = this.f91535a.f91528a;
            String str2 = "show_poi_product";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "slide");
            String str3 = "poi_id";
            PoiSimpleBundle poiSimpleBundle2 = this.f91536b;
            if (poiSimpleBundle2 != null) {
                str = poiSimpleBundle2.getPoiId();
            } else {
                str = null;
            }
            C35454m.m114523a(poiSimpleBundle, str2, a.mo59973a(str3, str).mo59973a("product_id", "").mo59973a("poi_posititon", "poi_page"));
        }
    }
}
