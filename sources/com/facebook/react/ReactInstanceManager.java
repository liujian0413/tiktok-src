package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.Process;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.CatalystInstanceImpl.Builder;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulesProvider;
import com.facebook.react.bridge.JavaJSExecutor.Factory;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ProxyJavaScriptExecutor;
import com.facebook.react.bridge.RNDegradeExceptionHandler;
import com.facebook.react.bridge.RNJavaScriptRuntime.SplitCommonType;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.ReactInstanceManagerDevHelper;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.UIImplementationProvider;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.util.RNThread;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.systrace.Systrace;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ReactInstanceManager implements Callback {
    private static final String TAG = ReactInstanceManager.class.getSimpleName();
    private final Context mApplicationContext;
    private final List<ReactRootView> mAttachedRootViews = Collections.synchronizedList(new ArrayList());
    private final NotThreadSafeBridgeIdleDebugListener mBridgeIdleDebugListener;
    private final JSBundleLoader mBundleLoader;
    public volatile boolean mCreateContextReady = true;
    private volatile RNThread mCreateReactContextThread;
    public Activity mCurrentActivity;
    private volatile ReactContext mCurrentReactContext;
    private DefaultHardwareBackBtnHandler mDefaultBackButtonImpl;
    public RNDegradeExceptionHandler mDegradeExceptionHandler;
    private final boolean mDelayViewManagerClassLoadsEnabled;
    public final DevSupportManager mDevSupportManager;
    public volatile boolean mHasStartedCreatingInitialContext = false;
    public volatile Boolean mHasStartedDestroying = Boolean.valueOf(false);
    private final JSIModulesProvider mJSIModulesProvider;
    private final String mJSMainModulePath;
    private final JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    private final boolean mLazyNativeModulesEnabled;
    private volatile LifecycleState mLifecycleState;
    private final MemoryPressureRouter mMemoryPressureRouter;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private final List<ReactPackage> mPackages;
    public ReactContextInitParams mPendingReactContextInitParams;
    private final Object mReactContextLock = new Object();
    private final Collection<ReactInstanceEventListener> mReactInstanceEventListeners = Collections.synchronizedSet(new HashSet());
    public final boolean mUseDeveloperSupport;
    private List<ViewManager> mViewManagers;

    class ReactContextInitParams {
        private final JSBundleLoader mJsBundleLoader;
        private final JavaScriptExecutorFactory mJsExecutorFactory;

        public JSBundleLoader getJsBundleLoader() {
            return this.mJsBundleLoader;
        }

        public JavaScriptExecutorFactory getJsExecutorFactory() {
            return this.mJsExecutorFactory;
        }

        public ReactContextInitParams(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.mJsExecutorFactory = (JavaScriptExecutorFactory) C13854a.m40916b(javaScriptExecutorFactory);
            this.mJsBundleLoader = jSBundleLoader;
        }
    }

    public interface ReactInstanceEventListener {
        void onReactContextInitialized(ReactContext reactContext);
    }

    public DevSupportManager getDevSupportManager() {
        return this.mDevSupportManager;
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public MemoryPressureRouter getMemoryPressureRouter() {
        return this.mMemoryPressureRouter;
    }

    public boolean hasStartedCreatingInitialContext() {
        return this.mHasStartedCreatingInitialContext;
    }

    public static ReactInstanceManagerBuilder builder() {
        return new ReactInstanceManagerBuilder();
    }

    private ReactInstanceManagerDevHelper createDevHelperInterface() {
        return new ReactInstanceManagerDevHelper() {
            public Activity getCurrentActivity() {
                return ReactInstanceManager.this.mCurrentActivity;
            }

            public void onJSBundleLoadedFromServer() {
                ReactInstanceManager.this.onJSBundleLoadedFromServer();
            }

            public void toggleElementInspector() {
                ReactInstanceManager.this.toggleElementInspector();
            }

            public void onReloadWithJSDebugger(Factory factory) {
                ReactInstanceManager.this.onReloadWithJSDebugger(factory);
            }
        };
    }

    public void recreateReactContextInBackgroundFromBundleLoader() {
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, this.mBundleLoader);
    }

    static {
        try {
            ReactBridge.staticInit(null);
        } catch (Throwable unused) {
        }
    }

    private Handler getReactContextThreadHandler() {
        RNThread rNThread = this.mCreateReactContextThread;
        if (rNThread == null) {
            return null;
        }
        return rNThread.getHandler();
    }

    private synchronized void moveReactContextToCurrentLifecycleState() {
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            moveToResumedLifecycleState(true);
        }
    }

    public void createReactContextInBackground() {
        C13854a.m40915a(!this.mHasStartedCreatingInitialContext, "createReactContextInBackground should only be called when creating the react application for the first time. When reloading JS, e.g. from a new file, explicitlyuse recreateReactContextInBackground");
        this.mHasStartedCreatingInitialContext = true;
        recreateReactContextInBackgroundInner();
    }

    public void deleteJSBundleFile() {
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.deleteJSBundleFile();
        }
    }

    public ReactContext getCurrentReactContext() {
        ReactContext reactContext;
        synchronized (this.mReactContextLock) {
            reactContext = this.mCurrentReactContext;
        }
        return reactContext;
    }

    public void invokeDefaultOnBackPressed() {
        UiThreadUtil.assertOnUiThread();
        if (this.mDefaultBackButtonImpl != null) {
            this.mDefaultBackButtonImpl.invokeDefaultOnBackPressed();
        }
    }

    public void recreateReactContextInBackground() {
        C13854a.m40915a(this.mHasStartedCreatingInitialContext, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        recreateReactContextInBackgroundInner();
    }

    public void showDevOptionsDialog() {
        UiThreadUtil.assertOnUiThread();
        this.mDevSupportManager.showDevOptionsDialog();
    }

    public boolean isReactContextThread() {
        if (this.mCreateReactContextThread == null || this.mCreateReactContextThread.getId() != Thread.currentThread().getId()) {
            return false;
        }
        return true;
    }

    public void onBackPressed() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.mCurrentReactContext;
        if (reactContext == null) {
            C13286a.m38860c("ReactNative", "Instance detached from instance manager");
            invokeDefaultOnBackPressed();
            return;
        }
        ((DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
    }

    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
        }
        moveToBeforeCreateLifecycleState();
        this.mCurrentActivity = null;
    }

    public void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = null;
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
        }
        moveToBeforeResumeLifecycleState();
    }

    public void onJSBundleLoadedFromServer() {
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, JSBundleLoader.createCachedBundleFromNetworkLoader(this.mDevSupportManager.getSourceUrl(), this.mDevSupportManager.getDownloadedJSBundleFile(), SplitCommonType.NONE));
    }

    public void toggleElementInspector() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            ((RCTDeviceEventEmitter) currentReactContext.getJSModule(RCTDeviceEventEmitter.class)).emit("toggleElementInspector", null);
        }
    }

    private synchronized void moveToBeforeCreateLifecycleState() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (this.mLifecycleState == LifecycleState.RESUMED) {
                currentReactContext.onHostPause();
                this.mLifecycleState = LifecycleState.BEFORE_RESUME;
            }
            if (this.mLifecycleState == LifecycleState.BEFORE_RESUME) {
                currentReactContext.onHostDestroy();
            }
        }
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
    }

    private synchronized void moveToBeforeResumeLifecycleState() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (this.mLifecycleState == LifecycleState.BEFORE_CREATE) {
                currentReactContext.onHostResume(this.mCurrentActivity);
                currentReactContext.onHostPause();
            } else if (this.mLifecycleState == LifecycleState.RESUMED) {
                currentReactContext.onHostPause();
            }
        }
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
    }

    private void recreateReactContextInBackgroundInner() {
        UiThreadUtil.assertOnUiThread();
        if (!this.mUseDeveloperSupport || this.mJSMainModulePath == null) {
            recreateReactContextInBackgroundFromBundleLoader();
            return;
        }
        final DeveloperSettings devSettings = this.mDevSupportManager.getDevSettings();
        if (this.mDevSupportManager.hasUpToDateJSBundleInCache() && !devSettings.isRemoteJSDebugEnabled()) {
            onJSBundleLoadedFromServer();
        } else if (this.mBundleLoader == null) {
            this.mDevSupportManager.handleReloadJS();
        } else {
            this.mDevSupportManager.isPackagerRunning(new PackagerStatusCallback() {
                public void onPackagerStatusFetched(final boolean z) {
                    UiThreadUtil.runOnUiThread(new Runnable() {
                        public void run() {
                            if (z) {
                                ReactInstanceManager.this.mDevSupportManager.handleReloadJS();
                                return;
                            }
                            devSettings.setRemoteJSDebugEnabled(false);
                            ReactInstanceManager.this.recreateReactContextInBackgroundFromBundleLoader();
                        }
                    });
                }
            });
        }
    }

    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        this.mHasStartedDestroying = Boolean.valueOf(true);
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
            this.mDevSupportManager.stopInspector();
        }
        moveToBeforeCreateLifecycleState();
        if (this.mCreateReactContextThread != null) {
            this.mCreateReactContextThread.quit();
            this.mCreateReactContextThread = null;
        }
        this.mMemoryPressureRouter.destroy(this.mApplicationContext);
        synchronized (this.mReactContextLock) {
            if (this.mCurrentReactContext != null) {
                this.mCurrentReactContext.destroy();
                this.mCurrentReactContext = null;
            }
        }
        this.mHasStartedCreatingInitialContext = false;
        this.mCurrentActivity = null;
        ResourceDrawableIdHelper.getInstance().clear();
        this.mHasStartedDestroying = Boolean.valueOf(false);
        synchronized (this.mHasStartedDestroying) {
            this.mHasStartedDestroying.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = new java.util.HashSet();
        r3 = r6.mPackages.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r3.hasNext() == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r4 = (com.facebook.react.ReactPackage) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((r4 instanceof com.facebook.react.ViewManagerOnDemandReactPackage) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4 = ((com.facebook.react.ViewManagerOnDemandReactPackage) r4).getViewManagerNames(r1, !r6.mDelayViewManagerClassLoadsEnabled);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r4 == null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r0.addAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r1 = new java.util.ArrayList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r2 = r6.mPackages;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> getViewManagerNames() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mReactContextLock
            monitor-enter(r0)
            com.facebook.react.bridge.ReactContext r1 = r6.getCurrentReactContext()     // Catch:{ all -> 0x004e }
            com.facebook.react.bridge.ReactApplicationContext r1 = (com.facebook.react.bridge.ReactApplicationContext) r1     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x004b
            boolean r2 = r1.hasActiveCatalystInstance()     // Catch:{ all -> 0x004e }
            if (r2 != 0) goto L_0x0012
            goto L_0x004b
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            java.util.List<com.facebook.react.ReactPackage> r2 = r6.mPackages
            monitor-enter(r2)
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0048 }
            r0.<init>()     // Catch:{ all -> 0x0048 }
            java.util.List<com.facebook.react.ReactPackage> r3 = r6.mPackages     // Catch:{ all -> 0x0048 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0048 }
        L_0x0021:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0048 }
            com.facebook.react.ReactPackage r4 = (com.facebook.react.ReactPackage) r4     // Catch:{ all -> 0x0048 }
            boolean r5 = r4 instanceof com.facebook.react.ViewManagerOnDemandReactPackage     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x0021
            com.facebook.react.ViewManagerOnDemandReactPackage r4 = (com.facebook.react.ViewManagerOnDemandReactPackage) r4     // Catch:{ all -> 0x0048 }
            boolean r5 = r6.mDelayViewManagerClassLoadsEnabled     // Catch:{ all -> 0x0048 }
            r5 = r5 ^ 1
            java.util.List r4 = r4.getViewManagerNames(r1, r5)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0021
            r0.addAll(r4)     // Catch:{ all -> 0x0048 }
            goto L_0x0021
        L_0x0041:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r1.<init>(r0)     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            return r1
        L_0x0048:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r0
        L_0x004b:
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactInstanceManager.getViewManagerNames():java.util.List");
    }

    private static void initializeSoLoaderIfNecessary(Context context) {
        try {
            ReactBridge.staticInit(null);
        } catch (Throwable unused) {
        }
    }

    public void addReactInstanceEventListener(ReactInstanceEventListener reactInstanceEventListener) {
        this.mReactInstanceEventListeners.add(reactInstanceEventListener);
    }

    public void onHostDestroy(Activity activity) {
        if (activity == this.mCurrentActivity) {
            onHostDestroy();
        }
    }

    public void removeReactInstanceEventListener(ReactInstanceEventListener reactInstanceEventListener) {
        this.mReactInstanceEventListeners.remove(reactInstanceEventListener);
    }

    public void post(Runnable runnable) {
        RNThread rNThread = this.mCreateReactContextThread;
        if (rNThread != null) {
            rNThread.post(runnable);
        }
    }

    public void onReloadWithJSDebugger(Factory factory) {
        recreateReactContextInBackground(new ProxyJavaScriptExecutor.Factory(factory), JSBundleLoader.createRemoteDebuggerBundleLoader(this.mDevSupportManager.getJSBundleURLForRemoteDebugging(), this.mDevSupportManager.getSourceUrl(), SplitCommonType.NONE));
    }

    private synchronized void moveToResumedLifecycleState(boolean z) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (z || this.mLifecycleState == LifecycleState.BEFORE_RESUME || this.mLifecycleState == LifecycleState.BEFORE_CREATE)) {
            currentReactContext.onHostResume(this.mCurrentActivity);
        }
        this.mLifecycleState = LifecycleState.RESUMED;
    }

    private void tearDownReactContext(ReactContext reactContext) {
        UiThreadUtil.assertOnUiThread();
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.mAttachedRootViews) {
            for (ReactRootView reactRootView : this.mAttachedRootViews) {
                reactRootView.removeAllViews();
                reactRootView.setId(-1);
            }
        }
        reactContext.destroy();
        this.mDevSupportManager.onReactInstanceDestroyed(reactContext);
        this.mMemoryPressureRouter.removeMemoryPressureListener(reactContext.getCatalystInstance());
    }

    public void attachRootView(ReactRootView reactRootView) {
        UiThreadUtil.assertOnUiThread();
        this.mAttachedRootViews.add(reactRootView);
        reactRootView.removeAllViews();
        reactRootView.setId(-1);
        ReactContext currentReactContext = getCurrentReactContext();
        if (this.mCreateContextReady && currentReactContext != null) {
            attachRootViewToInstance(reactRootView, currentReactContext.getCatalystInstance());
        }
    }

    public void detachRootView(ReactRootView reactRootView) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.mAttachedRootViews) {
            if (this.mAttachedRootViews.remove(reactRootView)) {
                ReactContext currentReactContext = getCurrentReactContext();
                this.mAttachedRootViews.remove(reactRootView);
                if (currentReactContext != null && currentReactContext.hasActiveCatalystInstance()) {
                    detachViewFromInstance(reactRootView, currentReactContext.getCatalystInstance());
                }
            }
        }
    }

    public void onHostPause(Activity activity) {
        boolean z;
        C13854a.m40916b(this.mCurrentActivity);
        if (activity == this.mCurrentActivity) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder("Pausing an activity that is not the current activity, this is incorrect! Current activity: ");
        sb.append(this.mCurrentActivity.getClass().getSimpleName());
        sb.append(" Paused activity: ");
        sb.append(activity.getClass().getSimpleName());
        C13854a.m40915a(z, sb.toString());
        onHostPause();
    }

    public void onHostResume(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = activity;
        if (this.mUseDeveloperSupport) {
            final View decorView = this.mCurrentActivity.getWindow().getDecorView();
            if (!C0991u.m4170G(decorView)) {
                decorView.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
                    public void onViewDetachedFromWindow(View view) {
                    }

                    public void onViewAttachedToWindow(View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                        ReactInstanceManager.this.mDevSupportManager.setDevSupportEnabled(true);
                    }
                });
            } else {
                this.mDevSupportManager.setDevSupportEnabled(true);
            }
        }
        moveToResumedLifecycleState(false);
    }

    public void onNewIntent(Intent intent) {
        UiThreadUtil.assertOnUiThread();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null) {
            C13286a.m38860c("ReactNative", "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if ("android.intent.action.VIEW".equals(action) && data != null) {
            ((DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)).emitNewIntentReceived(data);
        }
        currentReactContext.onNewIntent(this.mCurrentActivity, intent);
    }

    public void runCreateReactContextOnNewThread(final ReactContextInitParams reactContextInitParams) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.mAttachedRootViews) {
            synchronized (this.mReactContextLock) {
                if (this.mCurrentReactContext != null) {
                    tearDownReactContext(this.mCurrentReactContext);
                    this.mCurrentReactContext = null;
                }
            }
        }
        this.mCreateContextReady = false;
        post(new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000a */
            /* JADX WARNING: Removed duplicated region for block: B:2:0x000a A[LOOP:0: B:2:0x000a->B:30:0x000a, LOOP_START, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r4 = this;
                    com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.REACT_CONTEXT_THREAD_END
                    com.facebook.react.bridge.ReactMarker.logMarker(r0)
                    com.facebook.react.ReactInstanceManager r0 = com.facebook.react.ReactInstanceManager.this
                    java.lang.Boolean r0 = r0.mHasStartedDestroying
                    monitor-enter(r0)
                L_0x000a:
                    com.facebook.react.ReactInstanceManager r1 = com.facebook.react.ReactInstanceManager.this     // Catch:{ all -> 0x008e }
                    java.lang.Boolean r1 = r1.mHasStartedDestroying     // Catch:{ all -> 0x008e }
                    boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x008e }
                    if (r1 == 0) goto L_0x001c
                    com.facebook.react.ReactInstanceManager r1 = com.facebook.react.ReactInstanceManager.this     // Catch:{ InterruptedException -> 0x000a }
                    java.lang.Boolean r1 = r1.mHasStartedDestroying     // Catch:{ InterruptedException -> 0x000a }
                    r1.wait()     // Catch:{ InterruptedException -> 0x000a }
                    goto L_0x000a
                L_0x001c:
                    monitor-exit(r0)     // Catch:{ all -> 0x008e }
                    com.facebook.react.ReactInstanceManager r0 = com.facebook.react.ReactInstanceManager.this
                    r1 = 1
                    r0.mHasStartedCreatingInitialContext = r1
                    r0 = -4
                    android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.ReactInstanceManager r0 = com.facebook.react.ReactInstanceManager.this     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.ReactInstanceManager$ReactContextInitParams r2 = r4     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.bridge.JavaScriptExecutorFactory r2 = r2.getJsExecutorFactory()     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.bridge.JavaScriptExecutor r2 = r2.create()     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.ReactInstanceManager$ReactContextInitParams r3 = r4     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.bridge.JSBundleLoader r3 = r3.getJsBundleLoader()     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.bridge.ReactApplicationContext r0 = r0.createReactContext(r2, r3)     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.ReactInstanceManager r2 = com.facebook.react.ReactInstanceManager.this     // Catch:{ Exception -> 0x0056 }
                    r2.mCreateContextReady = r1     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.bridge.ReactMarkerConstants r1 = com.facebook.react.bridge.ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.bridge.ReactMarker.logMarker(r1)     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.ReactInstanceManager$7$1 r1 = new com.facebook.react.ReactInstanceManager$7$1     // Catch:{ Exception -> 0x0056 }
                    r1.<init>()     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.ReactInstanceManager$7$2 r2 = new com.facebook.react.ReactInstanceManager$7$2     // Catch:{ Exception -> 0x0056 }
                    r2.<init>(r0)     // Catch:{ Exception -> 0x0056 }
                    r0.runOnNativeModulesQueueThread(r2)     // Catch:{ Exception -> 0x0056 }
                    com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r1)     // Catch:{ Exception -> 0x0056 }
                    return
                L_0x0056:
                    r0 = move-exception
                    com.facebook.react.ReactInstanceManager r1 = com.facebook.react.ReactInstanceManager.this
                    com.facebook.react.devsupport.interfaces.DevSupportManager r1 = r1.mDevSupportManager
                    r1.handleException(r0)
                    boolean r1 = r0 instanceof java.lang.RuntimeException
                    if (r1 == 0) goto L_0x008d
                    java.lang.String r1 = r0.toString()
                    java.lang.String r2 = "java.lang.RuntimeException: Unable to load script"
                    boolean r1 = r1.contains(r2)
                    if (r1 != 0) goto L_0x007a
                    java.lang.String r1 = r0.toString()
                    java.lang.String r2 = "java.lang.RuntimeException: Could not open file"
                    boolean r1 = r1.contains(r2)
                    if (r1 == 0) goto L_0x008d
                L_0x007a:
                    com.facebook.react.ReactInstanceManager r1 = com.facebook.react.ReactInstanceManager.this
                    com.facebook.react.bridge.RNDegradeExceptionHandler r1 = r1.mDegradeExceptionHandler
                    if (r1 == 0) goto L_0x008d
                    com.facebook.react.ReactInstanceManager r1 = com.facebook.react.ReactInstanceManager.this
                    boolean r1 = r1.mUseDeveloperSupport
                    if (r1 != 0) goto L_0x008d
                    com.facebook.react.ReactInstanceManager r1 = com.facebook.react.ReactInstanceManager.this
                    com.facebook.react.bridge.RNDegradeExceptionHandler r1 = r1.mDegradeExceptionHandler
                    r1.onDegrade(r0)
                L_0x008d:
                    return
                L_0x008e:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x008e }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactInstanceManager.C141837.run():void");
            }
        });
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r6.mPackages.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r0.hasNext() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r4 = (com.facebook.react.ReactPackage) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if ((r4 instanceof com.facebook.react.ViewManagerOnDemandReactPackage) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r4 = ((com.facebook.react.ViewManagerOnDemandReactPackage) r4).createViewManager(r1, r7, !r6.mDelayViewManagerClassLoadsEnabled);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r4 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r6.mPackages;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.uimanager.ViewManager createViewManager(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mReactContextLock
            monitor-enter(r0)
            com.facebook.react.bridge.ReactContext r1 = r6.getCurrentReactContext()     // Catch:{ all -> 0x0042 }
            com.facebook.react.bridge.ReactApplicationContext r1 = (com.facebook.react.bridge.ReactApplicationContext) r1     // Catch:{ all -> 0x0042 }
            r2 = 0
            if (r1 == 0) goto L_0x0040
            boolean r3 = r1.hasActiveCatalystInstance()     // Catch:{ all -> 0x0042 }
            if (r3 != 0) goto L_0x0013
            goto L_0x0040
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            java.util.List<com.facebook.react.ReactPackage> r3 = r6.mPackages
            monitor-enter(r3)
            java.util.List<com.facebook.react.ReactPackage> r0 = r6.mPackages     // Catch:{ all -> 0x003d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003d }
        L_0x001d:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x003d }
            com.facebook.react.ReactPackage r4 = (com.facebook.react.ReactPackage) r4     // Catch:{ all -> 0x003d }
            boolean r5 = r4 instanceof com.facebook.react.ViewManagerOnDemandReactPackage     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x001d
            com.facebook.react.ViewManagerOnDemandReactPackage r4 = (com.facebook.react.ViewManagerOnDemandReactPackage) r4     // Catch:{ all -> 0x003d }
            boolean r5 = r6.mDelayViewManagerClassLoadsEnabled     // Catch:{ all -> 0x003d }
            r5 = r5 ^ 1
            com.facebook.react.uimanager.ViewManager r4 = r4.createViewManager(r1, r7, r5)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x001d
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            return r4
        L_0x003b:
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            return r2
        L_0x003d:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r7
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return r2
        L_0x0042:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactInstanceManager.createViewManager(java.lang.String):com.facebook.react.uimanager.ViewManager");
    }

    public List<ViewManager> getOrCreateViewManagers(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        Systrace.m42324a(0, "createAllViewManagers");
        try {
            if (this.mViewManagers == null) {
                synchronized (this.mPackages) {
                    if (this.mViewManagers == null) {
                        this.mViewManagers = new ArrayList();
                        for (ReactPackage createViewManagers : this.mPackages) {
                            this.mViewManagers.addAll(createViewManagers.createViewManagers(reactApplicationContext));
                        }
                        List<ViewManager> list = this.mViewManagers;
                        Systrace.m42323a(0);
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                        return list;
                    }
                }
            }
            List<ViewManager> list2 = this.mViewManagers;
            Systrace.m42323a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list2;
        } catch (Throwable th) {
            Systrace.m42323a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th;
        }
    }

    public boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        switch (message.what) {
            case 10001:
                NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler;
                if (nativeModuleCallExceptionHandler != null) {
                    if (!(message.obj instanceof Exception)) {
                        if (message.obj instanceof Throwable) {
                            nativeModuleCallExceptionHandler.handleException(new Exception((Throwable) message.obj));
                            break;
                        }
                    } else {
                        nativeModuleCallExceptionHandler.handleException((Exception) message.obj);
                        break;
                    }
                } else {
                    return true;
                }
                break;
            case 10002:
                if (this.mDegradeExceptionHandler != null && !this.mUseDeveloperSupport) {
                    this.mDegradeExceptionHandler.onDegrade(new Exception("NATIVE_ERROR_JSBUNDLE_LOST"));
                }
                this.mHasStartedCreatingInitialContext = false;
                NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler2 = this.mNativeModuleCallExceptionHandler;
                if (nativeModuleCallExceptionHandler2 != null) {
                    if (!(message.obj instanceof Exception)) {
                        if (message.obj instanceof Throwable) {
                            nativeModuleCallExceptionHandler2.handleException(new Exception((Throwable) message.obj));
                            break;
                        }
                    } else {
                        nativeModuleCallExceptionHandler2.handleException((Exception) message.obj);
                        break;
                    }
                } else {
                    return true;
                }
                break;
        }
        return true;
    }

    public void setupReactContext(final ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        Systrace.m42324a(0, "setupReactContext");
        synchronized (this.mAttachedRootViews) {
            synchronized (this.mReactContextLock) {
                this.mCurrentReactContext = (ReactContext) C13854a.m40916b(reactApplicationContext);
                this.mCurrentReactContext.setDegradeExceptionhandle(this.mDegradeExceptionHandler);
            }
            CatalystInstance catalystInstance = (CatalystInstance) C13854a.m40916b(reactApplicationContext.getCatalystInstance());
            catalystInstance.initialize();
            this.mDevSupportManager.onNewReactContextCreated(reactApplicationContext);
            this.mMemoryPressureRouter.addMemoryPressureListener(catalystInstance);
            moveReactContextToCurrentLifecycleState();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            for (ReactRootView attachRootViewToInstance : this.mAttachedRootViews) {
                attachRootViewToInstance(attachRootViewToInstance, catalystInstance);
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        final ReactInstanceEventListener[] reactInstanceEventListenerArr = (ReactInstanceEventListener[]) this.mReactInstanceEventListeners.toArray(new ReactInstanceEventListener[this.mReactInstanceEventListeners.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                for (ReactInstanceEventListener onReactContextInitialized : reactInstanceEventListenerArr) {
                    onReactContextInitialized.onReactContextInitialized(reactApplicationContext);
                }
            }
        });
        Systrace.m42323a(0);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new Runnable() {
            public void run() {
                Process.setThreadPriority(0);
            }
        });
        reactApplicationContext.runOnNativeModulesQueueThread(new Runnable() {
            public void run() {
                Process.setThreadPriority(0);
            }
        });
    }

    public void onHostResume(Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = defaultHardwareBackBtnHandler;
        onHostResume(activity);
    }

    public void postDelayed(Runnable runnable, long j) {
        RNThread rNThread = this.mCreateReactContextThread;
        if (rNThread != null) {
            rNThread.post(runnable, Long.valueOf(j));
        }
    }

    public void removeMessage(int i, Object obj) {
        RNThread rNThread = this.mCreateReactContextThread;
        if (rNThread != null && rNThread.getLooper() != null) {
            rNThread.removeMessage(i, obj);
        }
    }

    public void sendMessageDelayed(Message message, long j) {
        RNThread rNThread = this.mCreateReactContextThread;
        if (rNThread != null && rNThread.getLooper() != null) {
            rNThread.sendMessageDelayed(message, j);
        }
    }

    private void processPackage(ReactPackage reactPackage, NativeModuleRegistryBuilder nativeModuleRegistryBuilder) {
        reactPackage.getClass().getSimpleName();
        boolean z = reactPackage instanceof ReactPackageLogger;
        if (z) {
            ((ReactPackageLogger) reactPackage).startProcessPackage();
        }
        nativeModuleRegistryBuilder.processPackage(reactPackage);
        if (z) {
            ((ReactPackageLogger) reactPackage).endProcessPackage();
        }
    }

    private void recreateReactContextInBackground(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        UiThreadUtil.assertOnUiThread();
        ReactContextInitParams reactContextInitParams = new ReactContextInitParams(javaScriptExecutorFactory, jSBundleLoader);
        if (this.mCreateContextReady) {
            runCreateReactContextOnNewThread(reactContextInitParams);
        } else {
            this.mPendingReactContextInitParams = reactContextInitParams;
        }
    }

    public void post(Runnable runnable, Object obj) {
        RNThread rNThread = this.mCreateReactContextThread;
        if (rNThread != null) {
            rNThread.post(runnable, obj);
        }
    }

    private void attachRootViewToInstance(final ReactRootView reactRootView, CatalystInstance catalystInstance) {
        UIManager uIManager;
        Systrace.m42324a(0, "attachRootViewToInstance");
        if (reactRootView.isFabric()) {
            uIManager = (UIManager) catalystInstance.getJSIModule(UIManager.class);
        } else {
            uIManager = (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        }
        final int addRootView = uIManager.addRootView(reactRootView);
        reactRootView.setRootViewTag(addRootView);
        reactRootView.invokeJSEntryPoint();
        catalystInstance.setRootView(new WeakReference(reactRootView));
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                reactRootView.onAttachedToReactInstance();
            }
        });
        Systrace.m42323a(0);
    }

    private void detachViewFromInstance(ReactRootView reactRootView, CatalystInstance catalystInstance) {
        UiThreadUtil.assertOnUiThread();
        if (reactRootView.isFabric()) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNodeAndRemoveContainer(reactRootView.getId());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(reactRootView.getId());
        }
    }

    /* JADX INFO: finally extract failed */
    public ReactApplicationContext createReactContext(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START);
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.mApplicationContext);
        if (jSBundleLoader != null) {
            reactApplicationContext.setRemoteDebug(jSBundleLoader.mDebugRemote);
        }
        if (this.mUseDeveloperSupport) {
            reactApplicationContext.setNativeModuleCallExceptionHandler(this.mDevSupportManager);
        }
        NativeModuleRegistry processPackages = processPackages(reactApplicationContext, this.mPackages, false);
        if (this.mNativeModuleCallExceptionHandler != null) {
            nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler;
        } else {
            nativeModuleCallExceptionHandler = this.mDevSupportManager;
        }
        Builder nativeModuleCallExceptionHandler2 = new Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(processPackages).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        Systrace.m42324a(0, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            Systrace.m42323a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            if (this.mJSIModulesProvider != null) {
                build.addJSIModules(this.mJSIModulesProvider.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
            }
            if (this.mBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(this.mBridgeIdleDebugListener);
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            build.runJSBundle();
            reactApplicationContext.initializeWithInstance(build);
            return reactApplicationContext;
        } catch (Throwable th) {
            Systrace.m42323a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    public void loadJavaScriptOnCureentContext(final String str, final String str2, final boolean z) {
        try {
            post(new Runnable() {
                public void run() {
                    if (ReactInstanceManager.this.getCurrentReactContext() != null) {
                        ReactInstanceManager.this.getCurrentReactContext().getCatalystInstance().loadJavaScript(str, str2, z);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private NativeModuleRegistry processPackages(ReactApplicationContext reactApplicationContext, List<ReactPackage> list, boolean z) {
        NativeModuleRegistryBuilder nativeModuleRegistryBuilder = new NativeModuleRegistryBuilder(reactApplicationContext, this, this.mLazyNativeModulesEnabled);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.mPackages) {
            if (!z) {
                try {
                    LazyReactPackage[] lazyReactPackageArr = new LazyReactPackage[2];
                    for (ReactPackage reactPackage : list) {
                        if (reactPackage instanceof CoreModulesPackage) {
                            lazyReactPackageArr[0] = (LazyReactPackage) reactPackage;
                        }
                        if (reactPackage instanceof MainReactPackage) {
                            lazyReactPackageArr[1] = (LazyReactPackage) reactPackage;
                        }
                    }
                    nativeModuleRegistryBuilder.addCorePackages(Arrays.asList(lazyReactPackageArr), reactApplicationContext);
                } catch (Throwable th) {
                    Systrace.m42323a(0);
                    throw th;
                } finally {
                    while (true) {
                    }
                }
            }
            for (ReactPackage reactPackage2 : list) {
                if (!z || !this.mPackages.contains(reactPackage2)) {
                    Systrace.m42324a(0, "createAndProcessCustomReactPackage");
                    if (z) {
                        this.mPackages.add(reactPackage2);
                    }
                    processPackage(reactPackage2, nativeModuleRegistryBuilder);
                    Systrace.m42323a(0);
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        Systrace.m42324a(0, "buildNativeModuleRegistry");
        try {
            return nativeModuleRegistryBuilder.build();
        } finally {
            Systrace.m42323a(0);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    public void delayLoadJavaScriptOnCureentContext(final String str, final String str2, final boolean z, long j) {
        try {
            postDelayed(new Runnable() {
                public void run() {
                    if (ReactInstanceManager.this.getCurrentReactContext() != null) {
                        ReactInstanceManager.this.getCurrentReactContext().getCatalystInstance().loadJavaScript(str, str2, z);
                    }
                }
            }, j);
        } catch (Exception unused) {
        }
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, i, i2, intent);
        }
    }

    ReactInstanceManager(Context context, Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<ReactPackage> list, boolean z, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, UIImplementationProvider uIImplementationProvider, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, RedBoxHandler redBoxHandler, boolean z2, boolean z3, boolean z4, DevBundleDownloadListener devBundleDownloadListener, int i, int i2, JSIModulesProvider jSIModulesProvider, RNDegradeExceptionHandler rNDegradeExceptionHandler) {
        Context context2 = context;
        initializeSoLoaderIfNecessary(context);
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        this.mDegradeExceptionHandler = rNDegradeExceptionHandler;
        this.mApplicationContext = context2;
        this.mCurrentActivity = activity;
        this.mDefaultBackButtonImpl = defaultHardwareBackBtnHandler;
        this.mJavaScriptExecutorFactory = javaScriptExecutorFactory;
        this.mBundleLoader = jSBundleLoader;
        this.mJSMainModulePath = str;
        this.mPackages = new ArrayList();
        boolean z5 = z;
        this.mUseDeveloperSupport = z5;
        this.mDevSupportManager = DevSupportManagerFactory.create(context, createDevHelperInterface(), this.mJSMainModulePath, z5, redBoxHandler, devBundleDownloadListener, i);
        this.mBridgeIdleDebugListener = notThreadSafeBridgeIdleDebugListener;
        this.mLifecycleState = lifecycleState;
        this.mMemoryPressureRouter = new MemoryPressureRouter(context);
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        this.mLazyNativeModulesEnabled = z2;
        this.mDelayViewManagerClassLoadsEnabled = z4;
        synchronized (this.mPackages) {
            List<ReactPackage> list2 = this.mPackages;
            CoreModulesPackage coreModulesPackage = new CoreModulesPackage(this, new DefaultHardwareBackBtnHandler() {
                public void invokeDefaultOnBackPressed() {
                    ReactInstanceManager.this.invokeDefaultOnBackPressed();
                }
            }, uIImplementationProvider, z3, i2);
            list2.add(coreModulesPackage);
            if (this.mUseDeveloperSupport) {
                this.mPackages.add(new DebugCorePackage());
            }
            this.mPackages.addAll(list);
        }
        this.mJSIModulesProvider = jSIModulesProvider;
        ReactChoreographer.initialize();
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.startInspector();
        }
        this.mCreateReactContextThread = new RNThread("ReactNativeContextThread", (Callback) this);
    }
}
