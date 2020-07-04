package com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.BaseHotplugAudioDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager.OnHotPlugDeviceCallback;
import com.p280ss.video.rtc.engine.utils.audioRouting.receiver.WiredHeadsetBroadcastReceiver;
import com.p280ss.video.rtc.engine.utils.audioRouting.receiver.base.BaseAudioDeviceBroadcastReceiver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.WiredHeadsetDeviceManager */
public class WiredHeadsetDeviceManager extends BaseHotplugAudioDeviceManager {

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.WiredHeadsetDeviceManager$WiredHeadsetType */
    public @interface WiredHeadsetType {
    }

    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.WiredHeadsetDeviceManager$OnDeviceCallback */
    public interface OnDeviceCallback extends OnHotPlugDeviceCallback {
        void reportHeadsetType(int i);
    }

    public void onStickyIntentFoundWhenRegister(Intent intent) {
    }

    public IntentFilter getBroadcastIntentFilter() {
        return new IntentFilter("android.intent.action.HEADSET_PLUG");
    }

    public BaseAudioDeviceBroadcastReceiver getBroadcastReceiver() {
        return new WiredHeadsetBroadcastReceiver(this);
    }

    public void inactiveDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setWiredHeadsetOn(false);
        }
    }

    public boolean isDevicePlugged() {
        if (2 == getOnlineState()) {
            return true;
        }
        return false;
    }

    public void activeDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
            audioManager.setWiredHeadsetOn(true);
        }
    }

    public int getActiveState() {
        if (getOnlineState() != 2) {
            return 2;
        }
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && audioManager.isWiredHeadsetOn()) {
            return 1;
        }
        return 2;
    }

    public void reportHeadsetType(int i) {
        if (this.mCallback instanceof OnDeviceCallback) {
            ((OnDeviceCallback) this.mCallback).reportHeadsetType(i);
        }
    }

    public WiredHeadsetDeviceManager(Context context, OnDeviceCallback onDeviceCallback) {
        super(context, onDeviceCallback, true);
    }
}
