package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.util.RNVersionUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public class ReactContext extends ContextWrapper {
    private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners = new CopyOnWriteArraySet<>();
    private CatalystInstance mCatalystInstance;
    private WeakReference<Activity> mCurrentActivity;
    private RNDegradeExceptionHandler mDegradeExceptionhandle;
    private LayoutInflater mInflater;
    private MessageQueueThread mJSMessageQueueThread;
    private MessageQueueThread mLayoutThread;
    public final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners = new CopyOnWriteArraySet<>();
    private LifecycleState mLifecycleState = LifecycleState.BEFORE_CREATE;
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private MessageQueueThread mNativeModulesMessageQueueThread;
    private boolean mRemoteDebug = false;
    private MessageQueueThread mUiMessageQueueThread;

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mCatalystInstance.getJavaScriptContextHolder();
    }

    public void assertOnJSQueueThread() {
        ((MessageQueueThread) C13854a.m40916b(this.mJSMessageQueueThread)).assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread() {
        ((MessageQueueThread) C13854a.m40916b(this.mNativeModulesMessageQueueThread)).assertIsOnThread();
    }

    public void assertOnUiQueueThread() {
        ((MessageQueueThread) C13854a.m40916b(this.mUiMessageQueueThread)).assertIsOnThread();
    }

    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        if (this.mCatalystInstance != null) {
            this.mCatalystInstance.destroy();
        }
    }

    public CatalystInstance getCatalystInstance() {
        return (CatalystInstance) C13854a.m40916b(this.mCatalystInstance);
    }

    public Activity getCurrentActivity() {
        if (this.mCurrentActivity == null) {
            return null;
        }
        return (Activity) this.mCurrentActivity.get();
    }

    public boolean hasActiveCatalystInstance() {
        if (this.mCatalystInstance == null || this.mCatalystInstance.isDestroyed()) {
            return false;
        }
        return true;
    }

    public boolean hasCurrentActivity() {
        if (this.mCurrentActivity == null || this.mCurrentActivity.get() == null) {
            return false;
        }
        return true;
    }

    public boolean isOnJSQueueThread() {
        return ((MessageQueueThread) C13854a.m40916b(this.mJSMessageQueueThread)).isOnThread();
    }

    public boolean isOnNativeModulesQueueThread() {
        return ((MessageQueueThread) C13854a.m40916b(this.mNativeModulesMessageQueueThread)).isOnThread();
    }

    public boolean isOnUiQueueThread() {
        return ((MessageQueueThread) C13854a.m40916b(this.mUiMessageQueueThread)).isOnThread();
    }

    public void assertOnLayoutThread() {
        if (this.mRemoteDebug) {
            ((MessageQueueThread) C13854a.m40916b(this.mNativeModulesMessageQueueThread)).assertIsOnThread();
        } else {
            ((MessageQueueThread) C13854a.m40916b(this.mLayoutThread)).assertIsOnThread();
        }
    }

    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((LifecycleEventListener) it.next()).onHostDestroy();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        this.mCurrentActivity = null;
    }

    public void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((LifecycleEventListener) it.next()).onHostPause();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    public void setDegradeExceptionhandle(RNDegradeExceptionHandler rNDegradeExceptionHandler) {
        this.mDegradeExceptionhandle = rNDegradeExceptionHandler;
    }

    public void setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
    }

    public void setRemoteDebug(boolean z) {
        this.mRemoteDebug = z;
    }

    public void addActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.add(activityEventListener);
    }

    public void removeActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.remove(activityEventListener);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public void runOnJSQueueThread(Runnable runnable) {
        ((MessageQueueThread) C13854a.m40916b(this.mJSMessageQueueThread)).runOnQueue(runnable);
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        ((MessageQueueThread) C13854a.m40916b(this.mNativeModulesMessageQueueThread)).runOnQueue(runnable);
    }

    public void runOnUiQueueThread(Runnable runnable) {
        ((MessageQueueThread) C13854a.m40916b(this.mUiMessageQueueThread)).runOnQueue(runnable);
    }

    public ReactContext(Context context) {
        super(context);
    }

    public void assertOnNativeModulesQueueThread(String str) {
        ((MessageQueueThread) C13854a.m40916b(this.mNativeModulesMessageQueueThread)).assertIsOnThread(str);
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        if (this.mCatalystInstance != null) {
            return this.mCatalystInstance.getJSModule(cls);
        }
        throw new RuntimeException("Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.");
    }

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (this.mCatalystInstance != null) {
            return this.mCatalystInstance.getNativeModule(cls);
        }
        throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        if (this.mCatalystInstance != null) {
            return this.mCatalystInstance.hasNativeModule(cls);
        }
        throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }

    public void runOnLayoutThread(Runnable runnable) {
        if (this.mRemoteDebug) {
            ((MessageQueueThread) C13854a.m40916b(this.mNativeModulesMessageQueueThread)).runOnQueue(runnable);
        } else {
            ((MessageQueueThread) C13854a.m40916b(this.mLayoutThread)).runOnQueue(runnable);
        }
    }

    public void addLifecycleEventListener(final LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if (hasActiveCatalystInstance()) {
            switch (this.mLifecycleState) {
                case BEFORE_CREATE:
                case BEFORE_RESUME:
                    return;
                case RESUMED:
                    runOnUiQueueThread(new Runnable() {
                        public void run() {
                            if (ReactContext.this.mLifecycleEventListeners.contains(lifecycleEventListener)) {
                                try {
                                    lifecycleEventListener.onHostResume();
                                } catch (RuntimeException e) {
                                    ReactContext.this.handleException(e);
                                }
                            }
                        }
                    });
                    return;
                default:
                    throw new RuntimeException("Unhandled lifecycle state.");
            }
        }
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    public void handleException(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Version", RNVersionUtils.getVersion());
            jSONObject.put("NativeExceptionTitle", "ReactContextHandleException");
            jSONObject.put("NativeExceptionStack", exc.toString());
            ReactBridge.uploadJSException(jSONObject);
        } catch (Exception unused) {
        }
        if (!(this.mCatalystInstance == null || this.mCatalystInstance.isDestroyed() || this.mNativeModuleCallExceptionHandler == null)) {
            this.mNativeModuleCallExceptionHandler.handleException(exc);
        }
        if (this.mDegradeExceptionhandle != null) {
            this.mDegradeExceptionhandle.onDegrade(exc);
        }
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        } else if (this.mCatalystInstance == null) {
            this.mCatalystInstance = catalystInstance;
            ReactQueueConfiguration reactQueueConfiguration = catalystInstance.getReactQueueConfiguration();
            this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
            this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
            this.mJSMessageQueueThread = reactQueueConfiguration.getJSQueueThread();
            this.mLayoutThread = reactQueueConfiguration.getLayoutThread();
        } else {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
    }

    public void onHostResume(Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference<>(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((LifecycleEventListener) it.next()).onHostResume();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    public void onNewIntent(Activity activity, Intent intent) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = new WeakReference<>(activity);
        Iterator it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((ActivityEventListener) it.next()).onNewIntent(intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public boolean startActivityForResult(Intent intent, int i, Bundle bundle) {
        Activity currentActivity = getCurrentActivity();
        C13854a.m40916b(currentActivity);
        currentActivity.startActivityForResult(intent, i, bundle);
        return true;
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Iterator it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((ActivityEventListener) it.next()).onActivityResult(activity, i, i2, intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }
}
