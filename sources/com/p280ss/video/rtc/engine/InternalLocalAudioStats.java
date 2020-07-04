package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.InternalLocalAudioStats */
public class InternalLocalAudioStats {
    public float audioLossRate;
    public int rtt;
    public int sendKBitrate;
    public int statsInterval;

    public InternalLocalAudioStats() {
    }

    private static InternalLocalAudioStats create(float f, int i, int i2, int i3) {
        return new InternalLocalAudioStats(f, i, i2, i3);
    }

    public InternalLocalAudioStats(float f, int i, int i2, int i3) {
        this.audioLossRate = f;
        this.sendKBitrate = i;
        this.statsInterval = i2;
        this.rtt = i3;
    }
}
