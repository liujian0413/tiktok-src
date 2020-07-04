package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.view.Window.Callback;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@JNINamespace("base::android")
public class ApplicationStatus {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Activity sActivity;
    private static final Map<Activity, ActivityInfo> sActivityInfo = Collections.synchronizedMap(new HashMap());
    private static final ObserverList<ApplicationStateListener> sApplicationStateListeners = new ObserverList<>();
    private static int sCurrentApplicationState = 0;
    private static final ObserverList<ActivityStateListener> sGeneralActivityStateListeners = new ObserverList<>();
    public static ApplicationStateListener sNativeApplicationStateListener;
    public static final ObserverList<WindowFocusChangedListener> sWindowFocusListeners = new ObserverList<>();

    static class ActivityInfo {
        private ObserverList<ActivityStateListener> mListeners;
        private int mStatus;

        public ObserverList<ActivityStateListener> getListeners() {
            return this.mListeners;
        }

        public int getStatus() {
            return this.mStatus;
        }

        private ActivityInfo() {
            this.mStatus = 6;
            this.mListeners = new ObserverList<>();
        }

        public void setStatus(int i) {
            this.mStatus = i;
        }
    }

    public interface ActivityStateListener {
        void onActivityStateChange(Activity activity, int i);
    }

    public interface ApplicationStateListener {
        void onApplicationStateChange(int i);
    }

    static class WindowCallbackProxy implements InvocationHandler {
        private final Activity mActivity;
        private final Callback mCallback;

        public void onWindowFocusChanged(boolean z) {
            this.mCallback.onWindowFocusChanged(z);
            Iterator it = ApplicationStatus.sWindowFocusListeners.iterator();
            while (it.hasNext()) {
                ((WindowFocusChangedListener) it.next()).onWindowFocusChanged(this.mActivity, z);
            }
        }

        public WindowCallbackProxy(Activity activity, Callback callback) {
            this.mCallback = callback;
            this.mActivity = activity;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (!method.getName().equals("onWindowFocusChanged") || objArr.length != 1 || !(objArr[0] instanceof Boolean)) {
                try {
                    return method.invoke(this.mCallback, objArr);
                } catch (InvocationTargetException e) {
                    if (e.getCause() instanceof AbstractMethodError) {
                        throw e.getCause();
                    }
                    throw e;
                }
            } else {
                onWindowFocusChanged(objArr[0].booleanValue());
                return null;
            }
        }
    }

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(Activity activity, boolean z);
    }

    private ApplicationStatus() {
    }

    public static Activity getLastTrackedFocusedActivity() {
        return sActivity;
    }

    public static native void nativeOnApplicationStateChange(int i);

    public static boolean isEveryActivityDestroyed() {
        return sActivityInfo.isEmpty();
    }

    public static int getStateForApplication() {
        int i;
        synchronized (sActivityInfo) {
            i = sCurrentApplicationState;
        }
        return i;
    }

    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        if (stateForApplication == 1 || stateForApplication == 2) {
            return true;
        }
        return false;
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (sActivityInfo) {
            if (sCurrentApplicationState != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        ThreadUtils.runOnUiThread((Runnable) new Runnable() {
            public void run() {
                if (ApplicationStatus.sNativeApplicationStateListener == null) {
                    C465931 r0 = new ApplicationStateListener() {
                        public void onApplicationStateChange(int i) {
                            ApplicationStatus.nativeOnApplicationStateChange(i);
                        }
                    };
                    ApplicationStatus.sNativeApplicationStateListener = r0;
                    ApplicationStatus.registerApplicationStateListener(r0);
                }
            }
        });
    }

    public static List<Activity> getRunningActivities() {
        ArrayList arrayList;
        synchronized (sActivityInfo) {
            arrayList = new ArrayList(sActivityInfo.keySet());
        }
        return arrayList;
    }

    public static void destroyForJUnitTests() {
        synchronized (sActivityInfo) {
            sApplicationStateListeners.clear();
            sGeneralActivityStateListeners.clear();
            sActivityInfo.clear();
            sWindowFocusListeners.clear();
            sCurrentApplicationState = 0;
            sActivity = null;
            sNativeApplicationStateListener = null;
        }
    }

    private static int determineApplicationStateLocked() {
        boolean z = false;
        boolean z2 = false;
        for (ActivityInfo status : sActivityInfo.values()) {
            int status2 = status.getStatus();
            if (status2 != 4 && status2 != 5 && status2 != 6) {
                return 1;
            }
            if (status2 == 4) {
                z = true;
            } else if (status2 == 5) {
                z2 = true;
            }
        }
        if (z) {
            return 2;
        }
        if (z2) {
            return 3;
        }
        return 4;
    }

    public static void registerApplicationStateListener(ApplicationStateListener applicationStateListener) {
        sApplicationStateListeners.addObserver(applicationStateListener);
    }

    public static void registerStateListenerForAllActivities(ActivityStateListener activityStateListener) {
        sGeneralActivityStateListeners.addObserver(activityStateListener);
    }

    public static void registerWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        sWindowFocusListeners.addObserver(windowFocusChangedListener);
    }

    public static void unregisterApplicationStateListener(ApplicationStateListener applicationStateListener) {
        sApplicationStateListeners.removeObserver(applicationStateListener);
    }

    public static void unregisterWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        sWindowFocusListeners.removeObserver(windowFocusChangedListener);
    }

    public static int getStateForActivity(Activity activity) {
        if (activity == null) {
            return 6;
        }
        ActivityInfo activityInfo = (ActivityInfo) sActivityInfo.get(activity);
        if (activityInfo != null) {
            return activityInfo.getStatus();
        }
        return 6;
    }

    public static void initialize(Application application) {
        synchronized (sActivityInfo) {
            sCurrentApplicationState = 4;
        }
        registerWindowFocusChangedListener(new WindowFocusChangedListener() {
            public void onWindowFocusChanged(Activity activity, boolean z) {
                if (z && activity != ApplicationStatus.sActivity) {
                    int stateForActivity = ApplicationStatus.getStateForActivity(activity);
                    if (!(stateForActivity == 6 || stateForActivity == 5)) {
                        ApplicationStatus.sActivity = activity;
                    }
                }
            }
        });
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            static final /* synthetic */ boolean $assertionsDisabled = false;

            static {
                Class<ApplicationStatus> cls = ApplicationStatus.class;
            }

            public void onActivityDestroyed(Activity activity) {
                ApplicationStatus.onStateChange(activity, 6);
                checkCallback(activity);
            }

            public void onActivityPaused(Activity activity) {
                ApplicationStatus.onStateChange(activity, 4);
                checkCallback(activity);
            }

            public void onActivityResumed(Activity activity) {
                ApplicationStatus.onStateChange(activity, 3);
                checkCallback(activity);
            }

            public void onActivityStarted(Activity activity) {
                ApplicationStatus.onStateChange(activity, 2);
                checkCallback(activity);
            }

            public void onActivityStopped(Activity activity) {
                ApplicationStatus.onStateChange(activity, 5);
                checkCallback(activity);
            }

            private void checkCallback(Activity activity) {
                if (BuildConfig.DCHECK_IS_ON) {
                    activity.getWindow().getCallback().getClass();
                }
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                checkCallback(activity);
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                ApplicationStatus.onStateChange(activity, 1);
                Callback callback = activity.getWindow().getCallback();
                activity.getWindow().setCallback((Callback) Proxy.newProxyInstance(Callback.class.getClassLoader(), new Class[]{Callback.class}, new WindowCallbackProxy(activity, callback)));
            }
        });
    }

    public static void unregisterActivityStateListener(ActivityStateListener activityStateListener) {
        sGeneralActivityStateListeners.removeObserver(activityStateListener);
        synchronized (sActivityInfo) {
            for (ActivityInfo listeners : sActivityInfo.values()) {
                listeners.getListeners().removeObserver(activityStateListener);
            }
        }
    }

    public static void onStateChangeForTesting(Activity activity, int i) {
        onStateChange(activity, i);
    }

    public static void registerStateListenerForActivity(ActivityStateListener activityStateListener, Activity activity) {
        ((ActivityInfo) sActivityInfo.get(activity)).getListeners().addObserver(activityStateListener);
    }

    public static void onStateChange(Activity activity, int i) {
        ActivityInfo activityInfo;
        if (activity != null) {
            if (sActivity == null || i == 1 || i == 3 || i == 2) {
                sActivity = activity;
            }
            int stateForApplication = getStateForApplication();
            synchronized (sActivityInfo) {
                if (i == 1) {
                    sActivityInfo.put(activity, new ActivityInfo());
                }
                activityInfo = (ActivityInfo) sActivityInfo.get(activity);
                activityInfo.setStatus(i);
                if (i == 6) {
                    sActivityInfo.remove(activity);
                    if (activity == sActivity) {
                        sActivity = null;
                    }
                }
                sCurrentApplicationState = determineApplicationStateLocked();
            }
            Iterator it = activityInfo.getListeners().iterator();
            while (it.hasNext()) {
                ((ActivityStateListener) it.next()).onActivityStateChange(activity, i);
            }
            Iterator it2 = sGeneralActivityStateListeners.iterator();
            while (it2.hasNext()) {
                ((ActivityStateListener) it2.next()).onActivityStateChange(activity, i);
            }
            int stateForApplication2 = getStateForApplication();
            if (stateForApplication2 != stateForApplication) {
                Iterator it3 = sApplicationStateListeners.iterator();
                while (it3.hasNext()) {
                    ((ApplicationStateListener) it3.next()).onApplicationStateChange(stateForApplication2);
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("null activity is not supported");
    }
}
