package com.zego.zegoavkit2.mediaside;

import java.nio.ByteBuffer;

public interface IZegoMediaSideCallback {
    void onRecvMediaSideInfo(String str, ByteBuffer byteBuffer, int i);
}
