package org.webrtc;

import org.webrtc.VideoEncoder.BitrateAllocation;
import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.EncodeInfo;
import org.webrtc.VideoEncoder.ScalingSettings;
import org.webrtc.VideoEncoder.Settings;

public class VideoEncoderFallback extends WrappedNativeVideoEncoder {
    private final VideoEncoder fallback;
    private final VideoEncoder primary;

    private static native long nativeCreateEncoder(VideoEncoder videoEncoder, VideoEncoder videoEncoder2);

    public /* bridge */ /* synthetic */ String getImplementationName() {
        return super.getImplementationName();
    }

    public /* bridge */ /* synthetic */ ScalingSettings getScalingSettings() {
        return super.getScalingSettings();
    }

    public boolean isHardwareEncoder() {
        return this.primary.isHardwareEncoder();
    }

    public /* bridge */ /* synthetic */ VideoCodecStatus release() {
        return super.release();
    }

    public long createNativeVideoEncoder() {
        return nativeCreateEncoder(this.fallback, this.primary);
    }

    public VideoEncoderFallback(VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        this.fallback = videoEncoder;
        this.primary = videoEncoder2;
    }

    public /* bridge */ /* synthetic */ VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo) {
        return super.encode(videoFrame, encodeInfo);
    }

    public /* bridge */ /* synthetic */ VideoCodecStatus initEncode(Settings settings, Callback callback) {
        return super.initEncode(settings, callback);
    }

    public /* bridge */ /* synthetic */ VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i) {
        return super.setRateAllocation(bitrateAllocation, i);
    }
}
