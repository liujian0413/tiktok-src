package com.bytedance.p073ad.symphony.provider;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.p073ad.symphony.p076b.C2111b;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.provider.C2192a.C2194a;

/* renamed from: com.bytedance.ad.symphony.provider.AbsBannerAdProvider */
public abstract class AbsBannerAdProvider extends C2192a<Object, C2111b> {
    public static final int ADMOB_PROVIDER_ID = getBannerAdProviderId(2);
    public static final int FACEBOOK_PROVIDER_ID = getBannerAdProviderId(1);
    public static final int INMOBI_PROVIDER_ID = getBannerAdProviderId(3);
    public static final SparseArray<C2194a> SUPPORT_BANNER_AD_PROVIDERS = new SparseArray<>();

    public static int getBannerAdProviderId(int i) {
        return i + 100;
    }

    static {
        SUPPORT_BANNER_AD_PROVIDERS.put(FACEBOOK_PROVIDER_ID, new C2194a(FACEBOOK_PROVIDER_ID, "banner-facebook", "com.bytedance.ad.symphony.banner.fb.FbBannerAdProvider"));
        SUPPORT_BANNER_AD_PROVIDERS.put(ADMOB_PROVIDER_ID, new C2194a(ADMOB_PROVIDER_ID, "banner-admob", "com.bytedance.ad.symphony.banner.admob.AdMobBannerAdProvider"));
        SUPPORT_BANNER_AD_PROVIDERS.put(INMOBI_PROVIDER_ID, new C2194a(INMOBI_PROVIDER_ID, "banner-inmobi", "com.bytedance.ad.symphony.banner.inmobi.InMobiBannerAdProvider"));
    }

    public static boolean isAdMobBannerAdProvider(int i) {
        if (getRealProviderId(i) == ADMOB_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isFbBannerAdProvider(int i) {
        if (getRealProviderId(i) == FACEBOOK_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isInMobiAdProvider(int i) {
        if (getRealProviderId(i) == INMOBI_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public AbsBannerAdProvider(Context context, C2142a aVar, C2111b bVar) {
        super(context, aVar, bVar);
    }
}
