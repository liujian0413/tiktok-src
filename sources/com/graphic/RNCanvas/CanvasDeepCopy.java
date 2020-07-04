package com.graphic.RNCanvas;

public class CanvasDeepCopy {
    public static float deepCopyFloat(float f) {
        return f;
    }

    public static int deepCopyInt(int i) {
        return i;
    }

    public static String deepCopyString(String str) {
        return new String(str);
    }

    public static float[] deepCopyFloatList(float[] fArr) {
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = deepCopyFloat(fArr[i]);
        }
        return fArr2;
    }

    public static int[] deepCopyIntList(int[] iArr) {
        if (iArr.length == 0) {
            return new int[0];
        }
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = deepCopyInt(iArr[i]);
        }
        return iArr2;
    }
}
