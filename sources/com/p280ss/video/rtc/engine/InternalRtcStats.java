package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.InternalRtcStats */
public class InternalRtcStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int rxAudioKBitRate;
    public int rxBytes;
    public int rxKBitRate;
    public int rxVideoKBitRate;
    public int totalDuration;
    public int txAudioKBitRate;
    public int txBytes;
    public int txKBitRate;
    public int txVideoKBitRate;
    public int users;

    public InternalRtcStats() {
    }

    public void reset() {
        this.totalDuration = 0;
        this.txBytes = 0;
        this.rxBytes = 0;
        this.txKBitRate = 0;
        this.rxKBitRate = 0;
        this.txAudioKBitRate = 0;
        this.rxAudioKBitRate = 0;
        this.txVideoKBitRate = 0;
        this.rxVideoKBitRate = 0;
        this.users = 0;
        this.cpuTotalUsage = 0.0d;
        this.cpuAppUsage = 0.0d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RtcStats{totalDuration=");
        sb.append(this.totalDuration);
        sb.append(", txBytes=");
        sb.append(this.txBytes);
        sb.append(", rxBytes=");
        sb.append(this.rxBytes);
        sb.append(", txKBitRate=");
        sb.append(this.txKBitRate);
        sb.append(", rxKBitRate=");
        sb.append(this.rxKBitRate);
        sb.append(", txAudioKBitRate=");
        sb.append(this.txAudioKBitRate);
        sb.append(", rxAudioKBitRate=");
        sb.append(this.rxAudioKBitRate);
        sb.append(", txVideoKBitRate=");
        sb.append(this.txVideoKBitRate);
        sb.append(", rxVideoKBitRate=");
        sb.append(this.rxVideoKBitRate);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", cpuTotalUsage=");
        sb.append(this.cpuTotalUsage);
        sb.append(", cpuAppUsage=");
        sb.append(this.cpuAppUsage);
        sb.append('}');
        return sb.toString();
    }

    public InternalRtcStats(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.totalDuration = i;
        this.txBytes = i2;
        this.rxBytes = i3;
        this.txKBitRate = i4;
        this.rxKBitRate = i5;
        this.txAudioKBitRate = i6;
        this.rxAudioKBitRate = i7;
        this.txVideoKBitRate = i8;
        this.rxVideoKBitRate = i9;
        this.users = i10;
    }

    private static InternalRtcStats create(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        InternalRtcStats internalRtcStats = new InternalRtcStats(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        return internalRtcStats;
    }
}
