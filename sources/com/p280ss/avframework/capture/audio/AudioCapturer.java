package com.p280ss.avframework.capture.audio;

import com.p280ss.avframework.engine.AudioSource;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.capture.audio.AudioCapturer */
public abstract class AudioCapturer extends AudioSource {
    private int mMode = 1;
    private boolean mMute;

    /* renamed from: com.ss.avframework.capture.audio.AudioCapturer$AudioCaptureObserver */
    public interface AudioCaptureObserver {
        void onAudioCaptureError(int i, Exception exc);
    }

    public int getMode() {
        return this.mMode;
    }

    public boolean isMute() {
        return this.mMute;
    }

    public void pause() {
    }

    public void resume() {
    }

    public abstract void start();

    public abstract void stop();

    public abstract int updateChannel();

    public synchronized void release() {
        super.release();
    }

    public void setAudioQuantizeGapPeriod(long j) {
        nativeSetAudioQuantizeGapPeriod(j);
    }

    public void setMode(int i) {
        this.mMode = i;
    }

    public void setVolume(double d) {
        nativeSetVolume(d);
    }

    public void mute(boolean z) {
        double d;
        this.mMute = z;
        if (z) {
            d = 0.0d;
        } else {
            d = 1.0d;
        }
        nativeSetVolume(d);
    }

    public void setOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
    }
}
