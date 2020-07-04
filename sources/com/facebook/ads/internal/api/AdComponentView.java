package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

public abstract class AdComponentView extends FrameLayout {
    private AdComponentViewApi mAdComponentViewApi;
    private final AdComponentViewParentApi mAdComponentViewParentApi = new AdComponentViewParentApi() {
        public final void onAttachedToWindow() {
            AdComponentView.super.onAttachedToWindow();
        }

        public final void onDetachedFromWindow() {
            AdComponentView.super.onDetachedFromWindow();
        }

        public final void onWindowFocusChanged(boolean z) {
            AdComponentView.super.onWindowFocusChanged(z);
        }

        public final void setLayoutParams(LayoutParams layoutParams) {
            AdComponentView.super.setLayoutParams(layoutParams);
        }

        public final void onMeasure(int i, int i2) {
            AdComponentView.super.onMeasure(i, i2);
        }

        public final void onVisibilityChanged(View view, int i) {
            AdComponentView.super.onVisibilityChanged(view, i);
        }

        public final void setMeasuredDimension(int i, int i2) {
            AdComponentView.super.setMeasuredDimension(i, i2);
        }

        public final void addView(View view, int i, LayoutParams layoutParams) {
            AdComponentView.super.addView(view, i, layoutParams);
        }
    };

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (this.mAdComponentViewApi != null) {
            this.mAdComponentViewApi.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.mAdComponentViewApi != null) {
            this.mAdComponentViewApi.onDetachedFromWindow();
        } else {
            super.onDetachedFromWindow();
        }
    }

    public AdComponentView(Context context) {
        super(context);
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.mAdComponentViewApi != null) {
            this.mAdComponentViewApi.onWindowFocusChanged(z);
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    public void setLayoutParams(LayoutParams layoutParams) {
        if (this.mAdComponentViewApi != null) {
            this.mAdComponentViewApi.setLayoutParams(layoutParams);
        } else {
            super.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public void attachAdComponentViewApi(AdComponentViewApiProvider adComponentViewApiProvider) {
        if (!DynamicLoaderFactory.isFallbackMode()) {
            if (this.mAdComponentViewApi == null) {
                adComponentViewApiProvider.getAdComponentViewApi().onAttachedToView(this, this.mAdComponentViewParentApi);
                this.mAdComponentViewApi = adComponentViewApiProvider.getAdComponentViewApi();
                return;
            }
            throw new IllegalStateException("AdComponentViewApi can't be attached more then once.");
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mAdComponentViewApi != null) {
            this.mAdComponentViewApi.onMeasure(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (this.mAdComponentViewApi != null) {
            this.mAdComponentViewApi.onVisibilityChanged(view, i);
        } else {
            super.onVisibilityChanged(view, i);
        }
    }

    public AdComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdComponentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AdComponentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
