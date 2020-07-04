package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PathEffect;
import android.graphics.RectF;

abstract class AbstractDrawBorder extends AbstractDrawCommand {
    private static final Paint PAINT = new Paint(1);
    private static final RectF TMP_RECT = new RectF();
    private int mBorderColor = -16777216;
    private float mBorderRadius;
    private float mBorderWidth;
    private Path mPathForBorderRadius;
    private int mSetPropertiesFlag;

    public final int getBorderColor() {
        return this.mBorderColor;
    }

    public final float getBorderRadius() {
        return this.mBorderRadius;
    }

    public final float getBorderWidth() {
        return this.mBorderWidth;
    }

    /* access modifiers changed from: protected */
    public PathEffect getPathEffectForBorderStyle() {
        return null;
    }

    AbstractDrawBorder() {
    }

    /* access modifiers changed from: protected */
    public void onBoundsChanged() {
        setFlag(1);
    }

    static {
        PAINT.setStyle(Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public final Path getPathForBorderRadius() {
        if (isFlagSet(1)) {
            if (this.mPathForBorderRadius == null) {
                this.mPathForBorderRadius = new Path();
            }
            updatePath(this.mPathForBorderRadius, this.mBorderWidth * 0.5f);
            resetFlag(1);
        }
        return this.mPathForBorderRadius;
    }

    public final void setBorderColor(int i) {
        this.mBorderColor = i;
    }

    /* access modifiers changed from: protected */
    public final void resetFlag(int i) {
        this.mSetPropertiesFlag = (i ^ -1) & this.mSetPropertiesFlag;
    }

    public void setBorderRadius(float f) {
        this.mBorderRadius = f;
        setFlag(1);
    }

    public final void setBorderWidth(float f) {
        this.mBorderWidth = f;
        setFlag(1);
    }

    /* access modifiers changed from: protected */
    public final void setFlag(int i) {
        this.mSetPropertiesFlag = i | this.mSetPropertiesFlag;
    }

    /* access modifiers changed from: protected */
    public final boolean isFlagSet(int i) {
        if ((this.mSetPropertiesFlag & i) == i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void drawBorders(Canvas canvas) {
        if (this.mBorderWidth >= 0.5f && this.mBorderColor != 0) {
            PAINT.setColor(this.mBorderColor);
            PAINT.setStrokeWidth(this.mBorderWidth);
            PAINT.setPathEffect(getPathEffectForBorderStyle());
            canvas.drawPath(getPathForBorderRadius(), PAINT);
        }
    }

    /* access modifiers changed from: protected */
    public final void updatePath(Path path, float f) {
        path.reset();
        TMP_RECT.set(getLeft() + f, getTop() + f, getRight() - f, getBottom() - f);
        path.addRoundRect(TMP_RECT, this.mBorderRadius, this.mBorderRadius, Direction.CW);
    }
}
