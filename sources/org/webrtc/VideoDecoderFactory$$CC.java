package org.webrtc;

public abstract /* synthetic */ class VideoDecoderFactory$$CC {
    public static VideoDecoder createDecoder(VideoDecoderFactory videoDecoderFactory, String str) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    public static VideoDecoder createDecoder(VideoDecoderFactory videoDecoderFactory, VideoCodecInfo videoCodecInfo) {
        return videoDecoderFactory.createDecoder(videoCodecInfo.getName());
    }

    public static VideoCodecInfo[] getSupportedCodecs(VideoDecoderFactory videoDecoderFactory) {
        return new VideoCodecInfo[0];
    }
}
