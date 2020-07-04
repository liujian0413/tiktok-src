package com.facebook.react.flat;

import android.view.View;
import com.facebook.react.flat.FlatShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;

abstract class VirtualViewManager<C extends FlatShadowNode> extends ViewManager<View, C> {
    VirtualViewManager() {
    }

    public void updateExtraData(View view, Object obj) {
    }

    public View createViewInstance(ThemedReactContext themedReactContext) {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" doesn't map to a View");
        throw new RuntimeException(sb.toString());
    }
}
