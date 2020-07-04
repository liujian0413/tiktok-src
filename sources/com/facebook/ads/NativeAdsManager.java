package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.NativeAdBase.MediaCacheFlag;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

public class NativeAdsManager {
    private final NativeAdsManagerApi mNativeAdsManagerApi;

    public interface Listener {
        void onAdError(AdError adError);

        void onAdsLoaded();
    }

    public void disableAutoRefresh() {
        this.mNativeAdsManagerApi.disableAutoRefresh();
    }

    public int getUniqueNativeAdCount() {
        return this.mNativeAdsManagerApi.getUniqueNativeAdCount();
    }

    public boolean isLoaded() {
        return this.mNativeAdsManagerApi.isLoaded();
    }

    public void loadAds() {
        this.mNativeAdsManagerApi.loadAds();
    }

    public NativeAd nextNativeAd() {
        return this.mNativeAdsManagerApi.nextNativeAd();
    }

    public void setExtraHints(String str) {
        this.mNativeAdsManagerApi.setExtraHints(str);
    }

    public void setListener(Listener listener) {
        this.mNativeAdsManagerApi.setListener(listener);
    }

    public void loadAds(MediaCacheFlag mediaCacheFlag) {
        this.mNativeAdsManagerApi.loadAds(mediaCacheFlag);
    }

    public NativeAdsManager(Context context, String str, int i) {
        boolean z;
        Preconditions.checkNotNull(context, "Context can not be null");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkIsTrue(z, "Number of requested ads should be not be negative");
        this.mNativeAdsManagerApi = DynamicLoaderFactory.makeLoader(context).createNativeAdsManagerApi(context, str, i);
    }
}
