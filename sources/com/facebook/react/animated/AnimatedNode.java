package com.facebook.react.animated;

import com.facebook.infer.p728a.C13854a;
import java.util.ArrayList;
import java.util.List;

abstract class AnimatedNode {
    int mActiveIncomingNodes;
    int mBFSColor;
    List<AnimatedNode> mChildren;
    int mTag = -1;

    public void onAttachedToNode(AnimatedNode animatedNode) {
    }

    public void onDetachedFromNode(AnimatedNode animatedNode) {
    }

    public void update() {
    }

    AnimatedNode() {
    }

    public final void removeChild(AnimatedNode animatedNode) {
        if (this.mChildren != null) {
            animatedNode.onDetachedFromNode(this);
            this.mChildren.remove(animatedNode);
        }
    }

    public final void addChild(AnimatedNode animatedNode) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList(1);
        }
        ((List) C13854a.m40916b(this.mChildren)).add(animatedNode);
        animatedNode.onAttachedToNode(this);
    }
}
