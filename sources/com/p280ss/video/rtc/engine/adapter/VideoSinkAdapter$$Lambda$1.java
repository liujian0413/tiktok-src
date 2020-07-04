package com.p280ss.video.rtc.engine.adapter;

import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.adapter.VideoSinkAdapter$$Lambda$1 */
final /* synthetic */ class VideoSinkAdapter$$Lambda$1 implements Runnable {
    private final VideoSinkAdapter arg$1;
    private final byte[] arg$2;
    private final VideoFrame arg$3;
    private final long arg$4;

    VideoSinkAdapter$$Lambda$1(VideoSinkAdapter videoSinkAdapter, byte[] bArr, VideoFrame videoFrame, long j) {
        this.arg$1 = videoSinkAdapter;
        this.arg$2 = bArr;
        this.arg$3 = videoFrame;
        this.arg$4 = j;
    }

    public final void run() {
        this.arg$1.lambda$onVideoFrame$1$VideoSinkAdapter(this.arg$2, this.arg$3, this.arg$4);
    }
}
