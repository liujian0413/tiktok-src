package com.facebook.react.flat;

import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.yoga.YogaDirection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FlatUIImplementation extends UIImplementation {
    private static final Map<String, Class<? extends ViewManager>> flatManagerClassMap;
    private final boolean mMemoryImprovementEnabled;
    private final MoveProxy mMoveProxy = new MoveProxy();
    private RCTImageViewManager mRCTImageViewManager;
    private final ReactApplicationContext mReactContext;
    private final StateBuilder mStateBuilder;

    public void updateViewHierarchy() {
        super.updateViewHierarchy();
        this.mStateBuilder.afterUpdateViewHierarchy(this.mEventDispatcher);
    }

    public ReactShadowNode createRootShadowNode() {
        if (this.mRCTImageViewManager != null) {
            this.mReactContext.getNativeModule(FrescoModule.class);
            DraweeRequestHelper.setDraweeControllerBuilder(this.mRCTImageViewManager.getDraweeControllerBuilder());
            this.mRCTImageViewManager = null;
        }
        FlatRootShadowNode flatRootShadowNode = new FlatRootShadowNode();
        if (I18nUtil.getInstance().isRTL(this.mReactContext)) {
            flatRootShadowNode.setLayoutDirection(YogaDirection.RTL);
        }
        return flatRootShadowNode;
    }

    static {
        HashMap hashMap = new HashMap();
        flatManagerClassMap = hashMap;
        hashMap.put("RCTView", RCTViewManager.class);
        flatManagerClassMap.put("RCTText", RCTTextManager.class);
        flatManagerClassMap.put("RCTRawText", RCTRawTextManager.class);
        flatManagerClassMap.put("RCTVirtualText", RCTVirtualTextManager.class);
        flatManagerClassMap.put("RCTTextInlineImage", RCTTextInlineImageManager.class);
        flatManagerClassMap.put("RCTImageView", RCTImageViewManager.class);
        flatManagerClassMap.put("AndroidTextInput", RCTTextInputManager.class);
        flatManagerClassMap.put("AndroidViewPager", RCTViewPagerManager.class);
        flatManagerClassMap.put("ARTSurfaceView", FlatARTSurfaceViewManager.class);
        flatManagerClassMap.put("RCTModalHostView", RCTModalHostManager.class);
    }

    public void removeRootView(int i) {
        if (this.mMemoryImprovementEnabled) {
            removeRootShadowNode(i);
        }
        this.mStateBuilder.removeRootView(i);
    }

    private void ensureMountsToViewAndBackingViewIsCreated(int i) {
        FlatShadowNode flatShadowNode = (FlatShadowNode) resolveShadowNode(i);
        if (!flatShadowNode.isBackingViewCreated()) {
            flatShadowNode.forceMountToView();
            this.mStateBuilder.ensureBackingViewIsCreated(flatShadowNode);
        }
    }

    public ReactShadowNode createShadowNode(String str) {
        ReactShadowNode createShadowNode = super.createShadowNode(str);
        if ((createShadowNode instanceof FlatShadowNode) || createShadowNode.isVirtual()) {
            return createShadowNode;
        }
        return new NativeViewWrapper(resolveViewManager(str));
    }

    private static Map<String, ViewManager> buildViewManagerMap(List<ViewManager> list) {
        HashMap hashMap = new HashMap();
        for (ViewManager viewManager : list) {
            hashMap.put(viewManager.getName(), viewManager);
        }
        for (Entry entry : flatManagerClassMap.entrySet()) {
            String str = (String) entry.getKey();
            ViewManager viewManager2 = (ViewManager) hashMap.get(str);
            if (viewManager2 != null) {
                Class cls = (Class) entry.getValue();
                if (viewManager2.getClass() != cls) {
                    try {
                        hashMap.put(str, cls.newInstance());
                    } catch (IllegalAccessException e) {
                        StringBuilder sb = new StringBuilder("Unable to access flat class for ");
                        sb.append(str);
                        throw new RuntimeException(sb.toString(), e);
                    } catch (InstantiationException e2) {
                        StringBuilder sb2 = new StringBuilder("Unable to instantiate flat class for ");
                        sb2.append(str);
                        throw new RuntimeException(sb2.toString(), e2);
                    }
                }
            }
        }
        return hashMap;
    }

    private void moveChild(ReactShadowNode reactShadowNode, int i) {
        this.mMoveProxy.setChildMoveFrom(i, reactShadowNode);
    }

    private void removeChild(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2) {
        dropNativeViews(reactShadowNode, reactShadowNode2);
        removeShadowNode(reactShadowNode);
    }

    public void measure(int i, Callback callback) {
        measureHelper(i, false, callback);
    }

    public void measureInWindow(int i, Callback callback) {
        measureHelper(i, true, callback);
    }

    public void sendAccessibilityEvent(int i, int i2) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        super.sendAccessibilityEvent(i, i2);
    }

    public void setChildren(int i, ReadableArray readableArray) {
        ReactShadowNode resolveShadowNode = resolveShadowNode(i);
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            addChildAt(resolveShadowNode, resolveShadowNode(readableArray.getInt(i2)), i2, i2 - 1);
        }
    }

    public void setJSResponder(int i, boolean z) {
        ReactShadowNode resolveShadowNode = resolveShadowNode(i);
        while (resolveShadowNode.isVirtual()) {
            resolveShadowNode = resolveShadowNode.getParent();
        }
        int reactTag = resolveShadowNode.getReactTag();
        while ((resolveShadowNode instanceof FlatShadowNode) && !((FlatShadowNode) resolveShadowNode).mountsToView()) {
            resolveShadowNode = resolveShadowNode.getParent();
        }
        FlatUIViewOperationQueue operationsQueue = this.mStateBuilder.getOperationsQueue();
        if (resolveShadowNode != null) {
            reactTag = resolveShadowNode.getReactTag();
        }
        operationsQueue.enqueueSetJSResponder(reactTag, i, z);
    }

    private void dropNativeViews(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2) {
        if (reactShadowNode instanceof FlatShadowNode) {
            FlatShadowNode flatShadowNode = (FlatShadowNode) reactShadowNode;
            if (flatShadowNode.mountsToView() && flatShadowNode.isBackingViewCreated()) {
                int i = -1;
                while (true) {
                    if (reactShadowNode2 == null) {
                        break;
                    }
                    if (reactShadowNode2 instanceof FlatShadowNode) {
                        FlatShadowNode flatShadowNode2 = (FlatShadowNode) reactShadowNode2;
                        if (flatShadowNode2.mountsToView() && flatShadowNode2.isBackingViewCreated() && flatShadowNode2.getParent() != null) {
                            i = flatShadowNode2.getReactTag();
                            break;
                        }
                    }
                    reactShadowNode2 = reactShadowNode2.getParent();
                }
                this.mStateBuilder.dropView(flatShadowNode, i);
                return;
            }
        }
        int childCount = reactShadowNode.getChildCount();
        for (int i2 = 0; i2 != childCount; i2++) {
            dropNativeViews(reactShadowNode.getChildAt(i2), reactShadowNode);
        }
    }

    public void addAnimation(int i, int i2, Callback callback) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        super.addAnimation(i, i2, callback);
    }

    public void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f, float f2) {
        this.mStateBuilder.applyUpdates((FlatRootShadowNode) reactShadowNode);
    }

    public void dispatchViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        this.mStateBuilder.enqueueViewManagerCommand(i, i2, readableArray);
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, int i, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode instanceof FlatShadowNode) {
            FlatShadowNode flatShadowNode = (FlatShadowNode) reactShadowNode;
            if (reactStylesDiffMap != null) {
                flatShadowNode.handleUpdateProperties(reactStylesDiffMap);
            }
            if (flatShadowNode.mountsToView()) {
                this.mStateBuilder.enqueueCreateOrUpdateView(flatShadowNode, reactStylesDiffMap);
            }
            return;
        }
        super.handleCreateView(reactShadowNode, i, reactStylesDiffMap);
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode instanceof FlatShadowNode) {
            FlatShadowNode flatShadowNode = (FlatShadowNode) reactShadowNode;
            flatShadowNode.handleUpdateProperties(reactStylesDiffMap);
            if (flatShadowNode.mountsToView()) {
                this.mStateBuilder.enqueueCreateOrUpdateView(flatShadowNode, reactStylesDiffMap);
            }
            return;
        }
        super.handleUpdateView(reactShadowNode, str, reactStylesDiffMap);
    }

    private static ReactShadowNode removeChildAt(ReactShadowNode reactShadowNode, int i, int i2) {
        if (i < i2) {
            return reactShadowNode.removeChildAt(i);
        }
        StringBuilder sb = new StringBuilder("Invariant failure, needs sorting! ");
        sb.append(i);
        sb.append(" >= ");
        sb.append(i2);
        throw new RuntimeException(sb.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    private void addChildren(com.facebook.react.uimanager.ReactShadowNode r10, com.facebook.react.bridge.ReadableArray r11, com.facebook.react.bridge.ReadableArray r12) {
        /*
            r9 = this;
            com.facebook.react.flat.MoveProxy r0 = r9.mMoveProxy
            int r0 = r0.size()
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != 0) goto L_0x0013
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x001b
        L_0x0013:
            com.facebook.react.flat.MoveProxy r0 = r9.mMoveProxy
            int r0 = r0.getMoveTo(r1)
            r3 = r0
            r0 = 0
        L_0x001b:
            r4 = -1
            if (r12 != 0) goto L_0x0026
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
        L_0x0022:
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002e
        L_0x0026:
            int r5 = r12.size()
            int r6 = r12.getInt(r1)
        L_0x002e:
            if (r6 >= r3) goto L_0x0049
            int r7 = r11.getInt(r1)
            com.facebook.react.uimanager.ReactShadowNode r7 = r9.resolveShadowNode(r7)
            addChildAt(r10, r7, r6, r4)
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0041
            r4 = r6
            goto L_0x0022
        L_0x0041:
            int r4 = r12.getInt(r1)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L_0x002e
        L_0x0049:
            if (r3 >= r6) goto L_0x006d
            com.facebook.react.flat.MoveProxy r7 = r9.mMoveProxy
            com.facebook.react.uimanager.ReactShadowNode r7 = r7.getChildMoveTo(r0)
            addChildAt(r10, r7, r3, r4)
            int r0 = r0 + 1
            com.facebook.react.flat.MoveProxy r4 = r9.mMoveProxy
            int r4 = r4.size()
            if (r0 != r4) goto L_0x0063
            r4 = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002e
        L_0x0063:
            com.facebook.react.flat.MoveProxy r4 = r9.mMoveProxy
            int r4 = r4.getMoveTo(r0)
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x002e
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.flat.FlatUIImplementation.addChildren(com.facebook.react.uimanager.ReactShadowNode, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray):void");
    }

    private void measureHelper(int i, boolean z, Callback callback) {
        float f;
        FlatShadowNode flatShadowNode = (FlatShadowNode) resolveShadowNode(i);
        if (flatShadowNode.mountsToView()) {
            this.mStateBuilder.ensureBackingViewIsCreated(flatShadowNode);
            if (z) {
                super.measureInWindow(i, callback);
            } else {
                super.measure(i, callback);
            }
        } else {
            while (flatShadowNode != null && flatShadowNode.isVirtual()) {
                flatShadowNode = (FlatShadowNode) flatShadowNode.getParent();
            }
            if (flatShadowNode != null) {
                float layoutWidth = flatShadowNode.getLayoutWidth();
                float layoutHeight = flatShadowNode.getLayoutHeight();
                boolean mountsToView = flatShadowNode.mountsToView();
                float f2 = 0.0f;
                if (mountsToView) {
                    f = flatShadowNode.getLayoutX();
                } else {
                    f = 0.0f;
                }
                if (mountsToView) {
                    f2 = flatShadowNode.getLayoutY();
                }
                while (!flatShadowNode.mountsToView()) {
                    if (!flatShadowNode.isVirtual()) {
                        f += flatShadowNode.getLayoutX();
                        f2 += flatShadowNode.getLayoutY();
                    }
                    flatShadowNode = (FlatShadowNode) C13854a.m40912a((FlatShadowNode) flatShadowNode.getParent());
                }
                float layoutWidth2 = flatShadowNode.getLayoutWidth();
                float layoutHeight2 = flatShadowNode.getLayoutHeight();
                FlatUIViewOperationQueue operationsQueue = this.mStateBuilder.getOperationsQueue();
                operationsQueue.enqueueMeasureVirtualView(flatShadowNode.getReactTag(), f / layoutWidth2, f2 / layoutHeight2, layoutWidth / layoutWidth2, layoutHeight / layoutHeight2, z, callback);
            }
        }
    }

    public void findSubviewIn(int i, float f, float f2, Callback callback) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        super.findSubviewIn(i, f, f2, callback);
    }

    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        super.showPopupMenu(i, readableArray, callback, callback2);
    }

    private static void addChildAt(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i, int i2) {
        if (i > i2) {
            reactShadowNode.addChildAt(reactShadowNode2, i);
            return;
        }
        StringBuilder sb = new StringBuilder("Invariant failure, needs sorting! ");
        sb.append(i);
        sb.append(" <= ");
        sb.append(i2);
        throw new RuntimeException(sb.toString());
    }

    private void removeChildren(ReactShadowNode reactShadowNode, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.mMoveProxy.setup(readableArray, readableArray2);
        int size = this.mMoveProxy.size() - 1;
        if (size == -1) {
            i = -1;
        } else {
            i = this.mMoveProxy.getMoveFrom(size);
        }
        if (readableArray3 == null) {
            i2 = 0;
        } else {
            i2 = readableArray3.size();
        }
        int[] iArr = new int[i2];
        if (i2 > 0) {
            C13854a.m40916b(readableArray3);
            for (int i7 = 0; i7 < i2; i7++) {
                iArr[i7] = readableArray3.getInt(i7);
            }
        }
        Arrays.sort(iArr);
        int i8 = Integer.MAX_VALUE;
        if (readableArray3 == null) {
            i3 = -1;
            i4 = -1;
        } else {
            i3 = iArr.length - 1;
            i4 = iArr[i3];
        }
        while (true) {
            if (i > i4) {
                moveChild(removeChildAt(reactShadowNode, i, i8), size);
                size--;
                if (size == -1) {
                    i6 = -1;
                } else {
                    i6 = this.mMoveProxy.getMoveFrom(size);
                }
                int i9 = i6;
                i8 = i;
                i = i9;
            } else if (i4 > i) {
                removeChild(removeChildAt(reactShadowNode, i4, i8), reactShadowNode);
                i3--;
                if (i3 == -1) {
                    i5 = -1;
                } else {
                    i5 = iArr[i3];
                }
                int i10 = i4;
                i4 = i5;
                i8 = i10;
            } else {
                return;
            }
        }
    }

    public static FlatUIImplementation createInstance(ReactApplicationContext reactApplicationContext, List<ViewManager> list, EventDispatcher eventDispatcher, boolean z, int i) {
        Map buildViewManagerMap = buildViewManagerMap(list);
        RCTImageViewManager rCTImageViewManager = (RCTImageViewManager) buildViewManagerMap.get("RCTImageView");
        if (rCTImageViewManager != null) {
            Object callerContext = rCTImageViewManager.getCallerContext();
            if (callerContext != null) {
                RCTImageView.setCallerContext(callerContext);
            }
        }
        DraweeRequestHelper.setResources(reactApplicationContext.getResources());
        TypefaceCache.setAssetManager(reactApplicationContext.getAssets());
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(buildViewManagerMap);
        FlatUIImplementation flatUIImplementation = new FlatUIImplementation(reactApplicationContext, rCTImageViewManager, viewManagerRegistry, new FlatUIViewOperationQueue(reactApplicationContext, new FlatNativeViewHierarchyManager(viewManagerRegistry), i), eventDispatcher, z);
        return flatUIImplementation;
    }

    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        ReactShadowNode resolveShadowNode = resolveShadowNode(i);
        removeChildren(resolveShadowNode, readableArray, readableArray2, readableArray5);
        addChildren(resolveShadowNode, readableArray3, readableArray4);
    }

    private FlatUIImplementation(ReactApplicationContext reactApplicationContext, RCTImageViewManager rCTImageViewManager, ViewManagerRegistry viewManagerRegistry, FlatUIViewOperationQueue flatUIViewOperationQueue, EventDispatcher eventDispatcher, boolean z) {
        super(reactApplicationContext, viewManagerRegistry, (UIViewOperationQueue) flatUIViewOperationQueue, eventDispatcher);
        this.mReactContext = reactApplicationContext;
        this.mRCTImageViewManager = rCTImageViewManager;
        this.mStateBuilder = new StateBuilder(flatUIViewOperationQueue);
        this.mMemoryImprovementEnabled = z;
    }
}
