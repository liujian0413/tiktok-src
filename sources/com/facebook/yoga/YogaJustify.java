package com.facebook.yoga;

public enum YogaJustify {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaJustify fromInt(int i) {
        switch (i) {
            case 0:
                return FLEX_START;
            case 1:
                return CENTER;
            case 2:
                return FLEX_END;
            case 3:
                return SPACE_BETWEEN;
            case 4:
                return SPACE_AROUND;
            case 5:
                return SPACE_EVENLY;
            default:
                StringBuilder sb = new StringBuilder("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private YogaJustify(int i) {
        this.mIntValue = i;
    }
}
