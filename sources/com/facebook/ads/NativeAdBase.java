package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdRatingApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import org.json.JSONObject;

public abstract class NativeAdBase implements C13098Ad {
    final NativeAdBaseApi mNativeAdBaseApi;

    public static class Image {
        private final NativeAdImageApi mNativeAdImageApi;

        public int getHeight() {
            return this.mNativeAdImageApi.getHeight();
        }

        public int getWidth() {
            return this.mNativeAdImageApi.getWidth();
        }

        Image(NativeAdImageApi nativeAdImageApi) {
            this.mNativeAdImageApi = nativeAdImageApi;
        }

        public static Image fromJSONObject(JSONObject jSONObject) {
            NativeAdImageApi createNativeAdImageApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdImageApi(jSONObject);
            if (createNativeAdImageApi == null) {
                return null;
            }
            return new Image(createNativeAdImageApi);
        }
    }

    public enum MediaCacheFlag {
        NONE,
        ALL
    }

    public enum NativeComponentTag {
        AD_ICON,
        AD_TITLE,
        AD_COVER_IMAGE,
        AD_SUBTITLE,
        AD_BODY,
        AD_CALL_TO_ACTION,
        AD_SOCIAL_CONTEXT,
        AD_CHOICES_ICON,
        AD_OPTIONS_VIEW,
        AD_MEDIA;

        public static void tagView(View view, NativeComponentTag nativeComponentTag) {
            DynamicLoaderFactory.makeLoader(view.getContext()).createNativeComponentTagApi().tagView(view, nativeComponentTag);
        }
    }

    public static class Rating {
        private final NativeAdRatingApi mNativeAdRatingApi;

        public double getScale() {
            return this.mNativeAdRatingApi.getScale();
        }

        public double getValue() {
            return this.mNativeAdRatingApi.getValue();
        }

        Rating(NativeAdRatingApi nativeAdRatingApi) {
            this.mNativeAdRatingApi = nativeAdRatingApi;
        }

        public static Rating fromJSONObject(JSONObject jSONObject) {
            NativeAdRatingApi createNativeAdRatingApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdRatingApi(jSONObject);
            if (createNativeAdRatingApi == null) {
                return null;
            }
            return new Rating(createNativeAdRatingApi);
        }
    }

    public NativeAdBaseApi getInternalNativeAd() {
        return this.mNativeAdBaseApi;
    }

    public boolean isNativeConfigEnabled() {
        return false;
    }

    public void destroy() {
        this.mNativeAdBaseApi.destroy();
    }

    public void downloadMedia() {
        this.mNativeAdBaseApi.downloadMedia();
    }

    public String getAdBodyText() {
        return this.mNativeAdBaseApi.getAdBodyText();
    }

    public String getAdCallToAction() {
        return this.mNativeAdBaseApi.getAdCallToAction();
    }

    public String getAdChoicesImageUrl() {
        return this.mNativeAdBaseApi.getAdChoicesImageUrl();
    }

    public String getAdChoicesLinkUrl() {
        return this.mNativeAdBaseApi.getAdChoicesLinkUrl();
    }

    public String getAdChoicesText() {
        return this.mNativeAdBaseApi.getAdChoicesText();
    }

    public String getAdHeadline() {
        return this.mNativeAdBaseApi.getAdHeadline();
    }

    public String getAdLinkDescription() {
        return this.mNativeAdBaseApi.getAdLinkDescription();
    }

    public String getAdSocialContext() {
        return this.mNativeAdBaseApi.getAdSocialContext();
    }

    public String getAdTranslation() {
        return this.mNativeAdBaseApi.getAdTranslation();
    }

    public String getAdUntrimmedBodyText() {
        return this.mNativeAdBaseApi.getAdUntrimmedBodyText();
    }

    public NativeAdViewAttributes getAdViewAttributes() {
        return new NativeAdViewAttributes();
    }

    public String getAdvertiserName() {
        return this.mNativeAdBaseApi.getAdvertiserName();
    }

    public String getId() {
        return this.mNativeAdBaseApi.getId();
    }

    public String getPlacementId() {
        return this.mNativeAdBaseApi.getPlacementId();
    }

    public String getPromotedTranslation() {
        return this.mNativeAdBaseApi.getPromotedTranslation();
    }

    public String getSponsoredTranslation() {
        return this.mNativeAdBaseApi.getSponsoredTranslation();
    }

    public boolean hasCallToAction() {
        return this.mNativeAdBaseApi.hasCallToAction();
    }

    public boolean isAdInvalidated() {
        return this.mNativeAdBaseApi.isAdInvalidated();
    }

    public boolean isAdLoaded() {
        return this.mNativeAdBaseApi.isAdLoaded();
    }

    public void loadAd() {
        this.mNativeAdBaseApi.loadAd();
    }

    public void onCtaBroadcast() {
        this.mNativeAdBaseApi.onCtaBroadcast();
    }

    public void unregisterView() {
        this.mNativeAdBaseApi.unregisterView();
    }

    public Image getAdChoicesIcon() {
        if (this.mNativeAdBaseApi.getAdChoicesIcon() == null) {
            return null;
        }
        return new Image(this.mNativeAdBaseApi.getAdChoicesIcon());
    }

    public Image getAdCoverImage() {
        if (this.mNativeAdBaseApi.getAdCoverImage() == null) {
            return null;
        }
        return new Image(this.mNativeAdBaseApi.getAdCoverImage());
    }

    public Image getAdIcon() {
        if (this.mNativeAdBaseApi.getAdIcon() == null) {
            return null;
        }
        return new Image(this.mNativeAdBaseApi.getAdIcon());
    }

    public Rating getAdStarRating() {
        if (this.mNativeAdBaseApi.getAdStarRating() == null) {
            return null;
        }
        return new Rating(this.mNativeAdBaseApi.getAdStarRating());
    }

    public NativeAdBase(NativeAdBaseApi nativeAdBaseApi) {
        this.mNativeAdBaseApi = nativeAdBaseApi;
    }

    public void loadAdFromBid(String str) {
        this.mNativeAdBaseApi.loadAdFromBid(str);
    }

    public void setAdListener(NativeAdListener nativeAdListener) {
        this.mNativeAdBaseApi.setAdListener(nativeAdListener, this);
    }

    public void setExtraHints(ExtraHints extraHints) {
        this.mNativeAdBaseApi.setExtraHints(extraHints);
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.mNativeAdBaseApi.setOnTouchListener(onTouchListener);
    }

    public void loadAd(MediaCacheFlag mediaCacheFlag) {
        this.mNativeAdBaseApi.loadAd(mediaCacheFlag);
    }

    NativeAdBase(Context context, NativeAdBase nativeAdBase) {
        this.mNativeAdBaseApi = DynamicLoaderFactory.makeLoader(context).createNativeAdBaseApi(nativeAdBase.mNativeAdBaseApi);
    }

    public void loadAdFromBid(String str, MediaCacheFlag mediaCacheFlag) {
        this.mNativeAdBaseApi.loadAdFromBid(str, mediaCacheFlag);
    }

    public NativeAdBase(Context context, String str) {
        this.mNativeAdBaseApi = DynamicLoaderFactory.makeLoader(context).createNativeAdBaseApi(context, str);
    }

    public static NativeAdBase fromBidPayload(Context context, String str, String str2) throws Exception {
        return DynamicLoaderFactory.makeLoader(context).createNativeAdBaseFromBidPayload(context, str, str2);
    }
}
