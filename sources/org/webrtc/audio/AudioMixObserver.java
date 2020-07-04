package org.webrtc.audio;

public interface AudioMixObserver {
    void onAudioEffectFinish(int i);

    void onAudioLoopbackFinish();

    void onAudioLoopbackStart();

    void onAudioMixingFinish();
}
