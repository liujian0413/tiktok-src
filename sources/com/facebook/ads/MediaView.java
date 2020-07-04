package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.MediaViewParentApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

public class MediaView extends AdNativeComponentView {
    public boolean mImmutable;
    private MediaViewApi mMediaViewApi;

    public MediaViewApi getMediaViewApi() {
        return this.mMediaViewApi;
    }

    public void destroy() {
        this.mMediaViewApi.destroy();
    }

    public View getAdContentsView() {
        return this.mMediaViewApi.getAdContentsView();
    }

    public int getMediaHeight() {
        return this.mMediaViewApi.getMediaHeight();
    }

    public int getMediaWidth() {
        return this.mMediaViewApi.getMediaWidth();
    }

    public void addView(View view) {
        if (!this.mImmutable) {
            super.addView(view);
        }
    }

    public void bringChildToFront(View view) {
        this.mMediaViewApi.bringChildToFront(view);
    }

    public void setListener(MediaViewListener mediaViewListener) {
        this.mMediaViewApi.setListener(mediaViewListener);
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        this.mMediaViewApi.setVideoRenderer(mediaViewVideoRenderer);
    }

    public MediaView(Context context) {
        super(context);
        initializeSelf(new AdViewConstructorParams(context));
    }

    private void initializeSelf(AdViewConstructorParams adViewConstructorParams) {
        this.mMediaViewApi = DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewApi();
        this.mMediaViewApi.initialize(adViewConstructorParams, this, new MediaViewParentApi() {
            public final void bringChildToFront(View view) {
                MediaView.super.bringChildToFront(view);
            }

            public final void setImmutable(boolean z) {
                MediaView.this.mImmutable = z;
            }
        });
        this.mImmutable = true;
    }

    public void addView(View view, int i) {
        if (!this.mImmutable) {
            super.addView(view, i);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(new AdViewConstructorParams(context, attributeSet));
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (!this.mImmutable) {
            super.addView(view, layoutParams);
        }
    }

    public void addView(View view, int i, int i2) {
        if (!this.mImmutable) {
            super.addView(view, i, i2);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initializeSelf(new AdViewConstructorParams(context, attributeSet, i));
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!this.mImmutable) {
            super.addView(view, i, layoutParams);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initializeSelf(new AdViewConstructorParams(context, attributeSet, i, i2));
    }
}
