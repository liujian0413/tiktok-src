package com.google.android.gms.ads;

import android.content.Context;
import android.content.pm.ProviderInfo;
import com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;

/* renamed from: com.google.android.gms.ads.j */
final class C14870j {
    /* renamed from: a */
    static void m43201a(MobileAdsInitProvider mobileAdsInitProvider, Context context, ProviderInfo providerInfo) {
        if (SymphonyAdManager.m82664a().f66279a) {
            mobileAdsInitProvider.mo37378a(context, providerInfo);
        }
    }

    /* renamed from: a */
    static boolean m43202a(MobileAdsInitProvider mobileAdsInitProvider) {
        if (!SymphonyAdManager.m82664a().f66279a) {
            return false;
        }
        return mobileAdsInitProvider.mo37379a();
    }
}
