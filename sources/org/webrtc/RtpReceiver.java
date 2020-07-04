package org.webrtc;

import org.webrtc.MediaStreamTrack.MediaType;

public class RtpReceiver {
    private MediaStreamTrack cachedTrack;
    private long nativeObserver;
    private long nativeRtpReceiver;

    public interface Observer {
        void onFirstPacketReceived(MediaType mediaType);
    }

    private static native String nativeGetId(long j);

    private static native RtpParameters nativeGetParameters(long j);

    private static native long nativeGetTrack(long j);

    private static native void nativeSetFrameDecryptor(long j, long j2);

    private static native long nativeSetObserver(long j, Observer observer);

    private static native boolean nativeSetParameters(long j, RtpParameters rtpParameters);

    private static native void nativeUnsetObserver(long j, long j2);

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }

    public RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    /* renamed from: id */
    public String mo122888id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver == 0) {
            throw new IllegalStateException("RtpReceiver has been disposed.");
        }
    }

    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        if (this.nativeObserver != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, this.nativeObserver);
            this.nativeObserver = 0;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0;
    }

    public RtpReceiver(long j) {
        this.nativeRtpReceiver = j;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j));
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        checkRtpReceiverExists();
        if (rtpParameters == null) {
            return false;
        }
        return nativeSetParameters(this.nativeRtpReceiver, rtpParameters);
    }

    public void SetObserver(Observer observer) {
        checkRtpReceiverExists();
        if (this.nativeObserver != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, this.nativeObserver);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }
}
