package com.zego.zegoavkit2.videorender;

import com.zego.zegoavkit2.entities.VideoFrame;
import com.zego.zegoavkit2.enums.VideoPixelFormat;

public interface IZegoExternalRenderCallback3 {
    int dequeueInputBuffer(int i, int i2, int[] iArr, int[] iArr2, String str);

    VideoFrame getInputBuffer(int i, String str);

    void queueInputBuffer(int i, String str, VideoPixelFormat videoPixelFormat);

    void setFlipMode(String str, int i);
}
