package com.facebook.ads;

import android.content.Context;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

public class AdChoicesView extends RelativeLayout {
    public AdChoicesView(Context context, NativeAdBase nativeAdBase) {
        this((Context) Preconditions.checkNotNull(context, "Context can not be null."), nativeAdBase, false);
    }

    public AdChoicesView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout) {
        this((Context) Preconditions.checkNotNull(context, "Context can not be null."), nativeAdBase, false, nativeAdLayout);
    }

    public AdChoicesView(Context context, NativeAdBase nativeAdBase, boolean z) {
        this((Context) Preconditions.checkNotNull(context, "Context can not be null."), nativeAdBase, z, null);
    }

    public AdChoicesView(Context context, NativeAdBase nativeAdBase, boolean z, NativeAdLayout nativeAdLayout) {
        super((Context) Preconditions.checkNotNull(context, "Context can not be null."));
        DynamicLoaderFactory.makeLoader(context).createAdChoicesViewApi(this, context, nativeAdBase).initialize(z, nativeAdLayout);
    }
}
