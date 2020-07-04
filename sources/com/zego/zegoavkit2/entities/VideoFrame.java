package com.zego.zegoavkit2.entities;

import java.nio.ByteBuffer;

public class VideoFrame {
    public ByteBuffer[] byteBuffers = new ByteBuffer[4];
    public int height;
    public int[] strides = new int[4];
    public int width;
}
