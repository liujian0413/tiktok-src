package com.kakao.auth.helper;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public class DefaultCurrentActivityProvider implements CurrentActivityProvider {
    public Activity currentActivity;

    public Activity getCurrentActivity() {
        return this.currentActivity;
    }

    DefaultCurrentActivityProvider(Application application) {
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
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

            public void onActivityResumed(Activity activity) {
                DefaultCurrentActivityProvider.this.currentActivity = activity;
            }

            public void onActivityPaused(Activity activity) {
                if (activity != null && activity.equals(DefaultCurrentActivityProvider.this.currentActivity)) {
                    DefaultCurrentActivityProvider.this.currentActivity = null;
                }
            }
        });
    }
}
