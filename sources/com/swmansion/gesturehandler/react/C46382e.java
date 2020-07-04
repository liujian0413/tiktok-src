package com.swmansion.gesturehandler.react;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.swmansion.gesturehandler.react.e */
public final class C46382e implements ReactPackage {
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new RNGestureHandlerModule(reactApplicationContext)});
    }

    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[]{new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager()});
    }
}
