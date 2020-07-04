package org.webrtc;

import java.util.IdentityHashMap;

public class AudioTrack extends MediaStreamTrack {
    private final IdentityHashMap<AudioSink, Long> sinks = new IdentityHashMap<>();

    private static native void nativeAddSink(long j, long j2);

    private static native void nativeFreeSink(long j);

    private static native void nativeRemoveSink(long j, long j2);

    private static native void nativeSetVolume(long j, double d);

    private static native long nativeWrapSink(AudioSink audioSink);

    /* access modifiers changed from: 0000 */
    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void dispose() {
        for (Long longValue : this.sinks.values()) {
            long longValue2 = longValue.longValue();
            nativeRemoveSink(this.nativeTrack, longValue2);
            nativeFreeSink(longValue2);
        }
        this.sinks.clear();
        super.dispose();
    }

    public void setVolume(double d) {
        nativeSetVolume(getNativeAudioTrack(), d);
    }

    public AudioTrack(long j) {
        super(j);
    }

    public void addSink(AudioSink audioSink) {
        long nativeWrapSink = nativeWrapSink(audioSink);
        this.sinks.put(audioSink, Long.valueOf(nativeWrapSink));
        nativeAddSink(this.nativeTrack, nativeWrapSink);
    }

    public void removeSink(AudioSink audioSink) {
        long longValue = ((Long) this.sinks.remove(audioSink)).longValue();
        if (longValue != 0) {
            nativeRemoveSink(this.nativeTrack, longValue);
            nativeFreeSink(longValue);
        }
    }
}
