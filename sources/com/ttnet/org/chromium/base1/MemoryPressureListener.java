package com.ttnet.org.chromium.base1;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;

public class MemoryPressureListener {
    public static native void nativeOnMemoryPressure(int i);

    private static void registerSystemCallback(Context context) {
        context.registerComponentCallbacks(new ComponentCallbacks2() {
            public final void onConfigurationChanged(Configuration configuration) {
            }

            public final void onLowMemory() {
                MemoryPressureListener.nativeOnMemoryPressure(2);
            }

            public final void onTrimMemory(int i) {
                MemoryPressureListener.maybeNotifyMemoryPresure(i);
            }
        });
    }

    private static void simulateLowMemoryPressureSignal(Activity activity) {
        activity.getApplication().onLowMemory();
        activity.onLowMemory();
    }

    public static void maybeNotifyMemoryPresure(int i) {
        if (i >= 80) {
            nativeOnMemoryPressure(2);
            return;
        }
        if (i >= 40 || i == 15) {
            nativeOnMemoryPressure(1);
        }
    }

    private static void simulateTrimMemoryPressureSignal(Activity activity, int i) {
        activity.getApplication().onTrimMemory(i);
        activity.onTrimMemory(i);
    }

    public static boolean handleDebugIntent(Activity activity, String str) {
        if ("org.chromium.base.ACTION_LOW_MEMORY".equals(str)) {
            simulateLowMemoryPressureSignal(activity);
        } else if ("org.chromium.base.ACTION_TRIM_MEMORY".equals(str)) {
            simulateTrimMemoryPressureSignal(activity, 80);
        } else if ("org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL".equals(str)) {
            simulateTrimMemoryPressureSignal(activity, 15);
        } else if (!"org.chromium.base.ACTION_TRIM_MEMORY_MODERATE".equals(str)) {
            return false;
        } else {
            simulateTrimMemoryPressureSignal(activity, 60);
        }
        return true;
    }
}
