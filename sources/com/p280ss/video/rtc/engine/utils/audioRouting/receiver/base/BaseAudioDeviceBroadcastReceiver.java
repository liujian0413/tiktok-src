package com.p280ss.video.rtc.engine.utils.audioRouting.receiver.base;

import android.content.BroadcastReceiver;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.receiver.base.BaseAudioDeviceBroadcastReceiver */
public abstract class BaseAudioDeviceBroadcastReceiver extends BroadcastReceiver {
    private boolean isRegistered;

    public boolean getRegistered() {
        return this.isRegistered;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }
}
