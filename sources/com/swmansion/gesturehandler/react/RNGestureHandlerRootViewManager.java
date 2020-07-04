package com.swmansion.gesturehandler.react;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;

@ReactModule(name = "GestureHandlerRootView")
public class RNGestureHandlerRootViewManager extends ViewGroupManager<C46387h> {
    public String getName() {
        return "GestureHandlerRootView";
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m41789of("onGestureHandlerEvent", MapBuilder.m41788of("registrationName", "onGestureHandlerEvent"), "onGestureHandlerStateChange", MapBuilder.m41788of("registrationName", "onGestureHandlerStateChange"));
    }

    public void onDropViewInstance(C46387h hVar) {
        hVar.mo115313a();
    }

    /* access modifiers changed from: protected */
    public C46387h createViewInstance(ThemedReactContext themedReactContext) {
        return new C46387h(themedReactContext);
    }
}
