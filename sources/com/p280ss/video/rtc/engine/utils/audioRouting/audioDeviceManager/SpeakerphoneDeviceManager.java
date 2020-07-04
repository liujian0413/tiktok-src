package com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager;

import android.content.Context;
import android.media.AudioManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.BaseAudioDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.SpeakerphoneDeviceManager */
public class SpeakerphoneDeviceManager extends BaseAudioDeviceManager {
    public void activeDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.stopBluetoothSco();
            audioManager.setSpeakerphoneOn(true);
        }
    }

    public void inactiveDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setSpeakerphoneOn(false);
        }
    }

    public int getActiveState() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && audioManager.isSpeakerphoneOn()) {
            return 1;
        }
        return 2;
    }

    public SpeakerphoneDeviceManager(Context context, OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        super(context, onNotHotPlugableDeviceCallback);
    }
}
