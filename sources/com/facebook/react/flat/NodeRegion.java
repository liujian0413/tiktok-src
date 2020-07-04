package com.facebook.react.flat;

class NodeRegion {
    static final NodeRegion EMPTY;
    static final NodeRegion[] EMPTY_ARRAY = new NodeRegion[0];
    private final float mBottom;
    final boolean mIsVirtual;
    private final float mLeft;
    private final float mRight;
    final int mTag;
    private final float mTop;

    /* access modifiers changed from: 0000 */
    public final float getBottom() {
        return this.mBottom;
    }

    /* access modifiers changed from: 0000 */
    public final float getLeft() {
        return this.mLeft;
    }

    /* access modifiers changed from: 0000 */
    public final float getRight() {
        return this.mRight;
    }

    /* access modifiers changed from: 0000 */
    public final float getTop() {
        return this.mTop;
    }

    /* access modifiers changed from: 0000 */
    public float getTouchableBottom() {
        return getBottom();
    }

    /* access modifiers changed from: 0000 */
    public float getTouchableLeft() {
        return getLeft();
    }

    /* access modifiers changed from: 0000 */
    public float getTouchableRight() {
        return getRight();
    }

    /* access modifiers changed from: 0000 */
    public float getTouchableTop() {
        return getTop();
    }

    static {
        NodeRegion nodeRegion = new NodeRegion(0.0f, 0.0f, 0.0f, 0.0f, -1, false);
        EMPTY = nodeRegion;
    }

    /* access modifiers changed from: 0000 */
    public boolean matchesTag(int i) {
        if (this.mTag == i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public int getReactTag(float f, float f2) {
        return this.mTag;
    }

    /* access modifiers changed from: 0000 */
    public boolean withinBounds(float f, float f2) {
        if (this.mLeft > f || f >= this.mRight || this.mTop > f2 || f2 >= this.mBottom) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean matches(float f, float f2, float f3, float f4, boolean z) {
        if (f == this.mLeft && f2 == this.mTop && f3 == this.mRight && f4 == this.mBottom && z == this.mIsVirtual) {
            return true;
        }
        return false;
    }

    NodeRegion(float f, float f2, float f3, float f4, int i, boolean z) {
        this.mLeft = f;
        this.mTop = f2;
        this.mRight = f3;
        this.mBottom = f4;
        this.mTag = i;
        this.mIsVirtual = z;
    }
}
