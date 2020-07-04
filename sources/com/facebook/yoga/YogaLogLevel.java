package com.facebook.yoga;

public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaLogLevel fromInt(int i) {
        switch (i) {
            case 0:
                return ERROR;
            case 1:
                return WARN;
            case 2:
                return INFO;
            case 3:
                return DEBUG;
            case 4:
                return VERBOSE;
            case 5:
                return FATAL;
            default:
                StringBuilder sb = new StringBuilder("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private YogaLogLevel(int i) {
        this.mIntValue = i;
    }
}
