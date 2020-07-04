package com.zego.zegoavkit2.entities;

import com.zego.zegoavkit2.enums.VideoCodecType;
import java.nio.ByteBuffer;

public class EncodedVideoFrame {
    public VideoCodecType codecType;
    public ByteBuffer data;
    public boolean isKeyFrame;
    public double reference_time_ms;
}
