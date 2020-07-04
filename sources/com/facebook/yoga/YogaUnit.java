package com.facebook.yoga;

public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaUnit fromInt(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return POINT;
            case 2:
                return PERCENT;
            case 3:
                return AUTO;
            default:
                StringBuilder sb = new StringBuilder("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private YogaUnit(int i) {
        this.mIntValue = i;
    }
}
