package com.facebook.react.views.viewpager;

import android.view.View;
import com.C1642a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;

@ReactModule(name = "AndroidViewPager")
public class ReactViewPagerManager extends ViewGroupManager<ReactViewPager> {
    public String getName() {
        return "AndroidViewPager";
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m41789of("setPage", Integer.valueOf(1), "setPageWithoutAnimation", Integer.valueOf(2));
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m41790of("topPageScroll", MapBuilder.m41788of("registrationName", "onPageScroll"), "topPageScrollStateChanged", MapBuilder.m41788of("registrationName", "onPageScrollStateChanged"), "topPageSelected", MapBuilder.m41788of("registrationName", "onPageSelected"));
    }

    /* access modifiers changed from: protected */
    public ReactViewPager createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactViewPager(themedReactContext);
    }

    public int getChildCount(ReactViewPager reactViewPager) {
        return reactViewPager.getViewCountInAdapter();
    }

    public void removeViewAt(ReactViewPager reactViewPager, int i) {
        reactViewPager.removeViewFromAdapter(i);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setScrollEnabled(z);
    }

    @ReactProp(defaultBoolean = false, name = "peekEnabled")
    public void setPeekEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setClipToPadding(!z);
    }

    public View getChildAt(ReactViewPager reactViewPager, int i) {
        return reactViewPager.getViewFromAdapter(i);
    }

    @ReactProp(defaultFloat = 0.0f, name = "pageMargin")
    public void setPageMargin(ReactViewPager reactViewPager, float f) {
        reactViewPager.setPageMargin((int) PixelUtil.toPixelFromDIP(f));
    }

    public void addView(ReactViewPager reactViewPager, View view, int i) {
        reactViewPager.addViewToAdapter(view, i);
    }

    public void receiveCommand(ReactViewPager reactViewPager, int i, ReadableArray readableArray) {
        C13854a.m40916b(reactViewPager);
        C13854a.m40916b(readableArray);
        switch (i) {
            case 1:
                reactViewPager.setCurrentItemFromJs(readableArray.getInt(0), true);
                return;
            case 2:
                reactViewPager.setCurrentItemFromJs(readableArray.getInt(0), false);
                return;
            default:
                throw new IllegalArgumentException(C1642a.m8034a("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), getClass().getSimpleName()}));
        }
    }
}
