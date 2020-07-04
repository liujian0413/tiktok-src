package com.p280ss.avframework.livestreamv2.audioeffect;

import com.p280ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor.Callback;
import com.p280ss.avframework.livestreamv2.filter.IAudioFilterManager;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.DummyAudioFilterManager */
public class DummyAudioFilterManager extends IAudioFilterManager {
    public String name() {
        return "DummyAudioFilter";
    }

    public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        return buffer;
    }

    public void setAudioEq(Object obj) {
    }

    public void setAudioReverb(Object obj) {
    }

    public void setBGMMusic(String str) {
    }

    public void setBGMMusic(String str, long j) {
    }

    public void setBGMProgressListener(Callback callback) {
    }

    public void setBGMVolume(float f) {
    }

    public void setDRCEnable(boolean z) {
    }

    public void setMusicPitch(int i) {
    }

    public void setVoiceVolume(float f) {
    }
}
