package com.bytedance.crash.p504l;

import android.app.ActivityManager;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.p491b.C9862e;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p501j.p502a.C9921b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.l.a */
public final class C9972a {

    /* renamed from: a */
    private static String f27208a;

    /* renamed from: b */
    private static Class<?> f27209b;

    /* renamed from: c */
    private static Field f27210c;

    /* renamed from: d */
    private static Field f27211d;

    /* renamed from: e */
    private static boolean f27212e;

    /* renamed from: a */
    private static long m29498a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((long) i) * 1024;
    }

    /* renamed from: a */
    private static String m29500a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/cmdline"));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            return readLine;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static String m29508d(Context context) {
        Class g = m29511g(context);
        if (f27210c == null && g != null) {
            try {
                f27210c = g.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f27210c != null) {
            try {
                return String.valueOf(f27210c.get(null));
            } catch (Throwable unused2) {
            }
        }
        return "";
    }

    /* renamed from: e */
    public static int m29509e(Context context) {
        Class g = m29511g(context);
        if (f27211d == null && g != null) {
            try {
                f27211d = g.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f27211d != null) {
            try {
                return ((Integer) f27211d.get(null)).intValue();
            } catch (Throwable unused2) {
            }
        }
        return -1;
    }

    /* renamed from: g */
    private static Class<?> m29511g(Context context) {
        if (f27209b == null && !f27212e) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getPackageName());
                sb.append(".BuildConfig");
                f27209b = Class.forName(sb.toString());
            } catch (ClassNotFoundException unused) {
            }
            f27212e = true;
        }
        return f27209b;
    }

    /* renamed from: b */
    public static boolean m29506b(Context context) {
        String c = m29507c(context);
        if (c != null && c.contains(":")) {
            return false;
        }
        if (c != null && c.equals(context.getPackageName())) {
            return true;
        }
        if (c == null || !c.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m29507c(Context context) {
        if (!TextUtils.isEmpty(f27208a)) {
            return f27208a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str = runningAppProcessInfo.processName;
                        f27208a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a = m29500a();
        f27208a = a;
        if (a == null) {
            return "";
        }
        return f27208a;
    }

    /* renamed from: f */
    private static boolean m29510f(Context context) {
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return false;
            }
            if (VERSION.SDK_INT < 21) {
                List runningTasks = activityManager.getRunningTasks(1);
                if (runningTasks != null && !runningTasks.isEmpty()) {
                    ComponentName componentName = ((RunningTaskInfo) runningTasks.get(0)).topActivity;
                    if (componentName == null || !packageName.equals(componentName.getPackageName())) {
                        return false;
                    }
                    return true;
                }
            } else {
                List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.importance == 100) {
                            return packageName.equals(runningAppProcessInfo.pkgList[0]);
                        }
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m29502a(JSONObject jSONObject) throws JSONException {
        MemoryInfo memoryInfo = new MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", m29498a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", m29498a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", m29498a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", m29498a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", m29498a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", m29498a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", m29498a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", m29498a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        if (VERSION.SDK_INT >= 23) {
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", m29498a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
        }
        jSONObject2.put("totalPrivateClean", C9974c.m29513a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", m29498a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", C9974c.m29514b(memoryInfo));
        jSONObject2.put("totalSharedDirty", m29498a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", m29498a(C9974c.m29515c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    /* renamed from: a */
    public static boolean m29504a(Context context) {
        if (context == null) {
            return C9921b.m29364a().f27086o;
        }
        if (C9921b.m29364a().f27086o || m29510f(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m29501a(Context context, JSONObject jSONObject) {
        try {
            m29502a(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                m29505b(jSONObject, activityManager);
            }
            m29503a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m29505b(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", C9988l.m29587a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    /* renamed from: a */
    public static ProcessErrorStateInfo m29499a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int myPid = Process.myPid();
        int i2 = 0;
        while (i2 < i) {
            List<ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.pid == myPid && processErrorStateInfo.condition == 2) {
                        return processErrorStateInfo;
                    }
                }
            }
            i2++;
            if (i == i2 || C9862e.m29106a()) {
                break;
            }
            SystemClock.sleep(200);
        }
        return null;
    }

    /* renamed from: a */
    private static void m29503a(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        boolean z;
        JSONObject jSONObject2 = new JSONObject();
        String str = "filters";
        String str2 = "native_heap_leak";
        boolean z2 = false;
        if (Debug.getNativeHeapAllocatedSize() > 209715200) {
            z = true;
        } else {
            z = false;
        }
        C9896a.m29211a(jSONObject, str, str2, String.valueOf(z));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j);
        String str3 = "filters";
        String str4 = "java_heap_leak";
        if (((float) (j - freeMemory)) > ((float) maxMemory) * 0.95f) {
            z2 = true;
        }
        C9896a.m29211a(jSONObject, str3, str4, String.valueOf(z2));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }
}
