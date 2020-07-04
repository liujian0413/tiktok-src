package com.p280ss.android.ugc.aweme.shortvideo.util;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.y */
public final class C41577y {
    /* renamed from: a */
    public static boolean m132408a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(1.0f)) {
            if (!Float.isNaN(f) || !Float.isNaN(1.0f)) {
                return false;
            }
            return true;
        } else if (Math.abs(1.0f - f) < 1.0E-5f) {
            return true;
        } else {
            return false;
        }
    }
}
