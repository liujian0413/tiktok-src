package com.facebook.react.views.modal;

import android.util.DisplayMetrics;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;

public class TranslucentModalHostShadowNode extends LayoutShadowNode {
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.addChildAt(reactShadowNodeImpl, i);
        DisplayMetrics windowDisplayMetrics = DisplayMetricsHolder.getWindowDisplayMetrics();
        reactShadowNodeImpl.setStyleWidth((float) windowDisplayMetrics.widthPixels);
        reactShadowNodeImpl.setStyleHeight((float) windowDisplayMetrics.heightPixels);
    }
}
