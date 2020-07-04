package com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager;

import android.content.Context;
import android.media.AudioManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.BaseAudioDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.EarpieceDeviceManager */
public class EarpieceDeviceManager extends BaseAudioDeviceManager {
    public void inactiveDevice() {
    }

    public void activeDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setSpeakerphoneOn(false);
            audioManager.setBluetoothScoOn(false);
            audioManager.setBluetoothA2dpOn(false);
            audioManager.setWiredHeadsetOn(false);
        }
    }

    public int getActiveState() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && !audioManager.isSpeakerphoneOn() && !audioManager.isBluetoothScoOn() && !audioManager.isBluetoothA2dpOn() && !audioManager.isWiredHeadsetOn()) {
            return 1;
        }
        return 2;
    }

    public EarpieceDeviceManager(Context context, OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        super(context, onNotHotPlugableDeviceCallback);
    }
}
