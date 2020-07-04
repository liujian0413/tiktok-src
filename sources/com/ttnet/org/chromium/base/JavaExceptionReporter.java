package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.lang.Thread.UncaughtExceptionHandler;

@JNINamespace("base::android")
public class JavaExceptionReporter implements UncaughtExceptionHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final UncaughtExceptionHandler mParent;

    private static native void nativeReportJavaException(boolean z, Throwable th);

    private static native void nativeReportJavaStackTrace(String str);

    public static void reportStackTrace(String str) {
        nativeReportJavaStackTrace(PiiElider.sanitizeStacktrace(str));
    }

    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }

    private JavaExceptionReporter(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.mParent = uncaughtExceptionHandler;
        this.mCrashAfterReport = z;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.mHandlingException) {
            this.mHandlingException = true;
            nativeReportJavaException(this.mCrashAfterReport, th);
        }
        if (this.mParent != null) {
            this.mParent.uncaughtException(thread, th);
        }
    }
}
