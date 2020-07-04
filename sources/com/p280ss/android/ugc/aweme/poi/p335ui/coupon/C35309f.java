package com.p280ss.android.ugc.aweme.poi.p335ui.coupon;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.f */
final /* synthetic */ class C35309f implements OnClickListener {

    /* renamed from: a */
    private final PoiAdLayout f92561a;

    /* renamed from: b */
    private final PoiSimpleBundle f92562b;

    /* renamed from: c */
    private final String f92563c;

    /* renamed from: d */
    private final AwemeRawAd f92564d;

    C35309f(PoiAdLayout poiAdLayout, PoiSimpleBundle poiSimpleBundle, String str, AwemeRawAd awemeRawAd) {
        this.f92561a = poiAdLayout;
        this.f92562b = poiSimpleBundle;
        this.f92563c = str;
        this.f92564d = awemeRawAd;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f92561a.mo89840a(this.f92562b, this.f92563c, this.f92564d, view);
    }
}
