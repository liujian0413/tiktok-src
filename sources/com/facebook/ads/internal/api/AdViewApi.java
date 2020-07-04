package com.facebook.ads.internal.api;

import android.content.res.Configuration;
import com.facebook.ads.AdListener;
import com.facebook.ads.C13098Ad;
import com.facebook.ads.ExtraHints;

public interface AdViewApi extends C13098Ad, AdViewParentApi {
    void onConfigurationChanged(Configuration configuration);

    void setAdListener(AdListener adListener);

    void setExtraHints(ExtraHints extraHints);
}
