package com.zego.zegoavkit2.mixstream;

import java.nio.ByteBuffer;

public final class ZegoCompleteMixStreamInfo {
    public int channels = 1;
    public int extra;
    public ZegoMixStreamInfo[] inputStreamList;
    public int lenOfUserData;
    public int outputAudioBitrate;
    public int outputAudioConfig;
    public int outputBackgroundColor;
    public String outputBackgroundImage;
    public int outputBitrate;
    public int outputFps;
    public int outputHeight;
    public boolean outputIsUrl;
    public String outputStreamId;
    public int outputWidth;
    public ByteBuffer userData;
    public boolean withSoundLevel;
}
