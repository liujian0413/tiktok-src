package com.facebook.yoga;

public enum YogaDisplay {
    FLEX(0),
    NONE(1);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaDisplay fromInt(int i) {
        switch (i) {
            case 0:
                return FLEX;
            case 1:
                return NONE;
            default:
                StringBuilder sb = new StringBuilder("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private YogaDisplay(int i) {
        this.mIntValue = i;
    }
}
