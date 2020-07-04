package com.ttnet.org.chromium.base.metrics;

import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public class RecordUserAction {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Throwable sDisabledBy;
    private static long sNativeActionCallback;

    public interface UserActionCallback {
        void onActionRecorded(String str);
    }

    private static native long nativeAddActionCallbackForTesting(UserActionCallback userActionCallback);

    public static native void nativeRecordUserAction(String str);

    private static native void nativeRemoveActionCallbackForTesting(long j);

    public static void removeActionCallbackForTesting() {
        nativeRemoveActionCallbackForTesting(sNativeActionCallback);
        sNativeActionCallback = 0;
    }

    public static void setActionCallbackForTesting(UserActionCallback userActionCallback) {
        sNativeActionCallback = nativeAddActionCallbackForTesting(userActionCallback);
    }

    public static void record(final String str) {
        if (sDisabledBy == null) {
            if (ThreadUtils.runningOnUiThread()) {
                nativeRecordUserAction(str);
            } else {
                ThreadUtils.runOnUiThread((Runnable) new Runnable() {
                    public void run() {
                        RecordUserAction.nativeRecordUserAction(str);
                    }
                });
            }
        }
    }

    public static void setDisabledForTests(boolean z) {
        Throwable th;
        if (!z || sDisabledBy == null) {
            if (z) {
                th = new Throwable();
            } else {
                th = null;
            }
            sDisabledBy = th;
            return;
        }
        throw new IllegalStateException("UserActions are already disabled.", sDisabledBy);
    }
}
