package com.facebook.react.flat;

import android.util.SparseIntArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.flat.FlatUIViewOperationQueue.DetachAllChildrenFromViews;
import com.facebook.react.uimanager.OnLayoutEvent;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.UIViewOperationQueue.UIOperation;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;

final class StateBuilder {
    static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    static final SparseIntArray EMPTY_SPARSE_INT = new SparseIntArray();
    private final ElementsList<AttachDetachListener> mAttachDetachListeners = new ElementsList<>(AttachDetachListener.EMPTY_ARRAY);
    private DetachAllChildrenFromViews mDetachAllChildrenFromViews;
    private final ElementsList<DrawCommand> mDrawCommands = new ElementsList<>(DrawCommand.EMPTY_ARRAY);
    private final ElementsList<FlatShadowNode> mNativeChildren = new ElementsList<>(FlatShadowNode.EMPTY_ARRAY);
    private final ElementsList<NodeRegion> mNodeRegions = new ElementsList<>(NodeRegion.EMPTY_ARRAY);
    private final ArrayList<OnLayoutEvent> mOnLayoutEvents = new ArrayList<>();
    private final FlatUIViewOperationQueue mOperationsQueue;
    private final ArrayList<Integer> mParentsForViewsToDrop = new ArrayList<>();
    private final ArrayList<UIOperation> mUpdateViewBoundsOperations = new ArrayList<>();
    private final ArrayList<UIOperation> mViewManagerCommands = new ArrayList<>();
    private final ArrayList<FlatShadowNode> mViewsToDetach = new ArrayList<>();
    private final ArrayList<FlatShadowNode> mViewsToDetachAllChildrenFrom = new ArrayList<>();
    private final ArrayList<Integer> mViewsToDrop = new ArrayList<>();

    /* access modifiers changed from: 0000 */
    public final FlatUIViewOperationQueue getOperationsQueue() {
        return this.mOperationsQueue;
    }

    private void addNativeChild(FlatShadowNode flatShadowNode) {
        this.mNativeChildren.add(flatShadowNode);
    }

    /* access modifiers changed from: 0000 */
    public final void addAttachDetachListener(AttachDetachListener attachDetachListener) {
        this.mAttachDetachListeners.add(attachDetachListener);
    }

    /* access modifiers changed from: 0000 */
    public final void addDrawCommand(AbstractDrawCommand abstractDrawCommand) {
        this.mDrawCommands.add(abstractDrawCommand);
    }

    private static float roundToPixel(float f) {
        return (float) Math.floor((double) (f + 0.5f));
    }

    private static int[] collectViewTags(ArrayList<FlatShadowNode> arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return EMPTY_INT_ARRAY;
        }
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((FlatShadowNode) arrayList.get(i)).getReactTag();
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    public final void ensureBackingViewIsCreated(FlatShadowNode flatShadowNode) {
        if (!flatShadowNode.isBackingViewCreated()) {
            this.mOperationsQueue.enqueueCreateView(flatShadowNode.getThemedContext(), flatShadowNode.getReactTag(), flatShadowNode.getViewClass(), null);
            flatShadowNode.signalBackingViewIsCreated();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void removeRootView(int i) {
        this.mViewsToDrop.add(Integer.valueOf(-i));
        this.mParentsForViewsToDrop.add(Integer.valueOf(-1));
    }

    /* access modifiers changed from: 0000 */
    public final void applyUpdates(FlatShadowNode flatShadowNode) {
        float layoutWidth = flatShadowNode.getLayoutWidth();
        float layoutHeight = flatShadowNode.getLayoutHeight();
        float layoutX = flatShadowNode.getLayoutX();
        float layoutY = flatShadowNode.getLayoutY();
        FlatShadowNode flatShadowNode2 = flatShadowNode;
        float f = layoutX;
        float f2 = layoutY;
        float f3 = layoutWidth + layoutX;
        float f4 = layoutHeight + layoutY;
        collectStateForMountableNode(flatShadowNode2, f, f2, f3, f4, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        updateViewBounds(flatShadowNode2, f, f2, f3, f4);
    }

    StateBuilder(FlatUIViewOperationQueue flatUIViewOperationQueue) {
        this.mOperationsQueue = flatUIViewOperationQueue;
    }

    /* access modifiers changed from: 0000 */
    public final void afterUpdateViewHierarchy(EventDispatcher eventDispatcher) {
        if (this.mDetachAllChildrenFromViews != null) {
            int[] collectViewTags = collectViewTags(this.mViewsToDetachAllChildrenFrom);
            this.mViewsToDetachAllChildrenFrom.clear();
            this.mDetachAllChildrenFromViews.setViewsToDetachAllChildrenFrom(collectViewTags);
            this.mDetachAllChildrenFromViews = null;
        }
        int size = this.mUpdateViewBoundsOperations.size();
        for (int i = 0; i != size; i++) {
            this.mOperationsQueue.enqueueFlatUIOperation((UIOperation) this.mUpdateViewBoundsOperations.get(i));
        }
        this.mUpdateViewBoundsOperations.clear();
        int size2 = this.mViewManagerCommands.size();
        for (int i2 = 0; i2 != size2; i2++) {
            this.mOperationsQueue.enqueueFlatUIOperation((UIOperation) this.mViewManagerCommands.get(i2));
        }
        this.mViewManagerCommands.clear();
        int size3 = this.mOnLayoutEvents.size();
        for (int i3 = 0; i3 != size3; i3++) {
            eventDispatcher.dispatchEvent((Event) this.mOnLayoutEvents.get(i3));
        }
        this.mOnLayoutEvents.clear();
        if (this.mViewsToDrop.size() > 0) {
            this.mOperationsQueue.enqueueDropViews(this.mViewsToDrop, this.mParentsForViewsToDrop);
            this.mViewsToDrop.clear();
            this.mParentsForViewsToDrop.clear();
        }
        this.mOperationsQueue.enqueueProcessLayoutRequests();
    }

    /* access modifiers changed from: 0000 */
    public final void dropView(FlatShadowNode flatShadowNode, int i) {
        this.mViewsToDrop.add(Integer.valueOf(flatShadowNode.getReactTag()));
        this.mParentsForViewsToDrop.add(Integer.valueOf(i));
    }

    private void updateViewPadding(AndroidView androidView, int i) {
        if (androidView.isPaddingChanged()) {
            this.mOperationsQueue.enqueueSetPadding(i, Math.round(androidView.getPadding(0)), Math.round(androidView.getPadding(1)), Math.round(androidView.getPadding(2)), Math.round(androidView.getPadding(3)));
            androidView.resetPaddingChanged();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void enqueueCreateOrUpdateView(FlatShadowNode flatShadowNode, ReactStylesDiffMap reactStylesDiffMap) {
        if (flatShadowNode.isBackingViewCreated()) {
            this.mOperationsQueue.enqueueUpdateProperties(flatShadowNode.getReactTag(), flatShadowNode.getViewClass(), reactStylesDiffMap);
            return;
        }
        this.mOperationsQueue.enqueueCreateView(flatShadowNode.getThemedContext(), flatShadowNode.getReactTag(), flatShadowNode.getViewClass(), reactStylesDiffMap);
        flatShadowNode.signalBackingViewIsCreated();
    }

    /* access modifiers changed from: 0000 */
    public final void enqueueViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        this.mViewManagerCommands.add(this.mOperationsQueue.createViewManagerCommand(i, i2, readableArray));
    }

    private void updateNativeChildren(FlatShadowNode flatShadowNode, FlatShadowNode[] flatShadowNodeArr, FlatShadowNode[] flatShadowNodeArr2) {
        int[] iArr;
        flatShadowNode.setNativeChildren(flatShadowNodeArr2);
        if (this.mDetachAllChildrenFromViews == null) {
            this.mDetachAllChildrenFromViews = this.mOperationsQueue.enqueueDetachAllChildrenFromViews();
        }
        if (flatShadowNodeArr.length != 0) {
            this.mViewsToDetachAllChildrenFrom.add(flatShadowNode);
        }
        int reactTag = flatShadowNode.getReactTag();
        int length = flatShadowNodeArr2.length;
        if (length == 0) {
            iArr = EMPTY_INT_ARRAY;
        } else {
            iArr = new int[length];
            int i = 0;
            for (FlatShadowNode flatShadowNode2 : flatShadowNodeArr2) {
                if (flatShadowNode2.getNativeParentTag() == reactTag) {
                    iArr[i] = -flatShadowNode2.getReactTag();
                } else {
                    iArr[i] = flatShadowNode2.getReactTag();
                }
                flatShadowNode2.setNativeParentTag(-1);
                i++;
            }
        }
        for (FlatShadowNode flatShadowNode3 : flatShadowNodeArr) {
            if (flatShadowNode3.getNativeParentTag() == reactTag) {
                this.mViewsToDetach.add(flatShadowNode3);
                flatShadowNode3.setNativeParentTag(-1);
            }
        }
        int[] collectViewTags = collectViewTags(this.mViewsToDetach);
        this.mViewsToDetach.clear();
        for (FlatShadowNode nativeParentTag : flatShadowNodeArr2) {
            nativeParentTag.setNativeParentTag(reactTag);
        }
        this.mOperationsQueue.enqueueUpdateViewGroup(reactTag, iArr, collectViewTags);
    }

    private void updateViewBounds(FlatShadowNode flatShadowNode, float f, float f2, float f3, float f4) {
        int round = Math.round(f);
        int round2 = Math.round(f2);
        int round3 = Math.round(f3);
        int round4 = Math.round(f4);
        if (flatShadowNode.getViewLeft() != round || flatShadowNode.getViewTop() != round2 || flatShadowNode.getViewRight() != round3 || flatShadowNode.getViewBottom() != round4) {
            flatShadowNode.setViewBounds(round, round2, round3, round4);
            this.mUpdateViewBoundsOperations.add(this.mOperationsQueue.createUpdateViewBounds(flatShadowNode.getReactTag(), round, round2, round3, round4));
        }
    }

    private void addNodeRegion(FlatShadowNode flatShadowNode, float f, float f2, float f3, float f4, boolean z) {
        if (f != f3 && f2 != f4) {
            flatShadowNode.updateNodeRegion(f, f2, f3, f4, z);
            if (flatShadowNode.doesDraw()) {
                this.mNodeRegions.add(flatShadowNode.getNodeRegion());
            }
        }
    }

    private boolean processNodeAndCollectState(FlatShadowNode flatShadowNode, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2) {
        float layoutWidth = flatShadowNode.getLayoutWidth();
        float layoutX = f + flatShadowNode.getLayoutX();
        float layoutY = f2 + flatShadowNode.getLayoutY();
        float f7 = layoutWidth + layoutX;
        float layoutHeight = flatShadowNode.getLayoutHeight() + layoutY;
        boolean mountsToView = flatShadowNode.mountsToView();
        if (!z) {
            addNodeRegion(flatShadowNode, layoutX, layoutY, f7, layoutHeight, !mountsToView);
        }
        if (mountsToView) {
            ensureBackingViewIsCreated(flatShadowNode);
            addNativeChild(flatShadowNode);
            boolean collectStateForMountableNode = collectStateForMountableNode(flatShadowNode, 0.0f, 0.0f, f7 - layoutX, layoutHeight - layoutY, f3 - layoutX, f4 - layoutY, f5 - layoutX, f6 - layoutY);
            if (!z) {
                this.mDrawCommands.add(flatShadowNode.collectDrawView(layoutX, layoutY, f7, layoutHeight, f3, f4, f5, f6));
            }
            if (z2) {
                return collectStateForMountableNode;
            }
            updateViewBounds(flatShadowNode, layoutX, layoutY, f7, layoutHeight);
            return collectStateForMountableNode;
        }
        return collectStateRecursively(flatShadowNode, layoutX, layoutY, f7, layoutHeight, f3, f4, f5, f6, false, false);
    }

    private boolean collectStateForMountableNode(FlatShadowNode flatShadowNode, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        boolean z;
        boolean z2;
        float f9;
        boolean z3;
        float f10;
        float f11;
        float f12;
        boolean z4;
        float[] fArr;
        float[] fArr2;
        SparseIntArray sparseIntArray;
        boolean z5;
        FlatShadowNode flatShadowNode2 = flatShadowNode;
        float f13 = f5;
        float f14 = f6;
        float f15 = f7;
        float f16 = f8;
        boolean z6 = false;
        if (flatShadowNode.hasNewLayout() || flatShadowNode.isUpdated() || flatShadowNode.hasUnseenUpdates() || flatShadowNode2.clipBoundsChanged(f13, f14, f15, f16)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        flatShadowNode2.setClipBounds(f13, f14, f15, f16);
        this.mDrawCommands.start(flatShadowNode.getDrawCommands());
        this.mAttachDetachListeners.start(flatShadowNode.getAttachDetachListeners());
        this.mNodeRegions.start(flatShadowNode.getNodeRegions());
        this.mNativeChildren.start(flatShadowNode.getNativeChildren());
        if (flatShadowNode2 instanceof AndroidView) {
            AndroidView androidView = (AndroidView) flatShadowNode2;
            updateViewPadding(androidView, flatShadowNode.getReactTag());
            z2 = androidView.needsCustomLayoutForChildren();
            f12 = Float.NEGATIVE_INFINITY;
            f11 = Float.NEGATIVE_INFINITY;
            f10 = Float.POSITIVE_INFINITY;
            z3 = true;
            f9 = Float.POSITIVE_INFINITY;
        } else {
            f12 = f13;
            f11 = f14;
            f10 = f15;
            f9 = f16;
            z3 = false;
            z2 = false;
        }
        if (!z3 && flatShadowNode.isVirtualAnchor()) {
            addNodeRegion(flatShadowNode, f, f2, f3, f4, true);
        }
        boolean collectStateRecursively = collectStateRecursively(flatShadowNode, f, f2, f3, f4, f12, f11, f10, f9, z3, z2);
        DrawCommand[] drawCommandArr = (DrawCommand[]) this.mDrawCommands.finish();
        if (drawCommandArr != null) {
            flatShadowNode2.setDrawCommands(drawCommandArr);
            z4 = true;
        } else {
            z4 = false;
        }
        AttachDetachListener[] attachDetachListenerArr = (AttachDetachListener[]) this.mAttachDetachListeners.finish();
        if (attachDetachListenerArr != null) {
            flatShadowNode2.setAttachDetachListeners(attachDetachListenerArr);
            z4 = true;
        }
        NodeRegion[] nodeRegionArr = (NodeRegion[]) this.mNodeRegions.finish();
        if (nodeRegionArr != null) {
            flatShadowNode2.setNodeRegions(nodeRegionArr);
            z4 = true;
        } else if (collectStateRecursively) {
            flatShadowNode.updateOverflowsContainer();
        }
        FlatShadowNode[] flatShadowNodeArr = (FlatShadowNode[]) this.mNativeChildren.finish();
        if (z4) {
            if (flatShadowNode.clipsSubviews()) {
                float[] fArr3 = EMPTY_FLOAT_ARRAY;
                float[] fArr4 = EMPTY_FLOAT_ARRAY;
                SparseIntArray sparseIntArray2 = EMPTY_SPARSE_INT;
                if (drawCommandArr != null) {
                    SparseIntArray sparseIntArray3 = new SparseIntArray();
                    float[] fArr5 = new float[drawCommandArr.length];
                    float[] fArr6 = new float[drawCommandArr.length];
                    if (flatShadowNode.isHorizontal()) {
                        HorizontalDrawCommandManager.fillMaxMinArrays(drawCommandArr, fArr5, fArr6, sparseIntArray3);
                    } else {
                        VerticalDrawCommandManager.fillMaxMinArrays(drawCommandArr, fArr5, fArr6, sparseIntArray3);
                    }
                    sparseIntArray = sparseIntArray3;
                    fArr2 = fArr5;
                    fArr = fArr6;
                } else {
                    fArr2 = fArr3;
                    fArr = fArr4;
                    sparseIntArray = sparseIntArray2;
                }
                float[] fArr7 = EMPTY_FLOAT_ARRAY;
                float[] fArr8 = EMPTY_FLOAT_ARRAY;
                if (nodeRegionArr != null) {
                    fArr7 = new float[nodeRegionArr.length];
                    fArr8 = new float[nodeRegionArr.length];
                    if (flatShadowNode.isHorizontal()) {
                        HorizontalDrawCommandManager.fillMaxMinArrays(nodeRegionArr, fArr7, fArr8);
                    } else {
                        VerticalDrawCommandManager.fillMaxMinArrays(nodeRegionArr, fArr7, fArr8);
                    }
                }
                float[] fArr9 = fArr7;
                float[] fArr10 = fArr8;
                if (flatShadowNodeArr != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.mOperationsQueue.enqueueUpdateClippingMountState(flatShadowNode.getReactTag(), drawCommandArr, sparseIntArray, fArr2, fArr, attachDetachListenerArr, nodeRegionArr, fArr9, fArr10, z5);
            } else {
                this.mOperationsQueue.enqueueUpdateMountState(flatShadowNode.getReactTag(), drawCommandArr, attachDetachListenerArr, nodeRegionArr);
            }
        }
        if (flatShadowNode.hasUnseenUpdates()) {
            flatShadowNode2.onCollectExtraUpdates(this.mOperationsQueue);
            flatShadowNode.markUpdateSeen();
        }
        if (flatShadowNodeArr != null) {
            updateNativeChildren(flatShadowNode2, flatShadowNode.getNativeChildren(), flatShadowNodeArr);
        }
        if (z4 || flatShadowNodeArr != null || collectStateRecursively) {
            z6 = true;
        }
        return z6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean collectStateRecursively(com.facebook.react.flat.FlatShadowNode r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, boolean r35, boolean r36) {
        /*
            r25 = this;
            r10 = r26
            boolean r0 = r26.hasNewLayout()
            if (r0 == 0) goto L_0x000b
            r26.markLayoutSeen()
        L_0x000b:
            float r2 = roundToPixel(r27)
            float r3 = roundToPixel(r28)
            float r4 = roundToPixel(r29)
            float r5 = roundToPixel(r30)
            boolean r0 = r26.shouldNotifyOnLayout()
            if (r0 == 0) goto L_0x0045
            float r0 = r26.getLayoutX()
            int r0 = java.lang.Math.round(r0)
            float r1 = r26.getLayoutY()
            int r1 = java.lang.Math.round(r1)
            float r6 = r4 - r2
            int r6 = (int) r6
            float r7 = r5 - r3
            int r7 = (int) r7
            com.facebook.react.uimanager.OnLayoutEvent r0 = r10.obtainLayoutEvent(r0, r1, r6, r7)
            if (r0 == 0) goto L_0x0045
            r15 = r25
            java.util.ArrayList<com.facebook.react.uimanager.OnLayoutEvent> r1 = r15.mOnLayoutEvents
            r1.add(r0)
            goto L_0x0047
        L_0x0045:
            r15 = r25
        L_0x0047:
            boolean r0 = r26.clipToBounds()
            if (r0 == 0) goto L_0x0076
            r14 = r27
            r0 = r31
            float r0 = java.lang.Math.max(r14, r0)
            r13 = r28
            r1 = r32
            float r1 = java.lang.Math.max(r13, r1)
            r6 = r29
            r7 = r33
            float r6 = java.lang.Math.min(r6, r7)
            r7 = r30
            r8 = r34
            float r7 = java.lang.Math.min(r7, r8)
            r21 = r0
            r22 = r1
            r23 = r6
            r24 = r7
            goto L_0x008a
        L_0x0076:
            r14 = r27
            r13 = r28
            r0 = r31
            r1 = r32
            r7 = r33
            r8 = r34
            r21 = r0
            r22 = r1
            r23 = r7
            r24 = r8
        L_0x008a:
            float r6 = roundToPixel(r21)
            float r7 = roundToPixel(r22)
            float r8 = roundToPixel(r23)
            r0 = r26
            r1 = r25
            r9 = r24
            r0.collectState(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r26.getChildCount()
            r1 = 0
            r2 = 0
        L_0x00a5:
            if (r1 == r0) goto L_0x00d4
            com.facebook.react.uimanager.ReactShadowNodeImpl r3 = r10.getChildAt(r1)
            boolean r4 = r3.isVirtual()
            if (r4 != 0) goto L_0x00cb
            r12 = r3
            com.facebook.react.flat.FlatShadowNode r12 = (com.facebook.react.flat.FlatShadowNode) r12
            r11 = r25
            r13 = r27
            r14 = r28
            r15 = r21
            r16 = r22
            r17 = r23
            r18 = r24
            r19 = r35
            r20 = r36
            boolean r3 = r11.processNodeAndCollectState(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2 = r2 | r3
        L_0x00cb:
            int r1 = r1 + 1
            r15 = r25
            r14 = r27
            r13 = r28
            goto L_0x00a5
        L_0x00d4:
            r26.resetUpdated()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.flat.StateBuilder.collectStateRecursively(com.facebook.react.flat.FlatShadowNode, float, float, float, float, float, float, float, float, boolean, boolean):boolean");
    }
}
