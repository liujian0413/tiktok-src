package com.facebook.react;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.ReactInstanceManager.ReactInstanceEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class HeadlessJsTaskService extends Service implements HeadlessJsTaskEventListener {
    private static WakeLock sWakeLock;
    public final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();

    /* access modifiers changed from: protected */
    public HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        return null;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onHeadlessJsTaskStart(int i) {
    }

    /* access modifiers changed from: protected */
    public ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getApplication()).getReactNativeHost();
    }

    public void onDestroy() {
        super.onDestroy();
        if (getReactNativeHost().hasInstance()) {
            ReactContext currentReactContext = getReactNativeHost().getReactInstanceManager().getCurrentReactContext();
            if (currentReactContext != null) {
                HeadlessJsTaskContext.getInstance(currentReactContext).removeTaskEventListener(this);
            }
        }
        if (sWakeLock != null) {
            sWakeLock.release();
        }
    }

    public void onHeadlessJsTaskFinish(int i) {
        this.mActiveTasks.remove(Integer.valueOf(i));
        if (this.mActiveTasks.size() == 0) {
            stopSelf();
        }
    }

    public static void acquireWakeLockNow(Context context) {
        if (sWakeLock == null || !sWakeLock.isHeld()) {
            WakeLock newWakeLock = ((PowerManager) C13854a.m40916b((PowerManager) context.getSystemService("power"))).newWakeLock(1, HeadlessJsTaskService.class.getSimpleName());
            sWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            sWakeLock.acquire();
        }
    }

    /* access modifiers changed from: protected */
    public void startTask(final HeadlessJsTaskConfig headlessJsTaskConfig) {
        UiThreadUtil.assertOnUiThread();
        acquireWakeLockNow(this);
        final ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        if (currentReactContext == null) {
            reactInstanceManager.addReactInstanceEventListener(new ReactInstanceEventListener() {
                public void onReactContextInitialized(ReactContext reactContext) {
                    HeadlessJsTaskService.this.invokeStartTask(reactContext, headlessJsTaskConfig);
                    reactInstanceManager.removeReactInstanceEventListener(this);
                }
            });
            if (!reactInstanceManager.hasStartedCreatingInitialContext()) {
                reactInstanceManager.createReactContextInBackground();
            }
        } else {
            invokeStartTask(currentReactContext, headlessJsTaskConfig);
        }
    }

    public void invokeStartTask(ReactContext reactContext, final HeadlessJsTaskConfig headlessJsTaskConfig) {
        final HeadlessJsTaskContext instance = HeadlessJsTaskContext.getInstance(reactContext);
        instance.addTaskEventListener(this);
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                HeadlessJsTaskService.this.mActiveTasks.add(Integer.valueOf(instance.startTask(headlessJsTaskConfig)));
            }
        });
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        HeadlessJsTaskConfig taskConfig = getTaskConfig(intent);
        if (taskConfig == null) {
            return 2;
        }
        startTask(taskConfig);
        return 3;
    }
}
