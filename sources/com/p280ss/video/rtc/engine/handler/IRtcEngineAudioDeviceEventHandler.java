package com.p280ss.video.rtc.engine.handler;

/* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler */
public interface IRtcEngineAudioDeviceEventHandler {
    void onAudioDevicePlayoutStart();

    void onAudioDevicePlayoutStop();

    void onAudioDeviceRecordStart();

    void onAudioDeviceRecordStop();
}
