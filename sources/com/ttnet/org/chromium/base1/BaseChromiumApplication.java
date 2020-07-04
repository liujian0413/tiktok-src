package com.ttnet.org.chromium.base1;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.Window.Callback;
import com.ttnet.org.chromium.base1.multidex.ChromiumMultiDexInstaller;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;

public class BaseChromiumApplication extends Application {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mShouldInitializeApplicationStatusTracking;
    public ObserverList<WindowFocusChangedListener> mWindowFocusListeners;

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(Activity activity, boolean z);
    }

    class WindowCallbackProxy implements InvocationHandler {
        private final Activity mActivity;
        private final Callback mCallback;

        public void onWindowFocusChanged(boolean z) {
            this.mCallback.onWindowFocusChanged(z);
            Iterator it = BaseChromiumApplication.this.mWindowFocusListeners.iterator();
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

    public void initCommandLine() {
    }

    public BaseChromiumApplication() {
        this(true);
    }

    private void startTrackingApplicationStatus() {
        ApplicationStatus.initialize(this);
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivityPaused(Activity activity) {
            }

            public void onActivityResumed(Activity activity) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
            }

            public void onActivityStopped(Activity activity) {
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                Callback callback = activity.getWindow().getCallback();
                activity.getWindow().setCallback((Callback) Proxy.newProxyInstance(Callback.class.getClassLoader(), new Class[]{Callback.class}, new WindowCallbackProxy(activity, callback)));
            }
        });
    }

    public void onCreate() {
        super.onCreate();
        if (this.mShouldInitializeApplicationStatusTracking) {
            startTrackingApplicationStatus();
        }
    }

    private void checkAppBeingReplaced() {
        if (getResources() == null) {
            Log.m22891e("base", "getResources() null, closing app.", new Object[0]);
            System.exit(0);
        }
    }

    public void registerWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        this.mWindowFocusListeners.addObserver(windowFocusChangedListener);
    }

    public void unregisterWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        this.mWindowFocusListeners.removeObserver(windowFocusChangedListener);
    }

    protected BaseChromiumApplication(boolean z) {
        this.mWindowFocusListeners = new ObserverList<>();
        this.mShouldInitializeApplicationStatusTracking = z;
    }

    public static void initCommandLine(Context context) {
        ((BaseChromiumApplication) context.getApplicationContext()).initCommandLine();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        checkAppBeingReplaced();
        ChromiumMultiDexInstaller.install(this);
    }
}
