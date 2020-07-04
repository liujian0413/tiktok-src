package com.p280ss.video.rtc.engine.video;

/* renamed from: com.ss.video.rtc.engine.video.VideoPreset */
public class VideoPreset {
    private int bandwidth;
    private int fps;
    private int height;
    private int width;

    public int getBandwidth() {
        return this.bandwidth;
    }

    public int getFps() {
        return this.fps;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public VideoPreset(int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.bandwidth = i4;
    }
}
