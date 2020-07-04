package com.p280ss.video.rtc.engine.RtcEngineImpl;

import com.p280ss.video.rtc.engine.VideoCanvas;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$$Lambda$6 */
final /* synthetic */ class RtcEngineImpl$$Lambda$6 implements Runnable {
    private final C46266RtcEngineImpl arg$1;
    private final VideoCanvas arg$2;

    RtcEngineImpl$$Lambda$6(C46266RtcEngineImpl rtcEngineImpl, VideoCanvas videoCanvas) {
        this.arg$1 = rtcEngineImpl;
        this.arg$2 = videoCanvas;
    }

    public final void run() {
        this.arg$1.lambda$setupRemoteScreen$6$RtcEngineImpl(this.arg$2);
    }
}
