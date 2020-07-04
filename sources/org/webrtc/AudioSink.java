package org.webrtc;

public interface AudioSink {
    void onFrame(AudioFrame audioFrame);
}
