package org.webrtc;

final /* synthetic */ class Camera1Session$2$$Lambda$0 implements Runnable {
    private final C483682 arg$1;
    private final byte[] arg$2;

    Camera1Session$2$$Lambda$0(C483682 r1, byte[] bArr) {
        this.arg$1 = r1;
        this.arg$2 = bArr;
    }

    public final void run() {
        this.arg$1.lambda$onPreviewFrame$1$Camera1Session$2(this.arg$2);
    }
}
