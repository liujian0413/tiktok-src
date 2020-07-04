package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

public class AdOptionsView extends AdComponentView {
    private final AdOptionsViewApi mAdOptionsViewApi;

    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public void setIconColor(int i) {
        this.mAdOptionsViewApi.setIconColor(i);
    }

    public void setIconSizeDp(int i) {
        this.mAdOptionsViewApi.setIconSizeDp(i);
    }

    public void setSingleIcon(boolean z) {
        this.mAdOptionsViewApi.setSingleIcon(z);
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout) {
        super(context);
        this.mAdOptionsViewApi = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, this);
        attachAdComponentViewApi(this.mAdOptionsViewApi);
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, Orientation orientation, int i) {
        super(context);
        this.mAdOptionsViewApi = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, orientation, i, this);
        attachAdComponentViewApi(this.mAdOptionsViewApi);
    }
}
