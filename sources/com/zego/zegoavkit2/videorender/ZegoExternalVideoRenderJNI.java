package com.zego.zegoavkit2.videorender;

import com.zego.zegoavkit2.entities.EncodedVideoFrame;
import com.zego.zegoavkit2.entities.VideoFrame;
import com.zego.zegoavkit2.enums.VideoCodecType;
import com.zego.zegoavkit2.enums.VideoPixelFormat;
import java.nio.ByteBuffer;

final class ZegoExternalVideoRenderJNI {
    private static volatile IZegoExternalRenderCallback2 externalRenderCallback2;
    private static volatile IZegoExternalRenderCallback3 externalRenderCallback3;
    private static volatile IZegoVideoDecodeCallback s_ZegoVideoDecodeCallback;
    private static volatile IZegoVideoRenderCallback s_ZegoVideoRenderCallback;

    ZegoExternalVideoRenderJNI() {
    }

    public static native void enableExternalRender(boolean z, int i);

    public static native boolean enableVideoPreview(boolean z, int i);

    public static native boolean enableVideoRender(boolean z, String str);

    private static native void setNativeVideoDecodeCallback(boolean z);

    private static native void setNativeVideoRenderCallback(boolean z);

    public static native void setVideoRenderType(int i);

    public static void setJNIVideoExternalVideoCallback(IZegoExternalRenderCallback2 iZegoExternalRenderCallback2) {
        externalRenderCallback2 = iZegoExternalRenderCallback2;
    }

    public static void setJNIVideoExternalVideoCallback3(IZegoExternalRenderCallback3 iZegoExternalRenderCallback3) {
        externalRenderCallback3 = iZegoExternalRenderCallback3;
    }

    public static void setVideoDecodeCallback(IZegoVideoDecodeCallback iZegoVideoDecodeCallback) {
        boolean z;
        s_ZegoVideoDecodeCallback = iZegoVideoDecodeCallback;
        if (iZegoVideoDecodeCallback != null) {
            z = true;
        } else {
            z = false;
        }
        setNativeVideoDecodeCallback(z);
    }

    public static void setVideoRenderCallback(IZegoVideoRenderCallback iZegoVideoRenderCallback) {
        boolean z;
        s_ZegoVideoRenderCallback = iZegoVideoRenderCallback;
        if (iZegoVideoRenderCallback != null) {
            z = true;
        } else {
            z = false;
        }
        setNativeVideoRenderCallback(z);
    }

    public static void setFlipMode(String str, int i) {
        if (s_ZegoVideoRenderCallback != null) {
            s_ZegoVideoRenderCallback.setFlipMode(str, i);
        }
    }

    public static VideoFrame getInputBuffer(int i, String str) {
        if (externalRenderCallback2 != null) {
            return externalRenderCallback2.getInputBuffer(i);
        }
        if (externalRenderCallback3 != null) {
            return externalRenderCallback3.getInputBuffer(i, str);
        }
        return null;
    }

    public static void setFlipModeCompatible(String str, int i) {
        if (externalRenderCallback2 != null) {
            externalRenderCallback2.setFlipMode(str, i);
            return;
        }
        if (externalRenderCallback3 != null) {
            externalRenderCallback3.setFlipMode(str, i);
        }
    }

    public static void queueInputBuffer(int i, String str, int i2) {
        if (externalRenderCallback2 != null) {
            externalRenderCallback2.queueInputBuffer(i, str, VideoPixelFormat.valueOf(i2));
            return;
        }
        if (externalRenderCallback3 != null) {
            externalRenderCallback3.queueInputBuffer(i, str, VideoPixelFormat.valueOf(i2));
        }
    }

    public static int dequeueInputBuffer(int i, int i2, int[] iArr, int[] iArr2, String str) {
        if (externalRenderCallback2 != null) {
            return externalRenderCallback2.dequeueInputBuffer(i, i2, iArr, iArr2);
        }
        if (externalRenderCallback3 != null) {
            return externalRenderCallback3.dequeueInputBuffer(i, i2, iArr, iArr2, str);
        }
        return -1;
    }

    public static void onVideoDecodeCallback(ByteBuffer byteBuffer, int i, boolean z, double d, String str) {
        if (s_ZegoVideoDecodeCallback != null) {
            EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
            encodedVideoFrame.data = byteBuffer;
            encodedVideoFrame.codecType = VideoCodecType.valueOf(i);
            encodedVideoFrame.isKeyFrame = z;
            encodedVideoFrame.reference_time_ms = d;
            s_ZegoVideoDecodeCallback.onVideoDecodeCallback(encodedVideoFrame, str);
        }
    }

    public static void onVideoRenderCallback(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, String str) {
        if (s_ZegoVideoRenderCallback != null) {
            VideoFrame videoFrame = new VideoFrame();
            for (int i4 = 0; i4 < videoFrame.byteBuffers.length; i4++) {
                videoFrame.byteBuffers[i4] = byteBufferArr[i4];
                videoFrame.strides[i4] = iArr[i4];
            }
            videoFrame.width = i;
            videoFrame.height = i2;
            s_ZegoVideoRenderCallback.onVideoRenderCallback(videoFrame, VideoPixelFormat.valueOf(i3), str);
        }
    }
}
