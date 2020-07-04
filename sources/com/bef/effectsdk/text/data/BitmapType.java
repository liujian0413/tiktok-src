package com.bef.effectsdk.text.data;

public enum BitmapType {
    TEXT_BITMAP_NONE(-1),
    TEXT_BITMAP_TYPE_ALPHA(0),
    TEXT_BITMAP_TYPE_RGBA8888(1),
    TEXT_BITMAP_NEON_ALPHA(2),
    TEXT_BITMAP_SINGLE_CHAR_ALPHA(3),
    TEXT_BITMAP_SHAKE_ALPHA(4);
    
    public int value;

    public static BitmapType valueOf(int i) {
        BitmapType[] values;
        for (BitmapType bitmapType : values()) {
            if (bitmapType.value == i) {
                return bitmapType;
            }
        }
        return TEXT_BITMAP_NONE;
    }

    private BitmapType(int i) {
        this.value = i;
    }
}
