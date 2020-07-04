package com.p280ss.android.ugc.asve.constant;

/* renamed from: com.ss.android.ugc.asve.constant.AS_CAMERA_OPTION_FLAG */
public enum AS_CAMERA_OPTION_FLAG {
    AS_OPTION_FLAG_PICTURE_SIZE(1),
    AS_OPTION_FLAG_FPS_RANGE(2),
    AS_OPTION_FLAG_MTK_3DNR(4),
    AS_OPTION_FLAG_FIRST_FRAME_NOT_INVERTED(8);
    
    private final byte option;

    public final byte getOption() {
        return this.option;
    }

    private AS_CAMERA_OPTION_FLAG(byte b) {
        this.option = b;
    }
}
