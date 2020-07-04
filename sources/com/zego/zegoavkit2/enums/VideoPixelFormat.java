package com.zego.zegoavkit2.enums;

public enum VideoPixelFormat {
    PIXEL_FORMAT_UNKNOWN(0),
    PIXEL_FORMAT_I420(1),
    PIXEL_FORMAT_NV12(2),
    PIXEL_FORMAT_NV21(3),
    PIXEL_FORMAT_BGRA32(4),
    PIXEL_FORMAT_RGBA32(5),
    PIXEL_FORMAT_ARGB32(6),
    PIXEL_FORMAT_ABGR32(7),
    PIXEL_FORMAT_I422(8),
    PIXEL_FORMAT_AVC_AVCC(9),
    PIXEL_FORMAT_AVC_ANNEXB(10);
    
    private int mType;

    public final int value() {
        return this.mType;
    }

    public static VideoPixelFormat valueOf(int i) {
        switch (i) {
            case 0:
                return PIXEL_FORMAT_UNKNOWN;
            case 1:
                return PIXEL_FORMAT_I420;
            case 2:
                return PIXEL_FORMAT_NV12;
            case 3:
                return PIXEL_FORMAT_NV21;
            case 4:
                return PIXEL_FORMAT_BGRA32;
            case 5:
                return PIXEL_FORMAT_RGBA32;
            case 6:
                return PIXEL_FORMAT_ARGB32;
            case 7:
                return PIXEL_FORMAT_ABGR32;
            case 8:
                return PIXEL_FORMAT_I422;
            case 9:
                return PIXEL_FORMAT_AVC_AVCC;
            case 10:
                return PIXEL_FORMAT_AVC_ANNEXB;
            default:
                return null;
        }
    }

    private VideoPixelFormat(int i) {
        this.mType = i;
    }
}
