package org.webrtc;

public interface VideoEncoderFactory {
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    VideoCodecInfo[] getSupportedCodecs();
}
