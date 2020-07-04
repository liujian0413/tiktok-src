package com.p280ss.video.rtc.engine.handler;

import com.p280ss.video.rtc.engine.RtcEngineImpl.C46266RtcEngineImpl;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import org.webrtc.audio.AudioDeviceObserver;

/* renamed from: com.ss.video.rtc.engine.handler.EngineAudioDeviceEventHandler */
public class EngineAudioDeviceEventHandler implements AudioDeviceObserver {
    public void onAudioDevicePlayoutStart() {
        LogUtil.m145281i("EngineAudioDeviceEventHandler", "onAudioDevicePlayoutStart...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = C46266RtcEngineImpl.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDevicePlayoutStart();
        }
    }

    public void onAudioDevicePlayoutStop() {
        LogUtil.m145281i("EngineAudioDeviceEventHandler", "onAudioDevicePlayoutStop...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = C46266RtcEngineImpl.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDevicePlayoutStop();
        }
    }

    public void onAudioDeviceRecordStart() {
        LogUtil.m145281i("EngineAudioDeviceEventHandler", "onAudioDeviceRecordStart...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = C46266RtcEngineImpl.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDeviceRecordStart();
        }
    }

    public void onAudioDeviceRecordStop() {
        LogUtil.m145281i("EngineAudioDeviceEventHandler", "onAudioDeviceRecordStop...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = C46266RtcEngineImpl.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDeviceRecordStop();
        }
    }
}
