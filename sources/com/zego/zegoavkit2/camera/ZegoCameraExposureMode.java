package com.zego.zegoavkit2.camera;

public enum ZegoCameraExposureMode {
    AUTO(0),
    CUSTOM(1);
    
    private int mCode;

    public final int getCode() {
        return this.mCode;
    }

    private ZegoCameraExposureMode(int i) {
        this.mCode = i;
    }
}
