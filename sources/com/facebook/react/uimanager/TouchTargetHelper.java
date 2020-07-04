package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.touch.ReactHitSlopView;

public class TouchTargetHelper {
    private static final float[] mEventCoords = new float[2];
    private static final Matrix mInverseMatrix = new Matrix();
    private static final float[] mMatrixTransformCoords = new float[2];
    private static final PointF mTempPoint = new PointF();

    private static View findClosestReactAncestor(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    private static View findTouchTargetView(float[] fArr, ViewGroup viewGroup) {
        ReactZIndexedViewGroup reactZIndexedViewGroup;
        int i;
        int childCount = viewGroup.getChildCount();
        if (viewGroup instanceof ReactZIndexedViewGroup) {
            reactZIndexedViewGroup = (ReactZIndexedViewGroup) viewGroup;
        } else {
            reactZIndexedViewGroup = null;
        }
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (reactZIndexedViewGroup != null) {
                i = reactZIndexedViewGroup.getZIndexMappedChildIndex(i2);
            } else {
                i = i2;
            }
            View childAt = viewGroup.getChildAt(i);
            PointF pointF = mTempPoint;
            if (isTransformedTouchPointInView(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View findTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(fArr, childAt);
                if (findTouchTargetViewWithPointerEvents != null) {
                    return findTouchTargetViewWithPointerEvents;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
        }
        return viewGroup;
    }

    private static View findTouchTargetViewWithPointerEvents(float[] fArr, View view) {
        PointerEvents pointerEvents;
        if (view instanceof ReactPointerEventsView) {
            pointerEvents = ((ReactPointerEventsView) view).getPointerEvents();
        } else {
            pointerEvents = PointerEvents.AUTO;
        }
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                pointerEvents = PointerEvents.BOX_NONE;
            } else if (pointerEvents == PointerEvents.BOX_ONLY) {
                pointerEvents = PointerEvents.NONE;
            }
        }
        if (pointerEvents == PointerEvents.NONE) {
            return null;
        }
        if (pointerEvents == PointerEvents.BOX_ONLY) {
            return view;
        }
        if (pointerEvents == PointerEvents.BOX_NONE) {
            if (view instanceof ViewGroup) {
                View findTouchTargetView = findTouchTargetView(fArr, (ViewGroup) view);
                if (findTouchTargetView != view) {
                    return findTouchTargetView;
                }
                if (!(view instanceof ReactCompoundView) || ((ReactCompoundView) view).reactTagForTouch(fArr[0], fArr[1]) == view.getId()) {
                    return null;
                }
                return view;
            }
            return null;
        } else if (pointerEvents != PointerEvents.AUTO) {
            StringBuilder sb = new StringBuilder("Unknown pointer event type: ");
            sb.append(pointerEvents.toString());
            throw new JSApplicationIllegalArgumentException(sb.toString());
        } else if ((!(view instanceof ReactCompoundViewGroup) || !((ReactCompoundViewGroup) view).interceptsTouchEvent(fArr[0], fArr[1])) && (view instanceof ViewGroup)) {
            return findTouchTargetView(fArr, (ViewGroup) view);
        } else {
            return view;
        }
    }

    public static int findTargetTagForTouch(float f, float f2, ViewGroup viewGroup) {
        return findTargetTagAndCoordinatesForTouch(f, f2, viewGroup, mEventCoords, null);
    }

    private static int getTouchTargetForView(View view, float f, float f2) {
        if (view instanceof ReactCompoundView) {
            return ((ReactCompoundView) view).reactTagForTouch(f, f2);
        }
        return view.getId();
    }

    public static int findTargetTagForTouch(float f, float f2, ViewGroup viewGroup, int[] iArr) {
        return findTargetTagAndCoordinatesForTouch(f, f2, viewGroup, mEventCoords, iArr);
    }

    public static int findTargetTagAndCoordinatesForTouch(float f, float f2, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View findTouchTargetView = findTouchTargetView(fArr, viewGroup);
        if (findTouchTargetView == null) {
            return id;
        }
        View findClosestReactAncestor = findClosestReactAncestor(findTouchTargetView);
        if (findClosestReactAncestor == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = findClosestReactAncestor.getId();
        }
        return getTouchTargetForView(findClosestReactAncestor, fArr[0], fArr[1]);
    }

    private static boolean isTransformedTouchPointInView(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = mMatrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = mInverseMatrix;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (view instanceof ReactHitSlopView) {
            ReactHitSlopView reactHitSlopView = (ReactHitSlopView) view;
            if (reactHitSlopView.getHitSlopRect() != null) {
                Rect hitSlopRect = reactHitSlopView.getHitSlopRect();
                if (scrollX < ((float) (-hitSlopRect.left)) || scrollX >= ((float) ((view.getRight() - view.getLeft()) + hitSlopRect.right)) || scrollY < ((float) (-hitSlopRect.top)) || scrollY >= ((float) ((view.getBottom() - view.getTop()) + hitSlopRect.bottom))) {
                    return false;
                }
                pointF.set(scrollX, scrollY);
                return true;
            }
        }
        if (scrollX < 0.0f || scrollX >= ((float) (view.getRight() - view.getLeft())) || scrollY < 0.0f || scrollY >= ((float) (view.getBottom() - view.getTop()))) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
