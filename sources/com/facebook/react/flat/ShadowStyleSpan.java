package com.facebook.react.flat;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

final class ShadowStyleSpan extends CharacterStyle {
    static final ShadowStyleSpan INSTANCE;
    private int mColor;
    private float mDx;
    private float mDy;
    private boolean mFrozen;
    private float mRadius;

    /* access modifiers changed from: 0000 */
    public final void freeze() {
        this.mFrozen = true;
    }

    public final int getColor() {
        return this.mColor;
    }

    public final float getRadius() {
        return this.mRadius;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isFrozen() {
        return this.mFrozen;
    }

    static {
        ShadowStyleSpan shadowStyleSpan = new ShadowStyleSpan(0.0f, 0.0f, 0.0f, 0, true);
        INSTANCE = shadowStyleSpan;
    }

    /* access modifiers changed from: 0000 */
    public final ShadowStyleSpan mutableCopy() {
        ShadowStyleSpan shadowStyleSpan = new ShadowStyleSpan(this.mDx, this.mDy, this.mRadius, this.mColor, false);
        return shadowStyleSpan;
    }

    public final void setColor(int i) {
        this.mColor = i;
    }

    public final void setRadius(float f) {
        this.mRadius = f;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.mRadius, this.mDx, this.mDy, this.mColor);
    }

    public final void setOffset(float f, float f2) {
        this.mDx = f;
        this.mDy = f2;
    }

    public final boolean offsetMatches(float f, float f2) {
        if (this.mDx == f && this.mDy == f2) {
            return true;
        }
        return false;
    }

    private ShadowStyleSpan(float f, float f2, float f3, int i, boolean z) {
        this.mDx = f;
        this.mDy = f2;
        this.mRadius = f3;
        this.mColor = i;
        this.mFrozen = z;
    }
}
