package com.bytedance.android.live.core.performance;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.performance.a */
public final class C3221a {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        if (r3 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        r3.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        if (r3 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double m12210a() {
        /*
            r0 = 0
            r1 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0094, all -> 0x008b }
            java.lang.String r4 = "top -n 1"
            java.lang.Process r3 = r3.exec(r4)     // Catch:{ Throwable -> 0x0094, all -> 0x008b }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            r0.<init>(r4)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            r4 = -1
            r5 = -1
        L_0x001d:
            java.lang.String r6 = r0.readLine()     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            if (r6 == 0) goto L_0x0081
            java.lang.String r6 = r6.trim()     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            if (r7 != 0) goto L_0x001d
            int r7 = m12213a(r6)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            if (r7 == r4) goto L_0x0035
            r5 = r7
            goto L_0x001d
        L_0x0035:
            int r7 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            boolean r7 = r6.startsWith(r7)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            if (r7 == 0) goto L_0x001d
            if (r5 == r4) goto L_0x001d
            java.lang.String r7 = "\\s+"
            java.lang.String[] r6 = r6.split(r7)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            int r7 = r6.length     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            if (r7 <= r5) goto L_0x001d
            r6 = r6[r5]     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            java.lang.String r7 = "%"
            boolean r7 = r6.endsWith(r7)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            if (r7 == 0) goto L_0x0063
            r7 = 0
            java.lang.String r8 = "%"
            int r8 = r6.lastIndexOf(r8)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
            java.lang.String r6 = r6.substring(r7, r8)     // Catch:{ Throwable -> 0x0087, all -> 0x0089 }
        L_0x0063:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NumberFormatException -> 0x001d }
            r8 = 26
            if (r7 < r8) goto L_0x007b
            double r6 = java.lang.Double.parseDouble(r6)     // Catch:{ NumberFormatException -> 0x001d }
            java.lang.Runtime r8 = java.lang.Runtime.getRuntime()     // Catch:{ NumberFormatException -> 0x001d }
            int r8 = r8.availableProcessors()     // Catch:{ NumberFormatException -> 0x001d }
            double r1 = (double) r8
            java.lang.Double.isNaN(r1)
            double r6 = r6 / r1
            goto L_0x007f
        L_0x007b:
            double r6 = java.lang.Double.parseDouble(r6)     // Catch:{ NumberFormatException -> 0x001d }
        L_0x007f:
            r1 = r6
            goto L_0x001d
        L_0x0081:
            if (r3 == 0) goto L_0x0098
        L_0x0083:
            r3.destroy()
            goto L_0x0098
        L_0x0087:
            goto L_0x0095
        L_0x0089:
            r0 = move-exception
            goto L_0x008e
        L_0x008b:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L_0x008e:
            if (r3 == 0) goto L_0x0093
            r3.destroy()
        L_0x0093:
            throw r0
        L_0x0094:
            r3 = r0
        L_0x0095:
            if (r3 == 0) goto L_0x0098
            goto L_0x0083
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.performance.C3221a.m12210a():double");
    }

    /* renamed from: a */
    private static void m12214a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static int m12211a(Context context) {
        if (context == null) {
            return -1;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return -1;
        }
        return activityManager.getMemoryClass();
    }

    /* renamed from: a */
    private static int m12213a(String str) {
        if (str.contains("CPU")) {
            String[] split = str.split("\\s+");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains("CPU")) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static long m12216b(Context context) {
        Throwable th;
        BufferedReader bufferedReader;
        long j = -1;
        if (context == null) {
            return -1;
        }
        if (VERSION.SDK_INT >= 16) {
            MemoryInfo memoryInfo = new MemoryInfo();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return -1;
            }
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem / 1024;
        }
        BufferedReader bufferedReader2 = null;
        String str = "";
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), VideoCacheReadBuffersizeExperiment.DEFAULT);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.contains("MemTotal")) {
                            str = readLine.split(":")[1].trim();
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Exception unused) {
                    bufferedReader2 = bufferedReader;
                    m12214a((Closeable) bufferedReader2);
                    return j;
                } catch (Throwable th2) {
                    th = th2;
                    m12214a((Closeable) bufferedReader);
                    throw th;
                }
            }
            bufferedReader.close();
            long parseLong = Long.parseLong(str.split(" ")[0].trim());
            m12214a((Closeable) bufferedReader);
            j = parseLong;
        } catch (Exception unused2) {
            m12214a((Closeable) bufferedReader2);
            return j;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            m12214a((Closeable) bufferedReader);
            throw th;
        }
        return j;
    }

    /* renamed from: a */
    public static int m12212a(Context context, int i) {
        if (context == null) {
            return -1;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return -1;
        }
        Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{i});
        if (processMemoryInfo == null || processMemoryInfo.length <= 0) {
            return -1;
        }
        return processMemoryInfo[0].dalvikPss;
    }

    /* renamed from: a */
    public static void m12215a(JSONObject jSONObject, Context context, int i) {
        if (context != null) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{i});
                try {
                    jSONObject.put("total_mem", m12216b(context));
                    jSONObject.put("mem_class", m12211a(context));
                    jSONObject.put("uss", processMemoryInfo[0].getTotalPrivateDirty());
                    jSONObject.put("pss", processMemoryInfo[0].getTotalPss());
                    jSONObject.put("rss", processMemoryInfo[0].getTotalSharedDirty());
                    jSONObject.put("dalvikPss", processMemoryInfo[0].dalvikPss);
                    jSONObject.put("dalvikPrivateDirty", processMemoryInfo[0].dalvikPrivateDirty);
                    jSONObject.put("dalvikSharedDirty", processMemoryInfo[0].dalvikSharedDirty);
                    jSONObject.put("nativePss", processMemoryInfo[0].nativePss);
                    jSONObject.put("nativePrivateDirty", processMemoryInfo[0].nativePrivateDirty);
                    jSONObject.put("nativeSharedDirty", processMemoryInfo[0].nativeSharedDirty);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
