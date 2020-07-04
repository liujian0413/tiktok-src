package com.kakao.util.helper.log;

import android.util.Log;
import com.C1642a;
import com.facebook.ads.AdError;
import com.kakao.util.helper.log.LoggerConfig.Builder;
import java.util.HashSet;
import java.util.Locale;

public class Logger {
    private static final LoggerConfig loggerConfig = initLogConfig();
    private static boolean withStack = false;

    public enum DeployPhase {
        Local,
        Alpha,
        Sandbox,
        Beta,
        Real;

        public static DeployPhase current() {
            return convert("real");
        }

        public static DeployPhase convert(String str) {
            DeployPhase[] values;
            for (DeployPhase deployPhase : values()) {
                if (deployPhase.toString().toLowerCase().equals(str)) {
                    return deployPhase;
                }
            }
            return Real;
        }
    }

    private Logger() {
    }

    private static LoggerConfig initLogConfig() {
        if ("1.14.0".contains("SNAPSHOT")) {
            withStack = true;
        }
        Builder printLoggerLevel = new Builder().setDefaultTag(Tag.DEFAULT).setStackPrefix("com.kakao.sdk").setPrintLoggerLevel(5);
        HashSet hashSet = new HashSet();
        hashSet.add(Logger.class.getName());
        printLoggerLevel.setIgnoreSet(hashSet);
        return printLoggerLevel.build();
    }

    /* renamed from: d */
    public static int m60925d(String str) {
        return m60929dt(loggerConfig.getDefaultTag(), str);
    }

    public static int dev(String str) {
        return devt(loggerConfig.getDefaultTag(), str);
    }

    /* renamed from: e */
    public static int m60933e(String str) {
        return m60937et(loggerConfig.getDefaultTag(), str);
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        return Log.getStackTraceString(th);
    }

    /* renamed from: w */
    public static int m60955w(String str) {
        return m60959wt(loggerConfig.getDefaultTag(), str);
    }

    /* renamed from: i */
    public static int m60943i(Throwable th) {
        return m60947it(loggerConfig.getDefaultTag(), th);
    }

    /* renamed from: v */
    public static int m60950v(Throwable th) {
        return m60954vt(loggerConfig.getDefaultTag(), th);
    }

    /* renamed from: d */
    public static int m60928d(Throwable th) {
        return m60932dt(loggerConfig.getDefaultTag(), th);
    }

    public static int dev(Throwable th) {
        return devt(loggerConfig.getDefaultTag(), th);
    }

    /* renamed from: e */
    public static int m60936e(Throwable th) {
        return m60940et(loggerConfig.getDefaultTag(), th);
    }

    public static String getCallerTraceInfo(Class cls) {
        if (!loggerConfig.isPrintLoggable(3)) {
            return "unknown caller";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Thread.currentThread().getName();
        StackTraceElement stackTraceElement = null;
        String name2 = cls.getName();
        int length = stackTrace.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i];
            if (stackTraceElement2.getClassName().startsWith(name2)) {
                z = true;
            } else if (z) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i++;
        }
        if (stackTraceElement == null) {
            return "";
        }
        return C1642a.m8035a(Locale.US, "{%s}-[%s.%s():%d]", new Object[]{name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())});
    }

    /* renamed from: w */
    public static int m60958w(Throwable th) {
        return m60962wt(loggerConfig.getDefaultTag(), th);
    }

    public static int devt(Tag tag, String str) {
        return printLog(tag, 0, str);
    }

    /* renamed from: dt */
    public static int m60929dt(Tag tag, String str) {
        return printLog(tag, 3, str);
    }

    /* renamed from: et */
    public static int m60937et(Tag tag, String str) {
        return printLog(tag, 6, str);
    }

    /* renamed from: it */
    public static int m60944it(Tag tag, String str) {
        return printLog(tag, 4, str);
    }

    /* renamed from: vt */
    public static int m60951vt(Tag tag, String str) {
        return printLog(tag, 2, str);
    }

    /* renamed from: wt */
    public static int m60959wt(Tag tag, String str) {
        return printLog(tag, 5, str);
    }

    public static int devt(Tag tag, Throwable th) {
        return devt(tag, getStackTraceString(th));
    }

    /* renamed from: dt */
    public static int m60932dt(Tag tag, Throwable th) {
        return m60929dt(tag, getStackTraceString(th));
    }

    /* renamed from: et */
    public static int m60940et(Tag tag, Throwable th) {
        return m60937et(tag, getStackTraceString(th));
    }

    /* renamed from: i */
    public static int m60941i(String str, Throwable th) {
        return m60945it(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: it */
    public static int m60947it(Tag tag, Throwable th) {
        return m60944it(tag, getStackTraceString(th));
    }

    /* renamed from: v */
    public static int m60948v(String str, Throwable th) {
        return m60952vt(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: vt */
    public static int m60954vt(Tag tag, Throwable th) {
        return m60951vt(tag, getStackTraceString(th));
    }

    /* renamed from: wt */
    public static int m60962wt(Tag tag, Throwable th) {
        return m60959wt(tag, getStackTraceString(th));
    }

    /* renamed from: d */
    public static int m60926d(String str, Throwable th) {
        return m60930dt(loggerConfig.getDefaultTag(), str, th);
    }

    public static int dev(String str, Throwable th) {
        return devt(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: e */
    public static int m60934e(String str, Throwable th) {
        return m60938et(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: i */
    public static int m60942i(String str, Object... objArr) {
        return m60946it(loggerConfig.getDefaultTag(), str, objArr);
    }

    /* renamed from: v */
    public static int m60949v(String str, Object... objArr) {
        return m60953vt(loggerConfig.getDefaultTag(), str, objArr);
    }

    /* renamed from: w */
    public static int m60956w(String str, Throwable th) {
        return m60960wt(loggerConfig.getDefaultTag(), str, th);
    }

    /* renamed from: d */
    public static int m60927d(String str, Object... objArr) {
        return m60931dt(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int dev(String str, Object... objArr) {
        return devt(loggerConfig.getDefaultTag(), str, objArr);
    }

    /* renamed from: e */
    public static int m60935e(String str, Object... objArr) {
        return m60939et(loggerConfig.getDefaultTag(), str, objArr);
    }

    /* renamed from: w */
    public static int m60957w(String str, Object... objArr) {
        return m60961wt(loggerConfig.getDefaultTag(), str, objArr);
    }

    public static int devt(Tag tag, String str, Throwable th) {
        return devt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: dt */
    public static int m60930dt(Tag tag, String str, Throwable th) {
        return m60931dt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: et */
    public static int m60938et(Tag tag, String str, Throwable th) {
        return m60939et(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: it */
    public static int m60945it(Tag tag, String str, Throwable th) {
        return m60946it(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: vt */
    public static int m60952vt(Tag tag, String str, Throwable th) {
        return m60953vt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    /* renamed from: wt */
    public static int m60960wt(Tag tag, String str, Throwable th) {
        return m60961wt(tag, "%s\n%s", str, getStackTraceString(th));
    }

    private static int devt(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(0)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1642a.m8034a(str, objArr);
        }
        return printLog(tag, 0, str);
    }

    /* renamed from: dt */
    private static int m60931dt(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(3)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1642a.m8034a(str, objArr);
        }
        return printLog(tag, 3, str);
    }

    /* renamed from: et */
    private static int m60939et(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(6)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1642a.m8034a(str, objArr);
        }
        return printLog(tag, 6, str);
    }

    /* renamed from: it */
    private static int m60946it(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(4)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1642a.m8034a(str, objArr);
        }
        return printLog(tag, 4, str);
    }

    /* renamed from: vt */
    private static int m60953vt(Tag tag, String str, Object... objArr) {
        if (!loggerConfig.isPrintLoggable(2)) {
            return 0;
        }
        if (objArr != null && objArr.length > 0) {
            str = C1642a.m8034a(str, objArr);
        }
        return printLog(tag, 2, str);
    }

    /* renamed from: wt */
    private static int m60961wt(Tag tag, String str, Object... objArr) {
        if (loggerConfig.isPrintLoggable(5)) {
            return printLog(tag, 5, C1642a.m8034a(str, objArr));
        }
        return 0;
    }

    private static int printLog(Tag tag, int i, String str) {
        int i2 = 0;
        if (str == null) {
            return 0;
        }
        String message = loggerConfig.getMessage(withStack, str);
        if (!loggerConfig.isPrintLoggable(i)) {
            return 0;
        }
        if (message == null) {
            message = loggerConfig.getMessage(withStack, str);
        }
        if (message == null) {
            return 0;
        }
        String tag2 = tag.tag();
        int length = message.length();
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = length - i2;
            if (i5 > 2000) {
                i5 = AdError.SERVER_ERROR_CODE;
            }
            int i6 = i5 + i2;
            i3 += printLogPartially(i, tag2, message.substring(i2, i6), i4);
            i2 = i6;
            i4++;
        }
        return i3;
    }

    private static int printLogPartially(int i, String str, String str2, int i2) {
        int length = str2.length();
        String str3 = "";
        if (i2 > 0) {
            str3 = C1642a.m8035a(Locale.getDefault(), "Cont(%d) ", new Object[]{Integer.valueOf(i2)});
        }
        if (length > 2000) {
            str2 = str2.substring(0, AdError.SERVER_ERROR_CODE);
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str2);
                    return Log.v(str, sb.toString());
                case 3:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(str2);
                    return Log.d(str, sb2.toString());
                case 4:
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str3);
                    sb3.append(str2);
                    return Log.i(str, sb3.toString());
                case 5:
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str3);
                    sb4.append(str2);
                    return Log.w(str, sb4.toString());
                case 6:
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str3);
                    sb5.append(str2);
                    return Log.e(str, sb5.toString());
                default:
                    return 0;
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str3);
            sb6.append(str2);
            return Log.d(str, sb6.toString());
        }
    }
}
