package com.p280ss.android.ugc.aweme.poi.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.d */
final /* synthetic */ class C35015d implements OnClickListener {

    /* renamed from: a */
    private final C35009a f91472a;

    /* renamed from: b */
    private final PoiClassRankBannerStruct f91473b;

    /* renamed from: c */
    private final int f91474c;

    C35015d(C35009a aVar, PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
        this.f91472a = aVar;
        this.f91473b = poiClassRankBannerStruct;
        this.f91474c = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91472a.mo88772a(this.f91473b, this.f91474c, view);
    }
}
