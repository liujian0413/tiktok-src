package com.p280ss.android.common.applog;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import com.bytedance.common.p479c.C9682a;
import com.bytedance.common.p479c.C9688c;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.common.p287b.C6755a;
import com.p280ss.android.common.util.C6776h;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.CrashUtil */
public class CrashUtil {
    private static Set<String> sFilterClassSet = new HashSet();
    private static Set<String> sFilterThreadSet = new HashSet();

    static {
        sFilterThreadSet.add("ThreadPlus");
        sFilterThreadSet.add("ApiDispatcher");
        sFilterThreadSet.add("ApiLocalDispatcher");
        sFilterThreadSet.add("AsyncLoader");
        sFilterThreadSet.add("AsyncTask");
        sFilterThreadSet.add("Binder");
        sFilterThreadSet.add("PackageProcessor");
        sFilterThreadSet.add("SettingsObserver");
        sFilterThreadSet.add("WifiManager");
        sFilterThreadSet.add("JavaBridge");
        sFilterThreadSet.add("Compiler");
        sFilterThreadSet.add("Signal Catcher");
        sFilterThreadSet.add("GC");
        sFilterThreadSet.add("ReferenceQueueDaemon");
        sFilterThreadSet.add("FinalizerDaemon");
        sFilterThreadSet.add("FinalizerWatchdogDaemon");
        sFilterThreadSet.add("CookieSyncManager");
        sFilterThreadSet.add("RefQueueWorker");
        sFilterThreadSet.add("CleanupReference");
        sFilterThreadSet.add("VideoManager");
        sFilterThreadSet.add("DBHelper-AsyncOp");
        sFilterThreadSet.add("InstalledAppTracker2");
        sFilterThreadSet.add("AppData-AsyncOp");
        sFilterThreadSet.add("IdleConnectionMonitor");
        sFilterThreadSet.add("LogReaper");
        sFilterThreadSet.add("ActionReaper");
        sFilterThreadSet.add("Okio Watchdog");
        sFilterThreadSet.add("CheckWaitingQueue");
        sFilterClassSet.add("com.facebook.imagepipeline.core.PriorityThreadFactory");
        sFilterClassSet.add("com.ss.android.common.util.SimpleThreadFactory");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[Catch:{ Throwable -> 0x00f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0021 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getAllStackTraces() {
        /*
            java.util.Map r0 = java.lang.Thread.getAllStackTraces()     // Catch:{ Throwable -> 0x00f8 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f8 }
            r1.<init>()     // Catch:{ Throwable -> 0x00f8 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "tr_all_count"
            int r3 = r0.size()     // Catch:{ Throwable -> 0x00f8 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x00f8 }
        L_0x0014:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Throwable -> 0x00f8 }
            r2.<init>()     // Catch:{ Throwable -> 0x00f8 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Throwable -> 0x00f8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x00f8 }
        L_0x0021:
            boolean r3 = r0.hasNext()     // Catch:{ Throwable -> 0x00f8 }
            if (r3 == 0) goto L_0x00f3
            java.lang.Object r3 = r0.next()     // Catch:{ Throwable -> 0x00f8 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Throwable -> 0x00f8 }
            if (r3 == 0) goto L_0x00ec
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f8 }
            r4.<init>()     // Catch:{ Throwable -> 0x00f8 }
            java.lang.Object r5 = r3.getKey()     // Catch:{ Throwable -> 0x00f8 }
            java.lang.Thread r5 = (java.lang.Thread) r5     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r6 = r5.getName()     // Catch:{ Throwable -> 0x00f8 }
            java.util.Set<java.lang.String> r7 = sFilterThreadSet     // Catch:{ Throwable -> 0x00f8 }
            boolean r7 = r7.contains(r6)     // Catch:{ Throwable -> 0x00f8 }
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x004a
        L_0x0048:
            r6 = 1
            goto L_0x006a
        L_0x004a:
            java.util.Set<java.lang.String> r7 = sFilterThreadSet     // Catch:{ Throwable -> 0x00f8 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Throwable -> 0x00f8 }
        L_0x0050:
            boolean r10 = r7.hasNext()     // Catch:{ Throwable -> 0x00f8 }
            if (r10 == 0) goto L_0x0069
            java.lang.Object r10 = r7.next()     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Throwable -> 0x00f8 }
            boolean r11 = com.bytedance.common.utility.C6319n.m19593a(r6)     // Catch:{ Throwable -> 0x00f8 }
            if (r11 != 0) goto L_0x0050
            boolean r10 = r6.startsWith(r10)     // Catch:{ Throwable -> 0x00f8 }
            if (r10 == 0) goto L_0x0050
            goto L_0x0048
        L_0x0069:
            r6 = 0
        L_0x006a:
            if (r6 != 0) goto L_0x0021
            java.lang.String r7 = "tr_n"
            java.lang.String r5 = r5.getName()     // Catch:{ Throwable -> 0x00f8 }
            r4.put(r7, r5)     // Catch:{ Throwable -> 0x00f8 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Throwable -> 0x00f8 }
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3     // Catch:{ Throwable -> 0x00f8 }
            if (r3 == 0) goto L_0x00e7
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Throwable -> 0x00f8 }
            r5.<init>()     // Catch:{ Throwable -> 0x00f8 }
            int r7 = r3.length     // Catch:{ Throwable -> 0x00f8 }
        L_0x0083:
            if (r8 >= r7) goto L_0x00e0
            r10 = r3[r8]     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r11 = r10.getClassName()     // Catch:{ Throwable -> 0x00f8 }
            java.util.Set<java.lang.String> r12 = sFilterClassSet     // Catch:{ Throwable -> 0x00f8 }
            boolean r12 = r12.contains(r11)     // Catch:{ Throwable -> 0x00f8 }
            if (r12 == 0) goto L_0x0095
            r6 = 1
            goto L_0x00e0
        L_0x0095:
            java.util.Set<java.lang.String> r12 = sFilterClassSet     // Catch:{ Throwable -> 0x00f8 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Throwable -> 0x00f8 }
        L_0x009b:
            boolean r13 = r12.hasNext()     // Catch:{ Throwable -> 0x00f8 }
            if (r13 == 0) goto L_0x00b4
            java.lang.Object r13 = r12.next()     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Throwable -> 0x00f8 }
            boolean r14 = com.bytedance.common.utility.C6319n.m19593a(r11)     // Catch:{ Throwable -> 0x00f8 }
            if (r14 != 0) goto L_0x009b
            boolean r13 = r11.startsWith(r13)     // Catch:{ Throwable -> 0x00f8 }
            if (r13 == 0) goto L_0x009b
            r6 = 1
        L_0x00b4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f8 }
            r12.<init>(r11)     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r11 = "."
            r12.append(r11)     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r11 = r10.getMethodName()     // Catch:{ Throwable -> 0x00f8 }
            r12.append(r11)     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r11 = "("
            r12.append(r11)     // Catch:{ Throwable -> 0x00f8 }
            int r10 = r10.getLineNumber()     // Catch:{ Throwable -> 0x00f8 }
            r12.append(r10)     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r10 = ")"
            r12.append(r10)     // Catch:{ Throwable -> 0x00f8 }
            java.lang.String r10 = r12.toString()     // Catch:{ Throwable -> 0x00f8 }
            r5.put(r10)     // Catch:{ Throwable -> 0x00f8 }
            int r8 = r8 + 1
            goto L_0x0083
        L_0x00e0:
            if (r6 != 0) goto L_0x0021
            java.lang.String r3 = "tr_st"
            r4.put(r3, r5)     // Catch:{ Throwable -> 0x00f8 }
        L_0x00e7:
            if (r6 != 0) goto L_0x0021
            r2.put(r4)     // Catch:{ Throwable -> 0x00f8 }
        L_0x00ec:
            java.lang.String r3 = "tr_stacks"
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x00f8 }
            goto L_0x0021
        L_0x00f3:
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x00f8 }
            return r0
        L_0x00f8:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.CrashUtil.getAllStackTraces():java.lang.String");
    }

    private static String getDataFiles(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return getFiles(context.getFilesDir()).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean isCausedByOOM(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            if (th instanceof OutOfMemoryError) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static JSONArray getFiles(File file) {
        JSONArray jSONArray = new JSONArray();
        if (file == null || !file.exists()) {
            return jSONArray;
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return jSONArray;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                jSONArray.put(file2.getName());
            } else if (file2.isDirectory()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(file2.getName(), getFiles(file2));
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
        return jSONArray;
    }

    private static boolean isAdNullException(String str, Throwable th) {
        if (str == null || !str.endsWith(":ad")) {
            return false;
        }
        int i = 0;
        while (th != null) {
            if (th instanceof NullPointerException) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static void getMemoryInfo(Context context, JSONObject jSONObject) {
        ActivityManager activityManager;
        if (jSONObject != null) {
            if (context != null) {
                try {
                    context = context.getApplicationContext();
                } catch (Throwable unused) {
                    return;
                }
            }
            MemoryInfo memoryInfo = new MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dalvikPrivateDirty", memoryInfo.dalvikPrivateDirty);
            jSONObject2.put("dalvikPss", memoryInfo.dalvikPss);
            jSONObject2.put("dalvikSharedDirty", memoryInfo.dalvikSharedDirty);
            jSONObject2.put("nativePrivateDirty", memoryInfo.nativePrivateDirty);
            jSONObject2.put("nativePss", memoryInfo.nativePss);
            jSONObject2.put("nativeSharedDirty", memoryInfo.nativeSharedDirty);
            jSONObject2.put("otherPrivateDirty", memoryInfo.otherPrivateDirty);
            jSONObject2.put("otherPss", memoryInfo.otherPss);
            jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
            jSONObject2.put("totalPrivateClean", DebugMemInfoCompat.getTotalPrivateClean(memoryInfo));
            jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
            jSONObject2.put("totalPss", memoryInfo.getTotalPss());
            jSONObject2.put("totalSharedClean", DebugMemInfoCompat.getTotalSharedClean(memoryInfo));
            jSONObject2.put("totalSharedDirty", memoryInfo.getTotalSharedDirty());
            jSONObject2.put("totalSwappablePss", DebugMemInfoCompat.getTotalSwappablePss(memoryInfo));
            jSONObject.put("memory_info", jSONObject2);
            if (context != null) {
                JSONObject jSONObject3 = new JSONObject();
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                activityManager = (ActivityManager) context.getSystemService("activity");
                activityManager.getMemoryInfo(memoryInfo2);
                jSONObject3.put("availMem", memoryInfo2.availMem);
                jSONObject3.put("lowMemory", memoryInfo2.lowMemory);
                jSONObject3.put("threshold", memoryInfo2.threshold);
                jSONObject3.put("totalMem", C9688c.m28621a(memoryInfo2));
                jSONObject.put("sys_memory_info", jSONObject3);
            } else {
                activityManager = null;
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("native_heap_size", Debug.getNativeHeapSize());
            jSONObject4.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
            jSONObject4.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
            Runtime runtime = Runtime.getRuntime();
            jSONObject4.put("max_memory", runtime.maxMemory());
            jSONObject4.put("free_memory", runtime.freeMemory());
            jSONObject4.put("total_memory", runtime.totalMemory());
            if (activityManager != null) {
                jSONObject4.put("memory_class", activityManager.getMemoryClass());
                jSONObject4.put("large_memory_class", C9682a.m28606a(activityManager));
            }
            jSONObject.put("app_memory_info", jSONObject4);
        }
    }

    public static JSONObject getCrashInfo(Context context, Thread thread, Throwable th) {
        if (th == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                context = context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        C6497a.m20180a(th, printWriter);
        Throwable cause = th.getCause();
        if (cause != null) {
            C6497a.m20180a(cause, printWriter);
            Throwable cause2 = cause.getCause();
            if (cause2 != null) {
                C6497a.m20180a(cause2, printWriter);
            }
        }
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        if (stringWriter2 == null) {
            return jSONObject;
        }
        jSONObject.put("data", stringWriter2);
        jSONObject.put("crash_time", System.currentTimeMillis());
        String str = "";
        if (context != null) {
            str = C6776h.m20949c(context);
            jSONObject.put("process_name", str);
            if (!C6776h.m20947b(context)) {
                jSONObject.put("remote_process", 1);
            }
        }
        jSONObject.put("app_count", AppLog.sAppCount);
        if (context != null) {
            getMemoryInfo(context, jSONObject);
        }
        if (isCausedByOOM(th) || isAdNullException(str, th)) {
            if (C6776h.m20947b(context)) {
                jSONObject.put("finished_activities", C6755a.m20903b());
            } else if (str != null && str.endsWith(":ad")) {
                jSONObject.put("data_files", getDataFiles(context));
            }
            jSONObject.put("all_thread_stacks", getAllStackTraces());
        }
        return jSONObject;
    }
}
