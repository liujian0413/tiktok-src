package com.facebook.react.views.text;

import com.facebook.react.uimanager.LayoutShadowNode;

public abstract class ReactTextInlineImageShadowNode extends LayoutShadowNode {
    public ReactTextInlineImageShadowNode() {
    }

    public abstract TextInlineImageSpan buildInlineImageSpan();

    protected ReactTextInlineImageShadowNode(ReactTextInlineImageShadowNode reactTextInlineImageShadowNode) {
        super(reactTextInlineImageShadowNode);
    }
}
