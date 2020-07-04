package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;

public interface ViewManagerOnDemandReactPackage {
    ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str, boolean z);

    List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext, boolean z);
}
