package com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base;

import android.content.Context;
import android.media.AudioManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager.OnNotHotPlugableDeviceCallback;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.BaseAudioDeviceManager */
public abstract class BaseAudioDeviceManager implements INotHotPlugableDevice {
    private OnNotHotPlugableDeviceCallback mCallback;
    private WeakReference<Context> mContext;

    /* access modifiers changed from: protected */
    public Context getContext() {
        return (Context) this.mContext.get();
    }

    public boolean isActive() {
        if (getActiveState() == 1) {
            return true;
        }
        return false;
    }

    public AudioManager getAudioManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    /* access modifiers changed from: protected */
    public void onError(int i, String str) {
        this.mCallback.onError(i, str);
    }

    public BaseAudioDeviceManager(Context context, OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        this.mContext = new WeakReference<>(context);
        this.mCallback = onNotHotPlugableDeviceCallback;
    }
}
