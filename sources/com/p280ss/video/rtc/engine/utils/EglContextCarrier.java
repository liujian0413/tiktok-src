package com.p280ss.video.rtc.engine.utils;

import org.webrtc.EglBase.Context;

/* renamed from: com.ss.video.rtc.engine.utils.EglContextCarrier */
public interface EglContextCarrier {
    Context getEglBaseContext();

    void setEglBaseContext(Context context);
}
