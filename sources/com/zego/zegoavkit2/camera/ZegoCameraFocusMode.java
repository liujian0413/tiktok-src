package com.zego.zegoavkit2.camera;

public enum ZegoCameraFocusMode {
    AUTO(0),
    INFINITY(1),
    MACRO(2),
    FIXED(3),
    EDOF(4),
    CONTINUOUS_VIDEO(5);
    
    private int mCode;

    public final int getCode() {
        return this.mCode;
    }

    private ZegoCameraFocusMode(int i) {
        this.mCode = i;
    }
}
