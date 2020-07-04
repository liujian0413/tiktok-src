package com.p280ss.avframework.livestreamv2.effectcamera.utils;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.utils.TextureRotationUtil */
public class TextureRotationUtil {
    public static final float[] CUBE = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] TEXTURE_NO_ROTATION = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] TEXTURE_ROTATED_180 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    public static final float[] TEXTURE_ROTATED_270 = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] TEXTURE_ROTATED_90 = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    private TextureRotationUtil() {
    }

    private static float flip(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }

    public static float[] getRotation(int i, boolean z, boolean z2) {
        float[] fArr;
        if (i == 90) {
            fArr = TEXTURE_ROTATED_90;
        } else if (i == 180) {
            fArr = TEXTURE_ROTATED_180;
        } else if (i != 270) {
            fArr = TEXTURE_NO_ROTATION;
        } else {
            fArr = TEXTURE_ROTATED_270;
        }
        if (z) {
            fArr = new float[]{flip(fArr[0]), fArr[1], flip(fArr[2]), fArr[3], flip(fArr[4]), fArr[5], flip(fArr[6]), fArr[7]};
        }
        if (!z2) {
            return fArr;
        }
        return new float[]{fArr[0], flip(fArr[1]), fArr[2], flip(fArr[3]), fArr[4], flip(fArr[5]), fArr[6], flip(fArr[7])};
    }
}
