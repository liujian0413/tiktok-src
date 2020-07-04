package com.p280ss.video.rtc.engine.adapter;

import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.adapter.VideoSinkAdapter$$Lambda$3 */
final /* synthetic */ class VideoSinkAdapter$$Lambda$3 implements Runnable {
    private final VideoSinkAdapter arg$1;
    private final VideoFrame arg$10;
    private final long arg$11;
    private final byte[] arg$2;
    private final byte[] arg$3;
    private final byte[] arg$4;
    private final int arg$5;
    private final int arg$6;
    private final int arg$7;
    private final int arg$8;
    private final int arg$9;

    VideoSinkAdapter$$Lambda$3(VideoSinkAdapter videoSinkAdapter, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, VideoFrame videoFrame, long j) {
        this.arg$1 = videoSinkAdapter;
        this.arg$2 = bArr;
        this.arg$3 = bArr2;
        this.arg$4 = bArr3;
        this.arg$5 = i;
        this.arg$6 = i2;
        this.arg$7 = i3;
        this.arg$8 = i4;
        this.arg$9 = i5;
        this.arg$10 = videoFrame;
        this.arg$11 = j;
    }

    public final void run() {
        this.arg$1.lambda$onVideoFrame$3$VideoSinkAdapter(this.arg$2, this.arg$3, this.arg$4, this.arg$5, this.arg$6, this.arg$7, this.arg$8, this.arg$9, this.arg$10, this.arg$11);
    }
}
