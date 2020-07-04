package com.p280ss.android.ugc.aweme.poi.p335ui.coupon;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.d */
final /* synthetic */ class C35307d implements OnClickListener {

    /* renamed from: a */
    private final GotCouponDialog f92560a;

    C35307d(GotCouponDialog gotCouponDialog) {
        this.f92560a = gotCouponDialog;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f92560a.mo89837a(view);
    }
}
