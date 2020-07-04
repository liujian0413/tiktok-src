package org.webrtc;

public class RtpSender {
    private MediaStreamTrack cachedTrack;
    private final DtmfSender dtmfSender;
    private long nativeRtpSender;
    private boolean ownsTrack = true;

    private static native long nativeGetDtmfSender(long j);

    private static native String nativeGetId(long j);

    private static native RtpParameters nativeGetParameters(long j);

    private static native long nativeGetTrack(long j);

    private static native void nativeSetFrameEncryptor(long j, long j2);

    private static native boolean nativeSetParameters(long j, RtpParameters rtpParameters);

    private static native boolean nativeSetTrack(long j, long j2);

    public DtmfSender dtmf() {
        return this.dtmfSender;
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }

    /* access modifiers changed from: 0000 */
    public long getNativeRtpSender() {
        checkRtpSenderExists();
        return this.nativeRtpSender;
    }

    public RtpParameters getParameters() {
        checkRtpSenderExists();
        return nativeGetParameters(this.nativeRtpSender);
    }

    /* renamed from: id */
    public String mo122897id() {
        checkRtpSenderExists();
        return nativeGetId(this.nativeRtpSender);
    }

    private void checkRtpSenderExists() {
        if (this.nativeRtpSender == 0) {
            throw new IllegalStateException("RtpSender has been disposed.");
        }
    }

    public void dispose() {
        checkRtpSenderExists();
        if (this.dtmfSender != null) {
            this.dtmfSender.dispose();
        }
        if (this.cachedTrack != null && this.ownsTrack) {
            this.cachedTrack.dispose();
        }
        JniCommon.nativeReleaseRef(this.nativeRtpSender);
        this.nativeRtpSender = 0;
    }

    public void setFrameEncryptor(FrameEncryptor frameEncryptor) {
        checkRtpSenderExists();
        nativeSetFrameEncryptor(this.nativeRtpSender, frameEncryptor.getNativeFrameEncryptor());
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        checkRtpSenderExists();
        return nativeSetParameters(this.nativeRtpSender, rtpParameters);
    }

    public RtpSender(long j) {
        DtmfSender dtmfSender2;
        this.nativeRtpSender = j;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j));
        long nativeGetDtmfSender = nativeGetDtmfSender(j);
        if (nativeGetDtmfSender != 0) {
            dtmfSender2 = new DtmfSender(nativeGetDtmfSender);
        } else {
            dtmfSender2 = null;
        }
        this.dtmfSender = dtmfSender2;
    }

    public boolean setTrack(MediaStreamTrack mediaStreamTrack, boolean z) {
        long j;
        checkRtpSenderExists();
        long j2 = this.nativeRtpSender;
        if (mediaStreamTrack == null) {
            j = 0;
        } else {
            j = mediaStreamTrack.getNativeMediaStreamTrack();
        }
        if (!nativeSetTrack(j2, j)) {
            return false;
        }
        if (this.cachedTrack != null && this.ownsTrack) {
            this.cachedTrack.dispose();
        }
        this.cachedTrack = mediaStreamTrack;
        this.ownsTrack = z;
        return true;
    }
}
