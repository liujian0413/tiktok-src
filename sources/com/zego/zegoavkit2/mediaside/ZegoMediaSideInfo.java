package com.zego.zegoavkit2.mediaside;

import java.nio.ByteBuffer;

public class ZegoMediaSideInfo {
    public volatile IZegoMediaSideCallback mZegoMediaSideCallback;

    public void setZegoMediaSideCallback(IZegoMediaSideCallback iZegoMediaSideCallback) {
        this.mZegoMediaSideCallback = iZegoMediaSideCallback;
        if (iZegoMediaSideCallback != null) {
            ZegoMediaSideInfoJNI.setCallback(new IZegoMediaSideCallback() {
                public void onRecvMediaSideInfo(String str, ByteBuffer byteBuffer, int i) {
                    IZegoMediaSideCallback iZegoMediaSideCallback = ZegoMediaSideInfo.this.mZegoMediaSideCallback;
                    if (iZegoMediaSideCallback != null) {
                        iZegoMediaSideCallback.onRecvMediaSideInfo(str, byteBuffer, i);
                    }
                }
            });
        } else {
            ZegoMediaSideInfoJNI.setCallback(null);
        }
    }

    public void setMediaSideFlags(boolean z, boolean z2, int i) {
        ZegoMediaSideInfoJNI.setMediaSideFlags(z, z2, 0, 0, i);
    }

    public void sendMediaSideInfo(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        ZegoMediaSideInfoJNI.sendMediaSideInfo(byteBuffer, i, z, i2);
    }

    public void setMediaSideFlags(boolean z, boolean z2, int i, int i2, int i3) {
        ZegoMediaSideInfoJNI.setMediaSideFlags(z, z2, i, i2, i3);
    }
}
