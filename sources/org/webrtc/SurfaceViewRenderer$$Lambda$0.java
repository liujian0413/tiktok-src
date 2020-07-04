package org.webrtc;

final /* synthetic */ class SurfaceViewRenderer$$Lambda$0 implements Runnable {
    private final SurfaceViewRenderer arg$1;
    private final int arg$2;
    private final int arg$3;

    SurfaceViewRenderer$$Lambda$0(SurfaceViewRenderer surfaceViewRenderer, int i, int i2) {
        this.arg$1 = surfaceViewRenderer;
        this.arg$2 = i;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.lambda$onFrameResolutionChanged$0$SurfaceViewRenderer(this.arg$2, this.arg$3);
    }
}
