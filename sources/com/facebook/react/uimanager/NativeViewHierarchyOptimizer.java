package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

public class NativeViewHierarchyOptimizer {
    private final ShadowNodeRegistry mShadowNodeRegistry;
    private final SparseBooleanArray mTagsWithLayoutVisited = new SparseBooleanArray();
    private final UIViewOperationQueue mUIViewOperationQueue;

    static class NodeIndexPair {
        public final int index;
        public final ReactShadowNode node;

        NodeIndexPair(ReactShadowNode reactShadowNode, int i) {
            this.node = reactShadowNode;
            this.index = i;
        }
    }

    public void onBatchComplete() {
        this.mTagsWithLayoutVisited.clear();
    }

    public static void handleRemoveNode(ReactShadowNode reactShadowNode) {
        reactShadowNode.removeAllNativeChildren();
    }

    public void handleUpdateLayout(ReactShadowNode reactShadowNode) {
        applyLayoutBase(reactShadowNode);
    }

    private static boolean isLayoutOnlyAndCollapsable(ReactStylesDiffMap reactStylesDiffMap) {
        if (reactStylesDiffMap == null) {
            return true;
        }
        if (reactStylesDiffMap.hasKey("collapsable") && !reactStylesDiffMap.getBoolean("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator keySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            if (!ViewProps.isLayoutOnly(reactStylesDiffMap.mBackingMap, keySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void applyLayoutBase(ReactShadowNode reactShadowNode) {
        int reactTag = reactShadowNode.getReactTag();
        if (!this.mTagsWithLayoutVisited.get(reactTag)) {
            this.mTagsWithLayoutVisited.put(reactTag, true);
            ReactShadowNode parent = reactShadowNode.getParent();
            int screenX = reactShadowNode.getScreenX();
            int screenY = reactShadowNode.getScreenY();
            while (parent != null && parent.isLayoutOnly()) {
                screenX += Math.round(parent.getLayoutX());
                screenY += Math.round(parent.getLayoutY());
                parent = parent.getParent();
            }
            applyLayoutRecursive(reactShadowNode, screenX, screenY);
        }
    }

    public NativeViewHierarchyOptimizer(UIViewOperationQueue uIViewOperationQueue, ShadowNodeRegistry shadowNodeRegistry) {
        this.mUIViewOperationQueue = uIViewOperationQueue;
        this.mShadowNodeRegistry = shadowNodeRegistry;
    }

    private NodeIndexPair walkUpUntilNonLayoutOnly(ReactShadowNode reactShadowNode, int i) {
        while (reactShadowNode.isLayoutOnly()) {
            ReactShadowNode parent = reactShadowNode.getParent();
            if (parent == null) {
                return null;
            }
            i += parent.getNativeOffsetForChild(reactShadowNode);
            reactShadowNode = parent;
        }
        return new NodeIndexPair(reactShadowNode, i);
    }

    public void handleSetChildren(ReactShadowNode reactShadowNode, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(readableArray.getInt(i)), i);
        }
    }

    private void removeNodeFromParent(ReactShadowNode reactShadowNode, boolean z) {
        ReactShadowNode nativeParent = reactShadowNode.getNativeParent();
        if (nativeParent != null) {
            int indexOfNativeChild = nativeParent.indexOfNativeChild(reactShadowNode);
            nativeParent.removeNativeChildAt(indexOfNativeChild);
            this.mUIViewOperationQueue.enqueueManageChildren(nativeParent.getReactTag(), new int[]{indexOfNativeChild}, null, z ? new int[]{reactShadowNode.getReactTag()} : null);
            return;
        }
        for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
            removeNodeFromParent(reactShadowNode.getChildAt(childCount), z);
        }
    }

    private void transitionLayoutOnlyViewToNativeView(ReactShadowNode reactShadowNode, ReactStylesDiffMap reactStylesDiffMap) {
        boolean z;
        ReactShadowNode parent = reactShadowNode.getParent();
        if (parent == null) {
            reactShadowNode.setIsLayoutOnly(false);
            return;
        }
        int indexOf = parent.indexOf(reactShadowNode);
        parent.removeChildAt(indexOf);
        removeNodeFromParent(reactShadowNode, false);
        reactShadowNode.setIsLayoutOnly(false);
        this.mUIViewOperationQueue.enqueueCreateView(reactShadowNode.getRootNode().getThemedContext(), reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        parent.addChildAt(reactShadowNode, indexOf);
        addNodeToNode(parent, reactShadowNode, indexOf);
        for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
            addNodeToNode(reactShadowNode, reactShadowNode.getChildAt(i), i);
        }
        if (this.mTagsWithLayoutVisited.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        C13854a.m40914a(z);
        applyLayoutBase(reactShadowNode);
        for (int i2 = 0; i2 < reactShadowNode.getChildCount(); i2++) {
            applyLayoutBase(reactShadowNode.getChildAt(i2));
        }
        this.mTagsWithLayoutVisited.clear();
    }

    private void addLayoutOnlyNode(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        addGrandchildren(reactShadowNode, reactShadowNode2, i);
    }

    private void addNonLayoutNode(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        reactShadowNode.addNativeChildAt(reactShadowNode2, i);
        this.mUIViewOperationQueue.enqueueManageChildren(reactShadowNode.getReactTag(), null, new ViewAtIndex[]{new ViewAtIndex(reactShadowNode2.getReactTag(), i)}, null);
    }

    private void addGrandchildren(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        boolean z;
        C13854a.m40914a(!reactShadowNode.isLayoutOnly());
        int i2 = i;
        for (int i3 = 0; i3 < reactShadowNode2.getChildCount(); i3++) {
            ReactShadowNode childAt = reactShadowNode2.getChildAt(i3);
            if (childAt.getNativeParent() == null) {
                z = true;
            } else {
                z = false;
            }
            C13854a.m40914a(z);
            if (childAt.isLayoutOnly()) {
                int nativeChildCount = reactShadowNode.getNativeChildCount();
                addLayoutOnlyNode(reactShadowNode, childAt, i2);
                i2 += reactShadowNode.getNativeChildCount() - nativeChildCount;
            } else {
                addNonLayoutNode(reactShadowNode, childAt, i2);
                i2++;
            }
        }
    }

    private void addNodeToNode(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        int nativeOffsetForChild = reactShadowNode.getNativeOffsetForChild(reactShadowNode.getChildAt(i));
        if (reactShadowNode.isLayoutOnly()) {
            NodeIndexPair walkUpUntilNonLayoutOnly = walkUpUntilNonLayoutOnly(reactShadowNode, nativeOffsetForChild);
            if (walkUpUntilNonLayoutOnly != null) {
                ReactShadowNode reactShadowNode3 = walkUpUntilNonLayoutOnly.node;
                nativeOffsetForChild = walkUpUntilNonLayoutOnly.index;
                reactShadowNode = reactShadowNode3;
            } else {
                return;
            }
        }
        if (!reactShadowNode2.isLayoutOnly()) {
            addNonLayoutNode(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        } else {
            addLayoutOnlyNode(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        }
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap) {
        boolean z;
        if (!reactShadowNode.getViewClass().equals("RCTView") || !isLayoutOnlyAndCollapsable(reactStylesDiffMap)) {
            z = false;
        } else {
            z = true;
        }
        reactShadowNode.setIsLayoutOnly(z);
        if (!z) {
            this.mUIViewOperationQueue.enqueueCreateView(themedReactContext, reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        }
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        boolean z;
        if (!reactShadowNode.isLayoutOnly() || isLayoutOnlyAndCollapsable(reactStylesDiffMap)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            transitionLayoutOnlyViewToNativeView(reactShadowNode, reactStylesDiffMap);
            return;
        }
        if (!reactShadowNode.isLayoutOnly()) {
            this.mUIViewOperationQueue.enqueueUpdateProperties(reactShadowNode.getReactTag(), str, reactStylesDiffMap);
        }
    }

    private void applyLayoutRecursive(ReactShadowNode reactShadowNode, int i, int i2) {
        if (reactShadowNode.isLayoutOnly() || reactShadowNode.getNativeParent() == null) {
            for (int i3 = 0; i3 < reactShadowNode.getChildCount(); i3++) {
                ReactShadowNode childAt = reactShadowNode.getChildAt(i3);
                int reactTag = childAt.getReactTag();
                if (!this.mTagsWithLayoutVisited.get(reactTag)) {
                    this.mTagsWithLayoutVisited.put(reactTag, true);
                    applyLayoutRecursive(childAt, childAt.getScreenX() + i, childAt.getScreenY() + i2);
                }
            }
            return;
        }
        this.mUIViewOperationQueue.enqueueUpdateLayout(reactShadowNode.getNativeParent().getReactTag(), reactShadowNode.getReactTag(), i, i2, reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight());
    }

    public void handleManageChildren(ReactShadowNode reactShadowNode, int[] iArr, int[] iArr2, ViewAtIndex[] viewAtIndexArr, int[] iArr3) {
        boolean z;
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z = false;
                    break;
                } else if (iArr3[i2] == i) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            removeNodeFromParent(this.mShadowNodeRegistry.getNode(i), z);
        }
        for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(viewAtIndex.mTag), viewAtIndex.mIndex);
        }
    }
}
