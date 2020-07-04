package com.zego.zegoavkit2.enums;

public enum VideoCodecType {
    CODEC_TYPE_AVC_AVCC(0),
    CODEC_TYPE_AVC_ANNEXB(1);
    
    private int mValue;

    public final int value() {
        return this.mValue;
    }

    public static VideoCodecType valueOf(int i) {
        switch (i) {
            case 0:
                return CODEC_TYPE_AVC_AVCC;
            case 1:
                return CODEC_TYPE_AVC_ANNEXB;
            default:
                return null;
        }
    }

    private VideoCodecType(int i) {
        this.mValue = i;
    }
}
