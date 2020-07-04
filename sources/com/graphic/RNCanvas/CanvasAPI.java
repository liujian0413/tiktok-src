package com.graphic.RNCanvas;

import android.graphics.Paint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CanvasAPI extends ReactContextBaseJavaModule {
    private static final Paint paint = new Paint();

    public String getName() {
        return "CanvasAPI";
    }

    public CanvasAPI(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void release(String str) {
        CanvasViewManager.removeCanvasView(str);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap measureText(String str, double d) {
        HashMap hashMap = new HashMap();
        paint.setTextSize((float) d);
        hashMap.put("width", Float.valueOf(paint.measureText(str)));
        return Arguments.makeNativeMap((Map<String, Object>) hashMap);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public Integer drawSync(String str, ReadableArray readableArray) {
        if (readableArray.size() == 0) {
            return Integer.valueOf(0);
        }
        ArrayList convertActions = CanvasConvert.convertActions(readableArray);
        CanvasTextureView canvasView = CanvasViewManager.getCanvasView(str);
        if (canvasView != null) {
            canvasView.setActions(convertActions);
            canvasView.drawOutput();
        }
        return Integer.valueOf(1);
    }
}
