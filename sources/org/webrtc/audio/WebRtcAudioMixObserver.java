package org.webrtc.audio;

import org.webrtc.Logging;

public class WebRtcAudioMixObserver {
    private final AudioMixObserver audioMixObserver;

    public void onAudioLoopbackFinish() {
        Logging.m150047d("WebRtcAudioMixObserver", "onAudioLoopbackFinish... ");
        if (this.audioMixObserver != null) {
            this.audioMixObserver.onAudioLoopbackFinish();
        }
    }

    public void onAudioLoopbackStart() {
        Logging.m150047d("WebRtcAudioMixObserver", "onAudioLoopbackStart... ");
        if (this.audioMixObserver != null) {
            this.audioMixObserver.onAudioLoopbackStart();
        }
    }

    public void onAudioMixingFinish() {
        Logging.m150047d("WebRtcAudioMixObserver", "onAudioMixingFinish... ");
        if (this.audioMixObserver != null) {
            this.audioMixObserver.onAudioMixingFinish();
        }
    }

    public WebRtcAudioMixObserver(AudioMixObserver audioMixObserver2) {
        this.audioMixObserver = audioMixObserver2;
    }

    public void onAudioEffectFinish(int i) {
        Logging.m150047d("WebRtcAudioMixObserver", "onAudioEffectFinish... ");
        if (this.audioMixObserver != null) {
            this.audioMixObserver.onAudioEffectFinish(i);
        }
    }
}
