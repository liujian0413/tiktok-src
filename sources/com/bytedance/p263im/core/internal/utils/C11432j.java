package com.bytedance.p263im.core.internal.utils;

import android.os.Looper;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.bytedance.im.core.internal.utils.j */
public final class C11432j {
    /* renamed from: c */
    private static boolean m33708c() {
        if (Looper.getMainLooper() == Looper.myLooper() && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m33706a() {
        if (C11404d.m33586a()) {
            if (!m33708c()) {
                StringBuilder sb = new StringBuilder(100);
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                for (int i = 1; i < stackTrace.length; i++) {
                    sb.append(stackTrace[i].getClassName());
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(stackTrace[i].getMethodName());
                    sb.append("  lines = ");
                    sb.append(stackTrace[i].getLineNumber());
                    sb.append("\n");
                }
                StringBuilder sb2 = new StringBuilder("can not be call in a thread! trace = \n");
                sb2.append(sb.toString());
                C11404d.m33590c("imsdk", sb2.toString());
                StringBuilder sb3 = new StringBuilder("can not be call in a thread! trace = ");
                sb3.append(sb.toString());
                throw new Error(sb3.toString());
            }
        }
    }

    /* renamed from: b */
    public static void m33707b() {
        if (C11404d.m33586a() && m33708c()) {
            StringBuilder sb = new StringBuilder(100);
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i = 1; i < stackTrace.length; i++) {
                sb.append(stackTrace[i].getClassName());
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(stackTrace[i].getMethodName());
                sb.append("  lines = ");
                sb.append(stackTrace[i].getLineNumber());
                sb.append("\n");
            }
            StringBuilder sb2 = new StringBuilder("can not be call in main thread! trace = \n");
            sb2.append(sb.toString());
            C11404d.m33590c("imsdk", sb2.toString());
            StringBuilder sb3 = new StringBuilder("can not be call in main thread! trace = ");
            sb3.append(sb.toString());
            throw new Error(sb3.toString());
        }
    }
}
