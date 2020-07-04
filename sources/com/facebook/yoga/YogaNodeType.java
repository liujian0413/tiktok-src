package com.facebook.yoga;

public enum YogaNodeType {
    DEFAULT(0),
    TEXT(1);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaNodeType fromInt(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return TEXT;
            default:
                StringBuilder sb = new StringBuilder("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private YogaNodeType(int i) {
        this.mIntValue = i;
    }
}
