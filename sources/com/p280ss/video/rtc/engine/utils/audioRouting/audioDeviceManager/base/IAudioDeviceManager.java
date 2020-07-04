package com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager */
public interface IAudioDeviceManager {

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager$ActiveState */
    public @interface ActiveState {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager$OnlineState */
    public @interface OnlineState {
    }

    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager$HotplugDeviceListener */
    public interface HotplugDeviceListener extends NotHotPlugableDeviceListener {
        void onDeviceOffline();

        void onDeviceOnline();
    }

    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager$IHotplugDevice */
    public interface IHotplugDevice extends HotplugDeviceListener {
        int getOnlineState();
    }

    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager$INotHotPlugableDevice */
    public interface INotHotPlugableDevice extends NotHotPlugableDeviceListener {
        void activeDevice();

        int getActiveState();

        void inactiveDevice();

        boolean isActive();
    }

    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager$NotHotPlugableDeviceListener */
    public interface NotHotPlugableDeviceListener {
    }

    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager$OnHotPlugDeviceCallback */
    public interface OnHotPlugDeviceCallback extends HotplugDeviceListener, OnNotHotPlugableDeviceCallback {
    }

    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager$OnNotHotPlugableDeviceCallback */
    public interface OnNotHotPlugableDeviceCallback extends NotHotPlugableDeviceListener {
        void onError(int i, String str);
    }
}
