package com.p280ss.avframework.utils;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.avframework.engine.MediaEngineFactory;
import java.io.File;
import java.io.IOException;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.utils.Monitor */
public class Monitor {
    private static boolean sInitLogDone;

    protected static native void nativeDisableLogFile(boolean z);

    protected static native double nativeGetAppPrecentageOnCPU();

    protected static native long nativeGetAppRSSKB();

    protected static native long nativeGetAppVSSKB();

    protected static native double nativeGetCPUPrecentage();

    protected static native double nativeGetSystemPrecentageOnCPU();

    protected static native double nativeGetUserPrecentageOnCPU();

    protected static native boolean nativeInitLogFile(String str, int i);

    protected static native boolean nativeIsDisableLogFile();

    protected static native void nativeWriteLog(String str, int i, String str2);

    public Monitor() {
        MediaEngineFactory.getVersion();
    }

    protected static boolean isDisableLogFile() {
        return nativeIsDisableLogFile();
    }

    public long getAppRSSKB() {
        return nativeGetAppRSSKB();
    }

    public long getAppVSSKB() {
        return nativeGetAppVSSKB();
    }

    public double getAppPrecentageOnCPU() {
        return nativeGetAppPrecentageOnCPU() * 100.0d;
    }

    public double getCPUPrecentage() {
        return nativeGetCPUPrecentage() * 100.0d;
    }

    public double getSystemPrecentageOnCPU() {
        return nativeGetSystemPrecentageOnCPU() * 100.0d;
    }

    public double getUserPrecentageOnCPU() {
        return nativeGetUserPrecentageOnCPU() * 100.0d;
    }

    protected static void disableLogFile(boolean z) {
        nativeDisableLogFile(z);
    }

    protected static void initLogFile(Context context, int i) {
        if (context != null) {
            if (sInitLogDone) {
                nativeInitLogFile("", i);
                return;
            }
            String str = null;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (!externalFilesDir.exists()) {
                try {
                    externalFilesDir.createNewFile();
                } catch (IOException unused) {
                }
            }
            if (externalFilesDir.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append(externalFilesDir.getAbsolutePath());
                sb.append("/live_core.bin");
                String sb2 = sb.toString();
                File file = new File(sb2);
                if (file.exists()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(externalFilesDir.getAbsolutePath());
                    sb3.append("/live_core.old.bin");
                    try {
                        file.renameTo(new File(sb3.toString()));
                    } catch (Throwable unused2) {
                    }
                    file = new File(sb2);
                }
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException unused3) {
                    }
                }
                str = sb2;
            }
            if (!TextUtils.isEmpty(str)) {
                sInitLogDone = nativeInitLogFile(str, i);
            }
        }
    }

    public static void writeLog(String str, int i, String str2) {
        nativeWriteLog(str, i, str2);
    }
}
