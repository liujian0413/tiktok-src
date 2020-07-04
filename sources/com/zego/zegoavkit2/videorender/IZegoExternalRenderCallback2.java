package com.zego.zegoavkit2.videorender;

import com.zego.zegoavkit2.entities.VideoFrame;
import com.zego.zegoavkit2.enums.VideoPixelFormat;

public interface IZegoExternalRenderCallback2 {
    int dequeueInputBuffer(int i, int i2, int[] iArr, int[] iArr2);

    VideoFrame getInputBuffer(int i);

    void queueInputBuffer(int i, String str, VideoPixelFormat videoPixelFormat);

    void setFlipMode(String str, int i);
}
