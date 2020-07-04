package com.p280ss.android.ugc.aweme.commercialize;

import android.view.View;
import com.google.common.util.concurrent.C18253l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.l */
final /* synthetic */ class C24764l implements Runnable {

    /* renamed from: a */
    private final PoiCouponRedeemActivity f65228a;

    /* renamed from: b */
    private final View f65229b;

    /* renamed from: c */
    private final C18253l f65230c;

    C24764l(PoiCouponRedeemActivity poiCouponRedeemActivity, View view, C18253l lVar) {
        this.f65228a = poiCouponRedeemActivity;
        this.f65229b = view;
        this.f65230c = lVar;
    }

    public final void run() {
        this.f65228a.mo64274a(this.f65229b, this.f65230c);
    }
}
