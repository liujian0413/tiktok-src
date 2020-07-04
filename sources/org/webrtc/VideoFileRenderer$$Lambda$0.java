package org.webrtc;

final /* synthetic */ class VideoFileRenderer$$Lambda$0 implements Runnable {
    private final VideoFileRenderer arg$1;
    private final VideoFrame arg$2;

    VideoFileRenderer$$Lambda$0(VideoFileRenderer videoFileRenderer, VideoFrame videoFrame) {
        this.arg$1 = videoFileRenderer;
        this.arg$2 = videoFrame;
    }

    public final void run() {
        this.arg$1.lambda$onFrame$0$VideoFileRenderer(this.arg$2);
    }
}
