package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewParent;

abstract class DrawCommandManager {
    DrawCommandManager() {
    }

    /* access modifiers changed from: 0000 */
    public abstract NodeRegion anyNodeRegionWithinBounds(float f, float f2);

    /* access modifiers changed from: 0000 */
    public abstract void debugDraw(Canvas canvas);

    /* access modifiers changed from: 0000 */
    public abstract void draw(Canvas canvas);

    /* access modifiers changed from: 0000 */
    public abstract void getClippingRect(Rect rect);

    /* access modifiers changed from: 0000 */
    public abstract SparseArray<View> getDetachedViews();

    /* access modifiers changed from: 0000 */
    public abstract void mountDrawCommands(DrawCommand[] drawCommandArr, SparseIntArray sparseIntArray, float[] fArr, float[] fArr2, boolean z);

    /* access modifiers changed from: 0000 */
    public abstract void mountNodeRegions(NodeRegion[] nodeRegionArr, float[] fArr, float[] fArr2);

    /* access modifiers changed from: 0000 */
    public abstract void mountViews(ViewResolver viewResolver, int[] iArr, int[] iArr2);

    /* access modifiers changed from: 0000 */
    public abstract void onClippedViewDropped(View view);

    /* access modifiers changed from: 0000 */
    public abstract boolean updateClippingRect();

    /* access modifiers changed from: 0000 */
    public abstract NodeRegion virtualNodeRegionWithinBounds(float f, float f2);

    protected static void ensureViewHasNoParent(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            StringBuilder sb = new StringBuilder("Cannot add view ");
            sb.append(view);
            sb.append(" to DrawCommandManager while it has a parent ");
            sb.append(parent);
            throw new RuntimeException(sb.toString());
        }
    }

    static DrawCommandManager getVerticalClippingInstance(FlatViewGroup flatViewGroup, DrawCommand[] drawCommandArr) {
        return new VerticalDrawCommandManager(flatViewGroup, drawCommandArr);
    }
}
