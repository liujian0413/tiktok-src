package com.facebook.react.util;

import java.util.ArrayList;
import java.util.List;

public class RNLogUtils {
    private static List<LogWatcher> logWatcherList = new ArrayList();
    private static LogLevel uploadLevel = LogLevel.ANDROID_LOG_ERROR;

    enum LogLevel {
        ANDROID_LOG_UNKNOWN,
        ANDROID_LOG_DEFAULT,
        ANDROID_LOG_VERBOSE,
        ANDROID_LOG_DEBUG,
        ANDROID_LOG_INFO,
        ANDROID_LOG_WARN,
        ANDROID_LOG_ERROR,
        ANDROID_LOG_FATAL,
        ANDROID_LOG_SILENT
    }

    public interface LogWatcher {
        void onLog(String str, String str2);
    }

    /* renamed from: d */
    public static void m41798d(String str) {
        m41799d("RNLogUtils", str);
    }

    /* renamed from: e */
    public static void m41801e(String str) {
        m41802e("RNLogUtils", str);
    }

    /* renamed from: i */
    public static void m41803i(String str) {
        m41804i("RNLogUtils", str);
    }

    /* renamed from: v */
    public static void m41805v(String str) {
        m41806v("RNLogUtils", str);
    }

    /* renamed from: w */
    public static void m41807w(String str) {
        m41808w("RNLogUtils", str);
    }

    public static void setLogWatcher(LogWatcher logWatcher) {
        if (logWatcherList != null && !logWatcherList.contains(logWatcher)) {
            logWatcherList.add(logWatcher);
        }
    }

    /* renamed from: d */
    public static void m41799d(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_DEBUG.ordinal(), str, str2);
    }

    /* renamed from: e */
    public static void m41802e(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_ERROR.ordinal(), str, str2);
    }

    /* renamed from: i */
    public static void m41804i(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_INFO.ordinal(), str, str2);
    }

    /* renamed from: v */
    public static void m41806v(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_VERBOSE.ordinal(), str, str2);
    }

    /* renamed from: w */
    public static void m41808w(String str, String str2) {
        LogPrintWithTag(LogLevel.ANDROID_LOG_WARN.ordinal(), str, str2);
    }

    /* renamed from: d */
    public static void m41800d(String str, byte[] bArr) {
        m41799d(str, new String(bArr));
    }

    public static void LogPrint(int i, String str) {
        if (i >= uploadLevel.ordinal() && logWatcherList != null && logWatcherList.size() > 0) {
            for (LogWatcher onLog : logWatcherList) {
                onLog.onLog("RNLogUtils", str);
            }
        }
    }

    public static void LogPrintWithTag(int i, String str, String str2) {
        if (i >= uploadLevel.ordinal() && logWatcherList != null && logWatcherList.size() > 0) {
            for (LogWatcher onLog : logWatcherList) {
                onLog.onLog(str, str2);
            }
        }
    }
}
