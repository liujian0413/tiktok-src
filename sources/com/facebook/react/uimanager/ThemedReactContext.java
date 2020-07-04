package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

public class ThemedReactContext extends ReactContext {
    private final ReactApplicationContext mReactApplicationContext;

    public Activity getCurrentActivity() {
        return this.mReactApplicationContext.getCurrentActivity();
    }

    public boolean hasCurrentActivity() {
        return this.mReactApplicationContext.hasCurrentActivity();
    }

    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mReactApplicationContext.addLifecycleEventListener(lifecycleEventListener);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mReactApplicationContext.removeLifecycleEventListener(lifecycleEventListener);
    }

    public ThemedReactContext(ReactApplicationContext reactApplicationContext, Context context) {
        super(context);
        initializeWithInstance(reactApplicationContext.getCatalystInstance());
        this.mReactApplicationContext = reactApplicationContext;
        try {
            if (!(reactApplicationContext.getCatalystInstance() == null || reactApplicationContext.getCatalystInstance().getJSBundleLoader() == null)) {
                setRemoteDebug(reactApplicationContext.getCatalystInstance().getJSBundleLoader().mDebugRemote);
            }
        } catch (Throwable unused) {
        }
    }
}
