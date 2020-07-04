package com.facebook.ads.internal.api;

import android.os.Bundle;
import com.facebook.ads.C13098Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InstreamVideoAdListener;

public interface InstreamVideoAdViewApi extends C13098Ad {
    void destroy();

    String getPlacementId();

    Bundle getSaveInstanceState();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    void loadAdFromBid(String str);

    void setAdListener(InstreamVideoAdListener instreamVideoAdListener);

    void setExtraHints(ExtraHints extraHints);

    boolean show();
}
