package com.p280ss.android.ugc.aweme.commercialize.coupon.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.d */
final /* synthetic */ class C24609d implements OnClickListener {

    /* renamed from: a */
    private final CouponListActivity f64918a;

    C24609d(CouponListActivity couponListActivity) {
        this.f64918a = couponListActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f64918a.mo64455a(view);
    }
}
