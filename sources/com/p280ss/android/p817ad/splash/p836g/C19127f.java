package com.p280ss.android.p817ad.splash.p836g;

import com.p280ss.android.p817ad.splash.core.C19025f;

/* renamed from: com.ss.android.ad.splash.g.f */
public class C19127f {

    /* renamed from: a */
    static int f51713a = 2;

    /* renamed from: a */
    private static String m62682a() {
        if (!C19025f.m62158e()) {
            return "";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 1;
        while (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (className.equals(Thread.class.getCanonicalName()) || className.equals(C19127f.class.getCanonicalName())) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder("(");
                sb.append(stackTraceElement.getFileName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(")");
                return sb.toString();
            }
        }
        return "";
    }

    /* renamed from: a */
    public static void m62683a(int i) {
        f51713a = i;
    }

    /* renamed from: a */
    public static void m62684a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m62682a());
        sb.append(str);
    }
}
