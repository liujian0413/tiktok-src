package com.facebook.ads;

/* renamed from: com.facebook.ads.Ad */
public interface C13098Ad {
    void destroy();

    String getPlacementId();

    boolean isAdInvalidated();

    void loadAd();

    void loadAdFromBid(String str);

    void setExtraHints(ExtraHints extraHints);
}
