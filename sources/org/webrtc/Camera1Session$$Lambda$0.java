package org.webrtc;

final /* synthetic */ class Camera1Session$$Lambda$0 implements VideoSink {
    private final Camera1Session arg$1;

    Camera1Session$$Lambda$0(Camera1Session camera1Session) {
        this.arg$1 = camera1Session;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.arg$1.lambda$listenForTextureFrames$0$Camera1Session(videoFrame);
    }
}
