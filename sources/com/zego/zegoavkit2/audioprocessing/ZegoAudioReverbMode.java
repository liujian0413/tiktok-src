package com.zego.zegoavkit2.audioprocessing;

public enum ZegoAudioReverbMode {
    SOFT_ROOM(0),
    WARM_CLUB(1),
    CONCERT_HALL(2),
    LARGE_AUDITORIUM(3);
    
    private int mCode;

    public final int getCode() {
        return this.mCode;
    }

    private ZegoAudioReverbMode(int i) {
        this.mCode = i;
    }
}
