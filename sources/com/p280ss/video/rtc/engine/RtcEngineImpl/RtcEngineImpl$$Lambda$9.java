package com.p280ss.video.rtc.engine.RtcEngineImpl;

import com.p280ss.video.rtc.engine.VideoCanvas;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$$Lambda$9 */
final /* synthetic */ class RtcEngineImpl$$Lambda$9 implements Runnable {
    private final C46266RtcEngineImpl arg$1;
    private final VideoCanvas arg$2;

    RtcEngineImpl$$Lambda$9(C46266RtcEngineImpl rtcEngineImpl, VideoCanvas videoCanvas) {
        this.arg$1 = rtcEngineImpl;
        this.arg$2 = videoCanvas;
    }

    public final void run() {
        this.arg$1.lambda$setupLocalScreen$9$RtcEngineImpl(this.arg$2);
    }
}
