package org.webrtc;

import org.webrtc.VideoDecoder.Callback;

class VideoDecoderWrapper {
    VideoDecoderWrapper() {
    }

    /* access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);

    static Callback createDecoderCallback(long j) {
        return new VideoDecoderWrapper$$Lambda$0(j);
    }
}
