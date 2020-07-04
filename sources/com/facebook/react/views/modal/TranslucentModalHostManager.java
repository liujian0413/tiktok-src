package com.facebook.react.views.modal;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;

@ReactModule(name = "RCTModalHostView")
public class TranslucentModalHostManager extends ReactModalHostManager {
    public String getName() {
        return "RCTModalHostView";
    }

    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return TranslucentModalHostShadowNode.class;
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new TranslucentModalHostShadowNode();
    }

    /* access modifiers changed from: protected */
    public ReactModalHostView createViewInstance(ThemedReactContext themedReactContext) {
        return new TranslucentModalHostView(themedReactContext);
    }
}
