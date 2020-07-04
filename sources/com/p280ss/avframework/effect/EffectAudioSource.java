package com.p280ss.avframework.effect;

import com.p280ss.avframework.capture.audio.AudioCapturer;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.effect.EffectAudioSource */
class EffectAudioSource extends AudioCapturer {
    private int mChannel;
    private int mStatus;

    private native void nativeCreate(long j);

    private native void nativePause();

    private native void nativeResume();

    private native int nativeStart();

    private native void nativeStop();

    public void pause() {
        nativePause();
    }

    public void resume() {
        nativeResume();
    }

    public int status() {
        return this.mStatus;
    }

    public int updateChannel() {
        return this.mChannel;
    }

    public void stop() {
        if (this.mStatus != 0 && this.mStatus != 2) {
            nativeStop();
            this.mStatus = 2;
        }
    }

    public void start() {
        if (this.mStatus == 0 || this.mStatus == 2) {
            int nativeStart = nativeStart();
            if (nativeStart == 0) {
                this.mStatus = 1;
                return;
            }
            StringBuilder sb = new StringBuilder("EffectAudioSource.Start failure (");
            sb.append(nativeStart);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
    }

    public EffectAudioSource(long j) {
        nativeCreate(j);
    }

    public void setOutputFormat(int i, int i2, int i3) {
        this.mChannel = i2;
        super.setOutputFormat(i, i2, i3);
    }
}
