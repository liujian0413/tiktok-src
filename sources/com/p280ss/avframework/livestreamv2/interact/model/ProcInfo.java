package com.p280ss.avframework.livestreamv2.interact.model;

/* renamed from: com.ss.avframework.livestreamv2.interact.model.ProcInfo */
public class ProcInfo {
    private short appCpuUsed;
    private float appUsedMemory;
    private float systemUsedMemory;
    private short totalCpuUsed;

    public short getAppCpuUsed() {
        return this.appCpuUsed;
    }

    public float getAppUsedMemory() {
        return this.appUsedMemory;
    }

    public float getSystemUsedMemory() {
        return this.systemUsedMemory;
    }

    public short getTotalCpuUsed() {
        return this.totalCpuUsed;
    }

    public void setAppCpuUsed(short s) {
        this.appCpuUsed = s;
    }

    public void setAppUsedMemory(float f) {
        this.appUsedMemory = f;
    }

    public void setSystemUsedMemory(float f) {
        this.systemUsedMemory = f;
    }

    public void setTotalCpuUsed(short s) {
        this.totalCpuUsed = s;
    }
}
