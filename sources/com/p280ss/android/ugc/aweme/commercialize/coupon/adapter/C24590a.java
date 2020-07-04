package com.p280ss.android.ugc.aweme.commercialize.coupon.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.adapter.a */
final /* synthetic */ class C24590a implements OnClickListener {

    /* renamed from: a */
    private final C24588a f64853a;

    /* renamed from: b */
    private final CouponInfo f64854b;

    /* renamed from: c */
    private final int f64855c;

    /* renamed from: d */
    private final boolean f64856d;

    C24590a(C24588a aVar, CouponInfo couponInfo, int i, boolean z) {
        this.f64853a = aVar;
        this.f64854b = couponInfo;
        this.f64855c = i;
        this.f64856d = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f64853a.mo64385a(this.f64854b, this.f64855c, this.f64856d, view);
    }
}
