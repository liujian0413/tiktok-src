package com.zego.zegoavkit2.mediaside;

import java.nio.ByteBuffer;

final class ZegoMediaSideInfoJNI {
    private static volatile IZegoMediaSideCallback sCallback;

    ZegoMediaSideInfoJNI() {
    }

    static native void sendMediaSideInfo(ByteBuffer byteBuffer, int i, boolean z, int i2);

    private static native void setMediaSideCallback(boolean z);

    static native void setMediaSideFlags(boolean z, boolean z2, int i, int i2, int i3);

    static void setCallback(IZegoMediaSideCallback iZegoMediaSideCallback) {
        sCallback = iZegoMediaSideCallback;
        if (iZegoMediaSideCallback != null) {
            setMediaSideCallback(true);
        } else {
            setMediaSideCallback(false);
        }
    }

    public static void onMediaSideCallback(String str, ByteBuffer byteBuffer, int i) {
        IZegoMediaSideCallback iZegoMediaSideCallback = sCallback;
        if (iZegoMediaSideCallback != null) {
            iZegoMediaSideCallback.onRecvMediaSideInfo(str, byteBuffer, i);
        }
    }
}
