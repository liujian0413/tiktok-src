package com.p280ss.avframework.livestreamv2.audioeffect;

import com.p280ss.avframework.engine.AudioProcessor;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor */
public abstract class AudioEffectProcessor extends AudioProcessor {

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor$Callback */
    public interface Callback {
        void onProgress(long j);

        void start();

        void stop();
    }

    public void getScoreInfo(double[] dArr) {
    }

    public void pause() {
    }

    public void resume() {
    }

    public void seekSingScoring() {
    }

    public abstract void setAudioEq(Object obj);

    public abstract void setAudioReverb(Object obj);

    public abstract void setBGMMusic(String str);

    public abstract void setBGMMusic(String str, long j);

    public abstract void setBGMProgressListener(Callback callback);

    public abstract void setBGMVolume(float f);

    public abstract void setDRCEnable(boolean z);

    public abstract void setMusicPitch(int i);

    public int setScoringSources(String str, int[] iArr) {
        return -1;
    }

    public abstract void setVoiceVolume(float f);
}
