package com.bytedance.apm.util;

import android.content.Context;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.bytedance.apm.util.v */
public final class C6297v {

    /* renamed from: a */
    private static Boolean f18534a;

    /* renamed from: a */
    public static boolean m19538a(Context context) {
        boolean z;
        if (f18534a != null) {
            return f18534a.booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f18534a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m19537a(StackTraceElement[] stackTraceElementArr) throws IllegalArgumentException {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            throw new IllegalArgumentException("stackTraceElements must not be null or empty");
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < stackTraceElementArr.length && i <= 40) {
            if ((i != 0 || !"getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName())) && (i != 1 || !"getStackTrace".equals(stackTraceElementArr[1].getMethodName()))) {
                StringBuilder sb2 = new StringBuilder("\tat ");
                sb2.append(stackTraceElementArr[i].getClassName());
                sb.append(sb2.toString());
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(stackTraceElementArr[i].getMethodName());
                sb.append("(");
                sb.append(stackTraceElementArr[i].getFileName());
                sb.append(":");
                sb.append(stackTraceElementArr[i].getLineNumber());
                sb.append(")\n");
            }
            i++;
        }
        return sb.toString();
    }
}
