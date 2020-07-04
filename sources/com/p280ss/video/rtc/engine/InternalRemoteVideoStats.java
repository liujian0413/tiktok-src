package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.InternalRemoteVideoStats */
public class InternalRemoteVideoStats {
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int height;
    public boolean isScreen;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public String uid;
    public float videoLossRate;
    public int width;

    public InternalRemoteVideoStats() {
    }

    public InternalRemoteVideoStats(String str, int i, int i2, float f, float f2, int i3, int i4, int i5, long j, boolean z, int i6, int i7) {
        this.uid = str;
        this.width = i;
        this.height = i2;
        this.videoLossRate = f;
        this.receivedKBitrate = f2;
        this.decoderOutputFrameRate = i3;
        this.rendererOutputFrameRate = i4;
        this.stallCount = i5;
        this.e2eDelay = j;
        this.isScreen = z;
        this.statsInterval = i6;
        this.rtt = i7;
    }

    private static InternalRemoteVideoStats create(String str, int i, int i2, float f, float f2, int i3, int i4, int i5, long j, boolean z, int i6, int i7) {
        InternalRemoteVideoStats internalRemoteVideoStats = new InternalRemoteVideoStats(str, i, i2, f, f2, i3, i4, i5, j, z, i6, i7);
        return internalRemoteVideoStats;
    }
}
