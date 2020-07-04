package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.j */
public final class C13815j {

    /* renamed from: a */
    private static final SparseIntArray f36665a = new SparseIntArray(0);

    /* renamed from: a */
    public static C13803ad m40784a() {
        return new C13803ad(0, m40785b(), f36665a);
    }

    /* renamed from: b */
    private static int m40785b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
