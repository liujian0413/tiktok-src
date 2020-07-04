package com.facebook.react.bridge;

import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

public interface CatalystInstance extends JSInstance, MemoryPressureListener {
    void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void addJSIModules(List<JSIModuleHolder> list);

    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    void extendNativeModules(NativeModuleRegistry nativeModuleRegistry);

    JSBundleLoader getJSBundleLoader();

    <T extends JSIModule> T getJSIModule(Class<T> cls);

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    JavaScriptContextHolder getJavaScriptContextHolder();

    String getMainJsBundlePath();

    <T extends NativeModule> T getNativeModule(Class<T> cls);

    Collection<NativeModule> getNativeModules();

    ReactQueueConfiguration getReactQueueConfiguration();

    String getSourceURL();

    <T extends NativeModule> boolean hasNativeModule(Class<T> cls);

    boolean hasRunJSBundle();

    void initialize();

    void invokeCallback(int i, NativeArray nativeArray);

    void invokeCallbackDirect(long j, NativeArray nativeArray);

    boolean isDestroyed();

    boolean isFirstDrawn();

    void loadJavaScript(String str, String str2, boolean z);

    void onPageFinished();

    void registerSegment(int i, String str);

    void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void runJSBundle();

    void setFirstDraw(long j);

    void setFirstScreenPaintFinished(long j);

    void setGlobalVariable(String str, String str2);

    void setPageFinishListener(PageFinishedListener pageFinishedListener);

    void setRootView(WeakReference<ReactRootView> weakReference);

    void setStartLoad(long j);

    void startFirstDraw();

    void updateLayout();
}
