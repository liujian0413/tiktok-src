package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.InternalRemoteAudioStats */
public class InternalRemoteAudioStats {
    public float audioLossRate;
    public long e2eDelay;
    public int receivedKBitrate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public String uid;

    public InternalRemoteAudioStats() {
    }

    public InternalRemoteAudioStats(String str, float f, int i, int i2, int i3, long j, int i4, int i5) {
        this.uid = str;
        this.audioLossRate = f;
        this.receivedKBitrate = i;
        this.stallCount = i2;
        this.stallDuration = i3;
        this.e2eDelay = j;
        this.statsInterval = i4;
        this.rtt = i5;
    }

    private static InternalRemoteAudioStats create(String str, float f, int i, int i2, int i3, long j, int i4, int i5) {
        InternalRemoteAudioStats internalRemoteAudioStats = new InternalRemoteAudioStats(str, f, i, i2, i3, j, i4, i5);
        return internalRemoteAudioStats;
    }
}
