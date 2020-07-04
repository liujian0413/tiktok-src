package com.zego.zegoavkit2.mediarecorder;

public enum ZegoMediaRecordFormat {
    FLV(1),
    MP4(2);
    
    private int mType;

    public final int value() {
        return this.mType;
    }

    private ZegoMediaRecordFormat(int i) {
        this.mType = i;
    }
}
