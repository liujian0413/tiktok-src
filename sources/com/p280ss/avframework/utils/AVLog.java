package com.p280ss.avframework.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.p280ss.avframework.engine.MediaEngineFactory;
import com.p280ss.avframework.utils.EarlyAVLog.IEarlyLogPrint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.utils.AVLog */
public class AVLog {
    private static boolean mDisableLogFile = false;
    private static ILogFilter mLogConsoleFilter;
    private static ILogFilter mLogIODeviceFilter;
    private static ILogFilter mLogKibanaDeviceFilter;
    private static int mLogLevel = 5;
    private static Map<String, Integer> sRedundancyCount = new ConcurrentHashMap();
    private static Map<String, Long> sRedundancyMap = new ConcurrentHashMap();

    /* renamed from: com.ss.avframework.utils.AVLog$ILogFilter */
    public interface ILogFilter {
        void print(int i, String str, String str2, Throwable th);
    }

    public static ILogFilter getConsoleFilter() {
        return mLogConsoleFilter;
    }

    public static ILogFilter getLogIODevice() {
        return mLogIODeviceFilter;
    }

    public static ILogFilter getLogKibanaDevice() {
        return mLogKibanaDeviceFilter;
    }

    private static native void nativePrintln(int i, String str, String str2);

    private static native void nativeSetPrintLevel(int i);

    public static boolean isDisableLogFile() {
        boolean isDisableLogFile = Monitor.isDisableLogFile();
        mDisableLogFile = isDisableLogFile;
        return isDisableLogFile;
    }

    public static boolean isLogConsoleSet() {
        if (mLogConsoleFilter != null) {
            return true;
        }
        return false;
    }

    public static boolean isLogIODeviceSet() {
        if (mLogIODeviceFilter != null) {
            return true;
        }
        return false;
    }

    public static boolean isLogKibanaDeviceSet() {
        if (mLogKibanaDeviceFilter != null) {
            return true;
        }
        return false;
    }

    static {
        MediaEngineFactory.loadLibrary();
        final IEarlyLogPrint earlyLogPrint = EarlyAVLog.getEarlyLogPrint();
        if (earlyLogPrint != null) {
            mLogIODeviceFilter = new ILogFilter() {
                public final void print(int i, String str, String str2, Throwable th) {
                    earlyLogPrint.print(i, str, str2, th);
                }
            };
        }
    }

    public static String getLogDeRedundancyString() {
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder();
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setLevel(int i) {
        mLogLevel = i;
        nativeSetPrintLevel(i);
    }

    public static ILogFilter setupConsole(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogConsoleFilter;
        mLogConsoleFilter = iLogFilter;
        return iLogFilter2;
    }

    public static ILogFilter setupLogIODevice(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogIODeviceFilter;
        mLogIODeviceFilter = iLogFilter;
        return iLogFilter2;
    }

    public static ILogFilter setupLogKibanaDevice(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogKibanaDeviceFilter;
        mLogKibanaDeviceFilter = iLogFilter;
        return iLogFilter2;
    }

    public static void disableLogFile(boolean z) {
        if (z && !mDisableLogFile) {
            Exception exc = new Exception("Disable log file with record call path.");
            StringBuilder sb = new StringBuilder("Cause: ");
            sb.append(exc.getMessage());
            sb.append("\n");
            sb.append(Log.getStackTraceString(exc));
            Monitor.writeLog("AVLog", 3, sb.toString());
        }
        Monitor.disableLogFile(z);
        mDisableLogFile = z;
    }

    public static void initLogFile(Context context, int i) {
        Monitor.initLogFile(context, i);
    }

    /* renamed from: d */
    public static void m143696d(String str, String str2) {
        nativePrintln(3, str, str2);
    }

    /* renamed from: e */
    public static void m143697e(String str, String str2) {
        nativePrintln(6, str, str2);
    }

    /* renamed from: i */
    public static void m143698i(String str, String str2) {
        nativePrintln(4, str, str2);
    }

    public static void iod(String str, String str2) {
        logToIODevice(3, str, str2, null);
    }

    public static void ioe(String str, String str2) {
        logToIODevice(6, str, str2, null);
    }

    public static void ioi(String str, String str2) {
        logToIODevice(4, str, str2, null);
    }

    public static void iov(String str, String str2) {
        logToIODevice(2, str, str2, null);
    }

    public static void iow(String str, String str2) {
        logToIODevice(5, str, str2, null);
    }

    /* renamed from: v */
    public static void m143699v(String str, String str2) {
        nativePrintln(2, str, str2);
    }

    /* renamed from: w */
    public static void m143700w(String str, String str2) {
        nativePrintln(5, str, str2);
    }

    private static int checkRedundancy(String str, int i) {
        int i2;
        if (TextUtils.isEmpty(str) || i <= 0) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        if (sRedundancyMap.containsKey(str)) {
            j = ((Long) sRedundancyMap.get(str)).longValue();
        }
        if (sRedundancyCount.containsKey(str)) {
            i2 = ((Integer) sRedundancyCount.get(str)).intValue();
        } else {
            i2 = 0;
        }
        if (currentTimeMillis - j >= ((long) i)) {
            sRedundancyMap.put(str, Long.valueOf(currentTimeMillis));
            sRedundancyCount.put(str, Integer.valueOf(0));
        } else {
            sRedundancyCount.put(str, Integer.valueOf(i2 + 1));
            i2 = -1;
        }
        return i2;
    }

    public static void ioe(String str, String str2, Exception exc) {
        logToIODevice(6, str, str2, exc);
    }

    public static void logKibana(int i, String str, String str2, Exception exc) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(i, str, str2, exc);
        } else {
            logToIODevice(i, str, str2, exc);
        }
    }

    public static void logToConsole(int i, String str, String str2, Throwable th) {
        if (i >= mLogLevel) {
            ILogFilter iLogFilter = mLogConsoleFilter;
            if (iLogFilter != null) {
                iLogFilter.print(i, str, str2, th);
                return;
            }
            switch (i) {
                case 2:
                    return;
                case 3:
                    return;
                case 4:
                    return;
                case 5:
                    return;
                case 6:
                    return;
                case 7:
                    Log.wtf(str, str2, th);
                    break;
            }
        }
    }

    public static void logToIODevice(int i, String str, String str2, Throwable th) {
        String str3;
        if (!mDisableLogFile) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            if (th != null) {
                str3 = Log.getStackTraceString(th);
            } else {
                str3 = "";
            }
            sb.append(str3);
            Monitor.writeLog(str, i, sb.toString());
        }
        ILogFilter iLogFilter = mLogIODeviceFilter;
        if (iLogFilter != null) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(i);
            sb2.append("] ");
            sb2.append(str2);
            iLogFilter.print(5, str, sb2.toString(), th);
            return;
        }
        logToConsole(i, str, str2, th);
    }

    public static void logToIODevice2(int i, String str, String str2, Throwable th, String str3, int i2) {
        int checkRedundancy = checkRedundancy(str3, i2);
        if (checkRedundancy >= 0) {
            if (checkRedundancy > 0) {
                StringBuilder sb = new StringBuilder("[repeat ");
                sb.append(checkRedundancy);
                sb.append(" times] ");
                sb.append(str2);
                str2 = sb.toString();
            }
            logToIODevice(i, str, str2, th);
        }
    }
}
