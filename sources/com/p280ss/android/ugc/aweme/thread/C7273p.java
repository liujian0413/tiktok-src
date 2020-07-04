package com.p280ss.android.ugc.aweme.thread;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.concurrent.FutureTask;

/* renamed from: com.ss.android.ugc.aweme.thread.p */
class C7273p {

    /* renamed from: a */
    private static volatile Field f20339a;

    /* renamed from: b */
    private static volatile Field f20340b;

    C7273p() {
    }

    /* renamed from: b */
    static boolean m22774b(Object obj) {
        return obj instanceof FutureTask;
    }

    /* renamed from: d */
    private static boolean m22776d(Object obj) {
        return "java.util.concurrent.Executors$RunnableAdapter".equals(obj.getClass().getName());
    }

    /* renamed from: a */
    static String m22770a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            C6497a.m20180a(th, printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    /* renamed from: c */
    static Object m22775c(Object obj) {
        try {
            if (f20339a == null) {
                synchronized (C7273p.class) {
                    if (f20339a == null) {
                        Field declaredField = obj.getClass().getDeclaredField("callable");
                        f20339a = declaredField;
                        declaredField.setAccessible(true);
                    }
                }
            }
            return f20339a.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Object m22777e(Object obj) {
        try {
            if (f20340b == null) {
                synchronized (C7273p.class) {
                    if (f20340b == null) {
                        Field declaredField = obj.getClass().getDeclaredField("task");
                        f20340b = declaredField;
                        declaredField.setAccessible(true);
                    }
                }
            }
            return f20340b.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static String m22771a(StackTraceElement[] stackTraceElementArr) throws IllegalArgumentException {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!m22773a(stackTraceElement)) {
                sb.append("\tat ");
                sb.append(stackTraceElement.getClassName());
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(stackTraceElement.getMethodName());
                sb.append("(");
                sb.append(stackTraceElement.getFileName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(")\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static String m22769a(Object obj) {
        Field[] declaredFields;
        if (m22774b(obj)) {
            Object c = m22775c(obj);
            if (c != null) {
                obj = c;
            }
        }
        if (m22776d(obj)) {
            Object e = m22777e(obj);
            if (e != null) {
                obj = e;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!m22772a(obj.getClass())) {
            String obj2 = obj.toString();
            int indexOf = obj2.indexOf("@");
            if (indexOf > 0) {
                obj2 = obj2.substring(0, indexOf);
            }
            sb.append(obj2);
            sb.append(",");
        }
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object obj3 = field.get(obj);
                if (obj3 != null) {
                    Class cls = obj3.getClass();
                    if (!m22772a(cls)) {
                        String name = cls.getName();
                        int indexOf2 = name.indexOf("@");
                        if (indexOf2 > 0) {
                            name = name.substring(0, indexOf2);
                        }
                        sb.append(name);
                        sb.append(",");
                    }
                }
            }
        } catch (Exception unused) {
        }
        return sb.toString().replaceAll("class ", "");
    }

    /* renamed from: a */
    private static boolean m22772a(Class cls) {
        String name = cls.getName();
        if ("java.lang.Integer".equals(name) || "java.lang.Boolean".equals(name) || "java.lang.Long".equals(name) || "java.lang.Float".equals(name) || "java.lang.Double".equals(name) || "java.lang.String".equals(name) || "sun.misc.Unsafe".equals(name) || "bolts.TaskCompletionSource".equals(name) || "java.util.ArrayList".equals(name) || name.contains("android.os.Handler") || name.contains("com.bytedance.common.utility.collection.WeakHandler") || name.contains("java.util.concurrent.Executors$RunnableAdapter") || name.contains("bolts.Task") || cls.isPrimitive()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m22773a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return true;
        }
        String className = stackTraceElement.getClassName();
        if (className.contains("libcore.io") || className.contains("com.tencent.matrix.iocanary") || className.contains("java.io") || className.contains("android.database.sqlite") || className.contains("android.database.AbstractCursor") || className.contains("dalvik.system") || className.contains("android.os") || className.contains("com.ss.android.ugc.conan") || className.contains("com.lody.whale")) {
            return true;
        }
        String methodName = stackTraceElement.getMethodName();
        if (methodName.equals("getThreadStackTrace") || methodName.equals("getStackTrace")) {
            return true;
        }
        return false;
    }
}
