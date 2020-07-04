package com.p280ss.android.ugc.aweme.commercialize;

import com.google.common.util.concurrent.C18253l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.h */
final /* synthetic */ class C24753h implements Runnable {

    /* renamed from: a */
    private final PoiCouponInputActivity f65207a;

    /* renamed from: b */
    private final C18253l f65208b;

    /* renamed from: c */
    private final String f65209c;

    C24753h(PoiCouponInputActivity poiCouponInputActivity, C18253l lVar, String str) {
        this.f65207a = poiCouponInputActivity;
        this.f65208b = lVar;
        this.f65209c = str;
    }

    public final void run() {
        this.f65207a.mo64260a(this.f65208b, this.f65209c);
    }
}
