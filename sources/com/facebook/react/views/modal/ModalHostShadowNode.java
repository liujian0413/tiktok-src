package com.facebook.react.views.modal;

import android.graphics.Point;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;

class ModalHostShadowNode extends LayoutShadowNode {
    public ModalHostShadowNode() {
    }

    public ModalHostShadowNode mutableCopy() {
        return new ModalHostShadowNode(this);
    }

    private ModalHostShadowNode(ModalHostShadowNode modalHostShadowNode) {
        super(modalHostShadowNode);
    }

    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.addChildAt(reactShadowNodeImpl, i);
        Point modalHostSize = ModalHostHelper.getModalHostSize(getThemedContext());
        reactShadowNodeImpl.setStyleWidth((float) modalHostSize.x);
        reactShadowNodeImpl.setStyleHeight((float) modalHostSize.y);
    }
}
