package com.zego.zegoavkit2.hardwaremonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import java.lang.reflect.Method;

public class ZegoMEMUtils {
    public static long[] getHeapNative() {
        return new long[]{Debug.getNativeHeapSize() >> 10, Debug.getNativeHeapAllocatedSize() >> 10};
    }

    public static long[] getHeap() {
        long[] heapNative = getHeapNative();
        long[] heapDalvik = getHeapDalvik();
        return new long[]{heapNative[0], heapNative[1], heapDalvik[0], heapDalvik[1], heapNative[0] + heapDalvik[0], heapNative[1] + heapDalvik[1]};
    }

    public static long[] getHeapDalvik() {
        return new long[]{Runtime.getRuntime().totalMemory() >> 10, (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 10};
    }

    public static long[] getMemInfo() {
        long[] jArr = new long[4];
        try {
            Method method = Class.forName("android.os.Process").getMethod("readProcLines", new Class[]{String.class, String[].class, long[].class});
            String[] strArr = {"MemTotal:", "MemFree:", "Buffers:", "Cached:"};
            long[] jArr2 = new long[4];
            jArr2[0] = 30;
            jArr2[1] = -30;
            Object[] objArr = {new String("/proc/meminfo"), strArr, jArr2};
            if (method != null) {
                method.invoke(null, objArr);
                for (int i = 0; i < 4; i++) {
                    jArr[i] = jArr2[i] / 1024;
                }
            }
        } catch (Exception unused) {
        }
        return jArr;
    }

    public static long[] getPSS(Context context, int i) {
        long[] jArr = new long[3];
        if (i >= 0) {
            MemoryInfo memoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{i})[0];
            jArr[0] = (long) memoryInfo.nativePss;
            jArr[1] = (long) memoryInfo.dalvikPss;
            jArr[2] = (long) memoryInfo.getTotalPss();
        } else {
            jArr[0] = 0;
            jArr[1] = 0;
            jArr[2] = 0;
        }
        return jArr;
    }

    public static long[] getPrivDirty(Context context, int i) {
        MemoryInfo memoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{i})[0];
        return new long[]{(long) memoryInfo.nativePrivateDirty, (long) memoryInfo.dalvikPrivateDirty, (long) memoryInfo.getTotalPrivateDirty()};
    }
}
