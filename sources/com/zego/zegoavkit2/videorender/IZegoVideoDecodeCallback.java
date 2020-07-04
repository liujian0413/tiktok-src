package com.zego.zegoavkit2.videorender;

import com.zego.zegoavkit2.entities.EncodedVideoFrame;

public interface IZegoVideoDecodeCallback {
    void onVideoDecodeCallback(EncodedVideoFrame encodedVideoFrame, String str);
}
