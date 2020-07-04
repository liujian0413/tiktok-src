package com.bytedance.ies.uikit.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch;

public class ImageViewTouchViewPager extends SSViewPager {
    public ImageViewTouchViewPager(Context context) {
        super(context);
    }

    public ImageViewTouchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ImageViewTouch) {
            return ((ImageViewTouch) view).mo26655a(i);
        }
        return super.canScroll(view, z, i, i2, i3);
    }
}
