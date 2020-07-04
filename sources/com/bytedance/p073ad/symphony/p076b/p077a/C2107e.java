package com.bytedance.p073ad.symphony.p076b.p077a;

import com.bytedance.p073ad.symphony.p076b.C2112c;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.provider.AbsInterstitialAdProvider;
import java.util.List;

/* renamed from: com.bytedance.ad.symphony.b.a.e */
public final class C2107e extends C2096a<Object> implements C2112c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7783a() {
        return "InterstitialAdManager";
    }

    public C2107e(C2108f fVar) {
        super(fVar, "sp_interstitial_fill_strategy", "{\"display_sort\":[51000,52000],\"preload_sort\":[[51000],[52000],[5000]]}");
    }

    /* renamed from: b */
    public final void mo7804b(List<C2142a> list) {
        mo7787a(list, AbsInterstitialAdProvider.SUPPORT_INTERSTITIAL_AD_PROVIDERS, C2112c.class);
    }
}
