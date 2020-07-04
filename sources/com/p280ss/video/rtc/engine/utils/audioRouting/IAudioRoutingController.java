package com.p280ss.video.rtc.engine.utils.audioRouting;

import android.media.AudioManager;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.IAudioRoutingController */
public interface IAudioRoutingController {
    AudioManager getAudioManager();

    String getAudioRouteDesc(int i);

    RoutingInfo getRoutingInfo();

    boolean isBTHeadsetPlugged();

    boolean isWiredHeadsetPlugged();

    void notifyAudioRoutingChanged(int i);

    int queryCurrentAudioRouting();

    void resetAudioRouting(boolean z);

    void setAudioRouting(int i);

    void stopBtSco();

    int updateBluetoothSco(int i);
}
