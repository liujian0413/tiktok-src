package com.p280ss.android.ugc.aweme.commercialize;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.j */
final /* synthetic */ class C24762j implements OnClickListener {

    /* renamed from: a */
    private final PoiCouponRedeemActivity f65226a;

    C24762j(PoiCouponRedeemActivity poiCouponRedeemActivity) {
        this.f65226a = poiCouponRedeemActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65226a.mo64273a(view);
    }
}
