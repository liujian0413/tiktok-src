package com.zego.zegoavkit2.hardwaremonitor;

import android.content.Context;
import android.os.Process;

public final class ZegoHardwareMonitor {
    public static double getSystemCPUUsage() {
        return ZegoCPUUtils.getSystemCPUUsage();
    }

    public static double getProcessCPUUsage() {
        return ZegoCPUUtils.getProcessCPUUsage(Process.myPid());
    }

    public static double getMEMTotal(Context context) {
        return (double) ZegoMEMUtils.getMemInfo()[0];
    }

    public static double getSystemMEMUsage(Context context) {
        long[] memInfo = ZegoMEMUtils.getMemInfo();
        return (double) (memInfo[0] - memInfo[1]);
    }

    public static double getMEMUsage(Context context) {
        double d = (double) ZegoMEMUtils.getPSS(context, Process.myPid())[2];
        Double.isNaN(d);
        return d / 1024.0d;
    }
}
