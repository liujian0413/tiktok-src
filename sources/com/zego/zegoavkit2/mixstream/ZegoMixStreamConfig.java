package com.zego.zegoavkit2.mixstream;

import java.nio.ByteBuffer;

public final class ZegoMixStreamConfig {
    public String advancedConfig;
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
    public ZegoMixStreamOutput[] outputList;
    public int outputQuality = 23;
    public int outputRateControlMode;
    public int outputWidth;
    public boolean singleStreamPassThrough;
    public ByteBuffer userData;
    public ZegoMixStreamWatermark watermark;
    public boolean withSoundLevel;

    public class RateControlMode {
        public RateControlMode() {
        }
    }
}
