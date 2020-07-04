package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

class ProgressBarContainerView extends FrameLayout {
    private boolean mAnimating = true;
    private Integer mColor;
    private boolean mIndeterminate = true;
    private double mProgress;
    private ProgressBar mProgressBar;

    public void apply() {
        if (this.mProgressBar != null) {
            this.mProgressBar.setIndeterminate(this.mIndeterminate);
            setColor(this.mProgressBar);
            this.mProgressBar.setProgress((int) (this.mProgress * 1000.0d));
            if (this.mAnimating) {
                this.mProgressBar.setVisibility(0);
            } else {
                this.mProgressBar.setVisibility(8);
            }
        } else {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
    }

    public void setAnimating(boolean z) {
        this.mAnimating = z;
    }

    public void setColor(Integer num) {
        this.mColor = num;
    }

    public void setIndeterminate(boolean z) {
        this.mIndeterminate = z;
    }

    public void setProgress(double d) {
        this.mProgress = d;
    }

    public ProgressBarContainerView(Context context) {
        super(context);
    }

    private void setColor(ProgressBar progressBar) {
        Drawable drawable;
        if (progressBar.isIndeterminate()) {
            drawable = progressBar.getIndeterminateDrawable();
        } else {
            drawable = progressBar.getProgressDrawable();
        }
        if (drawable != null) {
            if (this.mColor != null) {
                drawable.setColorFilter(this.mColor.intValue(), Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public void setStyle(String str) {
        this.mProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.mProgressBar.setMax(1000);
        removeAllViews();
        addView(this.mProgressBar, new LayoutParams(-1, -1));
    }
}
