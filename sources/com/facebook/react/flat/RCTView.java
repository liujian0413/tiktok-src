package com.facebook.react.flat;

import android.graphics.Rect;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;

final class RCTView extends FlatShadowNode {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private DrawBorder mDrawBorder;
    private Rect mHitSlop;
    boolean mHorizontal;
    boolean mRemoveClippedSubviews;

    RCTView() {
    }

    public final boolean clipsSubviews() {
        return this.mRemoveClippedSubviews;
    }

    /* access modifiers changed from: 0000 */
    public final boolean doesDraw() {
        if (this.mDrawBorder != null || super.doesDraw()) {
            return true;
        }
        return false;
    }

    private DrawBorder getMutableBorder() {
        if (this.mDrawBorder == null) {
            this.mDrawBorder = new DrawBorder();
        } else if (this.mDrawBorder.isFrozen()) {
            this.mDrawBorder = (DrawBorder) this.mDrawBorder.mutableCopy();
        }
        invalidate();
        return this.mDrawBorder;
    }

    @ReactProp(name = "pointerEvents")
    public final void setPointerEvents(String str) {
        forceMountToView();
    }

    public final void setBackgroundColor(int i) {
        getMutableBorder().setBackgroundColor(i);
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(String str) {
        getMutableBorder().setBorderStyle(str);
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public final void setHotspot(ReadableMap readableMap) {
        if (readableMap != null) {
            forceMountToView();
        }
    }

    @ReactProp(name = "borderRadius")
    public final void setBorderRadius(float f) {
        this.mClipRadius = f;
        if (this.mClipToBounds && f > 0.5f) {
            forceMountToView();
        }
        getMutableBorder().setBorderRadius(PixelUtil.toPixelFromDIP(f));
    }

    /* access modifiers changed from: 0000 */
    public final void handleUpdateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        boolean z;
        boolean z2 = true;
        if (this.mRemoveClippedSubviews || (reactStylesDiffMap.hasKey("removeClippedSubviews") && reactStylesDiffMap.getBoolean("removeClippedSubviews", false))) {
            z = true;
        } else {
            z = false;
        }
        this.mRemoveClippedSubviews = z;
        if (this.mRemoveClippedSubviews) {
            if (!this.mHorizontal && (!reactStylesDiffMap.hasKey("horizontal") || !reactStylesDiffMap.getBoolean("horizontal", false))) {
                z2 = false;
            }
            this.mHorizontal = z2;
        }
        super.handleUpdateProperties(reactStylesDiffMap);
    }

    @ReactProp(name = "hitSlop")
    public final void setHitSlop(ReadableMap readableMap) {
        if (readableMap == null) {
            this.mHitSlop = null;
        } else {
            this.mHitSlop = new Rect((int) PixelUtil.toPixelFromDIP(readableMap.getDouble("left")), (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("top")), (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("right")), (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("bottom")));
        }
    }

    @ReactPropGroup(customType = "Color", defaultDouble = Double.NaN, names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public final void setBorderColor(int i, double d) {
        int i2 = SPACING_TYPES[i];
        if (Double.isNaN(d)) {
            getMutableBorder().resetBorderColor(i2);
        } else {
            getMutableBorder().setBorderColor(i2, (int) d);
        }
    }

    public final void setBorderWidths(int i, float f) {
        super.setBorderWidths(i, f);
        getMutableBorder().setBorderWidth(SPACING_TYPES[i], PixelUtil.toPixelFromDIP(f));
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.facebook.react.flat.NodeRegion] */
    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.react.flat.HitSlopNodeRegion] */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.react.flat.NodeRegion] */
    /* JADX WARNING: type inference failed for: r8v2, types: [com.facebook.react.flat.HitSlopNodeRegion] */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.facebook.react.flat.NodeRegion] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v2, types: [com.facebook.react.flat.HitSlopNodeRegion]
      assigns: [com.facebook.react.flat.HitSlopNodeRegion, com.facebook.react.flat.NodeRegion]
      uses: [com.facebook.react.flat.HitSlopNodeRegion, com.facebook.react.flat.NodeRegion]
      mth insns count: 31
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateNodeRegion(float r17, float r18, float r19, float r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            com.facebook.react.flat.NodeRegion r1 = r16.getNodeRegion()
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            boolean r1 = r1.matches(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0048
            android.graphics.Rect r1 = r0.mHitSlop
            if (r1 != 0) goto L_0x002f
            com.facebook.react.flat.NodeRegion r1 = new com.facebook.react.flat.NodeRegion
            int r7 = r16.getReactTag()
            r2 = r1
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0045
        L_0x002f:
            com.facebook.react.flat.HitSlopNodeRegion r1 = new com.facebook.react.flat.HitSlopNodeRegion
            android.graphics.Rect r9 = r0.mHitSlop
            int r14 = r16.getReactTag()
            r8 = r1
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r15 = r21
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
        L_0x0045:
            r0.setNodeRegion(r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.flat.RCTView.updateNodeRegion(float, float, float, float, boolean):void");
    }

    /* access modifiers changed from: protected */
    public final void collectState(StateBuilder stateBuilder, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        super.collectState(stateBuilder, f, f2, f3, f4, f5, f6, f7, f8);
        if (this.mDrawBorder != null) {
            this.mDrawBorder = (DrawBorder) this.mDrawBorder.updateBoundsAndFreeze(f, f2, f3, f4, f5, f6, f7, f8);
            StateBuilder stateBuilder2 = stateBuilder;
            stateBuilder.addDrawCommand(this.mDrawBorder);
        }
    }
}
