package com.zego.zegoliveroom.callback;

import java.nio.ByteBuffer;

public interface IZegoExternalRenderCallback {
    int dequeueInputBuffer(int i, int i2, int i3);

    ByteBuffer getInputBuffer(int i);

    void queueInputBuffer(int i, String str, int i2, int i3, int i4);
}
