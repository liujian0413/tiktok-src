package org.webrtc;

public class MediaStreamTrack {
    long nativeTrack;

    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);
        
        private final int nativeIndex;

        /* access modifiers changed from: 0000 */
        public final int getNative() {
            return this.nativeIndex;
        }

        static MediaType fromNativeIndex(int i) {
            MediaType[] values;
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i) {
                    return mediaType;
                }
            }
            StringBuilder sb = new StringBuilder("Unknown native media type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        private MediaType(int i) {
            this.nativeIndex = i;
        }
    }

    public enum State {
        LIVE,
        ENDED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    private static native boolean nativeGetEnabled(long j);

    private static native String nativeGetId(long j);

    private static native String nativeGetKind(long j);

    private static native State nativeGetState(long j);

    private static native boolean nativeSetEnabled(long j, boolean z);

    /* access modifiers changed from: 0000 */
    public long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    public void dispose() {
        checkMediaStreamTrackExists();
        JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    /* renamed from: id */
    public String mo122628id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    public boolean setEnabled(boolean z) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z);
    }

    public MediaStreamTrack(long j) {
        if (j != 0) {
            this.nativeTrack = j;
            return;
        }
        throw new IllegalArgumentException("nativeTrack may not be null");
    }

    static MediaStreamTrack createMediaStreamTrack(long j) {
        if (j == 0) {
            return null;
        }
        String nativeGetKind = nativeGetKind(j);
        if (nativeGetKind.equals("audio")) {
            return new AudioTrack(j);
        }
        if (nativeGetKind.equals("video")) {
            return new VideoTrack(j);
        }
        return null;
    }
}
