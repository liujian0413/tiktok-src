package org.webrtc;

import java.util.IdentityHashMap;

public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks = new IdentityHashMap<>();

    private static native void nativeAddSink(long j, long j2);

    private static native void nativeFreeSink(long j);

    private static native void nativeRemoveSink(long j, long j2);

    private static native long nativeWrapSink(VideoSink videoSink);

    /* access modifiers changed from: 0000 */
    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void dispose() {
        for (Long longValue : this.sinks.values()) {
            long longValue2 = longValue.longValue();
            nativeRemoveSink(getNativeMediaStreamTrack(), longValue2);
            nativeFreeSink(longValue2);
        }
        this.sinks.clear();
        super.dispose();
    }

    public VideoTrack(long j) {
        super(j);
    }

    public void removeSink(VideoSink videoSink) {
        Long l = (Long) this.sinks.remove(videoSink);
        if (l != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), l.longValue());
            nativeFreeSink(l.longValue());
        }
    }

    public void addSink(VideoSink videoSink) {
        if (videoSink == null) {
            throw new IllegalArgumentException("The VideoSink is not allowed to be null");
        } else if (!this.sinks.containsKey(videoSink)) {
            long nativeWrapSink = nativeWrapSink(videoSink);
            this.sinks.put(videoSink, Long.valueOf(nativeWrapSink));
            nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
        }
    }
}
