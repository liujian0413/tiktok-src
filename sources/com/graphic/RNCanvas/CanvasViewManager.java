package com.graphic.RNCanvas;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.HashMap;
import java.util.Map;

public class CanvasViewManager extends SimpleViewManager {
    private static final HashMap<String, CanvasTextureView> canvasViews = new HashMap<>();

    public String getName() {
        return "CanvasView";
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m41788of("onReady", MapBuilder.m41788of("registrationName", "onReady"));
    }

    public static void removeCanvasView(String str) {
        canvasViews.remove(str);
    }

    public static CanvasTextureView getCanvasView(String str) {
        return (CanvasTextureView) canvasViews.get(str);
    }

    public CanvasTextureView createViewInstance(ThemedReactContext themedReactContext) {
        return new CanvasTextureView(themedReactContext);
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(CanvasTextureView canvasTextureView, Integer num) {
        canvasTextureView.setBackgroundColor(num);
    }

    private static void setCanvasView(String str, CanvasTextureView canvasTextureView) {
        canvasViews.put(str, canvasTextureView);
    }

    @ReactProp(name = "nativeID")
    public void setNativeID(CanvasTextureView canvasTextureView, String str) {
        if (getCanvasView(str) == null) {
            setCanvasView(str, canvasTextureView);
        }
    }

    @ReactProp(name = "actions")
    public void setActions(CanvasTextureView canvasTextureView, ReadableArray readableArray) {
        if (readableArray.size() != 0) {
            canvasTextureView.setActions(CanvasConvert.convertActions(readableArray));
            canvasTextureView.drawOutput();
        }
    }
}
