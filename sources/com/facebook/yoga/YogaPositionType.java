package com.facebook.yoga;

public enum YogaPositionType {
    RELATIVE(0),
    ABSOLUTE(1);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaPositionType fromInt(int i) {
        switch (i) {
            case 0:
                return RELATIVE;
            case 1:
                return ABSOLUTE;
            default:
                StringBuilder sb = new StringBuilder("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private YogaPositionType(int i) {
        this.mIntValue = i;
    }
}
