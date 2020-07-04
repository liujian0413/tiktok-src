package com.zego.zegoavkit2.soundlevel;

import android.os.Handler;
import android.os.Looper;

final class ZegoSoundLevelJNI {
    private IZegoSoundLevelCallback mCallback;
    private Handler mHandler;

    ZegoSoundLevelJNI() {
    }

    public final native boolean setCycle(int i);

    public final native boolean start();

    public final native boolean stop();

    public final void onCaptureSoundLevelUpdate(final ZegoSoundLevelInfo zegoSoundLevelInfo) {
        Handler handler = this.mHandler;
        final IZegoSoundLevelCallback iZegoSoundLevelCallback = this.mCallback;
        if (handler != null && iZegoSoundLevelCallback != null) {
            handler.post(new Runnable() {
                public void run() {
                    iZegoSoundLevelCallback.onCaptureSoundLevelUpdate(zegoSoundLevelInfo);
                }
            });
        }
    }

    public final void onSoundLevelUpdate(final ZegoSoundLevelInfo[] zegoSoundLevelInfoArr) {
        Handler handler = this.mHandler;
        final IZegoSoundLevelCallback iZegoSoundLevelCallback = this.mCallback;
        if (handler != null && iZegoSoundLevelCallback != null) {
            handler.post(new Runnable() {
                public void run() {
                    iZegoSoundLevelCallback.onSoundLevelUpdate(zegoSoundLevelInfoArr);
                }
            });
        }
    }

    public final void setCallback(IZegoSoundLevelCallback iZegoSoundLevelCallback) {
        this.mCallback = iZegoSoundLevelCallback;
        if (iZegoSoundLevelCallback != null) {
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.getMainLooper());
            }
        } else if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
    }
}
