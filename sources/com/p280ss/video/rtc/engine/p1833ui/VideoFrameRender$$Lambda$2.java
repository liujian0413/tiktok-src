package com.p280ss.video.rtc.engine.p1833ui;

import org.webrtc.EglBase.Context;

/* renamed from: com.ss.video.rtc.engine.ui.VideoFrameRender$$Lambda$2 */
final /* synthetic */ class VideoFrameRender$$Lambda$2 implements Runnable {
    private final VideoFrameRender arg$1;
    private final Context arg$2;

    VideoFrameRender$$Lambda$2(VideoFrameRender videoFrameRender, Context context) {
        this.arg$1 = videoFrameRender;
        this.arg$2 = context;
    }

    public final void run() {
        this.arg$1.lambda$init$2$VideoFrameRender(this.arg$2);
    }
}
