package com.facebook.react.uimanager.layoutanimation;

enum AnimatedPropertyType {
    OPACITY("opacity"),
    SCALE_XY("scaleXY");
    
    private final String mName;

    public final String toString() {
        return this.mName;
    }

    public static AnimatedPropertyType fromString(String str) {
        AnimatedPropertyType[] values;
        for (AnimatedPropertyType animatedPropertyType : values()) {
            if (animatedPropertyType.toString().equalsIgnoreCase(str)) {
                return animatedPropertyType;
            }
        }
        StringBuilder sb = new StringBuilder("Unsupported animated property : ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    private AnimatedPropertyType(String str) {
        this.mName = str;
    }
}
