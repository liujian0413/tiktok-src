package com.facebook.react.fabric;

import android.view.View.MeasureSpec;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.ReactRootViewTagGenerator;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.ViewAtIndex;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import java.util.ArrayList;
import java.util.List;

public class FabricUIManager implements UIManager {
    private static final String TAG = FabricUIManager.class.toString();
    private final ReactApplicationContext mReactApplicationContext;
    private final RootShadowNodeRegistry mRootShadowNodeRegistry = new RootShadowNodeRegistry();
    private final UIViewOperationQueue mUIViewOperationQueue;
    private final ViewManagerRegistry mViewManagerRegistry;

    private void calculateRootLayout(ReactShadowNode reactShadowNode) {
        reactShadowNode.calculateLayout();
    }

    private ReactShadowNode getRootNode(int i) {
        return this.mRootShadowNodeRegistry.getNode(i);
    }

    public List<ReactShadowNode> createChildSet(int i) {
        return new ArrayList(1);
    }

    public void removeRootView(int i) {
        this.mRootShadowNodeRegistry.removeNode(i);
    }

    public ReactShadowNode cloneNode(ReactShadowNode reactShadowNode) {
        try {
            ReactShadowNode mutableCopy = reactShadowNode.mutableCopy();
            assertReactShadowNodeCopy(reactShadowNode, mutableCopy);
            return mutableCopy;
        } catch (Throwable th) {
            handleException(reactShadowNode, th);
            return null;
        }
    }

    public ReactShadowNode cloneNodeWithNewChildren(ReactShadowNode reactShadowNode) {
        try {
            ReactShadowNode mutableCopyWithNewChildren = reactShadowNode.mutableCopyWithNewChildren();
            assertReactShadowNodeCopy(reactShadowNode, mutableCopyWithNewChildren);
            return mutableCopyWithNewChildren;
        } catch (Throwable th) {
            handleException(reactShadowNode, th);
            return null;
        }
    }

    private void notifyOnBeforeLayoutRecursive(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.hasUpdates()) {
            for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
                notifyOnBeforeLayoutRecursive(reactShadowNode.getChildAt(i));
            }
            reactShadowNode.onBeforeLayout();
        }
    }

    public <T extends SizeMonitoringFrameLayout & MeasureSpecProvider> int addRootView(T t) {
        int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        ThemedReactContext themedReactContext = new ThemedReactContext(this.mReactApplicationContext, t.getContext());
        ReactShadowNode createRootShadowNode = createRootShadowNode(nextRootViewTag, themedReactContext);
        MeasureSpecProvider measureSpecProvider = (MeasureSpecProvider) t;
        updateRootView(createRootShadowNode, measureSpecProvider.getWidthMeasureSpec(), measureSpecProvider.getHeightMeasureSpec());
        this.mRootShadowNodeRegistry.addNode(createRootShadowNode);
        this.mUIViewOperationQueue.addRootView(nextRootViewTag, t, themedReactContext);
        return nextRootViewTag;
    }

    public void appendChildToSet(List<ReactShadowNode> list, ReactShadowNode reactShadowNode) {
        list.add(reactShadowNode);
    }

    private ReactStylesDiffMap updateProps(ReactShadowNode reactShadowNode, ReadableNativeMap readableNativeMap) {
        if (readableNativeMap == null) {
            return null;
        }
        ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableNativeMap);
        reactShadowNode.updateProperties(reactStylesDiffMap);
        return reactStylesDiffMap;
    }

    public FabricUIManager(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry) {
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mUIViewOperationQueue = new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(viewManagerRegistry), 0);
    }

    private ReactShadowNode createRootShadowNode(int i, ThemedReactContext themedReactContext) {
        ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
        I18nUtil.getInstance();
        reactShadowNodeImpl.setViewClassName("Root");
        reactShadowNodeImpl.setReactTag(i);
        reactShadowNodeImpl.setThemedContext(themedReactContext);
        return reactShadowNodeImpl;
    }

    private void handleException(ReactShadowNode reactShadowNode, Throwable th) {
        try {
            reactShadowNode.getThemedContext().handleException(new RuntimeException(th));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), th);
        }
    }

    public ReactShadowNode cloneNodeWithNewChildrenAndProps(ReactShadowNode reactShadowNode, ReadableNativeMap readableNativeMap) {
        ReactStylesDiffMap reactStylesDiffMap;
        if (readableNativeMap == null) {
            reactStylesDiffMap = null;
        } else {
            try {
                reactStylesDiffMap = new ReactStylesDiffMap(readableNativeMap);
            } catch (Throwable th) {
                handleException(reactShadowNode, th);
                return null;
            }
        }
        ReactShadowNode mutableCopyWithNewChildrenAndProps = reactShadowNode.mutableCopyWithNewChildrenAndProps(reactStylesDiffMap);
        assertReactShadowNodeCopy(reactShadowNode, mutableCopyWithNewChildrenAndProps);
        return mutableCopyWithNewChildrenAndProps;
    }

    public ReactShadowNode cloneNodeWithNewProps(ReactShadowNode reactShadowNode, ReadableNativeMap readableNativeMap) {
        ReactStylesDiffMap reactStylesDiffMap;
        if (readableNativeMap == null) {
            reactStylesDiffMap = null;
        } else {
            try {
                reactStylesDiffMap = new ReactStylesDiffMap(readableNativeMap);
            } catch (Throwable th) {
                handleException(reactShadowNode, th);
                return null;
            }
        }
        ReactShadowNode mutableCopyWithNewProps = reactShadowNode.mutableCopyWithNewProps(reactStylesDiffMap);
        assertReactShadowNodeCopy(reactShadowNode, mutableCopyWithNewProps);
        return mutableCopyWithNewProps;
    }

    private void assertReactShadowNodeCopy(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2) {
        boolean equals = reactShadowNode.getClass().equals(reactShadowNode2.getClass());
        StringBuilder sb = new StringBuilder("Found ");
        sb.append(reactShadowNode2.getClass());
        sb.append(" class when expecting: ");
        sb.append(reactShadowNode.getClass());
        sb.append(". Check that ");
        sb.append(reactShadowNode.getClass());
        sb.append(" implements the mutableCopy() method correctly.");
        C13854a.m40915a(equals, sb.toString());
    }

    public void appendChild(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2) {
        try {
            int childCount = reactShadowNode.getChildCount();
            reactShadowNode.addChildAt(reactShadowNode2, childCount);
            ViewAtIndex[] viewAtIndexArr = {new ViewAtIndex(reactShadowNode2.getReactTag(), childCount)};
            if (!reactShadowNode2.isVirtual()) {
                this.mUIViewOperationQueue.enqueueManageChildren(reactShadowNode.getReactTag(), null, viewAtIndexArr, null);
            }
        } catch (Throwable th) {
            handleException(reactShadowNode, th);
        }
    }

    public void completeRoot(int i, List<ReactShadowNode> list) {
        try {
            ReactShadowNode rootNode = getRootNode(i);
            StringBuilder sb = new StringBuilder("Root view with tag ");
            sb.append(i);
            sb.append(" must be added before completeRoot is called");
            C13854a.m40913a(rootNode, sb.toString());
            for (int i2 = 0; i2 < list.size(); i2++) {
                appendChild(rootNode, (ReactShadowNode) list.get(i2));
            }
            notifyOnBeforeLayoutRecursive(rootNode);
            calculateRootLayout(rootNode);
            applyUpdatesRecursive(rootNode, 0.0f, 0.0f);
            this.mUIViewOperationQueue.dispatchViewUpdates(1, System.currentTimeMillis(), System.currentTimeMillis());
        } catch (Exception e) {
            handleException(getRootNode(i), e);
        }
    }

    private void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f, float f2) {
        if (reactShadowNode.hasUpdates()) {
            if (!reactShadowNode.isVirtualAnchor()) {
                for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
                    applyUpdatesRecursive(reactShadowNode.getChildAt(i), reactShadowNode.getLayoutX() + f, reactShadowNode.getLayoutY() + f2);
                }
            }
            if (this.mRootShadowNodeRegistry.getNode(reactShadowNode.getReactTag()) == null) {
                reactShadowNode.dispatchUpdates(f, f2, this.mUIViewOperationQueue, null);
            }
            reactShadowNode.markUpdateSeen();
        }
    }

    public void updateRootView(ReactShadowNode reactShadowNode, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            reactShadowNode.setStyleMaxWidth((float) size);
        } else if (mode == 0) {
            reactShadowNode.setStyleWidthAuto();
        } else if (mode == 1073741824) {
            reactShadowNode.setStyleWidth((float) size);
        }
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                reactShadowNode.setStyleHeightAuto();
            } else if (mode2 == 1073741824) {
                reactShadowNode.setStyleHeight((float) size2);
                return;
            }
            return;
        }
        reactShadowNode.setStyleMaxHeight((float) size2);
    }

    public ReactShadowNode createNode(int i, String str, int i2, ReadableNativeMap readableNativeMap) {
        try {
            ReactShadowNode createShadowNodeInstance = this.mViewManagerRegistry.get(str).createShadowNodeInstance(this.mReactApplicationContext);
            ReactShadowNode rootNode = getRootNode(i2);
            createShadowNodeInstance.setRootNode(rootNode);
            createShadowNodeInstance.setViewClassName(str);
            createShadowNodeInstance.setReactTag(i);
            createShadowNodeInstance.setThemedContext(rootNode.getThemedContext());
            ReactStylesDiffMap updateProps = updateProps(createShadowNodeInstance, readableNativeMap);
            if (!createShadowNodeInstance.isVirtual()) {
                this.mUIViewOperationQueue.enqueueCreateView(rootNode.getThemedContext(), i, str, updateProps);
            }
            return createShadowNodeInstance;
        } catch (Throwable th) {
            handleException(getRootNode(i2), th);
            return null;
        }
    }
}
