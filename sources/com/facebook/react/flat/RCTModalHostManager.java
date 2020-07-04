package com.facebook.react.flat;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.views.modal.ReactModalHostManager;

public class RCTModalHostManager extends ReactModalHostManager {
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return FlatReactModalShadowNode.class;
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new FlatReactModalShadowNode();
    }
}
