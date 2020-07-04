package com.p280ss.video.rtc.engine.client;

import com.p280ss.video.rtc.engine.video.RtcI420Buffer;

/* renamed from: com.ss.video.rtc.engine.client.IVideoRenderer */
public interface IVideoRenderer {
    void renderFrame(String str, RtcI420Buffer rtcI420Buffer);
}
