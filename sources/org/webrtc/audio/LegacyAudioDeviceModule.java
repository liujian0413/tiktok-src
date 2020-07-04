package org.webrtc.audio;

import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public class LegacyAudioDeviceModule implements AudioDeviceModule {
    public long getNativeAudioDeviceModulePointer() {
        return 0;
    }

    public void release() {
    }

    public void setMicrophoneMute(boolean z) {
        WebRtcAudioRecord.setMicrophoneMute(z);
    }

    public void setSpeakerMute(boolean z) {
        WebRtcAudioTrack.setSpeakerMute(z);
    }
}
