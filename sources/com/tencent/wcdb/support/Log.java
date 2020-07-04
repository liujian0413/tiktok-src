package com.tencent.wcdb.support;

import com.C1642a;

public class Log {

    /* renamed from: a */
    private static LogCallback f119645a;

    public interface LogCallback {
        void println(int i, String str, String str2);
    }

    private Log() {
    }

    private static native void nativePrintLn(int i, String str, String str2);

    private static native void nativeSetLogger(int i, LogCallback logCallback);

    /* renamed from: a */
    public static void m146010a(String str, String str2) {
        m146009a(6, str, str2);
    }

    /* renamed from: b */
    public static void m146012b(String str, String str2) {
        m146009a(5, str, str2);
    }

    /* renamed from: c */
    public static void m146014c(String str, String str2) {
        m146009a(4, str, str2);
    }

    /* renamed from: a */
    private static void m146009a(int i, String str, String str2) {
        if (f119645a != null) {
            f119645a.println(i, str, str2);
        } else {
            nativePrintLn(i, str, str2);
        }
    }

    /* renamed from: b */
    public static void m146013b(String str, String str2, Object... objArr) {
        m146009a(5, str, C1642a.m8034a(str2, objArr));
    }

    /* renamed from: c */
    public static void m146015c(String str, String str2, Object... objArr) {
        m146009a(4, str, C1642a.m8034a(str2, objArr));
    }

    /* renamed from: a */
    public static void m146011a(String str, String str2, Object... objArr) {
        m146009a(6, str, C1642a.m8034a(str2, objArr));
    }
}
