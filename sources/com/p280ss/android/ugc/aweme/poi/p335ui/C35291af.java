package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.af */
final /* synthetic */ class C35291af implements OnClickListener {

    /* renamed from: a */
    private final PoiRoutePresenter f92504a;

    C35291af(PoiRoutePresenter poiRoutePresenter) {
        this.f92504a = poiRoutePresenter;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f92504a.mo89789a(view);
    }
}
