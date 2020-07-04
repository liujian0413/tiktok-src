package com.bytedance.apm.util;

import android.app.ActivityManager;
import android.content.Context;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.apm.util.c */
public final class C9640c {

    /* renamed from: a */
    private static long f26362a = -1;

    /* renamed from: e */
    public static long m28526e() {
        return m28528f() + m28516a(Environment.getRootDirectory());
    }

    /* renamed from: d */
    public static long m28524d() {
        if (f26362a == -1) {
            try {
                f26362a = Runtime.getRuntime().maxMemory();
            } catch (Exception unused) {
            }
        }
        return f26362a;
    }

    /* renamed from: f */
    private static long m28528f() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return m28516a(C9642e.m28530a());
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: b */
    public static long m28519b() {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                C9644g.m28534a(bufferedReader);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader2 = bufferedReader;
                C9644g.m28534a(bufferedReader2);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                C9644g.m28534a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            C9644g.m28534a(bufferedReader2);
            return -1;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bufferedReader = null;
            th = th4;
            C9644g.m28534a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: c */
    public static long m28522c() {
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/stat");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(sb.toString())), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                C9644g.m28534a(bufferedReader2);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                C9644g.m28534a(bufferedReader);
                return -1;
            } catch (Throwable th) {
                BufferedReader bufferedReader3 = bufferedReader2;
                th = th;
                bufferedReader = bufferedReader3;
                C9644g.m28534a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            C9644g.m28534a(bufferedReader);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            C9644g.m28534a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m28518a() {
        File file = new File("/proc/stat");
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m28515a(Context context) {
        if (context == null) {
            return -1;
        }
        return m28525d(context) + m28527e(context);
    }

    /* renamed from: d */
    private static long m28525d(Context context) {
        if (context == null) {
            return -1;
        }
        return TrafficStats.getUidRxBytes(Process.myUid());
    }

    /* renamed from: e */
    private static long m28527e(Context context) {
        if (context == null) {
            return -1;
        }
        return TrafficStats.getUidTxBytes(Process.myUid());
    }

    /* renamed from: a */
    private static long m28516a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static long m28521b(File file) {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                j = m28521b(file2);
            } else {
                j = file2.length();
            }
            j2 += j;
        }
        return j2;
    }

    /* renamed from: a */
    public static long m28514a(int i) {
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(i);
            sb.append("/stat");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(sb.toString())), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                C9644g.m28534a(bufferedReader2);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                C9644g.m28534a(bufferedReader);
                return -1;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                C9644g.m28534a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            C9644g.m28534a(bufferedReader);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            C9644g.m28534a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: b */
    public static long m28520b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return -1;
            }
            File file = new File(context.getFilesDir().getParent());
            if (!file.exists()) {
                return -1;
            }
            long b = m28521b(file);
            StringBuilder sb = new StringBuilder();
            sb.append(C9642e.m28530a().getAbsolutePath());
            sb.append("/Android/data/");
            sb.append(packageName);
            File file2 = new File(sb.toString());
            long j = 0;
            if (file2.exists()) {
                j = m28521b(file2);
            }
            return b + j;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static long m28523c(Context context) {
        long j;
        if (context == null) {
            return -1;
        }
        try {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return -1;
            }
            File cacheDir = context.getCacheDir();
            long j2 = 0;
            if (cacheDir.exists()) {
                j = m28521b(cacheDir);
            } else {
                j = 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C9642e.m28530a().getAbsolutePath());
            sb.append("/Android/data/");
            sb.append(packageName);
            sb.append("/cache");
            File file = new File(sb.toString());
            if (file.exists()) {
                j2 = m28521b(file);
            }
            return j + j2;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static MemoryInfo m28517a(int i, Context context) {
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0];
        } catch (Exception unused) {
            return null;
        }
    }
}
