package com.facebook.ads;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

public class NativeAdViewAttributes {
    private final NativeAdViewAttributesApi mNativeAdViewAttributesApi;

    public int getBackgroundColor() {
        return 0;
    }

    public int getButtonBorderColor() {
        return 0;
    }

    public int getButtonColor() {
        return 0;
    }

    public int getButtonTextColor() {
        return 0;
    }

    public int getDescriptionTextColor() {
        return 0;
    }

    public int getDescriptionTextSize() {
        return 0;
    }

    public NativeAdViewAttributesApi getInternalAttributes() {
        return this.mNativeAdViewAttributesApi;
    }

    public int getTitleTextColor() {
        return 0;
    }

    public int getTitleTextSize() {
        return 0;
    }

    public Typeface getTypeface() {
        return null;
    }

    public NativeAdViewAttributes setAutoplay(boolean z) {
        return this;
    }

    public NativeAdViewAttributes setAutoplayOnMobile(boolean z) {
        return this;
    }

    public boolean getAutoplay() {
        return AdSettings.isVideoAutoplay();
    }

    public boolean getAutoplayOnMobile() {
        return AdSettings.isVideoAutoplayOnMobile();
    }

    public NativeAdViewAttributes() {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewAttributesApi();
    }

    public NativeAdViewAttributes setBackgroundColor(int i) {
        this.mNativeAdViewAttributesApi.setBackgroundColor(i);
        return this;
    }

    public NativeAdViewAttributes setButtonBorderColor(int i) {
        this.mNativeAdViewAttributesApi.setCTABorderColor(i);
        return this;
    }

    public NativeAdViewAttributes setButtonColor(int i) {
        this.mNativeAdViewAttributesApi.setCTABackgroundColor(i);
        return this;
    }

    public NativeAdViewAttributes setButtonTextColor(int i) {
        this.mNativeAdViewAttributesApi.setCTATextColor(i);
        return this;
    }

    public NativeAdViewAttributes setDescriptionTextColor(int i) {
        this.mNativeAdViewAttributesApi.setSecondaryTextColor(i);
        return this;
    }

    public NativeAdViewAttributes setTitleTextColor(int i) {
        this.mNativeAdViewAttributesApi.setPrimaryTextColor(i);
        return this;
    }

    public NativeAdViewAttributes setTypeface(Typeface typeface) {
        this.mNativeAdViewAttributesApi.setTypeface(typeface);
        return this;
    }

    public NativeAdViewAttributes(Context context) {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoader(context).createNativeAdViewAttributesApi();
    }
}
