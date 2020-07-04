package com.p280ss.video.rtc.engine.RtcEngineImpl;

import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel;
import com.p280ss.video.rtc.engine.utils.LogUtil.LoggerSink;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$$Lambda$0 */
final /* synthetic */ class RtcEngineImpl$$Lambda$0 implements LoggerSink {
    static final LoggerSink $instance = new RtcEngineImpl$$Lambda$0();

    private RtcEngineImpl$$Lambda$0() {
    }

    public final void onLoggerMessage(RtcLogLevel rtcLogLevel, String str, Throwable th) {
        C46266RtcEngineImpl.lambda$new$0$RtcEngineImpl(rtcLogLevel, str, th);
    }
}
