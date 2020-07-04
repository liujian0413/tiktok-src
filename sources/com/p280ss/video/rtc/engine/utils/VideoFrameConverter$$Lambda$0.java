package com.p280ss.video.rtc.engine.utils;

/* renamed from: com.ss.video.rtc.engine.utils.VideoFrameConverter$$Lambda$0 */
final /* synthetic */ class VideoFrameConverter$$Lambda$0 implements Runnable {
    private final VideoFrameConverter arg$1;
    private final ExtVideoFrame arg$2;

    VideoFrameConverter$$Lambda$0(VideoFrameConverter videoFrameConverter, ExtVideoFrame extVideoFrame) {
        this.arg$1 = videoFrameConverter;
        this.arg$2 = extVideoFrame;
    }

    public final void run() {
        this.arg$1.lambda$getVideoFrame$0$VideoFrameConverter(this.arg$2);
    }
}
