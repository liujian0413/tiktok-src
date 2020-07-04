package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.InternalLocalVideoStats */
public class InternalLocalVideoStats {
    public int encoderOutputFrameRate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int sentFrameRate;
    public float sentKBitrate;
    public int statsInterval;
    public int targetFrameRate;
    public int targetKBitrate;
    public float videoLossRate;

    public InternalLocalVideoStats() {
    }

    public InternalLocalVideoStats(float f, int i, int i2, int i3, int i4, int i5, int i6, float f2, int i7) {
        this.sentKBitrate = f;
        this.sentFrameRate = i;
        this.encoderOutputFrameRate = i2;
        this.rendererOutputFrameRate = i3;
        this.targetKBitrate = i4;
        this.targetFrameRate = i5;
        this.statsInterval = i6;
        this.videoLossRate = f2;
        this.rtt = i7;
    }

    private static InternalLocalVideoStats create(float f, int i, int i2, int i3, int i4, int i5, int i6, float f2, int i7) {
        InternalLocalVideoStats internalLocalVideoStats = new InternalLocalVideoStats(f, i, i2, i3, i4, i5, i6, f2, i7);
        return internalLocalVideoStats;
    }
}
