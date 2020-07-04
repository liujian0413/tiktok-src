package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.ROTATE_DEGREE */
public enum ROTATE_DEGREE {
    ROTATE_NONE,
    ROTATE_90,
    ROTATE_180,
    ROTATE_270;

    public static int[] toIntArray(ROTATE_DEGREE[] rotate_degreeArr) {
        if (rotate_degreeArr == null) {
            return null;
        }
        int length = rotate_degreeArr.length;
        int[] iArr = new int[rotate_degreeArr.length];
        for (int i = 0; i < length; i++) {
            iArr[i] = rotate_degreeArr[i].ordinal();
        }
        return iArr;
    }
}
