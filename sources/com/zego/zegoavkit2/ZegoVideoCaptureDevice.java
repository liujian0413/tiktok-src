package com.zego.zegoavkit2;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.nio.ByteBuffer;

public abstract class ZegoVideoCaptureDevice {

    public interface Client {
        void destroy();

        SurfaceTexture getSurfaceTexture();

        void onByteBufferFrameCaptured(ByteBuffer byteBuffer, int i, VideoCaptureFormat videoCaptureFormat, long j, int i2);

        void onByteBufferFrameCaptured(byte[] bArr, int i, VideoCaptureFormat videoCaptureFormat, long j, int i2);

        void onEncodedFrameCaptured(ByteBuffer byteBuffer, int i, VideoCodecConfig videoCodecConfig, boolean z, double d);

        void onError(String str);

        void onTakeSnapshot(Bitmap bitmap);

        void onTextureCaptured(int i, int i2, int i3, double d);

        void setFillMode(int i);

        void setFlipMode(int i);
    }

    public static class VideoCaptureFormat {
        public int height;
        public int pixel_format;
        public int rotation;
        public int[] strides = {0, 0, 0, 0};
        public int width;
    }

    public static class VideoCodecConfig {
        public int codec_type;
        public int height;
        public int width;
    }

    public static class ZegoVideoCodecType {
    }

    public static class ZegoVideoFlipMode {
    }

    /* access modifiers changed from: protected */
    public abstract void allocateAndStart(Client client);

    /* access modifiers changed from: protected */
    public abstract int enableTorch(boolean z);

    /* access modifiers changed from: protected */
    public abstract int setCaptureRotation(int i);

    /* access modifiers changed from: protected */
    public abstract int setFrameRate(int i);

    /* access modifiers changed from: protected */
    public abstract int setFrontCam(int i);

    /* access modifiers changed from: protected */
    public abstract int setPowerlineFreq(int i);

    /* access modifiers changed from: protected */
    public abstract int setResolution(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract int setView(View view);

    /* access modifiers changed from: protected */
    public abstract int setViewMode(int i);

    /* access modifiers changed from: protected */
    public abstract int setViewRotation(int i);

    /* access modifiers changed from: protected */
    public abstract int startCapture();

    /* access modifiers changed from: protected */
    public abstract int startPreview();

    /* access modifiers changed from: protected */
    public abstract void stopAndDeAllocate();

    /* access modifiers changed from: protected */
    public abstract int stopCapture();

    /* access modifiers changed from: protected */
    public abstract int stopPreview();

    /* access modifiers changed from: protected */
    public abstract int supportBufferType();

    /* access modifiers changed from: protected */
    public abstract int takeSnapshot();
}
