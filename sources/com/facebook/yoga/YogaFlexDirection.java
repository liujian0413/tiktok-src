package com.facebook.yoga;

public enum YogaFlexDirection {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaFlexDirection fromInt(int i) {
        switch (i) {
            case 0:
                return COLUMN;
            case 1:
                return COLUMN_REVERSE;
            case 2:
                return ROW;
            case 3:
                return ROW_REVERSE;
            default:
                StringBuilder sb = new StringBuilder("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private YogaFlexDirection(int i) {
        this.mIntValue = i;
    }
}
