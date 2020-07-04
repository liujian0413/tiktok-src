package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

abstract class AbstractDrawCommand extends DrawCommand implements Cloneable {
    private static Paint sDebugHighlightOverlayText;
    private static Paint sDebugHighlightRed;
    private static Paint sDebugHighlightYellow;
    private float mBottom;
    private float mClipBottom;
    private float mClipLeft;
    private float mClipRight;
    private float mClipTop;
    private boolean mFrozen;
    private float mLeft;
    protected boolean mNeedsClipping;
    private float mRight;
    private float mTop;

    AbstractDrawCommand() {
    }

    protected static int getDebugBorderColor() {
        return -16711681;
    }

    public final void freeze() {
        this.mFrozen = true;
    }

    public final float getBottom() {
        return this.mBottom;
    }

    public final float getClipBottom() {
        return this.mClipBottom;
    }

    public final float getClipLeft() {
        return this.mClipLeft;
    }

    public final float getClipRight() {
        return this.mClipRight;
    }

    public final float getClipTop() {
        return this.mClipTop;
    }

    public final float getLeft() {
        return this.mLeft;
    }

    public final float getRight() {
        return this.mRight;
    }

    public final float getTop() {
        return this.mTop;
    }

    public final boolean isFrozen() {
        return this.mFrozen;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChanged() {
    }

    /* access modifiers changed from: protected */
    public void onDebugDrawHighlight(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public abstract void onDraw(Canvas canvas);

    /* access modifiers changed from: protected */
    public void onPreDraw(FlatViewGroup flatViewGroup, Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public String getDebugName() {
        return getClass().getSimpleName().substring(4);
    }

    public final AbstractDrawCommand mutableCopy() {
        try {
            AbstractDrawCommand abstractDrawCommand = (AbstractDrawCommand) super.clone();
            abstractDrawCommand.mFrozen = false;
            return abstractDrawCommand;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldClip() {
        if (this.mLeft < getClipLeft() || this.mTop < getClipTop() || this.mRight > getClipRight() || this.mBottom > getClipBottom()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void applyClipping(Canvas canvas) {
        canvas.clipRect(this.mClipLeft, this.mClipTop, this.mClipRight, this.mClipBottom);
    }

    private void initDebugHighlightResources(FlatViewGroup flatViewGroup) {
        if (sDebugHighlightRed == null) {
            Paint paint = new Paint();
            sDebugHighlightRed = paint;
            paint.setARGB(75, NormalGiftView.ALPHA_255, 0, 0);
        }
        if (sDebugHighlightYellow == null) {
            Paint paint2 = new Paint();
            sDebugHighlightYellow = paint2;
            paint2.setARGB(100, NormalGiftView.ALPHA_255, 204, 0);
        }
        if (sDebugHighlightOverlayText == null) {
            Paint paint3 = new Paint();
            sDebugHighlightOverlayText = paint3;
            paint3.setAntiAlias(true);
            sDebugHighlightOverlayText.setARGB(C34943c.f91127w, 50, 50, 50);
            sDebugHighlightOverlayText.setTextAlign(Align.RIGHT);
            sDebugHighlightOverlayText.setTypeface(Typeface.MONOSPACE);
            sDebugHighlightOverlayText.setTextSize((float) flatViewGroup.dipsToPixels(9));
        }
    }

    public final void debugDraw(FlatViewGroup flatViewGroup, Canvas canvas) {
        onDebugDraw(flatViewGroup, canvas);
    }

    /* access modifiers changed from: protected */
    public void debugDrawCautionHighlight(Canvas canvas, String str) {
        debugDrawHighlightRect(canvas, sDebugHighlightYellow, str);
    }

    /* access modifiers changed from: protected */
    public void debugDrawWarningHighlight(Canvas canvas, String str) {
        debugDrawHighlightRect(canvas, sDebugHighlightRed, str);
    }

    public void draw(FlatViewGroup flatViewGroup, Canvas canvas) {
        onPreDraw(flatViewGroup, canvas);
        if (!this.mNeedsClipping || !shouldClip()) {
            onDraw(canvas);
            return;
        }
        canvas.save(2);
        applyClipping(canvas);
        onDraw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onDebugDraw(FlatViewGroup flatViewGroup, Canvas canvas) {
        flatViewGroup.debugDrawNamedRect(canvas, getDebugBorderColor(), getDebugName(), this.mLeft, this.mTop, this.mRight, this.mBottom);
    }

    private void debugDrawHighlightRect(Canvas canvas, Paint paint, String str) {
        canvas.drawRect(getLeft(), getTop(), getRight(), getBottom(), paint);
        canvas.drawText(str, getRight() - 5.0f, getBottom() - 5.0f, sDebugHighlightOverlayText);
    }

    /* access modifiers changed from: protected */
    public final void setBounds(float f, float f2, float f3, float f4) {
        this.mLeft = f;
        this.mTop = f2;
        this.mRight = f3;
        this.mBottom = f4;
        onBoundsChanged();
    }

    /* access modifiers changed from: protected */
    public final boolean boundsMatch(float f, float f2, float f3, float f4) {
        if (this.mLeft == f && this.mTop == f2 && this.mRight == f3 && this.mBottom == f4) {
            return true;
        }
        return false;
    }

    public final boolean clipBoundsMatch(float f, float f2, float f3, float f4) {
        if (this.mClipLeft == f && this.mClipTop == f2 && this.mClipRight == f3 && this.mClipBottom == f4) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void setClipBounds(float f, float f2, float f3, float f4) {
        boolean z;
        this.mClipLeft = f;
        this.mClipTop = f2;
        this.mClipRight = f3;
        this.mClipBottom = f4;
        if (this.mClipLeft != Float.NEGATIVE_INFINITY) {
            z = true;
        } else {
            z = false;
        }
        this.mNeedsClipping = z;
    }

    public AbstractDrawCommand updateBoundsAndFreeze(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (this.mFrozen) {
            boolean boundsMatch = boundsMatch(f, f2, f3, f4);
            boolean clipBoundsMatch = clipBoundsMatch(f5, f6, f7, f8);
            if (boundsMatch && clipBoundsMatch) {
                return this;
            }
            try {
                AbstractDrawCommand abstractDrawCommand = (AbstractDrawCommand) clone();
                if (!boundsMatch) {
                    abstractDrawCommand.setBounds(f, f2, f3, f4);
                }
                if (!clipBoundsMatch) {
                    abstractDrawCommand.setClipBounds(f5, f6, f7, f8);
                }
                return abstractDrawCommand;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        } else {
            setBounds(f, f2, f3, f4);
            setClipBounds(f5, f6, f7, f8);
            this.mFrozen = true;
            return this;
        }
    }
}
