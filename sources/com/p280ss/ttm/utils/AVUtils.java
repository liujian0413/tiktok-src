package com.p280ss.ttm.utils;

/* renamed from: com.ss.ttm.utils.AVUtils */
public class AVUtils {

    /* renamed from: com.ss.ttm.utils.AVUtils$ScaleInfo */
    public static class ScaleInfo {

        /* renamed from: h */
        public int f117546h;

        /* renamed from: w */
        public int f117547w;

        /* renamed from: x */
        public int f117548x;

        /* renamed from: y */
        public int f117549y;
    }

    public static final ScaleInfo getScaleInfoFromSize(float f, float f2, float f3, float f4) {
        ScaleInfo scaleInfo = new ScaleInfo();
        float f5 = f / f2;
        scaleInfo.f117547w = (int) f3;
        scaleInfo.f117546h = (int) (f3 / f5);
        if (((float) scaleInfo.f117546h) < f4) {
            scaleInfo.f117546h = (int) f4;
            scaleInfo.f117547w = (int) (f5 * f4);
        }
        scaleInfo.f117549y = ((int) (((float) scaleInfo.f117546h) - f4)) >> 1;
        scaleInfo.f117548x = ((int) (((float) scaleInfo.f117547w) - f3)) >> 1;
        if (((float) scaleInfo.f117546h) > f4) {
            scaleInfo.f117549y = 0 - scaleInfo.f117549y;
        }
        if (((float) scaleInfo.f117547w) > f3) {
            scaleInfo.f117548x = 0 - scaleInfo.f117548x;
        }
        return scaleInfo;
    }
}
