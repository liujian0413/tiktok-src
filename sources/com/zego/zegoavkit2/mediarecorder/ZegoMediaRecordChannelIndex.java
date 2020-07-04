package com.zego.zegoavkit2.mediarecorder;

public enum ZegoMediaRecordChannelIndex {
    MAIN(0),
    AUX(1);
    
    private int mType;

    public final int value() {
        return this.mType;
    }

    private ZegoMediaRecordChannelIndex(int i) {
        this.mType = i;
    }
}
