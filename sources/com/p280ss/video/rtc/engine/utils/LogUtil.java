package com.p280ss.video.rtc.engine.utils;

import android.os.Environment;
import com.C1642a;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.video.rtc.engine.utils.LogUtil */
public class LogUtil {
    private static String sDeviceID = null;
    private static String sLogDir;
    private static RtcLogLevel sLogLevel = RtcLogLevel.RTC_LOG_LEVEL_INFO;
    private static AtomicReference<LoggerSink> sLoggerSink = new AtomicReference<>();

    /* renamed from: com.ss.video.rtc.engine.utils.LogUtil$LoggerSink */
    public interface LoggerSink {
        void onLoggerMessage(RtcLogLevel rtcLogLevel, String str, Throwable th);
    }

    public static String getDeviceID() {
        return sDeviceID;
    }

    public static String getLogDir() {
        return sLogDir;
    }

    public static RtcLogLevel getLogLevel() {
        return sLogLevel;
    }

    public static void setDebug(boolean z) {
    }

    private static LoggerSink getLoggerSink() {
        return (LoggerSink) sLoggerSink.get();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separator);
        sb.append("RTCEngine");
        sb.append(File.separator);
        sb.append("Log");
        sb.append(File.separator);
        sb.append("logs");
        sLogDir = sb.toString();
    }

    private static String getTraceInfo() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ThreadName:");
        stringBuffer.append(Thread.currentThread().getName());
        stringBuffer.append("] [");
        stringBuffer.append(new Throwable().getStackTrace()[2].getFileName());
        stringBuffer.append(":");
        stringBuffer.append(new Throwable().getStackTrace()[2].getLineNumber());
        stringBuffer.append("] [");
        stringBuffer.append("Func:");
        stringBuffer.append(new Throwable().getStackTrace()[2].getMethodName());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static void setDeviceID(String str) {
        sDeviceID = str;
    }

    public static void setLogLevel(RtcLogLevel rtcLogLevel) {
        sLogLevel = rtcLogLevel;
    }

    public static void setLogDir(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append("logs");
        sLogDir = sb.toString();
    }

    public static void setLoggerSink(LoggerSink loggerSink) {
        if (loggerSink != null) {
            sLoggerSink.set(loggerSink);
        } else {
            sLoggerSink.compareAndSet(getLoggerSink(), null);
        }
    }

    /* renamed from: d */
    public static void m145278d(String str, String str2) {
        if (RtcLogLevel.RTC_LOG_LEVEL_DEBUG.compareTo(sLogLevel) >= 0) {
            String a = C1642a.m8034a("[%s] %s [msg:%s]", new Object[]{"DEBUG", getTraceInfo(), str2});
            notifyLoggerSinks(RtcLogLevel.RTC_LOG_LEVEL_DEBUG, C1642a.m8034a("[%s:%s]:%s", new Object[]{"BYTERTC", str, a}), null);
        }
    }

    /* renamed from: e */
    public static void m145279e(String str, String str2) {
        if (RtcLogLevel.RTC_LOG_LEVEL_ERROR.compareTo(sLogLevel) >= 0) {
            String a = C1642a.m8034a("[%s] %s [msg:%s]", new Object[]{"ERROR", getTraceInfo(), str2});
            notifyLoggerSinks(RtcLogLevel.RTC_LOG_LEVEL_ERROR, C1642a.m8034a("[%s:%s]:%s", new Object[]{"BYTERTC", str, a}), null);
        }
    }

    /* renamed from: i */
    public static void m145281i(String str, String str2) {
        if (RtcLogLevel.RTC_LOG_LEVEL_INFO.compareTo(sLogLevel) >= 0) {
            String a = C1642a.m8034a("[%s] %s [msg:%s]", new Object[]{"INFO", getTraceInfo(), str2});
            notifyLoggerSinks(RtcLogLevel.RTC_LOG_LEVEL_INFO, C1642a.m8034a("[%s:%s]:%s", new Object[]{"BYTERTC", str, a}), null);
        }
    }

    /* renamed from: w */
    public static void m145282w(String str, String str2) {
        if (RtcLogLevel.RTC_LOG_LEVEL_WARNING.compareTo(sLogLevel) >= 0) {
            String a = C1642a.m8034a("[%s] %s [msg:%s]", new Object[]{"WARNING", getTraceInfo(), str2});
            notifyLoggerSinks(RtcLogLevel.RTC_LOG_LEVEL_WARNING, C1642a.m8034a("[%s:%s]:%s", new Object[]{"BYTERTC", str, a}), null);
        }
    }

    private static void notifyLoggerSinks(RtcLogLevel rtcLogLevel, String str, Throwable th) {
        if (sLoggerSink != null) {
            LoggerSink loggerSink = getLoggerSink();
            if (loggerSink != null) {
                loggerSink.onLoggerMessage(rtcLogLevel, str, th);
            }
        }
    }

    /* renamed from: e */
    public static void m145280e(String str, String str2, Throwable th) {
        if (RtcLogLevel.RTC_LOG_LEVEL_ERROR.compareTo(sLogLevel) >= 0) {
            String a = C1642a.m8034a("[%s][msg:%s]", new Object[]{"ERROR", str2});
            notifyLoggerSinks(RtcLogLevel.RTC_LOG_LEVEL_ERROR, C1642a.m8034a("[%s:%s]:%s", new Object[]{"BYTERTC", str, a}), th);
        }
    }

    /* renamed from: w */
    public static void m145283w(String str, String str2, Throwable th) {
        if (RtcLogLevel.RTC_LOG_LEVEL_WARNING.compareTo(sLogLevel) >= 0) {
            String a = C1642a.m8034a("[%s][msg:%s]", new Object[]{"WARNING", str2});
            notifyLoggerSinks(RtcLogLevel.RTC_LOG_LEVEL_WARNING, C1642a.m8034a("[%s:%s]:%s", new Object[]{"BYTERTC", str, a}), th);
        }
    }
}
