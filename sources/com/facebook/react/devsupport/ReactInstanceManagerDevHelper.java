package com.facebook.react.devsupport;

import android.app.Activity;
import com.facebook.react.bridge.JavaJSExecutor.Factory;

public interface ReactInstanceManagerDevHelper {
    Activity getCurrentActivity();

    void onJSBundleLoadedFromServer();

    void onReloadWithJSDebugger(Factory factory);

    void toggleElementInspector();
}
