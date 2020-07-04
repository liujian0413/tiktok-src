package com.p280ss.avframework.livestreamv2;

import com.p280ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.IInputAudioStream */
public interface IInputAudioStream {
    int getChannel();

    AudioMixerDescription getMixerDescription();

    int getSample();

    String name();

    int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);

    void release();

    void setMixerDescription(AudioMixerDescription audioMixerDescription);

    int start();

    int stop();
}
