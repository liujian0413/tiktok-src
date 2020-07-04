package com.facebook.yoga;

public enum YogaDimension {
    WIDTH(0),
    HEIGHT(1);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaDimension fromInt(int i) {
        switch (i) {
            case 0:
                return WIDTH;
            case 1:
                return HEIGHT;
            default:
                StringBuilder sb = new StringBuilder("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private YogaDimension(int i) {
        this.mIntValue = i;
    }
}
