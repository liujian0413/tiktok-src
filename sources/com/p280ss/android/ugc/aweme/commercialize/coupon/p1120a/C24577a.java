package com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.commercialize.coupon.api.CouponApi;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.C24593a;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.a */
public final class C24577a extends C34028a<C24593a> {
    /* renamed from: a */
    public final void mo64371a(final int i, final String str) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return CouponApi.m80641a(i, str);
            }
        }, 0);
    }
}
