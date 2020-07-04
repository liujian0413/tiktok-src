package com.p280ss.avframework.livestreamv2.interact.audio;

/* renamed from: com.ss.avframework.livestreamv2.interact.audio.AudioClientFactory */
public interface AudioClientFactory {
    AudioClient create();

    void destroy(AudioClient audioClient);
}
