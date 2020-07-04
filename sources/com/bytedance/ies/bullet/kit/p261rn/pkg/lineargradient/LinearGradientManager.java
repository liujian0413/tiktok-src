package com.bytedance.ies.bullet.kit.p261rn.pkg.lineargradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.lineargradient.LinearGradientManager */
public class LinearGradientManager extends SimpleViewManager<C10606b> {
    public String getName() {
        return "BVLinearGradient";
    }

    /* access modifiers changed from: protected */
    public C10606b createViewInstance(ThemedReactContext themedReactContext) {
        return new C10606b(themedReactContext);
    }

    @ReactProp(name = "borderRadii")
    public void setBorderRadii(C10606b bVar, ReadableArray readableArray) {
        bVar.setBorderRadii(readableArray);
    }

    @ReactProp(name = "colors")
    public void setColors(C10606b bVar, ReadableArray readableArray) {
        bVar.setColors(readableArray);
    }

    @ReactProp(name = "endPoint")
    public void setEndPosition(C10606b bVar, ReadableArray readableArray) {
        bVar.setEndPosition(readableArray);
    }

    @ReactProp(name = "startPoint")
    public void setStartPosition(C10606b bVar, ReadableArray readableArray) {
        bVar.setStartPosition(readableArray);
    }

    @ReactProp(name = "locations")
    public void setLocations(C10606b bVar, ReadableArray readableArray) {
        if (readableArray != null) {
            bVar.setLocations(readableArray);
        }
    }
}
