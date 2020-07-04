package com.zego.zegoavkit2;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice.Client;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice.VideoCaptureFormat;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice.VideoCodecConfig;
import java.nio.ByteBuffer;

public class ZegoVideoCaptureClient implements Client {
    private long pthis;

    private static native void destroy(long j);

    private static native SurfaceTexture get_surface_texture(long j);

    private static native int on_byte_array_frame_captured(long j, byte[] bArr, int i, int i2, int i3, int[] iArr, int i4, int i5, long j2, int i6);

    private static native int on_byte_buffer_frame_captured(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int[] iArr, int i4, int i5, long j2, int i6);

    private static native int on_encoded_frame_captured(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z, double d);

    private static native int on_error(long j, String str);

    private static native int on_take_snapshot(long j, Bitmap bitmap);

    private static native int on_texture_captured(long j, int i, int i2, int i3, double d);

    private static native void set_fill_mode(long j, int i);

    private static native void set_flip_mode(long j, int i);

    public void destroy() {
        destroy(this.pthis);
        this.pthis = 0;
    }

    public SurfaceTexture getSurfaceTexture() {
        if (this.pthis != 0) {
            return get_surface_texture(this.pthis);
        }
        return null;
    }

    private int setThis(long j) {
        this.pthis = j;
        return 0;
    }

    public void onError(String str) {
        if (this.pthis != 0) {
            on_error(this.pthis, str);
        }
    }

    public void onTakeSnapshot(Bitmap bitmap) {
        if (this.pthis != 0) {
            on_take_snapshot(this.pthis, bitmap);
        }
    }

    public void setFillMode(int i) {
        if (this.pthis != 0) {
            set_fill_mode(this.pthis, i);
        }
    }

    public void setFlipMode(int i) {
        if (this.pthis != 0) {
            set_flip_mode(this.pthis, i);
        }
    }

    public void onTextureCaptured(int i, int i2, int i3, double d) {
        if (this.pthis != 0) {
            on_texture_captured(this.pthis, i, i2, i3, d);
        }
    }

    public void onEncodedFrameCaptured(ByteBuffer byteBuffer, int i, VideoCodecConfig videoCodecConfig, boolean z, double d) {
        VideoCodecConfig videoCodecConfig2 = videoCodecConfig;
        if (this.pthis != 0) {
            on_encoded_frame_captured(this.pthis, byteBuffer, i, videoCodecConfig2.width, videoCodecConfig2.height, videoCodecConfig2.codec_type, z, d);
        }
    }

    public void onByteBufferFrameCaptured(ByteBuffer byteBuffer, int i, VideoCaptureFormat videoCaptureFormat, long j, int i2) {
        VideoCaptureFormat videoCaptureFormat2 = videoCaptureFormat;
        if (this.pthis != 0) {
            on_byte_buffer_frame_captured(this.pthis, byteBuffer, i, videoCaptureFormat2.width, videoCaptureFormat2.height, videoCaptureFormat2.strides, videoCaptureFormat2.rotation, videoCaptureFormat2.pixel_format, j, i2);
        }
    }

    public void onByteBufferFrameCaptured(byte[] bArr, int i, VideoCaptureFormat videoCaptureFormat, long j, int i2) {
        VideoCaptureFormat videoCaptureFormat2 = videoCaptureFormat;
        if (this.pthis != 0) {
            on_byte_array_frame_captured(this.pthis, bArr, i, videoCaptureFormat2.width, videoCaptureFormat2.height, videoCaptureFormat2.strides, videoCaptureFormat2.rotation, videoCaptureFormat2.pixel_format, j, i2);
        }
    }
}
