package com.p280ss.android.ugc.aweme.poi.p335ui.coupon;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.g */
final /* synthetic */ class C35310g implements OnClickListener {

    /* renamed from: a */
    private final PoiCouponLayout f92565a;

    /* renamed from: b */
    private final CouponInfo f92566b;

    C35310g(PoiCouponLayout poiCouponLayout, CouponInfo couponInfo) {
        this.f92565a = poiCouponLayout;
        this.f92566b = couponInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f92565a.mo89843a(this.f92566b, view);
    }
}
