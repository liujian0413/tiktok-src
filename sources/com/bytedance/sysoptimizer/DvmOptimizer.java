package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build.VERSION;

public class DvmOptimizer {
    private DvmOptimizer() {
    }

    private static native void optLinearAllocBuffer();

    private static native void startHookDvmFunc();

    public static void hookDvmLinearAllocFunc(Context context) {
        if (loadOptimizerOnNeed(context)) {
            startHookDvmFunc();
        }
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (VERSION.SDK_INT <= 19) {
            return Optimizer.loadOptimizerLibrary(context);
        }
        return false;
    }

    public static void optDvmLinearAllocBuffer(Context context) {
        if (loadOptimizerOnNeed(context)) {
            optLinearAllocBuffer();
        }
    }
}
