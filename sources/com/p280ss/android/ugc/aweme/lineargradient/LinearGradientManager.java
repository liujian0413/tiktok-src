package com.p280ss.android.ugc.aweme.lineargradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

/* renamed from: com.ss.android.ugc.aweme.lineargradient.LinearGradientManager */
public class LinearGradientManager extends SimpleViewManager<C32418b> {
    public String getName() {
        return "BVLinearGradient";
    }

    /* access modifiers changed from: protected */
    public C32418b createViewInstance(ThemedReactContext themedReactContext) {
        return new C32418b(themedReactContext);
    }

    @ReactProp(name = "borderRadii")
    public void setBorderRadii(C32418b bVar, ReadableArray readableArray) {
        bVar.setBorderRadii(readableArray);
    }

    @ReactProp(name = "colors")
    public void setColors(C32418b bVar, ReadableArray readableArray) {
        bVar.setColors(readableArray);
    }

    @ReactProp(name = "endPoint")
    public void setEndPosition(C32418b bVar, ReadableArray readableArray) {
        bVar.setEndPosition(readableArray);
    }

    @ReactProp(name = "startPoint")
    public void setStartPosition(C32418b bVar, ReadableArray readableArray) {
        bVar.setStartPosition(readableArray);
    }

    @ReactProp(name = "locations")
    public void setLocations(C32418b bVar, ReadableArray readableArray) {
        if (readableArray != null) {
            bVar.setLocations(readableArray);
        }
    }
}
