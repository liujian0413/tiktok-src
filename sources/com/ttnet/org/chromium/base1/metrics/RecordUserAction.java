package com.ttnet.org.chromium.base1.metrics;

import com.ttnet.org.chromium.base1.ThreadUtils;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public class RecordUserAction {
    private static boolean sIsDisabledForTests;

    public static void disableForTests() {
        sIsDisabledForTests = true;
    }

    public static native void nativeRecordUserAction(String str);

    public static void record(final String str) {
        if (!sIsDisabledForTests) {
            if (ThreadUtils.runningOnUiThread()) {
                nativeRecordUserAction(str);
            } else {
                ThreadUtils.runOnUiThread((Runnable) new Runnable() {
                    public final void run() {
                        RecordUserAction.nativeRecordUserAction(str);
                    }
                });
            }
        }
    }
}
