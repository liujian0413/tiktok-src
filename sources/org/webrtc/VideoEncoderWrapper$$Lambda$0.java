package org.webrtc;

import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.CodecSpecificInfo;

final /* synthetic */ class VideoEncoderWrapper$$Lambda$0 implements Callback {
    private final long arg$1;

    VideoEncoderWrapper$$Lambda$0(long j) {
        this.arg$1 = j;
    }

    public final void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.arg$1, encodedImage.buffer, encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.captureTimeNs, encodedImage.frameType.getNative(), encodedImage.rotation, encodedImage.completeFrame, encodedImage.f123506qp);
    }
}
