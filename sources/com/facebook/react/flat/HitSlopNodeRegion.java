package com.facebook.react.flat;

import android.graphics.Rect;

final class HitSlopNodeRegion extends NodeRegion {
    private final Rect mHitSlop;

    /* access modifiers changed from: 0000 */
    public final float getTouchableBottom() {
        return getBottom() + ((float) this.mHitSlop.bottom);
    }

    /* access modifiers changed from: 0000 */
    public final float getTouchableLeft() {
        return getLeft() - ((float) this.mHitSlop.left);
    }

    /* access modifiers changed from: 0000 */
    public final float getTouchableRight() {
        return getRight() + ((float) this.mHitSlop.right);
    }

    /* access modifiers changed from: 0000 */
    public final float getTouchableTop() {
        return getTop() - ((float) this.mHitSlop.top);
    }

    /* access modifiers changed from: 0000 */
    public final boolean withinBounds(float f, float f2) {
        if (getTouchableLeft() > f || f >= getTouchableRight() || getTouchableTop() > f2 || f2 >= getTouchableBottom()) {
            return false;
        }
        return true;
    }

    HitSlopNodeRegion(Rect rect, float f, float f2, float f3, float f4, int i, boolean z) {
        super(f, f2, f3, f4, i, z);
        this.mHitSlop = rect;
    }
}
