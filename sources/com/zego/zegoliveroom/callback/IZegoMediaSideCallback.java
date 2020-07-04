package com.zego.zegoliveroom.callback;

import java.nio.ByteBuffer;

public interface IZegoMediaSideCallback {
    void onRecvMediaSideInfo(String str, ByteBuffer byteBuffer, int i);
}
