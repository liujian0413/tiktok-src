package org.webrtc;

import org.webrtc.VideoDecoder.Callback;

final /* synthetic */ class VideoDecoderWrapper$$Lambda$0 implements Callback {
    private final long arg$1;

    VideoDecoderWrapper$$Lambda$0(long j) {
        this.arg$1 = j;
    }

    public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.arg$1, videoFrame, num, num2);
    }
}
