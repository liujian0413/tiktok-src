package com.p280ss.video.rtc.engine.utils;

/* renamed from: com.ss.video.rtc.engine.utils.GLHepler$$Lambda$0 */
final /* synthetic */ class GLHepler$$Lambda$0 implements Runnable {
    private final GLHepler arg$1;
    private final int arg$2;
    private final int arg$3;
    private final int arg$4;
    private final int arg$5;

    GLHepler$$Lambda$0(GLHepler gLHepler, int i, int i2, int i3, int i4) {
        this.arg$1 = gLHepler;
        this.arg$2 = i;
        this.arg$3 = i2;
        this.arg$4 = i3;
        this.arg$5 = i4;
    }

    public final void run() {
        this.arg$1.lambda$deliverToTexture2D$0$GLHepler(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
