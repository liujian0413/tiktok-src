package com.ttnet.org.chromium.base;

import com.taobao.android.dexposed.ClassUtils;

public class Logger {
    static int mLevel = 4;

    /* renamed from: d */
    public static void m146406d(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: d */
    public static void m146407d(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    /* renamed from: e */
    public static void m146409e(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: e */
    public static void m146410e(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    public static int getLogLevel() {
        return mLevel;
    }

    /* renamed from: i */
    public static void m146412i(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: i */
    public static void m146413i(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    /* renamed from: v */
    public static void m146416v(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: v */
    public static void m146417v(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    /* renamed from: w */
    public static void m146419w(String str, String str2) {
        if (str2 != null) {
        }
    }

    /* renamed from: w */
    public static void m146420w(String str, String str2, Throwable th) {
        if (str2 == null && th != null) {
        }
    }

    public static boolean debug() {
        if (mLevel <= 3) {
            return true;
        }
        return false;
    }

    public static void setLogLevel(int i) {
        mLevel = i;
    }

    /* renamed from: d */
    public static void m146405d(String str) {
        m146406d("Logger", str);
    }

    /* renamed from: e */
    public static void m146408e(String str) {
        m146409e("Logger", str);
    }

    /* renamed from: i */
    public static void m146411i(String str) {
        m146412i("Logger", str);
    }

    /* renamed from: v */
    public static void m146415v(String str) {
        m146416v("Logger", str);
    }

    /* renamed from: w */
    public static void m146418w(String str) {
        m146419w("Logger", str);
    }

    public static void alertErrorInfo(String str) {
        if (debug()) {
            throw new IllegalStateException(str);
        }
    }

    private static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static void throwException(Throwable th) {
        if (th != null && debug()) {
            throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
        }
    }

    /* renamed from: st */
    public static void m146414st(String str, int i) {
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 1; i2 < Math.min(i, stackTrace.length); i2++) {
                if (i2 > 1) {
                    sb.append("\n");
                }
                sb.append(getSimpleClassName(stackTrace[i2].getClassName()));
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(stackTrace[i2].getMethodName());
            }
            m146416v(str, sb.toString());
        }
    }
}
