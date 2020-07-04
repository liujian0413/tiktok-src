package org.webrtc;

import org.webrtc.VideoFrame.I420Buffer;

final /* synthetic */ class VideoFileRenderer$$Lambda$1 implements Runnable {
    private final VideoFileRenderer arg$1;
    private final I420Buffer arg$2;
    private final VideoFrame arg$3;

    VideoFileRenderer$$Lambda$1(VideoFileRenderer videoFileRenderer, I420Buffer i420Buffer, VideoFrame videoFrame) {
        this.arg$1 = videoFileRenderer;
        this.arg$2 = i420Buffer;
        this.arg$3 = videoFrame;
    }

    public final void run() {
        this.arg$1.lambda$renderFrameOnRenderThread$1$VideoFileRenderer(this.arg$2, this.arg$3);
    }
}
