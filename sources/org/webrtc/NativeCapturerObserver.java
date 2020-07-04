package org.webrtc;

import org.webrtc.VideoFrame.Buffer;

class NativeCapturerObserver implements CapturerObserver {
    private final long nativeSource;

    private static native void nativeCapturerStarted(long j, boolean z);

    private static native void nativeCapturerStopped(long j);

    private static native void nativeOnFrameCaptured(long j, int i, int i2, int i3, long j2, Buffer buffer);

    public void onCapturerStopped() {
        nativeCapturerStopped(this.nativeSource);
    }

    public NativeCapturerObserver(long j) {
        this.nativeSource = j;
    }

    public void onCapturerStarted(boolean z) {
        nativeCapturerStarted(this.nativeSource, z);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }
}
