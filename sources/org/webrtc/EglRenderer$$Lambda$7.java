package org.webrtc;

final /* synthetic */ class EglRenderer$$Lambda$7 implements Runnable {
    private final EglRenderer arg$1;
    private final float arg$2;
    private final float arg$3;
    private final float arg$4;
    private final float arg$5;

    EglRenderer$$Lambda$7(EglRenderer eglRenderer, float f, float f2, float f3, float f4) {
        this.arg$1 = eglRenderer;
        this.arg$2 = f;
        this.arg$3 = f2;
        this.arg$4 = f3;
        this.arg$5 = f4;
    }

    public final void run() {
        this.arg$1.lambda$clearImage$6$EglRenderer(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
