package com.p280ss.avframework.livestreamv2.interact.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.ss.avframework.livestreamv2.interact.utils.MonitorUtils */
public class MonitorUtils {
    public static boolean isProcStatCanRead() {
        File file = new File("/proc/stat");
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    public static long getTotalCPUTime() {
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
                close(bufferedReader);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader2 = bufferedReader;
                close(bufferedReader2);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                close(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader2);
            return -1;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bufferedReader = null;
            th = th4;
            close(bufferedReader);
            throw th;
        }
    }

    public static long getUsedCPUTime() {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                close(bufferedReader);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader2 = bufferedReader;
                close(bufferedReader2);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                close(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader2);
            return -1;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bufferedReader = null;
            th = th4;
            close(bufferedReader);
            throw th;
        }
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static long getSysUsedMemory(Context context) {
        if (context == null) {
            return -1;
        }
        MemoryInfo memoryInfo = new MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }

    public static long getAppCPUTime(int i) {
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
                close(bufferedReader2);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                return -1;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            close(bufferedReader);
            throw th;
        }
    }

    public static int getPidMemorySize(int i, Context context) {
        if (context == null) {
            return -1;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return -1;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0].getTotalPss();
        } catch (Exception unused) {
            return -1;
        }
    }
}
