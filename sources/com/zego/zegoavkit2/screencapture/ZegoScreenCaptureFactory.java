package com.zego.zegoavkit2.screencapture;

import android.media.projection.MediaProjection;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice;
import com.zego.zegoavkit2.ZegoVideoCaptureFactory;

public class ZegoScreenCaptureFactory extends ZegoVideoCaptureFactory {
    private volatile int mCaptureHeight = 640;
    private volatile int mCaptureWidth = 360;
    private volatile ZegoScreenCaptureDevice mDevice;
    private volatile MediaProjection mMediaProjection;

    public void setMediaProjection(MediaProjection mediaProjection) {
        this.mMediaProjection = mediaProjection;
        ZegoScreenCaptureDevice zegoScreenCaptureDevice = this.mDevice;
        if (zegoScreenCaptureDevice != null) {
            zegoScreenCaptureDevice.setMediaProjection(mediaProjection);
        }
    }

    public ZegoVideoCaptureDevice create(String str) {
        if (this.mDevice == null) {
            this.mDevice = new ZegoScreenCaptureDevice(this.mMediaProjection, this.mCaptureWidth, this.mCaptureHeight);
        }
        return this.mDevice;
    }

    public void destroy(ZegoVideoCaptureDevice zegoVideoCaptureDevice) {
        if (zegoVideoCaptureDevice == this.mDevice) {
            this.mMediaProjection = null;
            this.mCaptureWidth = 360;
            this.mCaptureHeight = 640;
            this.mDevice.setMediaProjection(null);
            this.mDevice = null;
        }
    }

    public void setVideoResolution(int i, int i2) {
        setCaptureResolution(i, i2);
    }

    public void setCaptureResolution(int i, int i2) {
        this.mCaptureWidth = i;
        this.mCaptureHeight = i2;
        ZegoScreenCaptureDevice zegoScreenCaptureDevice = this.mDevice;
        if (zegoScreenCaptureDevice != null) {
            zegoScreenCaptureDevice.setCaptureResolution(i, i2);
        }
    }
}
