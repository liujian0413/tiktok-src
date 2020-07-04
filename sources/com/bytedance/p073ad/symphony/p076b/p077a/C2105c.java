package com.bytedance.p073ad.symphony.p076b.p077a;

import com.bytedance.p073ad.symphony.p076b.C2111b;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.provider.AbsBannerAdProvider;
import java.util.List;

/* renamed from: com.bytedance.ad.symphony.b.a.c */
public final class C2105c extends C2096a<Object> implements C2111b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7783a() {
        return "BannerAdManager";
    }

    public C2105c(C2106d dVar) {
        super(dVar, "sp_banner_fill_strategy", "{\"display_sort\":[101000,102000,103000],\"preload_sort\":[[101000],[102000],[103000]]}");
    }

    /* renamed from: b */
    public final void mo7803b(List<C2142a> list) {
        mo7787a(list, AbsBannerAdProvider.SUPPORT_BANNER_AD_PROVIDERS, C2111b.class);
    }
}
