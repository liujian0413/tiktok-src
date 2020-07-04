package com.zego.zegoavkit2.videorender;

import com.zego.zegoavkit2.enums.VideoExternalRenderType;

public class ZegoExternalVideoRender {
    public static void setVideoDecodeCallback(IZegoVideoDecodeCallback iZegoVideoDecodeCallback) {
        ZegoExternalVideoRenderJNI.setVideoDecodeCallback(iZegoVideoDecodeCallback);
    }

    public static void setVideoRenderCallback(IZegoVideoRenderCallback iZegoVideoRenderCallback) {
        ZegoExternalVideoRenderJNI.setVideoRenderCallback(iZegoVideoRenderCallback);
    }

    public void setZegoExternalRenderCallback2(IZegoExternalRenderCallback2 iZegoExternalRenderCallback2) {
        ZegoExternalVideoRenderJNI.setJNIVideoExternalVideoCallback(iZegoExternalRenderCallback2);
    }

    public static void setVideoRenderType(VideoRenderType videoRenderType) {
        ZegoExternalVideoRenderJNI.setVideoRenderType(videoRenderType.value());
    }

    public void setZegoExternalRenderCallback2(IZegoExternalRenderCallback3 iZegoExternalRenderCallback3) {
        ZegoExternalVideoRenderJNI.setJNIVideoExternalVideoCallback3(iZegoExternalRenderCallback3);
    }

    public static void enableExternalRender(boolean z, VideoExternalRenderType videoExternalRenderType) {
        ZegoExternalVideoRenderJNI.enableExternalRender(z, videoExternalRenderType.value());
    }

    public static boolean enableVideoPreview(boolean z, int i) {
        return ZegoExternalVideoRenderJNI.enableVideoPreview(z, i);
    }

    public static boolean enableVideoRender(boolean z, String str) {
        return ZegoExternalVideoRenderJNI.enableVideoRender(z, str);
    }
}
