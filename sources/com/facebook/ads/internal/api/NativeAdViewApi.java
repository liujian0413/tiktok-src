package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.NativeAdViewAttributes;

public interface NativeAdViewApi {
    View render(Context context, NativeAd nativeAd);

    View render(Context context, NativeAd nativeAd, Type type);

    View render(Context context, NativeAd nativeAd, Type type, NativeAdViewAttributes nativeAdViewAttributes);

    View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes);
}
