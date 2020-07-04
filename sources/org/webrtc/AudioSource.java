package org.webrtc;

public class AudioSource extends MediaSource {
    /* access modifiers changed from: 0000 */
    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }

    public AudioSource(long j) {
        super(j);
    }
}
