package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View.MeasureSpec;
import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.animation.Animation;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.UIManagerModule.ViewManagerResolver;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.systrace.Systrace;
import com.facebook.yoga.YogaDirection;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UIImplementation {
    protected final EventDispatcher mEventDispatcher;
    private long mLastCalculateLayoutTime;
    protected LayoutUpdateListener mLayoutUpdateListener;
    private final int[] mMeasureBuffer;
    private final Set<Integer> mMeasuredRootNodes;
    private final NativeViewHierarchyOptimizer mNativeViewHierarchyOptimizer;
    private final UIViewOperationQueue mOperationsQueue;
    protected final ReactApplicationContext mReactContext;
    protected final ShadowNodeRegistry mShadowNodeRegistry;
    private final ViewManagerRegistry mViewManagers;
    protected Object uiImplementationThreadLock;

    public interface LayoutUpdateListener {
        void onLayoutUpdated(ReactShadowNode reactShadowNode);
    }

    /* access modifiers changed from: 0000 */
    public UIViewOperationQueue getUIViewOperationQueue() {
        return this.mOperationsQueue;
    }

    public void onHostDestroy() {
    }

    public void removeLayoutUpdateListener() {
        this.mLayoutUpdateListener = null;
    }

    public void clearJSResponder() {
        this.mOperationsQueue.enqueueClearJSResponder();
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        return this.mOperationsQueue.getProfiledBatchPerfCounters();
    }

    public void onHostPause() {
        this.mOperationsQueue.pauseFrameCallback();
    }

    public void onHostResume() {
        this.mOperationsQueue.resumeFrameCallback();
    }

    public void profileNextBatch() {
        this.mOperationsQueue.profileNextBatch();
    }

    private void dispatchViewUpdatesIfNeeded() {
        if (this.mOperationsQueue.isEmpty()) {
            dispatchViewUpdates(-1);
        }
    }

    /* access modifiers changed from: protected */
    public ReactShadowNode createRootShadowNode() {
        ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
        if (I18nUtil.getInstance().isRTL(this.mReactContext)) {
            reactShadowNodeImpl.setLayoutDirection(YogaDirection.RTL);
        }
        reactShadowNodeImpl.setViewClassName("Root");
        try {
            if (!(this.mReactContext == null || this.mReactContext.getCatalystInstance() == null || this.mOperationsQueue == null || this.mOperationsQueue.getNativeViewHierarchyManager() == null)) {
                this.mOperationsQueue.getNativeViewHierarchyManager().setCatalyInstance(new WeakReference(this.mReactContext.getCatalystInstance()));
            }
        } catch (Exception unused) {
        }
        return reactShadowNodeImpl;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateViewHierarchy() {
        /*
            r6 = this;
            java.lang.String r0 = "UIImplementation.updateViewHierarchy"
            r1 = 0
            com.facebook.systrace.Systrace.m42324a(r1, r0)
            r0 = 0
        L_0x0008:
            com.facebook.react.uimanager.ShadowNodeRegistry r3 = r6.mShadowNodeRegistry     // Catch:{ all -> 0x0059 }
            int r3 = r3.getRootNodeCount()     // Catch:{ all -> 0x0059 }
            if (r0 >= r3) goto L_0x0055
            com.facebook.react.uimanager.ShadowNodeRegistry r3 = r6.mShadowNodeRegistry     // Catch:{ all -> 0x0059 }
            int r3 = r3.getRootTag(r0)     // Catch:{ all -> 0x0059 }
            com.facebook.react.uimanager.ShadowNodeRegistry r4 = r6.mShadowNodeRegistry     // Catch:{ all -> 0x0059 }
            com.facebook.react.uimanager.ReactShadowNode r4 = r4.getNode(r3)     // Catch:{ all -> 0x0059 }
            java.util.Set<java.lang.Integer> r5 = r6.mMeasuredRootNodes     // Catch:{ all -> 0x0059 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0059 }
            boolean r3 = r5.contains(r3)     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x0052
            r4.getReactTag()     // Catch:{ all -> 0x0059 }
            r6.notifyOnBeforeLayoutRecursive(r4)     // Catch:{ all -> 0x004d }
            com.facebook.systrace.Systrace.m42323a(r1)     // Catch:{ all -> 0x0059 }
            r6.calculateRootLayout(r4)     // Catch:{ all -> 0x0059 }
            r4.getReactTag()     // Catch:{ all -> 0x0059 }
            r3 = 0
            r6.applyUpdatesRecursive(r4, r3, r3)     // Catch:{ all -> 0x0048 }
            com.facebook.systrace.Systrace.m42323a(r1)     // Catch:{ all -> 0x0059 }
            com.facebook.react.uimanager.UIImplementation$LayoutUpdateListener r3 = r6.mLayoutUpdateListener     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x0052
            com.facebook.react.uimanager.UIImplementation$LayoutUpdateListener r3 = r6.mLayoutUpdateListener     // Catch:{ all -> 0x0059 }
            r3.onLayoutUpdated(r4)     // Catch:{ all -> 0x0059 }
            goto L_0x0052
        L_0x0048:
            r0 = move-exception
            com.facebook.systrace.Systrace.m42323a(r1)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x004d:
            r0 = move-exception
            com.facebook.systrace.Systrace.m42323a(r1)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0052:
            int r0 = r0 + 1
            goto L_0x0008
        L_0x0055:
            com.facebook.systrace.Systrace.m42323a(r1)
            return
        L_0x0059:
            r0 = move-exception
            com.facebook.systrace.Systrace.m42323a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIImplementation.updateViewHierarchy():void");
    }

    public void setLayoutUpdateListener(LayoutUpdateListener layoutUpdateListener) {
        this.mLayoutUpdateListener = layoutUpdateListener;
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.enqueueUIBlock(uIBlock);
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.prependUIBlock(uIBlock);
    }

    public void registerAnimation(Animation animation) {
        this.mOperationsQueue.enqueueRegisterAnimation(animation);
    }

    /* access modifiers changed from: protected */
    public final void removeShadowNode(ReactShadowNode reactShadowNode) {
        removeShadowNodeRecursive(reactShadowNode);
        reactShadowNode.dispose();
    }

    public final ReactShadowNode resolveShadowNode(int i) {
        return this.mShadowNodeRegistry.getNode(i);
    }

    /* access modifiers changed from: protected */
    public final ViewManager resolveViewManager(String str) {
        return this.mViewManagers.get(str);
    }

    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mOperationsQueue.enqueueSetLayoutAnimationEnabled(z);
    }

    public void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mOperationsQueue.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    /* access modifiers changed from: protected */
    public ReactShadowNode createShadowNode(String str) {
        return this.mViewManagers.get(str).createShadowNodeInstance(this.mReactContext);
    }

    public void enableLayoutCalculationForRootNode(int i) {
        this.mMeasuredRootNodes.add(Integer.valueOf(i));
    }

    public void removeRootShadowNode(int i) {
        synchronized (this.uiImplementationThreadLock) {
            this.mShadowNodeRegistry.removeRootNode(i);
        }
    }

    public void removeRootView(int i) {
        removeRootShadowNode(i);
        this.mOperationsQueue.enqueueRemoveRootView(i);
    }

    private void notifyOnBeforeLayoutRecursive(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.hasUpdates()) {
            for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
                notifyOnBeforeLayoutRecursive(reactShadowNode.getChildAt(i));
            }
            reactShadowNode.onBeforeLayout();
        }
    }

    public void dispatchViewUpdates(int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            updateViewHierarchy();
            this.mNativeViewHierarchyOptimizer.onBatchComplete();
            this.mOperationsQueue.dispatchViewUpdates(i, uptimeMillis, this.mLastCalculateLayoutTime);
        } finally {
            Systrace.m42323a(0);
        }
    }

    private void removeShadowNodeRecursive(ReactShadowNode reactShadowNode) {
        NativeViewHierarchyOptimizer.handleRemoveNode(reactShadowNode);
        this.mShadowNodeRegistry.removeNode(reactShadowNode.getReactTag());
        this.mMeasuredRootNodes.remove(Integer.valueOf(reactShadowNode.getReactTag()));
        for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
            removeShadowNodeRecursive(reactShadowNode.getChildAt(childCount));
        }
        reactShadowNode.removeAndDisposeAllChildren();
    }

    /* access modifiers changed from: protected */
    public void calculateRootLayout(ReactShadowNode reactShadowNode) {
        reactShadowNode.getReactTag();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            reactShadowNode.calculateLayout();
        } finally {
            Systrace.m42323a(0);
            this.mLastCalculateLayoutTime = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    public void removeSubviewsFromContainerWithID(int i) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i2 = 0; i2 < node.getChildCount(); i2++) {
                createArray.pushInt(i2);
            }
            manageChildren(i, null, null, null, null, createArray);
            return;
        }
        StringBuilder sb = new StringBuilder("Trying to remove subviews of an unknown view tag: ");
        sb.append(i);
        throw new IllegalViewOperationException(sb.toString());
    }

    public int resolveRootTagFromReactTag(int i) {
        if (this.mShadowNodeRegistry.isRootNode(i)) {
            return i;
        }
        ReactShadowNode resolveShadowNode = resolveShadowNode(i);
        int i2 = 0;
        if (resolveShadowNode != null) {
            i2 = resolveShadowNode.getRootNode().getReactTag();
        } else {
            StringBuilder sb = new StringBuilder("Warning : attempted to resolve a non-existent react shadow node. reactTag=");
            sb.append(i);
            C13286a.m38860c("ReactNative", sb.toString());
        }
        return i2;
    }

    private void assertNodeDoesNotNeedCustomLayoutForChildren(ReactShadowNode reactShadowNode) {
        ViewManager viewManager = (ViewManager) C13854a.m40916b(this.mViewManagers.get(reactShadowNode.getViewClass()));
        if (viewManager instanceof ViewGroupManager) {
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            if (viewGroupManager != null && viewGroupManager.needsCustomLayoutForChildren()) {
                StringBuilder sb = new StringBuilder("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (");
                sb.append(reactShadowNode.getViewClass());
                sb.append("). Use measure instead.");
                throw new IllegalViewOperationException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Trying to use view ");
        sb2.append(reactShadowNode.getViewClass());
        sb2.append(" as a parent, but its Manager doesn't extends ViewGroupManager");
        throw new IllegalViewOperationException(sb2.toString());
    }

    public void measure(int i, Callback callback) {
        this.mOperationsQueue.enqueueMeasure(i, callback);
    }

    public void measureInWindow(int i, Callback callback) {
        this.mOperationsQueue.enqueueMeasureInWindow(i, callback);
    }

    public void sendAccessibilityEvent(int i, int i2) {
        this.mOperationsQueue.enqueueSendAccessibilityEvent(i, i2);
    }

    public void removeAnimation(int i, int i2) {
        assertViewExists(i, "removeAnimation");
        this.mOperationsQueue.enqueueRemoveAnimation(i2);
    }

    public void synchronouslyUpdateViewOnUIThread(int i, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        this.mOperationsQueue.getNativeViewHierarchyManager().updateProperties(i, reactStylesDiffMap);
    }

    private void assertViewExists(int i, String str) {
        if (this.mShadowNodeRegistry.getNode(i) == null) {
            StringBuilder sb = new StringBuilder("Unable to execute operation ");
            sb.append(str);
            sb.append(" on view with tag: ");
            sb.append(i);
            sb.append(", since the view does not exists");
            throw new IllegalViewOperationException(sb.toString());
        }
    }

    public void setJSResponder(int i, boolean z) {
        assertViewExists(i, "setJSResponder");
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        while (true) {
            if (node.isVirtual() || node.isLayoutOnly()) {
                node = node.getParent();
            } else {
                this.mOperationsQueue.enqueueSetJSResponder(node.getReactTag(), i, z);
                return;
            }
        }
    }

    public void setViewLocalData(int i, Object obj) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node == null) {
            StringBuilder sb = new StringBuilder("Attempt to set local data for view with unknown tag: ");
            sb.append(i);
            C13286a.m38860c("ReactNative", sb.toString());
            return;
        }
        node.setLocalData(obj);
        dispatchViewUpdatesIfNeeded();
    }

    private void measureLayoutRelativeToParent(int i, int[] iArr) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            ReactShadowNode parent = node.getParent();
            if (parent != null) {
                measureLayoutRelativeToVerifiedAncestor(node, parent, iArr);
                return;
            }
            StringBuilder sb = new StringBuilder("View with tag ");
            sb.append(i);
            sb.append(" doesn't have a parent!");
            throw new IllegalViewOperationException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("No native view for tag ");
        sb2.append(i);
        sb2.append(" exists!");
        throw new IllegalViewOperationException(sb2.toString());
    }

    public void replaceExistingNonRootView(int i, int i2) {
        if (this.mShadowNodeRegistry.isRootNode(i) || this.mShadowNodeRegistry.isRootNode(i2)) {
            throw new IllegalViewOperationException("Trying to add or replace a root tag!");
        }
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node != null) {
            ReactShadowNode parent = node.getParent();
            if (parent != null) {
                int indexOf = parent.indexOf(node);
                if (indexOf >= 0) {
                    WritableArray createArray = Arguments.createArray();
                    createArray.pushInt(i2);
                    WritableArray createArray2 = Arguments.createArray();
                    createArray2.pushInt(indexOf);
                    WritableArray createArray3 = Arguments.createArray();
                    createArray3.pushInt(indexOf);
                    manageChildren(parent.getReactTag(), null, null, createArray, createArray2, createArray3);
                    return;
                }
                throw new IllegalStateException("Didn't find child tag in parent");
            }
            StringBuilder sb = new StringBuilder("Node is not attached to a parent: ");
            sb.append(i);
            throw new IllegalViewOperationException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Trying to replace unknown view tag: ");
        sb2.append(i);
        throw new IllegalViewOperationException(sb2.toString());
    }

    public void setChildren(int i, ReadableArray readableArray) {
        synchronized (this.uiImplementationThreadLock) {
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
            int i2 = 0;
            while (i2 < readableArray.size()) {
                ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(readableArray.getInt(i2));
                if (node2 != null) {
                    node.addChildAt(node2, i2);
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder("Trying to add unknown view tag: ");
                    sb.append(readableArray.getInt(i2));
                    throw new IllegalViewOperationException(sb.toString());
                }
            }
            if (!node.isVirtual() && !node.isVirtualAnchor()) {
                this.mNativeViewHierarchyOptimizer.handleSetChildren(node, readableArray);
            }
        }
    }

    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mOperationsQueue.enqueueConfigureLayoutAnimation(readableMap, callback, callback2);
    }

    public void addAnimation(int i, int i2, Callback callback) {
        assertViewExists(i, "addAnimation");
        this.mOperationsQueue.enqueueAddAnimation(i, i2, callback);
    }

    public void dispatchViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        assertViewExists(i, "dispatchViewManagerCommand");
        this.mOperationsQueue.enqueueDispatchCommand(i, i2, readableArray);
    }

    /* access modifiers changed from: protected */
    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (!reactShadowNode.isVirtual()) {
            this.mNativeViewHierarchyOptimizer.handleUpdateView(reactShadowNode, str, reactStylesDiffMap);
        }
    }

    /* access modifiers changed from: protected */
    public void handleCreateView(ReactShadowNode reactShadowNode, int i, ReactStylesDiffMap reactStylesDiffMap) {
        synchronized (this.uiImplementationThreadLock) {
            if (!reactShadowNode.isVirtual()) {
                this.mNativeViewHierarchyOptimizer.handleCreateView(reactShadowNode, reactShadowNode.getThemedContext(), reactStylesDiffMap);
            }
        }
    }

    public void updateRootView(int i, int i2, int i3) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node == null) {
            StringBuilder sb = new StringBuilder("Tried to update non-existent root tag: ");
            sb.append(i);
            C13286a.m38860c("ReactNative", sb.toString());
            return;
        }
        updateRootView(node, i2, i3);
    }

    public <T extends SizeMonitoringFrameLayout & MeasureSpecProvider> void registerRootView(T t, int i, ThemedReactContext themedReactContext) {
        synchronized (this.uiImplementationThreadLock) {
            ReactShadowNode createRootShadowNode = createRootShadowNode();
            createRootShadowNode.setReactTag(i);
            createRootShadowNode.setThemedContext(themedReactContext);
            updateRootView(createRootShadowNode, ((MeasureSpecProvider) t).getWidthMeasureSpec(), ((MeasureSpecProvider) t).getHeightMeasureSpec());
            this.mShadowNodeRegistry.addRootNode(createRootShadowNode);
            this.mOperationsQueue.addRootView(i, t, themedReactContext);
        }
    }

    public void updateNodeSize(int i, int i2, int i3) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (node == null) {
            StringBuilder sb = new StringBuilder("Tried to update size of non-existent tag: ");
            sb.append(i);
            C13286a.m38860c("ReactNative", sb.toString());
            return;
        }
        node.setStyleWidth((float) i2);
        node.setStyleHeight((float) i3);
        dispatchViewUpdatesIfNeeded();
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

    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(i2);
        if (node == null || node2 == null) {
            callback.invoke(Boolean.valueOf(false));
            return;
        }
        callback.invoke(Boolean.valueOf(node.isDescendantOf(node2)));
    }

    private void measureLayout(int i, int i2, int[] iArr) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(i2);
        if (node == null || node2 == null) {
            StringBuilder sb = new StringBuilder("Tag ");
            if (node != null) {
                i = i2;
            }
            sb.append(i);
            sb.append(" does not exist");
            throw new IllegalViewOperationException(sb.toString());
        }
        if (node != node2) {
            ReactShadowNode parent = node.getParent();
            while (parent != node2) {
                if (parent != null) {
                    parent = parent.getParent();
                } else {
                    StringBuilder sb2 = new StringBuilder("Tag ");
                    sb2.append(i2);
                    sb2.append(" is not an ancestor of tag ");
                    sb2.append(i);
                    throw new IllegalViewOperationException(sb2.toString());
                }
            }
        }
        measureLayoutRelativeToVerifiedAncestor(node, node2, iArr);
    }

    private void measureLayoutRelativeToVerifiedAncestor(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int[] iArr) {
        int i;
        int i2;
        if (reactShadowNode != reactShadowNode2) {
            i2 = Math.round(reactShadowNode.getLayoutX());
            i = Math.round(reactShadowNode.getLayoutY());
            for (ReactShadowNode parent = reactShadowNode.getParent(); parent != reactShadowNode2; parent = parent.getParent()) {
                C13854a.m40916b(parent);
                assertNodeDoesNotNeedCustomLayoutForChildren(parent);
                i2 += Math.round(parent.getLayoutX());
                i += Math.round(parent.getLayoutY());
            }
            assertNodeDoesNotNeedCustomLayoutForChildren(reactShadowNode2);
        } else {
            i2 = 0;
            i = 0;
        }
        iArr[0] = i2;
        iArr[1] = i;
        iArr[2] = reactShadowNode.getScreenWidth();
        iArr[3] = reactShadowNode.getScreenHeight();
    }

    /* access modifiers changed from: protected */
    public void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f, float f2) {
        if (reactShadowNode.hasUpdates()) {
            if (!reactShadowNode.isVirtualAnchor()) {
                for (int i = 0; i < reactShadowNode.getChildCount(); i++) {
                    applyUpdatesRecursive(reactShadowNode.getChildAt(i), reactShadowNode.getLayoutX() + f, reactShadowNode.getLayoutY() + f2);
                }
            }
            int reactTag = reactShadowNode.getReactTag();
            if (!this.mShadowNodeRegistry.isRootNode(reactTag) && reactShadowNode.dispatchUpdates(f, f2, this.mOperationsQueue, this.mNativeViewHierarchyOptimizer) && reactShadowNode.shouldNotifyOnLayout()) {
                this.mEventDispatcher.dispatchEvent(OnLayoutEvent.obtain(reactTag, reactShadowNode.getScreenX(), reactShadowNode.getScreenY(), reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight()));
            }
            reactShadowNode.markUpdateSeen();
        }
    }

    public void updateView(int i, String str, ReadableMap readableMap) {
        if (this.mViewManagers.get(str) != null) {
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
            if (node == null) {
                StringBuilder sb = new StringBuilder("Trying to update non-existent view with tag ");
                sb.append(i);
                throw new IllegalViewOperationException(sb.toString());
            } else if (readableMap != null) {
                ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                node.updateProperties(reactStylesDiffMap);
                handleUpdateView(node, str, reactStylesDiffMap);
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Got unknown view type: ");
            sb2.append(str);
            throw new IllegalViewOperationException(sb2.toString());
        }
    }

    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        try {
            measureLayoutRelativeToParent(i, this.mMeasureBuffer);
            callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[3])));
        } catch (IllegalViewOperationException e) {
            callback.invoke(e.getMessage());
        }
    }

    public void findSubviewIn(int i, float f, float f2, Callback callback) {
        this.mOperationsQueue.enqueueFindTargetForTouch(i, f, f2, callback);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, EventDispatcher eventDispatcher, int i) {
        this(reactApplicationContext, new ViewManagerRegistry(viewManagerResolver), eventDispatcher, i);
    }

    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        assertViewExists(i, "showPopupMenu");
        this.mOperationsQueue.enqueueShowPopupMenu(i, readableArray, callback, callback2);
    }

    private UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i) {
        this(reactApplicationContext, viewManagerRegistry, new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(viewManagerRegistry), i), eventDispatcher);
    }

    protected UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, UIViewOperationQueue uIViewOperationQueue, EventDispatcher eventDispatcher) {
        this.uiImplementationThreadLock = new Object();
        this.mShadowNodeRegistry = new ShadowNodeRegistry();
        this.mMeasuredRootNodes = new HashSet();
        this.mMeasureBuffer = new int[4];
        this.mLastCalculateLayoutTime = 0;
        this.mReactContext = reactApplicationContext;
        this.mViewManagers = viewManagerRegistry;
        this.mOperationsQueue = uIViewOperationQueue;
        this.mNativeViewHierarchyOptimizer = new NativeViewHierarchyOptimizer(this.mOperationsQueue, this.mShadowNodeRegistry);
        this.mEventDispatcher = eventDispatcher;
    }

    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        synchronized (this.uiImplementationThreadLock) {
            ReactShadowNode createShadowNode = createShadowNode(str);
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
            createShadowNode.setReactTag(i);
            createShadowNode.setViewClassName(str);
            createShadowNode.setRootNode(node);
            createShadowNode.setThemedContext(node.getThemedContext());
            this.mShadowNodeRegistry.addNode(createShadowNode);
            ReactStylesDiffMap reactStylesDiffMap = null;
            if (readableMap != null) {
                reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                createShadowNode.updateProperties(reactStylesDiffMap);
            }
            handleCreateView(createShadowNode, i2, reactStylesDiffMap);
        }
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, List<ViewManager> list, EventDispatcher eventDispatcher, int i) {
        this(reactApplicationContext, new ViewManagerRegistry(list), eventDispatcher, i);
    }

    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        try {
            measureLayout(i, i2, this.mMeasureBuffer);
            callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel((float) this.mMeasureBuffer[3])));
        } catch (IllegalViewOperationException e) {
            callback.invoke(e.getMessage());
        }
    }

    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int i2;
        int i3;
        int i4;
        ReadableArray readableArray6 = readableArray;
        ReadableArray readableArray7 = readableArray2;
        ReadableArray readableArray8 = readableArray3;
        ReadableArray readableArray9 = readableArray4;
        ReadableArray readableArray10 = readableArray5;
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i);
        if (readableArray6 == null) {
            i2 = 0;
        } else {
            i2 = readableArray.size();
        }
        if (readableArray8 == null) {
            i3 = 0;
        } else {
            i3 = readableArray3.size();
        }
        if (readableArray10 == null) {
            i4 = 0;
        } else {
            i4 = readableArray5.size();
        }
        if (i2 != 0 && (readableArray7 == null || i2 != readableArray2.size())) {
            throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
        } else if (i3 == 0 || (readableArray9 != null && i3 == readableArray4.size())) {
            ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[(i2 + i3)];
            int[] iArr = new int[(i2 + i4)];
            int[] iArr2 = new int[iArr.length];
            int[] iArr3 = new int[i4];
            if (i2 > 0) {
                C13854a.m40916b(readableArray);
                C13854a.m40916b(readableArray2);
                int i5 = 0;
                while (i5 < i2) {
                    int i6 = readableArray6.getInt(i5);
                    int reactTag = node.getChildAt(i6).getReactTag();
                    int[] iArr4 = iArr3;
                    viewAtIndexArr[i5] = new ViewAtIndex(reactTag, readableArray7.getInt(i5));
                    iArr[i5] = i6;
                    iArr2[i5] = reactTag;
                    i5++;
                    iArr3 = iArr4;
                    int i7 = i;
                    readableArray6 = readableArray;
                }
            }
            int[] iArr5 = iArr3;
            if (i3 > 0) {
                C13854a.m40916b(readableArray3);
                C13854a.m40916b(readableArray4);
                for (int i8 = 0; i8 < i3; i8++) {
                    viewAtIndexArr[i2 + i8] = new ViewAtIndex(readableArray8.getInt(i8), readableArray9.getInt(i8));
                }
            }
            if (i4 > 0) {
                C13854a.m40916b(readableArray5);
                for (int i9 = 0; i9 < i4; i9++) {
                    int i10 = readableArray10.getInt(i9);
                    int reactTag2 = node.getChildAt(i10).getReactTag();
                    int i11 = i2 + i9;
                    iArr[i11] = i10;
                    iArr2[i11] = reactTag2;
                    iArr5[i9] = reactTag2;
                }
            }
            Arrays.sort(viewAtIndexArr, ViewAtIndex.COMPARATOR);
            Arrays.sort(iArr);
            int length = iArr.length - 1;
            int i12 = -1;
            while (length >= 0) {
                if (iArr[length] != i12) {
                    node.removeChildAt(iArr[length]);
                    i12 = iArr[length];
                    length--;
                } else {
                    StringBuilder sb = new StringBuilder("Repeated indices in Removal list for view tag: ");
                    sb.append(i);
                    throw new IllegalViewOperationException(sb.toString());
                }
            }
            int i13 = 0;
            while (i13 < viewAtIndexArr.length) {
                ViewAtIndex viewAtIndex = viewAtIndexArr[i13];
                ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(viewAtIndex.mTag);
                if (node2 != null) {
                    node.addChildAt(node2, viewAtIndex.mIndex);
                    i13++;
                } else {
                    StringBuilder sb2 = new StringBuilder("Trying to add unknown view tag: ");
                    sb2.append(viewAtIndex.mTag);
                    throw new IllegalViewOperationException(sb2.toString());
                }
            }
            if (!node.isVirtual() && !node.isVirtualAnchor()) {
                this.mNativeViewHierarchyOptimizer.handleManageChildren(node, iArr, iArr2, viewAtIndexArr, iArr5);
            }
            int[] iArr6 = iArr5;
            for (int node3 : iArr6) {
                removeShadowNode(this.mShadowNodeRegistry.getNode(node3));
            }
        } else {
            throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
        }
    }
}
