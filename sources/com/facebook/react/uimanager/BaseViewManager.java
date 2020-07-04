package com.facebook.react.uimanager;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.MatrixMathHelper.MatrixDecompositionContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends ViewManager<T, C> {
    private static MatrixDecompositionContext sMatrixDecompositionContext = new MatrixDecompositionContext();
    private static double[] sTransformDecompositionArray = new double[16];

    private static void resetTransformProperty(View view) {
        view.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
        view.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    @ReactProp(name = "accessibilityComponentType")
    public void setAccessibilityComponentType(T t, String str) {
        AccessibilityHelper.updateAccessibilityComponentType(t, str);
    }

    @ReactProp(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t, String str) {
        t.setContentDescription(str);
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t, float f) {
        t.setAlpha(f);
    }

    @ReactProp(name = "rotation")
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleX")
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleY")
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateX")
    public void setTranslateX(T t, float f) {
        t.setTranslationX(PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateY")
    public void setTranslateY(T t, float f) {
        t.setTranslationY(PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(name = "elevation")
    public void setElevation(T t, float f) {
        if (VERSION.SDK_INT >= 21) {
            t.setElevation(PixelUtil.toPixelFromDIP(f));
        }
    }

    @ReactProp(name = "nativeID")
    public void setNativeId(T t, String str) {
        t.setTag(R.id.edj, str);
        ReactFindViewUtil.notifyViewRendered(t);
    }

    @ReactProp(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t, boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        t.setLayerType(i, null);
    }

    @ReactProp(name = "testID")
    public void setTestId(T t, String str) {
        t.setTag(R.id.coc, str);
        t.setTag(str);
    }

    @ReactProp(name = "transform")
    public void setTransform(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @ReactProp(name = "zIndex")
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent != null && (parent instanceof ReactZIndexedViewGroup)) {
            ((ReactZIndexedViewGroup) parent).updateDrawingOrder();
        }
    }

    @ReactProp(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t, String str) {
        if (VERSION.SDK_INT >= 19) {
            if (str == null || str.equals("none")) {
                t.setAccessibilityLiveRegion(0);
            } else if (str.equals("polite")) {
                t.setAccessibilityLiveRegion(1);
            } else if (str.equals("assertive")) {
                t.setAccessibilityLiveRegion(2);
            }
        }
    }

    @ReactProp(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t, String str) {
        if (str == null || str.equals("auto")) {
            t.setImportantForAccessibility(0);
        } else if (str.equals("yes")) {
            t.setImportantForAccessibility(1);
        } else if (str.equals("no")) {
            t.setImportantForAccessibility(2);
        } else {
            if (str.equals("no-hide-descendants")) {
                t.setImportantForAccessibility(4);
            }
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        TransformHelper.processTransform(readableArray, sTransformDecompositionArray);
        MatrixMathHelper.decomposeMatrix(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(PixelUtil.toPixelFromDIP((float) sMatrixDecompositionContext.translation[0]));
        view.setTranslationY(PixelUtil.toPixelFromDIP((float) sMatrixDecompositionContext.translation[1]));
        view.setRotation((float) sMatrixDecompositionContext.rotationDegrees[2]);
        view.setRotationX((float) sMatrixDecompositionContext.rotationDegrees[0]);
        view.setRotationY((float) sMatrixDecompositionContext.rotationDegrees[1]);
        view.setScaleX((float) sMatrixDecompositionContext.scale[0]);
        view.setScaleY((float) sMatrixDecompositionContext.scale[1]);
        double[] dArr = sMatrixDecompositionContext.perspective;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            view.setCameraDistance(DisplayMetricsHolder.getScreenDisplayMetrics().density * (-1.0f / f) * 5.0f);
        }
    }
}
