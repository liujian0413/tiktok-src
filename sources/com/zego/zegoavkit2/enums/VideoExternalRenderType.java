package com.zego.zegoavkit2.enums;

public enum VideoExternalRenderType {
    DECODE_RGB_SERIES(0),
    DECODE(1),
    NOT_DECODE(2),
    DECODE_RENDER(3),
    DECODE_YUV_SERIES(4);
    
    private int mType;

    public final int value() {
        return this.mType;
    }

    private VideoExternalRenderType(int i) {
        this.mType = i;
    }
}
