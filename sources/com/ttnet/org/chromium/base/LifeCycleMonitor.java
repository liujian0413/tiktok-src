package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.ttnet.org.chromium.base.WeakHandler.IHandler;
import java.lang.reflect.Field;
import java.util.Map;

public class LifeCycleMonitor implements ActivityLifecycleCallbacks {
    public static boolean mAppAlive;
    private static WeakHandler sHandler = new WeakHandler(Looper.getMainLooper(), new IHandler() {
        public void handleMsg(Message message) {
        }
    });
    public AppStateListener mListener;
    private Runnable mRunnable = new Runnable() {
        public void run() {
            if (LifeCycleMonitor.mAppAlive) {
                LifeCycleMonitor.mAppAlive = false;
                if (LifeCycleMonitor.this.mListener != null) {
                    LifeCycleMonitor.this.mListener.onEnterToBackground();
                }
            }
        }
    };

    public interface AppStateListener {
        void onEnterToBackground();

        void onEnterToForeground();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public LifeCycleMonitor() {
        if (getActivity() != null) {
            mAppAlive = true;
        }
    }

    public static Activity getActivity() {
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            for (Object next : map.values()) {
                Class cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(next);
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void setAppStateChangedListener(AppStateListener appStateListener) {
        this.mListener = appStateListener;
    }

    public void onActivityPaused(Activity activity) {
        if (mAppAlive) {
            sHandler.postDelayed(this.mRunnable, 30000);
        }
    }

    public void onActivityResumed(Activity activity) {
        if (!mAppAlive) {
            mAppAlive = true;
            if (this.mListener != null) {
                this.mListener.onEnterToForeground();
            }
        }
        sHandler.removeCallbacks(this.mRunnable);
    }
}
