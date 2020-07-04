package com.p280ss.android.ugc.aweme.commercialize;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.k */
final /* synthetic */ class C24763k implements OnClickListener {

    /* renamed from: a */
    private final PoiCouponRedeemActivity f65227a;

    C24763k(PoiCouponRedeemActivity poiCouponRedeemActivity) {
        this.f65227a = poiCouponRedeemActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65227a.mo64275b(view);
    }
}
