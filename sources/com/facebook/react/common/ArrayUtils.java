package com.facebook.react.common;

import java.util.Arrays;

public class ArrayUtils {
    public static float[] copyArray(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return Arrays.copyOf(fArr, fArr.length);
    }
}
