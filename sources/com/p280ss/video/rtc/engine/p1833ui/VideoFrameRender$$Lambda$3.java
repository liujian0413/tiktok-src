package com.p280ss.video.rtc.engine.p1833ui;

/* renamed from: com.ss.video.rtc.engine.ui.VideoFrameRender$$Lambda$3 */
final /* synthetic */ class VideoFrameRender$$Lambda$3 implements Runnable {
    private final VideoFrameRender arg$1;
    private final int arg$2;
    private final int arg$3;

    VideoFrameRender$$Lambda$3(VideoFrameRender videoFrameRender, int i, int i2) {
        this.arg$1 = videoFrameRender;
        this.arg$2 = i;
        this.arg$3 = i2;
    }

    public final void run() {
        this.arg$1.lambda$onFrameResolutionChanged$3$VideoFrameRender(this.arg$2, this.arg$3);
    }
}
