package org.webrtc;

final /* synthetic */ class SurfaceTextureHelper$$Lambda$2 implements Runnable {
    private final SurfaceTextureHelper arg$1;
    private final int arg$2;
    private final int arg$3;

    SurfaceTextureHelper$$Lambda$2(SurfaceTextureHelper surfaceTextureHelper, int i, int i2) {
        this.arg$1 = surfaceTextureHelper;
        this.arg$2 = i;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.lambda$setTextureSize$2$SurfaceTextureHelper(this.arg$2, this.arg$3);
    }
}
