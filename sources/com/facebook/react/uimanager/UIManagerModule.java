package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Handler;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.animation.Animation;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.PerformanceCounter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout.OnSizeChangedListener;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ReactModule(name = "UIManager")
public class UIManagerModule extends ReactContextBaseJavaModule implements LifecycleEventListener, OnBatchCompleteListener, PerformanceCounter, UIManager {
    private static final boolean DEBUG = false;
    private static Map<String, Object> mModuleConstants;
    private int mBatchId = 0;
    public final Map<String, Object> mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private Handler mLayoutTriggerHandler = null;
    private final List<UIManagerModuleListener> mListeners = new ArrayList();
    private final MemoryTrimCallback mMemoryTrimCallback = new MemoryTrimCallback();
    public final UIImplementation mUIImplementation;
    public boolean mWaitForLayout = false;

    public interface CustomEventNamesResolver {
        String resolveCustomEventName(String str);
    }

    class MemoryTrimCallback implements ComponentCallbacks2 {
        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        private MemoryTrimCallback() {
        }

        public void onTrimMemory(int i) {
            if (i >= 60) {
                YogaNodePool.get().clear();
            }
        }
    }

    public interface ViewManagerResolver {
        ViewManager getViewManager(String str);

        List<String> getViewManagerNames();
    }

    public Map<String, Object> getConstants() {
        return mModuleConstants;
    }

    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public String getName() {
        return "UIManager";
    }

    public UIImplementation getUIImplementation() {
        return this.mUIImplementation;
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.clearJSResponder();
    }

    public CustomEventNamesResolver getDirectEventNamesResolver() {
        return new CustomEventNamesResolver() {
            public String resolveCustomEventName(String str) {
                Map map = (Map) UIManagerModule.this.mCustomDirectEvents.get(str);
                if (map != null) {
                    return (String) map.get("registrationName");
                }
                return str;
            }
        };
    }

    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.getProfiledBatchPerfCounters();
    }

    public void onHostDestroy() {
        this.mUIImplementation.onHostDestroy();
    }

    public void onHostPause() {
        this.mUIImplementation.onHostPause();
    }

    public void onHostResume() {
        this.mUIImplementation.onHostResume();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(UIManagerModuleConstantsHelper.getDefaultExportableEventTypes());
    }

    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
    }

    public void onBatchComplete() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnLayoutThread(new GuardedRunnable(reactApplicationContext) {
            public void runGuarded() {
                UIManagerModule.this.onBatchCompleteOnLayoutThread();
            }
        });
    }

    private void ReLayoutNextTick() {
        if (this.mLayoutTriggerHandler == null) {
            this.mLayoutTriggerHandler = new Handler();
        }
        if (!this.mWaitForLayout) {
            this.mLayoutTriggerHandler.postDelayed(new Runnable() {
                public void run() {
                    UIManagerModule.this.onBatchComplete();
                    UIManagerModule.this.mWaitForLayout = false;
                }
            }, 16);
            this.mWaitForLayout = true;
        }
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.onCatalystInstanceDestroyed();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        YogaNodePool.get().clear();
        ViewManagerPropertyUpdater.clear();
    }

    public void onBatchCompleteOnLayoutThread() {
        int i = this.mBatchId;
        this.mBatchId++;
        for (UIManagerModuleListener willDispatchViewUpdates : this.mListeners) {
            willDispatchViewUpdates.willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.dispatchViewUpdates(i);
        } finally {
            Systrace.m42323a(0);
        }
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.addUIBlock(uIBlock);
    }

    public void addUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.add(uIManagerModuleListener);
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.prependUIBlock(uIBlock);
    }

    public void registerAnimation(Animation animation) {
        this.mUIImplementation.registerAnimation(animation);
    }

    public void removeUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.remove(uIManagerModuleListener);
    }

    public int resolveRootTagFromReactTag(int i) {
        return this.mUIImplementation.resolveRootTagFromReactTag(i);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.setLayoutAnimationEnabledExperimental(z);
    }

    public void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mUIImplementation.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.removeRootView(i);
        ReLayoutNextTick();
    }

    @ReactMethod
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.removeSubviewsFromContainerWithID(i);
        ReLayoutNextTick();
    }

    public void invalidateNodeLayout(int i) {
        ReactShadowNode resolveShadowNode = this.mUIImplementation.resolveShadowNode(i);
        if (resolveShadowNode == null) {
            StringBuilder sb = new StringBuilder("Warning : attempted to dirty a non-existent react shadow node. reactTag=");
            sb.append(i);
            C13286a.m38860c("ReactNative", sb.toString());
            return;
        }
        resolveShadowNode.dirty();
    }

    private static Map<String, Object> createConstants(ViewManagerResolver viewManagerResolver) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        Systrace.m42324a(0, "CreateUIManagerConstants");
        try {
            return UIManagerModuleConstantsHelper.createConstants(viewManagerResolver);
        } finally {
            Systrace.m42323a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends SizeMonitoringFrameLayout & MeasureSpecProvider> int addRootView(T t) {
        Systrace.m42324a(0, "UIManagerModule.addRootView");
        final int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        this.mUIImplementation.registerRootView(t, nextRootViewTag, new ThemedReactContext(reactApplicationContext, t.getContext()));
        t.setOnSizeChangedListener(new OnSizeChangedListener() {
            public void onSizeChanged(final int i, final int i2, int i3, int i4) {
                reactApplicationContext.runOnLayoutThread(new GuardedRunnable(reactApplicationContext) {
                    public void runGuarded() {
                        UIManagerModule.this.updateNodeSize(nextRootViewTag, i, i2);
                    }
                });
            }
        });
        Systrace.m42323a(0);
        return nextRootViewTag;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager viewManager;
        if (str != null) {
            viewManager = this.mUIImplementation.resolveViewManager(str);
        } else {
            viewManager = null;
        }
        if (viewManager == null) {
            return null;
        }
        viewManager.getName();
        Boolean.valueOf(true);
        Map createConstantsForViewManager = UIManagerModuleConstantsHelper.createConstantsForViewManager(viewManager, null, null, null, this.mCustomDirectEvents);
        if (createConstantsForViewManager != null) {
            return Arguments.makeNativeMap(createConstantsForViewManager);
        }
        return null;
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.measure(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.measureInWindow(i, callback);
    }

    public void removeAnimation(int i, int i2) {
        this.mUIImplementation.removeAnimation(i, i2);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        this.mUIImplementation.sendAccessibilityEvent(i, i2);
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.setJSResponder(i, z);
    }

    @ReactMethod
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.replaceExistingNonRootView(i, i2);
        ReLayoutNextTick();
    }

    public void setViewLocalData(final int i, final Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnLayoutThread(new GuardedRunnable(reactApplicationContext) {
            public void runGuarded() {
                UIManagerModule.this.mUIImplementation.setViewLocalData(i, obj);
            }
        });
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("(UIManager.setChildren) tag: ");
            sb.append(i);
            sb.append(", children: ");
            sb.append(readableArray);
            C13286a.m38842a("ReactNative", sb.toString());
        }
        this.mUIImplementation.setChildren(i, readableArray);
        ReLayoutNextTick();
    }

    public void addAnimation(int i, int i2, Callback callback) {
        this.mUIImplementation.addAnimation(i, i2, callback);
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.configureNextLayoutAnimation(readableMap, callback, callback2);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i, i2, readableArray);
    }

    @ReactMethod
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayoutRelativeToParent(i, callback, callback2);
    }

    @ReactMethod
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.viewIsDescendantOf(i, i2, callback);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnLayoutThread();
        this.mUIImplementation.updateNodeSize(i, i2, i3);
    }

    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        this.mUIImplementation.updateRootView(i, i2, i3);
        this.mUIImplementation.dispatchViewUpdates(-1);
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.findSubviewIn(i, (float) Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(0))), (float) Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(1))), callback);
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("(UIManager.updateView) tag: ");
            sb.append(i);
            sb.append(", class: ");
            sb.append(str);
            sb.append(", props: ");
            sb.append(readableMap);
            C13286a.m38842a("ReactNative", sb.toString());
        }
        this.mUIImplementation.updateView(i, str, readableMap);
        ReLayoutNextTick();
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        Systrace.m42324a(0, "CreateUIManagerConstants");
        try {
            Map<String, Object> createConstants = UIManagerModuleConstantsHelper.createConstants(list, map, map2);
            return createConstants;
        } finally {
            Systrace.m42323a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayout(i, i2, callback, callback2);
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.showPopupMenu(i, readableArray, callback, callback2);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, UIImplementationProvider uIImplementationProvider, int i) {
        super(reactApplicationContext);
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        this.mEventDispatcher = new EventDispatcher(reactApplicationContext);
        mModuleConstants = createConstants(viewManagerResolver);
        this.mCustomDirectEvents = UIManagerModuleConstants.getDirectEventTypeConstants();
        this.mUIImplementation = uIImplementationProvider.createUIImplementation(reactApplicationContext, viewManagerResolver, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("(UIManager.createView) tag: ");
            sb.append(i);
            sb.append(", class: ");
            sb.append(str);
            sb.append(", props: ");
            sb.append(readableMap);
            C13286a.m38842a("ReactNative", sb.toString());
        }
        this.mUIImplementation.createView(i, str, i2, readableMap);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, UIImplementationProvider uIImplementationProvider, int i) {
        super(reactApplicationContext);
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        this.mEventDispatcher = new EventDispatcher(reactApplicationContext);
        this.mCustomDirectEvents = MapBuilder.newHashMap();
        if (mModuleConstants == null) {
            mModuleConstants = createConstants(list, null, this.mCustomDirectEvents);
        }
        this.mUIImplementation = uIImplementationProvider.createUIImplementation(reactApplicationContext, list, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("(UIManager.manageChildren) tag: ");
            sb.append(i);
            sb.append(", moveFrom: ");
            sb.append(readableArray);
            sb.append(", moveTo: ");
            sb.append(readableArray2);
            sb.append(", addTags: ");
            sb.append(readableArray3);
            sb.append(", atIndices: ");
            sb.append(readableArray4);
            sb.append(", removeFrom: ");
            sb.append(readableArray5);
            C13286a.m38842a("ReactNative", sb.toString());
        }
        this.mUIImplementation.manageChildren(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
        ReLayoutNextTick();
    }
}
