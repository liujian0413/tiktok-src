package com.p280ss.android.ugc.aweme.commercialize.coupon.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.c */
final /* synthetic */ class C24608c implements OnClickListener {

    /* renamed from: a */
    private final CouponListActivity f64917a;

    C24608c(CouponListActivity couponListActivity) {
        this.f64917a = couponListActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f64917a.mo64456b(view);
    }
}
