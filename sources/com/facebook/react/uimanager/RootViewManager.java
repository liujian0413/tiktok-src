package com.facebook.react.uimanager;

import android.view.ViewGroup;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;

public class RootViewManager extends ViewGroupManager<ViewGroup> {
    public String getName() {
        return "RootView";
    }

    /* access modifiers changed from: protected */
    public ViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new SizeMonitoringFrameLayout(themedReactContext);
    }
}
