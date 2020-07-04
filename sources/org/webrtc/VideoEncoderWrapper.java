package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.ScalingSettings;

class VideoEncoderWrapper {
    VideoEncoderWrapper() {
    }

    /* access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long j, ByteBuffer byteBuffer, int i, int i2, long j2, int i3, int i4, boolean z, Integer num);

    static Integer getScalingSettingsHigh(ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    static Integer getScalingSettingsLow(ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    static boolean getScalingSettingsOn(ScalingSettings scalingSettings) {
        return scalingSettings.f123515on;
    }

    static Callback createEncoderCallback(long j) {
        return new VideoEncoderWrapper$$Lambda$0(j);
    }
}
