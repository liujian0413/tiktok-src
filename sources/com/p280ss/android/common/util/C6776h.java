package com.p280ss.android.common.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.common.util.h */
public final class C6776h {

    /* renamed from: a */
    public static String f19290a = ":push";

    /* renamed from: b */
    public static boolean f19291b = false;

    /* renamed from: c */
    public static boolean f19292c = false;

    /* renamed from: d */
    private static String f19293d = null;

    /* renamed from: e */
    private static boolean f19294e = true;

    /* renamed from: c */
    public static String m20949c(Context context) {
        return C6777i.m20957a(context);
    }

    /* renamed from: b */
    public static String m20946b() {
        return C6777i.m20958a("ro.build.version.emui");
    }

    /* renamed from: c */
    public static boolean m20950c() {
        if (!f19292c) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f19291b = true;
                    f19292c = true;
                    return f19291b;
                }
            } catch (Exception unused) {
            }
            f19292c = true;
        }
        return f19291b;
    }

    /* renamed from: a */
    public static boolean m20942a() {
        try {
            if ((C6319n.m19593a(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("huawei")) && (C6319n.m19593a(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith("huawei"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m20953d() {
        if ((C6319n.m19593a(Build.DISPLAY) || Build.DISPLAY.indexOf("Flyme") < 0) && (C6319n.m19593a(Build.USER) || !Build.USER.equals("flyme"))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC, Splitter:B:17:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC, Splitter:B:25:0x0050] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m20954e() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r4.append(r5)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            r2.<init>()     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            r2.append(r3)     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            goto L_0x002e
        L_0x0039:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            r1.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            return r2
        L_0x0041:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0047
        L_0x0046:
            r1 = move-exception
        L_0x0047:
            if (r0 == 0) goto L_0x004c
            r0.close()     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            throw r1
        L_0x004d:
            r1 = r0
        L_0x004e:
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.C6776h.m20954e():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m20943a(Context context) {
        String c = m20949c(context);
        if (c == null || !c.endsWith(f19290a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m20947b(Context context) {
        String c = m20949c(context);
        if ((c == null || !c.contains(":")) && c != null && c.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static String m20952d(Context context) {
        String str = f19293d;
        if (!C6319n.m19593a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str2 = runningAppProcessInfo.processName;
                    f19293d = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String e = m20954e();
        f19293d = e;
        return e;
    }

    /* renamed from: f */
    public static String m20956f(Context context) throws NullPointerException {
        String str;
        if (context != null) {
            try {
                if (context.getCacheDir() != null) {
                    str = context.getCacheDir().getPath();
                } else {
                    StringBuilder sb = new StringBuilder("/data/data/");
                    sb.append(context.getPackageName());
                    sb.append("/cache/");
                    File dir = context.getDir(sb.toString(), 0);
                    if (dir != null) {
                        str = dir.getPath();
                    }
                    str = null;
                }
            } catch (Throwable unused) {
            }
            if (!C6319n.m19593a(str)) {
                return str;
            }
            throw new NullPointerException("Cannot Create Cache Dir");
        }
        throw new NullPointerException("Context is NUll");
    }

    /* renamed from: e */
    public static String m20955e(Context context) {
        if (context == null) {
            return "";
        }
        try {
            List<RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(5);
            if (runningTasks == null) {
                return "";
            }
            String packageName = context.getPackageName();
            StringBuilder sb = new StringBuilder();
            for (RunningTaskInfo runningTaskInfo : runningTasks) {
                if (runningTaskInfo != null && runningTaskInfo.baseActivity != null && packageName.equals(runningTaskInfo.baseActivity.getPackageName())) {
                    sb.append("id = ");
                    sb.append(runningTaskInfo.id);
                    sb.append(" ");
                    sb.append("description = ");
                    sb.append(runningTaskInfo.description);
                    sb.append(" ");
                    sb.append("number_of_activities = ");
                    sb.append(runningTaskInfo.numActivities);
                    sb.append(" ");
                    sb.append("number_of_running_activities = ");
                    sb.append(runningTaskInfo.numRunning);
                    sb.append(" ");
                    sb.append("topActivity = ");
                    sb.append(runningTaskInfo.topActivity.toString());
                    sb.append(" ");
                    sb.append("baseActivity = ");
                    sb.append(runningTaskInfo.baseActivity.toString());
                    return sb.toString();
                }
            }
            return "";
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m20945a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m20946b();
        }
        if ((TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("emotionui")) && !m20942a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Intent m20941a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return launchIntentForPackage;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    /* renamed from: b */
    public static boolean m20948b(Context context, String str) {
        if (context == null || C6319n.m19593a(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 16777216) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m20951c(Context context, String str) {
        if (context == null || C6319n.m19593a(str)) {
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (VERSION.SDK_INT < 21) {
            List runningTasks = activityManager.getRunningTasks(1);
            if (!runningTasks.isEmpty()) {
                ComponentName componentName = ((RunningTaskInfo) runningTasks.get(0)).topActivity;
                if (componentName == null || !str.equals(componentName.getPackageName())) {
                    return false;
                }
                return true;
            }
        } else {
            for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (str.equals(runningAppProcessInfo.processName)) {
                    if (runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m20944a(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }
}
