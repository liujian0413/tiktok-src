package com.p280ss.video.rtc.engine.adapter;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.adapter.VideoSinkAdapter$$Lambda$2 */
final /* synthetic */ class VideoSinkAdapter$$Lambda$2 implements Runnable {
    private final VideoSinkAdapter arg$1;
    private final ByteBuffer arg$2;
    private final VideoFrame arg$3;
    private final long arg$4;

    VideoSinkAdapter$$Lambda$2(VideoSinkAdapter videoSinkAdapter, ByteBuffer byteBuffer, VideoFrame videoFrame, long j) {
        this.arg$1 = videoSinkAdapter;
        this.arg$2 = byteBuffer;
        this.arg$3 = videoFrame;
        this.arg$4 = j;
    }

    public final void run() {
        this.arg$1.lambda$onVideoFrame$2$VideoSinkAdapter(this.arg$2, this.arg$3, this.arg$4);
    }
}
