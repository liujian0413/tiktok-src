package com.zego.zegoavkit2.screencapture;

import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.View;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice.Client;

class ZegoScreenCaptureDevice extends ZegoVideoCaptureDevice {
    private int mCaptureHeight;
    private int mCaptureWidth;
    private volatile Client mClient;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private volatile boolean mIsCapturing;
    private volatile MediaProjection mMediaProjection;
    private volatile Surface mSurface;
    private volatile VirtualDisplay mVirtualDisplay;

    public int enableTorch(boolean z) {
        return 0;
    }

    public int setCaptureRotation(int i) {
        return 0;
    }

    public int setFrameRate(int i) {
        return 0;
    }

    public int setFrontCam(int i) {
        return 0;
    }

    public int setPowerlineFreq(int i) {
        return 0;
    }

    public int setResolution(int i, int i2) {
        return 0;
    }

    public int setView(View view) {
        return 0;
    }

    public int setViewMode(int i) {
        return 0;
    }

    public int setViewRotation(int i) {
        return 0;
    }

    public int startPreview() {
        return 0;
    }

    public int stopPreview() {
        return 0;
    }

    public int supportBufferType() {
        return 4;
    }

    public int takeSnapshot() {
        return 0;
    }

    public void stopAndDeAllocate() {
        if (this.mClient != null) {
            this.mClient.destroy();
            this.mClient = null;
        }
        if (this.mHandlerThread != null) {
            this.mHandlerThread.quit();
            this.mHandlerThread = null;
            this.mHandler = null;
        }
    }

    public int stopCapture() {
        this.mIsCapturing = false;
        if (this.mVirtualDisplay != null) {
            this.mVirtualDisplay.release();
            this.mVirtualDisplay = null;
        }
        if (this.mSurface != null) {
            this.mSurface.release();
            this.mSurface = null;
        }
        return 0;
    }

    public int startCapture() {
        if (!(this.mClient == null || this.mIsCapturing || this.mMediaProjection == null)) {
            this.mIsCapturing = true;
            SurfaceTexture surfaceTexture = this.mClient.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.mCaptureWidth, this.mCaptureHeight);
            this.mSurface = new Surface(surfaceTexture);
            this.mVirtualDisplay = this.mMediaProjection.createVirtualDisplay("ScreenCapture", this.mCaptureWidth, this.mCaptureHeight, 1, 1, this.mSurface, null, this.mHandler);
        }
        return 0;
    }

    public void allocateAndStart(Client client) {
        this.mClient = client;
        this.mHandlerThread = new HandlerThread("ZegoScreenCapture");
        this.mHandlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
    }

    public void setMediaProjection(MediaProjection mediaProjection) {
        this.mMediaProjection = mediaProjection;
        if (this.mIsCapturing && this.mClient != null && this.mMediaProjection != null && this.mSurface != null) {
            if (this.mVirtualDisplay != null) {
                this.mVirtualDisplay.release();
            }
            this.mVirtualDisplay = this.mMediaProjection.createVirtualDisplay("ScreenCapture", this.mCaptureWidth, this.mCaptureHeight, 1, 1, this.mSurface, null, this.mHandler);
        }
    }

    public void setCaptureResolution(int i, int i2) {
        this.mCaptureWidth = i;
        this.mCaptureHeight = i2;
        if (this.mVirtualDisplay != null) {
            this.mVirtualDisplay.resize(this.mCaptureWidth, this.mCaptureHeight, 1);
        }
    }

    ZegoScreenCaptureDevice(MediaProjection mediaProjection, int i, int i2) {
        this.mMediaProjection = mediaProjection;
        this.mCaptureWidth = i;
        this.mCaptureHeight = i2;
    }
}
