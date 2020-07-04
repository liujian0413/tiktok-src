package org.webrtc;

import org.webrtc.VideoDecoder.Callback;
import org.webrtc.VideoDecoder.DecodeInfo;
import org.webrtc.VideoDecoder.Settings;

public class VideoDecoderFallback extends WrappedNativeVideoDecoder {
    private final VideoDecoder fallback;
    private final VideoDecoder primary;

    private static native long nativeCreateDecoder(VideoDecoder videoDecoder, VideoDecoder videoDecoder2);

    public /* bridge */ /* synthetic */ String getImplementationName() {
        return super.getImplementationName();
    }

    public /* bridge */ /* synthetic */ boolean getPrefersLateDecoding() {
        return super.getPrefersLateDecoding();
    }

    public /* bridge */ /* synthetic */ VideoCodecStatus release() {
        return super.release();
    }

    public long createNativeVideoDecoder() {
        return nativeCreateDecoder(this.fallback, this.primary);
    }

    public VideoDecoderFallback(VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        this.fallback = videoDecoder;
        this.primary = videoDecoder2;
    }

    public /* bridge */ /* synthetic */ VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo) {
        return super.decode(encodedImage, decodeInfo);
    }

    public /* bridge */ /* synthetic */ VideoCodecStatus initDecode(Settings settings, Callback callback) {
        return super.initDecode(settings, callback);
    }
}
