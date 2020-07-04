package com.facebook.ads;

public interface RewardedVideoAdListener extends AdListener {
    void onLoggingImpression(C13098Ad ad);

    void onRewardedVideoClosed();

    void onRewardedVideoCompleted();
}
