package com.facebook.ads.internal.api;

import android.view.View.OnTouchListener;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdBase.MediaCacheFlag;
import com.facebook.ads.NativeAdListener;

public interface NativeAdBaseApi {
    void destroy();

    void downloadMedia();

    String getAdBodyText();

    String getAdCallToAction();

    NativeAdImageApi getAdChoicesIcon();

    String getAdChoicesImageUrl();

    String getAdChoicesLinkUrl();

    String getAdChoicesText();

    NativeAdImageApi getAdCoverImage();

    String getAdHeadline();

    NativeAdImageApi getAdIcon();

    String getAdLinkDescription();

    String getAdSocialContext();

    NativeAdRatingApi getAdStarRating();

    String getAdTranslation();

    String getAdUntrimmedBodyText();

    String getAdvertiserName();

    String getId();

    String getPlacementId();

    String getPromotedTranslation();

    String getSponsoredTranslation();

    boolean hasCallToAction();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(MediaCacheFlag mediaCacheFlag);

    void loadAdFromBid(String str);

    void loadAdFromBid(String str, MediaCacheFlag mediaCacheFlag);

    void onCtaBroadcast();

    void setAdListener(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase);

    void setExtraHints(ExtraHints extraHints);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void unregisterView();
}
