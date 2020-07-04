package com.p280ss.avframework.livestreamv2.interact.statistic;

import android.content.Context;
import android.os.Process;
import com.p280ss.avframework.livestreamv2.interact.utils.MonitorUtils;

/* renamed from: com.ss.avframework.livestreamv2.interact.statistic.ProcInfoStatistics */
public class ProcInfoStatistics {
    private long appCpuTime;
    private short appCpuUsage;
    private boolean hasInit;
    private boolean hasReportOnce;
    private Context mContext;
    private long totalCpuTime;
    private short totalCpuUsage;
    private long usedCpuTime;

    public long getSysUsedMemorySize() {
        return MonitorUtils.getSysUsedMemory(this.mContext);
    }

    public void init() {
        setCpuCheckPoint();
        this.hasInit = true;
    }

    public short getAppCpuUsage() {
        if (this.hasInit) {
            return this.appCpuUsage;
        }
        return -1;
    }

    public int getAppUsedMemorySize() {
        return MonitorUtils.getPidMemorySize(Process.myPid(), this.mContext);
    }

    public short getTotalCpuUsage() {
        if (this.hasInit) {
            return this.totalCpuUsage;
        }
        return -1;
    }

    public void setCpuCheckPoint() {
        this.totalCpuTime = MonitorUtils.getTotalCPUTime();
        this.usedCpuTime = MonitorUtils.getUsedCPUTime();
        this.appCpuTime = MonitorUtils.getAppCPUTime(Process.myPid());
    }

    public void getAvgCpuUsage() {
        float totalCPUTime = ((float) MonitorUtils.getTotalCPUTime()) - ((float) this.totalCpuTime);
        float usedCPUTime = ((float) MonitorUtils.getUsedCPUTime()) - ((float) this.usedCpuTime);
        float appCPUTime = ((float) MonitorUtils.getAppCPUTime(Process.myPid())) - ((float) this.appCpuTime);
        if (totalCPUTime > 0.0f) {
            if (appCPUTime > 0.0f) {
                this.appCpuUsage = (short) Math.round((appCPUTime / totalCPUTime) * 100.0f);
            }
            if (usedCPUTime > 0.0f) {
                this.totalCpuUsage = (short) Math.round((usedCPUTime / totalCPUTime) * 100.0f);
            }
        }
    }

    public ProcInfoStatistics(Context context) {
        this.mContext = context;
    }
}
