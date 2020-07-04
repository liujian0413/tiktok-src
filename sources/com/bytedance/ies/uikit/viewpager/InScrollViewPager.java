package com.bytedance.ies.uikit.viewpager;

import android.view.MotionEvent;
import android.view.ViewParent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public class InScrollViewPager extends SSViewPager {
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 0 || action == 2) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1 || action == 3) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
