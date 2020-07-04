package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.UIImplementation;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class PropsAnimatedNode extends AnimatedNode {
    private int mConnectedViewTag = -1;
    private final ReactStylesDiffMap mDiffMap;
    private final NativeAnimatedNodesManager mNativeAnimatedNodesManager;
    private final JavaOnlyMap mPropMap;
    private final Map<String, Integer> mPropNodeMapping;
    private final UIImplementation mUIImplementation;

    public void restoreDefaultValues() {
        ReadableMapKeySetIterator keySetIterator = this.mPropMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            this.mPropMap.putNull(keySetIterator.nextKey());
        }
        this.mUIImplementation.synchronouslyUpdateViewOnUIThread(this.mConnectedViewTag, this.mDiffMap);
    }

    public final void updateView() {
        if (this.mConnectedViewTag != -1) {
            for (Entry entry : this.mPropNodeMapping.entrySet()) {
                AnimatedNode nodeById = this.mNativeAnimatedNodesManager.getNodeById(((Integer) entry.getValue()).intValue());
                if (nodeById == null) {
                    throw new IllegalArgumentException("Mapped property node does not exists");
                } else if (nodeById instanceof StyleAnimatedNode) {
                    ((StyleAnimatedNode) nodeById).collectViewUpdates(this.mPropMap);
                } else if (nodeById instanceof ValueAnimatedNode) {
                    this.mPropMap.putDouble((String) entry.getKey(), ((ValueAnimatedNode) nodeById).getValue());
                } else {
                    StringBuilder sb = new StringBuilder("Unsupported type of node used in property node ");
                    sb.append(nodeById.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.mUIImplementation.synchronouslyUpdateViewOnUIThread(this.mConnectedViewTag, this.mDiffMap);
        }
    }

    public void disconnectFromView(int i) {
        if (this.mConnectedViewTag == i) {
            this.mConnectedViewTag = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node");
    }

    public void connectToView(int i) {
        if (this.mConnectedViewTag == -1) {
            this.mConnectedViewTag = i;
            return;
        }
        StringBuilder sb = new StringBuilder("Animated node ");
        sb.append(this.mTag);
        sb.append(" is already attached to a view");
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    PropsAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager, UIImplementation uIImplementation) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.mPropNodeMapping = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.mPropNodeMapping.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.mPropMap = new JavaOnlyMap();
        this.mDiffMap = new ReactStylesDiffMap(this.mPropMap);
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.mUIImplementation = uIImplementation;
    }
}
