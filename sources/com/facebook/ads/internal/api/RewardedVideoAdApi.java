package com.facebook.ads.internal.api;

import com.facebook.ads.C13098Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;

public interface RewardedVideoAdApi extends C13098Ad {
    void destroy();

    String getPlacementId();

    int getVideoDuration();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(boolean z);

    void loadAdFromBid(String str);

    void loadAdFromBid(String str, boolean z);

    void setAdListener(RewardedVideoAdListener rewardedVideoAdListener);

    void setExtraHints(ExtraHints extraHints);

    void setRewardData(RewardData rewardData);

    boolean show();

    boolean show(int i);
}
