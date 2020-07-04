package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.EnumSet;

public class InterstitialAd implements C13098Ad {
    private final InterstitialAdApi mInterstitialAdApi;

    public void destroy() {
        this.mInterstitialAdApi.destroy();
    }

    public String getPlacementId() {
        return this.mInterstitialAdApi.getPlacementId();
    }

    public boolean isAdInvalidated() {
        return this.mInterstitialAdApi.isAdInvalidated();
    }

    public boolean isAdLoaded() {
        return this.mInterstitialAdApi.isAdLoaded();
    }

    public void loadAd() {
        this.mInterstitialAdApi.loadAd();
    }

    public boolean show() {
        return this.mInterstitialAdApi.show();
    }

    public void loadAdFromBid(String str) {
        this.mInterstitialAdApi.loadAdFromBid(str);
    }

    public void setAdListener(InterstitialAdListener interstitialAdListener) {
        this.mInterstitialAdApi.setAdListener(interstitialAdListener);
    }

    public void setExtraHints(ExtraHints extraHints) {
        this.mInterstitialAdApi.setExtraHints(extraHints);
    }

    public void setRewardedAdListener(RewardedAdListener rewardedAdListener) {
        this.mInterstitialAdApi.setRewardedAdListener(rewardedAdListener);
    }

    public void loadAd(EnumSet<CacheFlag> enumSet) {
        this.mInterstitialAdApi.loadAd(enumSet);
    }

    public InterstitialAd(Context context, String str) {
        this.mInterstitialAdApi = DynamicLoaderFactory.makeLoader(context).createInterstitialAd(context, str, this);
    }

    public void loadAdFromBid(EnumSet<CacheFlag> enumSet, String str) {
        this.mInterstitialAdApi.loadAdFromBid(enumSet, str);
    }
}
