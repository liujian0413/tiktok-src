package com.facebook.react;

import android.app.Application;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.JSIModulesProvider;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.RNDegradeExceptionHandler;
import com.facebook.react.bridge.RNJavaScriptRuntime.SplitCommonType;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.uimanager.UIImplementationProvider;
import java.util.List;

public abstract class ReactNativeHost {
    private final Application mApplication;
    private ReactInstanceManager mReactInstanceManager;

    /* access modifiers changed from: protected */
    public final Application getApplication() {
        return this.mApplication;
    }

    /* access modifiers changed from: protected */
    public String getBundleAssetName() {
        return "index.android.bundle";
    }

    /* access modifiers changed from: protected */
    public RNDegradeExceptionHandler getDegradeExceptionHandler() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getJSBundleFile() {
        return null;
    }

    /* access modifiers changed from: protected */
    public JSIModulesProvider getJSIModulesProvider() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getJSMainModuleName() {
        return "index.android";
    }

    /* access modifiers changed from: protected */
    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract List<ReactPackage> getPackages();

    /* access modifiers changed from: protected */
    public RedBoxHandler getRedBoxHandler() {
        return null;
    }

    /* access modifiers changed from: protected */
    public SplitCommonType getSplitCommonPakageType() {
        return SplitCommonType.NONE;
    }

    public abstract boolean getUseDeveloperSupport();

    /* access modifiers changed from: protected */
    public UIImplementationProvider getUIImplementationProvider() {
        return new UIImplementationProvider();
    }

    public boolean hasInstance() {
        if (this.mReactInstanceManager != null) {
            return true;
        }
        return false;
    }

    public void clear() {
        if (this.mReactInstanceManager != null) {
            this.mReactInstanceManager.destroy();
            this.mReactInstanceManager = null;
        }
    }

    public ReactInstanceManager getReactInstanceManager() {
        if (this.mReactInstanceManager == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.mReactInstanceManager = createReactInstanceManager();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.mReactInstanceManager;
    }

    /* access modifiers changed from: protected */
    public ReactInstanceManager createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        ReactInstanceManagerBuilder degradeExceptionHandler = ReactInstanceManager.builder().setApplication(this.mApplication).setJSMainModulePath(getJSMainModuleName()).setUseDeveloperSupport(getUseDeveloperSupport()).setRedBoxHandler(getRedBoxHandler()).setJavaScriptExecutorFactory(getJavaScriptExecutorFactory()).setUIImplementationProvider(getUIImplementationProvider()).setJSIModulesProvider(getJSIModulesProvider()).setInitialLifecycleState(LifecycleState.BEFORE_CREATE).setDegradeExceptionHandler(getDegradeExceptionHandler());
        for (ReactPackage addPackage : getPackages()) {
            degradeExceptionHandler.addPackage(addPackage);
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            degradeExceptionHandler.setJSBundleFile(jSBundleFile, getSplitCommonPakageType());
        } else {
            degradeExceptionHandler.setBundleAssetName((String) C13854a.m40916b(getBundleAssetName()), getSplitCommonPakageType());
        }
        ReactInstanceManager build = degradeExceptionHandler.build();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return build;
    }

    protected ReactNativeHost(Application application) {
        this.mApplication = application;
    }
}
