package com.facebook.react.flat;

final class FlatRootShadowNode extends FlatShadowNode {
    FlatRootShadowNode() {
        forceMountToView();
        signalBackingViewIsCreated();
    }
}
