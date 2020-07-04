package com.facebook.react.flat;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

abstract class FlatViewManager extends ViewGroupManager<FlatViewGroup> {
    FlatViewManager() {
    }

    public void setBackgroundColor(FlatViewGroup flatViewGroup, int i) {
    }

    public void removeAllViews(FlatViewGroup flatViewGroup) {
        flatViewGroup.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public FlatViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new FlatViewGroup(themedReactContext);
    }
}
