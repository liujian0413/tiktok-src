package com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager.IHotplugDevice;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager.OnHotPlugDeviceCallback;
import com.p280ss.video.rtc.engine.utils.audioRouting.receiver.base.BaseAudioDeviceBroadcastReceiver;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.BaseHotplugAudioDeviceManager */
public abstract class BaseHotplugAudioDeviceManager extends BaseAudioDeviceManager implements IHotplugDevice {
    private BaseAudioDeviceBroadcastReceiver mBroadcastReceiver;
    protected OnHotPlugDeviceCallback mCallback;
    protected int mOnlineState;

    private void setDeviceOffline() {
        this.mOnlineState = 1;
    }

    private void setDeviceOnline() {
        this.mOnlineState = 2;
    }

    public void destory() {
        onDestroy();
    }

    /* access modifiers changed from: protected */
    public abstract IntentFilter getBroadcastIntentFilter();

    /* access modifiers changed from: protected */
    public abstract BaseAudioDeviceBroadcastReceiver getBroadcastReceiver();

    public int getOnlineState() {
        return this.mOnlineState;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        unRegisterReceiver();
    }

    /* access modifiers changed from: protected */
    public abstract void onStickyIntentFoundWhenRegister(Intent intent);

    public void onDeviceOffline() {
        setDeviceOffline();
        this.mCallback.onDeviceOffline();
    }

    public void onDeviceOnline() {
        setDeviceOnline();
        this.mCallback.onDeviceOnline();
    }

    private void unRegisterReceiver() {
        Context context = getContext();
        if (!(context == null || this.mBroadcastReceiver == null || !this.mBroadcastReceiver.getRegistered())) {
            context.unregisterReceiver(this.mBroadcastReceiver);
            this.mBroadcastReceiver.setRegistered(false);
        }
    }

    public void registerReceiver() {
        Context context = getContext();
        if (context != null && !this.mBroadcastReceiver.getRegistered()) {
            Intent registerReceiver = context.registerReceiver(this.mBroadcastReceiver, getBroadcastIntentFilter());
            this.mBroadcastReceiver.setRegistered(true);
            if (registerReceiver != null) {
                onStickyIntentFoundWhenRegister(registerReceiver);
            }
        }
    }

    public BaseHotplugAudioDeviceManager(Context context, OnHotPlugDeviceCallback onHotPlugDeviceCallback) {
        this(context, onHotPlugDeviceCallback, false);
    }

    public BaseHotplugAudioDeviceManager(Context context, OnHotPlugDeviceCallback onHotPlugDeviceCallback, boolean z) {
        super(context, onHotPlugDeviceCallback);
        this.mCallback = onHotPlugDeviceCallback;
        this.mBroadcastReceiver = getBroadcastReceiver();
        if (z) {
            registerReceiver();
        }
    }
}
