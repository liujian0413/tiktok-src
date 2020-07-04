package com.p280ss.android.ugc.aweme.poi;

import android.content.Context;
import android.os.Bundle;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am;
import com.p280ss.android.ugc.aweme.detail.operators.C26170u;
import com.p280ss.android.ugc.aweme.detail.operators.C26171v;
import com.p280ss.android.ugc.aweme.detail.operators.C26172w;
import com.p280ss.android.ugc.aweme.detail.operators.C26173x;
import com.p280ss.android.ugc.aweme.detail.operators.C26174y;
import com.p280ss.android.ugc.aweme.detail.operators.C26175z;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.poi.adapter.C35014c;
import com.p280ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p280ss.android.ugc.aweme.poi.api.PoiRankApi.PoiRankRetrofitApi;
import com.p280ss.android.ugc.aweme.poi.model.C35123l;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35111a;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35115e;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35116f;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import com.p280ss.android.ugc.aweme.poi.nearby.p1464b.C35131a;
import com.p280ss.android.ugc.aweme.poi.nearby.p1465ui.C35134a;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35005a;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35007b;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35411t;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.PoiDetailWithoutMapFragment;
import com.p280ss.android.ugc.aweme.poi.rate.p1471b.C35212a;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.p280ss.android.ugc.aweme.poi.utils.C35441aa;
import com.p280ss.android.ugc.aweme.poi.utils.C35442b;
import com.p280ss.android.ugc.aweme.poi.utils.C35456o;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.PoiServiceImpl */
public final class PoiServiceImpl implements IPoiService {
    public final void monitorSelectCityNull() {
        C35456o.m114541b();
    }

    public final void pausePoiDetailListening() {
        PoiDetailWithoutMapFragment.m113966O();
    }

    public final void resumePoiDetailListening() {
        PoiDetailWithoutMapFragment.m113965N();
    }

    public final C25673a<C35116f, C35115e> getPoiRankFilterModel() {
        return new C35123l<>();
    }

    public final boolean showPoiEntrance() {
        return C35460p.m114547a();
    }

    public final C26134am newDetailPoiFeedOperator(C25673a<?, ?> aVar) {
        return new C26170u(aVar);
    }

    public final C26134am newDetailPoiGridFeedOperator(C25673a<?, ?> aVar) {
        return new C26171v(aVar);
    }

    public final C26134am newDetailPoiNearbyHotAwemeOperator(C25673a<?, ?> aVar) {
        return new C35131a(aVar);
    }

    public final C26134am newDetailPoiOperator(C25673a<?, ?> aVar) {
        return new C26172w(aVar);
    }

    public final C26134am newDetailPoiRankListOperator(C25673a<?, ?> aVar) {
        return new C26173x(aVar);
    }

    public final C26134am newDetailPoiRateFeedOperator(C25673a<?, ?> aVar) {
        return new C26174y(aVar);
    }

    public final C26134am newDetailPoiRateOperator(C25673a<?, ?> aVar) {
        return new C35212a(aVar);
    }

    public final void mobDualCardClick(C35005a aVar) {
        C7573i.m23587b(aVar, "params");
        C35007b.m113008f(aVar);
    }

    public final void putAwemeRankData(String str, C35111a aVar) {
        C35134a.m113345a(str, aVar);
    }

    public final String getPoiRankCacheKey(String str, String str2) {
        return C35134a.m113344a(str, str2);
    }

    public final boolean isSameCity(Context context, PoiStruct poiStruct) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(poiStruct, "poiStruct");
        return C35441aa.m114459a(context, poiStruct);
    }

    public final void openPoiRankActivity(Context context, Bundle bundle) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bundle, "bundle");
        C35411t.m114384a(context, bundle);
    }

    public final String getDistance(Context context, PoiStruct poiStruct) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(poiStruct, "poiStruct");
        String a = C35442b.m114468a(context, poiStruct);
        C7573i.m23582a((Object) a, "DistanceComputer.getDistance(context, poiStruct)");
        return a;
    }

    public final void updateData(C25673a<C35116f, C35115e> aVar, C35111a aVar2) {
        C7573i.m23587b(aVar, "listModel");
        C7573i.m23587b(aVar2, "struct");
        if (!(aVar instanceof C35123l)) {
            aVar = null;
        }
        C35123l lVar = (C35123l) aVar;
        if (lVar != null) {
            lVar.mo89414a(aVar2);
        }
    }

    public final C26134am newDetailPoiSpuRateAwemeOperator(String str, int i, String str2, C25673a<?, ?> aVar) {
        C7573i.m23587b(str, "spuId");
        C7573i.m23587b(str2, "poiId");
        return new C26175z(str, i, str2, aVar);
    }

    public final String distanceStrMore(Context context, double d, double d2, double d3, double d4) {
        C7573i.m23587b(context, "context");
        String c = C35442b.m114473c(context, d, d2, d3, d4);
        C7573i.m23582a((Object) c, "DistanceComputer.distanc…, lat1, lon1, lat2, lon2)");
        return c;
    }

    public final void getPoiCommonBanner(long j, int i, String str, C6309f fVar, int i2) {
        C7573i.m23587b(str, "poiId");
        C7573i.m23587b(fVar, "handler");
        ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiFeedApi.class)).getPoiCommonBanner(j, i, str).mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(fVar, i2), C1592h.f5958b);
    }

    public final void getPoiRankList(String str, String str2, String str3, String str4, C6309f fVar, int i) {
        C7573i.m23587b(str, "longitude");
        C7573i.m23587b(str2, "latitude");
        C7573i.m23587b(str3, "cityCode");
        C7573i.m23587b(str4, "poiClassCode");
        C7573i.m23587b(fVar, "handler");
        ((PoiRankRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiRankRetrofitApi.class)).getPoiRankList(str, str2, str3, str4).mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(fVar, i), C1592h.f5958b);
    }

    public final void performPoiBannerItemClick(PoiSimpleBundle poiSimpleBundle, String str, int i, String str2, Context context, PoiClassRankBannerStruct poiClassRankBannerStruct, int i2) {
        C7573i.m23587b(str, "fromPage");
        C7573i.m23587b(str2, "backendTypeCode");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(poiClassRankBannerStruct, "struct");
        new C35014c(poiSimpleBundle, str, i, str2).mo88781a(context, poiClassRankBannerStruct, i2);
    }
}
