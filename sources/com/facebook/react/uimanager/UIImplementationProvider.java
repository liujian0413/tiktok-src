package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule.ViewManagerResolver;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.List;

public class UIImplementationProvider {
    public UIImplementation createUIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, EventDispatcher eventDispatcher, int i) {
        return new UIImplementation(reactApplicationContext, viewManagerResolver, eventDispatcher, i);
    }

    public UIImplementation createUIImplementation(ReactApplicationContext reactApplicationContext, List<ViewManager> list, EventDispatcher eventDispatcher, int i) {
        return new UIImplementation(reactApplicationContext, list, eventDispatcher, i);
    }
}
