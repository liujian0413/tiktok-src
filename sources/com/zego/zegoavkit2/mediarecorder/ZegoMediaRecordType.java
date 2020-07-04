package com.zego.zegoavkit2.mediarecorder;

public enum ZegoMediaRecordType {
    NONE(0),
    AUDIO(1),
    VIDEO(2),
    BOTH(3);
    
    private int mType;

    public final int value() {
        return this.mType;
    }

    private ZegoMediaRecordType(int i) {
        this.mType = i;
    }
}
