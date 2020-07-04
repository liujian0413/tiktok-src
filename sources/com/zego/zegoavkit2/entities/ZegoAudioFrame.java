package com.zego.zegoavkit2.entities;

import java.nio.ByteBuffer;

public class ZegoAudioFrame {
    public int bufLen;
    public ByteBuffer buffer;
    public int bytesPerSample;
    public int channels;
    public int configLen;
    public int frameType;
    public int sampleRate;
    public int samples;
    public double timeStamp;

    public static final class FrameType {
    }
}
