package com.p280ss.android.ugc.aweme.discover.adapter;

import com.p280ss.android.ugc.aweme.discover.model.Banner;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.e */
final /* synthetic */ class C26485e implements Callable {

    /* renamed from: a */
    private final int f69858a;

    /* renamed from: b */
    private final Banner f69859b;

    /* renamed from: c */
    private final String f69860c;

    C26485e(int i, Banner banner, String str) {
        this.f69858a = i;
        this.f69859b = banner;
        this.f69860c = str;
    }

    public final Object call() {
        return DiscoverBannerViewHolder.m86788a(this.f69858a, this.f69859b, this.f69860c);
    }
}
