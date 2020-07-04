package com.kakao.util;

public enum OptionalBoolean {
    TRUE(Boolean.valueOf(true)),
    FALSE(Boolean.valueOf(false)),
    NONE(null);
    
    final Boolean bool;

    public final Boolean getBoolean() {
        return this.bool;
    }

    public static OptionalBoolean getOptionalBoolean(Boolean bool2) {
        if (bool2 == null) {
            return NONE;
        }
        if (bool2.booleanValue()) {
            return TRUE;
        }
        return FALSE;
    }

    private OptionalBoolean(Boolean bool2) {
        this.bool = bool2;
    }
}
