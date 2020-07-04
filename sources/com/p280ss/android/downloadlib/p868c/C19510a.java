package com.p280ss.android.downloadlib.p868c;

import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p280ss.android.downloadlib.addownload.C19491j;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;

/* renamed from: com.ss.android.downloadlib.c.a */
public final class C19510a {

    /* renamed from: com.ss.android.downloadlib.c.a$a */
    static class C19512a implements InvocationHandler {

        /* renamed from: a */
        private Object f52808a;

        private C19512a(Object obj) {
            this.f52808a = obj;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[Catch:{ Throwable -> 0x00a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0087 A[Catch:{ Throwable -> 0x00a0 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0088 A[Catch:{ Throwable -> 0x00a0 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Throwable m64280a(java.lang.Throwable r8) {
            /*
                java.lang.StackTraceElement[] r0 = r8.getStackTrace()     // Catch:{ Throwable -> 0x00a0 }
                boolean r1 = r8 instanceof java.lang.reflect.InvocationTargetException     // Catch:{ Throwable -> 0x00a0 }
                if (r1 == 0) goto L_0x0027
                r1 = r8
                java.lang.reflect.InvocationTargetException r1 = (java.lang.reflect.InvocationTargetException) r1     // Catch:{ Throwable -> 0x00a0 }
                java.lang.Throwable r2 = r1.getTargetException()     // Catch:{ Throwable -> 0x00a0 }
                if (r2 == 0) goto L_0x0020
                java.lang.Throwable r0 = r1.getTargetException()     // Catch:{ Throwable -> 0x00a0 }
                java.lang.StackTraceElement[] r8 = r0.getStackTrace()     // Catch:{ Throwable -> 0x001d }
            L_0x0019:
                r7 = r0
                r0 = r8
                r8 = r7
                goto L_0x0043
            L_0x001d:
                r8 = r0
                goto L_0x00a0
            L_0x0020:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x00a0 }
                r1.<init>()     // Catch:{ Throwable -> 0x00a0 }
            L_0x0025:
                r8 = r1
                goto L_0x0043
            L_0x0027:
                boolean r1 = r8 instanceof java.lang.reflect.UndeclaredThrowableException     // Catch:{ Throwable -> 0x00a0 }
                if (r1 == 0) goto L_0x0043
                r1 = r8
                java.lang.reflect.UndeclaredThrowableException r1 = (java.lang.reflect.UndeclaredThrowableException) r1     // Catch:{ Throwable -> 0x00a0 }
                java.lang.Throwable r2 = r1.getUndeclaredThrowable()     // Catch:{ Throwable -> 0x00a0 }
                if (r2 == 0) goto L_0x003d
                java.lang.Throwable r0 = r1.getUndeclaredThrowable()     // Catch:{ Throwable -> 0x00a0 }
                java.lang.StackTraceElement[] r8 = r0.getStackTrace()     // Catch:{ Throwable -> 0x001d }
                goto L_0x0019
            L_0x003d:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x00a0 }
                r1.<init>()     // Catch:{ Throwable -> 0x00a0 }
                goto L_0x0025
            L_0x0043:
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00a0 }
                r1.<init>()     // Catch:{ Throwable -> 0x00a0 }
                r2 = 0
                r3 = 0
            L_0x004a:
                int r4 = r0.length     // Catch:{ Throwable -> 0x00a0 }
                if (r3 >= r4) goto L_0x0081
                r4 = r0[r3]     // Catch:{ Throwable -> 0x00a0 }
                if (r4 == 0) goto L_0x007e
                java.lang.String r5 = r4.getClassName()     // Catch:{ Throwable -> 0x00a0 }
                boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x00a0 }
                if (r6 != 0) goto L_0x007b
                java.lang.String r6 = "com.ss.android.downloadlib"
                boolean r6 = r5.contains(r6)     // Catch:{ Throwable -> 0x00a0 }
                if (r6 != 0) goto L_0x007e
                java.lang.Class<java.lang.reflect.Proxy> r6 = java.lang.reflect.Proxy.class
                java.lang.String r6 = r6.getName()     // Catch:{ Throwable -> 0x00a0 }
                boolean r6 = r5.equals(r6)     // Catch:{ Throwable -> 0x00a0 }
                if (r6 != 0) goto L_0x007e
                java.lang.Class<java.lang.reflect.Method> r6 = java.lang.reflect.Method.class
                java.lang.String r6 = r6.getName()     // Catch:{ Throwable -> 0x00a0 }
                boolean r5 = r5.equals(r6)     // Catch:{ Throwable -> 0x00a0 }
                if (r5 != 0) goto L_0x007e
            L_0x007b:
                r1.add(r4)     // Catch:{ Throwable -> 0x00a0 }
            L_0x007e:
                int r3 = r3 + 1
                goto L_0x004a
            L_0x0081:
                boolean r0 = r1.isEmpty()     // Catch:{ Throwable -> 0x00a0 }
                if (r0 == 0) goto L_0x0088
                return r8
            L_0x0088:
                int r0 = r1.size()     // Catch:{ Throwable -> 0x00a0 }
                java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]     // Catch:{ Throwable -> 0x00a0 }
            L_0x008e:
                int r3 = r0.length     // Catch:{ Throwable -> 0x00a0 }
                if (r2 >= r3) goto L_0x009c
                java.lang.Object r3 = r1.get(r2)     // Catch:{ Throwable -> 0x00a0 }
                java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3     // Catch:{ Throwable -> 0x00a0 }
                r0[r2] = r3     // Catch:{ Throwable -> 0x00a0 }
                int r2 = r2 + 1
                goto L_0x008e
            L_0x009c:
                r8.setStackTrace(r0)     // Catch:{ Throwable -> 0x00a0 }
                return r8
            L_0x00a0:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.p868c.C19510a.C19512a.m64280a(java.lang.Throwable):java.lang.Throwable");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|(2:4|(2:8|(2:12|(2:14|(1:16))(2:17|(5:19|(1:21)|22|(1:24)(1:25)|(1:27))(2:28|(3:30|(1:32)|33))))))|34|35|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ec, code lost:
            r7 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f1, code lost:
            throw m64280a(r7);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00e5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.String r7 = "startActivity"
                java.lang.String r0 = r8.getName()     // Catch:{ Throwable -> 0x00e5 }
                boolean r7 = r7.contains(r0)     // Catch:{ Throwable -> 0x00e5 }
                if (r7 == 0) goto L_0x00e5
                r7 = 1
                r0 = r9[r7]     // Catch:{ Throwable -> 0x00e5 }
                boolean r0 = r0 instanceof java.lang.String     // Catch:{ Throwable -> 0x00e5 }
                if (r0 == 0) goto L_0x00e5
                r0 = 2
                r1 = r9[r0]     // Catch:{ Throwable -> 0x00e5 }
                boolean r1 = r1 instanceof android.content.Intent     // Catch:{ Throwable -> 0x00e5 }
                if (r1 == 0) goto L_0x00e5
                r0 = r9[r0]     // Catch:{ Throwable -> 0x00e5 }
                android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r1 = "android.intent.action.VIEW"
                java.lang.String r2 = r0.getAction()     // Catch:{ Throwable -> 0x00e5 }
                boolean r1 = r1.equals(r2)     // Catch:{ Throwable -> 0x00e5 }
                if (r1 == 0) goto L_0x00e5
                java.lang.String r1 = "application/vnd.android.package-archive"
                java.lang.String r2 = r0.getType()     // Catch:{ Throwable -> 0x00e5 }
                boolean r1 = r1.equals(r2)     // Catch:{ Throwable -> 0x00e5 }
                if (r1 == 0) goto L_0x00e5
                boolean r1 = com.p280ss.android.downloadlib.p868c.C19521f.m64297b()     // Catch:{ Throwable -> 0x00e5 }
                if (r1 == 0) goto L_0x0054
                org.json.JSONObject r0 = com.p280ss.android.downloadlib.addownload.C19491j.m64228i()     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r1 = "hook_vivo_arg"
                java.lang.String r2 = "com.android.settings"
                java.lang.String r0 = r0.optString(r1, r2)     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r1 = "null"
                boolean r1 = r1.equals(r0)     // Catch:{ Throwable -> 0x00e5 }
                if (r1 != 0) goto L_0x00e5
                r9[r7] = r0     // Catch:{ Throwable -> 0x00e5 }
                goto L_0x00e5
            L_0x0054:
                boolean r1 = com.p280ss.android.downloadlib.p868c.C19521f.m64298c()     // Catch:{ Throwable -> 0x00e5 }
                if (r1 == 0) goto L_0x00b8
                org.json.JSONObject r1 = com.p280ss.android.downloadlib.addownload.C19491j.m64228i()     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r2 = "hook_oppo_arg1"
                java.lang.String r3 = "com.android.settings"
                java.lang.String r1 = r1.optString(r2, r3)     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r2 = "null"
                boolean r2 = r2.equals(r1)     // Catch:{ Throwable -> 0x00e5 }
                if (r2 != 0) goto L_0x0070
                r9[r7] = r1     // Catch:{ Throwable -> 0x00e5 }
            L_0x0070:
                org.json.JSONObject r1 = com.p280ss.android.downloadlib.addownload.C19491j.m64228i()     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r2 = "hook_oppo_arg2"
                java.lang.String r3 = "com.android.browser"
                java.lang.String r1 = r1.optString(r2, r3)     // Catch:{ Throwable -> 0x00e5 }
                org.json.JSONObject r2 = com.p280ss.android.downloadlib.addownload.C19491j.m64228i()     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r3 = "hook_oppo_arg3"
                java.lang.String r4 = "m.store.oppomobile.com"
                java.lang.String r2 = r2.optString(r3, r4)     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r3 = "oppo_extra_pkg_name"
                r0.putExtra(r3, r1)     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r3 = "refererHost"
                r0.putExtra(r3, r2)     // Catch:{ Throwable -> 0x00e5 }
                org.json.JSONObject r3 = com.p280ss.android.downloadlib.addownload.C19491j.m64228i()     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r4 = "hook_oppo_arg4"
                r5 = 0
                int r3 = r3.optInt(r4, r5)     // Catch:{ Throwable -> 0x00e5 }
                if (r3 != r7) goto L_0x00a0
                goto L_0x00a1
            L_0x00a0:
                r7 = 0
            L_0x00a1:
                if (r7 == 0) goto L_0x00e5
                android.content.Intent r7 = new android.content.Intent     // Catch:{ Throwable -> 0x00e5 }
                r7.<init>()     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r3 = "oppo_extra_pkg_name"
                r7.putExtra(r3, r1)     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r1 = "refererHost"
                r7.putExtra(r1, r2)     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r1 = "android.intent.extra.INTENT"
                r0.putExtra(r1, r7)     // Catch:{ Throwable -> 0x00e5 }
                goto L_0x00e5
            L_0x00b8:
                boolean r1 = com.p280ss.android.downloadlib.p868c.C19521f.m64295a()     // Catch:{ Throwable -> 0x00e5 }
                if (r1 == 0) goto L_0x00e5
                org.json.JSONObject r1 = com.p280ss.android.downloadlib.addownload.C19491j.m64228i()     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r2 = "hook_huawei_arg1"
                java.lang.String r3 = "com.android.settings"
                java.lang.String r1 = r1.optString(r2, r3)     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r2 = "null"
                boolean r2 = r2.equals(r1)     // Catch:{ Throwable -> 0x00e5 }
                if (r2 != 0) goto L_0x00d4
                r9[r7] = r1     // Catch:{ Throwable -> 0x00e5 }
            L_0x00d4:
                java.lang.String r7 = "caller_package"
                org.json.JSONObject r1 = com.p280ss.android.downloadlib.addownload.C19491j.m64228i()     // Catch:{ Throwable -> 0x00e5 }
                java.lang.String r2 = "hook_huawei_arg2"
                java.lang.String r3 = "com.huawei.appmarket"
                java.lang.String r1 = r1.optString(r2, r3)     // Catch:{ Throwable -> 0x00e5 }
                r0.putExtra(r7, r1)     // Catch:{ Throwable -> 0x00e5 }
            L_0x00e5:
                java.lang.Object r7 = r6.f52808a     // Catch:{ Throwable -> 0x00ec }
                java.lang.Object r7 = r8.invoke(r7, r9)     // Catch:{ Throwable -> 0x00ec }
                return r7
            L_0x00ec:
                r7 = move-exception
                java.lang.Throwable r7 = m64280a(r7)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.p868c.C19510a.C19512a.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static void m64277a() {
        Field field;
        try {
            if (VERSION.SDK_INT < 26) {
                field = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            } else {
                field = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            }
            field.setAccessible(true);
            Object obj = field.get(null);
            Field declaredField = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                Class cls = Class.forName("android.app.IActivityManager");
                if (cls != null) {
                    C19512a aVar = new C19512a(obj2);
                    declaredField.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, aVar));
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static String m64278b(String str) {
        return m64276a(m64279c(str));
    }

    /* renamed from: a */
    public static String m64276a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists() && file.length() <= 70000000) {
            return C19523h.m64307a(file);
        }
        return null;
    }

    /* renamed from: c */
    private static String m64279c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<ApplicationInfo> installedApplications = C19491j.m64206a().getPackageManager().getInstalledApplications(0);
        if (installedApplications == null || installedApplications.isEmpty()) {
            return null;
        }
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (applicationInfo != null && str.equals(applicationInfo.packageName)) {
                return applicationInfo.sourceDir;
            }
        }
        return null;
    }
}
