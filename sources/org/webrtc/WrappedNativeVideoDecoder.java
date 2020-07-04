package org.webrtc;

import org.webrtc.VideoDecoder.Callback;
import org.webrtc.VideoDecoder.DecodeInfo;
import org.webrtc.VideoDecoder.Settings;

abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    WrappedNativeVideoDecoder() {
    }

    public abstract long createNativeVideoDecoder();

    public String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public boolean getPrefersLateDecoding() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus initDecode(Settings settings, Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
