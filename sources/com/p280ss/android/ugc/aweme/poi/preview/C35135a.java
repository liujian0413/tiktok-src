package com.p280ss.android.ugc.aweme.poi.preview;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.a */
public final class C35135a {
    /* renamed from: a */
    public static void m113348a(String str, PoiSimpleBundle poiSimpleBundle) {
        m113347a(str, 0, poiSimpleBundle);
    }

    /* renamed from: a */
    public static void m113346a(PoiSimpleBundle poiSimpleBundle, String str) {
        C35454m.m114523a(poiSimpleBundle, "poi_pic_operation", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "slide_outer").mo59973a("poi_channel", C33230ac.m107214b()).mo59973a("poi_id", poiSimpleBundle.getPoiId()).mo59973a("poi_type", poiSimpleBundle.getPoiType()).mo59973a("group_id", poiSimpleBundle.getAwemeId()).mo59973a("previous_page", poiSimpleBundle.getPreviousPage()).mo59973a("content_type", str));
    }

    /* renamed from: a */
    public static void m113347a(String str, int i, PoiSimpleBundle poiSimpleBundle) {
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "click_top_pic").mo59973a("poi_id", poiSimpleBundle.getPoiId()).mo59973a("poi_type", poiSimpleBundle.getPoiType()).mo59973a("group_id", poiSimpleBundle.getAwemeId()).mo59973a("previous_page", poiSimpleBundle.getPreviousPage()).mo59973a("poi_channel", C33230ac.m107214b()).mo59973a("content_type", str);
        if (i > 0) {
            a.mo59970a("pic_tag", i);
        }
        C35454m.m114523a(poiSimpleBundle, "poi_pic_operation", a);
    }
}
