package org.webrtc.audio;

import org.webrtc.Logging;

class WebRtcAudioDeviceObserver {
    private final AudioDeviceObserver audioDeviceObserver;

    public void onAudioDevicePlayoutStart() {
        Logging.m150047d("WebRtcAudioDeviceObserver", "onAudioDevicePlayoutStart... ");
        if (this.audioDeviceObserver != null) {
            this.audioDeviceObserver.onAudioDevicePlayoutStart();
        }
    }

    public void onAudioDevicePlayoutStop() {
        Logging.m150047d("WebRtcAudioDeviceObserver", "onAudioDevicePlayoutStop... ");
        if (this.audioDeviceObserver != null) {
            this.audioDeviceObserver.onAudioDevicePlayoutStop();
        }
    }

    public void onAudioDeviceRecordStart() {
        Logging.m150047d("WebRtcAudioDeviceObserver", "onAudioDeviceRecordStart... ");
        if (this.audioDeviceObserver != null) {
            this.audioDeviceObserver.onAudioDeviceRecordStart();
        }
    }

    public void onAudioDeviceRecordStop() {
        Logging.m150047d("WebRtcAudioDeviceObserver", "onAudioDeviceRecordStop... ");
        if (this.audioDeviceObserver != null) {
            this.audioDeviceObserver.onAudioDeviceRecordStop();
        }
    }

    public WebRtcAudioDeviceObserver(AudioDeviceObserver audioDeviceObserver2) {
        this.audioDeviceObserver = audioDeviceObserver2;
    }
}
