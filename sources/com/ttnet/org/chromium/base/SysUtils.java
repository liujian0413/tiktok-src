package com.ttnet.org.chromium.base;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.metrics.CachedMetrics.BooleanHistogramSample;

@JNINamespace("base::android")
public class SysUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Integer sAmountOfPhysicalMemoryKB;
    private static Boolean sHighEndDiskDevice;
    private static Boolean sLowEndDevice;
    private static BooleanHistogramSample sLowEndMatches = new BooleanHistogramSample("Android.SysUtilsLowEndMatches");

    private SysUtils() {
    }

    public static void logPageFaultCountToTracing() {
        nativeLogPageFaultCountToTracing();
    }

    private static native void nativeLogPageFaultCountToTracing();

    public static void resetForTesting() {
        sLowEndDevice = null;
        sAmountOfPhysicalMemoryKB = null;
    }

    public static int amountOfPhysicalMemoryKB() {
        if (sAmountOfPhysicalMemoryKB == null) {
            sAmountOfPhysicalMemoryKB = Integer.valueOf(detectAmountOfPhysicalMemoryKB());
        }
        return sAmountOfPhysicalMemoryKB.intValue();
    }

    public static boolean isCurrentlyLowMemory() {
        ActivityManager activityManager = (ActivityManager) ContextUtils.getApplicationContext().getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static boolean isHighEndDiskDevice() {
        if (sHighEndDiskDevice == null) {
            sHighEndDiskDevice = Boolean.valueOf(detectHighEndDiskDevice());
        }
        return sHighEndDiskDevice.booleanValue();
    }

    public static boolean isLowEndDevice() {
        if (sLowEndDevice == null) {
            sLowEndDevice = Boolean.valueOf(detectLowEndDevice());
        }
        return sLowEndDevice.booleanValue();
    }

    private static boolean detectHighEndDiskDevice() {
        StrictModeContext allowDiskReads;
        boolean z;
        try {
            allowDiskReads = StrictModeContext.allowDiskReads();
            if (new StatFs(Environment.getDataDirectory().getAbsolutePath()).getTotalBytes() / 1073741824 >= 24) {
                z = true;
            } else {
                z = false;
            }
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return z;
        } catch (IllegalArgumentException unused) {
            return false;
        } catch (Throwable th) {
            C6497a.m20181a(r2, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = java.lang.Integer.parseInt(r4.group(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r0 <= 1024) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        android.os.StrictMode.setThreadPolicy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int detectAmountOfPhysicalMemoryKB() {
        /*
            java.lang.String r0 = "^MemTotal:\\s+([0-9]+) kB$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            java.lang.String r3 = "/proc/meminfo"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0049 }
            r3.<init>(r2)     // Catch:{ all -> 0x0049 }
        L_0x0016:
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x003d
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0044 }
            boolean r5 = r4.find()     // Catch:{ all -> 0x0044 }
            if (r5 == 0) goto L_0x0016
            r0 = 1
            java.lang.String r0 = r4.group(r0)     // Catch:{ all -> 0x0044 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0044 }
            r4 = 1024(0x400, float:1.435E-42)
            if (r0 <= r4) goto L_0x003d
            r3.close()     // Catch:{ all -> 0x0049 }
            r2.close()     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            android.os.StrictMode.setThreadPolicy(r1)
            return r0
        L_0x003d:
            r3.close()     // Catch:{ all -> 0x0049 }
            r2.close()     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            goto L_0x0053
        L_0x0044:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            r2.close()     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            throw r0     // Catch:{ Exception -> 0x0053, all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)
            throw r0
        L_0x0053:
            android.os.StrictMode.setThreadPolicy(r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.SysUtils.detectAmountOfPhysicalMemoryKB():int");
    }

    private static boolean detectLowEndDevice() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (CommandLine.getInstance().hasSwitch("enable-low-end-device-mode")) {
            return true;
        }
        if (CommandLine.getInstance().hasSwitch("disable-low-end-device-mode")) {
            return false;
        }
        Integer valueOf = Integer.valueOf(detectAmountOfPhysicalMemoryKB());
        sAmountOfPhysicalMemoryKB = valueOf;
        if (valueOf.intValue() <= 0 || (VERSION.SDK_INT < 26 ? sAmountOfPhysicalMemoryKB.intValue() / PreloadTask.BYTE_UNIT_NUMBER > 512 : sAmountOfPhysicalMemoryKB.intValue() / PreloadTask.BYTE_UNIT_NUMBER > 1024)) {
            z = false;
        } else {
            z = true;
        }
        if (ContextUtils.getApplicationContext() == null || VERSION.SDK_INT < 19) {
            z2 = false;
        } else {
            z2 = ((ActivityManager) ContextUtils.getApplicationContext().getSystemService("activity")).isLowRamDevice();
        }
        BooleanHistogramSample booleanHistogramSample = sLowEndMatches;
        if (z != z2) {
            z3 = false;
        }
        booleanHistogramSample.record(z3);
        return z;
    }

    public static boolean hasCamera(Context context) {
        PackageManager packageManager = context.getPackageManager();
        boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        if (VERSION.SDK_INT >= 17) {
            return hasSystemFeature | packageManager.hasSystemFeature("android.hardware.camera.any");
        }
        return hasSystemFeature;
    }
}
