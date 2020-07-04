package com.facebook.ads;

public interface AdListener {
    void onAdClicked(C13098Ad ad);

    void onAdLoaded(C13098Ad ad);

    void onError(C13098Ad ad, AdError adError);

    void onLoggingImpression(C13098Ad ad);
}
