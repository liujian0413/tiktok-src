package com.facebook.yoga;

public enum YogaExperimentalFeature {
    WEB_FLEX_BASIS(0);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaExperimentalFeature fromInt(int i) {
        if (i == 0) {
            return WEB_FLEX_BASIS;
        }
        StringBuilder sb = new StringBuilder("Unknown enum value: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private YogaExperimentalFeature(int i) {
        this.mIntValue = i;
    }
}
