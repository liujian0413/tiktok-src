package com.p280ss.android.ugc.aweme.poi.service;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35111a;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35115e;
import com.p280ss.android.ugc.aweme.poi.model.feed.C35116f;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35005a;

/* renamed from: com.ss.android.ugc.aweme.poi.service.IPoiService */
public interface IPoiService {
    String distanceStrMore(Context context, double d, double d2, double d3, double d4);

    String getDistance(Context context, PoiStruct poiStruct);

    void getPoiCommonBanner(long j, int i, String str, C6309f fVar, int i2);

    String getPoiRankCacheKey(String str, String str2);

    C25673a<C35116f, C35115e> getPoiRankFilterModel();

    void getPoiRankList(String str, String str2, String str3, String str4, C6309f fVar, int i);

    boolean isSameCity(Context context, PoiStruct poiStruct);

    void mobDualCardClick(C35005a aVar);

    void monitorSelectCityNull();

    C26134am newDetailPoiFeedOperator(C25673a<?, ?> aVar);

    C26134am newDetailPoiGridFeedOperator(C25673a<?, ?> aVar);

    C26134am newDetailPoiNearbyHotAwemeOperator(C25673a<?, ?> aVar);

    C26134am newDetailPoiOperator(C25673a<?, ?> aVar);

    C26134am newDetailPoiRankListOperator(C25673a<?, ?> aVar);

    C26134am newDetailPoiRateFeedOperator(C25673a<?, ?> aVar);

    C26134am newDetailPoiRateOperator(C25673a<?, ?> aVar);

    C26134am newDetailPoiSpuRateAwemeOperator(String str, int i, String str2, C25673a<?, ?> aVar);

    void openPoiRankActivity(Context context, Bundle bundle);

    void pausePoiDetailListening();

    void performPoiBannerItemClick(PoiSimpleBundle poiSimpleBundle, String str, int i, String str2, Context context, PoiClassRankBannerStruct poiClassRankBannerStruct, int i2);

    void putAwemeRankData(String str, C35111a aVar);

    void resumePoiDetailListening();

    boolean showPoiEntrance();

    void updateData(C25673a<C35116f, C35115e> aVar, C35111a aVar2);
}
