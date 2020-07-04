package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

public interface AdComponentViewParentApi {
    void addView(View view, int i, LayoutParams layoutParams);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onMeasure(int i, int i2);

    void onVisibilityChanged(View view, int i);

    void onWindowFocusChanged(boolean z);

    void setLayoutParams(LayoutParams layoutParams);

    void setMeasuredDimension(int i, int i2);
}
