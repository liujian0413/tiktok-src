package com.bytedance.p073ad.symphony.provider;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.p073ad.symphony.p076b.C2112c;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.provider.C2192a.C2194a;

/* renamed from: com.bytedance.ad.symphony.provider.AbsInterstitialAdProvider */
public abstract class AbsInterstitialAdProvider extends C2192a<Object, C2112c> {
    public static final int ADMOB_PROVIDER_ID = getInterstitialAdProviderId(2);
    public static final int FACEBOOK_PROVIDER_ID = getInterstitialAdProviderId(1);
    public static final SparseArray<C2194a> SUPPORT_INTERSTITIAL_AD_PROVIDERS = new SparseArray<>();

    public static int getInterstitialAdProviderId(int i) {
        return i + 50;
    }

    static {
        SUPPORT_INTERSTITIAL_AD_PROVIDERS.put(FACEBOOK_PROVIDER_ID, new C2194a(FACEBOOK_PROVIDER_ID, "interstitial-facebook", "com.bytedance.ad.symphony.interstitial.fb.FbInterstitialAdProvider"));
        SUPPORT_INTERSTITIAL_AD_PROVIDERS.put(ADMOB_PROVIDER_ID, new C2194a(ADMOB_PROVIDER_ID, "interstitial-admob", "com.bytedance.ad.symphony.interstitial.admob.AdMobInterstitialAdProvider"));
    }

    public static boolean isAdMobInterstitialAdProvider(int i) {
        if (getRealProviderId(i) == ADMOB_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isFbInterstitialAdProvider(int i) {
        if (getRealProviderId(i) == FACEBOOK_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public AbsInterstitialAdProvider(Context context, C2142a aVar, C2112c cVar) {
        super(context, aVar, cVar);
    }
}
