package com.zego.zegoavkit2.videorender;

import com.zego.zegoavkit2.entities.VideoFrame;
import com.zego.zegoavkit2.enums.VideoPixelFormat;

public interface IZegoVideoRenderCallback {
    void onVideoRenderCallback(VideoFrame videoFrame, VideoPixelFormat videoPixelFormat, String str);

    void setFlipMode(String str, int i);
}
