package org.webrtc;

final /* synthetic */ class Camera2Session$CaptureSessionCallback$$Lambda$0 implements VideoSink {
    private final CaptureSessionCallback arg$1;

    Camera2Session$CaptureSessionCallback$$Lambda$0(CaptureSessionCallback captureSessionCallback) {
        this.arg$1 = captureSessionCallback;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.arg$1.lambda$onConfigured$0$Camera2Session$CaptureSessionCallback(videoFrame);
    }
}
