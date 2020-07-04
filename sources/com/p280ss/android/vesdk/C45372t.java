package com.p280ss.android.vesdk;

import android.text.TextUtils;
import com.p280ss.android.ttve.nativePort.TELogcat;

/* renamed from: com.ss.android.vesdk.t */
public final class C45372t {

    /* renamed from: a */
    private static String f116881a = "VESDK-";

    /* renamed from: b */
    private static byte f116882b = 7;

    /* renamed from: a */
    public static byte m143400a() {
        return f116882b;
    }

    /* renamed from: a */
    private static byte m143401a(byte b) {
        if (b == 1) {
            return 1;
        }
        if (b == 3) {
            return 2;
        }
        if (b == 7) {
            return 4;
        }
        if (b != 15) {
            return b != 31 ? (byte) 0 : 16;
        }
        return 8;
    }

    /* renamed from: c */
    public static int m143406c() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return -1;
        }
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    /* renamed from: b */
    public static String m143404b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown file";
        }
        return Thread.currentThread().getStackTrace()[2].getFileName();
    }

    /* renamed from: d */
    public static String m143408d() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown function";
        }
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    /* renamed from: b */
    public static void m143405b(String str, String str2) {
        if ((f116882b & 8) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f116881a);
            sb.append(str);
            TELogcat.Log(8, sb.toString(), str2);
        }
    }

    /* renamed from: d */
    public static void m143409d(String str, String str2) {
        if ((f116882b & 1) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f116881a);
            sb.append(str);
            TELogcat.Log(1, sb.toString(), str2);
        }
    }

    /* renamed from: e */
    public static void m143410e(String str, String str2) {
        if ((f116882b & 16) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f116881a);
            sb.append(str);
            TELogcat.Log(16, sb.toString(), str2);
        }
    }

    /* renamed from: a */
    public static void m143402a(String str, byte b) {
        if (!TextUtils.isEmpty(null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(f116881a);
            sb.append(null);
            sb.append("-");
            f116881a = sb.toString();
        }
        f116882b = b;
        TELogcat.setLogLevel(m143401a(b));
    }

    /* renamed from: c */
    public static void m143407c(String str, String str2) {
        if ((f116882b & 2) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f116881a);
            sb.append(str);
            TELogcat.Log(2, sb.toString(), str2);
        }
    }

    /* renamed from: a */
    public static void m143403a(String str, String str2) {
        if ((f116882b & 4) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f116881a);
            sb.append(str);
            TELogcat.Log(4, sb.toString(), str2);
        }
    }
}
