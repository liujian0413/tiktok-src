package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.RtcEngineEx */
public abstract class RtcEngineEx extends RtcEngine {
    public abstract int enableRecap(int i);

    public abstract int enableTransportQualityIndication(boolean z);

    public abstract String getParameters(String str);

    public abstract String makeQualityReportUrl(String str, int i, int i2, int i3);

    public abstract int monitorAudioRouteChange(boolean z);

    public abstract int playRecap();

    public abstract int setApiCallMode(int i);

    public abstract int setProfile(String str, boolean z);
}
