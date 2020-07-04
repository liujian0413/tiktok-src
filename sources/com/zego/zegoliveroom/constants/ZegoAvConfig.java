package com.zego.zegoliveroom.constants;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public final class ZegoAvConfig {
    public static final int[] VIDEO_BITRATES = {300000, 400000, 600000, 1200000, 1500000, 3000000};
    public static final int[] VIDEO_FPSS = {5, 10, 15, 20, 25, 30};
    private int mVideoBitrate;
    private int mVideoCaptureResolutionHeight;
    private int mVideoCaptureResolutionWidth;
    private int mVideoEncodeResolutionHeight;
    private int mVideoEncodeResolutionWidth;
    private int mVideoFPS;

    public static final class Level {
    }

    public final int getVideoBitrate() {
        return this.mVideoBitrate;
    }

    public final int getVideoCaptureResolutionHeight() {
        return this.mVideoCaptureResolutionHeight;
    }

    public final int getVideoCaptureResolutionWidth() {
        return this.mVideoCaptureResolutionWidth;
    }

    public final int getVideoEncodeResolutionHeight() {
        return this.mVideoEncodeResolutionHeight;
    }

    public final int getVideoEncodeResolutionWidth() {
        return this.mVideoEncodeResolutionWidth;
    }

    public final int getVideoFPS() {
        return this.mVideoFPS;
    }

    public final void setVideoBitrate(int i) {
        this.mVideoBitrate = i;
    }

    public final void setVideoFPS(int i) {
        this.mVideoFPS = i;
    }

    public ZegoAvConfig(int i) {
        if (i < 0 || i > 5) {
            i = 2;
        }
        switch (i) {
            case 0:
                this.mVideoEncodeResolutionWidth = NormalGiftView.ALPHA_180;
                this.mVideoEncodeResolutionHeight = 320;
                this.mVideoCaptureResolutionWidth = NormalGiftView.ALPHA_180;
                this.mVideoCaptureResolutionHeight = 320;
                break;
            case 1:
                this.mVideoEncodeResolutionWidth = 270;
                this.mVideoEncodeResolutionHeight = 480;
                this.mVideoCaptureResolutionWidth = 270;
                this.mVideoCaptureResolutionHeight = 480;
                break;
            case 2:
                this.mVideoEncodeResolutionWidth = 360;
                this.mVideoEncodeResolutionHeight = 640;
                this.mVideoCaptureResolutionWidth = 360;
                this.mVideoCaptureResolutionHeight = 640;
                break;
            case 3:
                this.mVideoEncodeResolutionWidth = 540;
                this.mVideoEncodeResolutionHeight = 960;
                this.mVideoCaptureResolutionWidth = 540;
                this.mVideoCaptureResolutionHeight = 960;
                break;
            case 4:
                this.mVideoEncodeResolutionWidth = 720;
                this.mVideoEncodeResolutionHeight = 1280;
                this.mVideoCaptureResolutionWidth = 720;
                this.mVideoCaptureResolutionHeight = 1280;
                break;
            case 5:
                this.mVideoEncodeResolutionWidth = 1080;
                this.mVideoEncodeResolutionHeight = 1920;
                this.mVideoCaptureResolutionWidth = 1080;
                this.mVideoCaptureResolutionHeight = 1920;
                break;
        }
        this.mVideoFPS = 15;
        this.mVideoBitrate = VIDEO_BITRATES[i];
    }

    public final void setVideoCaptureResolution(int i, int i2) {
        this.mVideoCaptureResolutionWidth = i;
        this.mVideoCaptureResolutionHeight = i2;
    }

    public final void setVideoEncodeResolution(int i, int i2) {
        this.mVideoEncodeResolutionWidth = i;
        this.mVideoEncodeResolutionHeight = i2;
    }
}
