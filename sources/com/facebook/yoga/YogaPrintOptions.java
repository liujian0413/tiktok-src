package com.facebook.yoga;

public enum YogaPrintOptions {
    LAYOUT(1),
    STYLE(2),
    CHILDREN(4);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaPrintOptions fromInt(int i) {
        if (i == 4) {
            return CHILDREN;
        }
        switch (i) {
            case 1:
                return LAYOUT;
            case 2:
                return STYLE;
            default:
                StringBuilder sb = new StringBuilder("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private YogaPrintOptions(int i) {
        this.mIntValue = i;
    }
}
