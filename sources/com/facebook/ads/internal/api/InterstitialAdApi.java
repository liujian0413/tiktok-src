package com.facebook.ads.internal.api;

import com.facebook.ads.C13098Ad;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardedAdListener;
import java.util.EnumSet;

public interface InterstitialAdApi extends C13098Ad {
    boolean isAdLoaded();

    void loadAd(EnumSet<CacheFlag> enumSet);

    void loadAdFromBid(EnumSet<CacheFlag> enumSet, String str);

    void setAdListener(InterstitialAdListener interstitialAdListener);

    void setExtraHints(ExtraHints extraHints);

    void setRewardedAdListener(RewardedAdListener rewardedAdListener);

    boolean show();
}
