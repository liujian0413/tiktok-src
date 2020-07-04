package com.zhihu.matisse.internal.p1856ui.widget;

import android.content.Context;
import android.support.p022v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import p1874it.sephiroth.android.library.imagezoom.ImageViewTouch;

/* renamed from: com.zhihu.matisse.internal.ui.widget.PreviewViewPager */
public class PreviewViewPager extends ViewPager {
    public PreviewViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (!(view instanceof ImageViewTouch)) {
            return super.canScroll(view, z, i, i2, i3);
        }
        if (((ImageViewTouch) view).mo119938a(i) || super.canScroll(view, z, i, i2, i3)) {
            return true;
        }
        return false;
    }
}
