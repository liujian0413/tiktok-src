package com.zego.zegoliveroom.callback;

import java.nio.ByteBuffer;

public interface IZegoAudioPrepCallback {
    void onAudioPrep(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2);
}
