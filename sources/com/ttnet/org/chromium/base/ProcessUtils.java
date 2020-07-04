package com.ttnet.org.chromium.base;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;

public class ProcessUtils {
    private static String sCurProcessName;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066 A[SYNTHETIC, Splitter:B:20:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[SYNTHETIC, Splitter:B:28:0x006d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getCurProcessNameFromProc() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            r4.append(r5)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            r2.<init>()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            r2.append(r3)     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            goto L_0x002e
        L_0x0039:
            boolean r3 = com.ttnet.org.chromium.base.Logger.debug()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            if (r3 == 0) goto L_0x0056
            java.lang.String r3 = "Process"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            java.lang.String r5 = "get processName = "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            java.lang.String r5 = r2.toString()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            r4.append(r5)     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            com.ttnet.org.chromium.base.Logger.m146406d(r3, r4)     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
        L_0x0056:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            r1.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            return r2
        L_0x005e:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0064
        L_0x0063:
            r1 = move-exception
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            r0.close()     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            throw r1
        L_0x006a:
            r1 = r0
        L_0x006b:
            if (r1 == 0) goto L_0x0070
            r1.close()     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ProcessUtils.getCurProcessNameFromProc():java.lang.String");
    }

    public static boolean isMainProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if ((curProcessName == null || !curProcessName.contains(":")) && curProcessName != null && curProcessName.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static boolean isMessageProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if (curProcessName == null || (!curProcessName.endsWith(":push") && !curProcessName.endsWith(":pushservice"))) {
            return false;
        }
        return true;
    }

    public static String getCurProcessName(Context context) {
        String str = sCurProcessName;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (Logger.debug()) {
                        StringBuilder sb = new StringBuilder("processName = ");
                        sb.append(runningAppProcessInfo.processName);
                        Logger.m146406d("Process", sb.toString());
                    }
                    String str2 = runningAppProcessInfo.processName;
                    sCurProcessName = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String curProcessNameFromProc = getCurProcessNameFromProc();
        sCurProcessName = curProcessNameFromProc;
        return curProcessNameFromProc;
    }
}
