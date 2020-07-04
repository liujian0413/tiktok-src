package com.p280ss.avframework.opengl;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: com.ss.avframework.opengl.RendererCommon */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* renamed from: com.ss.avframework.opengl.RendererCommon$GlDrawer */
    public interface GlDrawer {
        void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6);

        void release();
    }

    /* renamed from: com.ss.avframework.opengl.RendererCommon$RendererEvents */
    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i, int i2, int i3);
    }

    /* renamed from: com.ss.avframework.opengl.RendererCommon$ScalingType */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* renamed from: com.ss.avframework.opengl.RendererCommon$VideoLayoutMeasure */
    public static class VideoLayoutMeasure {
        private ScalingType scalingTypeMatchOrientation = ScalingType.SCALE_ASPECT_BALANCED;
        private ScalingType scalingTypeMismatchOrientation = ScalingType.SCALE_ASPECT_BALANCED;

        public void setScalingType(ScalingType scalingType) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType2;
        }

        public Point measure(int i, int i2, int i3, int i4) {
            boolean z;
            ScalingType scalingType;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i2);
            if (i3 == 0 || i4 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f = ((float) i3) / ((float) i4);
            float f2 = ((float) defaultSize) / ((float) defaultSize2);
            boolean z2 = false;
            if (f > 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (f2 > 1.0f) {
                z2 = true;
            }
            if (z == z2) {
                scalingType = this.scalingTypeMatchOrientation;
            } else {
                scalingType = this.scalingTypeMismatchOrientation;
            }
            Point displaySize = RendererCommon.getDisplaySize(scalingType, f, defaultSize, defaultSize2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (MeasureSpec.getMode(i2) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }
    }

    public static final float[] horizontalFlipMatrix() {
        return new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final float[] identityMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final float[] verticalFlipMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    }

    private static void adjustOrigin(float[] fArr) {
        fArr[12] = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[13] = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[12] = fArr[12] + 0.5f;
        fArr[13] = fArr[13] + 0.5f;
    }

    private static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        switch (scalingType) {
            case SCALE_ASPECT_FIT:
                return 1.0f;
            case SCALE_ASPECT_FILL:
                return 0.0f;
            case SCALE_ASPECT_BALANCED:
                return BALANCED_VISIBLE_FRACTION;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    public static float[] multiplyMatrices(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        android.opengl.Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        return fArr3;
    }

    public static float[] rotateTextureMatrix(float[] fArr, float f) {
        float[] fArr2 = new float[16];
        android.opengl.Matrix.setRotateM(fArr2, 0, f, 0.0f, 0.0f, 1.0f);
        adjustOrigin(fArr2);
        return multiplyMatrices(fArr, fArr2);
    }

    public static float[] getLayoutMatrix(boolean z, float f, float f2) {
        float f3;
        float f4;
        if (f2 > f) {
            f3 = f / f2;
            f4 = 1.0f;
        } else {
            f4 = f2 / f;
            f3 = 1.0f;
        }
        if (z) {
            f4 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f4, f3, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(ScalingType scalingType, float f, int i, int i2) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f, i, i2);
    }

    private static Point getDisplaySize(float f, float f2, int i, int i2) {
        if (f == 0.0f || f2 == 0.0f) {
            return new Point(i, i2);
        }
        return new Point(Math.min(i, Math.round((((float) i2) / f) * f2)), Math.min(i2, Math.round((((float) i) / f) / f2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void calcWindRatio(boolean r0, boolean r1, boolean r2, int r3, int r4, int r5, int r6, float[] r7) {
        /*
            float r5 = (float) r5
            float r6 = (float) r6
            float r5 = r5 / r6
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0019
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            float r0 = r3 / r5
        L_0x0010:
            r3 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0023
        L_0x0014:
            float r0 = r5 / r3
        L_0x0016:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0023
        L_0x0019:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            float r0 = r3 / r5
            goto L_0x0010
        L_0x0020:
            float r0 = r5 / r3
            goto L_0x0016
        L_0x0023:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x002a
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x002c
        L_0x002a:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x002c:
            float r0 = r0 * r1
            r1 = 0
            android.opengl.Matrix.scaleM(r7, r1, r0, r4, r4)
            if (r2 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0037:
            float r3 = r3 * r5
            android.opengl.Matrix.scaleM(r7, r1, r4, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.opengl.RendererCommon.calcWindRatio(boolean, boolean, boolean, int, int, int, int, float[]):void");
    }
}
