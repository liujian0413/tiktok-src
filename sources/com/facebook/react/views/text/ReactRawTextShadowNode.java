package com.facebook.react.views.text;

import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ReactRawTextShadowNode extends ReactShadowNodeImpl {
    private String mText;

    public ReactRawTextShadowNode() {
    }

    public String getText() {
        return this.mText;
    }

    public boolean isVirtual() {
        return true;
    }

    public ReactShadowNodeImpl mutableCopy() {
        return new ReactRawTextShadowNode(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getViewClass());
        sb.append(" [text: ");
        sb.append(this.mText);
        sb.append("]");
        return sb.toString();
    }

    private ReactRawTextShadowNode(ReactRawTextShadowNode reactRawTextShadowNode) {
        super(reactRawTextShadowNode);
        this.mText = reactRawTextShadowNode.mText;
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        this.mText = str;
        markUpdated();
    }
}
