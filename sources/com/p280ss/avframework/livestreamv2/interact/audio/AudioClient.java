package com.p280ss.avframework.livestreamv2.interact.audio;

/* renamed from: com.ss.avframework.livestreamv2.interact.audio.AudioClient */
public interface AudioClient {
    int getBitWidth();

    int getChannelCount();

    int getSampleRate();

    void prepare(AudioCallback audioCallback);

    void release();

    void start();

    void stop();
}
