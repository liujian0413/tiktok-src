package com.p280ss.android.sdk;

/* renamed from: com.ss.android.sdk.ItemType */
public enum ItemType {
    IMAGE(1),
    VIDEO(2),
    ESSAY(3),
    ARTICLE(4),
    ACTIVITY(5);
    
    final int nativeInt;

    public final int getValue() {
        return this.nativeInt;
    }

    public static ItemType fromValue(int i) {
        switch (i) {
            case 1:
                return IMAGE;
            case 2:
                return VIDEO;
            case 3:
                return ESSAY;
            case 4:
                return ARTICLE;
            case 5:
                return ACTIVITY;
            default:
                return null;
        }
    }

    private ItemType(int i) {
        this.nativeInt = i;
    }
}
