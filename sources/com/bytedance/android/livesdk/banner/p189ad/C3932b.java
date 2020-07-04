package com.bytedance.android.livesdk.banner.p189ad;

import android.graphics.Bitmap;
import com.bytedance.android.live.core.widget.HSImageView;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.banner.ad.b */
final /* synthetic */ class C3932b implements C7326g {

    /* renamed from: a */
    private final BannerAdView f11768a;

    /* renamed from: b */
    private final HSImageView f11769b;

    C3932b(BannerAdView bannerAdView, HSImageView hSImageView) {
        this.f11768a = bannerAdView;
        this.f11769b = hSImageView;
    }

    public final void accept(Object obj) {
        this.f11768a.mo11482a(this.f11769b, (Bitmap) obj);
    }
}
