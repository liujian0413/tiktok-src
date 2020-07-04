package com.facebook.ads;

public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(C13098Ad ad);

    void onInterstitialDisplayed(C13098Ad ad);
}
