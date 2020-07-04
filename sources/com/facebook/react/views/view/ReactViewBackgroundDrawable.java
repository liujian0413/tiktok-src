package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.yoga.C14644a;
import java.util.Arrays;
import java.util.Locale;

public class ReactViewBackgroundDrawable extends Drawable {
    private int mAlpha = NormalGiftView.ALPHA_255;
    private Spacing mBorderAlpha;
    private float[] mBorderCornerRadii;
    private Spacing mBorderRGB;
    private float mBorderRadius = 1.0E21f;
    private BorderStyle mBorderStyle;
    private Spacing mBorderWidth;
    private int mColor = 0;
    private final Context mContext;
    private PointF mInnerBottomLeftCorner;
    private PointF mInnerBottomRightCorner;
    private Path mInnerClipPathForBorderRadius;
    private RectF mInnerClipTempRectForBorderRadius;
    private PointF mInnerTopLeftCorner;
    private PointF mInnerTopRightCorner;
    private int mLayoutDirection;
    private boolean mNeedUpdatePathForBorderRadius;
    private Path mOuterClipPathForBorderRadius;
    private RectF mOuterClipTempRectForBorderRadius;
    private final Paint mPaint = new Paint(1);
    private PathEffect mPathEffectForBorderStyle;
    private Path mPathForBorder;
    private Path mPathForBorderRadiusOutline;
    private RectF mTempRectForBorderRadiusOutline;

    public enum BorderRadiusLocation {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    enum BorderStyle {
        SOLID,
        DASHED,
        DOTTED;

        public final PathEffect getPathEffect(float f) {
            switch (this) {
                case SOLID:
                    return null;
                case DASHED:
                    float f2 = f * 3.0f;
                    return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
                case DOTTED:
                    return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
                default:
                    return null;
            }
        }
    }

    private static int colorFromAlphaAndRGBComponents(float f, float f2) {
        return ((((int) f) << 24) & -16777216) | (((int) f2) & 16777215);
    }

    private static int fastBorderCompatibleColorOrZero(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -1;
        int i10 = (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i4 > 0) {
            i9 = i8;
        }
        int i11 = i9 & i10;
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i12 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i13 = i12 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i11 == (i13 | i8)) {
            return i11;
        }
        return 0;
    }

    public int getAlpha() {
        return this.mAlpha;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getResolvedLayoutDirection() {
        return this.mLayoutDirection;
    }

    public boolean onResolvedLayoutDirectionChanged(int i) {
        return false;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public float getFullBorderRadius() {
        if (C14644a.m42350a(this.mBorderRadius)) {
            return 0.0f;
        }
        return this.mBorderRadius;
    }

    public int getOpacity() {
        return ColorUtil.getOpacityFromColor(ColorUtil.multiplyColorAlpha(this.mColor, this.mAlpha));
    }

    private void updatePathEffect() {
        PathEffect pathEffect;
        if (this.mBorderStyle != null) {
            pathEffect = this.mBorderStyle.getPathEffect(getFullBorderWidth());
        } else {
            pathEffect = null;
        }
        this.mPathEffectForBorderStyle = pathEffect;
        this.mPaint.setPathEffect(this.mPathEffectForBorderStyle);
    }

    public float getFullBorderWidth() {
        if (this.mBorderWidth == null || C14644a.m42350a(this.mBorderWidth.getRaw(8))) {
            return 0.0f;
        }
        return this.mBorderWidth.getRaw(8);
    }

    public boolean hasRoundedBorders() {
        float[] fArr;
        if (!C14644a.m42350a(this.mBorderRadius) && this.mBorderRadius > 0.0f) {
            return true;
        }
        if (this.mBorderCornerRadii != null) {
            for (float f : this.mBorderCornerRadii) {
                if (!C14644a.m42350a(f) && f > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r1 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (com.facebook.yoga.C14644a.m42350a(r4) == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.RectF getDirectionAwareBorderInsets() {
        /*
            r9 = this;
            r0 = 0
            r1 = 8
            float r0 = r9.getBorderWidthOrDefaultTo(r0, r1)
            r1 = 1
            float r2 = r9.getBorderWidthOrDefaultTo(r0, r1)
            r3 = 3
            float r3 = r9.getBorderWidthOrDefaultTo(r0, r3)
            r4 = 0
            float r5 = r9.getBorderWidthOrDefaultTo(r0, r4)
            r6 = 2
            float r0 = r9.getBorderWidthOrDefaultTo(r0, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r6 < r7) goto L_0x0075
            com.facebook.react.uimanager.Spacing r6 = r9.mBorderWidth
            if (r6 == 0) goto L_0x0075
            int r6 = r9.getResolvedLayoutDirection()
            if (r6 != r1) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            com.facebook.react.uimanager.Spacing r4 = r9.mBorderWidth
            r6 = 4
            float r4 = r4.getRaw(r6)
            com.facebook.react.uimanager.Spacing r6 = r9.mBorderWidth
            r7 = 5
            float r6 = r6.getRaw(r7)
            com.facebook.react.modules.i18nmanager.I18nUtil r7 = com.facebook.react.modules.i18nmanager.I18nUtil.getInstance()
            android.content.Context r8 = r9.mContext
            boolean r7 = r7.doLeftAndRightSwapInRTL(r8)
            if (r7 == 0) goto L_0x005e
            boolean r7 = com.facebook.yoga.C14644a.m42350a(r4)
            if (r7 == 0) goto L_0x004e
            r4 = r5
        L_0x004e:
            boolean r5 = com.facebook.yoga.C14644a.m42350a(r6)
            if (r5 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = r6
        L_0x0056:
            if (r1 == 0) goto L_0x005a
            r5 = r0
            goto L_0x005b
        L_0x005a:
            r5 = r4
        L_0x005b:
            if (r1 == 0) goto L_0x0075
            goto L_0x0074
        L_0x005e:
            if (r1 == 0) goto L_0x0062
            r7 = r6
            goto L_0x0063
        L_0x0062:
            r7 = r4
        L_0x0063:
            if (r1 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r4 = r6
        L_0x0067:
            boolean r1 = com.facebook.yoga.C14644a.m42350a(r7)
            if (r1 != 0) goto L_0x006e
            r5 = r7
        L_0x006e:
            boolean r1 = com.facebook.yoga.C14644a.m42350a(r4)
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r0 = r4
        L_0x0075:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r2, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewBackgroundDrawable.getDirectionAwareBorderInsets():android.graphics.RectF");
    }

    private void updatePath() {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.mNeedUpdatePathForBorderRadius) {
            this.mNeedUpdatePathForBorderRadius = false;
            if (this.mInnerClipPathForBorderRadius == null) {
                this.mInnerClipPathForBorderRadius = new Path();
            }
            if (this.mOuterClipPathForBorderRadius == null) {
                this.mOuterClipPathForBorderRadius = new Path();
            }
            if (this.mPathForBorderRadiusOutline == null) {
                this.mPathForBorderRadiusOutline = new Path();
            }
            if (this.mInnerClipTempRectForBorderRadius == null) {
                this.mInnerClipTempRectForBorderRadius = new RectF();
            }
            if (this.mOuterClipTempRectForBorderRadius == null) {
                this.mOuterClipTempRectForBorderRadius = new RectF();
            }
            if (this.mTempRectForBorderRadiusOutline == null) {
                this.mTempRectForBorderRadiusOutline = new RectF();
            }
            this.mInnerClipPathForBorderRadius.reset();
            this.mOuterClipPathForBorderRadius.reset();
            this.mPathForBorderRadiusOutline.reset();
            this.mInnerClipTempRectForBorderRadius.set(getBounds());
            this.mOuterClipTempRectForBorderRadius.set(getBounds());
            this.mTempRectForBorderRadiusOutline.set(getBounds());
            RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
            this.mInnerClipTempRectForBorderRadius.top += directionAwareBorderInsets.top;
            this.mInnerClipTempRectForBorderRadius.bottom -= directionAwareBorderInsets.bottom;
            this.mInnerClipTempRectForBorderRadius.left += directionAwareBorderInsets.left;
            this.mInnerClipTempRectForBorderRadius.right -= directionAwareBorderInsets.right;
            float fullBorderRadius = getFullBorderRadius();
            float borderRadiusOrDefaultTo = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.TOP_LEFT);
            float borderRadiusOrDefaultTo2 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.TOP_RIGHT);
            float borderRadiusOrDefaultTo3 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.BOTTOM_LEFT);
            float borderRadiusOrDefaultTo4 = getBorderRadiusOrDefaultTo(fullBorderRadius, BorderRadiusLocation.BOTTOM_RIGHT);
            if (VERSION.SDK_INT >= 17) {
                if (getResolvedLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                float borderRadius = getBorderRadius(BorderRadiusLocation.TOP_START);
                float borderRadius2 = getBorderRadius(BorderRadiusLocation.TOP_END);
                float borderRadius3 = getBorderRadius(BorderRadiusLocation.BOTTOM_START);
                float borderRadius4 = getBorderRadius(BorderRadiusLocation.BOTTOM_END);
                if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                    if (!C14644a.m42350a(borderRadius)) {
                        borderRadiusOrDefaultTo = borderRadius;
                    }
                    if (!C14644a.m42350a(borderRadius2)) {
                        borderRadiusOrDefaultTo2 = borderRadius2;
                    }
                    if (!C14644a.m42350a(borderRadius3)) {
                        borderRadiusOrDefaultTo3 = borderRadius3;
                    }
                    if (!C14644a.m42350a(borderRadius4)) {
                        borderRadiusOrDefaultTo4 = borderRadius4;
                    }
                    if (z) {
                        f4 = borderRadiusOrDefaultTo2;
                    } else {
                        f4 = borderRadiusOrDefaultTo;
                    }
                    if (z) {
                        borderRadiusOrDefaultTo2 = borderRadiusOrDefaultTo;
                    }
                    if (z) {
                        f5 = borderRadiusOrDefaultTo4;
                    } else {
                        f5 = borderRadiusOrDefaultTo3;
                    }
                    if (z) {
                        borderRadiusOrDefaultTo4 = borderRadiusOrDefaultTo3;
                    }
                    borderRadiusOrDefaultTo3 = f5;
                    borderRadiusOrDefaultTo = f4;
                } else {
                    if (z) {
                        f2 = borderRadius2;
                    } else {
                        f2 = borderRadius;
                    }
                    if (!z) {
                        borderRadius = borderRadius2;
                    }
                    if (z) {
                        f3 = borderRadius4;
                    } else {
                        f3 = borderRadius3;
                    }
                    if (!z) {
                        borderRadius3 = borderRadius4;
                    }
                    if (!C14644a.m42350a(f2)) {
                        borderRadiusOrDefaultTo = f2;
                    }
                    if (!C14644a.m42350a(borderRadius)) {
                        borderRadiusOrDefaultTo2 = borderRadius;
                    }
                    if (!C14644a.m42350a(f3)) {
                        borderRadiusOrDefaultTo3 = f3;
                    }
                    if (!C14644a.m42350a(borderRadius3)) {
                        borderRadiusOrDefaultTo4 = borderRadius3;
                    }
                }
            }
            float max = Math.max(borderRadiusOrDefaultTo - directionAwareBorderInsets.left, 0.0f);
            float max2 = Math.max(borderRadiusOrDefaultTo - directionAwareBorderInsets.top, 0.0f);
            float max3 = Math.max(borderRadiusOrDefaultTo2 - directionAwareBorderInsets.right, 0.0f);
            float max4 = Math.max(borderRadiusOrDefaultTo2 - directionAwareBorderInsets.top, 0.0f);
            float max5 = Math.max(borderRadiusOrDefaultTo4 - directionAwareBorderInsets.right, 0.0f);
            float max6 = Math.max(borderRadiusOrDefaultTo4 - directionAwareBorderInsets.bottom, 0.0f);
            float max7 = Math.max(borderRadiusOrDefaultTo3 - directionAwareBorderInsets.left, 0.0f);
            float max8 = Math.max(borderRadiusOrDefaultTo3 - directionAwareBorderInsets.bottom, 0.0f);
            float f6 = borderRadiusOrDefaultTo3;
            float f7 = borderRadiusOrDefaultTo4;
            this.mInnerClipPathForBorderRadius.addRoundRect(this.mInnerClipTempRectForBorderRadius, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Direction.CW);
            this.mOuterClipPathForBorderRadius.addRoundRect(this.mOuterClipTempRectForBorderRadius, new float[]{borderRadiusOrDefaultTo, borderRadiusOrDefaultTo, borderRadiusOrDefaultTo2, borderRadiusOrDefaultTo2, f7, f7, f6, f6}, Direction.CW);
            if (this.mBorderWidth != null) {
                f = this.mBorderWidth.get(8) / 2.0f;
            } else {
                f = 0.0f;
            }
            float f8 = borderRadiusOrDefaultTo + f;
            float f9 = borderRadiusOrDefaultTo2 + f;
            float f10 = f7 + f;
            float f11 = f6 + f;
            this.mPathForBorderRadiusOutline.addRoundRect(this.mTempRectForBorderRadiusOutline, new float[]{f8, f8, f9, f9, f10, f10, f11, f11}, Direction.CW);
            if (this.mInnerTopLeftCorner == null) {
                this.mInnerTopLeftCorner = new PointF();
            }
            this.mInnerTopLeftCorner.x = this.mInnerClipTempRectForBorderRadius.left;
            this.mInnerTopLeftCorner.y = this.mInnerClipTempRectForBorderRadius.top;
            getEllipseIntersectionWithLine((double) this.mInnerClipTempRectForBorderRadius.left, (double) this.mInnerClipTempRectForBorderRadius.top, (double) (this.mInnerClipTempRectForBorderRadius.left + (max * 2.0f)), (double) (this.mInnerClipTempRectForBorderRadius.top + (max2 * 2.0f)), (double) this.mOuterClipTempRectForBorderRadius.left, (double) this.mOuterClipTempRectForBorderRadius.top, (double) this.mInnerClipTempRectForBorderRadius.left, (double) this.mInnerClipTempRectForBorderRadius.top, this.mInnerTopLeftCorner);
            if (this.mInnerBottomLeftCorner == null) {
                this.mInnerBottomLeftCorner = new PointF();
            }
            this.mInnerBottomLeftCorner.x = this.mInnerClipTempRectForBorderRadius.left;
            this.mInnerBottomLeftCorner.y = this.mInnerClipTempRectForBorderRadius.bottom;
            getEllipseIntersectionWithLine((double) this.mInnerClipTempRectForBorderRadius.left, (double) (this.mInnerClipTempRectForBorderRadius.bottom - (max8 * 2.0f)), (double) (this.mInnerClipTempRectForBorderRadius.left + (max7 * 2.0f)), (double) this.mInnerClipTempRectForBorderRadius.bottom, (double) this.mOuterClipTempRectForBorderRadius.left, (double) this.mOuterClipTempRectForBorderRadius.bottom, (double) this.mInnerClipTempRectForBorderRadius.left, (double) this.mInnerClipTempRectForBorderRadius.bottom, this.mInnerBottomLeftCorner);
            if (this.mInnerTopRightCorner == null) {
                this.mInnerTopRightCorner = new PointF();
            }
            this.mInnerTopRightCorner.x = this.mInnerClipTempRectForBorderRadius.right;
            this.mInnerTopRightCorner.y = this.mInnerClipTempRectForBorderRadius.top;
            getEllipseIntersectionWithLine((double) (this.mInnerClipTempRectForBorderRadius.right - (max3 * 2.0f)), (double) this.mInnerClipTempRectForBorderRadius.top, (double) this.mInnerClipTempRectForBorderRadius.right, (double) (this.mInnerClipTempRectForBorderRadius.top + (max4 * 2.0f)), (double) this.mOuterClipTempRectForBorderRadius.right, (double) this.mOuterClipTempRectForBorderRadius.top, (double) this.mInnerClipTempRectForBorderRadius.right, (double) this.mInnerClipTempRectForBorderRadius.top, this.mInnerTopRightCorner);
            if (this.mInnerBottomRightCorner == null) {
                this.mInnerBottomRightCorner = new PointF();
            }
            this.mInnerBottomRightCorner.x = this.mInnerClipTempRectForBorderRadius.right;
            this.mInnerBottomRightCorner.y = this.mInnerClipTempRectForBorderRadius.bottom;
            getEllipseIntersectionWithLine((double) (this.mInnerClipTempRectForBorderRadius.right - (max5 * 2.0f)), (double) (this.mInnerClipTempRectForBorderRadius.bottom - (max6 * 2.0f)), (double) this.mInnerClipTempRectForBorderRadius.right, (double) this.mInnerClipTempRectForBorderRadius.bottom, (double) this.mOuterClipTempRectForBorderRadius.right, (double) this.mOuterClipTempRectForBorderRadius.bottom, (double) this.mInnerClipTempRectForBorderRadius.right, (double) this.mInnerClipTempRectForBorderRadius.bottom, this.mInnerBottomRightCorner);
        }
    }

    public float getBorderRadius(BorderRadiusLocation borderRadiusLocation) {
        return getBorderRadiusOrDefaultTo(1.0E21f, borderRadiusLocation);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public void setColor(int i) {
        this.mColor = i;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        if (i != this.mAlpha) {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    public boolean setResolvedLayoutDirection(int i) {
        if (this.mLayoutDirection == i) {
            return false;
        }
        this.mLayoutDirection = i;
        return onResolvedLayoutDirectionChanged(i);
    }

    public ReactViewBackgroundDrawable(Context context) {
        this.mContext = context;
    }

    private int getBorderColor(int i) {
        float f;
        float f2;
        if (this.mBorderRGB != null) {
            f = this.mBorderRGB.get(i);
        } else {
            f = 0.0f;
        }
        if (this.mBorderAlpha != null) {
            f2 = this.mBorderAlpha.get(i);
        } else {
            f2 = 255.0f;
        }
        return colorFromAlphaAndRGBComponents(f2, f);
    }

    private int getBorderWidth(int i) {
        if (this.mBorderWidth == null) {
            return 0;
        }
        float f = this.mBorderWidth.get(i);
        if (C14644a.m42350a(f)) {
            return -1;
        }
        return Math.round(f);
    }

    public void draw(Canvas canvas) {
        updatePathEffect();
        if (!hasRoundedBorders()) {
            drawRectangularBackgroundWithBorders(canvas);
        } else {
            drawRoundedBackgroundWithBorders(canvas);
        }
    }

    public void setBorderStyle(String str) {
        BorderStyle borderStyle;
        if (str == null) {
            borderStyle = null;
        } else {
            borderStyle = BorderStyle.valueOf(str.toUpperCase(Locale.US));
        }
        if (this.mBorderStyle != borderStyle) {
            this.mBorderStyle = borderStyle;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public void setRadius(float f) {
        if (!FloatUtil.floatsEqual(this.mBorderRadius, f)) {
            this.mBorderRadius = f;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    private boolean isBorderColorDefined(int i) {
        float f;
        float f2 = 1.0E21f;
        if (this.mBorderRGB != null) {
            f = this.mBorderRGB.get(i);
        } else {
            f = 1.0E21f;
        }
        if (this.mBorderAlpha != null) {
            f2 = this.mBorderAlpha.get(i);
        }
        if (C14644a.m42350a(f) || C14644a.m42350a(f2)) {
            return false;
        }
        return true;
    }

    public void getOutline(Outline outline) {
        if (VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if ((C14644a.m42350a(this.mBorderRadius) || this.mBorderRadius <= 0.0f) && this.mBorderCornerRadii == null) {
            outline.setRect(getBounds());
        } else {
            updatePath();
            outline.setConvexPath(this.mPathForBorderRadiusOutline);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void drawRectangularBackgroundWithBorders(android.graphics.Canvas r25) {
        /*
            r24 = this;
            r11 = r24
            int r0 = r11.mColor
            int r1 = r11.mAlpha
            int r0 = com.facebook.react.views.view.ColorUtil.multiplyColorAlpha(r0, r1)
            int r1 = android.graphics.Color.alpha(r0)
            if (r1 == 0) goto L_0x0028
            android.graphics.Paint r1 = r11.mPaint
            r1.setColor(r0)
            android.graphics.Paint r0 = r11.mPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Rect r0 = r24.getBounds()
            android.graphics.Paint r1 = r11.mPaint
            r12 = r25
            r12.drawRect(r0, r1)
            goto L_0x002a
        L_0x0028:
            r12 = r25
        L_0x002a:
            android.graphics.RectF r0 = r24.getDirectionAwareBorderInsets()
            float r1 = r0.left
            int r13 = java.lang.Math.round(r1)
            float r1 = r0.top
            int r14 = java.lang.Math.round(r1)
            float r1 = r0.right
            int r15 = java.lang.Math.round(r1)
            float r0 = r0.bottom
            int r16 = java.lang.Math.round(r0)
            if (r13 > 0) goto L_0x0052
            if (r15 > 0) goto L_0x0052
            if (r14 > 0) goto L_0x0052
            if (r16 <= 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r0 = r11
            goto L_0x01cd
        L_0x0052:
            android.graphics.Rect r0 = r24.getBounds()
            r1 = 0
            int r2 = r11.getBorderColor(r1)
            r10 = 1
            int r17 = r11.getBorderColor(r10)
            r3 = 2
            int r3 = r11.getBorderColor(r3)
            r4 = 3
            int r18 = r11.getBorderColor(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r4 < r5) goto L_0x00cf
            int r4 = r24.getResolvedLayoutDirection()
            if (r4 != r10) goto L_0x0078
            r4 = 1
            goto L_0x0079
        L_0x0078:
            r4 = 0
        L_0x0079:
            r5 = 4
            int r6 = r11.getBorderColor(r5)
            r7 = 5
            int r8 = r11.getBorderColor(r7)
            com.facebook.react.modules.i18nmanager.I18nUtil r9 = com.facebook.react.modules.i18nmanager.I18nUtil.getInstance()
            android.content.Context r10 = r11.mContext
            boolean r9 = r9.doLeftAndRightSwapInRTL(r10)
            if (r9 == 0) goto L_0x00ac
            boolean r5 = r11.isBorderColorDefined(r5)
            if (r5 != 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r2 = r6
        L_0x0097:
            boolean r5 = r11.isBorderColorDefined(r7)
            if (r5 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r3 = r8
        L_0x009f:
            if (r4 == 0) goto L_0x00a3
            r5 = r3
            goto L_0x00a4
        L_0x00a3:
            r5 = r2
        L_0x00a4:
            if (r4 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r2 = r3
        L_0x00a8:
            r19 = r2
            r10 = r5
            goto L_0x00d2
        L_0x00ac:
            if (r4 == 0) goto L_0x00b0
            r9 = r8
            goto L_0x00b1
        L_0x00b0:
            r9 = r6
        L_0x00b1:
            if (r4 == 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r6 = r8
        L_0x00b5:
            boolean r5 = r11.isBorderColorDefined(r5)
            boolean r7 = r11.isBorderColorDefined(r7)
            if (r4 == 0) goto L_0x00c1
            r8 = r7
            goto L_0x00c2
        L_0x00c1:
            r8 = r5
        L_0x00c2:
            if (r4 == 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r5 = r7
        L_0x00c6:
            if (r8 == 0) goto L_0x00c9
            r2 = r9
        L_0x00c9:
            if (r5 == 0) goto L_0x00cf
            r10 = r2
            r19 = r6
            goto L_0x00d2
        L_0x00cf:
            r10 = r2
            r19 = r3
        L_0x00d2:
            int r9 = r0.left
            int r8 = r0.top
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r10
            r7 = r17
            r1 = r8
            r8 = r19
            r12 = r9
            r9 = r18
            int r2 = fastBorderCompatibleColorOrZero(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto L_0x013c
            int r3 = android.graphics.Color.alpha(r2)
            if (r3 == 0) goto L_0x004f
            int r8 = r0.right
            int r0 = r0.bottom
            android.graphics.Paint r3 = r11.mPaint
            r3.setColor(r2)
            if (r13 <= 0) goto L_0x010a
            int r9 = r12 + r13
            float r3 = (float) r12
            float r4 = (float) r1
            float r5 = (float) r9
            int r2 = r0 - r16
            float r6 = (float) r2
            android.graphics.Paint r7 = r11.mPaint
            r2 = r25
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x010a:
            if (r14 <= 0) goto L_0x011b
            int r2 = r1 + r14
            int r9 = r12 + r13
            float r3 = (float) r9
            float r4 = (float) r1
            float r5 = (float) r8
            float r6 = (float) r2
            android.graphics.Paint r7 = r11.mPaint
            r2 = r25
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x011b:
            if (r15 <= 0) goto L_0x012b
            int r2 = r8 - r15
            float r3 = (float) r2
            int r1 = r1 + r14
            float r4 = (float) r1
            float r5 = (float) r8
            float r6 = (float) r0
            android.graphics.Paint r7 = r11.mPaint
            r2 = r25
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x012b:
            if (r16 <= 0) goto L_0x013b
            int r1 = r0 - r16
            float r3 = (float) r12
            float r4 = (float) r1
            int r8 = r8 - r15
            float r5 = (float) r8
            float r6 = (float) r0
            android.graphics.Paint r7 = r11.mPaint
            r2 = r25
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x013b:
            return
        L_0x013c:
            android.graphics.Paint r2 = r11.mPaint
            r3 = 0
            r2.setAntiAlias(r3)
            int r20 = r0.width()
            int r21 = r0.height()
            if (r13 <= 0) goto L_0x0170
            float r9 = (float) r12
            float r4 = (float) r1
            int r0 = r12 + r13
            float r7 = (float) r0
            int r8 = r1 + r14
            float r6 = (float) r8
            int r8 = r1 + r21
            int r0 = r8 - r16
            float r5 = (float) r0
            float r8 = (float) r8
            r0 = r24
            r3 = r1
            r1 = r25
            r2 = r10
            r10 = r3
            r3 = r9
            r22 = r5
            r5 = r7
            r23 = r8
            r8 = r22
            r11 = r10
            r10 = r23
            r0.drawQuadrilateral(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0171
        L_0x0170:
            r11 = r1
        L_0x0171:
            if (r14 <= 0) goto L_0x018c
            float r3 = (float) r12
            float r10 = (float) r11
            int r9 = r12 + r13
            float r5 = (float) r9
            int r8 = r11 + r14
            float r8 = (float) r8
            int r9 = r12 + r20
            int r0 = r9 - r15
            float r7 = (float) r0
            float r9 = (float) r9
            r0 = r24
            r1 = r25
            r2 = r17
            r4 = r10
            r6 = r8
            r0.drawQuadrilateral(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x018c:
            if (r15 <= 0) goto L_0x01a8
            int r9 = r12 + r20
            float r5 = (float) r9
            float r4 = (float) r11
            int r8 = r11 + r21
            float r6 = (float) r8
            int r9 = r9 - r15
            float r9 = (float) r9
            int r8 = r8 - r16
            float r8 = (float) r8
            int r0 = r11 + r14
            float r10 = (float) r0
            r0 = r24
            r1 = r25
            r2 = r19
            r3 = r5
            r7 = r9
            r0.drawQuadrilateral(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x01a8:
            if (r16 <= 0) goto L_0x01c5
            float r3 = (float) r12
            int r8 = r11 + r21
            float r6 = (float) r8
            int r9 = r12 + r20
            float r5 = (float) r9
            int r9 = r9 - r15
            float r7 = (float) r9
            int r8 = r8 - r16
            float r10 = (float) r8
            int r9 = r12 + r13
            float r9 = (float) r9
            r0 = r24
            r1 = r25
            r2 = r18
            r4 = r6
            r8 = r10
            r0.drawQuadrilateral(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x01c7
        L_0x01c5:
            r0 = r24
        L_0x01c7:
            android.graphics.Paint r1 = r0.mPaint
            r2 = 1
            r1.setAntiAlias(r2)
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewBackgroundDrawable.drawRectangularBackgroundWithBorders(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void drawRoundedBackgroundWithBorders(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r11 = r22
            r12 = r23
            r22.updatePath()
            r23.save()
            int r0 = r11.mColor
            int r1 = r11.mAlpha
            int r0 = com.facebook.react.views.view.ColorUtil.multiplyColorAlpha(r0, r1)
            int r1 = android.graphics.Color.alpha(r0)
            if (r1 == 0) goto L_0x002b
            android.graphics.Paint r1 = r11.mPaint
            r1.setColor(r0)
            android.graphics.Paint r0 = r11.mPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Path r0 = r11.mInnerClipPathForBorderRadius
            android.graphics.Paint r1 = r11.mPaint
            r12.drawPath(r0, r1)
        L_0x002b:
            android.graphics.RectF r13 = r22.getDirectionAwareBorderInsets()
            float r0 = r13.top
            r14 = 0
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0048
            float r0 = r13.bottom
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0048
            float r0 = r13.left
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0048
            float r0 = r13.right
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0195
        L_0x0048:
            android.graphics.Paint r0 = r11.mPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Path r0 = r11.mOuterClipPathForBorderRadius
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r12.clipPath(r0, r1)
            android.graphics.Path r0 = r11.mInnerClipPathForBorderRadius
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r12.clipPath(r0, r1)
            r0 = 0
            int r1 = r11.getBorderColor(r0)
            r2 = 1
            int r15 = r11.getBorderColor(r2)
            r3 = 2
            int r3 = r11.getBorderColor(r3)
            r4 = 3
            int r16 = r11.getBorderColor(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r4 < r5) goto L_0x00d3
            int r4 = r22.getResolvedLayoutDirection()
            if (r4 != r2) goto L_0x007e
            r0 = 1
        L_0x007e:
            r2 = 4
            int r4 = r11.getBorderColor(r2)
            r5 = 5
            int r6 = r11.getBorderColor(r5)
            com.facebook.react.modules.i18nmanager.I18nUtil r7 = com.facebook.react.modules.i18nmanager.I18nUtil.getInstance()
            android.content.Context r8 = r11.mContext
            boolean r7 = r7.doLeftAndRightSwapInRTL(r8)
            if (r7 == 0) goto L_0x00b0
            boolean r2 = r11.isBorderColorDefined(r2)
            if (r2 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r1 = r4
        L_0x009c:
            boolean r2 = r11.isBorderColorDefined(r5)
            if (r2 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r3 = r6
        L_0x00a4:
            if (r0 == 0) goto L_0x00a8
            r2 = r3
            goto L_0x00a9
        L_0x00a8:
            r2 = r1
        L_0x00a9:
            if (r0 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r1 = r3
        L_0x00ad:
            r17 = r1
            goto L_0x00d6
        L_0x00b0:
            if (r0 == 0) goto L_0x00b4
            r7 = r6
            goto L_0x00b5
        L_0x00b4:
            r7 = r4
        L_0x00b5:
            if (r0 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r4 = r6
        L_0x00b9:
            boolean r2 = r11.isBorderColorDefined(r2)
            boolean r5 = r11.isBorderColorDefined(r5)
            if (r0 == 0) goto L_0x00c5
            r6 = r5
            goto L_0x00c6
        L_0x00c5:
            r6 = r2
        L_0x00c6:
            if (r0 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r2 = r5
        L_0x00ca:
            if (r6 == 0) goto L_0x00cd
            r1 = r7
        L_0x00cd:
            if (r2 == 0) goto L_0x00d3
            r2 = r1
            r17 = r4
            goto L_0x00d6
        L_0x00d3:
            r2 = r1
            r17 = r3
        L_0x00d6:
            android.graphics.RectF r0 = r11.mOuterClipTempRectForBorderRadius
            float r10 = r0.left
            android.graphics.RectF r0 = r11.mOuterClipTempRectForBorderRadius
            float r9 = r0.right
            android.graphics.RectF r0 = r11.mOuterClipTempRectForBorderRadius
            float r8 = r0.top
            android.graphics.RectF r0 = r11.mOuterClipTempRectForBorderRadius
            float r7 = r0.bottom
            float r0 = r13.left
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0119
            android.graphics.PointF r0 = r11.mInnerTopLeftCorner
            float r5 = r0.x
            android.graphics.PointF r0 = r11.mInnerTopLeftCorner
            float r6 = r0.y
            android.graphics.PointF r0 = r11.mInnerBottomLeftCorner
            float r4 = r0.x
            android.graphics.PointF r0 = r11.mInnerBottomLeftCorner
            float r3 = r0.y
            r0 = r22
            r1 = r23
            r18 = r3
            r3 = r10
            r19 = r4
            r4 = r8
            r20 = r7
            r7 = r19
            r19 = r8
            r8 = r18
            r18 = r9
            r9 = r10
            r21 = r10
            r10 = r20
            r0.drawQuadrilateral(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0121
        L_0x0119:
            r20 = r7
            r19 = r8
            r18 = r9
            r21 = r10
        L_0x0121:
            float r0 = r13.top
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0147
            android.graphics.PointF r0 = r11.mInnerTopLeftCorner
            float r5 = r0.x
            android.graphics.PointF r0 = r11.mInnerTopLeftCorner
            float r6 = r0.y
            android.graphics.PointF r0 = r11.mInnerTopRightCorner
            float r7 = r0.x
            android.graphics.PointF r0 = r11.mInnerTopRightCorner
            float r8 = r0.y
            r0 = r22
            r1 = r23
            r2 = r15
            r3 = r21
            r4 = r19
            r9 = r18
            r10 = r19
            r0.drawQuadrilateral(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0147:
            float r0 = r13.right
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x016e
            android.graphics.PointF r0 = r11.mInnerTopRightCorner
            float r5 = r0.x
            android.graphics.PointF r0 = r11.mInnerTopRightCorner
            float r6 = r0.y
            android.graphics.PointF r0 = r11.mInnerBottomRightCorner
            float r7 = r0.x
            android.graphics.PointF r0 = r11.mInnerBottomRightCorner
            float r8 = r0.y
            r0 = r22
            r1 = r23
            r2 = r17
            r3 = r18
            r4 = r19
            r9 = r18
            r10 = r20
            r0.drawQuadrilateral(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x016e:
            float r0 = r13.bottom
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0195
            android.graphics.PointF r0 = r11.mInnerBottomLeftCorner
            float r5 = r0.x
            android.graphics.PointF r0 = r11.mInnerBottomLeftCorner
            float r6 = r0.y
            android.graphics.PointF r0 = r11.mInnerBottomRightCorner
            float r7 = r0.x
            android.graphics.PointF r0 = r11.mInnerBottomRightCorner
            float r8 = r0.y
            r0 = r22
            r1 = r23
            r2 = r16
            r3 = r21
            r4 = r20
            r9 = r18
            r10 = r20
            r0.drawQuadrilateral(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0195:
            r23.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewBackgroundDrawable.drawRoundedBackgroundWithBorders(android.graphics.Canvas):void");
    }

    public float getBorderRadiusOrDefaultTo(float f, BorderRadiusLocation borderRadiusLocation) {
        if (this.mBorderCornerRadii == null) {
            return f;
        }
        float f2 = this.mBorderCornerRadii[borderRadiusLocation.ordinal()];
        if (C14644a.m42350a(f2)) {
            return f;
        }
        return f2;
    }

    public float getBorderWidthOrDefaultTo(float f, int i) {
        if (this.mBorderWidth == null) {
            return f;
        }
        float raw = this.mBorderWidth.getRaw(i);
        if (C14644a.m42350a(raw)) {
            return f;
        }
        return raw;
    }

    private void setBorderAlpha(int i, float f) {
        if (this.mBorderAlpha == null) {
            this.mBorderAlpha = new Spacing(255.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderAlpha.getRaw(i), f)) {
            this.mBorderAlpha.set(i, f);
            invalidateSelf();
        }
    }

    private void setBorderRGB(int i, float f) {
        if (this.mBorderRGB == null) {
            this.mBorderRGB = new Spacing(0.0f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderRGB.getRaw(i), f)) {
            this.mBorderRGB.set(i, f);
            invalidateSelf();
        }
    }

    public void setBorderWidth(int i, float f) {
        if (this.mBorderWidth == null) {
            this.mBorderWidth = new Spacing();
        }
        if (!FloatUtil.floatsEqual(this.mBorderWidth.getRaw(i), f)) {
            this.mBorderWidth.set(i, f);
            if (i != 8) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        break;
                }
            }
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public void setRadius(float f, int i) {
        if (this.mBorderCornerRadii == null) {
            this.mBorderCornerRadii = new float[8];
            Arrays.fill(this.mBorderCornerRadii, 1.0E21f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderCornerRadii[i], f)) {
            this.mBorderCornerRadii[i] = f;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public void setBorderColor(int i, float f, float f2) {
        setBorderRGB(i, f);
        setBorderAlpha(i, f2);
    }

    private static void getEllipseIntersectionWithLine(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        PointF pointF2 = pointF;
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double d13 = d8 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d14 = (d13 - d12) / ((d7 - d9) - d11);
        double d15 = d12 - (d11 * d14);
        double d16 = abs2 * abs2;
        double d17 = abs * abs;
        double d18 = (d17 * d14 * d14) + d16;
        double d19 = abs * 2.0d * abs * d15 * d14;
        double d20 = (-(d17 * ((d15 * d15) - d16))) / d18;
        double d21 = d18 * 2.0d;
        double sqrt = ((-d19) / d21) - Math.sqrt(d20 + Math.pow(d19 / d21, 2.0d));
        double d22 = sqrt + d9;
        double d23 = (d14 * sqrt) + d15 + d10;
        if (!Double.isNaN(d22) && !Double.isNaN(d23)) {
            pointF2.x = (float) d22;
            pointF2.y = (float) d23;
        }
    }

    private void drawQuadrilateral(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i != 0) {
            if (this.mPathForBorder == null) {
                this.mPathForBorder = new Path();
            }
            this.mPaint.setColor(i);
            this.mPathForBorder.reset();
            this.mPathForBorder.moveTo(f, f2);
            this.mPathForBorder.lineTo(f3, f4);
            this.mPathForBorder.lineTo(f5, f6);
            this.mPathForBorder.lineTo(f7, f8);
            this.mPathForBorder.lineTo(f, f2);
            canvas.drawPath(this.mPathForBorder, this.mPaint);
        }
    }
}
