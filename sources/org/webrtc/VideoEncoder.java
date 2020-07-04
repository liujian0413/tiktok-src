package org.webrtc;

import org.webrtc.EncodedImage.FrameType;

public interface VideoEncoder {

    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        public int getSum() {
            int[][] iArr = this.bitratesBbs;
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2;
                for (int i4 : iArr[i]) {
                    i3 += i4;
                }
                i++;
                i2 = i3;
            }
            return i2;
        }

        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }
    }

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class CodecSpecificInfo {
    }

    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    public static class EncodeInfo {
        public final FrameType[] frameTypes;

        public EncodeInfo(FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public enum ScaleMode {
        AUTO(0),
        STRETCH(1),
        FIT_WITH_CROPPING(2),
        FIT_WITH_FILLING(3);
        
        private int value;

        static ScaleMode fromValue(int i) {
            switch (i) {
                case 0:
                    return AUTO;
                case 1:
                    return STRETCH;
                case 2:
                    return FIT_WITH_CROPPING;
                case 3:
                    return FIT_WITH_FILLING;
                default:
                    return AUTO;
            }
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;

        /* renamed from: on */
        public final boolean f123515on;

        private ScalingSettings() {
        }

        public String toString() {
            if (!this.f123515on) {
                return "OFF";
            }
            StringBuilder sb = new StringBuilder("[ ");
            sb.append(this.low);
            sb.append(", ");
            sb.append(this.high);
            sb.append(" ]");
            return sb.toString();
        }

        public ScalingSettings(boolean z) {
            this.f123515on = z;
        }

        public ScalingSettings(int i, int i2) {
            this.f123515on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public ScalingSettings(boolean z, int i, int i2) {
            this.f123515on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }
    }

    public static class Settings {
        public final boolean automaticResizeOn;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final ScaleMode scaleMode;
        public final int startBitrate;
        public final int width;

        public Settings(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.scaleMode = ScaleMode.fromValue(i4);
            this.startBitrate = i5;
            this.maxFramerate = i6;
            this.numberOfSimulcastStreams = i7;
            this.automaticResizeOn = z;
        }
    }

    long createNativeVideoEncoder();

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    String getImplementationName();

    ScalingSettings getScalingSettings();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isHardwareEncoder();

    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i);
}
