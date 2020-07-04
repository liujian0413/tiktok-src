package com.p280ss.video.rtc.engine.video;

/* renamed from: com.ss.video.rtc.engine.video.VideoEncoderConfiguration */
public class VideoEncoderConfiguration {
    public int bitrate;
    public VideoDimensions dimensions;
    public FRAME_RATE frameRate;
    public ORIENTATION_MODE orienttationMode;

    /* renamed from: com.ss.video.rtc.engine.video.VideoEncoderConfiguration$ORIENTATION_MODE */
    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        private ORIENTATION_MODE(int i) {
            this.value = i;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfiguration{dimensions=");
        sb.append(this.dimensions);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", orienttationMode=");
        sb.append(this.orienttationMode);
        sb.append('}');
        return sb.toString();
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FRAME_RATE frame_rate, int i, ORIENTATION_MODE orientation_mode) {
        this.dimensions = videoDimensions;
        this.frameRate = frame_rate;
        this.bitrate = i;
        this.orienttationMode = orientation_mode;
    }
}
