package com.p280ss.video.rtc.engine;

import android.util.Pair;

/* renamed from: com.ss.video.rtc.engine.VideoStreamDescription */
public class VideoStreamDescription {
    public int frameRate;
    public int maxKbps;
    public ScaleMode scaleMode = ScaleMode.Auto;
    public Pair<Integer, Integer> videoSize;

    /* renamed from: com.ss.video.rtc.engine.VideoStreamDescription$ScaleMode */
    public enum ScaleMode {
        Auto(0),
        Stretch(1),
        FitWithCropping(2),
        FitWithFilling(3);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        public static ScaleMode convertFromInt(int i) {
            return values()[i];
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    public VideoStreamDescription() {
    }

    public boolean isValid() {
        if (this.videoSize == null || ((Integer) this.videoSize.first).intValue() <= 0 || ((Integer) this.videoSize.second).intValue() <= 0 || this.frameRate <= 0 || this.maxKbps <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoStreamDescription{videoSize=");
        sb.append(this.videoSize);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", maxKbps=");
        sb.append(this.maxKbps);
        sb.append(", scaleMode=");
        sb.append(this.scaleMode);
        sb.append('}');
        return sb.toString();
    }

    private static VideoStreamDescription create(int i, int i2, int i3, int i4, int i5) {
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription(i, i2, i3, i4, i5);
        return videoStreamDescription;
    }

    public VideoStreamDescription(int i, int i2, int i3, int i4, int i5) {
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.scaleMode = ScaleMode.convertFromInt(i5);
    }
}
