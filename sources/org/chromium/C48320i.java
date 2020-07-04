package org.chromium;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: org.chromium.i */
public final class C48320i {

    /* renamed from: a */
    private static String f123375a;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e A[SYNTHETIC, Splitter:B:20:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[SYNTHETIC, Splitter:B:28:0x0075] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m149886a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r2.<init>()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            goto L_0x002e
        L_0x0039:
            org.chromium.f r3 = org.chromium.C48317f.m149883a()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            boolean r3 = r3.loggerDebug()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            if (r3 == 0) goto L_0x005e
            org.chromium.f r3 = org.chromium.C48317f.m149883a()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r4 = "Process"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r6 = "get processName = "
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r6 = r2.toString()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r3.loggerD(r4, r5)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
        L_0x005e:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r1.close()     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            return r2
        L_0x0066:
            r0 = move-exception
            goto L_0x006c
        L_0x0068:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            throw r0
        L_0x0072:
            r1 = r0
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1.close()     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.C48320i.m149886a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m149888a(Context context) {
        String b = m149889b(context);
        if ((b == null || !b.contains(":")) && b != null && b.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m149889b(Context context) {
        String str = f123375a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (C48317f.m149883a().loggerDebug()) {
                        StringBuilder sb = new StringBuilder("processName = ");
                        sb.append(runningAppProcessInfo.processName);
                        C48317f.m149883a().loggerD("Process", sb.toString());
                    }
                    String str2 = runningAppProcessInfo.processName;
                    f123375a = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String a = m149886a();
        f123375a = a;
        return a;
    }

    /* renamed from: a */
    public static List m149887a(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            Class[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!arrayList.contains(interfaces[i])) {
                    arrayList.add(interfaces[i]);
                }
                for (Class cls2 : m149887a(interfaces[i])) {
                    if (!arrayList.contains(cls2)) {
                        arrayList.add(cls2);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }
}
