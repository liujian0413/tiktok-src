package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

public class NativeAdLayout extends AdComponentView {
    private NativeAdLayoutApi mNativeAdLayoutApi;

    public NativeAdLayoutApi getNativeAdLayoutApi() {
        return this.mNativeAdLayoutApi;
    }

    public NativeAdLayout(Context context) {
        super(context);
        initializeSelf(context);
    }

    public void setMaxWidth(int i) {
        this.mNativeAdLayoutApi.setMaxWidth(i);
    }

    public void setMinWidth(int i) {
        this.mNativeAdLayoutApi.setMinWidth(i);
    }

    private void initializeSelf(Context context) {
        this.mNativeAdLayoutApi = DynamicLoaderFactory.makeLoader(context).createNativeAdLayoutApi();
        attachAdComponentViewApi(this.mNativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public NativeAdLayout(Context context, NativeAdLayoutApi nativeAdLayoutApi) {
        super(context);
        this.mNativeAdLayoutApi = nativeAdLayoutApi;
        attachAdComponentViewApi(nativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initializeSelf(context);
    }
}
