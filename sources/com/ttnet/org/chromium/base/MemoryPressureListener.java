package com.ttnet.org.chromium.base;

import android.app.Activity;
import com.ttnet.org.chromium.base.memory.MemoryPressureCallback;
import java.util.Iterator;

public class MemoryPressureListener {
    private static final ObserverList<MemoryPressureCallback> sCallbacks = new ObserverList<>();

    /* access modifiers changed from: private */
    public static native void nativeOnMemoryPressure(int i);

    private static void addNativeCallback() {
        addCallback(MemoryPressureListener$$Lambda$0.$instance);
    }

    public static void addCallback(MemoryPressureCallback memoryPressureCallback) {
        sCallbacks.addObserver(memoryPressureCallback);
    }

    public static void removeCallback(MemoryPressureCallback memoryPressureCallback) {
        sCallbacks.removeObserver(memoryPressureCallback);
    }

    private static void simulateLowMemoryPressureSignal(Activity activity) {
        activity.getApplication().onLowMemory();
        activity.onLowMemory();
    }

    public static void notifyMemoryPressure(int i) {
        Iterator it = sCallbacks.iterator();
        while (it.hasNext()) {
            ((MemoryPressureCallback) it.next()).onPressure(i);
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
