package org.webrtc;

import org.webrtc.VideoEncoder.BitrateAllocation;
import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.EncodeInfo;
import org.webrtc.VideoEncoder.ScalingSettings;
import org.webrtc.VideoEncoder.Settings;

abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    WrappedNativeVideoEncoder() {
    }

    public abstract long createNativeVideoEncoder();

    public abstract boolean isHardwareEncoder();

    public String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus initEncode(Settings settings, Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
