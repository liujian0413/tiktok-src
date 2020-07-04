package com.p280ss.video.rtc.engine.utils.audioRouting;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.BaseAudioRoutingController */
public abstract class BaseAudioRoutingController implements IAudioRoutingController {
    private RoutingInfo mRoutingInfo = new RoutingInfo();

    public RoutingInfo getRoutingInfo() {
        return this.mRoutingInfo;
    }
}
