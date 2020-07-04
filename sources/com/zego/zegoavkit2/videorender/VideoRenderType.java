package com.zego.zegoavkit2.videorender;

public enum VideoRenderType {
    VIDEO_RENDER_TYPE_NONE(0),
    VIDEO_RENDER_TYPE_RGB(1),
    VIDEO_RENDER_TYPE_YUV(2),
    VIDEO_RENDER_TYPE_ANY(3),
    VIDEO_RENDER_TYPE_EXTERNAL_INTERNAL_RGB(4),
    VIDEO_RENDER_TYPE_EXTERNAL_INTERNAL_YUV(5);
    
    private int mType;

    public final int value() {
        return this.mType;
    }

    public static VideoRenderType valueOf(int i) {
        switch (i) {
            case 0:
                return VIDEO_RENDER_TYPE_NONE;
            case 1:
                return VIDEO_RENDER_TYPE_RGB;
            case 2:
                return VIDEO_RENDER_TYPE_YUV;
            case 3:
                return VIDEO_RENDER_TYPE_ANY;
            case 4:
                return VIDEO_RENDER_TYPE_EXTERNAL_INTERNAL_RGB;
            case 5:
                return VIDEO_RENDER_TYPE_EXTERNAL_INTERNAL_YUV;
            default:
                return VIDEO_RENDER_TYPE_NONE;
        }
    }

    private VideoRenderType(int i) {
        this.mType = i;
    }
}
