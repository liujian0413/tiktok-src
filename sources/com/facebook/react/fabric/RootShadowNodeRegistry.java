package com.facebook.react.fabric;

import android.util.SparseArray;
import com.facebook.react.uimanager.ReactShadowNode;

public class RootShadowNodeRegistry {
    private final SparseArray<ReactShadowNode> mTagsToRootNodes = new SparseArray<>();

    public void removeNode(int i) {
        this.mTagsToRootNodes.remove(i);
    }

    public void addNode(ReactShadowNode reactShadowNode) {
        this.mTagsToRootNodes.put(reactShadowNode.getReactTag(), reactShadowNode);
    }

    public ReactShadowNode getNode(int i) {
        return (ReactShadowNode) this.mTagsToRootNodes.get(i);
    }
}
