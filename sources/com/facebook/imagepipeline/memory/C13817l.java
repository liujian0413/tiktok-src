package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.l */
public final class C13817l {

    /* renamed from: a */
    public static final int f36666a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static C13803ad m40788a() {
        C13803ad adVar = new C13803ad(4194304, f36666a * 4194304, m40787a(131072, 4194304, f36666a), 131072, 4194304, f36666a);
        return adVar;
    }

    /* renamed from: a */
    private static SparseIntArray m40787a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i4 = 131072; i4 <= 4194304; i4 *= 2) {
            sparseIntArray.put(i4, i3);
        }
        return sparseIntArray;
    }
}
