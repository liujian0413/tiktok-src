package com.bytedance.android.live.uikit.viewpager;

import android.view.View;
import com.bytedance.android.live.uikit.p170a.p171a.C3499a;

public class ImageViewTouchViewPager extends SSViewPager {
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof C3499a) {
            return ((C3499a) view).mo10536a(i);
        }
        return super.canScroll(view, z, i, i2, i3);
    }
}
