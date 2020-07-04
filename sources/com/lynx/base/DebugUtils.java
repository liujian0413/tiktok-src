package com.lynx.base;

import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;

public class DebugUtils {
    public static native void nativeCheckMemoryLeak();

    public static void checkMemoryLeak() {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    Thread.sleep(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                } catch (InterruptedException unused) {
                }
                DebugUtils.nativeCheckMemoryLeak();
            }
        }).start();
    }
}
