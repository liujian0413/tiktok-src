package com.p280ss.android.ugc.aweme.poi.p335ui.detail.multirows;

import android.content.Context;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.poi.map.C35095h;
import com.p280ss.android.ugc.aweme.poi.map.MapLayout;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.utils.C35441aa;
import com.p280ss.android.ugc.aweme.poi.utils.C35442b;
import com.p280ss.android.ugc.aweme.poi.utils.C35462r;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.multirows.b */
public final class C35357b {

    /* renamed from: a */
    private MapLayout f92676a;

    /* renamed from: b */
    private AmeBaseFragment f92677b;

    /* renamed from: c */
    private Context f92678c;

    /* renamed from: d */
    private PoiStruct f92679d;

    /* renamed from: e */
    private double[] f92680e;

    /* renamed from: f */
    private LocationResult f92681f;

    /* renamed from: a */
    private final float m114096a() {
        if (C35441aa.m114462a(this.f92679d, this.f92681f)) {
            MapLayout mapLayout = this.f92676a;
            if (mapLayout == null) {
                C7573i.m23583a("mMapLayout");
            }
            return mapLayout.getZoomBig();
        }
        MapLayout mapLayout2 = this.f92676a;
        if (mapLayout2 == null) {
            C7573i.m23583a("mMapLayout");
        }
        return mapLayout2.getZoomSmall();
    }

    /* renamed from: a */
    public final void mo89929a(PoiStruct poiStruct) {
        if (poiStruct == null) {
            C6877n.m21447a("poi_crash_log", C6869c.m21381a().mo16887a("poi_service", "poi_map").mo16887a("errorDesc", "poidetail is null").mo16887a("poitype", "map").mo16888b());
            return;
        }
        this.f92679d = poiStruct;
        this.f92681f = C32640a.m105721a().mo84021a();
        this.f92680e = C35442b.m114470a(poiStruct.getPoiLatitude(), poiStruct.getPoiLongitude());
        double[] dArr = this.f92680e;
        if (dArr != null) {
            MapLayout mapLayout = this.f92676a;
            if (mapLayout == null) {
                C7573i.m23583a("mMapLayout");
            }
            if (mapLayout == null) {
                C7573i.m23580a();
            }
            mapLayout.mo88950a(C35462r.m114549a(this.f92678c), dArr[0], dArr[1], m114096a(), (C35095h) null);
        }
    }

    /* renamed from: a */
    public final void mo89928a(AmeBaseFragment ameBaseFragment, MapLayout mapLayout) {
        C7573i.m23587b(ameBaseFragment, "fragment");
        C7573i.m23587b(mapLayout, "mapLayout");
        this.f92677b = ameBaseFragment;
        this.f92676a = mapLayout;
        this.f92678c = mapLayout.getContext();
    }
}
