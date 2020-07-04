package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.InternalVideoStreamDescription */
public class InternalVideoStreamDescription {
    public int frameRate;
    public int height;
    public int maxKbps;
    public ScaleMode scaleMode = ScaleMode.Auto;
    public int width;

    /* renamed from: com.ss.video.rtc.engine.InternalVideoStreamDescription$ScaleMode */
    public enum ScaleMode {
        Auto(0),
        Stretch(1),
        FitWithCropping(2),
        FitWithFilling(3);
        
        private int value;

        /* access modifiers changed from: 0000 */
        public final int getIntValue() {
            return this.value;
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public int getFrameRate() {
        return this.frameRate;
    }

    /* access modifiers changed from: 0000 */
    public int getHeight() {
        return this.height;
    }

    /* access modifiers changed from: 0000 */
    public int getMaxKBps() {
        return this.maxKbps;
    }

    /* access modifiers changed from: 0000 */
    public ScaleMode getScaleMode() {
        return this.scaleMode;
    }

    /* access modifiers changed from: 0000 */
    public int getWidth() {
        return this.width;
    }

    public InternalVideoStreamDescription(VideoStreamDescription videoStreamDescription) {
        this.width = ((Integer) videoStreamDescription.videoSize.first).intValue();
        this.height = ((Integer) videoStreamDescription.videoSize.second).intValue();
        this.frameRate = videoStreamDescription.frameRate;
        this.maxKbps = videoStreamDescription.maxKbps;
        this.scaleMode = ConvertEnumValue(videoStreamDescription.scaleMode);
    }

    private ScaleMode ConvertEnumValue(com.p280ss.video.rtc.engine.VideoStreamDescription.ScaleMode scaleMode2) {
        switch (scaleMode2) {
            case Auto:
                return ScaleMode.Auto;
            case Stretch:
                return ScaleMode.Stretch;
            case FitWithCropping:
                return ScaleMode.FitWithCropping;
            case FitWithFilling:
                return ScaleMode.FitWithFilling;
            default:
                return ScaleMode.Auto;
        }
    }
}
