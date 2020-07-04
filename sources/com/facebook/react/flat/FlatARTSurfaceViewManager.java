package com.facebook.react.flat;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.art.ARTSurfaceView;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

public class FlatARTSurfaceViewManager extends BaseViewManager<ARTSurfaceView, FlatARTSurfaceViewShadowNode> {
    private static final YogaMeasureFunction MEASURE_FUNCTION = new YogaMeasureFunction() {
        public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    };

    public String getName() {
        return "ARTSurfaceView";
    }

    public Class<FlatARTSurfaceViewShadowNode> getShadowNodeClass() {
        return FlatARTSurfaceViewShadowNode.class;
    }

    public FlatARTSurfaceViewShadowNode createShadowNodeInstance() {
        FlatARTSurfaceViewShadowNode flatARTSurfaceViewShadowNode = new FlatARTSurfaceViewShadowNode();
        flatARTSurfaceViewShadowNode.setMeasureFunction(MEASURE_FUNCTION);
        return flatARTSurfaceViewShadowNode;
    }

    /* access modifiers changed from: protected */
    public ARTSurfaceView createViewInstance(ThemedReactContext themedReactContext) {
        return new ARTSurfaceView(themedReactContext);
    }

    public void updateExtraData(ARTSurfaceView aRTSurfaceView, Object obj) {
        aRTSurfaceView.setSurfaceTextureListener((FlatARTSurfaceViewShadowNode) obj);
    }
}
