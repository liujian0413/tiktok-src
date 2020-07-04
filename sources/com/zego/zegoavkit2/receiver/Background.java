package com.zego.zegoavkit2.receiver;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Background implements ActivityLifecycleCallbacks {
    private static Callback becameBackground = new Callback() {
        public final void invoke(Listener listener) {
            listener.onBecameBackground();
        }
    };
    private static Callback becameForeground = new Callback() {
        public final void invoke(Listener listener) {
            listener.onBecameForeground();
        }
    };
    private static Background instance = new Background();
    private Application application;
    private boolean background;
    private Runnable check;
    private WeakReference<Activity> currentActivity;
    private Handler handler = new Handler(Looper.getMainLooper());
    private Listeners listeners = new Listeners();

    public interface Binding {
        void unbind();
    }

    interface Callback {
        void invoke(Listener listener);
    }

    public interface Listener {
        void onBecameBackground();

        void onBecameForeground();
    }

    static class Listeners {
        public List<WeakReference<Listener>> listeners;

        private Listeners() {
            this.listeners = new CopyOnWriteArrayList();
        }

        public Binding add(Listener listener) {
            final WeakReference weakReference = new WeakReference(listener);
            this.listeners.add(weakReference);
            return new Binding() {
                public void unbind() {
                    Listeners.this.listeners.remove(weakReference);
                }
            };
        }

        public void each(Callback callback) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference weakReference : this.listeners) {
                try {
                    Listener listener = (Listener) weakReference.get();
                    if (listener != null) {
                        callback.invoke(listener);
                    } else {
                        arrayList.add(weakReference);
                    }
                } catch (Exception unused) {
                }
            }
            if (!arrayList.isEmpty()) {
                this.listeners.removeAll(arrayList);
            }
        }
    }

    public static Background get() {
        return instance;
    }

    public boolean isBackground() {
        return this.background;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public boolean isForeground() {
        if (!this.background) {
            return true;
        }
        return false;
    }

    public Background uninit() {
        if (this.application != null) {
            this.application.unregisterActivityLifecycleCallbacks(this);
            this.application = null;
        }
        return this;
    }

    Background() {
    }

    public Binding addListener(Listener listener) {
        return this.listeners.add(listener);
    }

    public Background init(Application application2) {
        uninit();
        this.application = application2;
        this.application.registerActivityLifecycleCallbacks(this);
        return this;
    }

    public void onActivityStopped(Activity activity) {
        if (this.check != null) {
            this.handler.removeCallbacks(this.check);
        }
        onActivityCeased(activity);
    }

    public void onActivityPaused(Activity activity) {
        if (!activity.isChangingConfigurations()) {
            final WeakReference weakReference = new WeakReference(activity);
            Handler handler2 = this.handler;
            C472623 r1 = new Runnable() {
                public void run() {
                    Background.this.onActivityCeased((Activity) weakReference.get());
                }
            };
            this.check = r1;
            handler2.postDelayed(r1, 2000);
        }
    }

    public void onActivityCeased(Activity activity) {
        if (this.background) {
            return;
        }
        if ((this.currentActivity == null || activity == this.currentActivity.get()) && activity != null && !activity.isChangingConfigurations()) {
            this.background = true;
            this.listeners.each(becameBackground);
        }
    }

    public void onActivityStarted(Activity activity) {
        this.currentActivity = new WeakReference<>(activity);
        if (this.check != null) {
            this.handler.removeCallbacks(this.check);
        }
        if (this.background && activity != null && !activity.isChangingConfigurations()) {
            this.background = false;
            this.listeners.each(becameForeground);
        }
    }
}
