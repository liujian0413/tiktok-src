package com.facebook.react.flat;

import android.view.View;
import com.facebook.react.views.viewpager.ReactViewPager;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import java.util.List;

public class RCTViewPagerManager extends ReactViewPagerManager {
    public void removeAllViews(ReactViewPager reactViewPager) {
        reactViewPager.removeAllViewsFromAdapter();
    }

    public void addViews(ReactViewPager reactViewPager, List<View> list) {
        reactViewPager.setViews(list);
    }
}
