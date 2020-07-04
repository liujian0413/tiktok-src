package com.p280ss.video.rtc.base.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.ss.video.rtc.base.utils.MonitorUtils */
public class MonitorUtils {
    public static boolean isProcStatCanRead() {
        File file = new File("/proc/stat");
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    public static int getCurrentPidMemorySize() {
        Context applicationContext = RtcContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].dalvikPss;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static float getCurrentAppCPUTime() {
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
                float parseFloat = Float.parseFloat(split[13]) + Float.parseFloat(split[14]) + Float.parseFloat(split[15]) + Float.parseFloat(split[16]);
                close(bufferedReader2);
                return parseFloat;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                return 0.0f;
            } catch (Throwable th) {
                BufferedReader bufferedReader3 = bufferedReader2;
                th = th;
                bufferedReader = bufferedReader3;
                close(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader);
            return 0.0f;
        } catch (Throwable th2) {
            th = th2;
            close(bufferedReader);
            throw th;
        }
    }

    public static float getTotalCPUTime() {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                float parseFloat = Float.parseFloat(split[2]) + Float.parseFloat(split[3]) + Float.parseFloat(split[4]) + Float.parseFloat(split[6]) + Float.parseFloat(split[5]) + Float.parseFloat(split[7]) + Float.parseFloat(split[8]);
                close(bufferedReader);
                return parseFloat;
            } catch (Exception unused) {
                bufferedReader2 = bufferedReader;
                close(bufferedReader2);
                return 0.0f;
            } catch (Throwable th2) {
                th = th2;
                close(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader2);
            return 0.0f;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bufferedReader = null;
            th = th4;
            close(bufferedReader);
            throw th;
        }
    }

    public static float getUsedCPUTime() {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                float parseFloat = Float.parseFloat(split[2]) + Float.parseFloat(split[3]) + Float.parseFloat(split[4]) + Float.parseFloat(split[6]) + Float.parseFloat(split[7]) + Float.parseFloat(split[8]);
                close(bufferedReader);
                return parseFloat;
            } catch (Exception unused) {
                bufferedReader2 = bufferedReader;
                close(bufferedReader2);
                return 0.0f;
            } catch (Throwable th2) {
                th = th2;
                close(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader2);
            return 0.0f;
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

    public static float getAppCPUTime(int i) {
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
                float parseFloat = Float.parseFloat(split[13]) + Float.parseFloat(split[14]) + Float.parseFloat(split[15]) + Float.parseFloat(split[16]);
                close(bufferedReader2);
                return parseFloat;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                return 0.0f;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader);
            return 0.0f;
        } catch (Throwable th2) {
            th = th2;
            close(bufferedReader);
            throw th;
        }
    }

    public static int getPidMemorySize(int i, Context context) {
        if (context == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0].dalvikPss;
        } catch (Exception unused) {
            return 0;
        }
    }
}
